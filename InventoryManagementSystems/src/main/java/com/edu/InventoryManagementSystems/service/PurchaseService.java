package com.edu.InventoryManagementSystems.service;

import com.edu.InventoryManagementSystems.entity.Purchase;

import java.util.Date;
import java.util.List;

 

public interface PurchaseService {

	Purchase savePurchase(Purchase purchase);

	List<Purchase> getPurchaseList();

	Purchase getPurchaseById(long id);

	Purchase updatePurchaseById(long id, Purchase purchase);

	String deletePurchaseById(long id);

	List<Purchase> getByPurchaseId(long purchaseId);

	List<Purchase> getByProductName(String productName);

	List<Purchase> getByTotalCost(double totalCost);

	List<Purchase> getByDate(Date date);



}
