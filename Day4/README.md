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

In the above the port 5672 is used by microservices while exchanging message on the RabbitMQ Server. The 15672 port is used for Administration purpose,where the Administrator can view and manage the queues and the overall RabbitMQ via a Web based Dashboard @ Port 15672.  

The default credentials to login to RabbitMQ is given below
<pre>
hostname - can be either your localhost or the rabbitmq container ip
username - guest
password - guest
</pre>

## Starting the Producer Microservice that sends message to the RabbitMQ queue
