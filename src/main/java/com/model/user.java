package com.model;

public class user {
	private String name;
	private String email;
	private String mobno;
	private String pass;
	public user(String name, String email, String mobno, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
