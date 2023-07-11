package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/dragabble");
			
			JavascriptExecutor j1s = (JavascriptExecutor)driver;
			String sText = j1s.executeScript("return document.title;").toString();
			System.out.println(sText);
			
			JavascriptExecutor j2s = (JavascriptExecutor)driver;
			String s1Text = j2s.executeScript("return document.documentElement.innerText").toString();
			System.out.println(s1Text);
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//Hover on Automation Menu on the Menu Bar
			js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
			
			Thread.sleep(5000);
			
			WebElement drag=driver.findElement(By.cssSelector("#dragBox"));
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(drag, 50, 0);
			Thread.sleep(5000);
			builder.dragAndDropBy(drag, 50, 20);
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@id='draggableExample-tab-axisRestriction']")).click();
			WebElement xDrag=driver.findElement(By.xpath("//div[@id='restrictedX']"));
			builder.dragAndDropBy(xDrag, 150, 0);
			
			
			//Generate the pop msg
			
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//					js.executeScript("alert('hello world');");
//					
					//refresh the Page
					
//					JavascriptExecutor js1 = (JavascriptExecutor)driver;
//					js1.executeScript("history.go(0)");
					
					
					// to retrieve the inner text content
					
//					JavascriptExecutor j1s = (JavascriptExecutor)driver;
//					String sText = j1s.executeScript("return document.documentElement.innerText;").toString();
//					System.out.println(sText);
					
					
					
//					JavascriptExecutor j1s = (JavascriptExecutor)driver;
//					String sText = j1s.executeScript("return document.title;").toString();
//					System.out.println(sText);
					
					
					
			//JavascriptExecutor
					Thread.sleep(5000);
			driver.quit();

	}

}
