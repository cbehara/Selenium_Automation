package com.GenericTests.testcases;

import com.base.base.TestBase;
import com.genericscripts.pages.GetConnexobuildversion;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class VerifyConnexoBuildVersionTest extends TestBase {
	
	Logger log = LogManager.getLogger(VerifyConnexoBuildVersionTest.class);
	
	GetConnexobuildversion getConnexobuildversion;	
	
	public VerifyConnexoBuildVersionTest()
	{
		super();
	}		

	@Test
	public void getConnexoBuildDetails() 
	{		
		getConnexobuildversion = new GetConnexobuildversion();	
		reporterLog("Starting testcase Get Connexo Build Version");
		log.info("*************** starting test case : Get Connexo Build Version **************");
		
		waitForTime(1000);
		TestUtil.waitforElementTobeLocated(getConnexobuildversion.eleAboutLink, 30);
		doClick(getConnexobuildversion.eleAboutLink);
		waitForTime(2000);
		
		ArrayList<String> newTab = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
		DriverUtility.getDriver().switchTo().window(newTab.get(1));
		waitForTime(1000);
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(),Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='versionHeader']")));					
		
		String strBuildVersion = getConnexobuildversion.eleConnexoBuildVersion.getText();	
		log.info("Build Version : " + strBuildVersion);
		reporterLog("Connexo Build Version : " + strBuildVersion);
		
		waitForTime(1000);
		DriverUtility.getDriver().switchTo().window(newTab.get(0));
		waitForTime(2000);
        log.info("******************* Ending test case : Get Connexo Build Version ************");        
        reporterLog("Ending testcase Get Connexo Build Version");
	}	
   
}
