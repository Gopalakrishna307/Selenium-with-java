package commonLibs.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DemoScreenshotUtil {

	private TakesScreenshot cam;

	public DemoScreenshotUtil(WebDriver driver) {
		cam = (TakesScreenshot) driver;
	}

	public void captureAndSaveScreenshots(String filename) throws Exception {

		filename = filename.trim();

		File imgFile, tmpFile;

		imgFile = new File(filename);

		if (imgFile.exists()) {
			throw new Exception("File already exit");
		}

		tmpFile = cam.getScreenshotAs(OutputType.FILE);

		FileUtils.moveFile(tmpFile, imgFile);
	}

}
