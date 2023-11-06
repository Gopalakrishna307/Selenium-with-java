package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.gecko.driver", 
				 System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		lp=new LoginPage(driver);
		
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pwd) {
		lp.setUserName(uname);
		lp.setPassword(pwd);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();
		
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	
		if(driver.getPageSource().contains("Login was Unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
		Assert.assertEquals(title,driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws Exception {
		lp.clicklogout();
		Thread.sleep(2000);
	}

	@When("close browser")
	public void close_browser() {
		driver.quit();
	
	}

}
