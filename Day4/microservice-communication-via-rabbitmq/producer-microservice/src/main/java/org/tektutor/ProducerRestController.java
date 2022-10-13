package org.tektutor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@RestController
public class ProducerRestController {
	private final static String QUEUE_NAME = "TEKTUTOR_QUEUE";
	private String response;
	
	@GetMapping("/send/{message}")
	public String sendMessage(@PathVariable("message") String message) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.17.0.3");
        try (Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            response = " [x] Sent '" + message + "'";
            System.out.println(response);
        }
        return response;
    }
}
