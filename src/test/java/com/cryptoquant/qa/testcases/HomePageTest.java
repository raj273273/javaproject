package com.cryptoquant.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cryptoquant.qa.base.TestBase;
import com.cryptoquant.qa.pages.ExchangeFlow;
import com.cryptoquant.qa.pages.HomePage;
import com.cryptoquant.qa.pages.LoginPage;
import com.cryptoquant.qa.pages.NetworkIndicatorPage;
import com.cryptoquant.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testUtil;
	NetworkIndicatorPage networkindicator;
	ExchangeFlow exchangeflow;


	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		networkindicator =new NetworkIndicatorPage() ;
		exchangeflow = new ExchangeFlow();
		
		
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyNetworkindicatorbuttonTest() throws InterruptedException{
		networkindicator= homepage.clickonnetworkIndicatorButton();
		//testUtil.switchToFrame();
		
	}
	
	@Test(priority=3)
	public void verifyExchangeFlowbuttonTest() throws InterruptedException{
		//testUtil.switchToFrame();
		exchangeflow = homepage.clickOnExchangeflow();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
}
