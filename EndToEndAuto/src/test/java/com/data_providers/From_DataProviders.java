package com.data_providers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.library.Config_Reader;

public class From_DataProviders {
	
	public Object[][] data_for_Filling_Form() throws IOException {
//		
		FileInputStream file;
		Object[][] testdata = null;
		try {
			//file = new FileInputStream(Config_Reader.property.getProperty("Execl_File_Path"));
			file = new FileInputStream("C:\\Users\\gokoduru\\Documents\\My personal files\\Pratice Demo\\data for from.xlsx");
			XSSFWorkbook workbook;

			workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int noOfRow = sheet.getLastRowNum();
			int noOfCol = sheet.getRow(0).getLastCellNum();
			 testdata = new Object[noOfRow][noOfCol];
			System.out.println(noOfRow);
//			System.out.println(noOfCol);
			for (int i = 0; i <noOfRow; i++) {
				XSSFRow currentrow = sheet.getRow(i);

				for (int j = 0; j < noOfCol; j++) {
					//String values = currentrow.getCell(j).toString();
					testdata [i][j]= currentrow.getCell(j).toString();
					testdata [i][3]= currentrow.getCell(3).getRawValue();
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
		
	}

}
