package com.jzpacheco.exercicio7e8.services;

import com.jzpacheco.exercicio7e8.dtos.ClienteDTO;
import com.jzpacheco.exercicio7e8.dtos.TransacaoDTO;
import com.jzpacheco.exercicio7e8.mappers.TransacaoMapper;
import com.jzpacheco.exercicio7e8.models.Transacao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TransacaoService {
    private List<Transacao> repository = new ArrayList<>();

    @Autowired
    ClienteService clienteService;

    @Autowired
    TransacaoMapper mapper;

    public TransacaoDTO create(TransacaoDTO transacao){
        Transacao entity = mapper.toEntity(transacao);
        ClienteDTO pagador = clienteService.findByName(entity.getPagador());


        repository.add(entity);
        return mapper.toDto(entity);
    }
}
