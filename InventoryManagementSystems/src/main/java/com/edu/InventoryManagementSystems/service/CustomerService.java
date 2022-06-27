package com.edu.InventoryManagementSystems.service;

import java.util.List;

import com.edu.InventoryManagementSystems.entity.Customer;

public interface CustomerService {

	boolean saveUpdateCustomer(Customer request);

	List<Customer> fetchAllCustomer();

	List<Customer> findCustomerByMobileNumber(String mobileNumber);

}