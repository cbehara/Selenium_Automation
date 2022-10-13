package com.Workspace.testcases;

import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Workspace.pages.WebservicesPage;
import com.base.base.TestBase;


public class WebservicesTest  extends TestBase{

	Logger log = LogManager.getLogger(ConnectionWorkspaceTest.class);         

	WebservicesPage Webservicespage;

	public WebservicesTest()
	{
		super();
	}
	
	@Test(priority =1, description = " click on Web services issue") 
	public void Webservicesissues() throws InterruptedException
	{
		Webservicespage = new WebservicesPage();  
		reporterLog("Starting Test case Web Services Issues");
		log.info("************* starting test case : Web Services Issues****************************");
		Webservicespage.issues();
		log.info("************* Ending test case : Web Services Issues****************************");
	}

	@Test(priority =2, description = " click on webservices end point history" ,enabled = true) 
	public void webserviceendpointhistory () throws InterruptedException
	{
		reporterLog("Starting Test case Web Services end point history");
		log.info("************* starting test case : Web Services end point history******************");
		Webservicespage.webserviceendpointhistory();
		log.info("************* Ending test case : Web Services end point history******************");
	}
}




