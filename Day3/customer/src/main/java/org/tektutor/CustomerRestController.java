package org.tektutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(
			value="/api/v1/customer", 
			method=RequestMethod.GET
	)
	@ResponseBody	
	public List<Customer> getAllCustomers() throws Exception {
		
		List<Customer> list = customerRepository.getAllCustomers();
		return list;
	}
	
	@RequestMapping(
			value="/api/v1/customer/{customerId}", 
			method=RequestMethod.GET 
	)
	@ResponseBody
	public Customer getCustomerById(@PathVariable("customerId")int customerId) 
		throws Exception
	{
		return customerRepository.getCustomerById(customerId);
	}
	
}