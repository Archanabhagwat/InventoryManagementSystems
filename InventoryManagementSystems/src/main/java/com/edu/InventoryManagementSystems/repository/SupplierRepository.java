package com.edu.InventoryManagementSystems.repository;

import com.edu.InventoryManagementSystems.entity.Product;
import com.edu.InventoryManagementSystems.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List; 

public interface SupplierRepository extends JpaRepository<Supplier,Long> {

    @Query(value ="select * from supplier_tbl c where c.supplier_name= :supplierName", nativeQuery = true)
    List<Supplier> getSupplierByName(@Param("supplierName")String supplierName);

    @Query(value ="select * from supplier_tbl c where c.supplier_email= :supplierEmail", nativeQuery = true)
    Supplier getSupplierByEmail(String supplierEmail);

    @Query(value ="select * from supplier_tbl c where c.last_name= :lastName", nativeQuery = true)
    List<Supplier> getSupplierByLastName(String lastName);

    @Query(value ="select * from supplier_tbl c where c.supplier_contact_no= :supplierContactNo", nativeQuery = true)
    Supplier getSupplierByContactNo(String supplierContactNo);

}
