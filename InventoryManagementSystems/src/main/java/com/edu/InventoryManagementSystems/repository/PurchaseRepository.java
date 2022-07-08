package com.edu.InventoryManagementSystems.repository;

import java.util.Date;
import java.util.List;

import com.edu.InventoryManagementSystems.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface PurchaseRepository extends JpaRepository<Purchase,Long>{

	List<Purchase> findByPurchaseId(long purchaseId);

	List<Purchase> findByProductName(String productName);

	List<Purchase> findByTotalCost(double totalCost);

	List<Purchase> findByDate(Date date);

}
