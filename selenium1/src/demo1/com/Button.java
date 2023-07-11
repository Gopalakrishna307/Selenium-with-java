package demo1.com;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokoduru\\Documents\\My personal files\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions act=new Actions(driver);
		WebElement link=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(link).perform();
		WebElement rc=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rc).perform();
		WebElement click=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]"));
		act.moveToElement(click);
		act.click();
	//	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")).click();
		//driver.findElement(By.cssSelector("#xc8i7")).click();
		
	}

}
