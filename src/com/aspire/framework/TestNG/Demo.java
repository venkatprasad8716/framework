package com.aspire.framework.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void BrowserLaunch() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Files\\SeleniumMarch22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);	
	}
	

}

