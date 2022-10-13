package com.ConnexoAdmin.testcases;

import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ConnexoAdmin.pages.ApplicationServers.TaskOverViewPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class TaskOverViewTest extends TestBase{
	Logger log = LogManager.getLogger(TaskOverViewTest.class);
	
	TaskOverViewPage TaskOverViewPage;
	
	
	public TaskOverViewTest() {
		super();
	}	
	
	@Test(priority = 1, description="verify And Select Task OverView")
	public void verifyAndSelectTaskOverView()	
	{	
		TaskOverViewPage = new TaskOverViewPage();
		TaskOverViewPage.clickonTaskOverView();
		reporterLog("Starting Select Task overview");
        log.info("****** Starting the Test Case : Select Task Overview *************");
        
        TaskOverViewPage.selectDropDownValue();       
     
        String ExpectedValue= "Task overview";
        WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView")));       
        SoftAssertfunction(ActualValue, ExpectedValue);
        log.info("****** Ending the Test Case : Select Task Overview *************");
	}
	
	@Test(priority = 2, description="Apply Task OverView")
	public void ApplyTaskOverView( )	
	{
		reporterLog("Starting Task Overview testcase");
		log.info("************** Starting Test Case : Task Overview *******************");
		
		TaskOverViewPage.checkQueueType();	
		
		log.info("************** Ending Test Case : Task Overview *******************");	 
	}	 
}
