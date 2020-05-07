package dd_screen;

import org.openqa.selenium.By;

import dd_core.AppDriver;
import dd_core.Library;

public class DashBoard extends AppDriver{
Library library;
	public DashBoard() {
		super();
		library=new Library();
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnSignUpLink(){
		driver.findElement(By.xpath(Obj.getProperty("signUP_btn"))).click();
	}
	public void clickOnNextBtn(){
		//driver.findElement(By.xpath(Object.getProperty("next_btn"))).click();
		library.clickOnAnyElement(Obj.getProperty("next_btn"), "xpath", "click");
	}

}
