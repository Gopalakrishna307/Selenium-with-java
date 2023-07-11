package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokoduru\\Documents\\My personal files\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/links");
		//driver.findElement(By.linkText("Home")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='dynamicLink']")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.);
	//	driver.findElement(By.xpath("//a[@id='created']")).click();
		
		
		/*
		driver.get("https://demoqa.com/webtables");
	  
	    driver.findElement(By.cssSelector(".card:nth-child(1) svg")).click();
	    driver.findElement(By.cssSelector(".show #item-2 > .text")).click();
	    driver.findElement(By.cssSelector(".custom-control:nth-child(3) > .custom-control-label")).click();
	    driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > label")).click();
	    driver.findElement(By.className("custom-control-label")).click();
	    driver.findElement(By.cssSelector(".mt-3")).click();
		 driver.findElement(By.cssSelector(".card:nth-child(1) svg")).click();
	    driver.findElement(By.cssSelector("#edit-record-1")).click();
		    driver.findElement(By.id("addNewRecordButton")).click();
		    driver.findElement(By.id("firstName")).click();
		    driver.findElement(By.id("firstName")).sendKeys("gk");
		    driver.findElement(By.id("lastName")).click();
		    driver.findElement(By.id("lastName")).sendKeys("k");
		    driver.findElement(By.id("userEmail")).click();
		    driver.findElement(By.id("userEmail")).sendKeys("gk@g.com");
		    driver.findElement(By.id("age")).click();
		    driver.findElement(By.id("age")).sendKeys("23");
		    driver.findElement(By.id("salary")).click();
		    driver.findElement(By.id("salary")).sendKeys("23456");
		    driver.findElement(By.id("department")).click();
		    driver.findElement(By.id("department")).sendKeys("mech");
		    driver.findElement(By.id("submit")).click();
		    driver.findElement(By.id("delete-record-4")).click();
		    
		    */
		driver.close();
		driver.quit();

	}

}
