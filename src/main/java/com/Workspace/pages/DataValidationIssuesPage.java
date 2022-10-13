package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataValidationIssuesPage  extends TestBase{	 

	public  DataValidationIssuesPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickDataValidationIssues()
	{
		waitForTime(3000);
		WebElement DataValidationIssues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_DataValidationIssues")));
		TestUtil.waitforElementTobeLocated(DataValidationIssues, 10);
		doClick(DataValidationIssues);
	} 		

	public void ApplyDataValidationIssues(String reason)
	{
		waitForTime(3000);
		WebElement DataValidationIssuesClearAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_DataValidationIssuesClearAll")));
		TestUtil.waitforElementTobeLocated(DataValidationIssuesClearAll, 10);
		doClick(DataValidationIssuesClearAll);
		waitForTime(2000);
		WebElement DataValidationIssuesDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_DataValidationIssuesDropDwon")));
		TestUtil.waitforElementTobeLocated(DataValidationIssuesDropDown, 10);
		doClick(DataValidationIssuesDropDown);
		waitForTime(1000);
//		WebElement DataValidationIssuesDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_DataValidationIssuesDropDwonValue")));
//		doClick(DataValidationIssuesDropDownValue);
//		waitForTime(1000);
		WebElement element =DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+reason+"\")]"));		
		element.click();
		WebElement DataValidationIssuesApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_DataValidationIssuesApply")));
		TestUtil.waitforElementTobeLocated(DataValidationIssuesApply, 10);
		doClick(DataValidationIssuesApply);
	}
}



