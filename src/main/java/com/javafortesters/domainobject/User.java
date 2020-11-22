package com.javafortesters.domainobject;

public class User {
	private String username;
	private String password;

	public User() {
		this("username", "password");
	}

	public User(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
		
	}
}
