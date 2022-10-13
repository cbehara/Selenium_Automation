package com.Workspace.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Workspace.pages.WorkspaceIssuesPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;


public class WorkspaceIssueCreateTest  extends TestBase{

	String CreateIssueSheet = "Workspace_IssueCreate";
	WorkspaceIssuesPage WorkspaceIssuesPage;
	Logger log = Logger.getLogger(WorkspaceIssueCreateTest.class);         
	public WorkspaceIssueCreateTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForCreateIssue() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(CreateIssueSheet);
		return testData;
	}

	@Test(priority =1, dataProvider = "getTestDataForCreateIssue", enabled = true, description="Create and Load Issue" ) 
	public void LoadCreateIssueData(String DeviceName, String IssueReason, String Urgency, String Impact) throws InterruptedException, IOException
	{
		WorkspaceIssuesPage = new WorkspaceIssuesPage(); 
		reporterLog("Starting testcase Load Create Issue data");
		log.info("************************ starting testcase : Load Create Issue data *********************");

		WorkspaceIssuesPage.clickCreateIssue();
		waitForTime(1000);
		WorkspaceIssuesPage.InputIssuedetails(DeviceName, IssueReason,Urgency,Impact );
		waitForTime(2000);
		TestUtil.takeScreenshotAtEndOfTest();
		log.info("************************ Ending testcase : Load Create Issue data *********************");
	}
}

