package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	public WebDriver ldriver;
	@CacheLookup
	@FindBy(name ="login")
	private WebElement UserId;
	
	@CacheLookup
	@FindBy(name ="password")
	private WebElement userPassword;
	
	@CacheLookup
	@FindBy(xpath ="//input[@value='Sign in']")
	private WebElement loginButton;
	
	@CacheLookup
	@FindBy(linkText  ="Log out")
	private WebElement logoutButton;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void setUserName(String uname) {
		UserId.clear();
		UserId.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		userPassword.clear();
		userPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void clicklogout() {
		logoutButton.click();
	}

}
