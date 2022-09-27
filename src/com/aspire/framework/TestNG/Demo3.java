package com.aspire.framework.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Demo3 {
	@Test
	public void TC5()
	{
		Assert.fail();
		Reporter.log("TC5 is running", true);
	}
	@Test
	public void TC6()
	{
		Reporter.log("TC6 is running", true);
	}
	@Test
	public void TC7()
	{
		Reporter.log("TC7 is running", true);
	}

}

