package br.com.fiap.petshop.infra.security.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CNPJ;

import java.time.LocalDate;

@Entity
@Table(name = "TB_PJ", uniqueConstraints = {
        @UniqueConstraint(name = "UK_PJ_CNPJ", columnNames = "NR_CNPJ")
})
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa {

    //@CNPJ
    @Column(name = "NR_CNPJ", nullable = false)
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long id, String nome, LocalDate nascimento, String cnpj) {
        super( id, nome, nascimento );
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }


    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "} " + super.toString();
    }
}
