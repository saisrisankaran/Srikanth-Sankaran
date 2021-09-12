package com.sample.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskSample {

	public static void main(String[] args) {
		
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement txt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Object executeScript = j.executeScript("arguments[0].setAttribute('value','Laptop')", txt);
		String text = (String)executeScript;
		System.out.println(text);
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfAllElements(txt));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> lstspan = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		lstspan.size();
		
		for (WebElement x : lstspan) {
			
			System.out.println(x.getText());
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
