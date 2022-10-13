package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommunicationSettingsPage;
import com.util.util.DriverUtility;

public class CommunicationSettingsTest extends TestBase {

	Logger log = LogManager.getLogger(CommunicationSettingsTest.class); 	        
	CommunicationSettingsPage CommunicationSettingsPage;

	public CommunicationSettingsTest() {
		super();
	}

	@Test(priority = 1 ,description="Verify communication settings title")
	public void verifyCommunicationSettingsTitle()

	{
		CommunicationSettingsPage = new CommunicationSettingsPage();
		CommunicationSettingsPage.clickonCommunicationSettings();
		reporterLog("Starting Verification of communication settings title page");
		log.info("****** starting test case : Verify communication settings title *************");
		String Expectedvalue = "Communication settings";
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_verifyCommunicationSettings")));
		SoftAssertfunction(Actualvalue, Expectedvalue);
		
		log.info("************ Ending test case : Verify communication settings title *******");
	}
	
	@Test(priority = 2 ,description="Enable True Minimized Checkbox")
	public void EnableTrueMinimizedCheckbox()

	{
		reporterLog("Starting testcase for enabling True Minimize checkbox");
		log.info("****** starting test case : Enable True Minimized Checkbox *************");
		CommunicationSettingsPage.EnableandVerifyTrueMinimizeCheckbox();
		String Expectedvalue = "Yes";
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_VerifyTrueMinimizedCheckbox")));
		SoftAssertfunction(Actualvalue, Expectedvalue);
		
		log.info("************ Ending test case : Enable True Minimized Checkbox *******");
	}
	
	@Test(priority = 3 ,description="Enable Randomization Checkbox")
	public void EnableRandomizationCheckbox()

	{
		reporterLog("Starting testcase for enabling Randomization checkbox");
		log.info("****** starting test case : Enable Randomization Checkbox *************");
		CommunicationSettingsPage.EnableandVerifyRandomizationCheckbox();
		String Expectedvalue = "Yes";
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comStgPage_VerifyRandomizationCheckbox")));
		SoftAssertfunction(Actualvalue, Expectedvalue);
		
		log.info("************ Ending test case : Enable Randomization Checkbox *******");
	}
}

