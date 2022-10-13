package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationWorkspacePage extends TestBase{

	String communicationPortPoolNameValue= generateRandomName(8);

	@FindBy(xpath = "//span[text()='Communications']")
	public
	WebElement communications;

	public CommunicationWorkspacePage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Workspace();
		waitForTime(3000);
	}
	
	public void clickonCommunications()
	{ 	 
		WebElement communications = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication")));
		TestUtil.waitforElementTobeLocated(communications, 10);	
		doClick(communications);		
	}

	public void clickonstatusdropdown(String stat, String Lastres)
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Clear all']/following-sibling::span")).click();
		WebElement pagevaluedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_pagevaluedropdown")));
		doClick(pagevaluedropdown);
		WebElement pagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_pagevalue")));
		doClick(pagevalue);
		waitForTime(20000);
		WebElement Status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_Status")));
		TestUtil.waitforElementTobeLocated(Status, 60);
		doClick(Status);
		doClear(Status);
		sendkeys(stat, Status);
		Status.sendKeys(Keys.ENTER);
		waitForTime(3000);

//		WebElement LastResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_LastResult")));
//		TestUtil.waitforElementTobeLocated(LastResult, 60);			
//		doClick(LastResult);
//		doClear(LastResult);
//		sendkeys(Lastres, LastResult);
//		LastResult.sendKeys(Keys.ENTER);
//		WebElement Applybutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_Applybutton")));
//		TestUtil.waitforElementTobeLocated(Applybutton, 10);
//		doClick(Applybutton);
	}

	public void ClickOnBulkAction()
	{
		waitForTime(7000);
		WebElement BulkActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_BulkActions")));
		doClick(BulkActions);
		waitForTime(7000);
		WebElement SelectedCommunications = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_SelectedCommunications")));
		doClick(SelectedCommunications);
		WebElement checkbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_checkbox")));
		doClick(checkbox);
		WebElement Nextbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_Nextbutton")));
		doClick(Nextbutton);
		WebElement Runnowradiobutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_Runnowradiobutton")));
		doClick(Runnowradiobutton);
		doClick(Nextbutton);
		WebElement Confirmbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_Confirmbutton")));
		doClick(Confirmbutton);
		WebElement Finishbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_communication_Finishbutton")));
		doClick(Finishbutton);

	}

}
