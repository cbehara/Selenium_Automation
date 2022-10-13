package com.ConnexoAdmin.pages.UserSecuritySettingsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class UserSecuritySettingsPage extends TestBase {   
	
	public  UserSecuritySettingsPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}
				
	
	public void clickUserSecuritySettings() throws InterruptedException
	{
		browserRefresh();
		waitForTime(5000);
		try 
		{
			WebElement UserSecuritySettings = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_UserSecuritySettingsLink")));
			doClick(UserSecuritySettings);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public boolean isUserSecuritySettingsDisplayed() {
		waitForTime(1000);
		WebElement UserSecuritySettings = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_UserSecuritySettingsLink")));
		return UserSecuritySettings.isDisplayed();
	}
	public void clickSaveButton()
	{
		waitForTime(2000);
		WebElement AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_saveButton")));
		TestUtil.waitforElementTobeLocated(AddButton, 10);
		doClick(AddButton);
	}
	
	public void clickCancelButton()
	{
		waitForTime(5000);
		WebElement AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_cancelButton")));
		TestUtil.waitforElementTobeLocated(AddButton, 10);
		doClickjavaScript(AddButton);
	}
	
	public void clickActivateAccountLockingCheckbox()
	{
		if (!isEnabled("ConnexoAdmin_UserSecuritySettings_maxFailedLoginAttempts")) {
			WebElement ActivateAccountLockingCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_activateAccountLockingCheckbox")));
			TestUtil.waitforElementTobeLocated(ActivateAccountLockingCheckbox, 20);
			sendKeyMyCheck(ActivateAccountLockingCheckbox);
			waitForTime(5000);
		}
		else {
			browserRefresh();
		}
	}
	
	public boolean isActivateAccountLockingCheckboxEnabled()
	{
		waitForTime(3000);
		WebElement ActivateAccountLockingCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_activateAccountLockingCheckbox")));
		return ActivateAccountLockingCheckbox.isEnabled();
	}
	
	public boolean isMaxFailedLoginAttemptsEnabled()
	{
		waitForTime(3000);
		WebElement maxFailedLoginAttempts = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_maxFailedLoginAttempts")));
		return maxFailedLoginAttempts.isEnabled();
	}
	
	public boolean isActivateAccountLockingCheckboxDisplayed()
	{
		waitForTime(3000);
		WebElement ActivateAccountLockingCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_activateAccountLockingCheckbox")));
		return ActivateAccountLockingCheckbox.isDisplayed();
	}
	
	public void updateMaxFailedLoginAttempts(String value)
	{
		waitForTime(3000);
		WebElement MaxFailedLoginAttempts = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_maxFailedLoginAttempts")));
		TestUtil.waitforElementTobeLocated(MaxFailedLoginAttempts, 10);
		doClear(MaxFailedLoginAttempts);
		sendkeys(value, MaxFailedLoginAttempts);
	}
	
	public void updateLockOutMinutes(String value)
	{
		waitForTime(3000);
		if (!isEnabled("ConnexoAdmin_UserSecuritySettings_lockOutMinutes")) {
			clickActivateAccountLockingCheckbox();
			WebElement lockOutMinutes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_lockOutMinutes")));
			TestUtil.waitforElementTobeLocated(lockOutMinutes, 10);
			doClear(lockOutMinutes);
			sendkeys(value, lockOutMinutes);
		}
	}
}


