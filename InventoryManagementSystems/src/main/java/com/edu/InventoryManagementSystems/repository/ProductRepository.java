package com.edu.InventoryManagementSystems.repository;

import com.edu.InventoryManagementSystems.entity.Customer;
import com.edu.InventoryManagementSystems.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
 
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value ="select * from product_tbl p where p.product_name= :productName", nativeQuery = true)
    List<Product> getProductByName(@Param("productName")String name);

}
