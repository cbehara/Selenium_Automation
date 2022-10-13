package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationSettingsPage extends TestBase {
	
	String OnlineCommunicationServerNameValue= generateRandomName(9);
	String UpdatedOnlineCommunicationServerNameValue= generateRandomName(10);
	
	
	 public CommunicationSettingsPage()	
		{
			login();
			PageFactory.initElements(DriverUtility.getDriver(), this);
			Multisense();
	        waitForTime(1000);
	        Administration();
	        waitForTime(3000);
		}
	 
	    public void clickonCommunicationSettings()
		{    	
	    	WebElement CommunicationSetting = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettings")));
			TestUtil.waitforElementTobeLocated(CommunicationSetting, 10);	
			doClick(CommunicationSetting);		
		}
	    
	    public void EnableandVerifyTrueMinimizeCheckbox()
		{    	
	    	WebElement CommunicationSettingsActionBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettingsActions")));
			TestUtil.waitforElementTobeLocated(CommunicationSettingsActionBtn, 10);	
			doClick(CommunicationSettingsActionBtn);	
			WebElement CommunicationSettingsEditBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettingsEdit")));
			TestUtil.waitforElementTobeLocated(CommunicationSettingsEditBtn, 10);	
			doClick(CommunicationSettingsEditBtn);	
			WebElement CommunicationSettingsRestoreBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_TrueMinimizedRestoreBtn")));
			TestUtil.waitforElementTobeLocated(CommunicationSettingsRestoreBtn, 10);	
			doClick(CommunicationSettingsRestoreBtn);	
			WebElement CommunicationSettingsTruMinimizeCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_TrueMinimizedCheckbox")));
			TestUtil.waitforElementTobeLocated(CommunicationSettingsTruMinimizeCheckbox, 10);	
			if(!CommunicationSettingsTruMinimizeCheckbox.isEnabled());
			{
				doClick(CommunicationSettingsTruMinimizeCheckbox);	
			}
			WebElement CommunicationSettingsSaveBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettingsSave")));
			TestUtil.waitforElementTobeLocated(CommunicationSettingsSaveBtn, 10);	
			doClick(CommunicationSettingsSaveBtn);
		}
	    
	    public void EnableandVerifyRandomizationCheckbox()
	    {    	
  	    	WebElement CommunicationSettingsActionBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettingsActions")));
  			TestUtil.waitforElementTobeLocated(CommunicationSettingsActionBtn, 10);	
  			doClick(CommunicationSettingsActionBtn);	
  			WebElement CommunicationSettingsEditBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettingsEdit")));
  			TestUtil.waitforElementTobeLocated(CommunicationSettingsEditBtn, 10);	
  			doClick(CommunicationSettingsEditBtn);
  			WebElement CommunicationSettingsRestoreBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_RandomizationRestoreBtn")));
			TestUtil.waitforElementTobeLocated(CommunicationSettingsRestoreBtn, 10);	
			doClick(CommunicationSettingsRestoreBtn);
  			WebElement CommunicationSettingsRandomizationCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_RandomizationCheckbox")));
  			TestUtil.waitforElementTobeLocated(CommunicationSettingsRandomizationCheckbox, 10);	
  			if(!CommunicationSettingsRandomizationCheckbox.isEnabled());
  			{
  				doClick(CommunicationSettingsRandomizationCheckbox);	
  			}
  			WebElement CommunicationSettingsSaveBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_CommunicationSettingsSave")));
  			TestUtil.waitforElementTobeLocated(CommunicationSettingsSaveBtn, 10);	
  			doClick(CommunicationSettingsSaveBtn);
  		}	
}
