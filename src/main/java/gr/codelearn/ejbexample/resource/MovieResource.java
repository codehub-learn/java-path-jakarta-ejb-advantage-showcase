package gr.codelearn.ejbexample.resource;

import gr.codelearn.ejbexample.domain.Movie;
import gr.codelearn.ejbexample.service.MovieService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/movie")
public class MovieResource {

    @EJB
    private MovieService movieService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Movie movie){
        return Response.ok().entity(movieService.create(movie)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        return Response.ok().entity(movieService.findAll()).build();
    }
}
