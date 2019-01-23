package com.example.demo.rest;


import org.eclipse.microprofile.rest.client.RestClientBuilder;

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
		String example = RestClientBuilder.newBuilder()
				.baseUrl(new URL("http://example.com"))
				.build(ExampleClient.class)
					.getExample();
		return Response.ok(example).build();
	}
}
