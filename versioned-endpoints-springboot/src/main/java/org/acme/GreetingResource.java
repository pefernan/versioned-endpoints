package org.acme;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.acme.v1.V1Greeting;
import org.acme.v1.V1Person;
import org.acme.v2.V2Greeting;
import org.acme.v2.V2Person;

@RestController()
public class GreetingResource {

    @PostMapping(path = "/hello", produces = "application/json;v1", consumes = "application/json;v1")
    public V1Greeting hello(V1Person person) {
        return new V1Greeting(person.hello());
    }

    @PostMapping(path = "/hello", produces = "application/json;v2", consumes = "application/json;v2")
    public V2Greeting hello(V2Person person) {
        return new V2Greeting(person.hello());
    }
}
