package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		driver.findElement(By.id("promtButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		driver.quit();
		
		

	}

}
