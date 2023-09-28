package org.acme.v1;

public class V1Greeting {

    private String message;

    public V1Greeting(String message) {
        this.message = "Hello v1: " + message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
