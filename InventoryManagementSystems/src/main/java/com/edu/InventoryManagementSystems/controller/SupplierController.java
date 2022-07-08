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
    SupplierService supplierService;

    //RequestBody
    public SupplierController(SupplierService supplierService) {
        super();
        this.supplierService = supplierService;
    }
    //Supplier Supplier = new Supplier("","")
    @PostMapping
    public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier Supplier) {
        return new ResponseEntity<Supplier>(supplierService.saveSupplier(Supplier), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Supplier> getSupplierList() {
        return supplierService.getSupplierList();
    }
    //api/Supplier/id
    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable("id") long id) {
        return supplierService.getSupplierById(id);
    }
    @PutMapping("/{id}")
    public Supplier updateSupplier(@PathVariable("id") long id,@RequestBody Supplier Supplier) {
        return supplierService.updateSupplier(id,Supplier);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteSupplier(@PathVariable("id") long id) {
        return new ResponseEntity<String>(supplierService.deleteSupplier(id),HttpStatus.OK);
    }
    @GetMapping("/GetSupplierByName/{supplierName}")
    public List<Supplier> getSupplierByName(@PathVariable("supplierName") String supplierName) {
        return supplierService.getSupplierByName(supplierName);
    }
    @GetMapping("/GetSupplierByEmail/{supplierEmail}")
    public Supplier getSupplierByEmail(@PathVariable("supplierEmail") String supplierEmail) {
        return supplierService.getSupplierByEmail(supplierEmail);
    }
    @GetMapping("/GetSupplierByContactNo/{supplierContactNo}")
    public Supplier getSupplierByContactNo(@PathVariable("supplierContactNo") String supplierContactNo) {
        return supplierService.getSupplierByContactNo(supplierContactNo);
    }

}
 