package com.happystuffy.gateway;

import com.happystuffy.domains.Fact;

import java.time.LocalDate;
import java.util.List;

public interface FactGateway {
    List<Fact> getFactsByDate(LocalDate date);
}
