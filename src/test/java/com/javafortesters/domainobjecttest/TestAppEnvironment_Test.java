package com.javafortesters.domainobjecttest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainobject.TestAppEnv;

public class TestAppEnvironment_Test {

	@Test
	public void canGetUrlStatically() {
		assertEquals("Expect url", "http://192.123.0.3:67", TestAppEnv.getUrl());
	}
	
	@Test
	public void canGetDomainAndPortStatically() {
		assertEquals("expect domain", "192.123.0.3", TestAppEnv.DOMAIN);
		assertEquals("expect port", "67", TestAppEnv.PORT);
	}
}
