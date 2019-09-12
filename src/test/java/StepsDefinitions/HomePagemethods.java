package StepsDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import StepsDefinitions.CommonMethods;

public class HomePagemethods extends CommonMethods {
	
	HomePage homepage = new HomePage();
	

	@Then("^user in homepage$")
	public void user_in_homepage() throws Throwable {
		Assert.assertEquals("Welcome to Space Genius", driver.findElement(By.xpath("//div[contains(@class, 'ribbon-top')]/h4")).getText());
	}


	@Then("^Click Logout$")
	public void click_Logout() throws Throwable {
		Thread.sleep(5000);
		homepage.ClickonLogout();
	}

	@Then("^Click on down arrow$")
	public void click_on_down_arrow() throws Throwable {
		Thread.sleep(5000);
		homepage.clickondownarrow();
	    Thread.sleep(5000);
	}

	@Then("^user logout successfully$")
	public void userlogoutsuccessfully() throws Throwable {
		String title = "Please sign into your account";
		Assert.assertTrue("Looged out was not successfull", title.equals(driver.findElement(By.xpath("//div[contains(@class, 'col-sm-12')]/p")).getText()));
	}
		

	@Then("^Close browser$")
	public void Closebrowser() throws Throwable {
		CommonMethods.Browserquit();
	}
}
