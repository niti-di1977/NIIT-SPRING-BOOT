package com.gl.CustomerApi.service;
import java.util.List;

import com.gl.CustomerApi.entities.CustomerEntity;

public interface CustomerService 
{
	public CustomerEntity addCust(CustomerEntity cust);
	public CustomerEntity getCust(int customerId);
	public CustomerEntity updateCust(int custId, CustomerEntity cust);
	public String deleteCust(int customerId);
	public List<CustomerEntity> getAllCusts();
	

}
