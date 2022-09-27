package com.aspire.framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
	@Test
	public void TestCase1()
	{
//		System.out.println("My Test Case-1 is Running");
		Reporter.log("Test case-1 is pass and execution is successful", true);
	}
	
	@Test
	public void TestCase2()
	{
//		System.out.println("My Test Case-2 is Running");
		Reporter.log("Test case-2 is pass and execution is successful", true);
	}

}
