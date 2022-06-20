package io.xstefank;

import io.quarkiverse.renarde.Controller;
import io.smallrye.health.registry.HealthRegistries;
import io.xstefank.health.TestHC;

import javax.ws.rs.Path;

@Path("/")
public class GreetingResource extends Controller {

    public String register() {
        HealthRegistries.getHealthGroupRegistry("my-health-group").register(new TestHC());

        return "Registered TestHC";
    }

    public String remove() {
        HealthRegistries.getHealthGroupRegistry("my-health-group").remove(TestHC.class.getName());

        return "TestHC removed from my-health-group";
    }
}