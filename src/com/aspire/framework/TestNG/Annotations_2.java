package com.aspire.framework.TestNG;


	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class Annotations_2 
	{
		@Test
		public void m1()
		{
			Reporter.log("m1", true);
		}

	}

