package commonLibs.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDriver {
	
	private WebDriver driver;
	private int pageLoadTimeout;
	private int elementDetectionTimeout;
	private String currentWorkingDirectory;
	
	public CommonDriver(String browserType) throws Exception {
		pageLoadTimeout=10;
		elementDetectionTimeout=10;
		currentWorkingDirectory=System.getProperty("user.dir");
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\gokoduru\\eclipse-workspace\\demowebshop\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.chrome.driver", 
					currentWorkingDirectory + "\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", 
					currentWorkingDirectory + "\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			throw new Exception("Invalid Browser Type "+browserType);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	public void navigateToUrl(String url) {
		
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setPageLoadTimeout(int pageLoadTimeout) {
		this.pageLoadTimeout=pageLoadTimeout;
		
	}
	public void setElementDetectionTimeout(int elementDetectionTimeout) {
		this.elementDetectionTimeout=elementDetectionTimeout;
		
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	public String getTittleOfThePage() {
		return driver.getTitle();
	}
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	

}
