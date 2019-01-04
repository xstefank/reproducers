package org.xstefank;

import org.jboss.resteasy.spi.ResteasyProviderFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("ping")
public class PingResource {
    
    @GET
    public Response ping() {

        System.out.println(ResteasyProviderFactory.getInstance());
        
        return Response.ok("Application deployed successfully").build();
    }
}
