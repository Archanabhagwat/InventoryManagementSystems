package com.edu.InventoryManagementSystems.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer {
@Id
  private Long id;
  private String firstName;
  private String lastName;
  private String mobileNumber;
  private String presentAddress;
  private String permanentAddress;
  private String gender;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getPresentAddress() {
	return presentAddress;
}
public void setPresentAddress(String presentAddress) {
	this.presentAddress = presentAddress;
}
public String getPermanentAddress() {
	return permanentAddress;
}
public void setPermanentAddress(String permanentAddress) {
	this.permanentAddress = permanentAddress;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Customer(Long id, String firstName, String lastName, String mobileNumber, String presentAddress,
		String permanentAddress, String gender) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNumber = mobileNumber;
	this.presentAddress = presentAddress;
	this.permanentAddress = permanentAddress;
	this.gender = gender;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
			+ mobileNumber + ", presentAddress=" + presentAddress + ", permanentAddress=" + permanentAddress
			+ ", gender=" + gender + "]";
}
}