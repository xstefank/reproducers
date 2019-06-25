package io.xstefank;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@Health
@ApplicationScoped
public class TestHC implements HealthCheck {
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("test=health1").up().build();
    }
}
