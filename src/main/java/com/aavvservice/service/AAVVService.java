package com.aavvservice.service;

import com.aavvservice.model.*;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {

    String createTramiteReclamacion(AbrirRK abrirRK);

    String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    String createTramiteAplazarFacturas(AplazarFacturas aplazarFacturas);

    String createTramiteFraccionarFacturas(FraccionarFacturas fraccionarFacturas);

    Object obtenerTramiteARealizar();

    Object obtenerTramite(String Id);

    Object obtenerResultadoConsulta(String collection, String Id);

    String insertarResultadoConsulta(Consulta consulta);

}
