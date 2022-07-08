package com.edu.InventoryManagementSystems.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Entity(name="purchaseTbl")
public class Purchase  {
     
	@Id 
	@GeneratedValue(generator="seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "seq", initialValue=101)
	private long id;
	private long purchaseId;
	private Date date;
	@NotBlank
	(message="Product Name maintion")
	private String productName;
	@NotBlank(message="Quantity is Mandatory")
	private String quantity;
	private double unitPrice;
	private double totalCost;
	
	@ManyToOne(fetch=FetchType.LAZY)
	 @JsonIgnoreProperties("purchase")	
	 private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	public Purchase(long id, long purchaseId, Date date,
			@NotBlank(message = "Product Name maintion") String productName,
			@NotBlank(message = "Quantity is Mandatory") String quantity, double unitPrice, double totalCost,
			Customer customer) {
		super();
		this.id = id;
		this.purchaseId = purchaseId;
		this.date = date;
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalCost = totalCost;
		this.customer = customer;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", purchaseId=" + purchaseId + ", date=" + date + ", productName=" + productName
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalCost=" + totalCost + ", customer="
				+ customer + "]";
	}
	
}
