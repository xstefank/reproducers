package org.xstefank.filter;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class TestClientRequestFilter implements ClientRequestFilter {
    
    public void filter(ClientRequestContext clientRequestContext) throws IOException {
        System.out.println("Hello from ClientRequestFilter");    
    }
}
