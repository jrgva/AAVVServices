package com.aavvservice.controller;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.RealizarActuacionEyPO;
import com.aavvservice.model.TramitesReclamaciones;
import com.aavvservice.repository.AbrirReclamacionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbrirReclamacionController {
    private final Logger logger =
            LoggerFactory.getLogger(AbrirReclamacionController.class);
    @Autowired
    private AbrirReclamacionRepository reclamacionRepository;

    // Operaciones AAVV
    //@ApiOperation(value = "Crear una tarea de abrir una reclamacion en ARTE desde AAVV")
    @RequestMapping(value = "/abrirReclamacion", method = RequestMethod.POST)
    public String abrirReclamacion(@RequestBody AbrirRK abrirRK) {

        logger.info("Creando tarea para abrir una reclamacion: {}", abrirRK.toString());
        return reclamacionRepository.createTramiteReclamacion(abrirRK);
    }

    //@ApiOperation(value = "Crear una tarea de realizar una gestion de EyPO en ARTE desde AAVV")
    @RequestMapping(value = "/realizarGestionEyPO", method = RequestMethod.POST)
    public String realizarGestionEyPO(@RequestBody RealizarActuacionEyPO realizarActuacionEyPO) {

        logger.info("Creando tarea para realizar una actuacion de EyPO: {}", realizarActuacionEyPO.toString());
        return reclamacionRepository.createTramiteActuacionEyPO(realizarActuacionEyPO);
    }

    //@ApiOperation(value = "Obtener todas los tramites a realizar en ARTE")
    @RequestMapping(value = "/obtenerTramitesReclamaciones", method = RequestMethod.GET)
    public List<TramitesReclamaciones> obtenerTramitesReclamaciones() {

        logger.info("Obtener todos los tramites a realizar");
        return reclamacionRepository.findAll();
    }
}
