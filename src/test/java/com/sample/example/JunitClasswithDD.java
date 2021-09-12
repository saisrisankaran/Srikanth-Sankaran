package com.sample.example;

import java.io.IOException;
import java.sql.Date;
import java.sql.DriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitClasswithDD extends BaseClass{

	public static BaseClass bc;
	@BeforeClass
	public static void browserlaunch() {
		bc = new BaseClass();
		bc.getdriver("chrome");
		driver.get("https://adactinhotelapp.com/");

	}
	@Before
	public void logintim() {

		java.util.Date d = new java.util.Date();
		System.out.println(d);
	}
	@Test
	public void loginusername() throws IOException, InterruptedException {

		AdactinLoginPageJunit ad = new AdactinLoginPageJunit();
		WebElement textusername = ad.getTextusername();
		bc.gettext(textusername, bc.excel("Sheet1", 0, 0));
		WebElement txtpassword = ad.getTxtpassword();
		bc.gettext(txtpassword, bc.excel("Sheet1", 0, 1));
		WebElement btnclick = ad.getBtnclick();
			bc.btnclick(btnclick);

	}
	@After
	public void afterlogin() {

		java.util.Date d = new java.util.Date();
		System.out.println(d);

	}

}
