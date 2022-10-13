package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceIssuesPage;
import com.base.base.TestBase;

public class Workspace_IssuesStartProcess extends TestBase{

	Logger log = Logger.getLogger(Workspace_IssuesStartProcess.class);
	WorkspaceIssuesPage WorkspaceIssuesPage;


	public Workspace_IssuesStartProcess()
	{
		super();
	}
	
	@Test(priority=1, enabled=false, description = " click search and click clear button " ) 
	public void clickIssues() throws InterruptedException {
		WorkspaceIssuesPage = new WorkspaceIssuesPage();	
		reporterLog("Staring testcase workspace Issues Search");
		log.info("*************** starting test case : Issue Process Test*****************");		
		waitForTime(500);
		WorkspaceIssuesPage.clickonWorkspace();
		waitForTime(5000);
		WorkspaceIssuesPage.clickonissueLink();	
		waitForTime(500);
		WorkspaceIssuesPage.clickonclearBtn();
		waitForTime(500);
	}
	
	@Test(priority=2, enabled=false, description = " click search and click select and start process " ) 
	public void clickStartprocess() throws InterruptedException {
		reporterLog("Staring testcase workspace Issues Startprocess");
		log.info("*************** starting test case : Issue Process Start ****************");
		WorkspaceIssuesPage.clickonGearbtn();
		waitForTime(700);
		WorkspaceIssuesPage.clickonStartprocess();
		waitForTime(700);
		//WorkspaceIssuesPage.clickonApply();
		waitForTime(1000);
		log.info("***************** Ending test case :Issue Process Start*****************************************");
	}
}
