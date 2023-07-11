package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UploadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokoduru\\Documents\\My personal files\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		  driver.findElement(By.id("firstName")).click();
		    driver.findElement(By.id("firstName")).sendKeys("gk");
		    driver.findElement(By.id("lastName")).click();
		    driver.findElement(By.id("lastName")).sendKeys("k");
		    driver.findElement(By.id("userEmail")).click();
		    driver.findElement(By.id("userEmail")).sendKeys("gk@g.com");
		    driver.findElement(By.cssSelector(".custom-radio:nth-child(1) > .custom-control-label")).click();
		    driver.findElement(By.id("userNumber")).click();
		    driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		   // driver.findElement(By.id("dateOfBirthInput")).click();
		  //  driver.findElement(By.cssSelector(".react-datepicker__day--011")).click();
		//    driver.findElement(By.cssSelector(".subjects-auto-complete__value-container")).click();
		    driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("acts");
		  //  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/input[1]")).click();
		  //  driver.findElement(By.xpath("#hobbies-checkbox-3")).click();
		    driver.findElement(By.id("currentAddress")).click();
		    driver.findElement(By.id("currentAddress")).sendKeys("Nellore");
		    
		    driver.findElement(By.cssSelector(".custom-checkbox:nth-child(1) > .custom-control-label")).click();
		    driver.findElement(By.cssSelector(".custom-checkbox:nth-child(2)")).click();
		    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\gokoduru\\Downloads\\sampleFile.jpeg");
		    WebElement state= driver.findElement(By.cssSelector("#react-select-3-input"));
		   state .sendKeys("NCR");
		   state .submit();
		   
//		    Select sts = new Select(driver.findElement(By.cssSelector("#state")));
//		    sts.selectByIndex(1);
//		    driver.findElement(By.id("react-select-3-option-0")).click();
//		    driver.findElement(By.id("city")).click();
		   WebElement city= driver.findElement(By.cssSelector("#react-select-4-input"));
		   city .sendKeys("Agra");
		   city .submit();
//		    Select cty = new Select(driver.findElement(By.cssSelector("#city")));
//		    cty.selectByIndex(1);
//		    driver.findElement(By.id("react-select-4-option-0")).click();
		   // driver.findElement(By.cssSelector("#hobbies-checkbox-3")).click();
		   // driver.findElement(By.id("submit")).submit();
//		    driver.findElement(By.id("currentAddress")).sendKeys("Nellore");
		
		
		
		/*driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\gokoduru\\Downloads\\sampleFile.jpeg");
		System.out.println(driver.findElement(By.xpath("//p[@id='uploadedFilePath']")).getText());
	*/
		driver.quit();
	}

}
