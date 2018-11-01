package org.xstefank;

import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestResource {

    @Path("/get")
    @GET
    @TestStereotype
    @Produces
    public Response get() {
        return Response.ok("get").build();
    }
}
