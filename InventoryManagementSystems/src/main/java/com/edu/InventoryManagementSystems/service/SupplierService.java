package com.edu.InventoryManagementSystems.service;

import com.edu.InventoryManagementSystems.entity.Supplier;
import java.util.List;

public interface SupplierService {
    Supplier saveSupplier(Supplier supplier);
 
    List<Supplier> getSupplierList();

    Supplier getSupplierById(long id);

    Supplier updateSupplier(long id, Supplier supplier);

    String deleteSupplier(long id);

    List<Supplier> getSupplierByName(String supplierName);

    Supplier getSupplierByEmail(String email);

    Supplier getSupplierByContactNo(String contactNo);
}
