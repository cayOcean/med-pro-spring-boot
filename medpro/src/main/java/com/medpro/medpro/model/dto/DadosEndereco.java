package com.medpro.medpro.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(String logadouro,
        @NotBlank String bairro,
        @NotBlank @NotBlank @Pattern(regexp = "\\d{8}") String cep,
        @NotBlank String cidade,
        String uf, String numero,
        String complemento) {

}
