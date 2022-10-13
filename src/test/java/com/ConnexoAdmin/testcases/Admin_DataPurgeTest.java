package com.ConnexoAdmin.testcases;
import com.ConnexoAdmin.pages.AdminRelativePeriod.Admin_DataPurgePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Admin_DataPurgeTest extends TestBase {
	
	String AddValue = "PurgeValue_Sheet";	
	
	Admin_DataPurgePage Admin_DataPurgePage;
	
	Logger log = Logger.getLogger(Admin_DataPurgeTest.class);  
	
	public Admin_DataPurgeTest()
	{
		super();
	}
	
	@DataProvider 
	public Object[][] dpAddValue() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddValue);
		return testData;
	}
	

	@Test(priority =1, enabled = true, description = "Click Purge Setting")
	public void clickPurgeSetting() throws InterruptedException, IOException, AWTException
	{
		Admin_DataPurgePage = new Admin_DataPurgePage();  
		
		reporterLog("Starting testcase Verify Purge Setting page");
		
		log.info("************************ starting Click on data purge settings test case *************************");

		Admin_DataPurgePage.clickOnPurgeSettingLink();

		log.info("************************ Ending Click on data purge settings test case *************************");
		
		waitForTime(2000); 
	}      


	@Test(priority =2, dataProvider = "dpAddValue", enabled = true, description = "Add Relative Period data")
	public void AddRelativePeriodData(String Value) throws InterruptedException, IOException, AWTException
	{		
		reporterLog("Starting testcase Verify Purge Setting page");		
		
		log.info("************************ starting Click and Modify Purge Setting Value test case *************************");

		Admin_DataPurgePage.clickDataPurgeSettingLinkAndModify(Value);

		log.info("************************ Ending  Click and Modify Purge Setting Value test case *************************");
		
		waitForTime(2000); 
	}

	@Test(priority =3, enabled = false, description = "Remove Relative Period Data") 
	public void removeRelativePeriodData() throws InterruptedException, IOException, AWTException
	{		
		reporterLog("Starting testcase Verify data purge history page ");
		
		log.info("************************ starting data purge history test case *************************");

		Admin_DataPurgePage.clickDataPurgeHistoryLink();
		
		waitForTime(1000);

		log.info("************************ Ending data purge history test case *************************");
		
		waitForTime(2000); 
	}
}
