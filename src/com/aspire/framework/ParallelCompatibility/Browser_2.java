package com.aspire.framework.ParallelCompatibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser_2 {
WebDriver driver;
	
	@Test
	public void FirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="ParallelSuite" parallel = "tests">
  <test thread-count="5" name="chrome">
    <classes>
      <class name="com.aspire.framework.ParallelCompatibility.Browser_1"/>
    </classes>
  </test> <!-- parallelTest -->
  <test thread-count="5" name="Firefox">
    <classes>
      <class name="com.aspire.framework.ParallelCompatibility.Browser_2"/>
    </classes>
  </test> <!-- parallelTest -->
</suite> <!-- ParallelSuite -->*/
