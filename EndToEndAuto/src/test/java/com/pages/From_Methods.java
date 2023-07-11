package com.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Demoqa_InitiateDriver;
import com.library.Config_Reader;

public class From_Methods extends Demoqa_InitiateDriver {

	public static void user_FristName(String fristName) {

		driver.findElement(By.id(Config_Reader.property.getProperty("User_FirstName_Id"))).sendKeys(fristName);

	}

	public static void user_LastName(String lastName) {

		driver.findElement(By.id(Config_Reader.property.getProperty("User_LastName_Id"))).sendKeys(lastName);

	}

	public static void user_EmailId(String emailId) {

		driver.findElement(By.xpath(Config_Reader.property.getProperty("User_EmailId_Xpath"))).sendKeys(emailId);

	}

	public static void user_Gender(String gen) {
		String gender = gen;
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath(Config_Reader.property.getProperty("Gender_Male_Xpath"))).click();

		}

		else if (gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath(Config_Reader.property.getProperty("Gender_Female_Xpath"))).click();

		} else
			driver.findElement(By.xpath(Config_Reader.property.getProperty("Gender_Others_Xpath"))).click();

	}

	public static void user_Moblie_Number(String number) {

		driver.findElement(By.xpath(Config_Reader.property.getProperty("Moblie_number_Xpath"))).sendKeys(number);

	}

	public static void user_Date_Of_Brith(String dateArray[]) {
		String brithYear=dateArray[2];
		String month=dateArray[1];
		String sdate=dateArray[0];
		int date =Integer.parseInt(sdate);
		

		driver.findElement(By.xpath(Config_Reader.property.getProperty("InputDate_Xpath"))).click();
		Select year = new Select(driver.findElement(By.xpath(Config_Reader.property.getProperty("Brith_Year"))));
		year.selectByVisibleText(brithYear);
		Select mon = new Select(driver.findElement(By.xpath(Config_Reader.property.getProperty("Birth_Month"))));
		mon.selectByVisibleText(month);
		driver.findElement(By.xpath("//div[contains(text(),'" + date + "')]")).click();

	}

	public static void user_Subjects(String subjectName[]) {
		String[] s = subjectName;
		WebElement city = driver.findElement(By.xpath(Config_Reader.property.getProperty("Subject_Xpath")));

		for (int i = 0; i <= s.length-1; i++) {

			city.sendKeys(s[i]);
			city.sendKeys(Keys.ENTER);
		}
	}

	public static void user_Hobbies_Sports() {

		driver.findElement(By.cssSelector(Config_Reader.property.getProperty("Hobbies_Sports_cssSelector"))).click();

	}

	public static void user_Hobbies_Reading() {

		driver.findElement(By.cssSelector(Config_Reader.property.getProperty("Hobbies_Reading_cssSelector"))).click();

	}

	public static void user_Hobbies_Music() {

		driver.findElement(By.cssSelector(Config_Reader.property.getProperty("Hobbies_Music_cssSelector"))).click();

	}

	public static void user_Upload_Picture(String path) {

		driver.findElement(By.xpath(Config_Reader.property.getProperty("Select_Picture_Xpath"))).sendKeys(path);

	}

	public static void user_Current_Address(String address) {

		driver.findElement(By.xpath(Config_Reader.property.getProperty("Current_Address_Xpath"))).sendKeys(address);

	}

	public static void user_State(String stateName) {

		WebElement state = driver.findElement(By.cssSelector(Config_Reader.property.getProperty("state_cssSelector")));
		state.sendKeys(stateName);
		state.sendKeys(Keys.ENTER);
	}

	public static void user_City(String cityName) {

		WebElement city = driver.findElement(By.cssSelector(Config_Reader.property.getProperty("city_cssSelector")));
		city.sendKeys(cityName);
		city.sendKeys(Keys.ENTER);

	}

	public static void submit_Funtion() {

		driver.findElement(By.id(Config_Reader.property.getProperty("submit_Id"))).submit();

	}

}
