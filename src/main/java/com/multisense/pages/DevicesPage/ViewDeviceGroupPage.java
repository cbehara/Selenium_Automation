package com.multisense.pages.DevicesPage;

import org.openqa.selenium.By;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class ViewDeviceGroupPage extends TestBase{

	public ViewDeviceGroupPage(int deviceGroupId)
	{
		login();
	}
	public ViewDeviceGroupPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
	
	public String getDeviceGroupName() {
		return DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Name\")]//parent::td//following-sibling::td//div")).getText();
	}
}
