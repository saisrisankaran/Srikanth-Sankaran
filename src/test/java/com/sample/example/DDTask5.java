package com.sample.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

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

public class DDTask5 {

	public static void main(String[] args) {

		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://www.adactin.com/HotelApp/");
			WebElement btnclick = driver.findElement(By.xpath("//a[(text()='New User Register Here')]"));
			btnclick.click();
			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("Srikanth");
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Sriram");
			WebElement repwd = driver.findElement(By.xpath("//input[@name='re_password']"));
			repwd.sendKeys("Sriram");
			WebElement FullName = driver.findElement(By.xpath("//input[@name='full_name']"));
			FullName.sendKeys("Srikanth Sankaran");
			WebElement email = driver.findElement(By.xpath("//input[@name='email_add']"));
			email.sendKeys("srikanthsankaran@gmail.com");
			WebElement btnclick2 = driver.findElement(By.xpath("//input[@id='Submit']"));
			btnclick2.click();
			File file = new File("D:\\task\\FramworkClasses\\Datasheet\\datadriven.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet createSheet = workbook.createSheet("DatadrivenTask7");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			String text1 = username.getAttribute("value");
			String text2 = password.getAttribute("value");
			String text3 = repwd.getAttribute("value");
			String text4 = FullName.getAttribute("value");
			String text5 = email.getAttribute("value");
			System.out.println(text1);
			System.out.println(text2);
			System.out.println(text3);
			System.out.println(text4);
			System.out.println(text5);
			createCell.setCellValue(text1);
			Row createRow1 = createSheet.createRow(1);
			Cell createCell1 = createRow.createCell(1);
			createCell1.setCellValue(text2);
			Row createRow2 = createSheet.createRow(2);
			Cell createCell2 = createRow.createCell(2);
			createCell2.setCellValue(text3);
			Row createRow3 = createSheet.createRow(3);
			Cell createCell3 = createRow.createCell(3);			
			createCell3.setCellValue(text4);
			Row createRow4 = createSheet.createRow(4);
			Cell createCell4 = createRow.createCell(4);
			createCell4.setCellValue(text5);

	FileOutputStream fos = new FileOutputStream(file);
	workbook.write(fos);

}catch (Exception e) {
	e.printStackTrace();
}
}}
