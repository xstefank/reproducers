package io.xstefank.lraarq;

public class TestBean {
    
    private String value;
    
    public TestBean() {
        this("default contructor");   
    }

    public TestBean(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
