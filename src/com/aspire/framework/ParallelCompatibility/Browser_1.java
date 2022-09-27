package com.aspire.framework.ParallelCompatibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_1 {
WebDriver driver;
	
	@Test
	public void ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
}
