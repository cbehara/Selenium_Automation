package com.DevicesAndSearch.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.DevicesAndSearch.pages.Search.MultisenseSearchPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class MultisenseAdvanceSearchTest extends TestBase {	
	
		String AdvanceSearchSheet = "AdvanceSearch";
		MultisenseSearchPage multisenseSearchPage;
		Logger log = Logger.getLogger(MultisenseAdvanceSearchTest.class);    
		
		public MultisenseAdvanceSearchTest()
		{
			super();
		}		

		@DataProvider(name= "dp")
		public Object[] getTestDataForAdvanceSearchBasedonColumnName(Method m) 
		{ 
			Object testData[]=null;
			if (m.getName().equalsIgnoreCase("PerformMRIDSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"MRIDFromSerialNumber");
			else if (m.getName().equalsIgnoreCase("PerformConnectionMethodSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Connectionmethod");
			else if (m.getName().equalsIgnoreCase("PerformSharedScheduleSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Sharedschedule");
			else if (m.getName().equalsIgnoreCase("PerformChannelIntervalSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ChannelInterval");
			else if (m.getName().equalsIgnoreCase("PerformChannelOBISCodeSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ChannelOBISCode");
			else if (m.getName().equalsIgnoreCase("PerformCommunicationTaskNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"CommunicationTaskName");
			else if (m.getName().equalsIgnoreCase("PerformCommunicationTaskNextCommunicationSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"CommunicationTaskNextCommunication");
			else if (m.getName().equalsIgnoreCase("PerformCommunicationTaskPlannedDateSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"CommunicationTaskPlannedDate");
			else if (m.getName().equalsIgnoreCase("PerformCommunicationTaskScheduleNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"CommunicationTaskScheduleName");
			else if (m.getName().equalsIgnoreCase("PerformCommunicationTaskScheduleTypeSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"CommunicationTaskScheduleType");
			else if (m.getName().equalsIgnoreCase("PerformConnectionAllowSimulataneousConnectionSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ConnectionAllowSimulataneousConnection");
			else if (m.getName().equalsIgnoreCase("PerformConnectionCommunicationPortPoolSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ConnectionCommunicationPortPool");
			else if (m.getName().equalsIgnoreCase("PerformConnectionDirectionSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ConnectionDirection");
			else if (m.getName().equalsIgnoreCase("PerformConnectionNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ConnectionName");
			else if (m.getName().equalsIgnoreCase("PerformConnectionStatusSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"ConnectionStatus");
			else if (m.getName().equalsIgnoreCase("PerformDeviceAttributesManufacturerSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Device Attributes Manufacturer");
			else if (m.getName().equalsIgnoreCase("PerformDeviceAttributesModelNumberSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Device Attributes Model Number");
			else if (m.getName().equalsIgnoreCase("PerformDeviceAttributesModelversionSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Device Attributes Model version");
			else if (m.getName().equalsIgnoreCase("PerformDeviceAttributesYrOfCertificationSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Device Attributes Year of certification");
			else if (m.getName().equalsIgnoreCase("PerformEstimationDataestimationSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Estimation Data estimation");
			else if (m.getName().equalsIgnoreCase("PerformloadprofileNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"load profile Name");
			else if (m.getName().equalsIgnoreCase("PerformLogbookNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Logbook Name");
			else if (m.getName().equalsIgnoreCase("PerformLogbookOBIScodeSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Logbook OBIScode");
			else if (m.getName().equalsIgnoreCase("PerformRegisterOBIScodeSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Register OBIS code");
			else if (m.getName().equalsIgnoreCase("PerformRegisterRegisterTypeNameSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Register RegisterTypeName");
			else if (m.getName().equalsIgnoreCase("PerformRegisterRegisterTypeUnitofMeasureSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Register Unit of measure");
			else if (m.getName().equalsIgnoreCase("PerformSecurityHasServiceKeySearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Security HasServiceKey");
			else if (m.getName().equalsIgnoreCase("PerformTopologyHasMasterDeviceSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Topology HasMasterDevice");
			else if (m.getName().equalsIgnoreCase("PerformTopologySlaveDeviceSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Topology SlaveDevice");
			else if (m.getName().equalsIgnoreCase("PerformTransitionsInstallationdateSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Transitions Installationdate");
			else if (m.getName().equalsIgnoreCase("PerformTransitionShipmentdateSearch"))
				testData = TestUtil.getTestDataDeviceAndSearchBasedOnColName(AdvanceSearchSheet,"Transition Shipmentdate");
				
			return testData;
		}
		
		@Parameters("strBrowserName")
	  	@BeforeClass
	  	public void setUp(String browser) throws InterruptedException
	  	{
	  		initialization(browser);
	  		multisenseSearchPage = new MultisenseSearchPage();            
	  		
			 reporterLog("Starting Before Class : Select MultiSense");
			  log.info("Starting Before Class : Select MultiSense"); waitForTime(1000);
			  multisenseSearchPage.SelectMultiSense(); waitForTime(500);
			  catchCFT1000Alert(); log.info(" Ending Before Class : Select MultiSense");
		 }	  
		
			
		@BeforeMethod public void clickSearch() throws InterruptedException,
			  AWTException, IOException {
			  reporterLog("Starting BeforeMethod : click on search field");
			  log.info("starting testcase : click on search field"); waitForTime(1000);			  
			  multisenseSearchPage.ClickOnSearchOption(); waitForTime(500);
			  catchCFT1000Alert(); log.info(" Ending BeforeMethod : click on search field"); }
			 
		
		@Test(priority=1, enabled = true,dataProvider = "dp", description ="Perform MRID Field search")
		public void PerformMRIDSearch(String SerialNum) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
			/*
			 * if(!MRID.equalsIgnoreCase("NA")) {
			 * reporterLog("Starting testcase : Performing Search Test on MRID Field");
			 * log.info("Starting testcase : Performing Search Test on MRID Field");
			 * waitForTime(500);
			 * multisenseSearchPage.AddCriteria("Multisense_Search_OptionMRID","");
			 * waitForTime(500);
			 * multisenseSearchPage.clickonCriteria("Multisense_Search_eleMRID",MRID);
			 * waitForTime(500); multisenseSearchPage.clickSearchBtn();
			 * ////div[@class='x-grid-view x-fit-item
			 * x-grid-view-default']//tr[1]/td[1]/div/a waitForTime(5000);
			 * multisenseSearchPage.clickCount(); waitForTime(5000); boolean bResult =
			 * multisenseSearchPage.ValidateAdvanceSearch("MRID",MRID); waitForTime(500);
			 * log.info("MRID Field Search Result:" + bResult);
			 * 
			 * multisenseSearchPage.clickClearAllBtn();
			 * log.info(" Ending testcase : MRID Field Search completed ");
			 * AssertJUnit.assertEquals(true, bResult); }
			 */
			if(!SerialNum.equalsIgnoreCase("NA"))
			{
				reporterLog("Starting testcase : Performing Search Test on MRID Field");
				log.info("Starting testcase : Performing Search Test on MRID Field");					
				waitForTime(500);
				String szMRID,MRID,SerialNumber;
				String szSearchCriteria = SerialNum.split(":")[0];
				SerialNumber = "=:" + SerialNum.split(":")[1];
				multisenseSearchPage.clickonCriteria("Multisense_Search_eleSerialNumber",SerialNumber);
				waitForTime(500);
				multisenseSearchPage.clickSearchBtn();
				////div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[1]/div/a
				waitForTime(5000);
				multisenseSearchPage.OpenDevicePage("1","MultiSense_Devices_DeviceAttributeMenu","");
				
				szMRID =multisenseSearchPage.DevicePageDetails("MultiSense_Devices_DeviceAttribute_MRIDText");
				MRID = szSearchCriteria + ":" + szMRID;
				multisenseSearchPage.clickClearAllBtn();
				waitForTime(500);
				clickSearch();					
				multisenseSearchPage.AddCriteria("Multisense_Search_OptionMRID","");
				waitForTime(500);
				multisenseSearchPage.clickonCriteria("Multisense_Search_eleMRID",MRID);
				waitForTime(500);
				multisenseSearchPage.clickSearchBtn();
				////div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[1]/div/a
				waitForTime(5000);
				multisenseSearchPage.clickCount();
				waitForTime(5000);
				boolean bResult = multisenseSearchPage.ValidateDataColumnBasis(2,SerialNum);
				waitForTime(500);					
				log.info("MRID Field Search Result:" + bResult);
				
				multisenseSearchPage.clickClearAllBtn();
				log.info(" Ending testcase : MRID Field Search completed ");
				AssertJUnit.assertEquals(true, bResult);
			}
			
		}	
		@Test(priority=2, enabled = true,dataProvider = "dp", description ="Perform Connection Method Field search")
		public void PerformConnectionMethodSearch(String ConnectionMethod) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!ConnectionMethod.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on Connection Method Field");
					log.info("Starting testcase : Performing Search Test on Connection Method Field");
					
					waitForTime(500);
					multisenseSearchPage.AddCriteria("Multisense_Search_OptionConnectionMethod","");
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleConnectionmethod",ConnectionMethod);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Connection Method",ConnectionMethod);
					waitForTime(500);					
					log.info("Connection Method Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : Connection Method Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
		@Test(priority=3, enabled = true,dataProvider = "dp", description ="Perform Connection Shared Schedule search")
		public void PerformSharedScheduleSearch(String SharedSchedule) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!SharedSchedule.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on 'Shared schedule' Field");
					log.info("Starting testcase : Performing Search Test on 'Shared schedule' Field");
					
					waitForTime(500);
					multisenseSearchPage.AddCriteria("Multisense_Search_OptionSharedSchedule","");
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleSharedschedule",SharedSchedule);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Shared schedule",SharedSchedule);
					waitForTime(500);					
					log.info("'Shared schedule' Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : 'Shared schedule' Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
		@Test(priority=4, enabled = true,dataProvider = "dp", description ="Perform Connection Channel-Interval search")
		public void PerformChannelIntervalSearch(String ChannelInterval) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!ChannelInterval.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on 'Channel-Interval' Field");
					log.info("Starting testcase : Performing Search Test on 'Channel-Interval' Field");
					
					waitForTime(500);
					multisenseSearchPage.AddCriteria("Multisense_Search_Channel","Multisense_Search_Interval");
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleChennel_Interval",ChannelInterval);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("CHANNEL INTERVAL",ChannelInterval);
					waitForTime(500);					
					log.info("Channel-Interval Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : 'Channel-Interval' Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}	
		@Test(priority=5, enabled = true,dataProvider = "dp", description ="Perform Connection Channel-OBIS Code search")
		public void PerformChannelOBISCodeSearch(String ChannelOBISCode) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!ChannelOBISCode.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on 'Channel-OBIS Code' Field");
					log.info("Starting testcase : Performing Search Test on 'Channel-OBIS Code' Field");
					waitForTime(500);
					multisenseSearchPage.AddCriteria("Multisense_Search_Channel","Multisense_Search_OBISCode");
					waitForTime(500);
					//multisenseSearchPage.clickonCriteria("NAME",Name);
				//	waitForTime(500);					
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleChennel_OBISCode",ChannelOBISCode);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("CHANNEL OBISCode",ChannelOBISCode);
					waitForTime(500);					
					log.info("Channel-OBIS Code Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : 'Channel-OBIS Code' Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}
		@Test(priority=6, enabled = true,dataProvider = "dp", description ="Perform CommunicationTask-Name search")
		public void PerformCommunicationTaskNameSearch(String CommunicationTaskName) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!CommunicationTaskName.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on 'CommunicationTask-Name' Field");
					log.info("Starting testcase : Performing Search Test on 'CommunicationTask-Name' Field");
					
					waitForTime(500);
					multisenseSearchPage.AddCriteria("Multisense_Search_CommunicationTask","Multisense_Search_CommunicationTask_Name");
					waitForTime(500);
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleCommunicationTask_Name",CommunicationTaskName);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("CommunicationTask Name",CommunicationTaskName);
					waitForTime(500);					
					log.info("CommunicationTask-Name Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : 'CommunicationTask-Name' Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}
		//
		
		  @Test(priority=7, enabled = true,dataProvider="dp",description ="Perform CommunicationTas-NextCommunication search") 
		  public void PerformCommunicationTaskNextCommunicationSearch(String CommunicationTasNextCommunication) throws InterruptedException, AWTException,IOException 
		  {
			  if(!CommunicationTasNextCommunication.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'CommunicationTas-NextCommunication' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'CommunicationTas-NextCommunication' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_CommunicationTask","Multisense_Search_CommunicationTask_NextCommunication");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria_DateFilter("Multisense_Search_eleCommunicationTask_NextCommunication",CommunicationTasNextCommunication);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage. ValidateAdvanceSearch("CommunicationTask NextCommunication",CommunicationTasNextCommunication);
				  waitForTime(500);
				  log.info("CommunicationTas-NextCommunication Field Search Result:" + bResult); 
				 // AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'CommunicationTas-NextCommunication' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  }
		  
		  }
		 
		@Test(priority=8, enabled = true,dataProvider = "dp", description ="Perform CommunicationTas-ScheduleName search")
		public void PerformCommunicationTaskScheduleNameSearch(String CommunicationTaskScheduleNames) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!CommunicationTaskScheduleNames.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on 'CommunicationTas-ScheduleName' Field");
					log.info("Starting testcase : Performing Search Test on 'CommunicationTas-ScheduleName' Field");
					
					waitForTime(500);
					
					
					//String Name =CommunicationTaskScheduleNames.split(";")[0];
					String CommunicationTaskScheduleName =CommunicationTaskScheduleNames;//.split(";")[1];
					waitForTime(500);
					//multisenseSearchPage.clickonCriteria("NAME",Name);
				//	waitForTime(500);
					multisenseSearchPage.AddCriteria("Multisense_Search_CommunicationTask","Multisense_Search_CommunicationTask_ScheduleName");
					waitForTime(500);						
					
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleCommunicationTask_ScheduleName",CommunicationTaskScheduleName);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();
					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("CommunicationTask ScheduleName",CommunicationTaskScheduleName);
					waitForTime(500);					
					log.info("CommunicationTas-ScheduleName Field Search Result:" + bResult);
					//AssertJUnit.assertEquals(true, bResult);
					multisenseSearchPage.clickClearAllBtn();
					log.info(" Ending testcase : 'CommunicationTas-ScheduleName' Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}
		@Test(priority=9, enabled = true,dataProvider = "dp", description ="Perform CommunicationTask-ScheduleType search")
		public void PerformCommunicationTaskScheduleTypeSearch(String CommunicationTaskScheduleType) throws InterruptedException, AWTException, IOException //, String SerialNumber,String DeviceType,String DeviceConfiguration,String State, String DeviceGroup, String Location
		{	
				if(!CommunicationTaskScheduleType.equalsIgnoreCase("NA"))
				{
					reporterLog("Starting testcase : Performing Search Test on 'CommunicationTask-ScheduleType' Field");
					log.info("Starting testcase : Performing Search Test on 'CommunicationTask-ScheduleType' Field");					
					waitForTime(500);					
					multisenseSearchPage.AddCriteria("Multisense_Search_CommunicationTask","Multisense_Search_CommunicationTask_ScheduleType");
					waitForTime(500);
									
					multisenseSearchPage.clickonCriteria("Multisense_Search_eleCommunicationTask_ScheduleType",CommunicationTaskScheduleType);
					waitForTime(500);
					multisenseSearchPage.clickSearchBtn();					
					waitForTime(5000);
					multisenseSearchPage.clickCount();
					waitForTime(5000);
					boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("CommunicationTask ScheduleType",CommunicationTaskScheduleType);
					waitForTime(500);					
					log.info("CommunicationTask-ScheduleType Field Search Result:" + bResult);
					multisenseSearchPage.clickClearAllBtn();
					//AssertJUnit.assertEquals(true, bResult);
					
					log.info(" Ending testcase : 'CommunicationTask-ScheduleType' Field Search completed ");
					AssertJUnit.assertEquals(true, bResult);
					
				}
			
		}
		@Test(priority=10, enabled = true,dataProvider="dp",description ="Perform CommunicationTask-PlannedDate search") 
		  public void  PerformCommunicationTaskPlannedDateSearch(String CommunicationTaskPlannedDate) throws InterruptedException, AWTException,IOException 
		  {
			  if(!CommunicationTaskPlannedDate.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'CommunicationTask-PlannedDate' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'CommunicationTask-PlannedDate' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_CommunicationTask","Multisense_Search_CommunicationTask_PlannedDate");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria_DateFilter("Multisense_Search_eleCommunicationTask_PlannedDate",CommunicationTaskPlannedDate);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("CommunicationTask PlannedDate",CommunicationTaskPlannedDate);
				  waitForTime(500);
				  log.info("CommunicationTask-PlannedDate Field Search Result:" + bResult); 
				 // AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'CommunicationTask-PlannedDate' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  	
			  }		  
		  }
		@Test(priority=11, enabled = true,dataProvider="dp",description ="Perform Connection AllowSimulataneousConnection search") 
		  public void PerformConnectionAllowSimulataneousConnectionSearch(String ConnectionAllowSimulataneousConnection) throws InterruptedException, AWTException,IOException 
		  {
			  if(!ConnectionAllowSimulataneousConnection.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'Connection AllowSimulataneousConnection' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'Connection AllowSimulataneousConnection' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_Connection","Multisense_Search_Connection_AllowSimulataneousConnection");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria("Multisense_Search_eleConnection_AllowSimulataneousConnection",ConnectionAllowSimulataneousConnection);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Connection AllowSimulataneousConnection",ConnectionAllowSimulataneousConnection);
				  waitForTime(500);
				  log.info("Connection AllowSimulataneousConnection Field Search Result:" + bResult); 
				 // AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'Connection AllowSimulataneousConnection' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  	
			  }		  
		  }
		@Test(priority=12, enabled = true,dataProvider="dp",description ="Perform Connection CommunicationPortPool search") 
		  public void PerformConnectionCommunicationPortPoolSearch(String ConnectionCommunicationPortPool) throws InterruptedException, AWTException,IOException 
		  {
			  if(!ConnectionCommunicationPortPool.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'Connection CommunicationPortPool' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'Connection CommunicationPortPool' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_Connection","Multisense_Search_Connection_CommunicationPortPool");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria("Multisense_Search_eleConnection_CommunicationPortPool",ConnectionCommunicationPortPool);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Connection CommunicationPortPool",ConnectionCommunicationPortPool);
				  waitForTime(500);
				  log.info("Connection CommunicationPortPool Field Search Result:" + bResult); 
				  //AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'Connection CommunicationPortPool' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  	
			  }		  
		  }
		@Test(priority=13, enabled = true,dataProvider="dp",description ="Perform Connection Direction search") 
		  public void PerformConnectionDirectionSearch(String ConnectionDirection) throws InterruptedException, AWTException,IOException 
		  {
			  if(!ConnectionDirection.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'Connection Direction' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'Connection Direction' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_Connection","Multisense_Search_Connection_Direction");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria("Multisense_Search_eleConnection_Direction",ConnectionDirection);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Connection Direction",ConnectionDirection);
				  waitForTime(500);
				  log.info("Connection Direction Field Search Result:" + bResult); 
				 // AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'Connection Direction' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  	
			  }		  
		  }
		@Test(priority=14, enabled = true,dataProvider="dp",description ="Perform Connection Name search") 
		  public void PerformConnectionNameSearch(String ConnectionName) throws InterruptedException, AWTException,IOException 
		  {
			  if(!ConnectionName.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'Connection Name' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'Connection Name' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_Connection","Multisense_Search_Connection_Name");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria("Multisense_Search_eleConnection_Name",ConnectionName);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Connection Name",ConnectionName);
				  waitForTime(500);
				  log.info("Connection Name Field Search Result:" + bResult); 
				 // AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'Connection Name' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  	
			  }		  
		  }
		@Test(priority=15, enabled = true,dataProvider="dp",description ="Perform Connection Status search") 
		  public void PerformConnectionStatusSearch(String ConnectionStatus) throws InterruptedException, AWTException,IOException 
		  {
			  if(!ConnectionStatus.equalsIgnoreCase("NA"))
			  {
				  reporterLog("Starting testcase : Performing Search Test on 'Connection Status' Field" ); 
				  log.info("Starting testcase : Performing Search Test on 'Connection Status' Field" );
				  
				  waitForTime(500);
				  multisenseSearchPage.AddCriteria("Multisense_Search_Connection","Multisense_Search_Connection_Status");
				  waitForTime(500);
				  multisenseSearchPage.clickonCriteria("Multisense_Search_eleConnection_Status",ConnectionStatus);
				  waitForTime(500);
				  multisenseSearchPage.clickSearchBtn();				  
				  waitForTime(5000); multisenseSearchPage.clickCount();
				  waitForTime(5000);
				  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Connection Status",ConnectionStatus);
				  waitForTime(500);
				  log.info("Connection Status Field Search Result:" + bResult); 
				  //AssertJUnit.assertEquals(true, bResult);
				  multisenseSearchPage.clickClearAllBtn(); 
				  log.info(" Ending testcase : 'Connection Status' Field Search completed ");
				  AssertJUnit.assertEquals(true, bResult);
			  	
			  }		  
		  }
		@Test(priority=16, enabled = true,dataProvider="dp",description ="Perform Device Attributes Manufacturer search") 
		public void PerformDeviceAttributesManufacturerSearch(String DevAttrManufacturer) throws InterruptedException, AWTException,IOException 
		{
		  if(!DevAttrManufacturer.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Device Attributes Manufacturer' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Device Attributes Manufacturer' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_DeviceAttribute","Multisense_Search_DeviceAttribute_Manufacturer");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceAttribute_Manufacturer",DevAttrManufacturer);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("DeviceAttributes Manufacturer",DevAttrManufacturer);
			  waitForTime(500);
			  log.info("Device Attributes Manufacturer Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Device Attributes Manufacturer' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=17, enabled = true,dataProvider="dp",description ="Perform Device Attributes Model Number search") 
		public void PerformDeviceAttributesModelNumberSearch(String DeviceAttributesModelNumber) throws InterruptedException, AWTException,IOException 
		{
		  if(!DeviceAttributesModelNumber.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Device Attributes Model Number' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Device Attributes Model Number' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_DeviceAttribute","Multisense_Search_DeviceAttribute_ModelNo");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceAttribute_ModelNo",DeviceAttributesModelNumber);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("DeviceAttributes ModelNumber",DeviceAttributesModelNumber);
			  waitForTime(500);
			  log.info("Device Attributes Model Number Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Device Attributes Model Number' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=18, enabled = true,dataProvider="dp",description ="Perform Device Attributes Model version search") 
		public void PerformDeviceAttributesModelversionSearch(String DeviceAttributesModelVersion) throws InterruptedException, AWTException,IOException 
		{
		  if(!DeviceAttributesModelVersion.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Device Attributes Model version' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Device Attributes Model version' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_DeviceAttribute","Multisense_Search_DeviceAttribute_ModelVersion");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceAttribute_ModelVersion",DeviceAttributesModelVersion);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("DeviceAttributes ModelVersion",DeviceAttributesModelVersion);
			  waitForTime(500);
			  log.info("Device Attributes Model version Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Device Attributes Model version' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }	
		  
		}
		@Test(priority=19, enabled = true,dataProvider="dp",description ="Perform Device Attributes Year of certification search") 
		public void PerformDeviceAttributesYrOfCertificationSearch(String DeviceAttributesYrOfCertification) throws InterruptedException, AWTException,IOException 
		{
		  if(!DeviceAttributesYrOfCertification.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Device Attributes Year of certification' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Device Attributes Year of certification' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_DeviceAttribute","Multisense_Search_DeviceAttribute_YrOfCertificate");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleDeviceAttribute_YrOfCertificate",DeviceAttributesYrOfCertification);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("DeviceAttributes Yearofcertification",DeviceAttributesYrOfCertification);
			  waitForTime(500);
			  log.info("Device Attributes Year of certification Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Device Attributes Year of certification' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=20, enabled = true,dataProvider="dp",description ="Perform Estimation Dataestimation search") 
		public void PerformEstimationDataestimationSearch(String EstimationDataestimation) throws InterruptedException, AWTException,IOException 
		{
		  if(!EstimationDataestimation.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Estimation Data estimation' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Estimation Data estimation' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Estimation","Multisense_Search_Estimation_DataEstimation");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleEstimation_DataEstimation",EstimationDataestimation);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Estimation Dataestimation",EstimationDataestimation);
			  waitForTime(500);
			  log.info("Estimation Data estimation Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Estimation Data estimation' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=21, enabled = true,dataProvider="dp",description ="Perform Load profile Name search") 
		public void PerformloadprofileNameSearch(String LoadprofileName) throws InterruptedException, AWTException,IOException 
		{
		  if(!LoadprofileName.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Load profile Name' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Load profile Name' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_LoadProfile","Multisense_Search_LoadProfile_Name");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleLoadProfile_Name",LoadprofileName);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Loadprofile Name",LoadprofileName);
			  waitForTime(500);
			  log.info("Load profile Name Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Load profile Name' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=22, enabled = true,dataProvider="dp",description ="Perform Logbook Name search") 
		public void PerformLogbookNameSearch(String LogbookName) throws InterruptedException, AWTException,IOException 
		{
		  if(!LogbookName.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Logbook Name' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Logbook Name' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Logbook","Multisense_Search_Logbook_Name");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleLogbook_Name",LogbookName);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); 
			  multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Logbook Name",LogbookName);
			  waitForTime(500);
			  log.info("Logbook Name Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Logbook Name' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=23, enabled = true,dataProvider="dp",description ="Perform Logbook Name search") 
		public void PerformLogbookOBIScodeSearch(String LogbookOBIScode) throws InterruptedException, AWTException,IOException 
		{
		  if(!LogbookOBIScode.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Logbook OBISCode' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Logbook OBISCode' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Logbook","Multisense_Search_Logbook_OBISCode");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleLogbook_OBISCode",LogbookOBIScode);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Logbook OBISCode",LogbookOBIScode);
			  waitForTime(500);
			  log.info("Logbook OBISCode Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Logbook OBISCode' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=24, enabled = true,dataProvider="dp",description ="Perform Register Name search") 
		public void PerformRegisterOBIScodeSearch(String RegisterOBIScode) throws InterruptedException, AWTException,IOException 
		{
		  if(!RegisterOBIScode.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Register OBISCode' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Register OBISCode' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Register","Multisense_Search_Register_OBISCode");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleRegister_OBISCode",RegisterOBIScode);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Register OBISCode",RegisterOBIScode);
			  waitForTime(500);
			  log.info("Register OBISCode Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Register OBISCode' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=25, enabled = true,dataProvider="dp",description ="Perform Register RegisterTypeName search") 
		public void PerformRegisterRegisterTypeNameSearch(String RegisterRegisterTypeName) throws InterruptedException, AWTException,IOException 
		{
		  if(!RegisterRegisterTypeName.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Register RegisterTypeName' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Register RegisterTypeName' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Register","Multisense_Search_Register_Name");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleRegister_Name",RegisterRegisterTypeName);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Register RegisterTypeName",RegisterRegisterTypeName);
			  waitForTime(500);
			  log.info("Register RegisterTypeName Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Register RegisterTypeName' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=26, enabled = true,dataProvider="dp",description ="Perform Register RegisterTypeUnitofMeasure search") 
		public void PerformRegisterRegisterTypeUnitofMeasureSearch(String RegisterRegisterTypeUnitofMeasure) throws InterruptedException, AWTException,IOException 
		{
		  if(!RegisterRegisterTypeUnitofMeasure.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Register RegisterType Unit of measure' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Register RegisterType Unit of measure' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Register","Multisense_Search_Register_UnitofMeasure");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleRegister_UnitofMeasure",RegisterRegisterTypeUnitofMeasure);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Register RegisterTypeUnitofmeasure",RegisterRegisterTypeUnitofMeasure);
			  waitForTime(500);
			  log.info("'Register RegisterType Unit of measure' Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : ''Register RegisterType Unit of measure'' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=27, enabled = true,dataProvider="dp",description ="Perform Security Has Service Key search") 
		public void PerformSecurityHasServiceKeySearch(String SecurityHasServiceKey) throws InterruptedException, AWTException,IOException 
		{
		  if(!SecurityHasServiceKey.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Security Has Service Key' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Security Has Service Key' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Security","Multisense_Search_Security_HasServiceKey");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleSecurity_HasServiceKey",SecurityHasServiceKey);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Security HasServiceKey",SecurityHasServiceKey);
			  waitForTime(500);
			  log.info("Security Has Service Key Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Security Has Service Key' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=28, enabled = true,dataProvider="dp",description ="Perform Topology HasMasterDevice search") 
		public void PerformTopologyHasMasterDeviceSearch(String TopologyHasMasterDevice) throws InterruptedException, AWTException,IOException 
		{
		  if(!TopologyHasMasterDevice.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Topology HasMasterDevice' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Topology HasMasterDevice' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Topology","Multisense_Search_Topology_HasMasterDevice");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleTopology_HasMasterDevice",TopologyHasMasterDevice);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Topology HasMasterDevice",TopologyHasMasterDevice);
			  waitForTime(500);
			  log.info("Topology HasMasterDevice Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Topology HasMasterDevice' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=28, enabled = true,dataProvider="dp",description ="Perform Topology SlaveDevice search") 
		public void PerformTopologySlaveDeviceSearch(String TopologySlaveDevice) throws InterruptedException, AWTException,IOException 
		{
		  if(!TopologySlaveDevice.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Topology SlaveDevice' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Topology SlaveDevice' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Topology","Multisense_Search_Topology_SlaveDevice");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria("Multisense_Search_eleTopology_SlaveDevice",TopologySlaveDevice);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Topology SlaveDevice",TopologySlaveDevice);
			  waitForTime(500);
			  log.info("Topology SlaveDevice Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Topology SlaveDevice' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		// //
		@Test(priority=29, enabled = true,dataProvider="dp",description ="Perform Topology SlaveDevice search") 
		public void PerformTransitionsInstallationdateSearch(String TransitionsInstallationdate) throws InterruptedException, AWTException,IOException 
		{
		  if(!TransitionsInstallationdate.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Transition Installationdate' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Transition Installationdate' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Transition","Multisense_Search_Transition_Installationdate");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria_DateFilter("Multisense_Search_eleTransition_Installationdate",TransitionsInstallationdate);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Transition Installationdate",TransitionsInstallationdate);
			  waitForTime(500);
			  log.info("Transition Installationdate Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Transition Installationdate' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
		@Test(priority=30, enabled = true,dataProvider="dp",description ="Perform Transition Shipmentdate search") 
		public void PerformTransitionShipmentdateSearch(String TransitionShipmentdate) throws InterruptedException, AWTException,IOException 
		{
		  if(!TransitionShipmentdate.equalsIgnoreCase("NA"))
		  {
			  reporterLog("Starting testcase : Performing Search Test on 'Transition Shipmentdate' Field" ); 
			  log.info("Starting testcase : Performing Search Test on 'Transition Shipmentdate' Field" );
			  
			  waitForTime(500);
			  multisenseSearchPage.AddCriteria("Multisense_Search_Transition","Multisense_Search_Transition_Shipmentdate");
			  waitForTime(500);
			  multisenseSearchPage.clickonCriteria_DateFilter("Multisense_Search_eleTransition_Shipmentdate",TransitionShipmentdate);
			  waitForTime(500);
			  multisenseSearchPage.clickSearchBtn();				  
			  waitForTime(5000); multisenseSearchPage.clickCount();
			  waitForTime(5000);
			  boolean bResult = multisenseSearchPage.ValidateAdvanceSearch("Transition Shipmentdate",TransitionShipmentdate);
			  waitForTime(500);
			  log.info("Transition Shipmentdate Field Search Result:" + bResult); 
			  //AssertJUnit.assertEquals(true, bResult);
			  multisenseSearchPage.clickClearAllBtn(); 
			  log.info(" Ending testcase : 'Transition Shipmentdate' Field Search completed ");
			  AssertJUnit.assertEquals(true, bResult);
			
		  }		  
		}
}
