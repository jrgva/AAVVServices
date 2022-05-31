package com.aavvservice.service.implementation;

import com.aavvservice.model.*;
import com.aavvservice.repository.AAVVTramitesRepository;
import com.aavvservice.service.AAVVService;
import com.mongodb.client.result.UpdateResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.Result;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;


@Component("AAVVService")
@Transactional
public class AAVVServiceImpl implements AAVVService {

    private static final Query findFirstOne = new Query().limit(1);
    private final Logger logger = LoggerFactory.getLogger(AAVVServiceImpl.class);
    private AAVVTramitesRepository aavvTramites_repository;
    private MongoOperations mongoOperations;
    private HashMap<String, String> tramitePagename = new HashMap<>();

    @Autowired
    public AAVVServiceImpl(AAVVTramitesRepository aavvTramites_repositorytory, MongoOperations mongoOperations) {
        this.aavvTramites_repository = aavvTramites_repositorytory;
        this.mongoOperations = mongoOperations;
        populateMap();
    }

    private void populateMap() {
        tramitePagename.put("Reclamacion", "101_AperturaReclamacion_AAVV");
        tramitePagename.put("ActuacionEyPO", "101_RealizarActuacionEyPO_AAVV");
        tramitePagename.put("Fraccionamiento", "104_Fraccionamiento_AAVV");
        tramitePagename.put("Aplazamiento", "104_Aplazamiento_AAVV");
    }

    private String getId() {
        Instant instant = Instant.now();
        String ts = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").withZone(ZoneId.from(ZoneOffset.UTC)).format(instant);
        String hostName;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            hostName = "GenericHostName";
        }
        return ts + "_" + hostName;
    }

    private String getTs() {
        Instant instant = Instant.now();
        return instant.toString();
    }

    private String insertTramitePendiente(Object body, String tipoTramite, String tsAAVV) {
        Tramite tramite = new Tramite();
        tramite.setId(getId());
        tramite.setTsAAVV(tsAAVV);
        tramite.setTsInsertPending(getTs());
        tramite.setTipoTramite(tipoTramite);
        tramite.setPagename(tramitePagename.get(tipoTramite));
        tramite.setDatosTramite(body);
        try {
            mongoOperations.insert(tramite, "TramitesAAVV");
        }
        catch(Exception e){
            return "Ha ocurrido un error al insertar el tramite pendiente en Mongo";
        }
        return "El tramite se ha insertado correctamente";
    }

    @Override
    public String createTramiteReclamacion(AbrirRK abrirRK) {
        String result = insertTramitePendiente(abrirRK, "Reclamacion", abrirRK.getTsAAVV());
        return result;
    }

    @Override
    public String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO) {
        String result = insertTramitePendiente(realizarActuacionEyPO, "ActuacionEyPO", realizarActuacionEyPO.getTsAAVV());
        return result;
    }

    @Override
    public String createTramiteAplazarFacturas(AplazarFacturas aplazarFacturas) {
        String result = insertTramitePendiente(aplazarFacturas, "Aplazamiento", aplazarFacturas.getTsAAVV());
        return result;
    }

    @Override
    public String createTramiteFraccionarFacturas(FraccionarFacturas fraccionarFacturas) {
        String result = insertTramitePendiente(fraccionarFacturas, "Fraccionamiento", fraccionarFacturas.getTsAAVV());
        return result;
    }

    @Override
    public Object obtenerTramiteARealizar() {
        Tramite tramite = mongoOperations.findOne(findFirstOne, Tramite.class);
        if (tramite == null) {
            return "No hay tramites pendientes";
        }
        Query searchQuery = new Query(Criteria.where("id").is(tramite.getId()));
        try {
            mongoOperations.remove(searchQuery, Tramite.class, "TramitesAAVV");
        }
        catch(Exception e){
            return "Ha ocurrido un error al borrar el trámite pendiente";
        }
        tramite.setTsInsertCompleted(getTs());
        try {
            mongoOperations.insert(tramite, "TramitesAAVV_store");
        }
        catch(Exception e){
            return "Ha ocurrido un error al insertar el tramite completado en Mongo";
        }
        return tramite;
    }

    @Override
    public Object obtenerTramite(String Id) {
        Tramite tramite = aavvTramites_repository.findOneById(Id);
        if (tramite == null) {
            return "No se ha encontrado ningun tramite con ese id";
        }
        return tramite;
    }

    @Override
    public Object obtenerResultadoConsulta(String collection, String Id) {
        Query searchQuery = new Query(Criteria.where("_id").is(Id));
        Consulta consulta = mongoOperations.findOne(searchQuery, Consulta.class, collection);
        if (consulta == null) {
            return "No se ha encontrado ninguna consulta con ese id";
        }
        return consulta;
    }

    @Override
    public String insertarResultadoConsulta(Consulta consulta){
        Query searchQuery = new Query().addCriteria(Criteria.where("_id").is(consulta.getId()));
        Update update = new Update();
        update.setOnInsert("tsInsert", getTs());
        update.set("tsLastUpdate", getTs());
        update.set("collection", consulta.getCollection());
        update.addToSet("datos", consulta.getDatos());
        mongoOperations.upsert(searchQuery,update, consulta.getCollection());
        return "Los datos se han actualizado correctamente";
    }
}
