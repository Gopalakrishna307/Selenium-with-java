package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokoduru\\Documents\\My personal files\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Admin");
		driver.findElement(By.id("userEmail")).sendKeys("Admin@A.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		driver.findElement(By.id("permanentAddress")).sendKeys("Pune");
		driver.findElement(By.id("submit")).submit();
		

		//System.out.println(driver.findElement(By.id("name")));
		
		driver.close();
		driver.quit();
		
	}

}
