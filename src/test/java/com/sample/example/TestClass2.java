package com.sample.example;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.runners.TestClass;
import org.openqa.selenium.WebElement;

public class TestClass2 extends BaseClass {
	
	public static BaseClass b;
	@BeforeClass
	public static void browserlaunch() {
	
		 b  = new BaseClass();
		b.getdriver("Chrome");
		b.geturl("https://en-gb.facebook.com/");
	}
	@Before
	
	public void logintime() {
	
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void uesrname() throws IOException, InterruptedException {
	
		TestClass3 t = new TestClass3();
		WebElement textusername = t.getTextusername();
		gettext(textusername, b.excel("Sheet1", 0, 0));
		b.wait();
		WebElement textpassword = t.getTextpassword();
		gettext(textpassword, b.excel("Sheet1", 1, 0));
		b.wait();
		WebElement btnlogin = t.getBtnlogin();
		btnclick(btnlogin);
	}
		
	
	@Before
	public void browsertime() {
		Date d = new Date();
	System.out.println(d);
}
}