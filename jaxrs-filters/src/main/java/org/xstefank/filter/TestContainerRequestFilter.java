package org.xstefank.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class TestContainerRequestFilter implements ContainerRequestFilter {
    
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println("Hello from ContainerRequestFilter");
    }
}
