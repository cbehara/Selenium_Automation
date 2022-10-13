package com.DevicesAndSearch.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.DevicesAndSearch.pages.Search.MultisenseSearchPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class MultisenseSearchTest extends TestBase {	
	
		String BulkActionCreateIssueSheet = "BulkIssueCreation";
		MultisenseSearchPage multisenseSearchPage;
		Logger log = Logger.getLogger(MultisenseSearchTest.class);    
		
		public MultisenseSearchTest()
		{
			super();
		}		

		@DataProvider 
		public Object[][] getTestDataForCreateIssue() 
		{ 
			Object testData[][] = TestUtil.getTestDataDeviceAndSearch(BulkActionCreateIssueSheet);
			return testData;
		}
		
		@Test(priority=1, enabled = true, description ="click on search field")
		public void clickSearch() throws InterruptedException, AWTException, IOException
		{		 
			multisenseSearchPage = new MultisenseSearchPage();   
			reporterLog("Starting testcase : click on search field");
			log.info("starting testcase : click on search field");
			waitForTime(1000);
			multisenseSearchPage.selectSearchTitle();
			waitForTime(500);
			catchCFT1000Alert();			
			log.info(" Ending testcase : click on search field"); 		
		}
		
		@Test(priority=2, enabled = true, description ="Select all device types and select electricity devices and click on search")
		public void selectDeviceAndSearch() throws InterruptedException, AWTException, IOException
		{		 
			reporterLog("Starting testcase : Select all device types and select electricity devices and click on search");
			log.info("starting testcase : Select all device types and select electricity devices and click on search");
			
			waitForTime(500);
			multisenseSearchPage.clickondeviceType();
			waitForTime(500);
			multisenseSearchPage.clickonDeviceGroup();
			waitForTime(1000);
			multisenseSearchPage.clickonGroupOptionSelect();
			waitForTime(1000);
			multisenseSearchPage.clickSearchBtn();
			//waitForTime(1000);
			//TestUtil.takeScreenshotAtEndOfTest();
			log.info(" Ending testcase : Select all device types and select electricity devices and click on search "); 		
		}
		
		@Test(priority = 3, enabled = true, description ="Select 1000 and Click count from the search results per page")
		public void countAndselect()
		{
			reporterLog("Starting testcase : Select 1000 and Click count from the search results per page");
			log.info(" Starting testcase : Select 1000 and Click count from the search results per page"); 
			waitForTime(1000);		

			multisenseSearchPage.clickPerPage();
			waitForTime(5000);
			multisenseSearchPage.clickCount();
			//waitForTime(2000);
			log.info(" Ending case : Select 1000 and Click count from the search results per page. ");
		}
		
		@Test(priority = 4, enabled = true, description ="Click on columns and select two more options from drop down and click on Done" )
		public void columnSelect()
		{
			reporterLog("Starting testcase : Click on columns and select two more options from drop down and click on Done");
			log.info(" Starting testcase : Click on columns and select two more options from drop down and click on Done "); 
			waitForTime(1000);			

			multisenseSearchPage.clickonColumnSelectOption();
			log.info(" Ending case : Click on columns and select two more options from drop down and click on Done ");
		}


		@Test(priority = 5, enabled = true, description ="BulkAction Button click,select device and search ")
		public void setBulkAction()
		{
			reporterLog("Starting testcase Click on BulkAction");
			log.info(" Starting testcase : Click on BulkAction "); 
			waitForTime(1000);			
			multisenseSearchPage.clickBulkAction();
			waitForTime(5000);
			multisenseSearchPage.clickSelectoptionClickNext();
			waitForTime(1000);
			log.info(" Ending case : Click on BulkAction Page");
		}


		@Test(priority = 6, enabled = true, description="Select communication schedule")
		public void selectCommunicationSchedule()
		{
			reporterLog("Starting testcase Select communication schedule");
			log.info(" Starting testcase : Select communication schedule"); 
			waitForTime(1000);
			
			multisenseSearchPage.clickcommunicationSchedule();

			log.info(" Ending case : Click on Add shared communication schedules and click on Next");
		}

		@Test(priority = 7, enabled = true, description="Remove Communication Schedule" )
		public void removeOldScheduleandConfirm()
		{
			reporterLog("Starting testcase Click on Remove old shared communication schedule");
			log.info(" Starting testcase : Click on Remove old shared communication schedule"); 
			
			waitForTime(1000);
			multisenseSearchPage.clickRemoveScheduleandConfirm();
			waitForTime(4000);
			log.info(" Ending case : Click on Remove old shared communication schedule");
		}

		@Test(priority = 8, enabled = true, description="Add Criteria" )
		public void addCriteriaCommunicationTask()
		{
			reporterLog("Starting testcase Add Criteria");
			log.info(" Starting case : Add Criteria"); 		
			waitForTime(2000);
			multisenseSearchPage.clickAddCriteria();
			waitForTime(2000);
			log.info(" Ending case : Add Criteria ");
		}	

		@Test(priority = 9, enabled = true, description=" Click Add criteria and Click Bulk Action  ")
		public void ClickBulkActionItem()
		{
			reporterLog("Starting testcase Perform Bulk Action");
			log.info(" Starting case : Perform Bulk Action"); 
			waitForTime(1000);		
			multisenseSearchPage.clickBulkActionBtn();
			log.info(" Ending case : Perform Bulk Action "); 
		}
		
		@Test(priority = 10, enabled = true, description=" Click BulkAction and Select Create Issue  ")
		public void ClickCreateIssue()
		{
			reporterLog("Starting testcase Click Create Issue");
			log.info(" Starting case : Click Create Issue"); 		
			waitForTime(2000);
			multisenseSearchPage.clickCreateIssue();
			waitForTime(2000);
			log.info(" Ending case : Click Create Issue");	
		}

		@Test(priority = 11, enabled = true, dataProvider = "getTestDataForCreateIssue", description=" Fill Issue Form ")
		public void fillupIssueFormandFinish(String IssueReason,String IssueUrgency, String IssueImpact )
		{
			reporterLog("Starting testcase Fill Issue Form And Confirm");
			log.info(" Starting case : Fill Issue Form And Confirm"); 			
			waitForTime(2000);
			multisenseSearchPage.createIssue(IssueReason, IssueUrgency, IssueImpact );
			waitForTime(4000);
			log.info(" Ending case : Fill Issue Form ");		
		}

		@Test (priority = 12, enabled = true, dataProvider = "getTestDataForCreateIssue", description="Confirm And Finsih")
		public void ClickConfirmAndFinish(String IssueReason, String IssueUrgency, String IssueImpact)
		{	
			reporterLog("Starting testcase Click Confirm And Finish");
			log.info(" Starting case : Starting testcase Click Confirm And Finish"); 
			
			waitForTime(1000);
			multisenseSearchPage.FinishBulkAction();
			log.info(" Ending case : Confirm And Finish ");		 
		}	
	
}
