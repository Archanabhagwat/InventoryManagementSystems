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

import com.edu.InventoryManagementSystems.entity.Product;
import com.edu.InventoryManagementSystems.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }
    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Product> getProductList() {
        return productService.getProductList();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long id,@RequestBody Product product) {
        return productService.updateProduct(id,product);
    }  

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id") long id) {
        return new ResponseEntity<String>(productService.deleteProduct(id),HttpStatus.OK);
    }

    @GetMapping("/GetByfirstName/(productName)")
    public List<Product> getProductByName(@PathVariable("productName") String productName) {
        return productService.getProductByName(productName);
    }
}
