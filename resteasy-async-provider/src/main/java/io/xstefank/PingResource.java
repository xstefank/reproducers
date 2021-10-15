package io.xstefank;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Path("ping")
public class PingResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public CompletionStage<Integer> ping() {
        return CompletableFuture.supplyAsync(() -> 42);
    }
}
