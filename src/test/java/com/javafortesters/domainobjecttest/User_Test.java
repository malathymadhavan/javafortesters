package com.javafortesters.domainobjecttest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainobject.User;

public class User_Test {

	@Test
	public void canConstructANewUser(){
		User user = new User();
	}
	
	@Test
	public void userHasDefaultUsernameAndPassword() {
		User user  = new User();
		assertEquals("Expects a username","username",user.getUsername());
		assertEquals("Expects a password","password",user.getPassword());
	}
	
	@Test
	public void canSetPassword() {
		User user = new User();
		user.setPassword("P4ssw0rd");
		assertEquals("Expects a password","P4ssw0rd",user.getPassword());
	}
}
