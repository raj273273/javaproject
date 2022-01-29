package com.cryptoquant.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cryptoquant.qa.base.TestBase;
import com.cryptoquant.qa.pages.HomePage;
import com.cryptoquant.qa.pages.LoginPage;
public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	
	
	@Test(priority=1)
	public void cryptologoImageTest(){
		boolean flag = loginPage.validateCryptoquantImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void loginTest(){
	homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}}
	
	
	
	

