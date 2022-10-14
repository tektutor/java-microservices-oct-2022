# Day 5

## Microservices Design Patters Overview

### Aggregator Design Pattern
- Assume there are 5 microservices A, B, C, D and E
- Assume Microservice A depends on data from B,C,D and E to perform something
- There are couple of ways Microservice A can achieve this
   1. It can make calls to Microservice B,C,D,E and use that
   2. It can make a single call to a Aggregator Microservice F that will collect the necessary data from B,C,D,E and provide that to Microservice A
- Advantages
  - Provides a single point of access to complex data
  - easy to understand and maintain
  - helps in decoupling the producer and consumer microservices

### API Gateway Design Pattern
- provides a single entry point for all clients (Mobile, Desktop, etc.,)
- The API Gateway handles request in couple of ways
  - requests are proxied/routed to respective microservices
  - fan out requests to multiple services
- Advantages
  - decouples application by abstracting how microservices are partitioned
  - client application need not have to make multiple rountrips 
- Drawbacks
  - Increased complexity - increases hops
  - Increased response time due to additional network hops
Eg: Netflix API Gateway

### Aynchronous Messaging
Microservices can communicate with each other via
- Synchronous fashion ( REST calls )
- Asynchronous fashion ( Using RabbitMq, Apache Kafka, etc)
- making synchronous calls blocks the initiating microservice until reponses arrives from dependent microservice. This practice isn't recommended.
- microservices that makes synchronous calls are strongly coupled, i.e change of design of one microservice will affect others
- asynchronous is recommended as it helps in decoupling colloborating microservices

### Decomposition
- decompose by business capability
  - services must be cohessive
  - services must be loosly coupled
  - should provide business value
- decompose by subdomains microservices patterns
  - using Domain Driven Design
    - Domain may have sub-domains
    - Example : E-Commerce Domain has User, Product, Inventory, Order, Delivery, etc.,

## ⛹️‍♀️ Lab - Using JWT Token to secure microservice to microservice communication

### What is JWT?
- JSON Web Token (JWT)
- JWT has 3 parts
  1. Header
  2. Payload
  3. Signature

#### JWT Header 
- indicates the encryption algorithm(HMAC SHA256 or RSA) used and type of token
- Looks as shown below . 
<pre>
  {
    "alg": "SHA256",
    "typ": "JWT"
  }
</pre>

#### JWT Payload
- payload is the data
- user credentials, etc,

#### Signature
- the signature is created by signing the encoded header and encoded payload with a secret key using the algorithm mentioned in the header


### Invoking the JWT authenticated endpoint supported by Hello Microservice
```
cd ~/java-microservices-oct-2022
git pull
cd Day5/jwt/hello
mvn clean package spring-boot:run
```

From a different terminal try this

Get the bearer token
```
curl -H "Content-Type: application/json" -X POST -d '{"username": "tektutor","password":"password"}' http://localhost:8080/authenticate
```

Now use that bearer token to 
```
curl -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWt0dXRvciIsImV4cCI6MTY2NTc1OTM4OSwiaWF0IjoxNjY1NzQxMzg5fQ.iOlqFUnHfhRO7cUjRVMVaw8zSzfrJp2oeWKhmRscoou__di1lsX4n6O3CWj0FKaUXOM34vky9zqjwOOhQYE0-Q" http://localhost:8080/hello
```

Expected output
<pre>
Hello World
</pre>
