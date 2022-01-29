package com.cryptoquant.qa.pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cryptoquant.qa.base.TestBase;

public class HomePage extends TestBase {


	@FindBy(xpath="//span[normalize-space()='Network Indicator']")
	WebElement networkindicatorbutton;

	@FindBy(xpath="//span[normalize-space()='Exchange Flows']")
	WebElement exchangeflowbutton;



	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public NetworkIndicatorPage clickonnetworkIndicatorButton() throws InterruptedException {
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		networkindicatorbutton.click();
		return new NetworkIndicatorPage();

	}

	public ExchangeFlow clickOnExchangeflow() throws InterruptedException{
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		exchangeflowbutton.click();
		return new ExchangeFlow();
	}
}













