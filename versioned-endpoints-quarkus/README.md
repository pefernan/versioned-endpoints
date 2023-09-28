# Versioned Endpoints test (Quarkus)

## Running the example
 ```shell
 mvn clean package quarkus:dev
 ```

## Commands

- Post to `/hello` `v1`
```shell
curl -X 'POST' \
  'http://localhost:8080/hello' \
  -H 'accept: application/json;v1' \
  -H 'Content-Type: application/json;v1' \
  -d '{
  "name": "Pere",
}'
```

```json
{"message":"Hello v1: Pere"}
```

- Post to `/hello` `v2`
```shell
❯ curl -X 'POST' \
  'http://localhost:8080/hello' \
  -H 'accept: application/json;v2' \
  -H 'Content-Type: application/json;v2' \
  -d '{
  "name": "Pere",
  "age": 40
}'
```

```json
{"message":"Hello v2: Pere(40)","version":"v2"}
```