package com.happystuffy.usecases;

import com.happystuffy.domains.Fact;
import com.happystuffy.gateway.FactGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class GetTodayFacts {

    @Autowired
    private FactGateway factGateway;

    public List<Fact> execute() {
       return factGateway.getFactsByDate(LocalDate.now());
    }
}
