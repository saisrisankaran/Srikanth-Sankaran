package com.sample.example;

import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestNGAssert {

//	@Test
//	private void hardassert() {
//	
//		String s = "Srikanth";
//		Assert.assertEquals(s, "SRIKANTH");
//		System.out.println("Hai");
//		System.out.println(s);
//	}
	@Test
	private void softasserte() {
	
		String s1 ="Srikanth Sankaran";
		SoftAssert s = new SoftAssert();
		s.assertEquals(s1, "Sri");
		s.assertAll();
		System.out.println(s1);
		System.out.println(s);
		System.out.println("Srikanth");
	}
}
