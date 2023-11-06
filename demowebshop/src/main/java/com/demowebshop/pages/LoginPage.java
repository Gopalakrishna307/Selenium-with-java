package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	@CacheLookup
	@FindBy(id  ="Email")
	private WebElement email_Id;
	
	@CacheLookup
	@FindBy(name ="Password")
	private WebElement emailPassword;
	
	@CacheLookup
	@FindBy(className  ="button-1 login-button")
	private WebElement loginButton;
	
	@CacheLookup
	@FindBy(className   ="button-1 register-button")
	private WebElement registerButton;
	
	@CacheLookup
	@FindBy(linkText  ="Forgot password?")
	private WebElement forgotPwdLink;
	
	@CacheLookup
	@FindBy(name ="RememberMe")
	private WebElement rememberMeCheckBox;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void LoginToApplication(String emailId, String password) {
		//elementControl.setText(email_Id, emailId );
		//email_Id.sendKeys(emailId);
		elementControl.setText(emailPassword, password);
		elementControl.clear(loginButton);
	}

}
