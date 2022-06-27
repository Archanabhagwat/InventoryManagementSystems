package com.edu.InventoryManagementSystems.service;

import java.util.List;

import com.edu.InventoryManagementSystems.entity.Supplier;

public interface SupplierService {

	List<Supplier> getSupplierList();

	Supplier saveSupplier(Supplier supplier);

	Supplier getSupplierById(long id);

	Supplier updateSupplier(long id, Supplier supplier);

	String deleteSupplier(long id);

	List<Supplier> getSupplierByName(String name);

	boolean saveUpdateSupplier(Supplier request);

	List<Supplier> fetchAllSupplier();

	List<Supplier> findSupplierByNumber(String Number);

}