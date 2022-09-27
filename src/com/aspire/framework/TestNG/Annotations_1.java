package com.aspire.framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations_1 {
	
		//launch Browser
		@BeforeClass
		public void BrowserLaunch()
		{
			Reporter.log("BrowserLaunch TC is successful",true);
		}
//		enter email
		@AfterMethod
		public void enterEmail()
		{
			Reporter.log("enterEmail TC is successful",true);
		}
//		enter password
		@AfterClass
		public void enterPassword()
		{
			Reporter.log("enterPassword TC is successful",true);
		}
//		click on login
		@Test
		public void ClickLoginBtn()
		{
			Reporter.log("ClickLoginBtn TC is successful",true);
		}
		
//		verify user
		@Test
		public void verifyUser()
		{
			Reporter.log("verifyUser TC is successful",true);
		}
		

	
	
}
