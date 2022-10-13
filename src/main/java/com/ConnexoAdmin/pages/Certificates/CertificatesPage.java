package com.ConnexoAdmin.pages.Certificates;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class CertificatesPage extends TestBase {	
	
	@FindBy(xpath = "//*[normalize-space()='Connexo MultiSense']")
	WebElement eleAlarmsLogo;
	
	public CertificatesPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
			login();
		}
	}

	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
	
}
