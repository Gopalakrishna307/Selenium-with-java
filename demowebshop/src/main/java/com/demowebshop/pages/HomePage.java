package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	@CacheLookup
	@FindBy(linkText  ="Register")
	private WebElement register_link;
	
	@CacheLookup
	@FindBy(linkText  ="Log in")
	private WebElement login_link;
	
	@CacheLookup
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	private WebElement shopping_cart;
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void openRegisterPage() {
		elementControl.clickElement(register_link);
	}
	
	public void openLoginPage() {
		elementControl.clickElement(login_link);
	}
	

}
