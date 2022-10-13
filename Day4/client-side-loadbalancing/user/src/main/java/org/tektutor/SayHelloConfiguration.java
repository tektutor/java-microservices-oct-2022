package org.tektutor;

import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class SayHelloConfiguration {
    
    ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new DemoServiceInstanceListSupplier("say-hello");
    }

}

class DemoServiceInstanceListSupplier implements ServiceInstanceListSupplier {
    private final String serviceId;

    DemoServiceInstanceListSupplier ( String serviceId ) {
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public Flux<List<ServiceInstance>> get() {
        return Flux.just( Arrays.asList( 
           new DefaultServiceInstance( serviceId + "1", serviceId, "localhost", 8090, false),
           new DefaultServiceInstance( serviceId + "2", serviceId, "localhost", 9092, false),
           new DefaultServiceInstance( serviceId + "3", serviceId, "localhost", 9092, false) 
        ));
    }
}
