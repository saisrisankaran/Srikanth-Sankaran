package com.sample.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestClass3 extends BaseClass {

	@FindBy(id="email")
	private WebElement textusername;
	@FindBy(id="pass")
	private WebElement textpassword;
	@FindBy(name="login")
	private WebElement btnlogin;
	public WebElement getTextusername() {
		return textusername;
	}
	public WebElement getTextpassword() {
		return textpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
