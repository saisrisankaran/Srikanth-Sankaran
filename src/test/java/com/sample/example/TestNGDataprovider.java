package com.sample.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataprovider {

	@Test(dataProvider="testData")
	private void tc01(String S) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys(S, Keys.ENTER);
		
	}
	
@DataProvider(name="testData")
	
public Object[][] methodname(){
	return new Object[][] {
		
		{"Iphone Mobile"},{"Samsung Phone Mobile"}
	};
	
}}
