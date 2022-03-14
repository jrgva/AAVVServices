package com.aavvservice.repository;

import com.aavvservice.model.Tramite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AAVVTramitesRepository extends MongoRepository<Tramite, String> {
}
