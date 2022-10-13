package com.multisense.pages.DevicesPage;

import org.openqa.selenium.By;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class DeviceGroupsPage extends TestBase{

	public DeviceGroupsPage() {
		login();
	}
	
	public DeviceGroupsPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
	
	public boolean isDeviceGroupsLogoPresent() {
		return DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Device groups\")]")).isDisplayed();
	}
	
	
	public AddDeviceGroupPage clickOnAddDeviceGroup()
	{
		DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add device group\")]//parent::span")).get(2).click();
		return new AddDeviceGroupPage(true);
	}
}
