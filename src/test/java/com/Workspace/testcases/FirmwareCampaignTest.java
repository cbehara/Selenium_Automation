package com.Workspace.testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Workspace.pages.FirmwareCampaignPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;


public class FirmwareCampaignTest  extends TestBase{
	String FirmwareCampaignsheet = "Firmwarecampaign";         
	Logger log = LogManager.getLogger(FirmwareCampaignTest.class);         

	FirmwareCampaignPage  FirmwareCampaignpage;

	public FirmwareCampaignTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForCommandWorkspace() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(FirmwareCampaignsheet);
		return testData;
	}

	@Test(priority =1, description = " add device groups") 
	public void devicegroups() throws InterruptedException, AWTException
	{
		FirmwareCampaignpage = new FirmwareCampaignPage();     
		reporterLog("Starting testcase to select device groups"); 
		log.info("****************** starting test case : Verify to select device groups ************************");
		FirmwareCampaignpage.devicegroups();
		log.info("****************** Ending test case : Verify to select device groups ************************");
	}           

	@Test(priority =2, description = " click on firmware campaign") 
	public void clickfirmwarecampaign() throws InterruptedException
	{
		reporterLog("Starting testcase Navigating to firmware campaign page"); 
		log.info("**************** Starting testcase : Navigating to firmware campaign page ***********************");
		FirmwareCampaignpage.clickfirmwarecampaign();
		log.info("**************** Ending testcase : Navigating to firmware campaign page ***********************");
	}
	
	@Test(priority =3, description = "add firmware campaign", enabled = true) 
	public void addfirmwarecampaign () throws InterruptedException
	{
		reporterLog("Starting testcase Add  firmware campaign "); 
		log.info("*************** Starting testcase : Add  firmware campaign ************************");
		FirmwareCampaignpage.addfirmwarecampaign();
		log.info("*************** Ending testcase : Add  firmware campaign ************************");
	}

	@Test(priority =4, description = " add firmware campaign values", dataProvider = "getTestDataForCommandWorkspace" ,enabled = true) 
	public void AddFirmwareCampaignvalue (String DeviceType , String DeviceGroup , String FirmwareFile , String Firmwarefilecommtask, String Validationcommtask , String connmethodstrayegy) throws InterruptedException
	{
		reporterLog("Starting testcase Add  firmware campaign value "); 
		log.info("**************** Starting testcase: Add  firmware campaign value*******************");
		FirmwareCampaignpage.AddFirmwareCampaignvalue(DeviceType, DeviceGroup, FirmwareFile, Firmwarefilecommtask, Validationcommtask, connmethodstrayegy  );
		log.info("**************** Ending testcase: Add  firmware campaign value*******************");
	}

	@Test(priority =5, description = " edit firmware campaign" ,enabled = true) 
	public void editFirmwareCampaign ()
	{
		reporterLog("Starting testcase edit  firmware campaign value "); 
		log.info("***************** Starting testcase : edit  firmware campaign **********************");
		FirmwareCampaignpage.editFirmwareCampaign();
		log.info("***************** Ending testcase : edit  firmware campaign **********************");
	}

	@Test(priority =6, description = " cancel firmware campaign",enabled = true) 
	public void cancelFirmwareCampaign ()
	{
		reporterLog("Starting testcase cancel  firmware campaign value "); 
		log.info("************** Starting testcase : cancel  firmware campaign **********************");
		FirmwareCampaignpage.cancelFirmwareCampaign();
		log.info("************** Ending testcase : cancel  firmware campaign **********************");
	}
}

