package io.xstefank;

import org.eclipse.microprofile.lra.annotation.AfterLRA;
import org.eclipse.microprofile.lra.annotation.LRAStatus;
import org.eclipse.microprofile.lra.annotation.ws.rs.LRA;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/lra")
@ApplicationScoped
public class LraResource {

    int afterLRACounter = 1;
    
    @GET
    @Path("/tx")
    @LRA
    public Response lra(@HeaderParam(LRA.LRA_HTTP_CONTEXT_HEADER) URI lraId) {
        System.out.println(lraId);
        return Response.ok().build();
    }

    @PUT
    @Path("/after")
    @AfterLRA
    public Response afterLRA(@HeaderParam(LRA.LRA_HTTP_ENDED_CONTEXT_HEADER) URI endedLra, LRAStatus status) {
        System.out.println("===============");
        System.out.println("endedLra = " + endedLra + ", status = " + status);
        System.out.println("===============");
        System.out.println();

        return afterLRACounter == 1 ? Response.status(500).build() : Response.ok().build();
    }
    
    @GET
    @Path("/count")
    public void countdown() {
        afterLRACounter = 0;
    }
}
