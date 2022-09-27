package Loginpage_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinPage {
	@FindBy (xpath="//input[contains(@placeholder,'PIN')]") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement continuebtn;

	public pinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// enter pin 
	public void enterPin(String PinValue)
	{
		pin.sendKeys(PinValue);
//		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
	}
		
	// click on COntinue
	public void clickCntBtn()
	{
		continuebtn.click();
	}
}
