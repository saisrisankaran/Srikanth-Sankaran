package com.sample.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSampleProgram {

	@Test
	public void test() {
	
		String s = "Srikanth Sankaran";
		Assert.assertEquals("Validate String", "Srikanth Sankaran", s);
		System.out.println("The Name is matcing");
		Assert.assertNotEquals("valiate String", "Srikanth ", s);
		System.out.println("The Name is matcing");
		
	}
	
	@Test
	public void testclass() {
	
		String s = "Srikanth Sankaran";
		Assert.assertTrue("Validation", s.contains("Srikanth"));
		System.out.println("The name contains in it");
		System.out.println("test2");
		
	}
	

	@Before
	public void test2() {
	
		System.out.println("Text1-@Before");
	}
	@After
	public void test3() {
	
		
		System.out.println("Text1-@After");
		
	}
	
	@AfterClass
	public static void test4() {
	
		System.out.println("Text1-@Afterclass");
		
	}
	@BeforeClass
	public static void  test5() {
		System.out.println("Text1-@Beforeclass");
		
	}
	
}
