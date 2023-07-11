package checkingErrors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Trasfer_checking {
	@Test(dataProvider = "name")
	public void name(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9,
			String s10, String s11) {
		System.out.println(s1);
		System.out.println(s2);

	}

	@DataProvider(name = "name")
	public Object[][] namename() throws IOException {
//		
		FileInputStream file;
		Object[][] testdata = null;
		try {
			file = new FileInputStream(
					"C:\\Users\\gokoduru\\Documents\\My personal files\\Pratice Demo\\data for from.xlsx");

			XSSFWorkbook workbook;

			workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int noOfRow = sheet.getLastRowNum();
			int noOfCol = sheet.getRow(0).getLastCellNum();
			 testdata = new Object[noOfRow][noOfCol];
			System.out.println(noOfRow);
			System.out.println(noOfCol);
			for (int i = 0; i < noOfRow; i++) {
				XSSFRow currentrow = sheet.getRow(i);

				for (int j = 0; j < noOfCol; j++) {
					//String values = currentrow.getCell(j).toString();
					testdata [i][j]= currentrow.getCell(j).toString();
					//System.out.println(values);
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdata;
		
//		

	}

}
