package com.aavvservice.controller;

import com.aavvservice.model.DatosReclamacion;
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

    @GetMapping(value = "/")
    public List<DatosReclamacion> getAllRKs() {
        logger.info("Getting all RKs.");
        return reclamacionRepository.findAll();
    }

    @GetMapping(value = "/{idRK}")
    public DatosReclamacion getReclamacionbyId(@PathVariable String idRK) {
        logger.info("Getting RK with ID: {}", idRK);
        return reclamacionRepository.findReclamacionById(idRK);
    }

    @PostMapping(value = "/create")
    public DatosReclamacion addRK(@RequestBody DatosReclamacion datosRK) {
        logger.info("Saving RK.");
        return reclamacionRepository.save(datosRK);
    }

    @DeleteMapping(value = "/delete/{idRK}")
    public void deleteRK(@PathVariable String idRK) {
        logger.info("Deleting RK with ID: {}", idRK);
        reclamacionRepository.deleteById(idRK);
    }
}
