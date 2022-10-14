package org.tektutor;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@EnableFeignClients( basePackages = ["org.tektutor.SayHelloApplication.class"])
@FeignClient(name="SAY-HELLO")
public interface SayHelloInterface {

    @GetMapping("/hi")
    public String hi();

    @GetMapping("/hello")
    public String hello();
    
}
