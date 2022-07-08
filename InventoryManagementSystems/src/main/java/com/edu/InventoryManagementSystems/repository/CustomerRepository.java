package com.edu.InventoryManagementSystems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edu.InventoryManagementSystems.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	
	@Query(value = "select * from customer_tbl c where c.first_name= :firstName", nativeQuery = true)
	List<Customer> getCustomerByFirstName(@Param("firstName")String firstName);
	
	@Query(value ="select * from customer_tbl c where c.first_name= :firstName and c.last_name= :lastName", nativeQuery = true)
	List<Customer> getCustomerByFullName(@Param("firstName")String firstName,@Param("lastName")String lastName);
	@Query(value ="select * from customer_tbl c where c.email= :email", nativeQuery = true)
	Customer getCustomerByEmail(String email);
	@Query(value ="select * from customer_tbl c where c.last_name= :lastName", nativeQuery = true)
	List<Customer> getCustomerByLastName(String lastName);

	@Query(value ="select * from customer_tbl c where c.contact_no= :contactNo", nativeQuery = true)
	Customer getCustomerByContactNo(String contactNo);
}
