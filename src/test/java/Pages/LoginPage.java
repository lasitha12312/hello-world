package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import StepsDefinitions.CommonMethods;

public class LoginPage extends CommonMethods{
	
		
	@FindBy(id = "Email") 
	WebElement username;
	
	@FindBy(id = "Password") 
	WebElement password;
	
	@FindBy(id = "btSignIn") 
	WebElement loginbutton;
	
//	@FindBy(linkText= "text")
//	WebElement Error;
	
	@FindBy(xpath = "//div[contains(@class, 'validation-summary-errors alert alert-danger')]/h2")
	WebElement Errormessage;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}			
	public HomePage logintoSystem(String UserName1, String Password1) throws Throwable {
		
		Thread.sleep(15000);
		username.sendKeys(UserName1);
		password.sendKeys(Password1);		
		loginbutton.click();
		Thread.sleep(5000);		
		return new HomePage();
	}
	
	public HomePage LoginWithInvalidusername(String UserName1, String Password1) throws Throwable{
		Thread.sleep(15000);
		username.sendKeys(UserName1);
		password.sendKeys(Password1);
		
		loginbutton.click();
		Thread.sleep(5000);
	
		return new HomePage();		
	}	
	public HomePage Error(String error1) throws Throwable{
		Thread.sleep(5000);
		Errormessage.sendKeys(error1);		
		return new HomePage();
	}
}
