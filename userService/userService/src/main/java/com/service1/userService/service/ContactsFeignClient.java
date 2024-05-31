package com.service1.userService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.service1.userService.beans.Contacts;

@FeignClient(name = "contacts-ms", url="http://localhost:9099/")
public interface ContactsFeignClient {
	
	@GetMapping("/contacts/{userId}")
	List<Contacts> getSpecificContact(@PathVariable("userId") int userId);


}
