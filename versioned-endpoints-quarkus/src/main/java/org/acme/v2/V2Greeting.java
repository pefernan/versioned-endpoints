package org.acme.v2;

public class V2Greeting {

    private String message;

    public V2Greeting(String message) {
        this.message = "Hello v2: " + message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
