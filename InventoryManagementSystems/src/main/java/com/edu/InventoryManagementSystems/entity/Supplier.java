package com.edu.InventoryManagementSystems.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLIER_TBL")
public class Supplier {
	@Id
	private long id;
	private String number;
    private String name;
    private int status;
    private String city;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Supplier(Long id, String number, String name, int status, String city) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.status = status;
		this.city = city;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", number=" + number + ", name=" + name + ", status=" + status + ", city=" + city
				+ "]";
	}

}