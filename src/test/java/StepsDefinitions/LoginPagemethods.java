package StepsDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import StepsDefinitions.CommonMethods;

public class LoginPagemethods extends CommonMethods {
	
	LoginPage loginpage;
	HomePage homepage;
	

	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws Throwable {
	   CommonMethods.Driverdefinition_open();
	}

	@Then("^userenter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userenter_and(String arg1, String arg2) throws Throwable {
		loginpage = new LoginPage();
	    homepage = loginpage.logintoSystem(arg1, arg2);
	}
	
	@When("^user click on the sign in$")
	public void invalid_User_name(String arg1, String arg2) throws Throwable {
		loginpage = new LoginPage();
	    homepage = loginpage.LoginWithInvalidusername(arg1, arg2);
	}
	
	@Then("^email address or password incorrect message should appears$")
	public void error_message_(String arg1) throws Throwable {
		loginpage = new LoginPage();
	    homepage = loginpage.Error(arg1);
	}
}
