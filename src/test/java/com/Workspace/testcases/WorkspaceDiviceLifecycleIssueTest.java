package com.Workspace.testcases;
import org.testng.log4testng.Logger;
import  com.Workspace.pages.WorkspaceDiviceLifecyclePage;
import com.base.base.TestBase;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WorkspaceDiviceLifecycleIssueTest extends TestBase {

	Logger log = Logger.getLogger(WorkspaceDataexchangeTest.class);
	WorkspaceDiviceLifecyclePage deviceTest;


	public WorkspaceDiviceLifecycleIssueTest()
	{
		super();
	}

	@Test(priority =1, enabled = true ,description = " Click Workspace and Click Issue ,clear All and Apply ") 
	public void WorkspaceLifeCycleIssue() throws InterruptedException 
	{
		deviceTest = new WorkspaceDiviceLifecyclePage();
		reporterLog("Staring testcase workspace Lifecycle Issues");
		log.info("*************** starting test case : workspace Lifecycle Issues Open*****************");
		waitForTime(2000);
		deviceTest.clickonWorkspace();
		waitForTime(2000);
		deviceTest.openissueLink();
		waitForTime(2000);
		deviceTest.clickClearAll();
		waitForTime(2000);
		deviceTest.clickApply();
		waitForTime(2000);
		log.info("*************** Ending test case : workspace Lifecycle Issues Open*****************");
	}
		
	@Test(priority =2, enabled = true ,description = " Click Workspace Select Type and Apply " ) 
		public void WorkspaceLifeCycleIssueselectType() throws InterruptedException {	
		log.info("*************** Starting test case : workspace Lifecycle Issues Type and verify*****************");
		deviceTest.clickonWorkspace();
		waitForTime(2000);
		deviceTest.openissueLink();
		waitForTime(2000);
		deviceTest.clickClearAll();
		waitForTime(2000);
			
	    deviceTest.clickDropdown();
		waitForTime(1000);
		deviceTest.selectType();
		deviceTest.clickApply();
		waitForTime(5000);
	
		String ExpectedTital = "Issues";
		WebElement ActualTital =deviceTest.verifyText();
		SoftAssertfunction(ActualTital, ExpectedTital);
		log.info("*************** Ending test case : workspace Lifecycle Issues Type and verify*****************");
	}
	
}
