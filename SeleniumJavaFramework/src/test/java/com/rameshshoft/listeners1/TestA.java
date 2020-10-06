package com.rameshshoft.listeners1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {

	@Test
	public void login(){
		System.out.println("login()");
		Assert.assertEquals("java","java");
	}
	
}
