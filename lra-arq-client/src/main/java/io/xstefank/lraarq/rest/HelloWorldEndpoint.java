package io.xstefank.lraarq.rest;

import io.xstefank.lraarq.TestBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/hello")
public class HelloWorldEndpoint {

	@Inject
	TestBean testBean;
	
	@GET
	@Produces("text/plain")
	public String  doGet() {
		return testBean.getValue();
	}
}
