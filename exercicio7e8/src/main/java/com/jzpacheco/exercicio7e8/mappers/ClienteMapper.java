package com.jzpacheco.exercicio7e8.mappers;

import com.jzpacheco.exercicio7e8.dtos.ClienteDTO;
import com.jzpacheco.exercicio7e8.models.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ClienteMapper {

    public ClienteDTO toDto(Cliente entity){
        return new ClienteDTO(entity.getNome(), entity.getSaldo());
    }
}
