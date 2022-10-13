package org.tektutor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProductApplication {

	private static	List<String> productList = new ArrayList<String>();
	
	static {
		productList.add("TVs");
		productList.add("Washing Machines");
		productList.add("Mobiles");
	}
 
	@GetMapping("/")
	public List<String> getProductCatalog() {
		return productList;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
