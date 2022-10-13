package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommunicationTasksPage;
import com.util.util.DriverUtility;

public class CommunicationTasksTest extends TestBase {
	  Logger log = LogManager.getLogger(CommunicationTasksTest.class);
      CommunicationTasksPage CommunicationTasksPage ;
     
     public CommunicationTasksTest() {
 		super();
 	}     
	
	@Test(priority = 1,description="Change Task per page")
	public void ChangeTaskperpage()
	
	{
		CommunicationTasksPage = new CommunicationTasksPage ();
		CommunicationTasksPage.clickonCommunicationTask();
		reporterLog("Starting Change Communication Task per page test case");
		log.info("****** starting test case : Change Communication Task per page *************");
				
		CommunicationTasksPage.ChangePerpagevalue();
		
		log.info("****** Ending test case : Change Communication Task per page *************");
		
	}
		
	@Test(priority = 2, description="Verify Communication Task Name Field")
	public void verifyCommunicationTaskNameField()	
	{	
		reporterLog("Starting test case for Verifying Communication Task Name filed");
		log.info("****** starting test case : Verify Communication Task Name Field *************");
        
        CommunicationTasksPage.clickonAddCommunicationTask();
        CommunicationTasksPage.verifycommunicationtasksNameField();
        
        log.info("*************** Ending test case : SVerify Communication Task Name Field **********");
	}
	
	@Test(priority = 3, description="Verify And Select Communication Task")
	public void verifyAndSelectCommunicationTask()	
	{	
		reporterLog("Starting Select Communication Task test case");
		log.info("****** starting test case : Select Communication Task test case *************");
        
        CommunicationTasksPage.clickonAddCommunicationTask();
        
        log.info("*************** Ending test case : Select Communication Task test case **********");
	}
	
	@Test(priority = 4, description="Created Communication Task")
	public void CreatedCommunicationTask()
	
	{
		reporterLog("Starting Create Communication Task test case");
		log.info("****** starting test case : Create Communication Task test case *************");
		
		CommunicationTasksPage.createCommunicationTask();	
		
		log.info("****** Ending test case : Create Communication Task test case *************");
	}
	
	@Test(priority = 5, description="Create Communication Task Action Basic Check")
	public void CreateActionBasicCheck()
	
	{
		reporterLog("Starting Creating Communication Task Basic Check Action test case");
		log.info("****** starting test case : Create Communication Task Action Basic Check *************");
		
		CommunicationTasksPage.createAction("Basic check", "Check");	
		
		log.info("****** Ending test case : Create Communication Task Action Basic Check *************");
	}
	
	@Test(priority = 6, description="Create Communication Task Action Clock Force")
	public void CreateActionClockForce()
	
	{
		reporterLog("Starting Creating Communication Task Clock Force Action test case");
		log.info("****** starting test case : Create Communication Task Action Clock Force*************");
		
		CommunicationTasksPage.createActions("Clock", "Force");	
		
		log.info("****** Ending test case : Create Communication Task Action Clock Force *************");
	}
	
	@Test(priority = 7, description="Create Communication Task Action Clock Set")
	public void CreateActionClockSet()
	
	{
		reporterLog("Starting Creating Communication Task Clock Set Action test case");
		log.info("****** starting test case : Create Communication Task Action Clock Set*************");
		
		CommunicationTasksPage.createActions("Clock", "Set");	
		String Expetedvalue = "The communication task already has this category"; 
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_VerifyCommunicationTask")));
		SoftAssertfunction(Actualvalue, Expetedvalue);
		WebElement cancelCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_cancelCommunicationTaskbutton")));
 		doClick(cancelCommunicationTaskbutton);	
 		
		log.info("****** Ending test case : Create Communication Task Action Clock Set *************");
	}
	
	@Test(priority = 8, description="Create Communication Task Action Clock Synchronize")
	public void CreateActionClockSynchronize()
	
	{
		reporterLog("Starting Creating Communication Task Clock Synchronize Action test case");
		log.info("****** starting test case : Create Communication Task Action Clock Synchronize*************");
		
		CommunicationTasksPage.createActions("Clock", "Synchronize");	
		String Expetedvalue = "The communication task already has this category"; 
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_VerifyCommunicationTask")));
		SoftAssertfunction(Actualvalue, Expetedvalue);
		WebElement cancelCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_cancelCommunicationTaskbutton")));
 		doClick(cancelCommunicationTaskbutton);	
		
		log.info("****** Ending test case : Create Communication Task Action Clock Synchronize *************");
	}
	
	@Test(priority = 9, description="Create Communication Task Action Load Profile")
	public void CreateActionLoadProfiles()
	
