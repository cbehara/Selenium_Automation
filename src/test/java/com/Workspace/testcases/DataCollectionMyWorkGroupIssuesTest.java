package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.DataCollectionMyWorkGroupIssuesPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class DataCollectionMyWorkGroupIssuesTest extends TestBase {
	String DataCollectionMyWorkgroupIssues = "Myworkgroupissues";
	Logger log = LogManager.getLogger(DataCollectionMyWorkGroupIssuesTest.class);	
	DataCollectionMyWorkGroupIssuesPage DataCollectionMyWorkGroupIssuesPage;

	public DataCollectionMyWorkGroupIssuesTest()
	{
		super();
	}
	
	@DataProvider 
	public Object[][] getTestDataFormyWorkgroupIssues() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(DataCollectionMyWorkgroupIssues);
		return testData;
	}

	@Test(priority = 1, dataProvider = "getTestDataFormyWorkgroupIssues",description="Apply My Work Group Issue")
	public void ApplyMyWorkGroupIssue(String reason)
	{
		DataCollectionMyWorkGroupIssuesPage = new DataCollectionMyWorkGroupIssuesPage();
		DataCollectionMyWorkGroupIssuesPage.clickDataCollectionMyWorkGroupIssues();
		reporterLog("Starting Test case Apply My Workgroup Issues");
		log.info("******************* starting test case : Apply My Workgroup Issues******************************");
		DataCollectionMyWorkGroupIssuesPage.ApplyDataCollectionMyWorkGroupIssuesConnectionIssue(reason); 
		log.info("******************* Ending test case : Apply My Workgroup Issues******************************");
	}
}
