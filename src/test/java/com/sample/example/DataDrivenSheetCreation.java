package com.sample.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenSheetCreation {

	public static void main(String[] args) {
		
		try {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		WebElement textsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("arguments[0].setAttribute('value','Iphone')", textsearch);
		String text = (String) executeScript;
		System.out.println(text);
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		File file = new File("D:\\task\\FramworkClasses\\Datasheet\\Datadrivensamplefile.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
	   	Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet createSheet = workbook.createSheet("Iphone List");
		for (int i = 0; i < findElements.size(); i++) {
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			String string = findElements.get(i).getText();
			
			String[] split = string.split(" ");
			for (int j = 0; j < split.length; j++) {
				
				String string2 = Arrays.toString(split);
				System.out.println(string2);
				createCell.setCellValue(string2);
			}
		}
			FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
