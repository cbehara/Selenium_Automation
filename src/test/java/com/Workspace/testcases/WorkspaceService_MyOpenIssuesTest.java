package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.io.IOException;
import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceServicePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class WorkspaceService_MyOpenIssuesTest extends TestBase{

	Logger log = Logger.getLogger(WorkspaceService_MyOpenIssuesTest.class);
	WorkspaceServicePage workspacePage;


	public WorkspaceService_MyOpenIssuesTest()
	{
		super();
	}	
	
	@Test(priority =1, enabled = true , description="Open and Verify my openIssue" )  
	public void clickWorkspace() throws InterruptedException, IOException 
	{
		workspacePage = new WorkspaceServicePage();	
		reporterLog("Staring testcase workspace my open Issues");
		log.info("*************** starting test case : workspace my open Issues*****************");
		waitForTime(500);
		workspacePage.clickonWorkspace();
		waitForTime(5000);
		workspacePage.clickonService_Myopenissues();	
		waitForTime(1500);
		workspacePage.clickonclearAll();
		waitForTime(1500);
	}	
	
	@Test(priority =2, enabled = true , description="Choose Value and enter my openissues" ) 
	public void clickdropdownAndEnterValue() throws InterruptedException, IOException 
	{	
		workspacePage.clickontypedropdown();
		waitForTime(2000);
		workspacePage.selectTypemanually();
		waitForTime(1000);
		workspacePage.clickoncollection();
		waitForTime(1500);
		workspacePage.clickonapply();
		waitForTime(2000);
		TestUtil.takeScreenshotAtEndOfTest();
		log.info("*************** Ending test case : workspace my open Issues*****************");
	}	
}
