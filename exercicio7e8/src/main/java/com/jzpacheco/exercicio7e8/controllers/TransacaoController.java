package com.jzpacheco.exercicio7e8.controllers;

import com.jzpacheco.exercicio7e8.dtos.TransacaoDTO;
import com.jzpacheco.exercicio7e8.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @PostMapping()
    public TransacaoDTO create(@RequestBody TransacaoDTO){
        return service.create(TransacaoDTO);
    }
}
