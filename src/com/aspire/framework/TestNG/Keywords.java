package com.aspire.framework.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords {
		@Test (invocationCount=3)
		public void TC1()
	{
			Reporter.log("TC1 is running", true);
		}
	@Test(invocationCount=2)
	public void TC2()	
	{
			Reporter.log("TC2 is running", true);
		}
	@Test (priority=10)
		public void TC3()
		{
		Reporter.log("TC3 is running", true);
	}
	@Test (priority=-1)
	public void TC4() 
	{
			Reporter.log("TC4 is running", true);		}
		
	@Test (priority=-2)
	public void TC5() 
	{
		Reporter.log("TC5 is running", true);
	}
		
	@Test(priority=-10)
		public void TC6() 
	{
		Reporter.log("TC6 is running", true);
	}
@Test (enabled=false)
	public void TC7() 
		{
			Reporter.log("TC7 is running", true);
		}
		@Test (priority=10)		public void TC8() 
	{
		Reporter.log("TC8 is running", true);
	}
		@Test 
		public void TC9()
		{
		Assert.fail();
			Reporter.log("TC9 is running", true);
		}
	@Test (timeOut=1000)
	public void TC10() throws InterruptedException 		{
		Thread.sleep(2000);
			Reporter.log("TC10 is running", true);
	}
		@Test
		public void login()
		{
			Assert.fail();
			Reporter.log("Login to application", true);
		}
		@Test (dependsOnMethods= {"login","TC9"})
		public void logout()
		{
			Reporter.log("Logout from application", true);
		}

}
