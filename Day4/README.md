# Day 4

## Spring Boot vs Spring Cloud

### Spring Boot
- a Java Framework that is used to develop Java based RESTful services and Microservices
- it is developed on top of Spring Framework
- the Spring Framework required loads of manual configuration which was then simplified by Spring boot
- Spring boot framework simplifies configurations based on easy to use annotations

### Spring Cloud
- Spring Boot Framework supports both Spring Boot and Spring Cloud
- Spring Cloud offers
   - Load Balancing
   - Service Discovery
   - Security
   - Event based communication
   - Routing 

## Setting up RabbitMQ as a Docker Container
```
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10-management
```
