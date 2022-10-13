package com.ConnexoAdmin.pages.AdminServiceCall;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ServiceCallTypePage extends TestBase{
		
	public ServiceCallTypePage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		waitForTime(2000);
		Admin();
		waitForTime(3000);	
	}		
	
	
	public void clickonServicecallType() throws InterruptedException
	{	
		WebElement servicecallType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ServicecallType")));
		TestUtil.waitforElementTobeLocated(servicecallType,20);	
		doClick(servicecallType);
		WebElement servicecallPerPageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_servicecallPerPageDropDown")));
		TestUtil.waitforElementTobeLocated(servicecallPerPageDropDown,20);	
		doClick(servicecallPerPageDropDown);
		WebElement servicecallPerpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ServicecallPerpagevalue")));
		TestUtil.waitforElementTobeLocated(servicecallPerpagevalue,20);	
		doClick(servicecallPerpagevalue);			
	}
	/*
	public void clickonText() 
	{
		TestUtil.waitforElementTobeLocated(verifyText,10);
		doClick(verifyText);
	}
	*/
}
