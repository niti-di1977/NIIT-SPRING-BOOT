package com.service1.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service1.userService.beans.User;
import com.service1.userService.repo.UserRepo;
import com.service1.userService.service.UserService;

//http://localhost:9093/user/1

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	UserService service;
	
	@Autowired
	UserRepo repo;
	
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId")Integer userId)
	{
		return service.getUserById(userId);
	}
	
	@GetMapping("/all")
	public List<User> getUserById()
	{
		return (List<User>) repo.findAll();
	}
	

}
