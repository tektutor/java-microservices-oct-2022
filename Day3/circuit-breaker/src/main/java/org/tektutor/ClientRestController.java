package org.tektutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/")
	public String invoker() {
		return clientService.callMicroservice();
	}	
}