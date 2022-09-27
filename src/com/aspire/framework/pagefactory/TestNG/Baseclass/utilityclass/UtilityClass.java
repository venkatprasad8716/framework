package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
static Workbook wb;
static String path;
static FileInputStream file;

	public  static String TestData(int rowIndex , int cellIndex) throws EncryptedDocumentException, IOException 
	{
		path =("\"G:\\java program\\eclipse examples\\Framework\\Data\\data.xlsx\"");
		file = new FileInputStream(path);
		wb = WorkbookFactory.create(file);
		String testvalue = wb.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return testvalue;
	}
	
	public static boolean testdata2(int rowIndex  , int cellIndex)
	{
		boolean testdata2 = wb.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue();
		return testdata2;
	}
	public  static void Screenshots(WebDriver driver, int ssid) throws IOException
{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File desc = new File("G:\\java program\\eclipse examples\\Framework\\ScreenShot\\"+ssid+".jpg");
		 FileHandler.copy(src, desc);
		 
	}
}
