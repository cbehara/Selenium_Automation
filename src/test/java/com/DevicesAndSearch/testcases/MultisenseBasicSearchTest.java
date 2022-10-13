package com.DevicesAndSearch.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

import com.DevicesAndSearch.pages.Search.MultisenseSearchPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class MultisenseBasicSearchTest extends TestBase {	
	
		String BasicSearchSheet = "BasicSearch";
		MultisenseSearchPage multisenseSearchPage;
		Logger log = Logger.getLogger(MultisenseBasicSearchTest.class);    
		
		public MultisenseBasicSearchTest()
		{
			super();
			
		}		
		@DataProvider(name= "dp")
		public Object[] getTestDataForBasicSearchBasedonColumnName(Method m) 
		{ 
			Object testData[]=null;
			if (m.getName().equalsIgnoreCase("PerformNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"Name");
			else if (m.getName().equalsIgnoreCase("PerformSerialNumberSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"SerialNumber");
			else if (m.getName().equalsIgnoreCase("PerformDeviceTypeSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"DeviceType");
			else if (m.getName().equalsIgnoreCase("PerformLocationSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"Location");
			else if (m.getName().equalsIgnoreCase("PerformDevConfigSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"DeviceConfiguration");
			else if (m.getName().equalsIgnoreCase("PerformDevStateSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"State");
			else if (m.getName().equalsIgnoreCase("PerformDevGroupSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(BasicSearchSheet,"DeviceGroup");
			
			return testData;
		}
		
		@Parameters("strBrowserName")
	  	@BeforeClass
	  	public void setUp(String browser) throws InterruptedException
	  	{
	  		initialization(browser);
	  		multisenseSearchPage = new MultisenseSearchPage();            
	  		
			 reporterLog("Before Class : Select MultiSense");
			  log.info("Before Class : Select MultiSense"); waitForTime(1000);
			  multisenseSearchPage.SelectMultiSense(); waitForTime(500);
			  catchCFT1000Alert(); log.info(" Ending Before Class : Select MultiSense");
		 }	  
		
			
		@BeforeMethod public void clickSearch() throws InterruptedException,
			  AWTException, IOException {
			  reporterLog("Starting testcase : click on search field");
			  log.info("starting testcase : click on search field"); waitForTime(1000);
			  multisenseSearchPage.ClickOnSearchOption(); waitForTime(500);
			  catchCFT1000Alert(); log.info(" Ending testcase : click on search field"); }
			 
		 
		@Test(priority=1, enabled = true,dataProvider = "dp", description ="Perform Name Field search")
		public void PerformNameSearch(String Name) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!Name.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on Name Field");
					log.info("Starting testcase : Performing Search Test on Name Field");
					
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleName",Name);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					////div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[1]/div/a
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateDataColumnBasis(1,Name);
					waitForTime(500);					
					log.info("Name Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : Name Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
		@Test(priority=2, enabled = true,dataProvider = "dp", description ="Perform Serial Number Field search")
		public void PerformSerialNumberSearch(String SerialNumber) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!SerialNumber.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on SerialNumber Field");
					log.info("Starting testcase : Performing Search Test on SerialNumber Field");					
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleSerialNumber",SerialNumber);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					////div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[1]/div/a
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateDataColumnBasis(2,SerialNumber);
					waitForTime(500);					
					log.info("Name Field Search Result:" + bResult);
					
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : SerialNumber Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
		@Test(priority=3, enabled = true,dataProvider = "dp", description ="Perform Device Type Field search")
		public void PerformDeviceTypeSearch(String DeviceType) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!DeviceType.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on DeviceType Field");
					log.info("Starting testcase : Performing Search Test on DeviceType Field");					
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceType",DeviceType);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateDataColumnBasis(3,DeviceType);
					waitForTime(500);					
					log.info("Name Field Search Result:" + bResult);
					
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : DeviceType Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
		@Test(priority=4, enabled = true,dataProvider = "dp", description ="Perform Device Configuration Field search")
		public void PerformDevConfigSearch(String DeviceConfig) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!DeviceConfig.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on Location Field");
					log.info("Starting testcase : Performing Search Test on Location Field");					
					waitForTime(500);
					String DevType =DeviceConfig.split(";")[0];
					String DevConfig =DeviceConfig.split(";")[1];
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceType",DevType);
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceConfig",DevConfig);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateDataColumnBasis(3,DevType);
					waitForTime(500);	
					 bResult =bResult && multisenseSearchPage.ValidateDataColumnBasis(4,DevConfig);
					waitForTime(500);
					log.info("Device Configuration Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : Device Configuration Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
				}
			
		}
		@Test(priority=5, enabled = true,dataProvider = "dp", description ="Perform Device State search")
		public void PerformDevStateSearch(String DeviceState) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!DeviceState.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on Device State Field");
					log.info("Starting testcase : Performing Search Test on Device State Field");					
					waitForTime(500);
					String DevType =DeviceState.split(";")[0];
					String DevConfig =DeviceState.split(";")[1];
					String DevState =DeviceState.split(";")[2];
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceType",DevType);
					waitForTime(500);
					if(!DevConfig.equalsIgnoreCase("NA"))
						multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceConfig",DevConfig);
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceState",DevState);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult;
					if ((isDisplayed("Multisense_Search_NoSearchResult")) && (DevState.equalsIgnoreCase("!=:Active (Standard device life cycle)")))
					{
						bResult = true;			
					}
					else
					{
						bResult = multisenseSearchPage.ValidateDataColumnBasis(3,DevType);
						waitForTime(500);
						if(!DevConfig.equalsIgnoreCase("NA"))
							bResult =bResult && multisenseSearchPage.ValidateDataColumnBasis(4,DevConfig);
						waitForTime(500);
						bResult =bResult && multisenseSearchPage.ValidateDataColumnBasis(5,DevState);					
					}					
					waitForTime(500);
					log.info("Device State Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : Device State Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);					
				}
			
		}
		@Test(priority=6, enabled = true,dataProvider = "dp", description ="Perform Device Group search")
		public void PerformDevGroupSearch(String DeviceGroup) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!DeviceGroup.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on Device Group Field");
					log.info("Starting testcase : Performing Search Test on Device Group Field");					
					waitForTime(500);
					
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceGroup",DeviceGroup);
					waitForTime(500);
					
					multisenseSearchPage.clickSearchBtn();
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					
					boolean bResult =multisenseSearchPage.ValidateDataColumnBasis(3,DeviceGroup.split(":")[0] + ":Elster A1800");
					waitForTime(500);
					  
					log.info("Device Group Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					 
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : Device Group Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}
		@Test(priority=7, enabled = true,dataProvider = "dp", description ="Perform Location Field search")
		public void PerformLocationSearch(String Location) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!Location.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on Location Field");
					log.info("Starting testcase : Performing Search Test on Location Field");					
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleLocation",Location);
					waitForTime(500);
					Location =Location.split(":")[0] + ":" + multisenseSearchPage.fetchSelectedLocation("Multisense_Search_eleLocation_Selected");
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateDataColumnBasis(6,Location);
					waitForTime(500);					
					log.info("Name Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : Location Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
	
}
