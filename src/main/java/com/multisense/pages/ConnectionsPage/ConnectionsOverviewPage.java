package com.multisense.pages.ConnectionsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class ConnectionsOverviewPage extends TestBase{

	public ConnectionsOverviewPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
	
	public boolean isConnectionsOverviewLogoPresent() {
		WebElement connectionsOverviewLogo = DriverUtility.getDriver().findElement(By.xpath("//span[@class = \"x-header-text x-panel-header-text x-panel-header-text-large\" and contains(text(),\"Connections overview\")]"));
		return connectionsOverviewLogo.isDisplayed();
	}
	
	public DashboardPage goToPreviousPage() {
		DriverUtility.getDriver().navigate().back();
		return new DashboardPage();
	}
}
