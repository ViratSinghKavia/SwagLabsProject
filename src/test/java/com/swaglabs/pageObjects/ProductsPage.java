package com.swaglabs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	WebDriver ldriver;
	
	public ProductsPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	@CacheLookup
	WebElement addToCartBackpack ;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	@CacheLookup
	WebElement addToCartBikeLight ;
	
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	@CacheLookup
	WebElement goToCartButton ;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
	@CacheLookup
	WebElement titleYourCart ;
	
	
	public void addBackPackToCart() {
		addToCartBackpack.click();
	}
	
	public void addBikeLightToCart() {
		addToCartBikeLight.click();
	}
	
	public void goToCart() {
		goToCartButton.click();
	}
	
	public String getTextYourCart() {
		String titleofcart =titleYourCart.getText();
		return titleofcart;
		
	}
	
	
	
	
	

}
