package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 static WebDriver driver = null;
	
	public  static void Browseropen() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(2000);

}
}