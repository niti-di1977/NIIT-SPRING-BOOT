package com.service2.contactService.beans;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Contacts 
{
	@Id
	Integer conId;
	String email;
	String phone;
	Integer userId;
	
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacts(Integer conId, String email, String phone, Integer userId) {
		super();
		this.conId = conId;
		this.email = email;
		this.phone = phone;
		this.userId = userId;
	}
	public Integer getConId() {
		return conId;
	}
	public void setConId(Integer conId) {
		this.conId = conId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Contacts [conId=" + conId + ", email=" + email + ", phone=" + phone + ", userId=" + userId + "]";
	}
	



}
