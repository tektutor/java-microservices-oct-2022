package org.tektutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerRestController {
	
	@Autowired
	private KafkaTemplate<String,String> kakfaTemplate;
	
	@GetMapping("/send/{message}")
	public void sendMessage(@PathVariable(name="message") String message ) {
		ListenableFuture<SendResult<String,String>> future = kakfaTemplate.send("tektutor", message);
		
		future.addCallback(new ListenableFutureCallback<SendResult<String,String>>() {

			@Override
			public void onSuccess(SendResult<String, String> result) {
					System.out.println("Sent message");
				
			}

			@Override
			public void onFailure(Throwable ex) {
				System.out.println("Unable to send message");
			}
			
		} );
	}
}