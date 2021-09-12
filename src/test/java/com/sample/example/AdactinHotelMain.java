package com.sample.example;

import org.openqa.selenium.WebElement;

public class AdactinHotelMain extends BaseClass{

	public static void main(String[] args) {
		
		BaseClass b = new BaseClass();
		b.getdriver("Chrome");
		b.geturl("https://adactinhotelapp.com/");
		AdactinHoltelSample2 a = new AdactinHoltelSample2();
		WebElement txtusername = a.getTxtusername();
		b.gettext(txtusername, "Srikanth");
		WebElement txtpassword = a.getTxtpassword();
		b.gettext(txtpassword, "Srikanth");
		WebElement btnlogin = a.getBtnlogin();
		b.webdriverwait(btnlogin);
		b.btnclick(btnlogin);
	}
	
	
}
