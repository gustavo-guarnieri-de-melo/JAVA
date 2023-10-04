package br.com.fiap.petshop.infra.security.dto;

import br.com.fiap.petshop.domain.entity.Sexo;
import br.com.fiap.petshop.infra.security.entity.PessoaFisica;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record PessoaFisicaDTO(
        Long id,
        String nome,
        @PastOrPresent LocalDate nascimento,
        Sexo sexo,
        String cpf,
        UsuarioDTO usuario
) {
    public static PessoaFisicaDTO of(PessoaFisica p) {
        return new PessoaFisicaDTO( p.getId(), p.getNome(), p.getNascimento(), p.getSexo(), p.getCpf(), UsuarioDTO.of( p.getUsuario() ) );
    }


    public static PessoaFisica of(PessoaFisicaDTO p) {
        return new PessoaFisica( p.id, p.nome, p.nascimento, p.sexo, p.cpf, UsuarioDTO.of( p.usuario ) );
    }
}
