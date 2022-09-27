package com.aspire.framework.FailedXml_SkipTC;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTestCases {
	@Test (enabled=false)
	public void m1()
	{
		Reporter.log("1", true);
		Assert.fail();
	}
	@Test
	public void m2()
	{
		Reporter.log("2", true);
	}
	@Test
	public void m3()
	{
		Reporter.log("3", true);
	}
	@Test
	public void m4()
	{
		Reporter.log("4", true);
	}

}
/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite_SkipTc">
  <test thread-count="5" name="Test_SkipTC">
    <classes>
      <class name="com.aspire.framework.FailedXml_SkipTC.SkipTestCases">
       <methods>
          <exclude name="m2"/>
          <exclude name="m3"/>
       </methods>
      </class>       
    </classes>
  </test> <!-- Test_SkipTC -->
</suite> <!-- Suite_SkipTc -->
*/