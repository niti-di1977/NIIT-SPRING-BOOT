package com.service1.userService.repo;

import org.springframework.data.repository.CrudRepository;

import com.service1.userService.beans.User;

public interface UserRepo extends CrudRepository <User,Integer> {

}
