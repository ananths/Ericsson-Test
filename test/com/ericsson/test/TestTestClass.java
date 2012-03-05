package com.ericsson.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestTestClass {

	@Test
	public void shouldReturnTrue(){
		TestClass testClass = new TestClass();
		assertTrue(testClass.returnTrue());
	}
	
}
