package com.javalec.model;

public class User {

		// 모델은 클라스로 생성한다
	// Field
	String id;
	String pw;
	String address;
	String phone;
	
	
	// Constructor
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(String id, String pw, String address, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.address = address;
		this.phone = phone;
	}
	// Getter Method



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
