package org.xstefank;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

@Path("ping")
public class PingResource {
    
    @GET
    public Response ping() {

        WebTarget target = ClientBuilder.newClient()
//                .register(TestClientRequestFilter.class)
                .target("http://example.com");

        Response response = target.request().get();
        
        return Response.ok("Application deployed successfully").build();
    }
}
