package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	WebDriver driver;
	public PageObjectModel (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);//this key word for current class and Super key Word for parent class.
	}
	
	
@FindBy	(id="uh-signin")

private WebElement SingInButton;
public WebElement SingInButton() {
	return SingInButton;
}
@FindBy	(xpath="//*[@id='login-username']")
private WebElement Email;
public WebElement getEmail() {
	return Email;
}
@FindBy	(xpath="//*[@id='login-passwd']")
private WebElement Password;
public WebElement getPassword() {
	return Password;
}
@FindBy	(xpath="//*[@id='login-signin']")
private WebElement SingIn;
public WebElement getSingIn() {
	return SingIn;
}


}
