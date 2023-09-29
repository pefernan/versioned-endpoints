package org.acme.v1;

public class V1Person {

    private String name;

    public V1Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String hello() {
        return this.getName();
    }
}
