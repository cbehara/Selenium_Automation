package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;
import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceServicePage;
import com.base.base.TestBase;

public class AuditTrailTest extends TestBase{

	Logger log = Logger.getLogger(WorkspaceServiceCallTest.class);
	WorkspaceServicePage auditTrial;


	public AuditTrailTest()
	{
		super();
	}
	
	@Test 
	public void clickWorkspace() throws InterruptedException {
		auditTrial = new WorkspaceServicePage();	
		reporterLog("Staring testcase workspace");
		log.info("*************** starting test case : workspace *****************");
		waitForTime(500);
		((WorkspaceServicePage) auditTrial).clickonWorkspace();
		auditTrial.clickonAuditTrail();
		waitForTime(5000);
		auditTrial.clickonauditTraildropdown();	
		waitForTime(500);
		auditTrial.clickonauditTrailChangedby();
		waitForTime(1000);
		auditTrial.clickonauditTrailApply();
		waitForTime(1000);
		log.info("***************Ending test case : workspace *****************");
	}
}

