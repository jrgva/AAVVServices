package com.aavvservice.service;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.AplazarFraccionarFacturas;
import com.aavvservice.model.Consulta;
import com.aavvservice.model.RealizarActuacionEyPO;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {

    public String createTramiteReclamacion(AbrirRK abrirRK);

    public String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    public Object obtenerTramiteARealizar();

    public Object obtenerTramite(String Id);

    String createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tipoTramite);

    public Object obtenerResultadoConsulta(String collection, String Id);

    public Object crearResultadoConsulta(Consulta consulta);

    public String actualizarResultadoConsulta(Consulta consulta);

}
