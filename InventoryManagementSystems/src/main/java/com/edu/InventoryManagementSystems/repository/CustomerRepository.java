package com.edu.InventoryManagementSystems.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.InventoryManagementSystems.entity.Customer;

@Repository
	public interface CustomerRepository extends CrudRepository<Customer, Long> {
	@Override
    List<Customer> findAll();

    List<Customer> findAllByMobileNumber(String mobileNumber);
    List<Customer> findAllByFirstName(String firstName);
    List<Customer> findAllByLastName(String lastName);

    void deleteById(Long id);
    long countAllByFirstName(String firstName);

   
}