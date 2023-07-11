package demo1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrograssBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");
		String res="40%";
		
		driver.findElement(By.id("startStopButton")).click();
		while(true) {
			String per=driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body"
					+ " div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) div.progress"
					+ " > div.progress-bar.bg-info")).getText();
			
			if(per.equals(res)) {
				break;
			}
			
		}
		
		driver.findElement(By.id("startStopButton")).click();
		Thread.sleep(500);
		//*[@id="progressBar"]/div
		
		driver.quit();

	}

}
