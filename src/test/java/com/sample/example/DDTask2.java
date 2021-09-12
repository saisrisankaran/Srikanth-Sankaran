package com.sample.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTask2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\task\\FramworkClasses\\Datasheet\\Datadrivensamplefile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.getSheet("sheet1");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Srikanth Sankaran");	
		Cell createCell2 = createRow.createCell(1);
							
		
		FileOutputStream  fo = new FileOutputStream(f);
	w.write(fo);	
	}
}
