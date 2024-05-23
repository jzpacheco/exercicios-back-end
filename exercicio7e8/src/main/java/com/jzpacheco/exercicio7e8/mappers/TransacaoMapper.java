package com.jzpacheco.exercicio7e8.mappers;

import com.jzpacheco.exercicio7e8.dtos.TransacaoDTO;
import com.jzpacheco.exercicio7e8.models.Transacao;

public class TransacaoMapper {

    public TransacaoDTO toDto(Transacao entity){
        return new TransacaoDTO(entity.getPagador(), entity.getRecebedor(), entity.getQuantidade());
    }

    public Transacao toEntity(TransacaoDTO dto){
        return new Transacao(dto.recebedor(), dto.pagador(), dto.quantidade());
    }
}
