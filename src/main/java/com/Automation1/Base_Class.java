package com.Automation1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	// click method
	public static void Click(WebElement Element) {
		Element.click();

	} 
	// sendkeys
	public static void sendkeys(WebElement Element,String value) {
		Element.sendKeys(value);

	}
	// webdriver
	public static WebDriver GetBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\Chrome\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver2\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;

	}
	// get url
	public static WebDriver geturl(String url) {
		driver.get("url");
		return driver;

	}
	//get current url
public static void getcurrenturl() {
	String currenturl = driver.getCurrentUrl();
	System.out.println("the current url:"+currenturl);
	
}
//get current url
public static void gettitle() {
String title = driver.getTitle();
System.out.println("the title of the webpage:"+title);
}
//get text
public static void gettext(WebElement text) {
	String text2 = text.getText();
	System.out.println("to get the text:"+text2);

}
//get attributes
public static void attributes(WebElement att, String s) {
	String attribute = att.getAttribute(s);
	System.out.println("Get Attribute value" + attribute);
}

// Enable 
public static void enable(WebElement enabled) {
	boolean enabled2 = enabled.isEnabled();
System.out.println("enable the element:"+enabled2);

}
//display
public static void display(WebElement displayed) {
	boolean displayed2 = displayed.isDisplayed();
	System.out.println("display the element:"+displayed2);

}
//clear
public static void clear(WebElement clr) {
	clr.clear();

}
	//wait
public static void wait(int seconds) {
	driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

}
	// Alert
public static void alert(String options ) {
	Alert a =driver.switchTo().alert();
	if (options.equalsIgnoreCase("ok")) {
		a.accept();
	}
	else if (options.equalsIgnoreCase("cancel")) {
		a.dismiss();
	}
	else if (options.equalsIgnoreCase("gettext")) {
		String text = a.getText();
		System.out.println(text);
		
	}
	else {
		System.out.println("not handle this alert");
	}
}

// alert sendkeys
public static void alertsendkeys(String value) {
	Alert a =driver.switchTo().alert();
	a.sendKeys(value);

}

// select
public static void Select(WebElement val, String options, String value) {
	Select s = new Select(val);
	if (options.equalsIgnoreCase("value")) {
		s.selectByValue(value);
	} else if (options.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(value);

		s.selectByIndex(parseInt);
	} else if (options.equalsIgnoreCase("visible")) {
		s.selectByVisibleText(value);
	} else if (options.equalsIgnoreCase("getfirstselect")) {
		s.getFirstSelectedOption();
	} else if (options.equalsIgnoreCase("getallselect")) {
		List<WebElement> aso = s.getAllSelectedOptions();
		for (int i = 0; i < aso.size(); i++) {
			
			System.out.println("GetAll Selected :" + aso.get(i).getText());
		}
	} else if (options.equalsIgnoreCase("multiple")) {
		boolean multiple = s.isMultiple();
		System.out.println("Select is multiple Dropdown :" + multiple);
	} else if (options.equalsIgnoreCase("getoptions")) {
		List<WebElement> get = s.getOptions();
		ListIterator<WebElement> iterator = get.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getText());
		}
	} else {
		System.out.println("Invalid Select Options");
	}
}


//11Deselect
	public static void deSelect(WebElement val, String options, String value) {
		Select s = new Select(val);
		if (options.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (options.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);

			s.deselectByIndex(parseInt);
		} else if (options.equalsIgnoreCase("visible")) {
			s.deselectByVisibleText(value);
		} else if (options.equalsIgnoreCase("deselectall")) {
			s.deselectAll();
		} else {
			System.out.println("Invalid Select Options");
		}
	}
// frame
	public static void frame(WebElement ele) {
        driver.switchTo().frame(ele);
	}
	//default frame
	public static void defaultFrame(WebElement ele) {
      driver.switchTo().defaultContent();
	}
	// parent frame
	public static void parentFrame(WebElement ele) {
      driver.switchTo().parentFrame();
	}
	// frame int

	public static void frameInt(int a) {
		driver.switchTo().frame(a);
	}
	
	// mouse
	//Mouse
	public static void mouse(WebElement ele, String opt) {
		Actions a = new Actions(driver);
		if (opt.equalsIgnoreCase("click")) {
			a.click().perform();
		} else if (opt.equalsIgnoreCase("rightclick")) {
			a.contextClick().perform();
		} else if (opt.equalsIgnoreCase("move")) {
			a.moveToElement(ele).perform();
		} else if (opt.equalsIgnoreCase("doubleclick")) {
			a.doubleClick().perform();
		}
	}

	public static void dragndrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	//robot down
	public static void robotDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
// robot up
	public static void robotUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	// robot enter
	
	public static void robotEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
//navigate to url
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
// navigation implementation methods
	public static void navigate(String opt) {
		if (opt.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (opt.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (opt.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else if (opt.equalsIgnoreCase("close")) {
			driver.close();
		} else if (opt.equalsIgnoreCase("quit")) {
			driver.quit();
		}
	}
 // take screenshot
	public static void Screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("path");
		FileUtils.copyFile(source, des);
	}
	
//windowhandle//
	public static void windowhandle() {
		String WH = driver.getWindowHandle();
		System.out.println(WH);
		String title = driver.switchTo().window(WH).getTitle();
		System.out.println(title);
	}
//windowhandles//
	public static void windowhandles() {
		Set<String> wHs = driver.getWindowHandles();
		System.out.println(wHs);
		for (String get : wHs) {
			String title = driver.switchTo().window(get).getTitle();
			System.out.println(title);
		}
	
	}
	
	// javascript
	//Java Script Executor 1)
		public static void scrollview(WebElement s) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", s);
		}

		// 2
		public static void scrollDown(String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(value);
		}
//3
		public static void jsclick(WebElement s) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", s);
		}

//read data
		public static void read_Data(String path) throws FileNotFoundException {
			// TODO Auto-generated method stub
			File fr=new File(path);
			FileInputStream fis= new FileInputStream(fr);
		//	Workbook wb= new XSSFWorkbook(fs); 
			
			

		}


		
		
	




	

}

