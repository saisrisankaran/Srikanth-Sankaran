package com.sample.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParametersClass {

	@Test
	@Parameters({"username","password"})
	private void testparameter(@Optional("SrikanthSankaran")String s, String s1) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(s);
		driver.findElement(By.id("password")).sendKeys(s1);
		System.out.println(s);
		System.out.println(s1);
	
	}
	
	
}
