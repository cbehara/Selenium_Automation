package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.SharedCommunicationSchedulesPage;
import com.util.util.DriverUtility;

public class SharedCommunicationSchedulesTest extends TestBase {

	Logger log = LogManager.getLogger(SharedCommunicationSchedulesTest.class);  

	SharedCommunicationSchedulesPage SharedCommunicationSchedulesPage;

	public SharedCommunicationSchedulesTest() {
		super();
	}	

	@Test(priority = 1,description="verify And Select Shared Communication Schedules Page")
	public void verifyAndSelectSharedCommunicationSchedulesPage()
	
	{   
		SharedCommunicationSchedulesPage = new SharedCommunicationSchedulesPage();
		SharedCommunicationSchedulesPage.clickonsharedCommunicationSchedule();
		reporterLog("Starting Test case Select Shared Communication Schedule");
		log.info("****************************** starting test case : Select Shared Communication Schedule***************");
		SharedCommunicationSchedulesPage.clickonAddSharedCommunicationSchedule();

		log.info("****************************** Ending test case : Select Shared Communication Schedule***************");

	}
	@Test(priority = 2, description="Created Shared Communication Schedules Page")
	public void CreatedSharedCommunicationSchedulesPage()

	{
		reporterLog("Starting Test case Create Shared Communication Schedule");
		log.info("****************************** starting test case : Create Shared Communication Schedule***************");
		SharedCommunicationSchedulesPage.AddSCSCommunicationTask();
		log.info("****************************** Ending test case : Create Shared Communication Schedule***************");
	}

	@Test(priority = 3, description="Check and Created SCSCommunication Task")
	public void CheckandCreatedSCSCommunicationTask()

	{
		reporterLog("Starting Test case Verify Shared Communication Schedule");
		log.info("****************************** starting test case : Verify Shared Communication Schedule***************");
		SharedCommunicationSchedulesPage.CheckandaddSCSCommunicationTask();		

		String ExpetedaddeSCSvalue = "Shared communication schedule added";
		WebElement ActualaddeSCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextAddSCS")));       
		SoftAssertfunction(ActualaddeSCSvalue, ExpetedaddeSCSvalue);
		log.info("****************************** Ending test case : Verify Shared Communication Schedule***************");

	}

	@Test(priority = 4, description="Cloned Shared Communication Schedules Page")
	public void ClonedSharedCommunicationSchedulesPage()

	{
		reporterLog("Starting Test case Clone Shared Communication Schedule");
		log.info("****************************** starting test case : Clone Shared Communication Schedule***************");
		SharedCommunicationSchedulesPage.ClonesharedCommunicationSchedule();
		log.info("****************************** Ending test case : Clone Shared Communication Schedule***************");
	}
	
	@Test(priority = 5, description="Cloned Shared Communication Schedules Page")
	public void AddClonedSharedCommunicationSchedulesPage()

	{
		reporterLog("Starting Test case Adding Clone Shared Communication Schedule");
		log.info("****************************** starting test case : Adding Clone Shared Communication Schedule***************");
		SharedCommunicationSchedulesPage.CreateClonesharedCommunicationSchedule();

		String ExpetedCloneSCSvalue = "Shared communication schedule cloned";
		WebElement ActualCloneSCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextCloneSCS")));         
		SoftAssertfunction(ActualCloneSCSvalue, ExpetedCloneSCSvalue);

		log.info("****************************** Ending test case : Adding Clone Shared Communication Schedule***************");
	}

	@Test(priority = 6, description="Removed Clone Shared Communication Schedules Page")
	public void RemovedClonedSharedCommunicationSchedulesPage()

	{
		reporterLog("Starting Test case Remove Clone Shared Communication Schedule");
		log.info("****************************** starting test case : Remove Clone Shared Communication Schedule***************");
		SharedCommunicationSchedulesPage.removeClonesharedCommunicationSchedule();
	

		log.info("************** Ending Test Case:Remove Clone Shared Communication Schedule *******************");		
	}
	

	@Test(priority = 7, description="Removed Shared Communication Schedules Page")
	public void RemovedSharedCommunicationSchedulesPage()

	{
		reporterLog("Starting Test case Remove Shared Communication Schedule");
		log.info("****************************** starting test case : Remove Shared Communication Schedule***************");
		
		SharedCommunicationSchedulesPage.removesharedCommunicationSchedule();		
		String ExpetedRemovedSCSvalue = "Shared communication schedule removed";
		WebElement ActualRemovedSCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_SharedComSchedPage_verifytextremoveSCS")));       
		SoftAssertfunction(ActualRemovedSCSvalue, ExpetedRemovedSCSvalue);

		log.info("************** Ending Test Case:Remove Shared Communication Schedule *******************");		
	}	
}
