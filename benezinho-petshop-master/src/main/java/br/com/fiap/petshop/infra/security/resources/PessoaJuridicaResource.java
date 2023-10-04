package br.com.fiap.petshop.infra.security.resources;

import br.com.fiap.petshop.Main;
import br.com.fiap.petshop.infra.configuration.jwt.JsonTokenNeeded;
import br.com.fiap.petshop.infra.security.dto.PessoaJuridicaDTO;
import br.com.fiap.petshop.infra.security.entity.PessoaJuridica;
import br.com.fiap.petshop.infra.security.service.PessoaJuridicaService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.net.URI;
import java.util.List;

@Path("/pj")
@JsonTokenNeeded //Necessita de um "privateKey" em Usuario type APIKey
public class PessoaJuridicaResource implements Resource<PessoaJuridicaDTO, Long> {
    @Context
    UriInfo uriInfo;

    private PessoaJuridicaService service = PessoaJuridicaService.of( Main.PERSISTENCE_UNIT );

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response findAll() {
        List<PessoaJuridica> all = service.findAll();

        return Response
                .status( Response.Status.OK )
                .entity( all.stream().map( PessoaJuridicaDTO::of ).toList() )
                .build();
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response findById(@PathParam("id") Long id) {
        PessoaJuridica  pessoa = service.findById( id );

        return Response
                .status( Response.Status.OK )
                .entity( PessoaJuridicaDTO.of( pessoa ) )
                .build();
    }


    @POST
    @Override
    public Response persist(PessoaJuridicaDTO pessoa) {
        PessoaJuridica persist = service.persist( PessoaJuridicaDTO.of( pessoa ) );

        //https://docs.oracle.com/middleware/1213/wls/RESTF/develop-restful-service.htm#RESTF238
        UriBuilder ub = uriInfo.getAbsolutePathBuilder();
        URI uri = ub.path( String.valueOf( persist.getId() ) ).build();

        return Response
                .created( uri )
                .entity( PessoaJuridicaDTO.of( persist ) )
                .build();
    }
}
