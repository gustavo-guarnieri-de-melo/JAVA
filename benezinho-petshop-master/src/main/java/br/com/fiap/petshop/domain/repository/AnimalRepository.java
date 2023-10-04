package br.com.fiap.petshop.domain.repository;

import br.com.fiap.petshop.Main;
import br.com.fiap.petshop.domain.entity.animal.Animal;
import br.com.fiap.petshop.infra.database.EntityManagerFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class AnimalRepository implements Repository<Animal, Long> {

    private static final AtomicReference<AnimalRepository> instance = new AtomicReference<>();
    private EntityManager manager;

    private AnimalRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static AnimalRepository build(EntityManager manager) {
        AnimalRepository result = instance.get();
        if (Objects.isNull( result )) {
            AnimalRepository repo = new AnimalRepository( manager );
            if (instance.compareAndSet( null, repo )) {
                result = repo;
            } else {
                result = instance.get();
            }
        }
        return result;
    }


    @Override
    public List<Animal> findAll() {
        return null;
    }

    @Override
    public Animal findById(Long id) {
        return null;
    }

    @Override
    public List<Animal> findByTexto(String texto) {
        return null;
    }

    @Override
    public Animal persist(Animal animal) {
        return null;
    }

    @Override
    public Animal update(Animal animal) {
        return null;
    }

    @Override
    public boolean delete(Animal animal) {
        return false;
    }
}
