package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcealClassDemo { 
	
	public static void main(String[]args) throws Throwable {
	
	
	
	FileInputStream fis= new FileInputStream ("file of excel file");
	
	Workbook wb = WorkbookFactory.create(fis); 
	
	
	Sheet s= wb.getSheet("");
	
	
	String value=s.getRow(0).getCell(0).getStringCellValue();
	System.out.println("value :"+value);
	
	
	
	
	
	
	
	
	
	
}
}
