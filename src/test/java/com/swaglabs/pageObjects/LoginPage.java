package com.swaglabs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="user-name")
	@CacheLookup
	WebElement txtUserName ;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword ;
	
	@FindBy(name="login-button")
	@CacheLookup
	WebElement buttonlogin;
	
	public void setUsername(String uname) {
		
		txtUserName.sendKeys(uname);
	}
	
	
	public void setPassword(String pwd) {
		
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clickLoginButton() {
		
		buttonlogin.click();
	}
	
	
	
	
	
	
	

}
