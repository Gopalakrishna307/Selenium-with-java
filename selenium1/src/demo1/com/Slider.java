package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");
		WebElement slid=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
		//Actions act=new Actions(slid);
				Actions action = new Actions(driver);
				action. dragAndDropBy(slid,-143,0). perform();
	}

}
