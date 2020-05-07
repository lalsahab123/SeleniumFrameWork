package dd_main;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dd_core.AppDriver;
import dd_core.Library;
import dd_screen.DashBoard;
import dd_screen.RegistrationPage;

public class MainClass extends AppDriver{
	DashBoard dashboard;
	RegistrationPage signup;
	//Library library;
	public MainClass() {
		super();
		signup = new RegistrationPage();
		dashboard=new DashBoard();
		//library=new Library();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void maintest(){
		try {
		log.info("Main Method Start Here");
		System.out.println("Main Method Start Here");
		//driver.findElement(By.xpath(Object.getProperty("signUP_btn"))).click();
		dashboard.clickOnSignUpLink();
		dashboard.clickOnNextBtn();
		//driver.findElement(By.xpath("//*[text()='Next'][@role='button']"));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	



}
