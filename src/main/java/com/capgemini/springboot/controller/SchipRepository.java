package com.capgemini.springboot.controller;

import com.capgemini.springboot.model.Schip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchipRepository extends CrudRepository<Schip, Long> {
}
