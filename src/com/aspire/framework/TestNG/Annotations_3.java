package com.aspire.framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_3 {
	@BeforeClass
	public void m1()
	{
		Reporter.log("m1", true);
	}
	@AfterClass
	public void m2()
	{
		Reporter.log("m2", true);
	}
	@BeforeMethod
	public void m3()
	{
		Reporter.log("m3", true);
	}
	@AfterMethod
	public void m4()
	{
		Reporter.log("m4", true);
	}
	@BeforeTest
	public void m5()
	{
		Reporter.log("m5", true);
	}
	@BeforeGroups
	public void m6()
	{
		Reporter.log("m6", true);
	}
	@BeforeSuite
	public void m7()
	{
		Reporter.log("m7", true);
	}
	@Test
	public void m8()
	{
		Reporter.log("m8", true);
	}
	@Test
	public void m9()
	{
		Reporter.log("m9", true);
	}
	@Test 
	public void m10()
	{
		Reporter.log("m10", true);
	}

//	m7 m6 m5 m1  m3 m10 m4  m3 m8 m4   m3 m9 m4  m2
//  BS BG BT BC BM  @Test AM AC AT AG AS
//	 -4 -3 -2  -1   0   1 2 3 4
}

