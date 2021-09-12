package com.sample.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDiffClass2 {

	@Test(dataProvider="TestData", dataProviderClass=DataProviderDiffClass  .class)
	private void dataprovidermethodname(String s,String s1) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(s);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys(s1);
	}
	
	
	}

