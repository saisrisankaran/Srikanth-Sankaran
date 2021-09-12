package com.sample.example;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitFaceBookLogin {

	public static WebDriver driver;
	
	@BeforeClass
	public static void BeforeLogin() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Before
	
	public void verifylogin() {
	
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("We are in home page");
		Date d = new Date(0);
		System.out.println(d);
	}
	@Test
	public void entercredential() {
	
		driver.findElement(By.id("email")).sendKeys("Srikanth");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void verficationafterlogin() {
	
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("We are in Login Page");
		java.util.Date d = new java.util.Date();
		System.out.println(d);
	}
	
	@AfterClass
	public static void closebrowser() throws InterruptedException {
	
		Thread.sleep(3000);
		driver.quit();
	}
}
