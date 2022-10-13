package org.tektutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Customer> getAllCustomers() {
		List<Customer> list = customerRepository.getAllCustomers();
		return list;
	}
	
	@RequestMapping(
			value="/api/v1/customer/{customerId}", 
			method=RequestMethod.GET 
	)
	@ResponseBody
	public Customer getCustomerById(@PathVariable("customerId")int customerId) 
	{
		return customerRepository.getCustomerById(customerId);
	}

	@RequestMapping(
			value="/api/v1/customer/register", 
			method=RequestMethod.POST 
	)
	
	public void addCustomer( @RequestBody Customer customer ) {
		customerRepository.save(customer);
	}
	
	@RequestMapping(
			value="/api/v1/customer/update", 
			method=RequestMethod.PUT 
	)
	public void updateCustomer( Customer customer ) {		
		customerRepository.update(
				customer.getId(), 
				customer.getFirstname(), 
				customer.getLastname(), 
				customer.getEmail()
		);
	}

	@RequestMapping(
			value="/api/v1/customer/delete/{customerId}", 
			method=RequestMethod.DELETE 
	)
	public void deleteCustomer(@PathVariable("customerId")int customerId ) {
		customerRepository.deleteById(customerId);
	}
	
}