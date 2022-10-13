# Day 4

## Setting up RabbitMQ as a Docker Container
```
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10-management
```

## Setting up Apache Active MQ (AMQ)

Download ActiveMQ Artemis apache-artemis-2.26.0-bin.tar.gz from the below URL
<pre>
https://activemq.apache.org/components/artemis/download/
</pre>

Extract the tar ball
```
cd ~/Downloads
tar xvfz apache-artemis-2.26.0-bin.tar.gz
cd apache-artemis-2.26.0
```

