package org.xstefank.thorntailundertow.rest;


import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.xstefank.thorntailundertow.ExampleRestClient;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.MalformedURLException;
import java.net.URL;


@Path("/hello")
public class HelloWorldEndpoint {
	
	@GET
	@Produces("text/plain")
	public Response doGet() throws MalformedURLException {
		ExampleRestClient exampleRestClient = RestClientBuilder.newBuilder()
				.baseUrl(new URL("http://example.com")).build(ExampleRestClient.class);
		
		Response response = exampleRestClient.get();
		return Response.ok("Hello from Thorntail!" + response.readEntity(String.class)).build();
	}
}
