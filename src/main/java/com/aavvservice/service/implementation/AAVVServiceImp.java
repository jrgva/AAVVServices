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
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Component("AAVVService")
@Transactional
public class AAVVServiceImp implements AAVVService {

    private final Logger logger = LoggerFactory.getLogger(AAVVServiceImp.class);
    private AAVVTramitesRepository aavvTramites_repository;
    private MongoOperations mongoOperations;

    @Autowired
    public AAVVServiceImp(AAVVTramitesRepository aavvTramites_repositorytory, MongoOperations mongoOperations) {
        this.aavvTramites_repository = aavvTramites_repositorytory;
        this.mongoOperations = mongoOperations;
    }

    private String getCustomId() {
        Instant instant = Instant.now();
        return DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").withZone(ZoneId.from(ZoneOffset.UTC)).format(instant);
    }

    @Override
    public Tramite createTramiteReclamacion(AbrirRK abrirRK) {
        Instant instant = Instant.now();
        Tramite tramite = new Tramite();
        tramite.setId(getCustomId());
        tramite.setFechaCreacion(instant.toString());
        tramite.setDocumento(abrirRK.getDocumento());
        tramite.setTipoDocumento(abrirRK.getTipoDocumento());
        tramite.setProcesado(false);
        tramite.setTipoTramite("Reclamacion");
        tramite.setDatosTramite(abrirRK);
        mongoOperations.insert(tramite, "Tramites");
        return tramite;
    }

    @Override
    public Tramite createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO) {
        Instant instant = Instant.now();
        Tramite tramite = new Tramite();
        tramite.setId(getCustomId());
        tramite.setFechaCreacion(instant.toString());
        tramite.setDocumento(realizarActuacionEyPO.getDocumento());
        tramite.setTipoDocumento(realizarActuacionEyPO.getTipoDocumento());
        tramite.setProcesado(false);
        tramite.setTipoTramite("ActuacionEyPO");
        tramite.setDatosTramite(realizarActuacionEyPO);
        mongoOperations.insert(tramite, "Tramites");
        return tramite;
    }

    @Override
    public Tramite obtenerTramiteARealizar() {
        if (aavvTramites_repository.existsByProcesadoIsFalse()) {
            Tramite tramite = aavvTramites_repository.findFirstByProcesadoIsFalse();
            Query query = new Query(Criteria.where("id").is(tramite.getId()));
            Update update = new Update();
            update.set("procesado", true);
            mongoOperations.updateFirst(query, update, Tramite.class);
            return tramite;
        } else {
            return null;
        }
    }

    @Override
    public Tramite obtenerTramite(String Id) {
        return aavvTramites_repository.findOneById(Id);
    }

    @Override
    public Tramite createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tramite) {
        return null;
    }

}
