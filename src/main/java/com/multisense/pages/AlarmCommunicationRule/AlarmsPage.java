package com.multisense.pages.AlarmCommunicationRule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class AlarmsPage extends TestBase {	
	
	@FindBy(xpath = "//*[normalize-space()='Connexo MultiSense']")
	WebElement eleAlarmsLogo;
	
	public AlarmsPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}
	
	public boolean isAlarmsLogoPresent() {
		return eleAlarmsLogo.isDisplayed();
	}
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}	
}
