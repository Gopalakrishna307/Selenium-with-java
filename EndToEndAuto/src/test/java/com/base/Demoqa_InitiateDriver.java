package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.library.Config_Reader;

public class Demoqa_InitiateDriver {
protected static WebDriver driver;
	
	public static WebDriver start_Browser() {
		Config_Reader.read_fromDetails_Data();
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\java\\com\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(Config_Reader.property.getProperty("Application_URL"));
		return driver;
	}
	
	public static void end_Browser() {
		driver.close();
	}

}
