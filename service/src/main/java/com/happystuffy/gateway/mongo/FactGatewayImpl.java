package com.happystuffy.gateway.mongo;

import com.happystuffy.domains.Fact;
import com.happystuffy.gateway.FactGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class FactGatewayImpl implements FactGateway {

    @Autowired
    private FactRepository factRepository;

    @Override
    public List<Fact> getFactsByDate(LocalDate date) {
        return factRepository.findByDate(date);
    }
}
