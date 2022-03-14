package com.aavvservice.controller;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import com.aavvservice.model.Tramite;
import com.aavvservice.service.AAVVService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AbrirReclamacionController {
    private final Logger logger =
            LoggerFactory.getLogger(AbrirReclamacionController.class);

    @Autowired
    private AAVVService aavvService;

    // Operaciones AAVV
    //@ApiOperation(value = "Crear una tarea de abrir una reclamacion en ARTE desde AAVV")
    @RequestMapping(value = "/abrirReclamacion", method = RequestMethod.POST)
    public String abrirReclamacion(@Valid @RequestBody AbrirRK abrirRK) {

        logger.info("Creando tarea para abrir una reclamacion: {}", abrirRK.toString());
        return aavvService.createTramiteReclamacion(abrirRK);
    }

    //@ApiOperation(value = "Crear una tarea de realizar una gestion de EyPO en ARTE desde AAVV")
    @RequestMapping(value = "/realizarActuacionEyPO", method = RequestMethod.POST)
    public String realizarGestionEyPO(@Valid @RequestBody RealizarActuacionEyPO realizarActuacionEyPO) {

        logger.info("Creando tarea para realizar una actuacion de EyPO: {}", realizarActuacionEyPO.toString());
        return aavvService.createTramiteActuacionEyPO(realizarActuacionEyPO);
    }

    //@ApiOperation(value = "Obtener un tramite a realizar en ARTE")
    @RequestMapping(value = "/obtenerTramite", method = RequestMethod.GET)
    public String obtenerTramiteReclamaciones() {

        logger.info("Obtener tramite a realizar en ARTE");
        return aavvService.obtenerTramite().toString();
    }
}
