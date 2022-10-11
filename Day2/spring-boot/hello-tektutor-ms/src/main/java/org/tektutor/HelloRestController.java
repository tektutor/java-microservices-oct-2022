package org.tektutor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	private HelloService helloService = new HelloService();
	private GreetingService greetingService = new GreetingService();
	
	@GetMapping("/hello")
	public String sayHello() {
		return helloService.sayHello();
	}

	@GetMapping("/greeting")
	public String greet() {
		return greetingService.greet();
	}
	
}
