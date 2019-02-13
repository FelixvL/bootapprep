package com.capgemini.springboot.api;

import com.capgemini.springboot.controller.SchipRepository;
import com.capgemini.springboot.model.Schip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("nieuweboot")
    public String bootMaken(@RequestBody Schip boot){
        mijnSchipRepository.save(boot);
        return "het is gelukt";
    }
}
