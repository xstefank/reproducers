package io.xstefank;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestBean {

    public String getFoo() {
        return "Foo";
    }
}
