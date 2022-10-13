package com.Workspace.testcases;


import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.Workspace.pages.DataCollectionIssuesPage;
import com.base.base.TestBase;

public class MultiSence_WorkSpace_Datacollection_Myworkgroupsissues extends TestBase {
	
	Logger log = LogManager.getLogger(MultiSence_WorkSpace_Datacollection_Myworkgroupsissues.class);	             
    String DatacollectionSheet = "Datacollection";  
    DataCollectionIssuesPage dataCollectionIssuesPage= new DataCollectionIssuesPage();
    String ClearALLFilter;  ;	
	@Test(priority=0)
	public void TC001_NavigateToIssuePage() throws IOException 
	{	
		login();
        Multisense();
        Workspace();
		dataCollectionIssuesPage.navigateTo_MultiSenceWorkspaceDatacollection_MyworkgroupsIssues();
	}
	@Test(priority = 1)
	public void TC002_ValidateIssueIDFilters() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("IssueID", "MultiSenceWorkspaceIssueID", "ON");
	}

	@Test(priority = 2)
	public void TC003_ValidateTypeFilters() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("Type", "MultiSenceWorkspaceType", "ON");
	}

	@Test(priority = 3)
	public void TC004_ValidateIssueDeviceFilter() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("Device", "ConnexoWorkSpace_AlarmsPage_Device_input","ON");
	}
	@Test(priority = 4)
	public void TC005_ValidateIssueDeviceGroupFilter() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("Devicegroup","ConnexoWorkSpace_AlarmsPage_Devicegroup_input", "OFF");
	}


	@Test(priority = 5)
	public void TC006_ValidateIssueDuedateFilter() throws InterruptedException, IOException {
		// dataCollectionIssuesPage.selectFilterAndValidateValue("Duedate",
		// "ConnexoWorkSpace_AlarmsPage_Duedate_input","ON");
	}

	@Test(priority = 6)
	public void TC007_ValidateIssueStatusFilter() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("Status", "ConnexoWorkSpace_AlarmsPage_Status_input","ON");
	}

	@Test(priority = 7)
	public void TC008_ValidateIssueWorkgroupFilter() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("Workgroup","ConnexoWorkSpace_AlarmsPage_Workgroup_input", "ON");
	}

	@Test(priority = 8)
	public void TC009_ValidateIssueUserFilter() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("User", "ConnexoWorkSpace_AlarmsPage_User_input", "ON");
	}

	@Test(priority = 9)
	public void TC010_ValidateIssueReasonFilter() throws InterruptedException, IOException {
		dataCollectionIssuesPage.selectFilterAndValidateValue("Reason", "ConnexoWorkSpace_AlarmsPage_Reason_input","ON");
	}
}