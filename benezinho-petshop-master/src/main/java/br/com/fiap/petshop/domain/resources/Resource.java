package br.com.fiap.petshop.domain.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jvnet.hk2.annotations.Contract;

@Contract
public interface Resource<T, U> {

    public Response findAll();

    public Response findById(U id);

    public Response persist(T t);

    public Response update(U id, T t);

    public Response delete(T t);

}
