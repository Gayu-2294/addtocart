package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	public static JavascriptExecutor js;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
public static void loadUrl(String url) {
	driver.get(url);
	
}
public static void maxBrowser() {
	driver.manage().window().maximize();

}
public static void pageUrl() {
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);

}
public static void pageTitle() {
	String title=driver.getTitle();
	System.out.println(title);

}
public static void backward() {
	driver.navigate().back();
}

public static  void fill(WebElement element,String usertext) {
	
	element.sendKeys(usertext);

}
public static void btnClick(WebElement element) {
	
element.click();
}
public static  void toQuit() {
	driver.quit();

}
public static void toGetText(WebElement element) {
	String text=element.getText();
	System.out.println(text);
	

}
public static void WindowHandles(int i) {
	
	Set<String> ad=driver.getWindowHandles();
	List<String> li=new ArrayList<String>(ad);
	int n=li.size();
	System.out.println("no of windows"+n);
	driver.switchTo().window(li.get(i));
	
	
	
}

public static void todeleteallcookies() {
	driver.manage().deleteAllCookies();
}
public static void toGetAttribute(WebElement element) {
	String attribute=element.getAttribute("value");
	System.out.println(attribute);
	

}
public static void scrollintoview() {
	JavascriptExecutor  js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
}
public static  void toPerformToElement(WebElement element) {
	a=new Actions(driver);
	a.moveToElement(element).perform();
	

}
public static  void toPerformDoubleClick(WebElement src,WebElement dest) {
	a.dragAndDrop(src, dest).perform();

}
public static  void toPerformEnter() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}
public static void toPerformTab() {
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	

}


	

	
			
		
	}

	
	

