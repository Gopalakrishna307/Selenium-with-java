package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Select {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokoduru\\Documents\\My personal files\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
	//	Select row = new Select();
		WebElement text=driver.findElement(By.cssSelector("#react-select-2-input"));
		text.sendKeys("Group 2, option 1");
		text.sendKeys(Keys.ENTER);
		WebElement one=driver.findElement(By.cssSelector("#react-select-3-input"));
		one.sendKeys("Dr.");
//		one.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		one.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		one.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
		
		one.sendKeys(Keys.ENTER);
		org.openqa.selenium.support.ui.Select col=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("oldSelectMenu")));
		col.selectByVisibleText("Green");
		WebElement mult=driver.findElement(By.cssSelector("#react-select-4-input"));
		
		mult.sendKeys("blue");
		mult.sendKeys(Keys.ENTER);
		
		mult.sendKeys("green");
		mult.sendKeys(Keys.ENTER);
		 
		mult.sendKeys("red");
		mult.sendKeys(Keys.ENTER);
	
		//driver.findElement(By.className("css-2613qy-menu")).click();
	//	driver.findElement(By.cssSelector("#withOptGroup")).click();
		//driver.findElement(By.className("css-2613qy-menu")).click();
	//	driver.findElement(By.cssSelector("//div[contains(text(),'Group 2, option 1')]")).click();
		org.openqa.selenium.support.ui.Select car=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("cars")));
		car.selectByVisibleText("Volvo");
		car.selectByVisibleText("Saab");
		Thread.sleep(500);
		driver.quit();

	}

}
