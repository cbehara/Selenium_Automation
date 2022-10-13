package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class WebservicesPage extends TestBase{

	public WebservicesPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Workspace();
		waitForTime(3000);
	}
	public void issues()
	{ 	 
		WebElement ConnexoWorkspace_WebServices_issues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_WebServices_issues")));
		TestUtil.waitforElementTobeLocated(ConnexoWorkspace_WebServices_issues, 10);		
		doClick(ConnexoWorkspace_WebServices_issues);
		WebElement Reason = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_WebServices_Reason")));
		doClick(Reason);
		sendkeys("Connection failed",Reason);
		Reason.sendKeys(Keys.ENTER);
		Workspace();
	}

	public void webserviceendpointhistory()
	{
		WebElement endpointhistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_WebServices_endpointhistory")));
		TestUtil.waitforElementTobeLocated(endpointhistory, 10);	
		doClick(endpointhistory);
		WebElement Status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_WebServices_Status")));
		doClick(Status);
		sendkeys("Failed",Status);
		Status.sendKeys(Keys.ENTER);
	}
}   
