package br.com.fiap.petshop.domain.service;

import br.com.fiap.petshop.Main;
import br.com.fiap.petshop.domain.entity.servico.Servico;
import br.com.fiap.petshop.domain.repository.ServicoRepository;
import br.com.fiap.petshop.infra.database.EntityManagerFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class ServicoService implements Service<Servico, Long> {

    private static final AtomicReference<ServicoService> instance = new AtomicReference<>();

    private ServicoRepository repository;

    private ServicoService(ServicoRepository repository) {

        this.repository = repository;
    }

    public static ServicoService build() {
        ServicoService result = instance.get();
        if (Objects.isNull( result )) {
            EntityManagerFactory factory = EntityManagerFactoryProvider.of( Main.PERSISTENCE_UNIT ).provide();
            EntityManager manager = factory.createEntityManager();
            ServicoRepository repository = ServicoRepository.build( manager );
            ServicoService service = new ServicoService( repository );
            if (instance.compareAndSet( null, service )) {
                result = service;
            } else {
                result = instance.get();
            }
        }
        return result;
    }

    @Override
    public List<Servico> findAll() {
        return repository.findAll();
    }

    @Override
    public Servico findById(Long id) {
        return repository.findById( id );
    }

    @Override
    public List<Servico> findByName(String texto) {
        return repository.findByTexto( texto );
    }

    @Override
    public Servico persist(Servico servico) {
        return repository.persist( servico );
    }

    @Override
    public Servico update(Long id, Servico servico) {
        var entidade = repository.findById( id );
        if (Objects.isNull( entidade )) return null;
        servico.setId( id );
        return repository.update(servico);
    }

    @Override
    public boolean delete(Servico servico) {
        return repository.delete(servico);
    }
}
