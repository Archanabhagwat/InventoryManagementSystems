

package com.edu.InventoryManagementSystems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.InventoryManagementSystems.entity.Supplier;
import com.edu.InventoryManagementSystems.service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

	@Autowired
	SupplierService supplierService; //create object of service class
	
	@GetMapping
	public List<Supplier> getSupplierList(){
		return supplierService.getSupplierList();
	}
	@PostMapping
	public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier supplier) {
	return new  ResponseEntity<Supplier>(supplierService.saveSupplier(supplier),HttpStatus.CREATED);
	
	}
	@GetMapping("/{id}")
	public Supplier getSupplier(@PathVariable("id")long id) {
		return supplierService.getSupplierById(id);
	}
	@PutMapping("/{id}")
	public Supplier updateSupplier(@PathVariable("id")long id,@RequestBody Supplier supplier ) {
		return supplierService.updateSupplier(id,supplier);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteSupplier(@PathVariable("id")long id) {
		return new ResponseEntity<String>(supplierService.deleteSupplier(id),HttpStatus.OK);
	}
	@GetMapping("/{Name}")
	public List<Supplier> getSupplierByName(@PathVariable("Name")String Name){
		return supplierService.getSupplierByName(Name);
	}

	
}