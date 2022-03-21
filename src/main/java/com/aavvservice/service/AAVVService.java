package com.aavvservice.service;

import com.aavvservice.model.*;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {
    public Tramite createTramiteReclamacion(AbrirRK abrirRK);

    public Tramite createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    public Tramite obtenerTramiteARealizar();

    public Tramite obtenerTramite(String Id);

    Tramite createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tramite);

    String obtenerHostname();
}
