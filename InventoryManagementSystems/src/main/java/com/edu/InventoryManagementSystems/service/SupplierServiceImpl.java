package com.edu.InventoryManagementSystems.service;

import com.edu.InventoryManagementSystems.entity.Supplier;
import com.edu.InventoryManagementSystems.exception.ResourceNotFoundException;
import com.edu.InventoryManagementSystems.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        super();
        this.supplierRepository = supplierRepository;
    }
    @Override
    public Supplier saveSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return supplierRepository.save(supplier);
    }
    @Override
    public List<Supplier> getSupplierList() {
        // TODO Auto-generated method stub
        return supplierRepository.findAll();
    }

    @Override
    public Supplier getSupplierById(long id) { //101
        Supplier Supplier = new Supplier();
        Supplier = supplierRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Supplier","id",id));
        return Supplier;
    }
    @Override
    public Supplier updateSupplier(long id, Supplier supplier) { //id=101
        Supplier supp = new Supplier();
        supp = supplierRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("supplier","id",id));
        supp.setSupplierName(supplier.getSupplierName());
        supp.setSupplierEmail(supplier.getSupplierEmail());
        supp.setSupplierContactNo(supplier.getSupplierContactNo());
        supp.setSupplierAddress(supplier.getSupplierAddress());
        supplierRepository.save(supp);
        return supp;
    }
    @Override
    public String deleteSupplier(long id) {
        Supplier supplier = new Supplier();
        supplier = supplierRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Supplier","id",id));
        supplierRepository.deleteById(id);
        return "Record is deleted successfully";
    }
    @Override
    public List<Supplier> getSupplierByName(String supplierName) {
        return supplierRepository.getSupplierByName(supplierName) ;
    }

    @Override
    public Supplier getSupplierByEmail(String email) {
        // TODO Auto-generated method stub
        return supplierRepository.getSupplierByEmail(email);
    }

    @Override
    public Supplier getSupplierByContactNo(String contactNo) {
        // TODO Auto-generated method stub
        return supplierRepository.getSupplierByContactNo(contactNo);
    }
}
