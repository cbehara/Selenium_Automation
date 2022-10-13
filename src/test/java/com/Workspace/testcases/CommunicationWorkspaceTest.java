package com.Workspace.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Workspace.pages.CommunicationWorkspacePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;


public class CommunicationWorkspaceTest  extends TestBase{

	String AddCommunicationSheet = "AddCommunication";
	Logger log = LogManager.getLogger(CommunicationWorkspaceTest.class);         

	CommunicationWorkspacePage CommunicationWorkspacepage;

	public CommunicationWorkspaceTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForCommandWorkspace() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(AddCommunicationSheet);
		return testData;
	}

	@Test(priority =1, description = "click on communications" ) 
	public void clickonCommunications() throws InterruptedException
	{
		CommunicationWorkspacepage = new CommunicationWorkspacePage(); 
		reporterLog("Starting testcase Verify navigation to communication workspace"); 
		log.info("******************* starting test case : Verify navigation to communication workspace ***********");
		CommunicationWorkspacepage.clickonCommunications();
		String Expectedcommstitle = "Communications";
		WebElement Actualcommstitle =CommunicationWorkspacepage.communications;
		TitleAssertFunction(Actualcommstitle, Expectedcommstitle);
		log.info("******************* Ending test case : Verify navigation to communication workspace ***********");
	}

	@Test(priority =2, dataProvider = "getTestDataForCommandWorkspace", description = "click on status dropdown", enabled = true) 
	public void clickonstatusdropdown (String stat, String Lastres) throws InterruptedException
	{
		reporterLog(" Starting testcase Verify status dropdown in communication workspace"); 
		log.info("******************* Starting test case : Verify status dropdown in communication workspace *********");
		CommunicationWorkspacepage.clickonstatusdropdown(stat,Lastres);
		log.info("******************* Ending test case : Verify status dropdown in communication workspace *********");
	}

	@Test(priority =3, description = "click on Bulk Action", enabled = true) 
	public void ClickOnBulkAction () throws InterruptedException
	{
		reporterLog(" Starting testcase  Verify bulk action in communication workspace"); 
		log.info("***************** Starting test case : Verify bulk action in communication workspace ****************");
		CommunicationWorkspacepage.ClickOnBulkAction();
		log.info("***************** Ending test case : Verify bulk action in communication workspace ****************");
	}

}

