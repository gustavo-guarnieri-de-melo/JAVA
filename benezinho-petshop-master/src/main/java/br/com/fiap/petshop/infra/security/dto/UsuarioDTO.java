package br.com.fiap.petshop.infra.security.dto;

import br.com.fiap.petshop.infra.security.entity.Authority;
import br.com.fiap.petshop.infra.security.entity.PessoaFisica;
import br.com.fiap.petshop.infra.security.entity.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.Set;

/**
 * Classe utilizada para tranferência de valores.
 * <p>
 * Padrão Data Transfer Object
 *
 * @param id
 * @param username
 * @param password
 * @param pessoa
 * @param authorization
 * @param authorities
 */
public record UsuarioDTO(
        Long id,
        @NotNull @Email String username,
        String password,
        Long pessoa,
        String authorization,
        Set<Authority> authorities
) {


    /**
     * Transforma o Usuario em UsuarioDTO. Ocultando o password porém como recebe o token a authorization é exibida
     *
     * @param p
     * @param key
     * @return
     */
    public static UsuarioDTO of(Usuario p, String key) {
        if (Objects.isNull( p )) return null;
        return new UsuarioDTO(p.getId(), p.getUsername(), "", p.getPessoa().getId(), key, p.getAuthorities());
    }

    /**
     * Transforma o Usuario em UsuarioDTO. Ocultando o password e o token authorization
     *
     * @param p
     * @return
     */
    public static UsuarioDTO of(Usuario p) {
        if (Objects.isNull( p )) return null;
        return new UsuarioDTO(
                p.getId(),
                p.getUsername(),
                "",
                p.getPessoa().getId(),
                "",
                p.getAuthorities());
    }

    /**
     * transforma o UsuarioDTO em Usuário
     *
     * @param p
     * @return
     */
    public static Usuario of(UsuarioDTO p) {
        if (Objects.isNull( p )) return null;
        var pf = new PessoaFisica();
        pf.setId(p.pessoa);
        return new Usuario(p.id, p.username, p.password, pf, p.authorities);
    }


}
