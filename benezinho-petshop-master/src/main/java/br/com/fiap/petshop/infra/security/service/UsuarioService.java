package br.com.fiap.petshop.infra.security.service;

import br.com.fiap.petshop.infra.configuration.criptografia.Password;
import br.com.fiap.petshop.infra.database.EntityManagerFactoryProvider;
import br.com.fiap.petshop.infra.security.dto.AuthorizationDTO;
import br.com.fiap.petshop.infra.security.entity.Usuario;
import br.com.fiap.petshop.infra.security.repository.PessoaFisicaRepository;
import br.com.fiap.petshop.infra.security.repository.UsuarioRepository;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Objects;


public class UsuarioService implements Service<Usuario, Long> {

    private static volatile UsuarioService instance;

    private UsuarioRepository repo;

    private PessoaFisicaRepository pfRepo;

    private UsuarioService(UsuarioRepository repo, PessoaFisicaRepository pfRepo) {
        this.repo = repo;
        this.pfRepo = pfRepo;
    }

    public static UsuarioService of(String persistenceUnit) {
        UsuarioService result = instance;
        if (Objects.nonNull(result)) return result;

        synchronized (UsuarioService.class) {
            if (Objects.isNull(instance)) {
                EntityManagerFactory factory = EntityManagerFactoryProvider.of(persistenceUnit).provide();
                UsuarioRepository repo = UsuarioRepository.build(factory.createEntityManager());
                PessoaFisicaRepository pfRepo = PessoaFisicaRepository.build(factory.createEntityManager());
                instance = new UsuarioService(repo, pfRepo);
            }
            return instance;
        }
    }

    public Usuario autenticar(AuthorizationDTO dto) {
        Usuario a = repo.findByUsername(dto.username());
        var pass = dto.password();
        boolean autenticado = Password.check(pass, a.getPassword());
        if (Objects.nonNull(a) && autenticado) {
            return a;
        }
        return null;
    }


    @Override
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Usuario> findByName(String texto) {
        return repo.findByName(texto);
    }

    @Override
    public Usuario persist(Usuario a) {
        return repo.persist(a);
    }

}
