package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ConnectionWorkspacePage extends TestBase{	

	public ConnectionWorkspacePage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Workspace();
		waitForTime(3000);
	}
	public void clickonConnection()
	{ 	
		WebElement connections = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection")));			
		TestUtil.waitforElementTobeLocated(connections, 10);	
		doClick(connections);		
	}

	public void clickonstatusdropdown(String stat, String Lastres)
	{
		WebElement pagevaluedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_pagevaluedropdown")));
		doClick(pagevaluedropdown);
		WebElement pagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_pagevalue")));
		doClick(pagevalue);
		waitForTime(20000);
		WebElement Status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_Status")));
		TestUtil.waitforElementTobeLocated(Status, 10);
		doClick(Status);
		doClear(Status);
		sendkeys(stat, Status);
		Status.sendKeys(Keys.ENTER);
		waitForTime(3000);
//
//		WebElement LastResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_LastResult")));
//		TestUtil.waitforElementTobeLocated(LastResult, 10);			
//		doClick(LastResult);
//		doClear(LastResult);
//		sendkeys(Lastres, LastResult);
//		Status.sendKeys(Keys.ENTER);
//		WebElement Applybutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_Applybutton")));
//		TestUtil.waitforElementTobeLocated(Applybutton, 10);
//		doClick(Applybutton);
	}

	public void ClickOnBulkAction()
	{
		waitForTime(12000);
		WebElement BulkActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_BulkActions")));
		doClick(BulkActions);
		waitForTime(12000);
		WebElement SelectedConnections = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_SelectedConnections")));
		doClick(SelectedConnections);
		WebElement checkbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_checkbox")));
		doClick(checkbox);
		WebElement Nextbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_Nextbutton")));
		doClick(Nextbutton);
		WebElement Runnowradiobutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_Runnowradiobutton")));
		doClick(Runnowradiobutton);
		doClick(Nextbutton);
		WebElement Confirmbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_Confirmbutton")));
		doClick(Confirmbutton);
		WebElement Finishbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_Finishbutton")));
		doClick(Finishbutton);

	}

	public void Registereddevices() {

		Workspace();
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Registered devices']")).click();
	}

}
