package com.capgemini.springboot.api;

import com.capgemini.springboot.controller.SchipRepository;
import com.capgemini.springboot.model.Schip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchipEndpoint {
    @Autowired
    private SchipRepository mijnSchipRepository;

    @GetMapping("nieuwschip/{scheepsnaam}")
    public Schip nieuwSchipMaken(@PathVariable String scheepsnaam){
        System.out.println("go"+scheepsnaam);
        Schip hetSchip = new Schip();
        hetSchip.naam = scheepsnaam;
        Schip vliegendeHollander = mijnSchipRepository.save(hetSchip);
        return vliegendeHollander;
    }

    @GetMapping("geefalleschepen")
    public Iterable<Schip> geefAlleSchepen(){
        return mijnSchipRepository.findAll();
    }
}
