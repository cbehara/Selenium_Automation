package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceServicePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class WorkspaceServiceCallTest extends TestBase{

	Logger log = Logger.getLogger(WorkspaceServiceCallTest.class);
	WorkspaceServicePage workspacePage;


	public WorkspaceServiceCallTest()
	{
		super();
	}
	
	@Test(priority =1, enabled = true , description="Click and Verify Workspace Service call page " )  
	public void clickWorkspace() throws InterruptedException, IOException {
		workspacePage = new WorkspaceServicePage();	
		reporterLog("Starting testcase Verify Workspace Service call page");
		log.info("****************************** starting test case : Verify Workspace Service call page *****************************************");
		@SuppressWarnings("unused")
		org.apache.logging.log4j.Logger log = LogManager.getLogger(WorkspaceServiceCallTest.class);
		waitForTime(500);
		workspacePage.clickonWorkspace();
		waitForTime(5000);
		workspacePage.clickonServicecall();	
		waitForTime(1000);
		workspacePage.clickonServiceperpagebutton();
		waitForTime(2000);
		TestUtil.takeScreenshotAtEndOfTest();
	}
}
