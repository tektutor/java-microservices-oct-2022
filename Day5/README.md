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
