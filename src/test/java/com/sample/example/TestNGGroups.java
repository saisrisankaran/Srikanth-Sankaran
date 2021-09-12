package com.sample.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGroups {
	
	@Test(groups="Smoke")
	private void tc0() {
	
		System.out.println("method 0");
	}
	@Test(groups="sanity", dependsOnGroups ="Smoke")
	private void tc1() {
	
		System.out.println("method 1");
		
	}
	@Test(groups="reg")
	private void tc2() {
	
		System.out.println("method 2");
		
	}
	@Test(groups="Smoke")
	private void tc3() {
	
		System.out.println("method 3");
		
	}
	@Test(groups="sanity")
	private void tc4() {
	
		System.out.println("method 4");
		
	}
	@Test(groups="Smoke")
	private void tc5() {
	
		System.out.println("method 5");
		
	}
	@Test(groups="sanity")
	private void tc6() {
	
		System.out.println("method 6");
		
	}
	@Test(groups="reg")
	private void tc7() {
	
		System.out.println("method 7");
		
	}
	@Test(groups="Smoke")
	private void tc8() {
	
		System.out.println("method 8");
		
	}
	@Test(groups="Smoke")
	private void tc9() {
	Assert.assertTrue(false);
		System.out.println("method 9");
		
	}
	@Test(groups="sanity")
	private void tc10() {
	
		System.out.println("method 10");
		
	}



}
