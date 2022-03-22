package com.aavvservice.service.implementation;

import com.aavvservice.model.*;
import com.aavvservice.repository.AAVVTramitesRepository;
import com.aavvservice.service.AAVVService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;


@Component("AAVVService")
@Transactional
public class AAVVServiceImp implements AAVVService {

    private final Logger logger = LoggerFactory.getLogger(AAVVServiceImp.class);
    private static final Query findFirstOne = new Query().limit(1);
    private AAVVTramitesRepository aavvTramites_repository;
    private MongoOperations mongoOperations;
    private HashMap<String, String> tramitePagename = new HashMap<>();

    @Autowired
    public AAVVServiceImp(AAVVTramitesRepository aavvTramites_repositorytory, MongoOperations mongoOperations) {
        this.aavvTramites_repository = aavvTramites_repositorytory;
        this.mongoOperations = mongoOperations;
        populateMap();
    }

    private void populateMap()
    {
        tramitePagename.put("Reclamacion","101_Reclamacion_AAVV");
        tramitePagename.put("ActuacionEyPO","101_ActuacionEyPO_AAVV");
        tramitePagename.put("Fraccionamiento","104_Fraccionamiento_AAVV");
        tramitePagename.put("Aplazamiento","104_Aplazamiento_AAVV");
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

    private String getTs(){
        Instant instant = Instant.now();
        return instant.toString();
    }

    private Tramite insertTramitePendiente(Object body, String tipoTramite, String tsAAVV){
        Tramite tramite = new Tramite();
        tramite.setId(getId());
        tramite.setTsAAVV(tsAAVV);
        tramite.setTsInsertPending(getTs());
        tramite.setTipoTramite(tipoTramite);
        tramite.setPagename(tramitePagename.get(tipoTramite));
        tramite.setDatosTramite(body);
        // CONTROL DE EXCEPCIONES
        mongoOperations.insert(tramite, "TramitesPendientes");
        // DEVOLVER OK O KO EN FORMATO JSON
        return tramite;
    }

    @Override
    public Tramite createTramiteReclamacion(AbrirRK abrirRK) {
        Tramite tramite = insertTramitePendiente(abrirRK, "Reclamacion", abrirRK.getTsAAVV());
        return tramite;
    }

    @Override
    public Tramite createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO) {
        Tramite tramite = insertTramitePendiente(realizarActuacionEyPO, "ActuacionEyPO", realizarActuacionEyPO.getTsAAVV());
        return tramite;
    }

    @Override
    public Tramite createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tipoTramite) {
        Tramite tramite = insertTramitePendiente(aplazarFraccionarFacturas, tipoTramite, aplazarFraccionarFacturas.getTsAAVV());
        return tramite;
    }

    @Override
    public Tramite obtenerTramiteARealizar() {
        // CONTROL DE EXCEPCIONES
        Tramite tramite = mongoOperations.findOne(findFirstOne, Tramite.class);
        Query searchQuery = new Query(Criteria.where("id").is(tramite.getId()));
        mongoOperations.remove(searchQuery, Tramite.class, "TramitesPendientes");
        tramite.setTsInsertCompleted(getTs());
        mongoOperations.insert(tramite, "TramitesCompletados");
        // DEVOLVER QUE NO HAY NADA SI NO LO HAY
        return tramite;
    }

    @Override
    public Tramite obtenerTramite(String Id) {
        // DEVOLVER QUE NO HAY NADA SI NO LO HAY
        return aavvTramites_repository.findOneById(Id);
    }
}
