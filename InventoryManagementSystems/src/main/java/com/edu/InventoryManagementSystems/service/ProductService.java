package com.edu.InventoryManagementSystems.service;

import java.util.List;

import com.edu.InventoryManagementSystems.entity.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> saveProducts(List<Product> products);

	List<Product> getProducts();

	Product getProductById(int id);

	Product getProductByName(String name);

	Product updateProduct(Product product);

	String deleteProduct(int id);

}