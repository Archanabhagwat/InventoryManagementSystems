package com.edu.InventoryManagementSystems.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity(name="customerTbl")
public class Customer {
	 

	public static final String HttpStatus = null;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String custId;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;
	private String address;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Product> productList;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return  address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(long id, String custId, String firstName, String lastName, String email, String contactNo, String address, List<Product> productList) {
		this.id = id;
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.productList = productList;
	}

	public Customer() {
		super();  
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", custId='" + custId + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", contactNo='" + contactNo + '\'' +
				", address='" + address + '\'' +
				", productList=" + productList +
				'}';
	}


	/*public String getAddress1() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
}
