package io.xstefank;

import io.xstefank.lraarq.TestBean;
import io.xstefank.lraarq.rest.HelloWorldEndpoint;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.testenricher.cdi.container.CDIExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.net.URL;

@RunWith(Arquillian.class)
public class TestIT {


    @ArquillianResource
    private URL url;
    
    @Deployment
    public static WebArchive deploy() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
            .addPackages(true, TestBean.class.getPackage())
            .addPackages(true, HelloWorldEndpoint.class.getPackage())
            .addAsResource("META-INF/services/javax.enterprise.inject.spi.Extension");
    }
    
    @Test
    public void test() {
        Client client = ClientBuilder.newClient();
        Response response = client.target(url.toString() + "hello")
            .request().get();

        Assert.assertEquals(200, response.getStatus());
    }
}
