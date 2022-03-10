package com.aavvservice.controller;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbrirReclamacionController {
    private final Logger logger =
            LoggerFactory.getLogger(AbrirReclamacionController.class);
    @Autowired
    private AAVVService aavvService;

    // Operaciones AAVV
    //@ApiOperation(value = "Crear una tarea de abrir una reclamacion en ARTE desde AAVV")
    @RequestMapping(value = "/abrirReclamacion", method = RequestMethod.POST)
    public String abrirReclamacion(@RequestBody AbrirRK abrirRK) {

        logger.info("Creando tarea para abrir una reclamacion: {}", abrirRK.toString());
        return aavvService.createTramiteReclamacion(abrirRK);
    }

    //@ApiOperation(value = "Crear una tarea de realizar una gestion de EyPO en ARTE desde AAVV")
    @RequestMapping(value = "/realizarGestionEyPO", method = RequestMethod.POST)
    public String realizarGestionEyPO(@RequestBody RealizarActuacionEyPO realizarActuacionEyPO) {

        logger.info("Creando tarea para realizar una actuacion de EyPO: {}", realizarActuacionEyPO.toString());
        return aavvService.createTramiteActuacionEyPO(realizarActuacionEyPO);
    }

    //@ApiOperation(value = "Obtener un tramite a realizar en ARTE")
    @RequestMapping(value = "/obtenerTramiteReclamaciones", method = RequestMethod.GET)
    public String obtenerTramiteReclamaciones() {

        logger.info("Obtener todos los tramites a realizar");
        return aavvService.obtenerTramiteReclamaciones();
    }
}
