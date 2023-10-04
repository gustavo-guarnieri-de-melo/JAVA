package br.com.fiap.petshop.infra.security.dto;

import br.com.fiap.petshop.infra.security.entity.PessoaJuridica;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record PessoaJuridicaDTO(
        Long id,
        @NotNull String nome,
        @PastOrPresent LocalDate nascimento,
        @NotNull String cnpj
) {
    public static PessoaJuridicaDTO of(PessoaJuridica p) {
        return new PessoaJuridicaDTO( p.getId(), p.getNome(), p.getNascimento(), p.getCnpj() );
    }

    public static PessoaJuridica of(PessoaJuridicaDTO p) {
        return new PessoaJuridica( p.id, p.nome, p.nascimento, p.cnpj );
    }
}
