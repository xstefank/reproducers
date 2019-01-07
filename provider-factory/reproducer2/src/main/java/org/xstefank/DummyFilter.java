package org.xstefank;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import java.io.IOException;

public class DummyFilter implements ContainerRequestFilter {
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        containerRequestContext.abortWith(Response.ok("stub from reproducer 2 abort").build());
    }
}
