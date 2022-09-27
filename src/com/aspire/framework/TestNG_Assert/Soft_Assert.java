package com.aspire.framework.TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	String exp="Selenium";
	String act="Selenium";
	String s=null;
	
	@Test
	public void Hard_Assert()
	{
		Reporter.log("Hard Assert verification starts here", true);
		Assert.assertEquals(exp, act);     //Pass
		Reporter.log("HardAssert verification 1 is executed", true);
		Assert.assertNotEquals(act, exp );   //Fail
		Reporter.log("HardAssert verification 2 is executed", true);
		Assert.assertNull(s);		       //Pass
		Reporter.log("HardAssert verification 3 is executed", true);
	}
	@Test
	public void Soft_Assert()
	{
		SoftAssert soft = new SoftAssert();
		
		Reporter.log("Hard Assert verification starts here", true);
		soft.assertEquals(exp, act);     //Pass
		Reporter.log("HardAssert verification 1 is executed", true);
		soft.assertNotEquals(act, exp );   //Fail
		Reporter.log("HardAssert verification 2 is executed", true);
		soft.assertNull(s);		       //Pass
		Reporter.log("HardAssert verification 3 is executed", true);
		soft.assertAll();	
	}

}
