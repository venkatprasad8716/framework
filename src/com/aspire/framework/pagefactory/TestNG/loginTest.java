package com.aspire.framework.pagefactory.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginTest {
	WebDriver driver=null;
	Workbook wb;
	Loginpage lp;
	pinPage pp;
	Homepage hp;
	
	@BeforeTest
	public void browserlaunch() throws EncryptedDocumentException, IOException 
	{
		String filepath = "G:\\java program\\eclipse examples\\Framework\\Data\\data.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		wb = WorkbookFactory.create(file);
		 lp= new Loginpage(driver);
			pp = new pinPage(driver);
			 hp= new Homepage(driver);
	}
			 
			@BeforeClass 
		public void logintoapp()
		{
        lp.enterUserName(wb.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue());
		lp.enterPassword(wb.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue());
		lp.clickLoginButton();
		

		pp.enterPin( wb.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue());
		pp.clickCntBtn();	
		}
		@Test
	public void verificationoflogo()
	{
		hp.verifyLogo(wb.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue());
	}
		@Test
	public void verifyinitials()
	{
		hp.verifyInitialName(wb.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue());
	}
		@AfterClass
		public void closebrowser()
		{
		driver.close();
		}
		
}

