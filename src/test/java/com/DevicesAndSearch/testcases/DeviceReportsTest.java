package com.DevicesAndSearch.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import com.util.util.TestUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;
import com.base.base.TestBase;
import com.DevicesAndSearch.pages.Devices.DeviceReports;
import com.util.util.DriverUtility;


public class DeviceReportsTest extends TestBase {
	Logger log = LogManager.getLogger(DeviceReportsTest.class);
	String DeviceReportsSheet = "Reports";
    DeviceReports DeviceReports;
    
	public DeviceReportsTest()
	{
		super();
	}
	
	@Test(priority =1, enabled = true)
	public  void DeviceConfigurationOverviewDCTReport() throws InterruptedException, AWTException, IOException
	{
		DeviceReports = new DeviceReports();
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		waitForTime(2000);
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =2, enabled = true)
	public  void DeviceConnectionsDCTReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		waitForTime(6000);
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =3, enabled = true)
	public  void DeviceCommunicationTasksDCTReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
	    TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		waitForTime(6000);
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
		DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =4, enabled = true)
	public  void GatewayPeformanceDCTReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =5, enabled = true)
	public  void MeterPeformanceDCTReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =6, enabled = true)
	public  void PointToPointPeformanceDCTReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =7, enabled = true)
	public  void RegisterDCTReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceCommunicationTasks();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =8, enabled = true)
	public  void DeviceConfigurationOverviewDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =9, enabled = true)
	public  void DeviceConnectionsDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =10, enabled = true)
	public  void DeviceCommunicationTasksDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =11, enabled = true)
	public  void GatewayPeformanceDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =12, enabled = true)
	public  void MeterPeformanceDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =13, enabled = true)
	public  void PointToPointPeformanceDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =14, enabled = true)
	public  void RegisterDCOReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConfigurationOverview();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =15, enabled = true)
	public  void DeviceConfigurationOverviewDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =16, enabled = true)
	public  void DeviceConnectionsDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =17, enabled = true)
	public  void DeviceCommunicationTasksDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =18, enabled = true)
	public  void GatewayPeformanceDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =19, enabled = true)
	public  void MeterPeformanceDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =20, enabled = true)
	public  void PointToPointPeformanceDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =21, enabled = true)
	public  void RegisterDCReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =22, enabled = true)
	public  void DeviceConfigurationOverviewGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickGatePerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =23, enabled = true)
	public  void DeviceConnectionsGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickGatePerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =24, enabled = true)
	public  void DeviceCommunicationTasksGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickGatePerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =25, enabled = true)
	public  void GatewayPeformanceGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickGatePerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =26, enabled = true)
	public  void MeterPeformanceGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();	
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =27, enabled = true)
	public  void PointToPointPeformanceGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickDeviceConnections();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =28, enabled = true)
	public  void RegisterGPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickGatePerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();	
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =29, enabled = true)
	public  void DeviceConfigurationOverviewMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =30, enabled = true)
	public  void DeviceConnectionsMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =31, enabled = true)
	public  void DeviceCommunicationTasksMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =32, enabled = true)
	public  void GatewayPeformanceMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();	
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =33, enabled = true)
	public  void MeterPeformanceMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =34, enabled = true)
	public  void PointToPointPeformanceMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =35, enabled = true)
	public  void RegisterMPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =36, enabled = true)
	public  void DeviceConfigurationOverviewPTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickPointToPointPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =37, enabled = true)
	public  void DeviceConnectionsPTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickPointToPointPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =38, enabled = true)
	public  void DeviceCommunicationTasksPTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickPointToPointPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =39, enabled = true)
	public  void GatewayPeformancePTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickMeterPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =40, enabled = true)
	public  void MeterPeformancePTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickPointToPointPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =41, enabled = true)
	public  void PointToPointPeformancePTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickPointToPointPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =42, enabled = true)
	public  void RegisterPTPReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickPointToPointPerformance();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =43, enabled = true)
	public  void DeviceConfigurationOverviewRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConfigurationOverviewRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device configuration overview";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConfigurationOverview();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device configuration overview";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConfigurationOverviewReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);
	    
	    DriverUtility.getDriver().close();
    
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));    
	}
	
	@Test(priority =44, enabled = true)
	public  void DeviceConnectionsRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceConnectionsRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device connections";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceConnections();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device connections";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceConnectionsReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR);

	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));      
	}
	
	@Test(priority =45, enabled = true)
	public  void DeviceCommunicationTasksRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickDeviceCommunicationTasksRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Device communication tasks";
	    WebElement ActualDCO  = DeviceReports.verifyDeviceCommunicationTasks();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	 	
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(56000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Device communication tasks";
	    WebElement ActualDCOR = DeviceReports.verifyDeviceCommunicationTasksReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));       
	}
	
	@Test(priority =46, enabled = true)
	public  void GatewayPeformanceRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickGatewayPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");
	 	waitForTime(6000);
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Gateway performance";
	    WebElement ActualDCO  = DeviceReports.verifyGatePerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();	
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Gateway performance";
	    WebElement ActualDCOR = DeviceReports.verifyGatewayPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
	
	@Test(priority =47, enabled = true)
	public  void MeterPeformanceRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickMeterPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Meter performance";
	    WebElement ActualDCO  = DeviceReports.verifyMeterPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Meter performance";
	    WebElement ActualDCOR = DeviceReports.verifyMeterPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));  
	}
	
	@Test(priority =48, enabled = true)
	public  void PointToPointPeformanceRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickPointToPointPerformanceRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Point to point performance";
	    WebElement ActualDCO  = DeviceReports.verifyPointToPointPerformance();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	    
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Point to point performance";
	    WebElement ActualDCOR = DeviceReports.verifyPointToPointPerformanceReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));   
	}
	
	@Test(priority =49, enabled = true)
	public  void RegisterRRReport() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting Test case DeviceCommunicationTasks");
   	 	log.info("*********** starting test case : Select Device Communication Tasks Report ***************");	     
		waitForTime(2000);
		DeviceReports.clickdevices();		
		waitForTime(2000);
		DeviceReports.clickRegisterReport();	
		
	    log.info("********** Verifying Select Report Type Page **********");
	    log.info("********** Assertions for verifying Select Report Page **********");	                            
	    String ExpectedvalueSRT = "Step 1: Select report type";
	    WebElement ActualvalueSRT  = DeviceReports.verifyOnSelectReportType();
	    HardAssertfunction(ActualvalueSRT, ExpectedvalueSRT);   
	    SoftAssertfunction(ActualvalueSRT, ExpectedvalueSRT);
		TestUtil.takeScreenshotAtEndOfTest();
		
		log.info("********** Starting test case: Selecting the Device Configuration Radio Button **********");
		DeviceReports.clickRegisterReportRadio();
		
	 	log.info("********** starting test case: Click Next Button **********");	
	 	DeviceReports.clickNext();
	 	
	    log.info("********** Starting test case: Verifying Select Report Filter Page **********");
	    log.info("********** Assertions for verifying Select Report Filter Page **********");                        
	    String ExpectedDCO = "Report: Register report";
	    WebElement ActualDCO  = DeviceReports.verifyRegisterReport();
	    HardAssertfunction(ActualDCO, ExpectedDCO);   
	    SoftAssertfunction(ActualDCO, ExpectedDCO);
		TestUtil.takeScreenshotAtEndOfTest();
		
	 	log.info("********** starting test case : Select Option From Device Group List **********");	     
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	DeviceReports.selectDeviceGroupInListDropdownValue();
	 	DeviceReports.clickDeviceGroupInListDropdown();
	 	waitForTime(2000);
	 	
	 	log.info("********** starting test case : Select the From Date **********");
	 	DeviceReports.clickPeriodBetweenFromDropdown();
	 	DeviceReports.clickTodayFromButton();
	 	
	 	log.info("********** starting test case : Select the To Date **********");
	 	DeviceReports.clickPeriodBetweenToDropdown();
	 	DeviceReports.clickTodayToButton();
	 	
	    log.info("********** starting test case: Click Next Button**********");	     
	 	DeviceReports.clickNext();
	    
	    log.info("********** starting test case: Click Generate Button**********");	     
	 	DeviceReports.clickGenerate();	
	    waitForTime(60000);
	    
	    ArrayList<String> tabs = new ArrayList<String>(DriverUtility.getDriver().getWindowHandles());
	    DriverUtility.getDriver().switchTo().window(tabs.get(1));
	    
	    log.info("********** Starting test case: Verifying Final Report Page **********");
	    log.info("********** Assertions for verifying Final Report Page **********");                        
	    String ExpectedDCOR = "Register report";
	    WebElement ActualDCOR = DeviceReports.verifyRegisterReportReport();
	    HardAssertfunction(ActualDCOR, ExpectedDCOR);   
	    SoftAssertfunction(ActualDCOR, ExpectedDCOR); 
	    
	    DriverUtility.getDriver().close();
  
	    DriverUtility.getDriver().switchTo().window(tabs.get(0));     
	}
}
