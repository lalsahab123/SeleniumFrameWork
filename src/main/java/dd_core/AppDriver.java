package dd_core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Hello world!
 *
 */
public class AppDriver 
{
	public static WebDriver driver=null;
	public static Properties Config=new Properties();
	public static Properties Obj=new Properties();
	public static Logger log=Logger.getLogger("devpinoyLogger");
	@BeforeMethod
	public void launchApp() throws Exception{
		FileInputStream fis_config=new FileInputStream("F:\\ProjectWorkspace\\FrameWorkPractice\\src\\main\\java\\dd_properties\\Config.properties");
		Config.load(fis_config);
		FileInputStream obj_config=new FileInputStream("F:\\ProjectWorkspace\\FrameWorkPractice\\src\\main\\java\\dd_properties\\Object.properties");
		Obj.load(obj_config);
		if(Config.getProperty("browser").equalsIgnoreCase("Chrome")){
			log.info("Opening Chrome Browser");
			System.setProperty("webdriver.chrome.driver", Config.getProperty("driverpath"));
			driver=new ChromeDriver();
		}
		else if(Config.getProperty("browser").equalsIgnoreCase("IE")){
			log.info("Opening Chrome Browser");
			//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		else if(Config.getProperty("browser").equalsIgnoreCase("Firefox")){
			log.info("Opening Chrome Browser");
			//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Config.getProperty("url"));
	}
	@AfterMethod
	public void logout(){
		driver.quit();
	}
}
