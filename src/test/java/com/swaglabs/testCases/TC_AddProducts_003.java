package com.swaglabs.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.pageObjects.LoginPage;
import com.swaglabs.pageObjects.ProductsPage;

public class TC_AddProducts_003 extends BaseClass {
	
	@Test
	
	public void AddProducts() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		logger.info("*******Logging into site*****");
	
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLoginButton();
		driver.manage().window().maximize();
		
		logger.info("******Succesfully Logged In********");
		
		
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		logger.info("******Page is refreshed********");
		
		ProductsPage pp = new ProductsPage(driver);
		
		logger.info("****Adding items to Cart*****");
		
		pp.addBackPackToCart();
		pp.addBikeLightToCart();
		pp.goToCart();
		
		Thread.sleep(3000);
		
		logger.info("*****Sucessfully added items to Cart******");
		
		
		if(pp.getTextYourCart().contains("YOUR CART")){
			Assert.assertTrue(true);
			logger.info("******TestCase Passed Wohoooooo******");
			
		}
		else {
			Assert.assertTrue(false);
			logger.info("******TestCase Failed******");
		}
		
		
		
		
		
		
	}

}
