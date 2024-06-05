package com.gl.CustomerApi.service;

import java.util.List;

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

	@Override
	public CustomerEntity updateCust(int custId,CustomerEntity cust) {
	
		if(dao.findById(custId).get()!=null){
			
		return dao.save(cust);
		}
		else
			return null;
		
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
