package commonLibs.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataProviderInExeclSheet {
	
	public Object[][] data_for_Regiser(String excelPath) throws IOException {
		
		FileInputStream file;
		Object[][] testdata = null;
		
			file = new FileInputStream(excelPath);
			//file = new FileInputStream("C:\\Users\\gokoduru\\Documents\\My personal files\\Pratice Demo\\data for from.xlsx");
			XSSFWorkbook workbook;

			workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int noOfRow = sheet.getLastRowNum();
			int noOfCol = sheet.getRow(0).getLastCellNum();
			 testdata = new Object[noOfRow][noOfCol];

			for (int i = 0; i <noOfRow; i++) {
				XSSFRow currentrow = sheet.getRow(i);

				for (int j = 0; j < noOfCol; j++) {
					
					testdata [i][j]= currentrow.getCell(j).toString();
				//	testdata [i][3]= currentrow.getCell(3).getRawValue();
					
				}

			}
		
		return testdata;
		
	}

}
