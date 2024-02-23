package com.qa.stepdefinitions;

import org.junit.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomepageStepdefinition extends TestBase{
	
	
	LoginPage LoginPage;
	HomePage Homepage;
	


	@Given("^User opens browser$")
	public void user_opens_browser() {
	   TestBase.Initialization();
	   
	}
	@Then("^User is on the login page$")
	public void user_is_on_the_login_page() {
		LoginPage = new LoginPage();
		String pagetitle = LoginPage.ValidateLoginPageTitle();
	   Assert.assertEquals("#1 Free CRM Power Up your Entire Business Free Forever", pagetitle);
	}
	@Then("^User enters the UN and PW$")
	public void user_enters_the_un_and_pw() {
	   Homepage = LoginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	
	@Then("^Validate HomePage Title$")
	public void validate_home_page_title() {
	   String HomepaageTitle = Homepage.VerifyHomePageTitle();
	   Assert.assertEquals("Cogmento CRM", HomepaageTitle);
	}
	@Then("^Validate Username on page$")
	public void validate_username_on_page() {
	   Boolean b = Homepage.VerifyMyNameOnHomePage();
	   Assert.assertTrue(b);
	}



	
	
	
	

}
