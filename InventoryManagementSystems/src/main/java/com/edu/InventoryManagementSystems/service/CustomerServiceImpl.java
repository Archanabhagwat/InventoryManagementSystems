package com.edu.InventoryManagementSystems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.InventoryManagementSystems.entity.Customer; 
import com.edu.InventoryManagementSystems.exception.ResourceNotFoundException;
import com.edu.InventoryManagementSystems.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	CustomerRepository customerrepository;
	
	public CustomerServiceImpl(CustomerRepository customerrepository) {
		super();
		this.customerrepository = customerrepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepository.save(customer);
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return customerrepository.findAll();
	}

	@Override
	public Customer getCustomerById(long id) { //101
		//throw            throws
	//	Customer customer ;//= new Customer();
		Customer customer = customerrepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Customer","id",id));
		return customer;
	}

	@Override
	public Customer updateCustomer(long id, Customer customer) { //id=101
		Customer cust = new Customer();
		cust = customerrepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Customer","id",id));
		cust.setFirstName(customer.getFirstName());
		cust.setLastName(customer.getLastName());
		cust.setEmail(customer.getEmail());
		cust.setContactNo(customer.getContactNo());
		cust.setAddress(customer.getAddress());
		customerrepository.save(cust);
		return cust;
	}

	@Override
	public String deleteCustomer(long id) {
		Customer customer = new Customer();
		customer = customerrepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Customer","id",id));
		customerrepository.deleteById(id);
		return "Record is deleted successfully";
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		return customerrepository.getCustomerByFirstName(firstName) ;
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		// TODO Auto-generated method stub
		return customerrepository.getCustomerByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomerByFullName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return customerrepository.getCustomerByFullName(firstName,lastName);
	}
	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return customerrepository.getCustomerByEmail(email);
	}
	@Override
	public Customer getCustomerByContactNo(String contactNo) {
		// TODO Auto-generated method stub
		return customerrepository.getCustomerByContactNo(contactNo);
	}
}
