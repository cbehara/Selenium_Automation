package com.multisense.pages.ZoneManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ZoneManagementPage extends TestBase{
	
	String ZoneName= generateRandomName(7);
			
	public ZoneManagementPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
	}
	
	public void clickonZoneManagement()
	{
		WebElement ConnexoMultisense_ZoneMgmtPage_ZoneLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_ZoneLink")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ZoneMgmtPage_ZoneLink, 10);	
		doClick(ConnexoMultisense_ZoneMgmtPage_ZoneLink);		
	}
	public void createZOne(String ZoneType)
	{
		WebElement ConnexoMultisense_ZoneMgmtPage_Zonesperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_Zonesperpage")));
	     if(ConnexoMultisense_ZoneMgmtPage_Zonesperpage.isDisplayed())
	     {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add zone']//ancestor::a)[2]")).click();
	     }else {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add zone']//ancestor::a)[1]")).click();
	     }
	     waitForTime(5000);
	     WebElement ConnexoMultisense_ZoneMgmtPage_inputnameZone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_inputnameZone")));
	     TestUtil.waitforElementTobeLocated(ConnexoMultisense_ZoneMgmtPage_inputnameZone, 10);
	     doClear(ConnexoMultisense_ZoneMgmtPage_inputnameZone);
		 sendkeys(ZoneName,ConnexoMultisense_ZoneMgmtPage_inputnameZone);
		 WebElement ConnexoMultisense_ZoneMgmtPage_zoneTypeInputValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_zoneTypeInputValue")));
		 TestUtil.waitforElementTobeLocated(ConnexoMultisense_ZoneMgmtPage_zoneTypeInputValue, 10);
	     doClear(ConnexoMultisense_ZoneMgmtPage_zoneTypeInputValue);
		 sendkeys(ZoneType,ConnexoMultisense_ZoneMgmtPage_zoneTypeInputValue);
		 WebElement ConnexoMultisense_ZoneMgmtPage_creationzone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_creationzone")));
		 doClick(ConnexoMultisense_ZoneMgmtPage_creationzone);
	}
	
	
	public void editZone(String UpdatedZoneName)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ZoneName +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoMultisense_ZoneMgmtPage_EditZone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_EditZone")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ZoneMgmtPage_EditZone, 10);
		doClick(ConnexoMultisense_ZoneMgmtPage_EditZone);
		waitForTime(5000);
		WebElement ConnexoMultisense_ZoneMgmtPage_inputnameZone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_inputnameZone")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ZoneMgmtPage_inputnameZone, 10);
		doClear(ConnexoMultisense_ZoneMgmtPage_inputnameZone);
		sendkeys(UpdatedZoneName,ConnexoMultisense_ZoneMgmtPage_inputnameZone);
		WebElement ConnexoMultisense_ZoneMgmtPage_saveZone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_saveZone")));
		doClick(ConnexoMultisense_ZoneMgmtPage_saveZone);		
	}
	
	public void removeZone(String UpdatedZoneName)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ UpdatedZoneName +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoMultisense_ZoneMgmtPage_zoneRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_zoneRemove")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ZoneMgmtPage_zoneRemove, 10);
		doClick(ConnexoMultisense_ZoneMgmtPage_zoneRemove);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdatedZoneName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	public void VerifyZoneFields()
	{
		WebElement ConnexoMultisense_ZoneMgmtPage_Zonesperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_Zonesperpage")));
	     if(ConnexoMultisense_ZoneMgmtPage_Zonesperpage.isDisplayed())
	     {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add zone']//ancestor::a)[2]")).click();
	     }else {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add zone']//ancestor::a)[1]")).click();
	     }
	     waitForTime(5000);
	     WebElement ConnexoMultisense_ZoneMgmtPage_creationzone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_creationzone")));
		 doClick(ConnexoMultisense_ZoneMgmtPage_creationzone);
		 String ExpectedZoneName= "This field is required";
		 WebElement ActualZoneName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_verifytextZoneNameField")));  
		 SoftAssertfunction(ActualZoneName, ExpectedZoneName);
		 String ExpectedZoneType= "This field is required";
		 WebElement ActualZoneType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_verifytextZoneTypeField")));  
		 SoftAssertfunction(ActualZoneType, ExpectedZoneType);
		 WebElement ConnexoMultisense_ZoneMgmtPage_cancelzone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_ZoneCancelBtn")));
		 doClick(ConnexoMultisense_ZoneMgmtPage_cancelzone);
	}
	
	public int SelectZoneType(String zonetype)
	{
		WebElement ZoneTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_ZoneTypeDropdown")));
		doClick(ZoneTypeDropdown);
		String locator = prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_ZoneTypeValue");
		locator = locator.replace("ReplaceText", zonetype);
		WebElement ZoneType =  DriverUtility.getDriver().findElement(By.xpath(locator));
		doClick(ZoneType);
		WebElement ZoneApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_ZoneTypeApplyBtn")));
		doClick(ZoneApply);
		waitForTime(8000);
		String tablelocator = prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_ZoneTypeTableList"); 
		tablelocator = tablelocator.replace("ReplaceText", zonetype);
		List<WebElement> tlocators  = DriverUtility.getDriver().findElements(By.xpath(tablelocator));
		return tlocators.size();
	}

}
