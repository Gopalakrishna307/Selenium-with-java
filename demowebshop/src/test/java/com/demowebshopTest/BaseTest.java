package com.demowebshopTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.RegisterationPage;

import commonLibs.implementation.CommonDriver;
import commonLibs.implementation.ElementControl;
import commonLibs.utils.DataProviderInExeclSheet;
import commonLibs.utils.DemoConfigUtil;
import commonLibs.utils.DemoScreenshotUtil;

public class BaseTest {
	String url;
	String browserType;
	String excelPath;
	CommonDriver cmnDriver;
	WebDriver driver;
	LoginPage loginPage;
	RegisterationPage regPage;
	HomePage homePage;

	ElementControl elementControl;

	String configFilename;
	String currentWorkingDirectory;
	Properties configProperty;
	DemoScreenshotUtil screenCap;
	DataProviderInExeclSheet dpe;

	@BeforeSuite
	public void demopreSetup() throws Exception {
		currentWorkingDirectory = System.getProperty("user.dir");
		configFilename = currentWorkingDirectory + "\\democonfig\\demoConfig.properties";
		
		configProperty = DemoConfigUtil.readProperties(configFilename);
		
		
		
	}

	@BeforeClass
	public void demoSetup() throws Exception {
		url = configProperty.getProperty("baseUrl");
		browserType = configProperty.getProperty("browserType");
		excelPath=currentWorkingDirectory+"\\execlFiles\\Register.";

		cmnDriver = new CommonDriver(browserType);
		dpe = new DataProviderInExeclSheet();
		
		regPage = new RegisterationPage(driver);
		loginPage = new LoginPage(driver);
		screenCap = new DemoScreenshotUtil(driver);
		
		cmnDriver.navigateToUrl(url);
	}

	@AfterMethod
	public void postTestAction(ITestResult result) throws Exception {

		String testcasename = result.getName();

		long executionTime = System.currentTimeMillis();

		String fail_screenshotsFilename = currentWorkingDirectory + "\\screenCapture\\FAilED_Status\\" + testcasename
				+ executionTime + ".jpeg";
		if (result.getStatus() == ITestResult.FAILURE) {

			Thread.sleep(5000);
			screenCap.captureAndSaveScreenshots(fail_screenshotsFilename);

		}

		else {

			Thread.sleep(500);
			String pass_screenshotsFilename = currentWorkingDirectory + "\\screenCapture\\PASS_Status\\" + testcasename
					+ executionTime + ".jpeg";
			screenCap.captureAndSaveScreenshots(pass_screenshotsFilename);
		}
	}

	@AfterClass
	public void tearDown() {
		cmnDriver.closeAllBrowser();
	}

}
