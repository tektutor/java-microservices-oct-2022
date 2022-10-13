package org.tektutor;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class AMQPRestController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send/{message}")
    public String sendAndReceiveMessage(@PathVariable String message) {
       System.out.println ( "Sending message ...");
       rabbitTemplate.convertAndSend(App.topicExchangeName, "message.received", message);
       return LocalDateTime.now() + " ==>  Message Sent successfully !";
    }
}
