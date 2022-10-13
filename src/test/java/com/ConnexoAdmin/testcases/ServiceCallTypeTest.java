package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.AdminServiceCall.ServiceCallTypePage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class ServiceCallTypeTest extends TestBase{
	
	Logger log = LogManager.getLogger(CertificatesTest.class);
	ServiceCallTypePage serviceCallTypePage;
	

	public ServiceCallTypeTest()
	{
		super();
	}	
	
	@Test(priority = 1)	
	public void verifyNavigationToServiceCallTypePage()
	{
		reporterLog("Starting testcase verify Navigation To ServiceCall Type Page");
		log.info("****************************** Starting testcase : verify Navigation To ServiceCall Type Page *****************************************");
		serviceCallTypePage = new ServiceCallTypePage();
		
		log.info("Asserting Service Call type page title");
		waitForTime(1000);	
    	String ExpectedValue = "Service call types";
    	WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_eleTxtServiceCallTypes")));		
        SoftAssertfunction(ActualValue, ExpectedValue);
        log.info("****************************** Ending testcase : verify Navigation To ServiceCall Type Page *****************************************");
	}
	
	@Test(priority = 2)	
	public void selectserviceTypecall() throws InterruptedException {
	
		reporterLog("Starting testcase select service Type call");
		log.info("****************************** Starting testcase : select service Type call *****************************************");
        		
		waitForTime(2000);		
		serviceCallTypePage.clickonServicecallType();
		waitForTime(500);
		log.info("****************************** Ending testcase : select service Type call *****************************************");
		}	

}
