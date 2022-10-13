package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceIssuesPage;
import com.base.base.TestBase;

public class Workspace_IssuesPageIssueSearchTest extends TestBase{

	Logger log = Logger.getLogger(Workspace_IssuesPageIssueSearchTest.class);
	WorkspaceIssuesPage WorkspaceIssuesPage;


	public Workspace_IssuesPageIssueSearchTest()
	{
		super();
	}
	
	@Test(priority =1, enabled = true, description="Click Issue Link ,clear all ,select type and apply" )
	public void clickIssues() throws InterruptedException {
		WorkspaceIssuesPage = new WorkspaceIssuesPage();	
		reporterLog("Staring testcase workspace Issues Seacrh");
		log.info("*************** starting test case : workspace Issues Seacrh*****************");
		waitForTime(2000);
		WorkspaceIssuesPage.clickonWorkspace();
		waitForTime(5000);
		WorkspaceIssuesPage.clickonissueLink();	
		waitForTime(2000);
		WorkspaceIssuesPage.clickonclearBtn();
		waitForTime(2000);
		WorkspaceIssuesPage.clickontypeButton();
		waitForTime(2000);
		WorkspaceIssuesPage.clickonType();
		waitForTime(2000);
		WorkspaceIssuesPage.clickonApply();
		waitForTime(2000);
		log.info("*************** Endting test case : workspace Issues Seacrh*****************");
	}

}
