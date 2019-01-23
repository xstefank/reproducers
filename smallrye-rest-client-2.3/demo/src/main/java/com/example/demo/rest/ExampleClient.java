package com.example.demo.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient
@Path("/")
public interface ExampleClient {
    
    @GET
    String getExample();
}
