package com.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Place_Order {
	public static WebDriver driver;
	
	@FindBy(name="Submit")
	private WebElement AddtoCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed_checkout;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement checkout;
	
	@FindBy(name="processAddress")
	private WebElement proceed_address;
	
	@FindBy(id="cgv")
	private WebElement Terms;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed_Terms;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddtoCart() {
		return AddtoCart;
	}

	public WebElement getProceed_checkout() {
		return proceed_checkout;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getProceed_address() {
		return proceed_address;
	}

	public WebElement getTerms() {
		return Terms;
	}

	public WebElement getProceed_Terms() {
		return proceed_Terms;
	}

}
