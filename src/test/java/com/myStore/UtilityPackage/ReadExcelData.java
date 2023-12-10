package com.myStore.UtilityPackage;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelData {
	
	public static FileInputStream inputStream;
	public static HSSFWorkbook workBook;
	public static HSSFSheet excelSheet;
	public static HSSFRow row;
	public static HSSFCell cell;
	
	public static String getCellValue(String fileName, String sheetName,int rowNo, int cellNo)
	{
		try
		{
		inputStream=new  FileInputStream(fileName);	
		
		workBook=new HSSFWorkbook(inputStream);
		
		excelSheet=workBook.getSheet(sheetName);
		
		cell =workBook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
		
		workBook.close();
		return cell.getStringCellValue();
		}
		
		catch(Exception e)
		{
			
			return " ";
		}
	}
	
	public static int getRowCount(String fileName, String sheetName) 
	{
		try 
		{
			inputStream=new  FileInputStream(fileName);
			workBook=new HSSFWorkbook(inputStream);
			excelSheet=workBook.getSheet(sheetName);
			
			int totalRows= excelSheet.getLastRowNum()+1;
			workBook.close();
			return totalRows;
			
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}
	
	public static void getColumnCount() 
	{
	
		
	}

}
