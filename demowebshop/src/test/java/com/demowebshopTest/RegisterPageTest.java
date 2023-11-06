package com.demowebshopTest;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class RegisterPageTest extends BaseTest {
	
	
	@DataProvider(name = "data1")
	public Object[][] data_Provider() throws IOException {
		
		return dpe.data_for_Regiser(excelPath);

	}
	
	@DataProvider(name = "data1")
	@Test
	public void verifyUserRegisterToThePage(String firstname,String lastname,String gender,String email,String pwd) {
		
		homePage.openRegisterPage();
		regPage.registerToApplication(gender, email, firstname, lastname, pwd);
		String currentUrl = cmnDriver .getUrl();
		
		Assert.assertNotEquals(url, currentUrl);
	}
	

}
