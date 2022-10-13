package com.Workspace.pages;
import org.testng.log4testng.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class WorkspaceDiviceLifecyclePage extends TestBase{
	Logger log = Logger.getLogger(WorkspaceDiviceLifecyclePage.class);
	WorkspaceDiviceLifecyclePage diviceElement;

	public WorkspaceDiviceLifecyclePage()  {
		super();
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		
		waitForTime(3000);
		Multisense();
		waitForTime(2000);
		Workspace();
		waitForTime(2000);
	}
	public void clickonWorkspace() {

		WebElement workspace = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_Workspace")));
		TestUtil.waitforElementTobeLocated(workspace,25);	

		doClick(workspace);
	}

	public void openissueLink() throws InterruptedException{
	
		WebElement  issueLink= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_issueLink")));
		TestUtil.waitforElementTobeLocated(issueLink,25);
		doClick(issueLink);
	}
	public void clickClearAll() throws InterruptedException
	{
		WebElement  clearAll= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_clearAll")));
		TestUtil.waitforElementTobeLocated(clearAll,25);
		doClick(clearAll);
	}
	public void clickApply() throws InterruptedException
	{

		WebElement  apply= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_apply")));
		TestUtil.waitforElementTobeLocated(apply,25);
		doClick(apply);
	}
	public void clickDropdown() throws InterruptedException
	{
		WebElement  dropDown= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_dropDown")));
		TestUtil.waitforElementTobeLocated(dropDown,25);
		doClick(dropDown);
	}
	public void selectType() throws InterruptedException
	{
		WebElement  type= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_type")));
		TestUtil.waitforElementTobeLocated(type,25);
		doClick(type);
	}
	public WebElement verifyText() {
		WebElement verifyexporttaskadded= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("DeviceLifecycle_verifyexporttaskadded")));
		return TestUtil.waitforElementTobeLocated(verifyexporttaskadded,25);

	}
}