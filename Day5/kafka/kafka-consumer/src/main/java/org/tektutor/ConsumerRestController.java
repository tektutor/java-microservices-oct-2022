package org.tektutor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableKafka
public class ConsumerRestController {

	private List<String> messages = new ArrayList<String>();
	
	@GetMapping("/receive")
	public List<String> receive() {
		return messages;
	}
	
	@KafkaListener(topics="tektutor", groupId="tektutor")
	public String listenWithHeaders( @Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition ) {
		messages.add(message);
		return "Received => " + message;
	}
	
}
