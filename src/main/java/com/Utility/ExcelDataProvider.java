package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	 XSSFWorkbook wb;
 public ExcelDataProvider() throws Exception  {

 String path="C:\\Users\\lenovo\\eclipse-workspace\\Framework_Project\\TestData\\Data.xlsx";
 FileInputStream fis=new FileInputStream(path);
  wb=new XSSFWorkbook(fis);
 
  }

  public String getStringData(String Sheetname,int Row,int cell) {
return  wb.getSheet(Sheetname).getRow(Row).getCell( cell).getStringCellValue();
 
 
  }
 
}
