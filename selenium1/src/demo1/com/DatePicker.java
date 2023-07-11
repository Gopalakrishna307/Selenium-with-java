package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		String my="February 1997";
		String month="February";
		String y="1997";
		int date=21;
		String time="23:45";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(5000);
		
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
		year.selectByVisibleText(y);
		
		Select mon=new Select(driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
		mon.selectByVisibleText(month);
//		while (true) {
//			String text=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
//			if(text.equals(my)) {
//				break;
//			}
//			else {
//				driver.findElement(By.xpath("//button[contains(text(),'Previous Month')]")).click();
//				
//			}
//		
//		}
		driver.findElement(By.xpath("//div[contains(text(),'"+date+"')]")).click();
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
//		Select year1=new Select(driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
//		year1.selectByVisibleText(y);
//		
//		Select mon1=new Select(driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
//		mon1.selectByVisibleText(month);
		
		while (true) {
			String text=driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
			if(text.equals(my)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//button[contains(text(),'Previous Month')]")).click();
				
			}
		
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'"+date+"')]")).click();
		
		driver.findElement(By.xpath("//li[contains(text(),'"+time+"')]")).click();
		driver.quit();
	}

}
