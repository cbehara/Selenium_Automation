package com.Workspace.testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Workspace.pages.ConnectionWorkspacePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;


public class ConnectionWorkspaceTest  extends TestBase{

	String AddConnectionSheet = "Addconnection";
	Logger log = LogManager.getLogger(ConnectionWorkspaceTest.class);         

	ConnectionWorkspacePage ConnectionWorkspacepage;

	public ConnectionWorkspaceTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForCommandWorkspace() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(AddConnectionSheet);
		return testData;
	}

	@Test(priority =1, description = "click on Connection") 
	public void clickonConnection() throws InterruptedException
	{
		ConnectionWorkspacepage = new ConnectionWorkspacePage();  
		reporterLog("Starting Test case Click on Connection");
		log.info("********************** starting test case :  Click on Connection******************************");
		ConnectionWorkspacepage.clickonConnection();
		log.info("********************** Ending test case :  Click on Connection******************************");
	}

	@Test(priority =2, description = "click on status dropdown", dataProvider = "getTestDataForCommandWorkspace", enabled = true) 
	public void clickonstatusdropdown (String stat, String Lastres) throws InterruptedException
	{
		reporterLog("Starting Test case Click on Status Dropdown");
		log.info("********************** starting test case :  Click on Status Dropdown******************************");
		ConnectionWorkspacepage.clickonstatusdropdown(stat,Lastres);
		log.info("********************** Ending test case :  Click on Status Dropdown******************************");
	}

	@Test(priority =3, description = "click on Bulk Action", enabled = true) 
	public void ClickOnBulkAction () throws InterruptedException
	{
		reporterLog("Starting Test case Click on Bulk Button");
		log.info("********************** starting test case :  Click on  Bulk Button******************************");
		ConnectionWorkspacepage.ClickOnBulkAction();
		log.info("********************** Ending test case :  Click on  Bulk Button******************************");
	}
}

