package com.ConnexoAdmin.pages.AdminRelativePeriod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class Admin_DataPurgePage extends TestBase {


	public Admin_DataPurgePage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		waitForTime(2000);
		Admin();
		waitForTime(3000);		
	}	

	public void clickOnPurgeSettingLink()  throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dataPurgePageLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_DataPurgeSettingLink")));
		TestUtil.waitforElementTobeLocated(dataPurgePageLink,10);	
		doClick(dataPurgePageLink);
		waitForTime(1000);

	}

	public void clickDataPurgeSettingLinkAndModify(String Value)  throws InterruptedException
	{
//		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement dataPurgePageLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_DataPurgeSettingLink")));
//		TestUtil.waitforElementTobeLocated(dataPurgePageLink,10);	
//		doClick(dataPurgePageLink);
		waitForTime(1000);
		//SelectAndClick To Modify
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement selectDataToModify = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_DataPurgeValue")));
		TestUtil.waitforElementTobeLocated(selectDataToModify,10);	
		doClick(selectDataToModify);
		waitForTime(100);
		//Clear and inputRequiredText
		WebElement inputText = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_InputValue")));
		TestUtil.waitforElementTobeLocated(inputText,10);
		doClear(inputText);

		waitForTime(1000);
		sendkeys(Value, inputText);
		waitForTime(1000);
		//WebElement ChangeText = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_TextChange")));
		//TestUtil.waitforElementTobeLocated(ChangeText,10);

		waitForTime(100);
		WebElement PurgeValueSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_PurgePageValueSave")));
		doClick(PurgeValueSave);				
	}	

	public void clickDataPurgeHistoryLink()  throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement purgeHistoryPageLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_DataPurgeHistoryLink")));
		TestUtil.waitforElementTobeLocated(purgeHistoryPageLink,10);	
		doClick(purgeHistoryPageLink);
		waitForTime(1000);
	}
}
