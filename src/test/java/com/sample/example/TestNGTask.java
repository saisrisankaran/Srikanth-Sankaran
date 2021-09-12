package com.sample.example;

import java.io.IOException;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTask extends BaseClass{

	static BaseClass b;

	@BeforeSuite
	private void beforesuit() {

		System.out.println("Before Suite");
	}

	@BeforeGroups
	private void beforegroups() {
		System.out.println("Before Groups");

	}

	@BeforeClass
	private void browserlaunch()  {

		BaseClass b = new BaseClass();
		b.getdriver("chrome");
		driver.get("https://adactinhotelapp.com/");
	}

	@BeforeTest
	private void logintime() {

		Date d = new Date();
		System.out.println(d);

	}
	@Test
	private void entervalue() throws IOException, InterruptedException {

		BaseClass b = new BaseClass();
		b.getdriver("Chrome");
		b.geturl("http://adactinhotelapp.com/");
		TestNGAdactinLogin tg = new TestNGAdactinLogin();
		//    	WebElement btnclick = tg.getBtnclick();
		//    	b.btnclick(btnclick);
		WebElement txtusername = tg.getTxtusername1();
		b.gettext(txtusername, b.excel("Sheet1", 5, 0));
		WebElement txtpassword = tg.getTxtpassword2();
		b.gettext(txtpassword, b.excel("Sheet1", 6, 0));
		//    	WebElement txtrepassword = tg.getTxtrepassword();
		//    	b.gettext(txtrepassword, b.excel("Sheet1", 2, 0));
		//    	WebElement full_name = tg.getFull_name();
		//    	b.gettext(full_name, b.excel("Sheet1", 3, 0));
		//    	WebElement email_add = tg.getEmail_add();
		//    	b.gettext(email_add, b.excel("Sheet1", 4, 0));
		//    	b.implicitwait();
		//    	WebElement submit = tg.getSubmit();
		//    	b.btnclick(submit);
		WebElement login = tg.getLogin();
		b.btnclick(login);
		WebElement location = tg.getLocation();
		b.selectbyvalue(location, "London");
		WebElement hotels = tg.getHotels();
		b.selectbyvalue(hotels, "Hotel Sunshine");
		WebElement room_type = tg.getRoom_type();
		b.selectbyvalue(room_type, "Deluxe");
		WebElement room_nos = tg.getRoom_nos();
		b.selectbyindex(room_nos, 5);
		WebElement adult_room = tg.getAdult_room();
		b.selectbyindex(adult_room, 4);
		WebElement child_room = tg.getChild_room();
		b.selectbyindex(child_room, 3);
		WebElement submit1 = tg.getSubmit1();
		b.btnclick(submit1);
		WebElement radiobutton = tg.getRadiobutton();
		b.btnclick(radiobutton);
		WebElement continue1 = tg.getContinue1();
		b.btnclick(continue1);
		Thread.sleep(3000);
		WebElement full_name = tg.getFirst_name();
		b.gettext(full_name, b.excel("Sheet1", 8, 0));
		WebElement last_name = tg.getLast_name();
		b.gettext(last_name, b.excel("Sheet1", 9, 0));
		WebElement address = tg.getAddress();
		b.gettext(address, b.excel("Sheet1", 10, 0));
		WebElement cc_num = tg.getCc_num();
		b.gettext(cc_num, b.excel("Sheet1", 11, 0));
		WebElement cc_type = tg.getCc_type();
		b.selectbyindex(cc_type, 2);
		WebElement cc_exp_month = tg.getCc_exp_month();
		b.selectbyindex(cc_exp_month, 11);
		WebElement cc_exp_year = tg.getCc_exp_year();
		b.selectbyindex(cc_exp_year, 12);
		WebElement cc_cvv = tg.getCc_cvv();
		b.gettext(cc_cvv, b.excel("Sheet1", 12, 0));
		WebElement book_now = tg.getBook_now();
		b.btnclick(book_now);
		Thread.sleep(20000);
		b.takescreehot("D:\\task\\FramworkClasses\\target\\Test6.png");

	}
	@AfterTest
	private void loginafter() {

		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	private void afterclass() {

		System.out.println("After Class");

	}
	@AfterGroups
	private void aftergroups() {

		System.out.println("After Groups");
	}

	@AfterSuite
	private void aftersuit() {

		System.out.println("aftersuit");
	}
}