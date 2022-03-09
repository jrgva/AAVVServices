package com.aavvservice.repository;

import com.aavvservice.model.DatosReclamacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbrirReclamacionRepository extends MongoRepository<DatosReclamacion, String> {
    DatosReclamacion findReclamacionById(String Id);
}
