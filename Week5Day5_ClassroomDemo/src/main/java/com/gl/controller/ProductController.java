package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.pojo.Product;
import com.gl.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	ProductService prodService;

	//HTTP Methods: GET POST PUT DELETE
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> insertProduct(@RequestBody Product p)
	{
		return new ResponseEntity<>(prodService.insertProduct(p),HttpStatus.CREATED);
	}

	
	@GetMapping("/getAll")
	public List<Product> getAllProducts()
	{
		return prodService.getAllProducts();
	}
	

	@GetMapping("/getById/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return prodService.getProductById(id);
	}
	
	
	@DeleteMapping("/deleteAll")
	public void removeAll()
	{
		prodService.removeAll();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id)
	{
		String msg=prodService.deleteById(id);
		if(msg.equals("Product Deleted Successfully"))
		{
			return new ResponseEntity<>("Data deleted",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>("Could not",HttpStatus.NOT_FOUND);
		}
		
	}
	
	  @PutMapping("/updateById")
	  public Product updateProductById(@RequestBody Product newProduct)
	  {
		  return prodService.updateProductById(newProduct);
	  }
}
