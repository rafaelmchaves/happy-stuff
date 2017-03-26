package com.happystuffy.gateway.mongo;

import com.happystuffy.domains.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private FactRepository factRepository;

    @Override
    public void run(String... strings) throws Exception {
        factRepository.deleteAll();
        factRepository.save(new Fact(LocalDate.now(), "criação do projeto", "criação do projeto lindão"));
        factRepository.save(new Fact(LocalDate.of(2017, Month.JANUARY, 26), "gustavao nos abandonou", "esta programando com chineses agora, sem mulher fdp"));
    }
}

