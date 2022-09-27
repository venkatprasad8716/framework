package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass_listner_propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginTest extends BaseClass {
	WebDriver driver=null;
	Workbook wb;
	Loginpage lp;
	pinPage pp;
	Homepage hp;
	DropDown dd;
	
	@BeforeTest
	public void browserlaunch() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		Browseropen();
		
		 lp= new Loginpage(driver);
			pp = new pinPage(driver);
			 hp= new Homepage(driver);
			 dd = new DropDown(driver);
	}
			 
			@BeforeClass 
		public void logintoapp(String key) throws EncryptedDocumentException, IOException
		{
			//	wb.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue()
        lp.enterUserName(UtilityClass.getpropertyFileData("un"));
		lp.enterPassword(UtilityClass.getpropertyFileData("pwd"));
		lp.clickLoginButton();
		

		pp.enterPin( UtilityClass.getpropertyFileData("pin"));
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
			
			String expIName = UtilityClass.TestData(10 ,4);
			String actIName = hp.verifyInitialName();
			Assert.assertEquals(expIName ,actIName,"please provide correct value");
		UtilityClass.Screenshots(driver);
	}
		@AfterMethod
		public void verifyprofilenavigation(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				UtilityClass.Screenshots(driver);
			}
		hp.profileNavigate();	
		dd.clickonprofile();
		}
		@AfterClass
		public void closebrowser()
		{
		driver.close();
		}
		
	}

