package com.edu.InventoryManagementSystems.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.edu.InventoryManagementSystems.entity.Purchase;
import com.edu.InventoryManagementSystems.exception.ResourceNotFoundException;
import com.edu.InventoryManagementSystems.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	PurchaseRepository purchaseRepository;

	@Override
	public Purchase savePurchase(Purchase purchase) {
		return null;
	}

	@Override
	public List<Purchase> getPurchaseList() {
		List<Purchase> purchases = purchaseRepository.findAll();

		if(purchases.isEmpty())
			throw new ResourceNotFoundException("Purchase","",purchases);
		else
			return purchases;
	}

	@Override
	public Purchase getPurchaseById(long id) {
		Optional<Purchase> purchase = purchaseRepository.findById(id);
		if(purchase.isPresent())
			return purchase.get();
		else
		    throw new ResourceNotFoundException("Purchase","id",id);
	}

	@Override
	public Purchase updatePurchaseById(long id, Purchase purchase) {
		Purchase pur = new Purchase();
		pur = purchaseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Purchase","id",id));
		
		pur.setPurchaseId(purchase.getPurchaseId());
		pur.setDate(purchase.getDate());
		pur.setProductName(purchase.getProductName());
		pur.setQuantity(purchase.getQuantity());
		pur.setUnitPrice(purchase.getUnitPrice());
		pur.setTotalCost(purchase.getTotalCost());
		
		purchaseRepository.save(pur);
		return pur;
	}

	@Override
	public String deletePurchaseById(long id) {
		Purchase purchase = new Purchase();
		purchase = purchaseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Purchase","id",id));
		purchaseRepository.delete(purchase);
		return "Record Deleted Sucsessfully";
	}

	@Override
	public List<Purchase> getByPurchaseId(long purchaseId) {
		List<Purchase> purchase = purchaseRepository.findByPurchaseId(purchaseId);
		if(purchase.isEmpty())
			throw new ResourceNotFoundException("Purchase","id",purchase);
		else
			return purchase;
	} 

	@Override
	public List<Purchase> getByProductName(String productName) {
		List<Purchase> purchase = purchaseRepository.findByProductName(productName);
		if(purchase.isEmpty())
			throw new ResourceNotFoundException("Purchase","id",purchase);
		else
			return purchase;
	}

	@Override
	public List<Purchase> getByTotalCost(double totalCost) {
		List<Purchase> purchase = purchaseRepository.findByTotalCost(totalCost);
		if(purchase.isEmpty())
			throw new ResourceNotFoundException("Purchase","totalCost",totalCost);
		else
			return purchase;
	}

	@Override
	public List<Purchase> getByDate(Date date) {
		List<Purchase> purchase= purchaseRepository.findByDate(date);
		if(purchase.isEmpty())
			throw new ResourceNotFoundException("Purchase","date",date);
		else
			return purchase;
	}

}
