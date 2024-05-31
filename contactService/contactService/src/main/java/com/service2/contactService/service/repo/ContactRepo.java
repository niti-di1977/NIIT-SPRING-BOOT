package com.service2.contactService.service.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.service2.contactService.beans.Contacts;

public interface ContactRepo extends CrudRepository <Contacts,Integer>{
	
	List<Contacts> findByUserId(Integer userId);

}
