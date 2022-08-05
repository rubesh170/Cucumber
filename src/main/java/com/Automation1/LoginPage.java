package com.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	
	
	@FindBy(id="email")
	private WebElement emailId;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement signInbtn;

	public LoginPage(WebDriver c) {
		// TODO Auto-generated constructor stub
		this.driver=c;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInbtn() {
		return signInbtn;
	}
	
	

}
