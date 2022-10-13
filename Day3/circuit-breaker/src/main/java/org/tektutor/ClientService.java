package org.tektutor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class ClientService {

	@Retry(name="unstableMicroservice",fallbackMethod = "fallbackMethod")
	public String callMicroservice() {
		System.out.println(LocalDateTime.now() + " - about to call Microservice ...");
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8080/api/v1/customer", String.class);
	}
	
	public String fallbackMethod(Exception e) {
		System.out.println(LocalDateTime.now() + " - fallbackMethod ...");
		return "Fallback method invoked ...";
	}
}
