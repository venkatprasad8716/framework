package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginTest extends BaseClass {
	WebDriver driver=null;
	Workbook wb;
	Loginpage lp;
	pinPage pp;
	Homepage hp;
	
	@BeforeTest
	public void browserlaunch() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		Browseropen();
		
		 lp= new Loginpage(driver);
			pp = new pinPage(driver);
			 hp= new Homepage(driver);
	}
			 
			@BeforeClass 
		public void logintoapp() throws EncryptedDocumentException, IOException
		{
			//	wb.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue()
        lp.enterUserName(UtilityClass.TestData(10 ,1));
		lp.enterPassword(UtilityClass.TestData(10 ,2));
		lp.clickLoginButton();
		

		pp.enterPin( UtilityClass.TestData(10 ,3));
		pp.clickCntBtn();	
		}
		@Test
	public void verificationoflogo()
	{
		hp.verifyLogo(UtilityClass.testdata2(10, 6));
	}
		@Test
	public void verificationofinitias() throws EncryptedDocumentException, IOException
	{
			int ssid = 10;
			String expIName = UtilityClass.TestData(10 ,4);
			String actIName = hp.verifyInitialName();
			Assert.assertEquals(expIName ,actIName,"please provide correct value");
		UtilityClass.Screenshots(driver , ssid );
	}
		@AfterClass
		public void closebrowser()
		{
		driver.close();
		}
		
	}

