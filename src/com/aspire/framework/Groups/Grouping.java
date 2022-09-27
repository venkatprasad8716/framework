package com.aspire.framework.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="SignIn")
	public void m1()
	{
		Reporter.log("1", true);
	}
	@Test(groups="Payment")
	public void m2()
	{
		Reporter.log("2", true);
	}
	@Test (groups="SignIn")
	public void m3()
	{
		Reporter.log("3", true);
	}
	@Test (groups="Order")
	public void m4()
	{
		Reporter.log("4", true);
	}
	@Test (groups="addToCart")
	public void m5()
	{
		Reporter.log("5", true);
	}
	@Test (groups="Order")
	public void m6()
	{
		Reporter.log("6", true);
	} 
	@Test (groups="Order")
	public void m7()
	{
		Reporter.log("7", true);
	}
	@Test (groups="SignIn")
	public void m8()
	{
		Reporter.log("8", true);
	}
// SignIn=3  Order=3  addToCart=1   Payment=1
}

/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="GroupsSuite">
<groups>
<run>
          <include name="SignIn"/>
           <include name="Order"/>
            <exclude name="addToCart"/>
            <include name ="Payment"/>
          </run>
        </groups>
  <test thread-count="5" name="GroupsTest">
    <classes>
      <class name="com.aspire.framework.Groups.Grouping"/>
    </classes>
  </test> <!-- GroupsTest -->
</suite> <!-- GroupsSuite -->
*/
