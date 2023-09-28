package org.acme.v2;

public class V2Greeting {

    private String message;
    private final String version= "v2";

    public V2Greeting(String message) {
        this.message = "Hello " + this.version +": " + message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVersion() {
        return version;
    }
}
