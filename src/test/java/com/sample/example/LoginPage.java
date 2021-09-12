package com.sample.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends BaseClass{

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement textusername;
	@FindBy(id="pass")
	private WebElement txtpassword;
	@FindBy(name="login")
	private WebElement btnlogin;
	public WebElement getTextusername() {
		return textusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
