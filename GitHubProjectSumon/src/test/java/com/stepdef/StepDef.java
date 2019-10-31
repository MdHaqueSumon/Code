package com.stepdef;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import com.comon.Comon;
import com.pageobjectmodel.PageObjectModel;
import com.screenshot.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	PageObjectModel pf;
		
	@Given("^user be able to open a browser$")
	public void user_be_able_to_open_a_browser() throws Throwable {
		driver=Comon.getbrowser("chrome", driver);   
	}
	@Given("^go to home page$")
	public void go_to_home_page() throws Throwable {
		driver.get(Comon.getURL());
		
	    
	    ScreenShot.ss(driver, "home");
	}

	@When("^i click on singin$")
	public void i_click_on_singin() throws Throwable {
		
		pf.SingInButton();
		ScreenShot.ss(driver, "Button");
	    
	    
	}

	@When("^i enter valid user name$")
	public void i_enter_valid_user_name() throws Throwable {
		pf.getEmail().sendKeys("asiful_haque4@yahoo.com");
		pf.getEmail().sendKeys(Keys.ENTER);
		ScreenShot.ss(driver, "UseerName");
	
	    
	    
	}

	@When("^i enter valid password$")
	public void i_enter_valid_password() throws Throwable {
		pf.getPassword().sendKeys("Irin568889");
		pf.getPassword().sendKeys(Keys.ENTER);
		ScreenShot.ss(driver, "Pass");
		
	    
	    
	}

	@When("^i click Sing In button$")
	public void i_click_Sing_In_button() throws Throwable {
		
	    
	    
	}

	@Then("^I successfully Sing in$")
	public void i_successfully_Sing_in() throws Throwable {
	    
	    ScreenShot.ss(driver, "Sing in");
	   
	}



}
