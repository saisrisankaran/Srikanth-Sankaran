package com.sample.example;

import org.openqa.selenium.WebElement;

public class AdactionHotelApp extends BaseClass{

	public static void main(String[] args) {
		
		BaseClass b = new BaseClass();
		b.getdriver("Chrome");
		b.geturl("https://www.facebook.com/");
		
		LoginPage lp = new LoginPage();
		WebElement textusername = lp.getTextusername();
		b.gettext(textusername, "Srikanth");
		WebElement txtpassword = lp.getTxtpassword();
		b.gettext(txtpassword, "sankaran");
		WebElement btnlogin = lp.getBtnlogin();
		b.webdriverwait(btnlogin);
		b.btnclick(btnlogin);
	}
	
}
