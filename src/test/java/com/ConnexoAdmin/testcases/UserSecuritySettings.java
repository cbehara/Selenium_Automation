package com.ConnexoAdmin.testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.UserSecuritySettingsPage.UserSecuritySettingsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class UserSecuritySettings  extends TestBase{

	String AddUserDirectoriessheet = "AddDirectories";
	UserSecuritySettingsPage usersecuritysettingspage;
	Logger log = Logger.getLogger(UserSecuritySettings.class);   
	
	public UserSecuritySettings()
	{
		super();
	}	

	@Test(priority =1, enabled = true, description = "VerifyUserSecuritySettings") 
	public void VerifyUserSecuritySettings() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyUserSecuritySettings *****************************************");
		usersecuritysettingspage = new UserSecuritySettingsPage();
		usersecuritysettingspage.clickUserSecuritySettings();
		
		assertTrue(usersecuritysettingspage.isActivateAccountLockingCheckboxDisplayed(), "By clicking on user security settings it should navigate to respective page");
		
		usersecuritysettingspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyUserSecuritySettings *****************************************");
	}


	@Test(priority =2, description = "VerifyCancelButton", enabled = true) 
	public void VerifyCancelButton() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyCancelButton *****************************************");
		usersecuritysettingspage.clickUserSecuritySettings();
		usersecuritysettingspage.clickCancelButton();
		
		assertTrue(usersecuritysettingspage.isUserSecuritySettingsDisplayed(), "after click on cancel it should navigate back to previous page");
		
		log.info("****************************** Ending test case : VerifyCancelButton *****************************************");
	}
	
	@Test(priority =3, description = "VerifyAddButton", enabled = true) 
	public void VerifyAddButton() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyAddButton *****************************************");
		usersecuritysettingspage.clickUserSecuritySettings();
		usersecuritysettingspage.clickSaveButton();
		String Expecteduseradded = "User security settings saved";
		WebElement Actualuseradded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_UserSecuritySettingsSavedMessage")));
		
		SoftAssertfunction(Actualuseradded, Expecteduseradded);
		
		log.info("****************************** Ending test case : VerifyAddButton *****************************************");
	}
	
	@Test(priority =4, description = "VerifyUpdateMaxFailedAttepts", enabled = true) 
	public void VerifyUpdateMaxFailedAttepts() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyUpdateMaxFailedAttepts *****************************************");
		usersecuritysettingspage.clickUserSecuritySettings();
		usersecuritysettingspage.clickActivateAccountLockingCheckbox();
		usersecuritysettingspage.updateMaxFailedLoginAttempts("20");
		usersecuritysettingspage.clickSaveButton();
		String Expecteduseradded = "User security settings saved";
		WebElement Actualuseradded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_UserSecuritySettingsSavedMessage")));
		
		SoftAssertfunction(Actualuseradded, Expecteduseradded);
		
		log.info("****************************** Ending test case : VerifyUpdateMaxFailedAttepts *****************************************");
	}
	
	@Test(priority =5, description = "VerifyUpdateLockoutTime", enabled = true) 
	public void VerifyUpdateLockoutTime() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyUpdateLockoutTime *****************************************");
		usersecuritysettingspage.clickUserSecuritySettings();
		usersecuritysettingspage.clickActivateAccountLockingCheckbox();
		usersecuritysettingspage.updateLockOutMinutes("3");
		usersecuritysettingspage.clickSaveButton();
		String Expecteduseradded = "User security settings saved";
		WebElement Actualuseradded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserSecuritySettings_UserSecuritySettingsSavedMessage")));
		
		SoftAssertfunction(Actualuseradded, Expecteduseradded);
		
		log.info("****************************** Ending test case : VerifyUpdateLockoutTime *****************************************");
	}
	
	@Test(priority =6, description = "VerifyDefaultStatusOfActivateAccountLockingCheckbox", enabled = true) 
	public void VerifyDefaultStatusOfActivateAccountLockingCheckbox() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyDefaultStatusOfActivateAccountLockingCheckbox *****************************************");
		usersecuritysettingspage.clickUserSecuritySettings();

		assertTrue(usersecuritysettingspage.isActivateAccountLockingCheckboxEnabled(), "defaultly checkbox should be selected");
		
		usersecuritysettingspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyDefaultStatusOfActivateAccountLockingCheckbox *****************************************");
	}
	
	@Test(priority =7, description = "VerifyByClickActivateAccountLockingCheckbox", enabled = true) 
	public void VerifyByClickActivateAccountLockingCheckbox() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyByClickActivateAccountLockingCheckbox *****************************************");
		usersecuritysettingspage.clickUserSecuritySettings();
		usersecuritysettingspage.clickActivateAccountLockingCheckbox();

		assertFalse(usersecuritysettingspage.isMaxFailedLoginAttemptsEnabled(), "after click on that checkbox it should be unselected");
		
		usersecuritysettingspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyByClickActivateAccountLockingCheckbox *****************************************");
	}

}

