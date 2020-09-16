package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test (priority = 1)
	public void sum() {
		
		int a = 10;
		int b = 20;
		
		int sum = a+b;
		System.out.println("Sum : "+sum);
		Assert.assertEquals(30, sum);
	}
	
	@Test (priority = 2)
	public void sub() {
		
		int a = 10;
		int b = 20;
		
		int sub = b-a;
		System.out.println("Sub : "+sub);
		Assert.assertEquals(10, sub);
	}
	
	@Test (priority = 3)
	public void mul() {
		
		int a = 10;
		int b = 20;
		
		int mul = a*b;
		System.out.println("Mul : "+mul);
		Assert.assertEquals(200, mul);
	}
	
	@Test (priority = 4)
	public void div() {
		
		int a = 10;
		int b = 20;
		
		int div = b/a;
		System.out.println("Div : "+div);
		Assert.assertEquals(2, div);
	}
	
}
