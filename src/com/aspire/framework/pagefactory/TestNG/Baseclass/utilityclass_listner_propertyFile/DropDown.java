package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass_listner_propertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown {

	@FindBy (xpath="(//a[@href='/profile'])[2]") private WebElement profile;
	
	public DropDown(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonprofile()
	{
		profile.click();
	}
}
