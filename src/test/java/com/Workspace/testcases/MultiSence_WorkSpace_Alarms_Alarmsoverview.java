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
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MultiSence_WorkSpace_Alarms_Alarmsoverview extends TestBase {
	
	Logger log = LogManager.getLogger(MultiSence_WorkSpace_Alarms_Alarmsoverview.class);	
	String AlarmsSheet = "Alarms";	
	AlarmsSelectionPage alarmsSelectionPage= new AlarmsSelectionPage();
	String ClearALLFilter;	
	@Test(priority=0)
	public void TC001_NavigateToAlarmsPage() throws IOException 
	{	
        login();
        Multisense();
       Workspace();
		alarmsSelectionPage.navigateToAlarmsOverView();
	}
	@Test(priority=1)
	public void TC002_ValidateAlarmStatusFilter() throws InterruptedException, IOException
	{
		alarmsSelectionPage.validateAlarmOverViewScreen("Status", "ConnexoWorkSpace_AlarmsPage_Status_input","ON");	
	}
	@Test(priority=2)
	public void TC003_ValidateAlarmWorkgroupFilter() throws InterruptedException, IOException
	{
		alarmsSelectionPage.validateAlarmOverViewScreen("Workgroup", "ConnexoWorkSpace_AlarmsPage_Workgroup_input","ON");		
	}
	@Test(priority=3)
	public void TC004_ValidateAlarmUserFilter() throws InterruptedException, IOException
	{
		alarmsSelectionPage.validateAlarmOverViewScreen("User", "ConnexoWorkSpace_AlarmsPage_User_input","ON");	
	}

}