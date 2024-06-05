package com.gl.CustomerApi.dao;

import org.springframework.data.repository.CrudRepository;

import com.gl.CustomerApi.entities.CustomerEntity;

public interface CustomerDao extends CrudRepository<CustomerEntity,Integer> 
{

}
