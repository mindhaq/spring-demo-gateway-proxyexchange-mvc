# spring-demo-gateway-proxyexchange-mvc

Requires JDK 21.

## start

    ./gradlew bootRun

## test HTTP GET

    curl http://localhost:8080/get

## test HTTP POST
    
        curl -X POST -H "Content-Type: application/json" -d '{"foo": "bar"}' http://localhost:8080/post 
