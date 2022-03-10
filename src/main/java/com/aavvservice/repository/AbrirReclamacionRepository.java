package com.aavvservice.repository;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import com.aavvservice.model.TramitesReclamaciones;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbrirReclamacionRepository extends MongoRepository<TramitesReclamaciones, String> {

    String createTramiteReclamacion(AbrirRK abrirRK);

    String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);
}
