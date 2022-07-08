package com.edu.InventoryManagementSystems.service;

import com.edu.InventoryManagementSystems.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getProductList();

    Product getProductById(long id);

    Product updateProduct(long id, Product product);

    String deleteProduct(long id);

    List<Product> getProductByName(String productName);
}
