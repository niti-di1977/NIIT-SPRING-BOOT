package com.gl.CustomerApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.CustomerApi.entities.CustomerEntity;
import com.gl.CustomerApi.service.CustomerService;

@RestController// combo of controller+responsebody
@RequestMapping("/gl.com")
public class CustomerController 
{
	@Autowired
	CustomerService service;
	 
	@PostMapping("/addCustomer")
	public ResponseEntity<CustomerEntity> addCust(@RequestBody CustomerEntity cust)
	{	
	  CustomerEntity custEnt=	service.addCust(cust);
	  return new ResponseEntity<CustomerEntity>(custEnt,HttpStatus.CREATED);
	  
	}
	@GetMapping("/customer/{id}")
	public ResponseEntity getCust(@PathVariable(name="id") int customerId)
	{
		ResponseEntity responseEntity= null;
		
		if(service.getCust(customerId)!=null) {
			CustomerEntity custEnt=service.getCust(customerId);
			responseEntity = new ResponseEntity<>(custEnt,HttpStatus.OK);


		}
		else {
			responseEntity=  new ResponseEntity<>("cust not found",HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	@GetMapping("/customers")
	public List<CustomerEntity> getAllCust()
	{
		
		return service.getAllCusts();	
	}
	
	@PutMapping("/updateCustomer/{id}")
	public CustomerEntity updateCust(@PathVariable(name="id") int id,@RequestBody CustomerEntity cust)
	{
		return service.updateCust(id,cust);	
	}
	
	@DeleteMapping("/deleteMapping/{id}")
	public String deleteCust(@PathVariable(name="id") int customerId)
	{
		
		return service.deleteCust(customerId);	
	}

}
