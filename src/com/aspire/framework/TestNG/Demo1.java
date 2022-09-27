package com.aspire.framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void TC1()
	{
		Reporter.log("TC1 is running", true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2 is running", true);
	}

}

