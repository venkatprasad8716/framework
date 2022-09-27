package com.zerodha.kite.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (xpath="//input[@id='userid']") private WebElement UN;
	@FindBy (xpath="//input[@id='password']")private WebElement pwd;
	@FindBy (xpath="//button[@type='submit']")private WebElement loginbtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		
	}
	
	
	 //Enter User Id
	       public void enterUserName(String userName)
	       {
	    	   UN.sendKeys(userName);
	    	   
//	    	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");	    	   
	       }
	//Enter Password
	       public void enterPassword(String password)
	       {
	    	   pwd.sendKeys(password);
//	    	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
			  
	       }			
	// Click on Login
	       public void clickLoginButton()
	       {
	    	   loginbtn.click();
//	    	   driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	       }
			

}
