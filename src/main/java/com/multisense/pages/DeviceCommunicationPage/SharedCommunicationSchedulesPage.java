
package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class SharedCommunicationSchedulesPage extends TestBase {


	String SharedCommunicationSchedulesNameValue= generateRandomName(9);
	String UpdatedSharedCommunicationSchedulesNameValue= generateRandomName(10);


	public SharedCommunicationSchedulesPage() 
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(3000);
		Administration();
		waitForTime(3000);
	}
	public void clickonsharedCommunicationSchedule()
	{  
		WebElement ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedule")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedule, 10);    
		doClick(ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedule);             
	}

	public String gettextofsharedCommunicationSchedule()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_SharedComSchedPage_verifySharedCommunicationSchedule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifySharedCommunicationSchedule")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_verifySharedCommunicationSchedule, 10);
		return getText(ConnexoMultisense_SharedComSchedPage_verifySharedCommunicationSchedule);
	}
	public void clickonAddSharedCommunicationSchedule()
	{
		WebElement ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedulePerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedulePerpage")));
		if(ConnexoMultisense_SharedComSchedPage_sharedCommunicationSchedulePerpage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add shared communication schedule')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add shared communication schedule')]//ancestor::a)[1]")).click();
		}
	}
	public void AddSCSCommunicationTask()
	{
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName, 10);
		doClear(ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName);
		sendkeys(SharedCommunicationSchedulesNameValue, ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName);
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_SCSCommuncationTaskAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_SCSCommuncationTaskAdd")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_SCSCommuncationTaskAdd, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_SCSCommuncationTaskAdd);
	}

	public void CheckandaddSCSCommunicationTask()
	{
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_RadioSCSCommuncationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_RadioSCSCommuncationTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_RadioSCSCommuncationTask, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_RadioSCSCommuncationTask);
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_CheckBoxSCSCommuncationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_CheckBoxSCSCommuncationTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_CheckBoxSCSCommuncationTask, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_CheckBoxSCSCommuncationTask);
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_CreateSCSCommuncationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_CreateSCSCommuncationTask")));
		doClickjavaScript(ConnexoMultisense_SharedComSchedPage_CreateSCSCommuncationTask);
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_AddsharedCommunicationSchedule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_AddsharedCommunicationSchedule")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_AddsharedCommunicationSchedule, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_AddsharedCommunicationSchedule);                 
	}

	public void ClonesharedCommunicationSchedule()
	{
		waitForTime(10000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ SharedCommunicationSchedulesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(5000);
		WebElement ConnexoMultisense_SharedComSchedPage_CloneSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_CloneSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_CloneSCS, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_CloneSCS);
	}

	public void CreateClonesharedCommunicationSchedule()
	{
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName, 10);
		doClear(ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName);
		sendkeys(UpdatedSharedCommunicationSchedulesNameValue,ConnexoMultisense_SharedComSchedPage_sharedCommunicationScheduleName);
		waitForTime(10000);
		WebElement ConnexoMultisense_SharedComSchedPage_CloneSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_CloneSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_CloneSCS, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_CloneSCS);
	}

	public void removeClonesharedCommunicationSchedule()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ UpdatedSharedCommunicationSchedulesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_SharedComSchedPage_removeSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_removeSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_removeSCS, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_removeSCS);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdatedSharedCommunicationSchedulesNameValue +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}

	public void removesharedCommunicationSchedule()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ SharedCommunicationSchedulesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_SharedComSchedPage_removeSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_removeSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_removeSCS, 10);
		doClick(ConnexoMultisense_SharedComSchedPage_removeSCS);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ SharedCommunicationSchedulesNameValue +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}

	public String gettextofAddsharedCommunicationSchedule()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_SharedComSchedPage_verifytextAddSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextAddSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_verifytextAddSCS, 10);
		return getText(ConnexoMultisense_SharedComSchedPage_verifytextAddSCS);
	}
	public String gettextofClonesharedCommunicationSchedule()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_SharedComSchedPage_verifytextCloneSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextCloneSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_verifytextCloneSCS, 10);
		return getText(ConnexoMultisense_SharedComSchedPage_verifytextCloneSCS);
	}

	public String gettextofSavesharedCommunicationSchedule()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_SharedComSchedPage_verifytextSaveSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextSaveSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_verifytextSaveSCS, 10);
		return getText(ConnexoMultisense_SharedComSchedPage_verifytextSaveSCS);
	}

	public String gettextofRemovesharedCommunicationSchedule()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_SharedComSchedPage_verifytextremoveSCS = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextremoveSCS")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_SharedComSchedPage_verifytextremoveSCS, 10);
		return getText(ConnexoMultisense_SharedComSchedPage_verifytextremoveSCS);
	}

}

