package com.sample.example;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel2 {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			
		File f = new File("D:\\task\\FramworkClasses\\Datasheet\\Datadrivensamplefile.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(file);
		Sheet sheet = w.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType==1) {
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}else if (DateUtil.isCellDateFormatted(cell)) {
				
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat();
				String format2 = format.format(dateCellValue);
				System.out.println(format2);
			}else {
				
				double numericCellValue = cell.getNumericCellValue();
				String valueOf = String.valueOf(numericCellValue);
				System.out.println(valueOf);
			}
		}	
			
		}		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}