package br.com.fiap.petshop.infra.security.service;

import br.com.fiap.petshop.infra.configuration.criptografia.Password;
import br.com.fiap.petshop.infra.database.EntityManagerFactoryProvider;
import br.com.fiap.petshop.infra.security.entity.PessoaFisica;
import br.com.fiap.petshop.infra.security.repository.PessoaFisicaRepository;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Objects;

public class PessoaFisicaService implements Service<PessoaFisica, Long> {

    private static volatile PessoaFisicaService instance;

    private PessoaFisicaRepository repo;


    private PessoaFisicaService(PessoaFisicaRepository repo) {
        this.repo = repo;

    }

    public static PessoaFisicaService of(String persistenceUnit) {
        PessoaFisicaService result = instance;
        if (Objects.nonNull(result)) return result;

        synchronized (PessoaFisicaService.class) {
            if (Objects.isNull(instance)) {
                EntityManagerFactory factory = EntityManagerFactoryProvider.of(persistenceUnit).provide();

                PessoaFisicaRepository pessoaRepository = PessoaFisicaRepository.build(factory.createEntityManager());


                instance = new PessoaFisicaService(pessoaRepository);
            }
            return instance;
        }
    }

    @Override
    public List<PessoaFisica> findAll() {
        return repo.findAll();
    }

    @Override
    public PessoaFisica findById(Long id) {
        return repo.findById(id);
    }


    @Override
    public List<PessoaFisica> findByName(String texto) {
        return repo.findByName(texto);
    }

    @Override
    public PessoaFisica persist(PessoaFisica pessoa) {
        if (Objects.isNull(pessoa) || Objects.isNull(pessoa.getUsuario())) return null;
        var pass = Password.encoder(pessoa.getUsuario().getPassword());
        pessoa.getUsuario().setPassword(pass);
        pessoa.getUsuario().setPessoa(pessoa);
        PessoaFisica persisted = repo.persist(pessoa);
        return persisted;
    }
}
