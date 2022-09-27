package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_frame_work {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		//Enter User Id
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
		Thread.sleep(2000);
		
		// Click on Login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		// enter pin 
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
		Thread.sleep(2000);
		// click on COntinue
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//1. TO verify Logo
		
		 WebElement actLogo = driver.findElement(By.xpath("//img[@alt='Kite logo']"));  //true
		boolean expLogo = actLogo.isDisplayed();
		if (expLogo == true)
		{
			System.out.println("Logo verification test case is Pass");
		}
		else
		{
			System.out.println("Logo verification test case is Fail");
		}
		
		//2 To verify Initials
		String expInitialName = "PM";
		String actInitialName = driver.findElement(By.xpath("//div[@class='avatar']")).getText();
		if (expInitialName.equals(actInitialName))
		{
			System.out.println("Initial Name verification test case is Pass");
		}
		else
		{
			System.out.println("Initial Name verification test case is Fail");
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
