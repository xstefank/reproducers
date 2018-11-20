package org.xstefank.thorntailundertow;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("")
@RegisterRestClient
public interface ExampleRestClient {
    
    @GET
    @Path("")
    Response get();
}
