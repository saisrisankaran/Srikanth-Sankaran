package com.sample.example;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException {

		try {

			File f = new File("D:\\task\\FramworkClasses\\Datasheet\\Datadrivensamplefile.xlsx");
			FileInputStream fileInputStream = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fileInputStream);
			Sheet sheet = w.getSheet("Sheet1");
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(1);
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

				sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

					             row.getCell(i);
					             String stringCellValue2 = cell.getStringCellValue();
double numericCellValue = cell.getNumericCellValue();
						
				
					             
				
				}

			}
		}catch (Exception e) {

			e.printStackTrace();
		}
	}

}
