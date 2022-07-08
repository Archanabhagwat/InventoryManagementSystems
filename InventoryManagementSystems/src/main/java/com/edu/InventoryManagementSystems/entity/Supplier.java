package com.edu.InventoryManagementSystems.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity(name="supplierTbl")
public class Supplier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String supplierId;
    private String supplierName;
    private String supplierEmail;
    private String supplierContactNo;
    private String supplierAddress;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> productList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierContactNo() {
        return supplierContactNo;
    }

    public void setSupplierContactNo(String supplierContactNo) {
        this.supplierContactNo = supplierContactNo;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Supplier(long id, String supplierId, String supplierName, String supplierEmail, String supplierContactNo, String supplierAddress, List<Product> productList) {
        this.id = id;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierContactNo = supplierContactNo;
        this.supplierAddress = supplierAddress;
        this.productList = productList;
    }

    public Supplier() {
        super();
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                ", supplierContactNo='" + supplierContactNo + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", productList=" + productList +
                '}';
    }
}
