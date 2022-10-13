package com.DevicesAndSearch.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DevicesAndSearch.pages.Devices.DeviceLifeCycleManagementAddDevice;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DeviceLifeCycleManagementAddDeviceTest extends TestBase {
	Logger log = LogManager.getLogger(DeviceLifeCycleManagementAddDeviceTest.class);
	String DeviceDetailsSheet = "DeviceDetails";
	DeviceLifeCycleManagementAddDevice DeviceLifeCycleManagementAddDevice;
	
	public DeviceLifeCycleManagementAddDeviceTest()
	{
		super();
	}	
	
	@DataProvider 
	public Object[][] getTestDataForDeviceLifeCycleManagementAddDevice() 
	{ 
		Object testData[][] = TestUtil.getTestDataDeviceAndSearch(DeviceDetailsSheet); 
		return testData;
	}
	
	@Test(priority =1, enabled = true, description = "Add Devices")
	public  void ClickonAddDevice() throws InterruptedException, AWTException
	{
		DeviceLifeCycleManagementAddDevice = new DeviceLifeCycleManagementAddDevice();
		reporterLog("Starting Test case AddDevice");
   	 	log.info("****************************** starting test case : Add Devices*****************************************");	     
		waitForTime(500);
		DeviceLifeCycleManagementAddDevice.clickdevices();		
		waitForTime(500);
		DeviceLifeCycleManagementAddDevice.clickadddevice();	
		
		log.info("****************** Ending test case : Add Devices****************************");		
	}
	
	@Test(priority =2, dataProvider = "getTestDataForDeviceLifeCycleManagementAddDevice", enabled = true, description = "Add Devices")
	public  void EnterDeviceDetails( String SerialNumber, String Manufacturer, String ModelNo, String ModelVersion, String batch) throws InterruptedException, AWTException
	{
		reporterLog("Starting Test case Enter Device Details");
		log.info("****************** starting test case : Enter Device Details********************");
		DeviceLifeCycleManagementAddDevice.enterName();
		log.info("****************************** Enetered serial Number *****************************************");
		DeviceLifeCycleManagementAddDevice.serialNumber(SerialNumber);
		log.info("****************************** Enetered deviceType *****************************************");
		DeviceLifeCycleManagementAddDevice.deviceType();
		log.info("****************************** Enetered device Configuration *****************************************");
		DeviceLifeCycleManagementAddDevice.deviceConfiguration();
		log.info("****************************** Enetered Manufacture Name *****************************************");
		DeviceLifeCycleManagementAddDevice.enterManufacture(Manufacturer);
		log.info("****************************** Enetered Model Number *****************************************");
		DeviceLifeCycleManagementAddDevice.enterModelNumbr(ModelNo);
		log.info("****************************** Enetered Model Version *****************************************");
		DeviceLifeCycleManagementAddDevice.enterModelVrsn(ModelVersion);
		log.info("****************************** Enetered Batch Number *****************************************");
		DeviceLifeCycleManagementAddDevice.enterBatch(batch);
		log.info("****************************** Enetered Clicked on Add button *****************************************");
		DeviceLifeCycleManagementAddDevice.ClickaddButton();
		log.info("****************** Ending test case : Enter Device Details********************");
	}
	
	 @Test(priority =3, enabled = true, description = "Verify Overview Page")
	public  void verifyOverview() throws InterruptedException, AWTException, IOException
	{
		
		reporterLog("Starting testcase Verify Overview Page");
        log.info("******Starting testcase : Verify Overview Page *************");
        DeviceLifeCycleManagementAddDevice.verifyOnOverview();
                            
        String ExpetedactivateOCSvalue = "Overview";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyOnOverview();           
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);
		TestUtil.takeScreenshotAtEndOfTest();
		log.info("******Ending testcase : Verify Overview Page *************");
	}
	 
	 @Test(priority =4, enabled = true, description = "Verify Device attributes Page")
	 public  void verifyDeviceattributes() throws InterruptedException, AWTException, IOException
	 {
		 reporterLog("Starting testcase Verify Device attributes Page");
		 log.info("****** Starting testcase : Verify Device attributes Page Test Case *************");
		 DeviceLifeCycleManagementAddDevice.Verifydeviceattribute();	        

		 String ExpetedactivateOCSvalue = "Device attributes";
		 WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.Verifydeviceattribute();		   
		 SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);
		 TestUtil.takeScreenshotAtEndOfTest();
		 log.info("****** Ending testcase : Verify Device attributes Page Test Case *************");
	 } 
	 
	@Test(priority =5, enabled = true, description = "Verify Device Attributes Name modification")
	public  void DeviceattributesModifyName() throws InterruptedException, AWTException, IOException
	{
		reporterLog(" Starting testcase Verify Device Attributes Name modification");
		log.info("****** Starting testcase : Verifying Device Attributes Name modification *************");
        DeviceLifeCycleManagementAddDevice.DeviceattributesModifyName();
        log.info("****** Ending testcase : Verify Device Attributes Name modification ***********");
                      
	}
	
	@Test(priority =6, enabled = true, description = "Verify Device Attributes End device E meter info - maxRating")
	public  void DeviceattributesModifyEInfo() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting testcase Verify Device Attributes End device E meter info - maxRating");
		log.info("****** Starting testcase : Verify Device Attributes End device E meter info - maxRating *********");   
		DeviceLifeCycleManagementAddDevice.deviceattributesEInfo();
        log.info("****** Ending testcase : Verify Device Attributes End device E meter info - maxRating *********");                   
	}
	
	/*@Test(priority =7, enabled = true, description = "Verify History Page")
	public  void verifyHistory() throws InterruptedException, AWTException, IOException
	{
		reporterLog(" Starting testcase Verify History Page");
        log.info("****** Starting testcase : Verify History Page  Test Case *************");
		DeviceLifeCycleManagementAddDevice.verifyOnHistory();       
                            
        String ExpetedactivateOCSvalue = "History";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyOnHistory();
        HardAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);   
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);
        log.info("****** Verifying Firmware Page  Test Case *************");

        DeviceLifeCycleManagementAddDevice.verifyOnFirmware();
        TestUtil.takeScreenshotAtEndOfTest();
		log.info("****** Ending testcase : Verify History Page  Test Case *************");
	}
	/*@Test(priority =8, enabled = false, description = "Verify Process Page")
	public  void verifyProcess() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting testcase Verify Process Page");
        log.info("****** Starting testcase : Verify Process Page *************");
		DeviceLifeCycleManagementAddDevice.verifyOnProcesses();        
                            
        String ExpetedactivateOCSvalue = "Processes";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyOnProcesses();
        HardAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);   
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                 
		TestUtil.takeScreenshotAtEndOfTest();
		log.info("****** Ending testcase : Verify Process Page *************");
	}
	
	@Test(priority =9, enabled = true, description = "Verify Service calls Page")
	public  void verifyservicecalls() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting testcase Verify Service calls Page");
        log.info("****** Starting testcase : Verify Service calls Page *************");
		DeviceLifeCycleManagementAddDevice.verifyOnServicecalls();
		
        log.info("************ Assertions verified for verifying Service calls Page *******");
                            
        String ExpetedactivateOCSvalue = "Service calls";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyOnServicecalls();
        HardAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);   
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
		TestUtil.takeScreenshotAtEndOfTest();
	}*/
	
	@Test(priority =10, enabled = true, description = "Verify DataSource LoadService Page")
	public  void DataSourceLoadService() throws InterruptedException, AWTException, IOException
	{
		
		reporterLog("Starting testcase : Verify DataSource LoadService Page");
        log.info("****** Starting testcase : Verify DataSource LoadService Page *************");
        
        DeviceLifeCycleManagementAddDevice.verifyDataSourceLoadservice();
        
                            
        String ExpetedactivateOCSvalue = "Load profiles";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyDataSourceLoadservice();          
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
		TestUtil.takeScreenshotAtEndOfTest();
		log.info("****** Ending testcase : Verify DataSource LoadService Page *************");
	}
	@Test(priority = 11, enabled = true, description = "Verify ViewSuspect in load Profile Page")
	public  void VerifyViewsuspect() throws InterruptedException, AWTException, IOException
	{		
		reporterLog(" Starting testcase Verify ViewSuspect in load Profile Page");
        log.info("****** Starting testcase : Verify ViewSuspect in load Profile *************");        
        DeviceLifeCycleManagementAddDevice.VerifyViewSuspect();                    
        String ExpetedactivateOCSvalue = "15min Electricity A+";
      //  WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyViewSuspect();  
		WebElement ActualactivateOCSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_minElectricity")));       

        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
	    TestUtil.takeScreenshotAtEndOfTest();
	    log.info("****** Ending testcase : Verify ViewSuspect in load Profile *************");  
	}
	
	@Test(priority =12, enabled = true, description = "Verify Channels")
	public  void VerifyChannels() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verifying Channels  Page");
        log.info("****** Starting testcase: Verify Channels *************");
        DeviceLifeCycleManagementAddDevice.VerifyChannels();        
                            
        String ExpetedactivateOCSvalue = "Channels";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyChannels();         
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("************ Ending testcase: Verify Channels   *******");
	}
	
	@Test(priority =13, enabled = true, description = "Verify Channels Fractions modification and Saving")
	public  void VerifyChannelsFractions() throws InterruptedException, AWTException, IOException
	{
		reporterLog(" Starting testcase Verify Channels Fractions modification and Saving ");
		log.info("************ Starting testcase : Verify Channels Fractions modification and Saving *******");  
		DeviceLifeCycleManagementAddDevice.VerifyChannelsFractions();
		log.info("************ Ending testcase : Verify Channels Fractions modification and Saving *******");  
	}
	
	@Test(priority =14, enabled = true, description = "Verify Logbooks  Page")
	public  void VerifyLogbook() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Logbooks  Page");
        log.info("****** Starting testcase : Verify Logbooks  Page *************");
        DeviceLifeCycleManagementAddDevice.verifyLogbook();        
                            
        String ExpetedactivateOCSvalue = "Logbooks";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyLogbook();        
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify Logbooks  Page *************");
	}
	
	
	@Test(priority =15, enabled = true, description = "Verify Events  Page")
	public  void VerifyEvents() throws InterruptedException, AWTException, IOException
	{		
		reporterLog(" Starting testcase Verify Events  Page");
        log.info("****** Starting testcase : Verify Events  Page *************");
        DeviceLifeCycleManagementAddDevice.verifyEvents();
       
                            
        String ExpetedactivateOCSvalue = "Events";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyEvents();        
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify Events  Page *************");
	}	
	
	@Test(priority =16, enabled = true, description = "Verify Registers")
	public  void VerifyRegister() throws InterruptedException, AWTException, IOException
	{		
		reporterLog(" Starting testcase Verifying  Registers  Page");
        log.info("******  Starting testcase : Verify Registers *************");
        DeviceLifeCycleManagementAddDevice.verifyRegister();
                            
        String ExpetedactivateOCSvalue = "Registers";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyRegister();         
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******  Ending testcase : Verify Registers *************");
	}
	
	
	@Test(priority =17, enabled = false, description = "Verify Validation Configuartion in Reading Quality Page")
	public  void VerifyValidationConfiguartion() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Validation Configuartion in Reading Quality Page");
        log.info("****** Starting testcase : Verify Validation Configuartion in Reading Quality Page *************");
        DeviceLifeCycleManagementAddDevice.verifyValidationConfiguartion();
                            
        String ExpetedactivateOCSvalue = "Validation configuration";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.verifyValidationConfiguartion();        
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
		TestUtil.takeScreenshotAtEndOfTest();
		log.info("****** Ending testcase : Verify Validation Configuartion in Reading Quality Page *************");
	}
	
	@Test(priority =18, enabled = false, description = "Verify ValidationConfiguartion Deactivation and active actions")
	public  void verifyValidationConfiguartionDeactivatenactive() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify ValidationConfiguartion Deactivation and active actions");
        log.info("****** Starting testcase : Verify ValidationConfiguartion Deactivation and active actions *************");
        DeviceLifeCycleManagementAddDevice.verifyValidationConfiguartionDeactivatenactive();    
        log.info("****** Ending testcase : Verify ValidationConfiguartion Deactivation and active actions *************");		
	}
	
	@Test(priority =19, enabled = true, description = "Verify ValidationConfiguartion Deactivation and active actions")
	public  void VerifyGeneralAtrributes() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify General Atrributes in Communication Page");
        log.info("****** Starting testcase : Verify General Atrributes in Communication Page *************");
        DeviceLifeCycleManagementAddDevice.VerifyGeneralAtrributes();
                            
        String ExpetedactivateOCSvalue = "General attributes";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyGeneralAtrributes();           
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify General Atrributes in Communication Page *************");
	}
	
	@Test(priority =20, enabled = true, description = "Verify Change Manufacture actions")
	public  void verifyChangeManufacture() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Change Manufacture actions");
        log.info("****** Starting testcase : Verify Change Manufacture actions *************");
        DeviceLifeCycleManagementAddDevice.verifyChangeManufacture();    
        log.info("****** Ending testcase : Verify Change Manufacture actions *************"); 		
	}
	
	@Test(priority =21, enabled = true, description = "Verify Communication planning in Communication Page")
	public  void VerifyCommunicationPlanning() throws InterruptedException, AWTException, IOException
	{	
		reporterLog("Starting testcase Verify Communication planning in Communication Page");
        log.info("****** Starting testcase : Verify Communication planning in Communication Page *************");
        DeviceLifeCycleManagementAddDevice.VerifyCommunicationPlanning();
                            
        String ExpetedactivateOCSvalue = "Communication planning";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyCommunicationPlanning();         
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify Communication planning in Communication Page *************");
	}
	
	@Test(priority =22, enabled = true, description = "Verify add Scheduled Communication Schedule actions")
	public  void verifyAddscheduleCommunicationPlanning() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify add Scheduled Communication Schedule actions");
        log.info("******Starting testcase : Verify add Scheduled Communication Schedule actions *************");
        DeviceLifeCycleManagementAddDevice.addSharedCommunicationPlanning();   
        log.info("******Ending testcase : Verify add Scheduled Communication Schedule actions *************"); 		
	}
	
	@Test(priority = 23, enabled = true, description = "Verify remove Scheduled Communication Schedule actions")
	public  void verifyRemoveScheduleCommunicationPlanning() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Remove Scheduled Communication Schedule actions");
        log.info("******Starting testcase : Verify Remove Scheduled Communication Schedule actions *************");
        DeviceLifeCycleManagementAddDevice.RemoveSharedCommunicationPlanning();
        log.info("******Ending testcase : Verify Remove Scheduled Communication Schedule actions *************");	
	}	
	
	@Test(priority =24, enabled = true, description = "Verify remove Scheduled Communication Schedule actions")
	public  void VerifyCommunicationtask() throws InterruptedException, AWTException, IOException
	{
		reporterLog("Starting testcase Verify Communication task in Communication Page");
        log.info("****** Starting testcase : Verify Communication task in Communication Page *************");
		DeviceLifeCycleManagementAddDevice.VerifyCommunicationtask();       
                             
        String ExpetedactivateOCSvalue = "Communication tasks";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyCommunicationtask();           
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify Communication task in Communication Page *************");
	}
	
	@Test(priority =25, enabled = true, description = "Verify Communication methods in Communication Page")
	public  void VerifyCommunicationMethods() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Communication methods in Communication Page");
        log.info("****** Starting testcase : Verify Communication methods in Communication Page *************");
        DeviceLifeCycleManagementAddDevice.VerifyCommunicationMethods();
                            
        String ExpetedactivateOCSvalue = "Connection methods";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyCommunicationMethods();          
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify Communication methods in Communication Page *************");
	}
	
	@Test(priority =26, enabled = true, description = "Verify Deactivate Connection in Communication methods Page")
	public  void DeactivateCM() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Deactivate Connection in Communication methods Page");
        log.info("******Starting testcase : Verify Deactivate Connection in Communication methods Page *************");
        DeviceLifeCycleManagementAddDevice.DeactivateCM();                   
        log.info("******Ending testcase : Verify Deactivate Connection in Communication methods Page *************");
	}
	
	@Test(priority = 27, enabled = true, description = "Verify Activate Connection in Communication methods Page")
	public  void ActivateCM() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Activating  Connection in Communication methods Page");
        log.info("****** Starting testcase : Verify Activate Connection in Communication methods Page*************");
        DeviceLifeCycleManagementAddDevice.ActivateCM();                   
        log.info("****** Ending testcase : Verify Activate Connection in Communication methods Page*************");
	}
	
	@Test(priority =28, enabled = true, description = "Verify History  in Communication methods Page")
	public  void VerifyCommunicationMethodsHistory() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify History in Communication methods Page");
        log.info("******Starting testcase : Verify History in Communication methods Page*************");
        DeviceLifeCycleManagementAddDevice.VerifyCommunicationMethodsHistory();                            
                           
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******Ending testcase : Verify History  in Communication methods Page*************");
	}
	
	@Test(priority =29, enabled = true, description = "Verify History in Communication methods Page")
	public  void VerifySecuritysets() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Security sets Page");
        log.info("****** Starting testcase : Verify Security sets Page *************");
        DeviceLifeCycleManagementAddDevice.VerifySecuritysets();
                            
        String ExpetedactivateOCSvalue = "Security sets";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifySecuritysets();         
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("****** Ending testcase : Verify Security sets Page *************");
	}
	
	@Test(priority =30, enabled = true, description = "Verify Security accessors Page")
	public  void VerifySecurityaccessors() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Security accessors Page");
        log.info("******Starting testcase : Verify Security accessors Page*************");        
        DeviceLifeCycleManagementAddDevice.VerifySecurityaccessors();                   
        String ExpetedactivateOCSvalue = "Security accessors";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifySecurityaccessors();        
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******Ending testcase : Verify Security accessors Page*************"); 
	}
	
	@Test(priority =31, enabled = true, description = "Verify Protocol dialects Page")
	public  void VerifyProtocolDialects() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Protocol dialects Page");
        log.info("******Starting testcase : Verify Protocol dialects Page*************");
        DeviceLifeCycleManagementAddDevice.VerifyProtocolDialects();
                            
        String ExpetedactivateOCSvalue = "Protocol dialects";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyProtocolDialects();         
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******Ending testcase : Verify Protocol dialects Page*************");
	}
	
	@Test(priority =32, enabled = true, description = "Verify changing retries to 3 in Protocol Dialects Page")
	public  void ChangeProtocolDialectsRetries() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify changing retries to 3 in Protocol Dialects Page");
        log.info("****** Starting testcase : Verify changing retries to 3 in Protocol Dialects Page *************");
        DeviceLifeCycleManagementAddDevice.ChangeProtocolDialectsRetries();                  
        log.info("****** Ending testcase : Verify changing retries to 3 in Protocol Dialects Page *************");
	}
	
	@Test(priority =33, enabled = true, description = "Verify Commands Page")
	public  void VerifyCommands() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Commands Page");
        log.info("******Starting testcase : Verify Commands Page *************");
        DeviceLifeCycleManagementAddDevice.VerifyCommands();
                            
        String ExpetedactivateOCSvalue = "Commands";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyCommands();        
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******Ending testcase : Verify Commands Page *************");
	}
	
	@Test(priority =34, enabled = true, description = "Verify Add Commands and Trigger in Commands Page")
	public  void AddCommandsandTrigger() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Add Commands and Trigger in Commands Page");
        log.info("******Starting testcase : Verify Add Commands and Trigger in Commands Page*************");
        DeviceLifeCycleManagementAddDevice.AddCommandsandTrigger();                  
        log.info("******Ending testcase : Verify Add Commands and Trigger in Commands Page*************");
	}
	
	@Test(priority =35, enabled = true, description = "Verify Revoke Commands in Commands Page")
	public  void RevokeCommands() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Revoke Commands in Commands Page");
        log.info("******Starting testcase : Verify Revoke Commands in Commands Page*************");
        DeviceLifeCycleManagementAddDevice.Revoke();                  
        log.info("******Ending testcase : Verify Revoke Commands in Commands Page*************");
	}
	
	@Test(priority =36, enabled = true, description = "Verify Commands Page")
	public  void Verifyfirmware() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Commands Page");
        log.info("******Starting testcase : Verify Commands Page*************");
        DeviceLifeCycleManagementAddDevice.Verifyfirmware();
                            
        String ExpetedactivateOCSvalue = "Firmware";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.Verifyfirmware();           
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******Ending testcase : Verify Commands Page*************");
	}
	
	@Test(priority =37, enabled = true, description = "Verify Time of Use Page")
	public  void VerifyTimeofUse() throws InterruptedException, AWTException, IOException
	{		
		reporterLog("Starting testcase Verify Time of Use Page");
        log.info("******Starting testcase : Verify Time of Use Page*************");
        DeviceLifeCycleManagementAddDevice.VerifyTimeofUse();
                            
        String ExpetedactivateOCSvalue = "Time of use";
        WebElement ActualactivateOCSvalue  =DeviceLifeCycleManagementAddDevice.VerifyTimeofUse();
           
        SoftAssertfunction(ActualactivateOCSvalue, ExpetedactivateOCSvalue);                   
        TestUtil.takeScreenshotAtEndOfTest();
        log.info("******Ending testcase : Verify Time of Use Page*************");
	}
	
	@Test(priority = 38, enabled = true, description = "Verifying Send calender in Time of use Page")
	public  void Sendtimeofusecalender() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Send calender in Time of use Page");
        log.info("******Starting testcase : Verify Send calender in Time of use Page*************");
        DeviceLifeCycleManagementAddDevice.Sendtimeofusecalender();                  
        log.info("******Ending testcase : Verify Send calender in Time of use Page*************");
	}
	
	@Test(priority =39, enabled = true, description = "Verify Change Time in Time of use Page")
	public  void ChangeTime() throws InterruptedException, AWTException
	{		
		reporterLog("Starting testcase Verify Change Time in Time of use Page");
        log.info("******Starting testcase : Verify Change Time in Time of use Page*************");
        DeviceLifeCycleManagementAddDevice.ChangeTime();                  
        log.info("******Ending testcase : Verify Change Time in Time of use Page*************"); 
	}	
	
}
