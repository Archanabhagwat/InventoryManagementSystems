package com.edu.InventoryManagementSystems.service;

import com.edu.InventoryManagementSystems.entity.Product;
import com.edu.InventoryManagementSystems.exception.ResourceNotFoundException;
import com.edu.InventoryManagementSystems.repository.ProductRepository;
import org.springframework.stereotype.Service;
 
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product) {
        // TODO Auto-generated method stub
        return productRepository.save(product);
    }
    @Override
    public List<Product> getProductList() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) { //101
        Product product = new Product();
        product = productRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Product","id",id));
        return product;
    }
    @Override
    public Product updateProduct(long id, Product product) { //id=101
        Product prod = new Product();
        prod = productRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Customer","id",id));
        prod.setProductName(product.getProductName());
        prod.setPrice(product.getPrice());
        prod.setQuantity(product.getQuantity());
        productRepository.save(prod);
        return prod;
    }
    @Override
    public String deleteProduct(long id) {
        Product product = new Product();
        product = productRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Product","id",id));
        productRepository.deleteById(id);
        return "Record is deleted successfully";
    }
    @Override
    public List<Product> getProductByName(String productName) {
        return productRepository.getProductByName(productName) ;
    }
}
