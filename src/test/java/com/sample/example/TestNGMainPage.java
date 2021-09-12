package com.sample.example;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestNGMainPage extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		BaseClass b = new BaseClass();
		b.getdriver("Chrome");
		b.geturl("https://adactinhotelapp.com/");
		TestNGAdactinLogin tg = new TestNGAdactinLogin();
		WebElement textusername = tg.getTxtusername();
		b.gettext(textusername, b.excel("Sheet1", 0, 0));
		WebElement txtpassword = tg.getTxtpassword();
		b.gettext(txtpassword, b.excel("Sheet1", 1, 0));
		WebElement login = tg.getLogin();
		b.btnclick(login);
		
		
	}
}
