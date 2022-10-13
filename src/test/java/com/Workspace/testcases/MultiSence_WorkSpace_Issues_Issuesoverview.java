package com.Workspace.testcases;


import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.AlarmsSelectionPage;
import com.Workspace.pages.DataCollectionIssuesPage;
import com.Workspace.pages.IssuesSelectionPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MultiSence_WorkSpace_Issues_Issuesoverview extends TestBase {
	
	Logger log = LogManager.getLogger(MultiSence_WorkSpace_Issues_Issuesoverview.class);	
	String DatacollectionSheet = "Datacollection";
	DataCollectionIssuesPage dataCollectionIssuesPage = new DataCollectionIssuesPage();
	 IssuesSelectionPage issuesSelectionPage= new IssuesSelectionPage();
	String ClearALLFilter;	
	@Test(priority=0)
	public void TC001_NavigateToAlarmsPage() throws IOException 
	{	
		login();
        Multisense();
        Workspace();
		issuesSelectionPage.navigateToIssuesOverView();
	}
	@Test(priority = 1)
	public void TC002_ValidateIssueStatusFilter() throws InterruptedException, IOException {
		issuesSelectionPage.selectFilterAndValidateValue("Status", "ConnexoWorkSpace_AlarmsPage_Status_input","ON");
	}
	@Test(priority = 2)
	public void TC003_ValidateIssueWorkgroupFilter() throws InterruptedException, IOException {
		issuesSelectionPage.selectFilterAndValidateValue("Workgroup","ConnexoWorkSpace_AlarmsPage_Workgroup_input", "ON");
	}

	@Test(priority = 3)
	public void TC004_ValidateIssueUserFilter() throws InterruptedException, IOException {
		issuesSelectionPage.selectFilterAndValidateValue("User", "ConnexoWorkSpace_AlarmsPage_User_input", "ON");
	}
	@Test(priority = 4)
	public void TC005_ValidateTypeFilters() throws InterruptedException, IOException {
		issuesSelectionPage.selectFilterAndValidateValue("Type", "MultiSenceWorkspaceType", "ON");
	}

}