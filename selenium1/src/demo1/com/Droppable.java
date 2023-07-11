package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");

		// Simple
		WebElement sto = driver.findElement(By.cssSelector("#draggable"));
		WebElement sfrom = driver.findElement(By.cssSelector("#droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(sto, sfrom).perform();
//		builder.moveToElement(sto).clickAndHold().perform();
//		builder.moveToElement(sfrom).perform();
//		builder.moveToElement(sfrom).release().perform();

		// Accept
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
		// WebElement ato=driver.findElement(By.cssSelector("#acceptable"));
		WebElement notAto = driver.findElement(By.cssSelector("#notAcceptable"));
		WebElement afrom = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
		builder.dragAndDrop(notAto, afrom).perform();
		System.out.println(afrom.getText());
		if (afrom.getText() == "Dropped!") {
			System.out.println("It is acceptable....!");
		} else {
			System.out.println("It is not Acceptable...!");
		}

		// Prevent Propagation
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		WebElement pto = driver.findElement(By.cssSelector("#dragBox"));
		WebElement drop = driver.findElement(By.cssSelector("#notGreedyDropBox"));
		WebElement innerdrop = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
		WebElement downMidDrop = driver.findElement(By.cssSelector("#greedyDropBoxInner"));
		WebElement downOuterDrop = driver.findElement(By.cssSelector("#greedyDropBox"));
		
		builder.dragAndDrop(pto, innerdrop).perform();
		builder.dragAndDropBy(pto, 200, 5).perform();
		System.out.println(drop.getText());
		System.out.println(innerdrop.getText());
		System.out.println(downMidDrop.getText());
		
		//Scoll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", downMidDrop);
		Thread.sleep(6000);
		
		//builder.dragAndDropBy(pto, 200, 285).perform();
		builder.dragAndDrop(pto, downMidDrop).perform();
		
		//Revert Draggable
		
		driver.findElement(By.cssSelector("#droppableExample-tab-revertable")).click();
		WebElement rto=driver.findElement(By.cssSelector("#revertable"));
		WebElement frto=driver.findElement(By.cssSelector("#notRevertable"));
		WebElement rdrop=driver.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
		
//		builder.dragAndDrop(rto, rdrop).perform();
//		builder.dragAndDrop(frto, rdrop).perform();
//		
//		builder.dragAndDropBy(frto, 0,0).perform();
		
		builder.moveToElement(sto).clickAndHold().perform();
//		builder.moveToElement(sfrom).perform();
//		builder.moveToElement(sfrom).release().perform();
		
		//System.out.println(downOuterDrop.hashCode());

		Thread.sleep(5000);
		driver.quit();
	}

}
