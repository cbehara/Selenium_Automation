package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.WorkgroupsPage.WorkgroupsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class WorkGroupsTest  extends TestBase{

	String AddWorkGroupssheet = "AddWorkGroups";
	WorkgroupsPage Workgroupspage;
	Logger log = Logger.getLogger(WorkGroupsTest.class); 
	
	public WorkGroupsTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForWorkGroups() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddWorkGroupssheet);
		return testData;
	}             

	@Test(priority = 1, description = "click work group"  ) 
	public void clickWorkGroup() throws InterruptedException
	{
		Workgroupspage = new WorkgroupsPage();
		
		reporterLog("Starting Testcase Click Workgroup");
		
		log.info("****************************** starting test case : Click WorkGroups*****************************************");

		Workgroupspage.clickWorkGroup();

		String Expectedtitle = "Workgroups";
		
		WebElement Actualtitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroups")));
		
		TitleAssertFunction(Actualtitle, Expectedtitle);
		
		log.info("****************************** Ending test case : Click WorkGroups*****************************************");
	} 

	@Test(priority = 2, description = "click Add work groups", enabled = true ) 
	public void clickAddWorkGroups() throws InterruptedException
	{
		reporterLog("Starting Testcase Click Add Workgroup");
		
		log.info("****************************** starting test case : Add WorkGroups*****************************************");
		
		Workgroupspage.clickAddWorkGroups();
		
		log.info("****************************** Ending test case : Click Add WorkGroups*****************************************");
	}

	@Test(priority = 3, dataProvider = "getTestDataForWorkGroups", description = "Add work groups", enabled = true ) 
	public void AddWorkGroups(String Name, String Desc) throws InterruptedException
	{
		reporterLog("Starting Testcase Add Workgroup");
		
		log.info("****************************** starting test case : Add WorkGroups*****************************************");
		
		Workgroupspage.AddWorkGroups(Name, Desc);
		
		String Expectedworkgroupadded = "Workgroup added";
		
		WebElement Actualworkgroupadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_workgroupadded")));
		
		SoftAssertfunction(Actualworkgroupadded, Expectedworkgroupadded);
		
		log.info("****************************** Ending test case : Add WorkGroups*****************************************");
	}  

	@Test(priority = 4, description = "Remove work groups", dataProvider = "getTestDataForWorkGroups", enabled = true ) 
	public void removeWorkGroup(String Name, String Desc) throws InterruptedException
	{ 
		reporterLog("Starting Testcase Remove Workgroup");
		
		log.info("****************************** starting test case : Remove WorkGroups*****************************************");
		
		Workgroupspage.removeWorkGroup(Name);
		
		String Expectedworkgroupremoved = "Workgroup removed";
		
		WebElement Actualworkgroupemoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_workgroupremoved")));
		
		SoftAssertfunction(Actualworkgroupemoved, Expectedworkgroupremoved);
		
		log.info("****************************** Ending test case : Remove WorkGroups*****************************************");
	}
}

