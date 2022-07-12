package io.xstefank;

import io.quarkus.hibernate.reactive.rest.data.panache.PanacheEntityResource;
import io.xstefank.entity.Test;

public interface TestResource extends PanacheEntityResource<Test, Long> {
}
