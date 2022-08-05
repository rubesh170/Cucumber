package com.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOrder {

public static WebDriver driver;

 	@FindBy(xpath="//a[@title='Women']")
 	private WebElement Women;
 	
 	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
 	private WebElement Tshirt;

	public SearchOrder(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}
 	
 	
 	
	}


