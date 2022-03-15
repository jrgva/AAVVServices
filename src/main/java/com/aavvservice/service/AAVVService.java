package com.aavvservice.service;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import com.aavvservice.model.Tramite;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {
    public String createTramiteReclamacion(AbrirRK abrirRK);

    public String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    public String obtenerTramiteARealizar();

    public String obtenerTramite(String Id);
}
