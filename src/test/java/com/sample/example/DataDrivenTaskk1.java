package com.sample.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;

public class DataDrivenTaskk1 {

	public static void main(String[] args) throws IOException, AWTException {
		
		File file = new File("D:\\task\\FramworkClasses\\Datasheet\\datadriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.getSheet("SrikanthRamya");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Srikanth");
		Row createRow2 = createSheet.createRow(1);
		Cell createCell2 = createRow2.createCell(0);
		createCell2.setCellValue("Sriram");
		Row createRow3 = createSheet.createRow(2);
		Cell createCell3 = createRow3.createCell(0);
		createCell3.setCellValue("SrkanthRamya");
		Row createRow4 = createSheet.createRow(3);
		Cell createCell4 = createRow4.createCell(0);
		createCell4.setCellValue("RamyaSrikanth");
		Row createRow5 = createSheet.createRow(4);
		Cell createCell5 = createRow5.createCell(0);
		createCell5.setCellValue("Meeow");
		FileOutputStream fos = new FileOutputStream(file);
		w.write(fos);
		int lastRowNum = createSheet.getLastRowNum();
		for (int i = 0; i < createSheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = createSheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
		
		}
		createCell.setAsActiveCell(); 
	}
}
