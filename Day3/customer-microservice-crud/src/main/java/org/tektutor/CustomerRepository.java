package org.tektutor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	@Query(value="SELECT * FROM tektutor.customer", nativeQuery=true)
	public List<Customer> getAllCustomers();
	
	@Query(value="SELECT * FROM tektutor.customer WHERE id=:customerId", nativeQuery=true)
	public Customer getCustomerById(@Param("customerId") int customerId);
	
	@Query(
		value="UPDATE tektutor.customer SET firstname=:fname, lastname=:lname, email=:email WHERE id=:customerId", 
		nativeQuery=true
	)
	@Modifying
	public void update
	(
			@Param("customerId") int customerId, 
			@Param("fname") String firstname, 
			@Param("lname") String lastname,
			@Param("email") String email
	);
}
