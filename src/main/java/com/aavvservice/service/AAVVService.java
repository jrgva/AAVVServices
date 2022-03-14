package com.aavvservice.service;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {
    String createTramiteReclamacion(AbrirRK abrirRK);

    String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    String obtenerTramite();
}
