package com.multisense.pages.ConnectionsPage;

import org.openqa.selenium.By;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class ConnectionsPage extends TestBase{

	public ConnectionsPage(boolean isLoggedIn) {
		if(!isLoggedIn)
		{
			login();
		}
	}
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
	
	public boolean isConnectionsLogoPresent() {
		return DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Connections\")]")).isDisplayed();
	}
}
