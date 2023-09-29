# Versioned Endpoints test (Spring-Boot)

## Running the example

 ```shell
mvn clean package spring-boot:run  
 ```

## Commands
1. Using mime type discrimination
- Post to `/hello` `v1`

```shell
curl -X 'POST' http://localhost:8080/hello -H 'accept: application/kogito_v1+json' -H 'Content-Type: application/kogito_v1+json' -d '{"name": "Pere"}'
```

```json
{
  "message": "Hello v1: Pere"
}
```

- Post to `/hello` `v2`

```shell
curl -X 'POST' http://localhost:8080/hello -H 'accept: application/kogito_v2+json' -H 'Content-Type: application/kogito_v2+json' -d '{"name": "Pere", "age": 40}'
```

```json
{
  "message": "Hello v2: Pere(40)",
  "version": "v2"
}
```

2. Using header discrimination
- Post to `/hello` `v1`

```shell
curl -X 'POST' http://localhost:8080/hello_header -H 'accept: application/json' -H 'Content-Type: application/json' -H 'X-KOGITO_VERSION:1' -d '{"name": "Pere"}'
```

```json
{
  "message": "Hello v1: Pere"
}
```
- Post to `/hello` `v2`

```shell
curl -X 'POST' http://localhost:8080/hello_header -H 'accept: application/json' -H 'Content-Type: application/json' -H 'X-KOGITO_VERSION:2' -d '{"name": "Pere", "age": 40}'
```

```json
{
  "message": "Hello v2: Pere(40)",
  "version": "v2"
}
```

2. Using param discrimination
- Post to `/hello` `v1`

```shell
curl -X 'POST' http://localhost:8080/hello_param?version=1 -H 'accept: application/json' -H 'Content-Type: application/json' -d '{"name": "Pere"}'
```

```json
{
  "message": "Hello v1: Pere"
}
```
- Post to `/hello` `v2`

```shell
curl -X 'POST' http://localhost:8080/hello_param?version=2 -H 'accept: application/json' -H 'Content-Type: application/json' -d '{"name": "Pere", "age": 40}'
```

```json
{
  "message": "Hello v2: Pere(40)",
  "version": "v2"
}
```