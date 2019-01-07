package org.xstefank;

import org.jboss.resteasy.spi.ResteasyProviderFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("ping")
public class PingResource {
    
    @GET
    @Path("register")
    public Response register() {
        ResteasyProviderFactory.getInstance().registerProvider(DummyFilter.class);

        return Response.ok("provider dummy registered").build();
    }
    
    @GET
    public Response ping() {
        return Response.ok("Application reproducer 2 deployed successfully").build();
    }
}
