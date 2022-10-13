package org.tektutor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

@RestController
public class ConsumerRestController {
	private static final String QUEUE_NAME = "TEKTUTOR_QUEUE";
	private String response;
	private String message;

	@GetMapping("/receive")
	public String receiveMessage() throws Exception {
		
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            response = "Received '" + message + "'";
        };
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
	    return response;
	}
	
}
