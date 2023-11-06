package com.demowebshopTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	//@Parameters({"email","password"})
	@Test
	public void verifyUserLoginWithCorrectCreditional(/*String email,String pwd*/) {
		//homePage.openLoginPage();
		loginPage.LoginToApplication("sk@am.com","123456" );
		String currentUrl = cmnDriver .getUrl();
		String baseUrl = configProperty.getProperty("baseUrl");
		Assert.assertNotEquals(baseUrl, currentUrl);
	}

}
