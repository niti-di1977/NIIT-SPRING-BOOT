package com.infosys.repo;

import org.springframework.data.repository.CrudRepository;

import com.infosys.entities.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> 
{

}