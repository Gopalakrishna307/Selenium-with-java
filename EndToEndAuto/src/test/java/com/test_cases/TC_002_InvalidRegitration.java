package com.test_cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.InitiateDriver;
import com.library.Config_Reader;

public class TC_002_InvalidRegitration extends InitiateDriver {
	@Test
	public void enter_PassWord() {
		driver=start_Browser();
		driver.findElement(By.name("fld_password")).sendKeys(Config_Reader.property.getProperty("PassWord"));
		driver.close();
	}

}
