package br.com.fiap.petshop;


import br.com.fiap.petshop.domain.entity.animal.Animal;
import jakarta.persistence.*;

import java.util.List;


public class Main {
    public static final String PERSISTENCE_UNIT = "oracle";

    public static <ex> void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory( "maria-db" );

        EntityManager manager = factory.createEntityManager();



            // Criar um novo Animal
            Animal newAnimal = new Animal();
            newAnimal.setNome("Rex");
            newAnimal.setRaca("PitBull");
            newAnimal = createAnimal(manager, newAnimal);
            System.out.println("Animal criado: " + newAnimal);

            // Buscar um Animal por ID
            Long animalId = newAnimal.getId();
            Animal foundAnimal = findAnimalById(manager, animalId);
            System.out.println("Animal encontrado: " + foundAnimal);

            // Listar todos os Animais
            List<Animal> allAnimals = findAllAnimals(manager);
            System.out.println("Todos os Animais: " + allAnimals);

            // Deletar um Animal por ID
            deleteAnimal(manager, animalId);
            System.out.println("Animal deletado com sucesso.");

            factory.close();
    }

    public static Animal createAnimal(EntityManager factory, Animal animal) {
        factory.getTransaction().begin();
        factory.persist(animal);
        factory.getTransaction().commit();
        return animal;
    }

    public static Animal findAnimalById(EntityManager factory, Long id) {
        return factory.find(Animal.class, id);
    }

    public static List<Animal> findAllAnimals(EntityManager factory) {
        TypedQuery<Animal> query = factory.createQuery("SELECT a FROM Animal a", Animal.class);
        return query.getResultList();
    }

    public static void deleteAnimal(EntityManager factory, Long id) {
        Animal animal = factory.find(Animal.class, id);
        if (animal != null) {
            factory.getTransaction().begin();
            factory.remove(animal);
            factory.getTransaction().commit();
        }
    }
}
