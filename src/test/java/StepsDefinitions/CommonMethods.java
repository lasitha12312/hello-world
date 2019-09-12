package StepsDefinitions;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class CommonMethods {
	public  static WebDriver driver;	
	
	public static void Driverdefinition_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
			      new File("./src/libs/chromedriver.exe").getCanonicalPath());
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://dev-sg.smartreservationservices.com/Admin");
	   Thread.sleep(5000);	   
	  
	}	

	public static void Browserquit() throws Throwable {
		driver.quit();
	      
	  
	}
	
}
	
	
	

