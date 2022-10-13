package org.tektutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
@SpringBootApplication
public class EurekaDiscoveryClientApplication {
	@Autowired
	private EurekaClient discoveryClient;	

	@GetMapping("/products")
	public String getProductCatalog() {
	    InstanceInfo instance = discoveryClient.getNextServerFromEureka("product_catalog", false);
	    String productMicroserviceUrl = instance.getHomePageUrl();
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(productMicroserviceUrl, String.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryClientApplication.class, args);
	}

}