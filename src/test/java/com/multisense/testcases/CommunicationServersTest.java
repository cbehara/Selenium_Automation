package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommunicationServersPage;
import com.util.util.DriverUtility;

public class CommunicationServersTest extends TestBase {

	Logger log = LogManager.getLogger(CommunicationServersTest.class); 	        
	CommunicationServersPage CommunicationServersPage;

	public CommunicationServersTest() {
		super();
	}

	@Test(priority = 1 ,description="Verify And Select Communication Server")
	public void verifyAndSelectCommunicationServer()

	{
		CommunicationServersPage = new CommunicationServersPage();
		CommunicationServersPage.clickonCommunicationServer();
		reporterLog("Starting creation of Communication Servers");
		log.info("****** starting test case : Assertions verified for Communication Servers *************");

		CommunicationServersPage.clickonAddOnlineCommunicationServer();
		log.info("************ Ending test case : Assertions verified for Communication Servers *******");

	}

	@Test(priority = 2, description="Create Online Communication Server")
	public void CreatedOnlineCommunicationServer()

	{
		reporterLog("Create Online Communication Server");
		log.info("****** Starting Test Case : Create Online Communication Server*************");
		CommunicationServersPage.AddOnlineCommunicationServer(); 
	    String ExpetedaddeOCSvalue = "Online communication server added";
		WebElement ActualaddeOCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextAddOnlineCommunicationServer")));
		//HardAssertfunction(ActualaddeOCSvalue, ExpetedaddeOCSvalue);   
		SoftAssertfunction(ActualaddeOCSvalue, ExpetedaddeOCSvalue);
		log.info("************ Ending Test Case : Create Online Communication Server *******");     
	}

	@Test(priority = 3, description="Activate Online Communication Server")
	public void activationOnlineCommunicationServer()
	{ 
		
		reporterLog("Activate Online Communication Servers");
		log.info("****** Starting Test case : Activate Online Communication Servers*************");   
		
		CommunicationServersPage.activateOnlineCommunicationServer();  
		
		String ExpetedactivateOCSvalue = "Communication server activated";
		WebElement ActualactivateOCSvalue  = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextactivateOnlineCommunicationServer")));
		//HardAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);   
		SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);
		log.info("************ Ending Test case : Activate Online Communication Servers *******");
	}

	@Test(priority = 4, description="Edit Online Communication Server")
	public void editionOnlineCommunicationServer()
	{
		reporterLog("Edit Online Communication Servers");
		log.info("****** Starting Test Case : Edit Online Communication Servers*************");

		CommunicationServersPage.editOnlineCommunicationServer(); 

		String ExpetedsaveOCSvalue = "Online communication server saved"; 
		WebElement ActualsaveOCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextSaveOnlineCommunicationServer")));
		//HardAssertfunction(ActualsaveOCSvalue, ExpetedsaveOCSvalue);   
		SoftAssertfunction(ActualsaveOCSvalue, ExpetedsaveOCSvalue);
		log.info("************ Ending Test Case : Edit Online Communication Servers *******");
	}

	@Test(priority = 5, description="Deactivate Online Communication Server")
	public void deactivedOnlineCommunicationServer()
	{             	   			
		reporterLog("Deactivating Online Communication Servers");
		log.info("****** Starting Test Case : Deactivate Online Communication Servers *************");

		CommunicationServersPage.deactivateOnlineCommunicationServer();                    
		String ExpeteddeactivateOCSvalue = "Communication server deactivated";
		WebElement ActualdeactivateOCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextDeactivatedOnlineCommunicationServer")));
		//HardAssertfunction(ActualdeactivateOCSvalue,ExpeteddeactivateOCSvalue);   
		SoftAssertfunction(ActualdeactivateOCSvalue,ExpeteddeactivateOCSvalue);
		log.info("****** Ending Test Case : Deactivate Online Communication Servers *************");
	}

	@Test(priority = 6, description="Removed Online Communication Server")
	public void removedOnlineCommunicationServer()
	{        	   			  
		reporterLog("Removing Online Communication Servers");
		log.info("****** Starting test case : Remove Communication Servers *************");

		CommunicationServersPage.removeOnlineCommunicationServer();

		String ExpetedremoveOCSValues = "Communication server removed";

		WebElement ActualremoveOCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextremoveCommunicationServer")));
		//HardAssertfunction(ActualremoveOCSvalue, ExpetedremoveOCSValues);   
		SoftAssertfunction(ActualremoveOCSvalue, ExpetedremoveOCSValues);

		log.info("************ Ending test case : Remove Communication Servers ****");
	}	
}

