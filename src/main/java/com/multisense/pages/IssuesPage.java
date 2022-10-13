package com.multisense.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class IssuesPage extends TestBase {

	public IssuesPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
	
	public boolean isIssuesLogoDisplayed() {
		WebElement issuesLogo = DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Issues\") and @class =\"x-header-text x-panel-header-text x-panel-header-text-large\"]"));
		return issuesLogo.isDisplayed();
	}
	
	public DashboardPage goToPreviousPage() {
		DriverUtility.getDriver().navigate().back();
		return new DashboardPage();
	}
}
