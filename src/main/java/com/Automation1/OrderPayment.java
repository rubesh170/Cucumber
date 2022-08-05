package com.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPayment {
	public static WebDriver driver;
	// start payment
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement payment;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement payment_confirm;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement Back_to_Orders;

	

	public OrderPayment() {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getPayment_confirm() {
		return payment_confirm;
	}

	public WebElement getBack_to_Orders() {
		return Back_to_Orders;
	}
	

}
