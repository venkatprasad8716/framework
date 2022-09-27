package com.aspire.framework.TestNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_1 {
	String exp="Selenium";
	String act="Selenium";
	String s=null;
	boolean a= true;
	boolean b= true;
	boolean c= false;
	
		@Test
		public void TC1()
		{
			
//		if (exp.equals(act))
//		{
//			Reporter.log("Test case is Pass", true);
//		}
//		else
//		{
//			Reporter.log("Test case is Fail", true);
//		}
			
			Assert.assertEquals(exp, act, "Provide correct values for strings");
	   }
		
		@Test
		public void TC2()
		{
			Assert.assertNotEquals(exp, act, "Provide different strings to get your test case pass");
		}
		@Test
		public void TC3()
		{
			Assert.assertTrue(a, "Please provide True Value");
		}
		@Test
		public void TC4()
		{
			Assert.assertFalse(b, "Please provide True Value");
		}
		@Test
		public void TC5()
		{
			Assert.assertNull(s, "Provide null value");
		}
		@Test
		public void TC6()
		{
			Assert.assertNotNull(exp, "Provide null value");
		}
		@Test
		public void TC7()
		{
			Assert.assertNotNull(exp, "Provide null value");
			Assert.fail();
		}
		
}
