package com.edu.InventoryManagementSystems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.InventoryManagementSystems.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier,Long>{

	int countAllByName(String name);

	
	List<Supplier> findAll();

	List<Supplier> findAllByNumber(String number);

}