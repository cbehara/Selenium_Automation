package com.genericscripts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class GetConnexobuildversion extends TestBase {	

	@FindBy(xpath = "//span[@class='x-btn-icon-el icon-question3 ']")
	public
	WebElement eleQuestionMarkMenu;	

	@FindBy(xpath = "//span[@class='x-btn-button'][normalize-space()='About']")
	public
	WebElement eleAboutLink;

	@FindBy(xpath = "//h2[@id='versionHeader']")
	public
	WebElement eleConnexoBuildVersion;

	public GetConnexobuildversion()	
	{
		//login(prop.getProperty("mainUrl"));
		PageFactory.initElements(DriverUtility.getDriver(), this);	
		waitForTime(2000);
	}
}
