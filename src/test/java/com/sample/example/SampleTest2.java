package com.sample.example;

import java.util.concurrent.SynchronousQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest2 {

	//Dataprovider Topic to access outside of the class
	//	@Test(dataProvider="testData",dataProviderClass=SampleTest3.class)
	//	private void tc20(String S) {

	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver = new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.get("https://www.amazon.in/");
	//		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	//		findElement.sendKeys(S, Keys.ENTER);

	//Hard Assert		
	//	}

	//	@Test
	//	private void tc0() {
	//
	//		String s = "abcdef";
	//		Assert.assertEquals(s, "ABcedf");
	//		System.out.println("hi");
	//		System.out.println(s);
	//	}
	//
	//	@Test
	//	private void tc1() {
	//
	//		System.out.println("Printing");
	//	}

	//Soft Assert

//	@Test
//	private void softassert() {
//
//		String s = "abcdef";
//		SoftAssert assert1 = new SoftAssert();
//		assert1.assertEquals(s, "ABcedf");
//		System.out.println();
//		assert1.assertAll();// it is used to convert the soft assert into hard assert
//		System.out.println("hi");
//		System.out.println(s);
//	}
//	@Test
//	private void tc1() {
//	
//		System.out.println("String");
//	}
	
	//If error comes how we need to through the error
	




}
