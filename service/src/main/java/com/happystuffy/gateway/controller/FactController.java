package com.happystuffy.gateway.controller;

import com.happystuffy.domains.Fact;
import com.happystuffy.usecases.GetTodayFacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FactController {

    @Autowired
    private GetTodayFacts getTodayFacts;

    @RequestMapping("/facts")
    public List<Fact> getFacts() {
        return getTodayFacts.execute();
    }
}
