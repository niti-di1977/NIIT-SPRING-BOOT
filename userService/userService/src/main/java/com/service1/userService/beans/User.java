package com.service1.userService.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity

public class User 
{
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public User(Integer userId, String userName, String userAddr) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
	}
	public User(Integer userId, String userName, String userAddr, List<Contacts> contacts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
		this.contacts = contacts;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public List<Contacts> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}
	@Id
	Integer userId;
	String userName;
	String userAddr;
	@Transient
	List<Contacts> contacts;

}
