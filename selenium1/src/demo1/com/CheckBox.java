package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokoduru\\Documents\\My personal files\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div/button[1]")).click();
		 //driver.findElement(By.cssSelector(".rct-icon-expand-all > path")).click();
//		    driver.findElement(By.cssSelector(".rct-node:nth-child(1) > ol > .rct-node:nth-child(1) .rct-node:nth-child(1) .rct-checkbox > .rct-icon")).click();
//		   driver.findElement(By.cssSelector(".rct-node:nth-child(2) .rct-node:nth-child(1) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")).click();
//		    driver.findElement(By.cssSelector(".rct-node:nth-child(2) .rct-node:nth-child(1) .rct-node:nth-child(1) .rct-checkbox > .rct-icon")).click();
//		    driver.findElement(By.cssSelector(".rct-node:nth-child(3) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")).click();
//		    //driver.findElement(By.id("tree-node-private")).click();
//		    driver.findElement(By.cssSelector(".rct-node:nth-child(2) .rct-node:nth-child(2) .rct-node:nth-child(1) .rct-checkbox > .rct-icon")).click();
//
		driver.findElement(By.cssSelector(".rct-node:nth-child(2) > ol > .rct-node:nth-child(3) .rct-node:nth-child(1) .rct-checkbox > .rct-icon")).click();
	    driver.findElement(By.cssSelector(".rct-node:nth-child(3) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")).click();
	}

}
