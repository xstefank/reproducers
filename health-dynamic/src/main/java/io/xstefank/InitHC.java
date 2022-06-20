package io.xstefank;

import io.smallrye.health.api.HealthGroup;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@HealthGroup("my-health-group")
public class InitHC implements HealthCheck {


    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("Dummy HC");
    }
}
