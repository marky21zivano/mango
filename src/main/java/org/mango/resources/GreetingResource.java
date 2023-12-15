package org.mango.resources;

import org.mango.models.Teste;
import org.mango.repository.TesteRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {
  @Inject
  TesteRepository repository;
  @POST
  @Path("/create")
  public Response create(Teste teste){
    repository.persist(teste);
    return Response.ok(teste).status(200).build();
  }


}
