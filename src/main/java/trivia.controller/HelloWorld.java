package trivia.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/users")
public class HelloWorld {
     // The Java method will process HTTP GET requests
    @GET

    @Path("{name}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getUserByName(@PathParam("name") String name) {
              // Return a simple message
        String output =  name + ",  Welcome to our Project";
        return Response.status(200).entity(output).build();
    }
}