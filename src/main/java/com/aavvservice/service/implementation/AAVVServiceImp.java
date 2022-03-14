package com.aavvservice.service.implementation;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import com.aavvservice.model.Tramite;
import com.aavvservice.repository.AAVVTramitesRepository;
import com.aavvservice.service.AAVVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.*;
import java.time.format.DateTimeFormatter;


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

    private String getCustomId(){
        Instant instant = Instant.now();
        String id = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").withZone(ZoneId.from(ZoneOffset.UTC)).format(instant);
        return id;
    }

    @Override
    public String createTramiteReclamacion(AbrirRK abrirRK) {
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
        return tramite.toString();
    }

    @Override
    public String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO) {
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
        return tramite.toString();
    }

    @Override
    public Tramite obtenerTramite() {
        return aavvTramites_repository.findOneByProcesadoIsFalse();
    }
}
