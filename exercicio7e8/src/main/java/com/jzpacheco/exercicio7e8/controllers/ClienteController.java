package com.jzpacheco.exercicio7e8.controllers;

import com.jzpacheco.exercicio7e8.dtos.ClienteDTO;
import com.jzpacheco.exercicio7e8.mappers.ClienteMapper;
import com.jzpacheco.exercicio7e8.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;


    @GetMapping(value = "/{name}")
    public ClienteDTO findByName(@PathVariable String id){
        return service.findByName(id);
    }

}
