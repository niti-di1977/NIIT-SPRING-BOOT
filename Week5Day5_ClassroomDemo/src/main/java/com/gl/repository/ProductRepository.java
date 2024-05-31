package com.gl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.pojo.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>
{

}







//interface RepositoryName extends CrudRepository<POJOClassname,Datatype of Primary Key>
//{
//	
//}
//
//@Repository: database logic
//predefined methods: findById, deleteById, updateById, findAll
//CrudRepository: inbuilt class which works on POJO through Primary key
