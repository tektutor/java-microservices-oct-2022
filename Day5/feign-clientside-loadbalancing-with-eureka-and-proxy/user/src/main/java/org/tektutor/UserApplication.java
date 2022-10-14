package org.tektutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableFeignClients
public class UserApplication {

	@Autowired
	private SayHelloInterface sayHelloFeignInterface;
	
    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue="Feign<->Eureka Magic !") String name) {
    	return sayHelloFeignInterface.hi();
    }

    @RequestMapping("/hello")
    public String hello( @RequestParam(value = "name", defaultValue = "Feign is amazing") String name) {
    	return sayHelloFeignInterface.hello();
    }

    public static void main ( String[] args ) {
        SpringApplication.run ( UserApplication.class, args );
    }

}