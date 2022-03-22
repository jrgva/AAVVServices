package com.aavvservice.controller;

import com.aavvservice.model.*;
import com.aavvservice.service.AAVVService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
@RequestMapping("aavv")
public class AAVVController {
    private final Logger logger =
            LoggerFactory.getLogger(AAVVController.class);

    @Autowired
    private AAVVService aavvService;

    // Operaciones AAVV
    //@ApiOperation(value = "Crear una tarea de abrir una reclamacion en ARTE desde AAVV")
    @PostMapping(value = "/abrirReclamacion")
    public Tramite abrirReclamacion(@Valid @RequestBody AbrirRK abrirRK) {
        logger.info("Creando tarea para abrir una reclamacion: {}", abrirRK.toString());
        return aavvService.createTramiteReclamacion(abrirRK);
    }

    //@ApiOperation(value = "Crear una tarea de realizar una actuacion de EyPO en ARTE desde AAVV")
    @PostMapping(value = "/realizarActuacionEyPO")
    public Tramite realizarActuacionEyPO(@Valid @RequestBody RealizarActuacionEyPO actuacionEyPO) {
        logger.info("Creando tarea para realizar una actuacion de EyPO: {}", actuacionEyPO.toString());
        return aavvService.createTramiteActuacionEyPO(actuacionEyPO);
    }

    //@ApiOperation(value = "Crear una tarea de realizar un aplazamiento de facturas en ARTE desde AAVV")
    @PostMapping(value = "/aplazarFacturas")
    public Tramite aplazarFacturas(@Valid @RequestBody AplazarFraccionarFacturas aplazarFraccionarFacturas) {
        logger.info("Crear una tarea de realizar un aplazamiento de facturas: {}", aplazarFraccionarFacturas.toString());
        return aavvService.createTramiteAplazarFraccionarFacturas(aplazarFraccionarFacturas, "Aplazamiento");
    }

    //@ApiOperation(value = "Crear una tarea de realizar un fraccionamiento de facturas en ARTE desde AAVV")
    @PostMapping(value = "/fraccionarFacturas")
    public Tramite fraccionarFacturas(@Valid @RequestBody AplazarFraccionarFacturas aplazarFraccionarFacturas) {
        logger.info("Creando tarea para realizar un fraccionamiento de facturas: {}", aplazarFraccionarFacturas.toString());
        return aavvService.createTramiteAplazarFraccionarFacturas(aplazarFraccionarFacturas, "Fraccionamiento");
    }

    //@ApiOperation(value = "Obtener un tramite a realizar en ARTE")
    @GetMapping(value = "/obtenerTramiteARealizar")
    public Tramite obtenerTramiteARealizar() {
        logger.info("Obtener tramite a realizar en ARTE");
        return aavvService.obtenerTramiteARealizar();
    }

    //@ApiOperation(value = "Obtener un tramite a realizar en ARTE")
    @GetMapping(value = "/obtenerTramite/{id}")
    public Tramite obtenerTramite(@PathVariable("id") String Id) {
        logger.info("Obtener tramite a realizar en ARTE");
        return aavvService.obtenerTramite(Id);
    }

}
