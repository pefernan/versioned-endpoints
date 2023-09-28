package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.acme.v1.V1Greeting;
import org.acme.v1.V1Person;
import org.acme.v2.V2Greeting;
import org.acme.v2.V2Person;

@Path("/")
public class GreetingResource {

    @POST
    @Path("/hello")
    @Consumes("application/json;v1")
    @Produces("application/json;v1")
    public V1Greeting hello(V1Person person) {
        return new V1Greeting(person.hello());
    }

    @POST
    @Path("/hello")
    @Consumes("application/json;v2")
    @Produces("application/json;v2")
    public V2Greeting hello(V2Person person) {
        return new V2Greeting(person.hello());
    }
}
