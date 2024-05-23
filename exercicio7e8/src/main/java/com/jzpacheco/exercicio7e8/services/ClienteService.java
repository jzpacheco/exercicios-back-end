package com.jzpacheco.exercicio7e8.services;

import com.jzpacheco.exercicio7e8.dtos.ClienteDTO;
import com.jzpacheco.exercicio7e8.mappers.ClienteMapper;
import com.jzpacheco.exercicio7e8.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {

    private Map<String, Cliente> repository = new HashMap<>();

    @Autowired
    private ClienteMapper mapper;

    public ClienteService(Map<String, Cliente> repository) {
        MockClients();
        this.repository = repository;
    }

    public ClienteDTO findByName(String nome){
        var entity = repository.get(nome);
        return mapper.toDto(entity);
    }

    public void MockClients(){
        Cliente cliente = new Cliente("José", 1000D,"ABC");
        Cliente cliente2 = new Cliente("Maria", 500D,"123");

        repository.put(cliente.getNome(), cliente);
        repository.put(cliente2.getNome(), cliente2);

    }
}


