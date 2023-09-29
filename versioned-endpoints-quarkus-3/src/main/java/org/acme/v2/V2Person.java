package org.acme.v2;

public class V2Person {

    private String name;
    private int age;

    public V2Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String hello() {
        return this.name + "(" + this.age + ")";
    }
}
