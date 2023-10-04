package br.com.fiap.petshop.infra.security.repository;

import br.com.fiap.petshop.infra.security.entity.PessoaJuridica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Objects;

public class PessoaJuridicaRepository implements Repository<PessoaJuridica, Long> {

    private static volatile PessoaJuridicaRepository instance;
    private EntityManager manager;

    private PessoaJuridicaRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static PessoaJuridicaRepository build(EntityManager manager) {
        PessoaJuridicaRepository result = instance;
        if (Objects.nonNull(result)) return result;

        synchronized (PessoaJuridicaRepository.class) {
            if (Objects.isNull(instance)) {
                instance = new PessoaJuridicaRepository(manager);
            }
            return instance;
        }
    }


    @Override
    public List<PessoaJuridica> findAll() {
        List<PessoaJuridica> list = manager.createQuery("FROM PessoaJuridica").getResultList();
        return list;
    }

    @Override
    public PessoaJuridica findById(Long id) {
        PessoaJuridica pessoa = manager.find(PessoaJuridica.class, id);
        return pessoa;
    }

    @Override
    public List<PessoaJuridica> findByName(String texto) {
        String jpql = "SELECT p FROM PessoaJuridica p  where lower(p.nome) LIKE CONCAT('%',lower(:nome),'%')";
        Query query = manager.createQuery(jpql);
        query.setParameter("nome", texto);
        List<PessoaJuridica> list = query.getResultList();
        return list;
    }

    @Override
    public PessoaJuridica persist(PessoaJuridica pessoa) {
        manager.getTransaction().begin();
        manager.persist(pessoa);
        manager.getTransaction().commit();
        return pessoa;
    }
}
