package br.com.fiap.petshop.domain.repository;

import org.jvnet.hk2.annotations.Contract;

import java.util.List;

@Contract
public interface Repository<T, U> {

    public List<T> findAll();

    public T findById(U id);

    public List<T> findByTexto(String texto);

    public T persist(T t);

    public T update(T t);

    public boolean delete(T t);

}
