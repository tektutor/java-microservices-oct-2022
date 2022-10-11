package org.tektutor.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "<h1>Hello SpringBoot Microservice !</h1>";
	}
}