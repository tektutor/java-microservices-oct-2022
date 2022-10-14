package org.tektutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public String writeLogUsingSleuth() {
        logger.info("Hello Sleuth -logger");
      
        return "Log written using Spring Cloud Sleuth ...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
