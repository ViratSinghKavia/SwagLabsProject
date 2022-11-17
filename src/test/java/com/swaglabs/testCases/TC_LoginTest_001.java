package com.swaglabs.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	
	public void loginTest() {
		
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		logger.info("*********Entered Username*******");
		
		lp.setPassword(password);
		logger.info("*********Entered Password*******");
		
		lp.clickLoginButton();
		logger.info("*********Clicked on Login*******");
		
		String title =driver.getTitle();
		System.out.println("Title of the page is "+ title);
		
		if(driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			logger.info("*********Test Case Passed*******");
		}
		
		else {
			Assert.assertTrue(false);
			logger.info("*********Test Case Failed*******");
		}
		
		
		
		
	}
	


}
