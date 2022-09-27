package com.aspire.framework.FailedXml_SkipTC;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedXmlFileCreate {
	@Test
	public void m1()
	{
		Reporter.log("1", true);
		Assert.fail();
	}
	@Test
	public void m2()
	{
		Reporter.log("2", true);
	Assert.fail();
	}
	@Test
	public void m3()
	{
		Reporter.log("3", true);
	Assert.fail();
	}
	@Test
	public void m4()
	{
		Reporter.log("4", true);
	}

}

/*// testing
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="FailedxmlSuite">
  <test thread-count="5" name="FailedxmlTest">
    <classes>
      <class name="com.aspire.framework.FailedXml_SkipTC.SkipTestCases"/>
      <class name="com.aspire.framework.FailedXml_SkipTC.FailedXmlFileCreate"/>
     <class name="com.aspire.framework.TestNG_Assert.Soft_Assert"/>
    </classes>
  </test> <!-- FailedxmlTest -->
</suite> <!-- FailedxmlSuite -->
*/

/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Failed suite [FailedxmlSuite]" guice-stage="DEVELOPMENT">
  <test thread-count="5" name="FailedxmlTest(failed)">
    <classes>
      <class name="com.aspire.framework.TestNG_Assert.Soft_Assert">
        <methods>
          <include name="Hard_Assert"/>
          <include name="Soft_Assert"/>
        </methods>
      </class> <!-- com.aspire.framework.TestNG_Assert.Soft_Assert -->
      <class name="com.aspire.framework.FailedXml_SkipTC.FailedXmlFileCreate">
        <methods>
          <include name="m3"/>
          <include name="m2"/>
          <include name="m1"/>
        </methods>
      </class> <!-- com.aspire.framework.FailedXml_SkipTC.FailedXmlFileCreate -->
    </classes>
  </test> <!-- FailedxmlTest(failed) -->
</suite> <!-- Failed suite [FailedxmlSuite] -->

*/