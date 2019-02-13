package com.capgemini.springboot.model;


import org.hibernate.validator.constraints.ISBN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Schip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String type;
    public int lengte;
    public int aantalPassagiers;
    public LocalDateTime bouwdatum;
    public String naam;
    public int topSnelheid;

    public void setType(String tiepe){
        type = tiepe;
    }
}
