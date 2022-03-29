package com.aavvservice.controller;

import com.aavvservice.model.AbrirRK;
import com.aavvservice.model.AplazarFraccionarFacturas;
import com.aavvservice.model.ConsultaSincrona;
import com.aavvservice.model.RealizarActuacionEyPO;
import com.aavvservice.service.AAVVService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("aavv")
public class AAVVController {
    private final Logger logger =
            LoggerFactory.getLogger(AAVVController.class);

    @Autowired
    private AAVVService aavvService;

    // Operaciones AAVV
    //@ApiOperation(value = "Crear una tarea de abrir una reclamacion en ARTE desde AAVV")
    @PostMapping(value = "/abrirReclamacion")
    public String abrirReclamacion(@Valid @RequestBody AbrirRK abrirRK) {
        logger.info("Creando tarea para abrir una reclamacion: {}", abrirRK.toString());
        return aavvService.createTramiteReclamacion(abrirRK);
    }

    //@ApiOperation(value = "Crear una tarea de realizar una actuacion de EyPO en ARTE desde AAVV")
    @PostMapping(value = "/realizarActuacionEyPO")
    public String realizarActuacionEyPO(@Valid @RequestBody RealizarActuacionEyPO actuacionEyPO) {
        logger.info("Creando tarea para realizar una actuacion de EyPO: {}", actuacionEyPO.toString());
        return aavvService.createTramiteActuacionEyPO(actuacionEyPO);
    }

    //@ApiOperation(value = "Crear una tarea de realizar un aplazamiento de facturas en ARTE desde AAVV")
    @PostMapping(value = "/aplazarFacturas")
    public String aplazarFacturas(@Valid @RequestBody AplazarFraccionarFacturas aplazarFraccionarFacturas) {
        logger.info("Crear una tarea de realizar un aplazamiento de facturas: {}", aplazarFraccionarFacturas.toString());
        return aavvService.createTramiteAplazarFraccionarFacturas(aplazarFraccionarFacturas, "Aplazamiento");
    }

    //@ApiOperation(value = "Crear una tarea de realizar un fraccionamiento de facturas en ARTE desde AAVV")
    @PostMapping(value = "/fraccionarFacturas")
    public String fraccionarFacturas(@Valid @RequestBody AplazarFraccionarFacturas aplazarFraccionarFacturas) {
        logger.info("Creando tarea para realizar un fraccionamiento de facturas: {}", aplazarFraccionarFacturas.toString());
        return aavvService.createTramiteAplazarFraccionarFacturas(aplazarFraccionarFacturas, "Fraccionamiento");
    }

    //@ApiOperation(value = "Obtener un tramite a realizar en ARTE")
    @GetMapping(value = "/obtenerTramiteARealizar")
    public Object obtenerTramiteARealizar() {
        logger.info("Obtener tramite a realizar en ARTE");
        return aavvService.obtenerTramiteARealizar();
    }

    //@ApiOperation(value = "Obtener un tramite a realizar en ARTE")
    @GetMapping(value = "/obtenerTramite/{id}")
    public Object obtenerTramite(@PathVariable("id") String Id) {
        logger.info("Obtener tramite a realizar en ARTE");
        return aavvService.obtenerTramite(Id);
    }

    //@ApiOperation(value = "Obtener una consulta sincrona realizada en ARTE")
    @GetMapping(value = "/obtenerConsultaSincrona/{collection}/{id}")
    public Object obtenerConsultaSincrona(@PathVariable("collection") String collection, @PathVariable("id") String Id) {
        logger.info("Obtener una consulta sincrona realizada en ARTE");
        return aavvService.obtenerConsultaSincrona(collection, Id);
    }

    //@ApiOperation(value = "Crear una consulta en la BBDD de Mongo")
    @PostMapping(value = "/crearConsulta")
    public String crearConsulta(@Valid @RequestBody ConsultaSincrona consulta) {
        logger.info("Creando consulta en Mongo: {}", consulta.toString());
        return aavvService.crearConsulta(consulta);
    }

    //@ApiOperation(value = "Actualiza una consulta en la BBDD de Mongo")
    @PostMapping(value = "/actualizarConsulta")
    public String actualizarConsulta(@Valid @RequestBody ConsultaSincrona consulta) {
        logger.info("Actualizando  consulta {} en Mongo: {}", consulta.getId(), consulta.toString());
        return aavvService.actualizarConsulta(consulta);
    }
}
