package com.Automation1;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;
	
	@FindBy(xpath = " //a[@title='Log in to your customer account']")
	private WebElement signInBtn;

	@FindBy(id="email")
	private WebElement emailId;
	
	@FindBy(name="passwd")
	private WebElement password;

	public SignInPage(WebDriver b) {
		// TODO Auto-generated constructor stub
		this.driver=b;
	
	 PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	
	
	

}



