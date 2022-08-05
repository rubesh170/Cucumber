package com.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	public static WebDriver driver;
	
	
	
	public Page_Object_Manager(WebDriver d) {
	this.driver=d;
	PageFactory.initElements(d, this);
	}
	
	//1.Login
	public LoginPage getLoginPage()
	{
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	//2.Searchorder
	public SearchOrder getSearchOrder()
	{
		SearchOrder so= new SearchOrder(driver);
		return so;
	}
	//3.Placeorder
	public Place_Order getPlace_Order()
	{
		Place_Order po= new Place_Order();
		return po;
	}
	
	//4.order payment
	
	public OrderPayment getOrderPayment() {
 OrderPayment op= new OrderPayment();
		return op;
		
	}
}
