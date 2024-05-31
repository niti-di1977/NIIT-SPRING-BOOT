package com.gl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.pojo.Product;
import com.gl.repository.ProductRepository;
import java.util.*;

@Service
public class ProductService 
{
   @Autowired
   ProductRepository prodRepo;
  
   public Product insertProduct(Product p)
   {
	   return prodRepo.save(p);
   }
   
   public List<Product> getAllProducts()
   {
	   return (List<Product>)prodRepo.findAll();
   }
   
   public void removeAll()
   {
	   prodRepo.deleteAll();
   }
   
   public Product getProductById(int id)
   {
	  Optional<Product> op=prodRepo.findById(id);
	  try
	  {
		  return op.get();  
	  }
	  catch(Exception e)
	  {
		  return null;
	  }
   }
   public String deleteById(int id)
   {
	   Optional<Product> op=prodRepo.findById(id);  //102
	   try
	   {
		   Product p=op.get();  //books
		   prodRepo.delete(p);
		   return "Product Deleted Successfully";
	   }
	   catch(Exception e)
	   {
		   return "Product could not be deleted";
	   }
   }
   public Product updateProductById(Product newp)
   {
	   Optional<Product> up=prodRepo.findById(newp.getPid());
	   try
	   {
		   return prodRepo.save(newp);
	   }
	   catch(Exception e)
	   {
		   return null;
	   }
   }
}
