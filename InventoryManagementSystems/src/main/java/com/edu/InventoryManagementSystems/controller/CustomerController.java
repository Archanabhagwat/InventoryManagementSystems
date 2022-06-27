 

package com.edu.InventoryManagementSystems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.InventoryManagementSystems.entity.Customer;
import com.edu.InventoryManagementSystems.service.CustomerService;

@RestController
@RequestMapping("/customer")
//@Api(tags = {"CustomerController"})
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value = "/saveCustomer")
    public ResponseEntity<String> saveCustomer(HttpServletRequest requestHeader, @RequestBody Customer request) throws RuntimeException {

        if (customerService.saveUpdateCustomer(request)) {
            return new ResponseEntity<>("Customer Save/update Done", HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Customer Save/update failed", HttpStatus.OK);
        }
    }

    @GetMapping(value = "/fetchAllCustomer")
    public ResponseEntity<List<Customer>> fetchAllCustomer() throws RuntimeException {
        return new ResponseEntity<>(customerService.fetchAllCustomer(), HttpStatus.OK);
    }
}