package br.com.fiap.petshop.infra.security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AuthorizationDTO (@NotNull @Email String username, @NotNull @NotBlank String password) {
}
