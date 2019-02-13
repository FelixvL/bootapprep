package com.capgemini.springboot.api;

import com.capgemini.springboot.controller.SchipRepository;
import com.capgemini.springboot.model.Schip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchipEndpoint {
    @Autowired
    private SchipRepository mijnSchipRepository;

    @GetMapping("hallo")
    public Schip lopen(){
        System.out.println("go");
        Schip hetSchip = new Schip();
        hetSchip.naam = "Titanic";
        Schip vliegendeHollander = mijnSchipRepository.save(hetSchip);
        return vliegendeHollander;
    }

    @GetMapping("geefalleschepen")
    public Iterable<Schip> geefAlleSchepen(){
        return mijnSchipRepository.findAll();
    }
}
