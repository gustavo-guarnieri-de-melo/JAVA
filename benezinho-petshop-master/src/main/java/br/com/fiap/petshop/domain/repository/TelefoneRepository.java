package br.com.fiap.petshop.domain.repository;

import br.com.fiap.petshop.domain.entity.Telefone;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class TelefoneRepository implements Repository<Telefone, Long> {

    private static final AtomicReference<TelefoneRepository> instance = new AtomicReference<>();
    private EntityManager manager;

    private TelefoneRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static TelefoneRepository build(EntityManager manager) {
        TelefoneRepository result = instance.get();
        if (Objects.isNull( result )) {
            TelefoneRepository repo = new TelefoneRepository( manager );
            if (instance.compareAndSet( null, repo )) {
                result = repo;
            } else {
                result = instance.get();
            }
        }
        return result;
    }


    @Override
    public List<Telefone> findAll() {
        return null;
    }

    @Override
    public Telefone findById(Long id) {
        return null;
    }

    @Override
    public List<Telefone> findByTexto(String texto) {
        return null;
    }

    @Override
    public Telefone persist(Telefone telefone) {
        return null;
    }

    @Override
    public Telefone update(Telefone telefone) {
        return null;
    }

    @Override
    public boolean delete(Telefone telefone) {
        return false;
    }
}
