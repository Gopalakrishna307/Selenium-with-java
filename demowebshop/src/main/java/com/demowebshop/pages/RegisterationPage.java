package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage {
	
	
	@CacheLookup
	@FindBy(id = "gender-male")
	private WebElement gender_male;
	
	@CacheLookup
	@FindBy(id = "gender-female")
	private WebElement gender_female; 
	
	@CacheLookup
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@CacheLookup
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@CacheLookup
	@FindBy(id = "Email")
	private WebElement email_id;
	
	@CacheLookup
	@FindBy(id = "Password")
	private WebElement newPassword;
	
	@CacheLookup
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword;
	
	@CacheLookup
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	
	public RegisterationPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void registerToApplication(String gender,String first_name,String last_name,String email,String password) {
		String m="male";
		String f="female";
		
		if(gender.equalsIgnoreCase(m)) {
			elementControl.clickElement(gender_male);;
		}else if(gender.equalsIgnoreCase(f)) {
			elementControl.clear(gender_female);
		}
		elementControl.setText(firstName, first_name);
		elementControl.setText(lastName, last_name);
		elementControl.setText(email_id, email);
		elementControl.setText(newPassword, password);
		elementControl.setText(confirmPassword, password);
		elementControl.clickElement(registerButton);
	
	}

}
