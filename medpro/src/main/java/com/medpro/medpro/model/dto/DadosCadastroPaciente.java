package com.medpro.medpro.model.dto;

import com.medpro.medpro.enums.Especialidade;

public record DadosCadastroPaciente(String nome, String email, String cpf, Especialidade especialidade, DadosEndereco endereco) {
    
}
