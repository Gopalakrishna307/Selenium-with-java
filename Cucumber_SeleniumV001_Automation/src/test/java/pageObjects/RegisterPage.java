package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@CacheLookup
	@FindBy(linkText = "Register")
	private WebElement clickRegisterlink;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement clickMaleRadiobtn;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='gender-female']")
	private WebElement clickfemaleRadiobtn;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstName;
	
	@CacheLookup
	@FindBy(xpath  ="//input[@id='LastName']")
	private WebElement lastName;
	
	@CacheLookup
	@FindBy(xpath  ="//input[@id='Email']")
	private WebElement emailId;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@CacheLookup
	@FindBy(xpath  ="//input[@id='ConfirmPassword']")
	private WebElement conpassword;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement registerbtn;
	
	@CacheLookup
	@FindBy(linkText ="Log out")
	private WebElement logoutBtn;
	
	@CacheLookup
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBtn;
	
	
	public WebDriver sdriver;
	
	public RegisterPage(WebDriver tdriver) {
		sdriver=tdriver;
		PageFactory.initElements(tdriver,this );
		
	}
	
	public void clickRegister() {
		clickRegisterlink.click();
	}
	
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			clickMaleRadiobtn.click();
		}else if(gender.equalsIgnoreCase("female")) {
			clickfemaleRadiobtn.click();
		}else {
			System.out.println("Enter the valid gender");
		}
	}
	
	public void setFirstName(String fName) {
		firstName.clear();
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		lastName.clear();
		lastName.sendKeys(lName);
		
	}
	
	public void setEmailId(String mail) {
		emailId.clear();
		emailId.sendKeys(mail);
		
	}
	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
		
		conpassword.clear();
		conpassword.sendKeys(pwd);
		
	}
	public void clickRegisterBtn() {
		
		registerbtn.click();
		
	}
	
	public void clickContinueBtn() {
		continueBtn.click();;
	}
	
	public void clickLogoutBtn() {
		logoutBtn.click();
	}
	

}
