package com.Workspace.pages;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WorkspaceServicePage extends TestBase{


	public WorkspaceServicePage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);

	}		

	public void clickonWorkspace() throws InterruptedException{
		Multisense();
		waitForTime(500);
		Workspace();
		waitForTime(500);
		WebElement workspace = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_Workspace")));
		TestUtil.waitforElementTobeLocated(workspace,15);	

		doClick(workspace);
	}
	public void clickonServicecall() throws InterruptedException{
		WebElement servicecall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_servicecall")));
		TestUtil.waitforElementTobeLocated(servicecall,15);
		doClick(servicecall);
	}
	public void clickonclrBtn() throws InterruptedException{
		WebElement  clrBtn= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_clrBtn")));
		TestUtil.waitforElementTobeLocated(clrBtn,10);	
		doClick(clrBtn);}
	public void clickonServiceperpagebutton() throws InterruptedException{
		WebElement servicecallPerPageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_servicecallPerPageDropDown")));	
		TestUtil.waitforElementTobeLocated(servicecallPerPageDropDown,15);	
		doClick(servicecallPerPageDropDown);
		waitForTime(1000);
		WebElement servicecallPerpagevalue= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_servicecallPerpagevalue")));
		TestUtil.waitforElementTobeLocated(servicecallPerpagevalue,10);	
		doClick(servicecallPerpagevalue);
		waitForTime(500);
	}


	public void clickonAuditTrail() {
		WebElement auditTrial = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_auditTrial")));	
		TestUtil.waitforElementTobeLocated(auditTrial,10);
		doClick(auditTrial);
	}
	public void clickonauditTraildropdown() {
		WebElement  auditTrialdropdown= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_auditTrialdropdown")));	
		TestUtil.waitforElementTobeLocated(auditTrialdropdown,15);
		doClick(auditTrialdropdown);
	}
	public void clickonauditTrailChangedby() {
		WebElement  auditTrialChangedby= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_auditTrialChangedby")));	
		TestUtil.waitforElementTobeLocated(auditTrialChangedby,15);
		doClick(auditTrialChangedby);
	}
	public void clickonauditTrailApply() {
		WebElement  auditdropdownApply= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_auditdropdownApply")));
		TestUtil.waitforElementTobeLocated(auditdropdownApply,15);
		doClick(auditdropdownApply);
	}
	//
	//My open issues for Workspace_Service module
	public void clickonService_Myopenissues() {
		WebElement  Service_Myopenissues= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_Service_Myopenissues")));
		TestUtil.waitforElementTobeLocated(Service_Myopenissues,20);
		doClick(Service_Myopenissues);
	}
	public void clickonclearAll() {
		WebElement  clearAll= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_Service_clearAll")));
		TestUtil.waitforElementTobeLocated(clearAll,20);
		doClick(clearAll);
	}
	public void clickontypedropdown() {
		WebElement  typedropdown= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_typedropdown")));
		TestUtil.waitforElementTobeLocated(typedropdown,20);
		doClick(typedropdown);
	}
	public void selectTypemanually() {
		WebElement  manually= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_manually")));
		TestUtil.waitforElementTobeLocated(manually,20);
		doClick(manually);

	}
	public void clickoncollection() {
		WebElement  collection= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_collection")));
		TestUtil.waitforElementTobeLocated(collection,20);
		doClick(collection);
	}
	public void clickonapply() {
		WebElement apply= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceService_apply")));
		TestUtil.waitforElementTobeLocated(apply,20);
		doClick(apply);
	}


}

