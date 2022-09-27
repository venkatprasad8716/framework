package com.info.para;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test_param 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
{
		String path = "G:\\java program\\eclipse examples\\Parameterization\\Data\\family2.xlsx";
	FileInputStream f = new FileInputStream(path);	
	
		/*String r1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(r1);
		double r2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(r2);
	
		CellType type = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getCellType();
		System.out.println(type);*/
	Workbook wbook = WorkbookFactory.create(f);
	
	String r1 =wbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue(); 
			System.out.println(r1);
			
			 double r2 = wbook.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
			System.out.println(r2);
			
			int r11 =wbook.getSheet("Sheet1").getLastRowNum();// returns last row index
			short c1 = wbook.getSheet("Sheet1").getRow(0).getLastCellNum();
			
			System.out.println("row count ="+r1+  "column count="+c1);
			
			/*for(int i=0; i<=r11; i++)  //indicates row
			{
				for(int j =0; j<c1; j++)  
				{
					Cell results = wbook.getSheet("Sheet1").getRow(i).getCell(j);
					System.out.println(results+ " || ");
				}
				System.out.println("  ");
			}*/
			
			for(int i=0; i<=r11; i++)  //indicates row
			{
				for(int j =0; j<c1; j++)  
				{
Cell type = wbook.getSheet("Sheet1").getRow(i).getCell(j);
switch(type.getCellType())
{
case STRING : System.out.println(type.getStringCellValue());break;
case NUMERIC : System.out.println(type.getNumericCellValue());break;


}
System.out.println(" || ");
				}
				System.out.println(" ");
			}
}
}