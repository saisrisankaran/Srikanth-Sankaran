package com.sample.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParellel {
	@Parameters({"email","pass"})
	@Test(groups="sanity")
	private void browerlaunch(String s, String s1) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);

	}

	@Test(groups="smoke", dependsOnGroups="sanity")
	private void browerlaunch2(String s, String s1) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		String next2 = sc.next();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(next);
		driver.findElement(By.id("pass")).sendKeys(next2);
	}

	@Test(dataProvider="TestData")
	private void browerlaunch3(String s, String s1) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);
	}

	@DataProvider(name="TestData")
	public Object[][] methodname(){
		return new Object[][] {

			{"Srikanth sankaran","Sai48976"},
			{"Srikanth bala","Sai98745"},
			{"Srikanth Ramya","Sai48976"},
			{"Srikanth Lakshmi","Sai48976"}
		};
	}
}