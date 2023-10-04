package br.com.fiap.petshop.infra.security.service;

import org.jvnet.hk2.annotations.Contract;

import java.util.List;

@Contract
public interface Service<T, U> {

    public List<T> findAll();

    public T findById(U id);

    public List<T> findByName(String texto);

    public T persist(T t);

}
