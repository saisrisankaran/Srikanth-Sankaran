package com.sample.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNGAdactinLogin extends BaseClass {
	
	public TestNGAdactinLogin() {
	
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement btnclick;
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="re_password")
	private WebElement txtrepassword;
	@FindBy(id="full_name")
	private WebElement full_name;
	@FindBy(id="email_add")
	private WebElement email_add;
	@FindBy(id="tnc_box")
	private WebElement tnc_box;
	@FindBy(id="Submit")
	private WebElement Submit;
	@FindBy(id="username")
	private WebElement txtusername1;
	@FindBy(id="password")
	private WebElement txtpassword2;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement Submit1;
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement continue1;
	@FindBy(id="last_name")
	private WebElement last_name;
	@FindBy(id="first_name")
	private WebElement first_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	@FindBy(id="cc_type")
	private WebElement cc_type;
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinue1() {
		return continue1;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getBook_now() {
		return book_now;
	}

	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="book_now")
	private WebElement book_now;
	
	
	public WebElement getSubmit1() {
		return Submit1;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getTxtusername1() {
		return txtusername1;
	}
	public WebElement getTxtpassword2() {
		return txtpassword2;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getTxtrepassword() {
		return txtrepassword;
	}
	public WebElement getFull_name() {
		return full_name;
	}
	public WebElement getEmail_add() {
		return email_add;
	}
	public WebElement getTnc_box() {
		return tnc_box;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	
}
