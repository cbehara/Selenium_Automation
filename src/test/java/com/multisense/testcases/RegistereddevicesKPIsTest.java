package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.KPIs.RegistereddevicesKPIsPage;

public class RegistereddevicesKPIsTest extends TestBase {

	Logger log = LogManager.getLogger(DataCollectionKPIsTest.class);

	RegistereddevicesKPIsPage RegistereddevicesKPIsPage;
	public RegistereddevicesKPIsTest() {
		super();
	}	

	@Test(priority = 1, description = "Click on Registered devices KPIs")
	public void clickonRegistereddevicesKPIs()
	{
		RegistereddevicesKPIsPage = new RegistereddevicesKPIsPage();
		RegistereddevicesKPIsPage.clickonRegistereddevicesKPIs();
		reporterLog("Starting testcase Registered devices KPIs ");
		log.info("****************** starting test case : Data Collection Issues verify And Change Per Page *******");
		RegistereddevicesKPIsPage.clickonAddRegistereddevicesKPIs();
		log.info("***************** Ending test case : Data Collection Issues verify And Change Per Page *********");
	}

	@Test(priority = 2, description ="Create Registered devices KPIs" )
	public void CreateRegistereddevicesKPIs()
	{
		reporterLog("Starting testcase Adding Registered devices KPI");
		log.info("***************** Starting testcase Adding Registered devices KPI *************");
		RegistereddevicesKPIsPage.AddRegistereddevicesKPI();
		log.info("***************** Ending test case : Adding Registered devices KPI ***************");

	}
	
	@Test(priority = 3, description="Cancel Registered Devices KPIs")
	public void CancelRegistereddevicesKPIs()
	{
		reporterLog("Starting testcase Cancel Registered Devices KPIs");
		log.info("************ starting test case :Cancel Registered Devices KPIs **************");
		RegistereddevicesKPIsPage.clickonEditRegistereddevicesKPI();
		log.info("************ Ending test case :Cancel Registered Devices KPIs  ***************");
	}

	@Test(priority = 4, description ="Remove Registered devices KPIs")
	public void removedRegistereddevicesKPI()
	{		 
		reporterLog("Starting testcase Removing Data Quality KPI");
		log.info("****************************** Starting testcase: Removing Registered devices KPI *****************************************");
		RegistereddevicesKPIsPage.clickonRemoveRegistereddevicesKPI();

		log.info("****************************** Ending Test Case : Removing Registered devices KPI *****************************************");
	}	
	
	@Test(priority = 5, description="Verify Add Registered Device KPI Fields")
	public void verifyAddRegisteredDeviceKPIFields()
	{		 
		reporterLog("Starting testcase Verify Add Registered Device KPI Fields");
		log.info("****************************** Starting testcase: Verify Add Registered Device KPI Fields *****************************************");
		RegistereddevicesKPIsPage.clickonAddRegistereddevicesKPIs(); 
		RegistereddevicesKPIsPage.verifyAddRegisteredDeviceKPIFields();
		
		log.info("****************************** Ending Test Case : Verify Add Registered Device KPI Fields  *****************************************");
	}
}





