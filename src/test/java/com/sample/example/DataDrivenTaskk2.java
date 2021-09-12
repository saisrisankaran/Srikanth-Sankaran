package com.sample.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTaskk2 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File file = new File("D:\\task\\FramworkClasses\\Datasheet\\datadriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("SrikanthRamya");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(stringCellValue);
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(0);
		String stringCellValue2 = cell2.getStringCellValue();
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys(stringCellValue2);
		
		
	}
}
