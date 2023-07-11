package com.test_cases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.InitiateDriver;
import com.library.Config_Reader;

public class LoginPage extends InitiateDriver{
	

	@Test
	public static void user_Name() throws InterruptedException {
		driver=start_Browser();
		//driver.findElement(By.cssSelector("#tab2")).click();
		driver.findElement(By.name("fld_username")).sendKeys(Config_Reader.property.getProperty("User_name"));
		driver.findElement(By.name("fld_email")).sendKeys(Config_Reader.property.getProperty("Email_Id"));
		Thread.sleep(2000);
		driver.close();

	}
}
