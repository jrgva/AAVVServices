package com.aavvservice.service;

import com.aavvservice.model.*;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {

    public String createTramiteReclamacion(AbrirRK abrirRK);

    public String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    public Object obtenerTramiteARealizar();

    public Object obtenerTramite(String Id);

    String createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tipoTramite);

}
