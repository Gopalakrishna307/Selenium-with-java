package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/sortable");
		Actions builder = new Actions(driver);

		for (int i = 1, j = 6; j > i; j--) {
			WebElement from = driver.findElement(By.cssSelector("#demo-tabpane-list > div > div:nth-child("+i+")"));
			WebElement to = driver.findElement(By.cssSelector("#demo-tabpane-list > div > div:nth-child("+j+")"));
			
			builder.dragAndDrop(from, to).perform();
		}
		
		
		Thread.sleep(2000);
//		//Operate grid link
		
		driver.findElement(By.cssSelector("#demo-tab-grid")).click();
		
		for (int i = 1, j = 9; j > i; j--) {
			WebElement from = driver.findElement(By.cssSelector("#demo-tabpane-grid > div > div > div:nth-child("+i+")"));
			WebElement to = driver.findElement(By.cssSelector("#demo-tabpane-grid > div > div > div:nth-child("+j+")"));
			
			builder.dragAndDrop(from, to).perform();
			
		}
//		for(int i=1,j=6;j>i;j--){
//			
//			 {
//			      WebElement element = driver.findElement(By.cssSelector("#demo-tabpane-list > div > div:nth-child("+i+")"));
//			     // Actions builder = new Actions(driver);
//			      builder.moveToElement(element).clickAndHold().perform();
//			    }
//			    {
//			      WebElement element = driver.findElement(By.cssSelector("#demo-tabpane-list > div > div:nth-child("+j+")"));
//			     // Actions builder = new Actions(driver);
//			      builder.moveToElement(element).perform();
//			    }
//			    {
//			      WebElement element = driver.findElement(By.cssSelector("#demo-tabpane-list > div > div:nth-child("+j+")"));
//			    //  Actions builder = new Actions(driver);
//			      builder.moveToElement(element).release().perform();
//			    }
//			    Thread.sleep(200);
//			
//		}
//		Thread.sleep(2000);
//		//Operate grid link
//		
//		driver.findElement(By.cssSelector("#demo-tab-grid")).click();
//		
//		for(int k=1,l=9;l>k;l--){
//			
//			 {
//			      WebElement element = driver.findElement(By.cssSelector("#demo-tabpane-grid > div > div > div:nth-child("+k+")"));
//			      //Actions builder = new Actions(driver);
//			      builder.moveToElement(element).clickAndHold().perform();
//			    }
//			    {
//			      WebElement element = driver.findElement(By.cssSelector("#demo-tabpane-grid > div > div > div:nth-child("+l+")"));
//			     // Actions builder = new Actions(driver);
//			      builder.moveToElement(element).perform();
//			    }
//			    {
//			      WebElement element = driver.findElement(By.cssSelector("#demo-tabpane-grid > div > div > div:nth-child("+l+")"));
//			      //Actions builder = new Actions(driver);
//			      builder.moveToElement(element).release().perform();
//			    }
//			
//			    Thread.sleep(200);
//		}

		
		Thread.sleep(2000);
		driver.quit();

	}

}
