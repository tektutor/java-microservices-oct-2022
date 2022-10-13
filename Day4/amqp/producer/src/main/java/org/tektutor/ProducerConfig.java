package org.tektutor;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProducerConfig {

	@Bean
	public Queue hello() {
		return new Queue("hello");
	}

	@Bean
	public Producer producer() {
		return new Producer();
	}

}
