package com.sample.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static String pathname = "D:\\task\\FramworkClasses\\Datasheet\\datadriven.xlsx";
	public void getdriver(String Chromdriverpath) {

		if(Chromdriverpath.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\task\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}else if(Chromdriverpath.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\task\\Selenium\\driver1\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	} public void geturl(String url) {

		driver.get(url);
	}

	public void gettext(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void btnclick(WebElement element) {

		element.click();
	}

	public void selectbyvisibletext(WebElement element, String text ) {

		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectbyindex(WebElement element, int num ) {

		Select select=new Select(element);
		select.selectByIndex(num);

	}
	public void selectbyvalue(WebElement element, String value ) {

		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void actionsmouseover(WebElement element, String value) {

		Actions a = new Actions(driver);
	}

	public void actionsrightclick(WebElement element, String value) {

		Actions a = new Actions(driver);
		a.contextClick(element).perform();

	}

	public void actionsdoubleclick(WebElement element) {

		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void actionsdraganddrop(WebElement element, WebElement element2, String value) {

		Actions a = new Actions(driver);
		a.dragAndDrop(element, element2).perform();
	}

	public void normarlalert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public void confirmalert(WebElement element, String value) {

		if (value.equalsIgnoreCase("ok")) {

			Alert alert = driver.switchTo().alert();
			alert.accept();
		} else  {

			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		}
	}
	public void promptalert(String value) {

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}


	public void javascript(WebElement element, String Data, String value) {

		if (Data.equalsIgnoreCase("setAttribute")) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAtribute('value',"+value+")", element);	js.executeScript("arguments[0].setAtribute('value',"+value+")", element);	
		}
		else if (Data.equalsIgnoreCase("getAttribute")) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].getAttribute('value')", element);
		}else if (Data.equalsIgnoreCase("Click")) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);

		} else if (Data.equalsIgnoreCase("ScrollDown")) {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].()", element);
		}else if (Data.equalsIgnoreCase("ScrollDown")) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", value);	
		}		
		else if (Data.equalsIgnoreCase("Scrollup")) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", value);	
		}
	}

	public void takescreehot(String path) throws IOException {

		TakesScreenshot tk = (TakesScreenshot)driver;
		File srcfile = tk.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		FileUtils.copyFile(srcfile, file);
	}

	public void locator(WebElement element,String Data,String volume) {

		if (Data.equalsIgnoreCase("ID")) {

			driver.findElement(By.id(volume));

		}else if (Data.equalsIgnoreCase("name")) {
			driver.findElement(By.name(volume));

		}else if (Data.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(volume));
		}else if (Data.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(volume));

		}
	}

	public void getwindowhandle(WebDriver driver) {

		String windowHandle = driver.getWindowHandle();


	}
	public void getwindowhandles(WebDriver driver, WebElement element) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {

			if (!x.equals(element)) {

				String title = driver.switchTo().window(x).getTitle();
				System.out.println(title);
			}


		}


	}
	public void findelements(WebElement element, String value) {

		driver.findElements(By.xpath(value));

	}

	public void webdriverwait(WebElement element) {

		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(element));

	}

	public String excel(String sheetname, int rowno,int cellno) throws IOException {
		try {
			String value;
			File f = new File(pathname);
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet sheet = w.getSheet(sheetname);
			Row row = sheet.getRow(rowno);
			Cell cell = row.getCell(cellno);
			int celltype = cell.getCellType();
			if(celltype==1) {

				value = cell.getStringCellValue();
				System.out.println(value);
			}else if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("MM/DD/YYYY");
				value = s.format(dateCellValue);
				System.out.println(value);

			}
			else {

				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
				System.out.println(value);
			}
			return value;
		}catch (Exception e) {

			e.printStackTrace();
		}
		return sheetname;
	} public void createsheet(String sheetname, int rowno,int cellno,String cellvalue) throws IOException {

		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("Username_PWD");
		Row createRow = createSheet.createRow(rowno);
		Cell createCell = createRow.createCell(cellno);
		createRow.setRowNum(rowno);
		createCell.setCellValue(cellvalue);

	}

	public void implicitwait() {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
}

