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
        System.out.println(ResteasyProviderFactory.getInstance());
        ResteasyProviderFactory.getInstance().registerProvider(DummyContainerRequestFilter.class);

        return Response.ok("provider registered").build();
    }
    
    @GET
    public Response ping() {        
        return Response.ok("Application deployed successfully").build();
    }
}
