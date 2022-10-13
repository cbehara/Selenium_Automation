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

public class MultiSence_WorkSpace_Alarms_Myopenalarms extends TestBase {
	
	Logger log = LogManager.getLogger(MultiSence_WorkSpace_Alarms_Myopenalarms.class);	
	String AlarmsSheet = "Alarms";	
	AlarmsSelectionPage alarmsSelectionPage= new AlarmsSelectionPage();
	String ClearALLFilter;	
	@Test(priority=0)
	public void TC001_NavigateToAlarmsPage() throws IOException 
	{	
		login();
		Multisense();
	    Workspace();
		alarmsSelectionPage.navigateToMyopenalarms();
	}
	@Test(priority=1)
    public void TC002_ValidateAlarmIDFilters() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("AlarmID", "ConnexoWorkSpace_AlarmsPage_AlarmID_input","ON");           
    }
    @Test(priority=2)
    public void TC003_ValidateAlarmDeviceFilter() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("Device", "ConnexoWorkSpace_AlarmsPage_Device_input","ON");             
    }
    @Test(priority=3)
    public void TC004_ValidateAlarmDeviceGroupFilter() throws InterruptedException, IOException
    {
  	  			alarmsSelectionPage.selectFilterAndValidateValue("Devicegroup", "ConnexoWorkSpace_AlarmsPage_Devicegroup_input","OFF");
    }
    @Test(priority=4)
    public void TC005_ValidateAlarmDuedateFilter() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("Duedate", "ConnexoWorkSpace_AlarmsPage_Duedate_input","ON");
    }
    @Test(priority=5)
    public void TC006_ValidateAlarmStatusFilter() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("Status", "ConnexoWorkSpace_AlarmsPage_Status_input","ON"); 
    }
    @Test(priority=6)
    public void TC007_ValidateAlarmClearedFilter() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("Cleared", "ConnexoWorkSpace_AlarmsPage_Cleared_input","ON");           
    }
    @Test(priority=7)
    public void TC008_ValidateAlarmWorkgroupFilter() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("Workgroup", "ConnexoWorkSpace_AlarmsPage_Workgroup_input","ON");                   
    }
    @Test(priority=8)
    public void TC009_ValidateAlarmUserFilter() throws InterruptedException, IOException
    {
                   alarmsSelectionPage.selectFilterAndValidateValue("User", "ConnexoWorkSpace_AlarmsPage_User_input","ON");  
    }
    @Test(priority=9)
    public void TC010_ValidateAlarmReasonFilter() throws InterruptedException, IOException
    {
                  alarmsSelectionPage.selectFilterAndValidateValue("Reason", "ConnexoWorkSpace_AlarmsPage_Reason_input","ON");            
    }    
}