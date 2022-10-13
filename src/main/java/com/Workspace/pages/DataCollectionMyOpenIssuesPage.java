package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataCollectionMyOpenIssuesPage extends TestBase{

	public  DataCollectionMyOpenIssuesPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickDataCollectionMyOpenIssues()
	{
		waitForTime(3000);
		WebElement DataCollectionMyOpenIssues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMOpenIssues_DataCollectionMyOpenIssues")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyOpenIssues, 10);
		doClick(DataCollectionMyOpenIssues);
	} 		

	public void ApplyMyOpenIssuesConnectionIssue(String reason)
	{
		waitForTime(3000);
		WebElement DataCollectionMyOpenIssuesClearAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMOpenIssues_DataCollectionMyOpenIssuesClearAll")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyOpenIssuesClearAll, 10);
		doClick(DataCollectionMyOpenIssuesClearAll);
		waitForTime(2000);
		WebElement DataCollectionMyOpenIssuesDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMOpenIssues_DataCollectionMyOpenIssuesDropDown")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyOpenIssuesDropDown, 10);
		doClick(DataCollectionMyOpenIssuesDropDown);
		waitForTime(1000);
//		WebElement DataCollectionMyOpenIssuesDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMOpenIssues_DataCollectionMyOpenIssuesDropDownValue")));
//		doClick(DataCollectionMyOpenIssuesDropDownValue);
		WebElement element =DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+reason+"\")]"));		
		element.click();	
		
		waitForTime(1000);
		WebElement DataCollectionMyOpenIssuesApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCMOpenIssues_DataCollectionMyOpenIssuesApply")));
		TestUtil.waitforElementTobeLocated(DataCollectionMyOpenIssuesApply, 10);
		doClick(DataCollectionMyOpenIssuesApply);
	}
}
