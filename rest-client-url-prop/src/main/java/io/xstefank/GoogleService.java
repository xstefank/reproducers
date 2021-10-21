package io.xstefank;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@RegisterRestClient
public interface GoogleService {

    @GET
    String get();

}
