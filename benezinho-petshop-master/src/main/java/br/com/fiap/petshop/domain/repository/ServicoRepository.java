package br.com.fiap.petshop.domain.repository;

import br.com.fiap.petshop.domain.entity.servico.Servico;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class ServicoRepository implements Repository<Servico, Long>{

    private static final AtomicReference<ServicoRepository> instance = new AtomicReference<>();
    private EntityManager manager;

    private ServicoRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static ServicoRepository build(EntityManager manager) {
        ServicoRepository result = instance.get();
        if (Objects.isNull( result )) {
            ServicoRepository repo = new ServicoRepository( manager );
            if (instance.compareAndSet( null, repo )) {
                result = repo;
            } else {
                result = instance.get();
            }
        }
        return result;
    }


    @Override
    public List<Servico> findAll() {
        return null;
    }

    @Override
    public Servico findById(Long id) {
        return null;
    }

    @Override
    public List<Servico> findByTexto(String texto) {
        return null;
    }

    @Override
    public Servico persist(Servico servico) {
        return null;
    }

    @Override
    public Servico update(Servico servico) {
        return null;
    }

    @Override
    public boolean delete(Servico servico) {
        return false;
    }
}
