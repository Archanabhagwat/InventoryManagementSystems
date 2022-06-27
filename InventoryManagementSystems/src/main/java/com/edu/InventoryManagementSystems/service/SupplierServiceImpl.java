package com.edu.InventoryManagementSystems.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.InventoryManagementSystems.entity.Supplier;
import com.edu.InventoryManagementSystems.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

    private static Log log = LogFactory.getLog(SupplierServiceImpl.class);
 @Autowired
    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public boolean saveUpdateSupplier(Supplier request) {
    	Supplier supplier;
        
        if(supplierRepository.countAllByName(request.getName())>0){
            log.error("name already exists");
            return false;
        }
        
        if (request.getId() == null || request.getId() == 0) {
        	supplier = new Supplier();
        	
        	supplier.setName(request.getName());
        	supplier.setNumber(request.getNumber());
        	supplier.setStatus(request.getStatus());
        	supplier.setCity(request.getCity());
        	
        } else {
        	supplier = request;
        }
        supplierRepository.save(supplier);
        return true;
    }

    @Override
    public List<Supplier> fetchAllSupplier() {
        return supplierRepository.findAll();
    }

    @Override
    public List<Supplier> findSupplierByNumber(String Number) {
        return supplierRepository.findAllByNumber(Number);
    }

	@Override
	public List<Supplier> getSupplierList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier saveSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier getSupplierById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier updateSupplier(long id, Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSupplier(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getSupplierByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}