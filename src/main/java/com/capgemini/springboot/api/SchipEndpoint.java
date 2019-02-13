package com.capgemini.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchipEndpoint {

    @GetMapping("hallo")
    public String lopen(){
        System.out.println("go");
        return "jojo";
    }
}
