package com.cryptoquant.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cryptoquant.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement signupbutton;
	
	@FindBy(xpath="//img[@alt='cryptoquant-logo']")
	WebElement websitelogo;
	
	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public boolean validateCryptoquantImage() {
		return websitelogo.isDisplayed();
	}
	
	public HomePage login(String em, String pw) {
		
		email.sendKeys(em);
		password.sendKeys(pw);
		submitbutton.click();
		
		return new HomePage();
	}
	
	
	

}
