package Loginpage_pagefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginTest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kite.zerodha.com/");
		
		
/* String UNValue = "DP6852";
		String pwdValue = "Pramod@2105";
		String PinValue = "976976"; */
String path = ("G:\\java program\\eclipse examples\\Framework\\Data\\data.xlsx");
	FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		
		String UN = wb.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
		String pwd = wb.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
	String Pin = wb.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue();
		String expIName = wb.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
		boolean exxplogo = wb.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue();
		
		
		Loginpage lp= new Loginpage(driver);
		lp.enterUserName(UN);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		
		pinPage pp = new pinPage(driver);
		pp.enterPin(pwd);
		pp.clickCntBtn();		
		
		Homepage hp= new Homepage(driver);
		hp.verifyLogo();
		hp.verifyInitialName();
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
