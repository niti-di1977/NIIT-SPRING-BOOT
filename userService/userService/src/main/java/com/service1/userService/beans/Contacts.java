package com.service1.userService.beans;

public class Contacts 
{
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
	@Override
	public String toString() {
		return "Contacts [conId=" + conId + ", email=" + email + ", phone=" + phone + ", userId=" + userId + "]";
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
	Integer conId;
	String email;
	String phone;
	Integer userId;


}
