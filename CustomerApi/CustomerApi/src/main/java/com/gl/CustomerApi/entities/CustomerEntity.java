package com.gl.CustomerApi.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Customer")
public class CustomerEntity
{
	@Id
	private int customerId;
	private String emailId;
	private String name;



	public CustomerEntity(int customerId, String emailId, String name) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.name = name;

	}



	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", emailId=" + emailId + ", name=" + name + ", ]";
	}

}
