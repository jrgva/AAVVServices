package com.aavvservice.service;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.AplazarFraccionarFacturas;
import com.aavvservice.model.Consulta;
import com.aavvservice.model.RealizarActuacionEyPO;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {

    String createTramiteReclamacion(AbrirRK abrirRK);

    String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    Object obtenerTramiteARealizar();

    Object obtenerTramite(String Id);

    String createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tipoTramite);

    Object obtenerResultadoConsulta(String collection, String Id);

    String insertarResultadoConsulta(Consulta consulta);

}
