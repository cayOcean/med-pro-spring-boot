package br.com.medpro.medpro.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(String nome,
        @NotBlank String email,
        @NotBlank String telefone,
        @NotBlank @Pattern(regexp = "\\d{4,6}") String CPF,
        @NotBlank @Valid DadosEndereco endereco) {

}