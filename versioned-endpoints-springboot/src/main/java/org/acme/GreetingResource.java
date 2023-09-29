package org.acme;

import org.acme.v1.V1Greeting;
import org.acme.v1.V1Person;
import org.acme.v2.V2Greeting;
import org.acme.v2.V2Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GreetingResource {

    @PostMapping(path = "/hello",
            name = "hello_v1",
            consumes = "application/kogito_v1+json",
            produces = "application/kogito_v1+json")
    public V1Greeting hello_produces_v1(@RequestBody(required = false) V1Person person) {
        return new V1Greeting(person.hello());
    }

    @PostMapping(path = "/hello",
            consumes = "application/kogito_v2+json",
            produces = "application/kogito_v2+json")
    public V2Greeting hello_produces_v2(@RequestBody(required = false) V2Person person) {
        return new V2Greeting(person.hello());
    }

    @PostMapping(path = "/hello_header", headers = "X-KOGITO_VERSION=1")
    public V1Greeting hello_header_v1(@RequestBody(required = false) V1Person person) {
        return new V1Greeting(person.hello());
    }

    @PostMapping(path = "/hello_header", headers = "X-KOGITO_VERSION=2")
    public V2Greeting hello_header_v2(@RequestBody(required = false) V2Person person) {
        return new V2Greeting(person.hello());
    }

    @PostMapping(path = "/hello_param", params = "version=1")
    public V1Greeting hello_param_v1(@RequestBody(required = false) V1Person person) {
        return new V1Greeting(person.hello());
    }

    @PostMapping(path = "/hello_param", params = "version=2")
    public V2Greeting hello_param_v2(@RequestBody(required = false) V2Person person) {
        return new V2Greeting(person.hello());
    }


   /* @PostMapping(path = "/hello",
            name = "hello_v1",
            produces = "application/json;v1",
            consumes = "application/json;v1")
    public V1Greeting hello(V1Person person) {
        return new V1Greeting(person.hello());
    }

    @PostMapping(path = "/hello",
            name = "hello_v2",
            produces = "application/json;v2",
            consumes = "application/json;v2")
    public V2Greeting hello_v2(V2Person person) {
        return new V2Greeting(person.hello());
    }*/
}
