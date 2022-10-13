## Microservice Circuit Breaker - Design Pattern
```
cd ~/java-microservices-oct-2022
git pull

cd Day3/circuit-breaker
mvn clean package spring-boot:run
```

Open a terminal and verify if your customer microservice is running
```
curl http://localhost:8080/api/v1/customer
curl http://localhost:8085
```
If your customer microservice is up and running it will return all the customer records it fetched from the mysql db server

Expected output
<pre>
(jegan@tektutor.org)$ <b>curl http://localhost:8080/api/v1/customer</b>
[{"id":0,"firstname":null,"lastname":null,"email":null},{"id":2,"firstname":"Ram","lastname":"Kumar","email":"myemail@some.com"},{"id":3,"firstname":"Nitesh","lastname":"Jeganathan","email":"nitesh@gmail.com"},{"id":4,"firstname":"Sriram","lastname":"Jeganathan","email":"sriram@gmail.com"}]
(jegan@tektutor.org)$ <b>curl http://localhost:8085</b>
[{"id":0,"firstname":null,"lastname":null,"email":null},{"id":2,"firstname":"Ram","lastname":"Kumar","email":"myemail@some.com"},{"id":3,"firstname":"Nitesh","lastname":"Jeganathan","email":"nitesh@gmail.com"},{"id":4,"firstname":"Sriram","lastname":"Jeganathan","email":"sriram@gmail.com"}]
</pre>

Now you may stop the customer microservice and verify if cicuitbreaker is redirecting the call to fallback method
```
curl http://localhost:8085
```
Expected output
<pre>
(jegan@tektutor.org)$ <b>curl http://localhost:8085</b>
Fallback method invoked ...
</pre>
