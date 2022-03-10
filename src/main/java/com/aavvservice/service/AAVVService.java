package com.aavvservice.service;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;

public interface AAVVService {
    String createTramiteReclamacion(AbrirRK abrirRK);

    String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    String obtenerTramiteReclamaciones();
}