	{
		reporterLog("Starting Creating Communication Task Load Profile Action test case");
		log.info("****** starting test case : Create Communication Task Action Load Profile *************");
		
		CommunicationTasksPage.createLoadProfileActions("Load profiles", "Read");	
		
		log.info("****** Ending test case : Create Communication Task Action Load Profile *************");
	}
	
	@Test(priority = 10, description="Create Communication Task Action Logbooks")
	public void CreateActionLogbooks()
	
	{
		reporterLog("Starting Creating Communication Task Logbook Action test case");
		log.info("****** starting test case : Create Communication Task Action Logbooks *************");
		
		CommunicationTasksPage.createLogbooksActions("Logbooks", "Read");	
		
		log.info("****** Ending test case : Create Communication Task Action Logbooks *************");
	}
	
	@Test(priority = 11, description="Create Communication Task Action Registers")
	public void CreateActionRegisters()
	
	{
		reporterLog("Starting Creating Communication Task Registers Action test case");
		log.info("****** starting test case : Create Communication Task Action Registers *************");
		
		CommunicationTasksPage.createRegisterActions("Registers", "Read");	
		
		log.info("****** Ending test case : Create Communication Task Action Registers *************");
	}
	
	@Test(priority = 12, description="Create Communication Task Action Status Information")
	public void CreateActionStatusInformation()
	
	{
		reporterLog("Starting Creating Communication Task Status Information Action test case");
		log.info("****** starting test case : Create Communication Task Action Status Information *************");
		
		CommunicationTasksPage.createActions("Status information", "Read");	
		
		log.info("****** Ending test case : Create Communication Task Action Status Information *************");
	}
	
	@Test(priority = 13, description="Create Communication Task Action Topology Update")
	public void CreateActionTopologyUpdate()
	
	{
		reporterLog("Starting Creating Communication Task Status Information Action test case");
		log.info("****** starting test case : Create Communication Task Action Topology Update *************");
		
		CommunicationTasksPage.createActions("Topology", "Update");	
		
		log.info("****** Ending test case : Create Communication Task Action Topology Update *************");
	}
	
	@Test(priority = 14, description="Create Communication Task Action Topology Verify")
	public void CreateActionTopologyVerify()
	
	{
		reporterLog("Starting Creating Communication Task Status Information Action test case");
		log.info("****** starting test case : Create Communication Task Action Topology Verify *************");
		
		CommunicationTasksPage.createActions("Topology", "Verify");	
		String Expetedvalue = "The communication task already has this category"; 
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_VerifyCommunicationTask")));
		SoftAssertfunction(Actualvalue, Expetedvalue);
		WebElement cancelCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_cancelCommunicationTaskbutton")));
 		doClick(cancelCommunicationTaskbutton);	
		
		log.info("****** Ending test case : Create Communication Task Action Topology Verify *************");
	}
	
	@Test(priority = 15, description="Created Common Categories")
	public void CreatedCommonCategories( )
	
	{
		reporterLog("Starting Create Commom Categories test case");
		log.info("****** starting test case : Create Commom Categories test case *************");
		
		CommunicationTasksPage.createCommandCategories();
		
		log.info("****** Ending test case : Create Commom Categories test case *************");
	}
	
	@Test(priority = 16, description="Check Activity Calender Common Categories")
	public void CheckActivityCalenderCommonCategories( )
	
	{
		reporterLog("Starting Check Activity Calender Common Categories");
		log.info("****** starting test case : Check Activity Calender Common Categories *************");
		
		CommunicationTasksPage.CheckActivityCalender();
		
		log.info("****** Ending test case : Check Activity Calender Common Categories *************");
	}
	
	
	@Test(priority = 17, description="Check All Common Categories")
	public void CheckAllCommonCategories( )
	
	{
		reporterLog("Starting Check All Common Categories");
		log.info("****** starting test case : Check All Common Categories *************");
		
		CommunicationTasksPage.CreateCommandCategoriesCheckAll();
		
		log.info("****** Ending test case : Check All Common Categories *************");
	}
	
	@Test(priority = 18, description="Remove exsisting Privileges")
	public void RemovePrivileges( )
	
	{
		reporterLog("Starting test case to remove privileges");
		log.info("****** starting test case : Remove exsisting Privileges *************");
		
		CommunicationTasksPage.RemovePrivilege();
		
		log.info("****** Ending test case : Remove exsisting Privileges *************");
	}
	
	@Test(priority = 19, description="Add Privileges")
	public void AddPrivileges( )
	
	{
		reporterLog("Starting test case to add privileges");
		log.info("****** starting test case : Add Privileges *************");
		
		CommunicationTasksPage.AddPrivilege();
		
		log.info("****** Ending test case : Add Privileges *************");
	}

}


