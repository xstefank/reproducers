package io.xstefank;

import org.eclipse.microprofile.lra.annotation.ws.rs.LRA;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/lra")
@ApplicationScoped
public class LraResource {

    @GET
    @Path("/tx")
    @LRA
    public Response lra(@HeaderParam(LRA.LRA_HTTP_CONTEXT_HEADER) URI lraId) {
        System.out.println(lraId);
        return Response.ok().build();
    }
}
