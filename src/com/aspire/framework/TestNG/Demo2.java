package com.aspire.framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void TC3()
	{
		Reporter.log("TC3 is running", true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("TC4 is running", true);
	}

}

