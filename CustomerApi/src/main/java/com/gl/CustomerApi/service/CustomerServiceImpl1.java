package com.gl.CustomerApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.CustomerApi.dao.CustomerDao;
import com.gl.CustomerApi.entities.CustomerEntity;

@Service
public class CustomerServiceImpl1 implements CustomerService{

	@Autowired
	CustomerDao dao;
	
	@Override
	public CustomerEntity addCust(CustomerEntity cust) {
		
		return dao.save(cust);
	}

	@Override
	public CustomerEntity getCust(int customerId) {
		
		CustomerEntity custEnt=null;
		if(dao.findById(customerId).isPresent());
		{
			try {
				custEnt=dao.findById(customerId).get();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return custEnt;
	}


	
	public CustomerEntity updateCust(int id, CustomerEntity cust) {
        Optional<CustomerEntity> optionalCustomer = dao.findById(id);
        
        if (optionalCustomer.isPresent()) {
            CustomerEntity existingCustomer = optionalCustomer.get();
            existingCustomer.setEmailId(cust.getEmailId());
            existingCustomer.setName(cust.getName());
            
            // Save the updated customer
            return dao.save(existingCustomer);
        } else {
            return null;
        }
	}

	@Override
	public String deleteCust(int customerId) {
		
		if(dao.findById(customerId).get()!=null) {
		dao.deleteById(customerId);
		return "deleted successfully";
		}
		else
		return "resource doesnt exist";
					
	}

	@Override
	public List<CustomerEntity> getAllCusts() {
		
		return  (List<CustomerEntity>) dao.findAll();
	}

}
