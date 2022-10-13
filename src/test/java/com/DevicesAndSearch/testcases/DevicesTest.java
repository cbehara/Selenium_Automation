package com.DevicesAndSearch.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DevicesAndSearch.pages.Devices.DevicesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DevicesTest extends TestBase {
	String DevicesTestsheet = "Devices";  
	Logger log = LogManager.getLogger(DevicesTest.class);
	DevicesPage Devicespage;

	public DevicesTest() 
	{
		super();
	}	
	
	@DataProvider 
	public Object[][] getTestDataForDevices() 
	{ 
		Object testData[][] = TestUtil.getTestDataDeviceAndSearch(DevicesTestsheet);
		return testData;
	}

	@Test(priority = 1, description = "Add Devices")
	public void AddDevices() throws InterruptedException
	{
		Devicespage = new DevicesPage();
		reporterLog("Starting testcase Select AddDevices");
		log.info("****************************** Starting test case : Select Communication port pools *****************************************");
		Devicespage.AddDevices();


		log.info("****************************** Ending test case : Select Communication port pools *****************************************");
	}

	@Test(priority = 2, dataProvider = "getTestDataForDevices", description = "Add Devices Specs" ,enabled = true)
	public void AddDevicesSpecs(String DeviceTypeConfig, String IssueReason) throws InterruptedException

	{			
		reporterLog("Starting testcase AddDevicesSpecs");
		log.info("****************************** Starting test case : AddDevicesSpecss *****************************************");
		Devicespage.AddDevicesSpecs(DeviceTypeConfig, IssueReason);
		
		log.info("****************************** Ending test case : AddDeviceSpecs*****************************************");
	}

	@Test(priority = 3, dataProvider = "getTestDataForDevices", description = "Create Issue" ,enabled = true)
	public void CreateIssue(String DeviceTypeConfig, String IssueReason) throws InterruptedException

	{
		reporterLog("Starting testcase Create Issue");
		log.info("****************************** Starting test case : create issue *****************************************");
		Devicespage.CreateIssue(DeviceTypeConfig, IssueReason);
		//log.info("****************************** Ending test case : change per page Communication PortPools *****************************************");
	}

	@Test(priority = 4, description = "Deactivate Communication button")
	public void Deactivate() throws InterruptedException
	{

		reporterLog("Starting testcase DeactivateCommbutton");
		log.info("****************************** Starting test case : DeactivateCommbutton *****************************************");
		Devicespage.DeactivateConnButton();

		String ExpectedDectivatebutton = "Connection status changed to inactive";
		WebElement ActualDeactivatebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyDeactivatebtn")));		   
	      SoftAssertfunction(ActualDeactivatebutton, ExpectedDectivatebutton);

		log.info("****************************** Ending test case : DeactivateConnbutton *****************************************");
	}

	@Test(priority = 5, description = "Activate Connection button")
	public void Activate() throws InterruptedException

	{
		reporterLog("Starting testcase ActivateConnbutton");
		log.info("****************************** Starting test case : ActivateConnbutton *****************************************");
		Devicespage.ActivateConnButton();
		String ExpectedActivatebutton = "Connection status changed to active";
		WebElement ActualActivatebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyActivatebtn")));		   
	      SoftAssertfunction(ActualActivatebutton, ExpectedActivatebutton);

		log.info("****************************** Ending test case : ActivateCommbutton *****************************************");
	}	
	
	@Test(priority = 6, description = "Run Now Connection button")
	public void RunNowConnButton() throws InterruptedException

	{
		Devicespage.RunNowConnButton();
	}
	
	@Test(priority = 7, description = "Activate All button")
	public void ActivateAll() throws InterruptedException

	{
		reporterLog("Starting testcase ActivateAllCommbutton");
		log.info("****************************** Starting test case : ActivateAllCommbutton *****************************************");
		Devicespage.ActivateAll();
		String ExpectedActivatebutton = "Communication tasks activated";
		WebElement ActualActivatebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyActivateAllbtn")));		   
	      SoftAssertfunction(ActualActivatebutton, ExpectedActivatebutton);
		
	}
	
	@Test(priority = 8, description = "Deactivate All" )
	public void DeactivateAll() throws InterruptedException

	{
		Devicespage.DeactivateAll();
		
	}
	
	@Test(priority = 9, description = "Activate All")
	public void RunNowCommButton() throws InterruptedException

	{
		Devicespage.RunNowCommButton();
	}

}



