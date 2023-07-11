package checkingErrors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_import {

	public static void main(String[] args) {

		FileInputStream file;
		try {
			file = new FileInputStream(
					"C:\\Users\\gokoduru\\Documents\\My personal files\\Pratice Demo\\data for from.xlsx");

			XSSFWorkbook workbook;

			workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int noOfRow = sheet.getLastRowNum();
			int noOfCol = sheet.getRow(0).getLastCellNum();
			//Object[][] testdata = new Object[noOfRow][noOfCol];
			System.out.println(noOfRow);
			System.out.println(noOfCol);
			for (int i = 1; i < noOfRow; i++) {
				XSSFRow currentrow = sheet.getRow(i);

				for (int j = 0; j < noOfCol; j++) {
					String values = currentrow.getCell(j).toString();
					System.out.println(values);
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
