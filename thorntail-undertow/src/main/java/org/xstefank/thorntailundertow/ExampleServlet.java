package org.xstefank.thorntailundertow;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URL;

@WebServlet("/servlet")
public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ExampleRestClient exampleRestClient = RestClientBuilder.newBuilder()
                .baseUrl(new URL("http://example.com")).build(ExampleRestClient.class);

        Response response = exampleRestClient.get();
        
        resp.getWriter().write("Hello from test servlet" + response.readEntity(String.class));
    }
}
