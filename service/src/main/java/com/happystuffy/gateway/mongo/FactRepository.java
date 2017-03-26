package com.happystuffy.gateway.mongo;

import com.happystuffy.domains.Fact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface FactRepository extends MongoRepository<Fact, String> {

    List<Fact> findByDate(LocalDate date);
}
