package com.test_cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Demoqa_InitiateDriver;
import com.data_providers.From_DataProviders;
import com.google.common.io.Files;
import com.pages.From_Methods;

import functions_behaviour.Functions;

public class TC_003_Validate_From_Filling {

	@DataProvider(name = "data1")
	public Object[][] data_Provider() throws IOException {
		From_DataProviders f = new From_DataProviders();
		return f.data_for_Filling_Form();

	}
	static int i=1;

	@Test(dataProvider = "data1")
	public void fromDetails(String firstName, String lastName, String emailId, String ph_no, String gender, String date,
			String address, String subjects, String picPath, String state, String city) throws InterruptedException, IOException {
		WebDriver driver = Demoqa_InitiateDriver.start_Browser();

		From_Methods fm = new From_Methods();
		fm.user_FristName(firstName);
		fm.user_LastName(lastName);
		fm.user_EmailId(emailId);
		fm.user_Moblie_Number(ph_no);
		fm.user_Gender(gender);
		Functions f = new Functions();
		fm.user_Date_Of_Brith(f.date_Funtion(date));
		fm.user_Current_Address(address);

		// String sub[]= {"English","Hindi","Maths"};
		fm.user_Subjects(f.subjects_Function(subjects));

		// It is not working.............
		// fm.user_Hobbies_Sports();
		// fm.user_Hobbies_Music();

		fm.user_Upload_Picture(picPath);
		fm.user_State(state);
		fm.user_City(city);
		fm.submit_Funtion();
		
		Thread.sleep(500);
		
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("C:\\Users\\gokoduru\\eclipse-workspace\\EndToEndAuto\\Screenshots\\formDetails"+i+".jpeg"));
		i++;
//		

		// Thread.sleep(50000);

		Demoqa_InitiateDriver.end_Browser();

	}

}
