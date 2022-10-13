package com.ConnexoAdmin.pages.ProcessManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ProcessesPage  extends TestBase{	
	
	String ProcessName = prop.getProperty("ConnexoAdmin_ProcessesPage_strProcessName");	
		
	public ProcessesPage() throws InterruptedException
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(5000);
	}
	
	public void clickonProcesses() throws InterruptedException
	{		
		WebElement ConnexoAdmin_ProcessesPage_Processes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_Processes")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ProcessesPage_Processes, 10);
		doClick(ConnexoAdmin_ProcessesPage_Processes);
		catchCFT1000Alert();
 	}
	
	 public void activateProcess()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ProcessName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000); 
		WebElement ConnexoAdmin_ProcessesPage_activateProcesses = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_activateProcesses")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ProcessesPage_activateProcesses, 10);
		doClick(ConnexoAdmin_ProcessesPage_activateProcesses);
			 
	} 
	
	public void clickonEditProcess()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ProcessName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_ProcessesPage_EditProcesses = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_EditProcesses")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ProcessesPage_EditProcesses, 10);
		doClick(ConnexoAdmin_ProcessesPage_EditProcesses);	
	}
	
	public void ClickonInstockandSave()
	{		
		try {
			waitForTime(3000);
			WebElement ConnexoAdmin_ProcessesPage_UnCheckedInstock = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_UnCheckedInstock")));
			doClick(ConnexoAdmin_ProcessesPage_UnCheckedInstock);			
		}
		catch (NoSuchElementException e) {
			waitForTime(3000);
			WebElement ConnexoAdmin_ProcessesPage_CheckedInstock = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_CheckedInstock")));
			doClick(ConnexoAdmin_ProcessesPage_CheckedInstock);
			waitForTime(3000);
			WebElement ConnexoAdmin_ProcessesPage_UnCheckedInstock = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_UnCheckedInstock")));
			doClick(ConnexoAdmin_ProcessesPage_UnCheckedInstock);
		}
		waitForTime(3000);
		WebElement ConnexoAdmin_ProcessesPage_saveProcess = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_saveProcess")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ProcessesPage_saveProcess, 10);
		doClick(ConnexoAdmin_ProcessesPage_saveProcess);
	}
	
	 public void DeactivateProcess()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ProcessName +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConnexoAdmin_ProcessesPage_deactivateProcesses = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ProcessesPage_deactivateProcesses")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_ProcessesPage_deactivateProcesses, 10);
			doClick(ConnexoAdmin_ProcessesPage_deactivateProcesses);
		} 
}
