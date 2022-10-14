package org.tektutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RestController
@SpringBootApplication
//@EnableEurekaClient
public class SayHelloApplication {

    private static Logger log = LoggerFactory.getLogger( SayHelloApplication.class );

    public static void main ( String[] args ) {
        SpringApplication.run(SayHelloApplication.class, args);
    }

    @GetMapping("/greeting")
    public String greet() {
        log.info("/greeting RESTful endpoint invoked ...");
        return "Say Hello";
    }
 
    @GetMapping("/")
    public String home() {
        return "Hi there!";
    }

}
