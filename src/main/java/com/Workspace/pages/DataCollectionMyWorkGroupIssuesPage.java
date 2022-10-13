package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataCollectionMyWorkGroupIssuesPage extends TestBase{

	public  DataCollectionMyWorkGroupIssuesPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickDataCollectionMyWorkGroupIssues()
	{
		waitForTime(3000);
		WebElement DataCollectionMyWorkGroupIssues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMWGIssues_DataCollectionMyWorkGroupIssues")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyWorkGroupIssues, 10);
		doClick(DataCollectionMyWorkGroupIssues);
	} 		

	public void ApplyDataCollectionMyWorkGroupIssuesConnectionIssue(String reason)
	{
		waitForTime(3000);
		WebElement DataCollectionMyWorkGroupIssuesClearAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMWGIssues_DataCollectionMyWorkGroupIssuesClearAll")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyWorkGroupIssuesClearAll, 10);
		doClick(DataCollectionMyWorkGroupIssuesClearAll);
		waitForTime(2000);
		WebElement DataCollectionMyWorkGroupIssuesDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMWGIssues_DataCollectionMyWorkGroupIssuesDropDown")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyWorkGroupIssuesDropDown, 10);
		doClick(DataCollectionMyWorkGroupIssuesDropDown);
		waitForTime(1000);
//		WebElement DataCollectionMyWorkGroupIssuesDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMWGIssues_DataCollectionMyWorkGroupIssuesDropDownValue")));
//		doClick(DataCollectionMyWorkGroupIssuesDropDownValue);
//		waitForTime(1000);
		WebElement element =DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+reason+"\")]"));		
		element.click();	
		WebElement DataCollectionMyWorkGroupIssuesApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMWGIssues_DataCollectionMyWorkGroupIssuesApply")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyWorkGroupIssuesApply, 10);
		doClick(DataCollectionMyWorkGroupIssuesApply);
	}
}
