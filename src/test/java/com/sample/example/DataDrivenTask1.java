package com.sample.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTask1 { 

	public static void main(String[] args) throws IOException {
	try {
		
		HSSFWorkbook w = new HSSFWorkbook();
		HSSFSheet createSheet = w.createSheet();
		createSheet.createRow(0);
		createSheet.getRow(0).createCell(0).setCellValue("Srikanth");
		createSheet.getRow(0).createCell(1).setCellValue("Sankaran");
		createSheet.createRow(1);
		createSheet.getRow(1).createCell(0).setCellValue("hellow");
		createSheet.getRow(1).createCell(1).setCellValue("world");
	
		File f = new File("C:\\Users\\Srikanth\\Desktop\\Selenium CLass\\test.xlsx");
		w.writeProtectWorkbook("Sri", "Sri");
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
