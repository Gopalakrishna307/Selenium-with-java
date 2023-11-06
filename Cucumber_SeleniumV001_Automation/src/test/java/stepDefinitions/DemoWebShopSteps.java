package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;


public class DemoWebShopSteps {
	
	
	public WebDriver driver;
	public RegisterPage rp;
	
	@Given("User Launch the Firefox Browser")
	public void user_launch_the_firefox_browser() {
		System.setProperty("webdriver.gecko.driver", 
				 System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		rp= new RegisterPage(driver);
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
	   driver.get(url);
	}

	@When("User click on the Register Link")
	public void user_click_on_the_register_link() {
	    rp.clickRegister();
	}

	@When("User enter the gender as {string},first Name as {string},last name as {string}")
	public void user_enter_the_gender_as_first_name_as_last_name_as(String gender, String fname, String lname) {
	   rp.selectGender(gender);
	   rp.setFirstName(fname);
	   rp.setLastName(lname);
	}

	@When("User enter the Email id as {string} and Password as {string}")
	public void user_enter_the_email_id_as_and_password_as(String mailId, String pwd) {
	   rp.setEmailId(mailId);
	   rp.setPassword(pwd);
	}

	@When("click on Register")
	public void click_on_register() {
		rp.clickRegisterBtn();
	    
	}

	@Then("Page Title should be display {string}")
	public void page_title_should_be_display(String title) {
		
		if(driver.getPageSource().contains("Login was Unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
		Assert.assertEquals(title,driver.getTitle());
		}
	}

	@When("User click on log out link")
	public void user_click_on_log_out_link() {
		rp.clickLogoutBtn();
	   
	}
	
	@When("click on Continue btn")
	public void click_on_continue_btn() {
	    rp.clickContinueBtn();
	}

	@When("closed browser")
	public void closed_browser() {
		
	    driver.quit();
	}

}
