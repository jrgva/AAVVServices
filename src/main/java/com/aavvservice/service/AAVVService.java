package com.aavvservice.service;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.AplazarFraccionarFacturas;
import com.aavvservice.model.ConsultaSincrona;
import com.aavvservice.model.RealizarActuacionEyPO;
import org.springframework.stereotype.Service;

@Service("AAVVService")
public interface AAVVService {

    public String createTramiteReclamacion(AbrirRK abrirRK);

    public String createTramiteActuacionEyPO(RealizarActuacionEyPO realizarActuacionEyPO);

    public Object obtenerTramiteARealizar();

    public Object obtenerTramite(String Id);

    String createTramiteAplazarFraccionarFacturas(AplazarFraccionarFacturas aplazarFraccionarFacturas, String tipoTramite);

    public Object obtenerConsultaSincrona(String collection, String Id);

    public String crearConsulta(ConsultaSincrona consulta);

    public String actualizarConsulta(ConsultaSincrona consulta);

}
