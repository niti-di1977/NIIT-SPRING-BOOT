package com.gl.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data   //lombok
@Entity   //JPA: map pojo object with table 
@Table(name="ProductDetails")   //Product_Details
public class Product    //Table with the same name as the class name
{
	@Id   //pid is a primary key
	private int pid;
	
	@Column(name="prod_title", unique=true, nullable=false)
	private String title;

	@Column(nullable=false)
	private String description;
	
	@Column(name="availability")
	private boolean available_status;
}

//create table ProductDetails(pid integer PRIMARY KEY,
//								 prod_title varchar(20) UNIQUE NOT NULL,
//							     description varchar(20) NOT NULL,
//								 availability boolean);
							 


//Persistence: permanent storage
//Java POJO object: Database
//ORM:  JPA: Java Persistence API