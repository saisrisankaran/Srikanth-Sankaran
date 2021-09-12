package com.sample.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test2Test {
  

	@Parameters({"username","password"})
	@Test
	private void f() {
	  BaseClass b = new BaseClass();
	  System.setProperty("webdriver.chrome.driver", "D:\\task\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	  b.geturl("http://adactinhotelapp.com/");
	  WebElement findElement = driver.findElement(By.id("username"));
	  findElement.sendKeys("s");
	  WebElement findElement2 = driver.findElement(By.xpath("//input[@id='password']"));
	  findElement2.sendKeys("s1");
	  
  }
}
