package dd_core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Library extends AppDriver{
	public WebElement get_WebElement_Object(String locator,String locator_type){
		
		WebElement Object=null;
		if(locator_type.equalsIgnoreCase("xpath")){
			Object=driver.findElement(By.xpath(locator));
		}
		else if(locator_type.equalsIgnoreCase("name")){
			Object=driver.findElement(By.name(locator));
		}
		else if(locator_type.equalsIgnoreCase("id")){
			Object=driver.findElement(By.id(locator));
		}
		else if(locator_type.equalsIgnoreCase("linktext")){
			Object=driver.findElement(By.linkText(locator));
		}
		else if(locator_type.equalsIgnoreCase("partiallinktext")){
			Object=driver.findElement(By.partialLinkText(locator));
		}
		else if(locator_type.equalsIgnoreCase("tagname")){
			Object=driver.findElement(By.tagName(locator));
		}
		else if(locator_type.equalsIgnoreCase("classname")){
			Object=driver.findElement(By.className(locator));
		}		
		return Object;
	}
	
	public void clickOnAnyElement(String locator, String locator_type, String click_type){
		WebElement Object=null;
		Object = get_WebElement_Object(locator, locator_type);
		if(click_type.equalsIgnoreCase("click")){
			Object.click();	
		}
		else if(click_type.equalsIgnoreCase("javascript")){
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Object);
		}
		
		
	}

}
