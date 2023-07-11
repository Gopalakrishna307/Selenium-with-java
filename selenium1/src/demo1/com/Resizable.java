package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/resizable");
		
		
		
		Actions builder = new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.resizable-container:nth-child(2) div.constraint-area div.box.react-resizable > span.react-resizable-handle.react-resizable-handle-se")) ;
		builder.dragAndDropBy(source, 50, 10).perform();
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span[1]")) ;

		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		WebElement source1=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span[1]")) ;
		builder.dragAndDropBy(source1,500,0).perform();
		
		//builder.moveToElement(source1).perform();
	Thread.sleep(2000);
	driver.quit();
	}

}
