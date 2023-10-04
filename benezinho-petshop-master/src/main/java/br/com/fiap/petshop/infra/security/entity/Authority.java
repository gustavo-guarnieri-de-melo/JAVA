package br.com.fiap.petshop.infra.security.entity;


import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_AUTHORITY", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_AUTHORITY", columnNames = "NM_AUTHORITY")
})
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AUTHORITY")
    @SequenceGenerator( name = "SQ_AUTHORITY", sequenceName = "SQ_AUTHORITY", allocationSize = 1, initialValue = 1)
    @Column(name = "ID_AUTHORITY")
    private Long id;

    // ADMIN, USER, LEITURA
    @Column(name = "NM_AUTHORITY", nullable = false)
    private String nome;


    @ManyToMany(mappedBy = "authorities", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Usuario> usuario = new LinkedHashSet<>();

    public Authority() {
    }

    public Authority(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public Authority setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Authority setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
