package com.sample.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPageJunit extends BaseClass{

	public AdactinLoginPageJunit() {
	
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
	private WebElement textusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnclick;
	public WebElement getTextusername() {
		return textusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	}
	
