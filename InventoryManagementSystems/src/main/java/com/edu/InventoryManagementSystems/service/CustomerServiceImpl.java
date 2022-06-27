package com.edu.InventoryManagementSystems.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.edu.InventoryManagementSystems.entity.Customer;
import com.edu.InventoryManagementSystems.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static Log log = LogFactory.getLog(CustomerServiceImpl.class);

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public boolean saveUpdateCustomer(Customer request) {
        Customer customer;
        
        if(customerRepository.countAllByFirstName(request.getFirstName())>0){
            log.error("First name already exists");
            return false;
        }
        
        if (request.getId() == null || request.getId() == 0) {
            customer = new Customer();
            customer.setFirstName(request.getFirstName());
            customer.setLastName(request.getLastName());
            customer.setMobileNumber(request.getMobileNumber());
            customer.setGender(request.getGender());
            customer.setPermanentAddress(request.getPermanentAddress());
            customer.setPresentAddress(request.getPresentAddress());
        } else {
            customer = request;
        }
        customerRepository.save(customer);
        return true;
    }

    @Override
    public List<Customer> fetchAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findCustomerByMobileNumber(String mobileNumber) {
        return customerRepository.findAllByMobileNumber(mobileNumber);
    }

}