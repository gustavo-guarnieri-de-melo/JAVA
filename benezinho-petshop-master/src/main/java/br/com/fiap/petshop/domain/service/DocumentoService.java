package br.com.fiap.petshop.domain.service;

import br.com.fiap.petshop.Main;
import br.com.fiap.petshop.domain.entity.Documento;
import br.com.fiap.petshop.domain.repository.DocumentoRepository;
import br.com.fiap.petshop.infra.database.EntityManagerFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class DocumentoService implements Service<Documento, Long> {

    private static final AtomicReference<DocumentoService> instance = new AtomicReference<>();

    private DocumentoRepository repository;

    private DocumentoService(DocumentoRepository repository) {

        this.repository = repository;
    }

    public static DocumentoService build() {
        DocumentoService result = instance.get();
        if (Objects.isNull( result )) {
            EntityManagerFactory factory = EntityManagerFactoryProvider.of( Main.PERSISTENCE_UNIT ).provide();
            EntityManager manager = factory.createEntityManager();
            DocumentoRepository repository = DocumentoRepository.build( manager );
            DocumentoService service = new DocumentoService( repository );
            if (instance.compareAndSet( null, service )) {
                result = service;
            } else {
                result = instance.get();
            }
        }
        return result;
    }

    @Override
    public List<Documento> findAll() {
        return repository.findAll();
    }

    @Override
    public Documento findById(Long id) {
        return repository.findById( id );
    }

    @Override
    public List<Documento> findByName(String texto) {
        return repository.findByTexto( texto );
    }

    @Override
    public Documento persist(Documento documento) {
        return repository.persist( documento );
    }

    @Override
    public Documento update(Long id, Documento documento) {
        var entidade = repository.findById( id );
        if (Objects.isNull( entidade )) return null;
        documento.setId( id );
        return repository.update(documento);
    }

    @Override
    public boolean delete(Documento documento) {
        return repository.delete(documento);
    }
}
