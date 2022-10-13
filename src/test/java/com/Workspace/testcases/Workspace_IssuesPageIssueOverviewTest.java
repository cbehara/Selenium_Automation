package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceIssuesPage;
import com.base.base.TestBase;

public class Workspace_IssuesPageIssueOverviewTest extends TestBase{

	Logger log = Logger.getLogger(Workspace_IssuesPageIssueOverviewTest.class);
	WorkspaceIssuesPage WorkspaceIssuesPage;


	public Workspace_IssuesPageIssueOverviewTest()
	{
		super();
	}
	
	@Test(priority =1, enabled = true , description="Verify Navigation to Issue Overview page" )  

	public void clickIssues() throws InterruptedException {
		WorkspaceIssuesPage = new WorkspaceIssuesPage();	
		reporterLog("Starting testcase Verify Navigation to Issue Overview page");
		log.info("****************************** starting test case : Verify Navigation Issue Overview page *****************************************");

		waitForTime(500);
		WorkspaceIssuesPage.clickonWorkspace();
		waitForTime(2000);
		WorkspaceIssuesPage.clickonIssueoverview();	
		waitForTime(1500);
		WorkspaceIssuesPage.clickonText();
		waitForTime(500);
		WorkspaceIssuesPage.clickonClear();
		waitForTime(5000);

		log.info("****************************** Ending test case : Verify Navigation Issue Overview  page *****************************************");

	}
}
