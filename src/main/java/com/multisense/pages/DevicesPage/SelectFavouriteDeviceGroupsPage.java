package com.multisense.pages.DevicesPage;

import org.openqa.selenium.By;

import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class SelectFavouriteDeviceGroupsPage extends TestBase{

	public SelectFavouriteDeviceGroupsPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
	public void clickOnUncheckAll() {
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Uncheck all\")]//parent::span")).click();
	}
	
	public void checkFavouriteDeviceGroups(String favouriteDeviceGroups)
	{
		if(!favouriteDeviceGroups.equals("NA"))
		{
		String[] favouriteDeviceGroupArray = favouriteDeviceGroups.split(",");
		for(int count =0; count< favouriteDeviceGroupArray.length; count++)
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+favouriteDeviceGroupArray[count]+"\")]//parent::td//preceding-sibling::td//div//img")).click();
		}
	}

}
