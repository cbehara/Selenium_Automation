package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.ProcessManagement.ProcessesPage;
import com.base.base.TestBase;

public class ProcessesTest extends TestBase{

	Logger log = LogManager.getLogger(ProcessesTest.class); 	

	ProcessesPage ProcessesPage;

	public ProcessesTest() {
		super();
	}	

	@Test(priority = 1)
	public void verifyAndActivateProcess() throws InterruptedException	
	{
		ProcessesPage = new ProcessesPage();
		ProcessesPage.clickonProcesses();
		reporterLog("Starting testcase Verify And Activate Process");
		log.info("****************************** Starting test case : Verify And Activate Process *****************************************");
		catchCFT1000Alert();
		ProcessesPage.activateProcess();		
		log.info("****************************** Ending test case : Verify And Activate Process *****************************************");

	}

	@Test(priority = 2, description = "In stock and save process")
	public void InstockandSaveProcess()	
	{   
		reporterLog("Starting testcase In stock and Save Process");
		log.info("****************************** Starting test case : In stock and Save Process *****************************************");
		ProcessesPage.ClickonInstockandSave();	
		log.info("****************************** Ending test case : In stock and Save Process *****************************************");
	}

	@Test(priority = 3, description = "Deactivate process")
	public void DeactivateProcess()	
	{ 
		reporterLog("Starting testcase DeActivate Process");
		log.info("****************************** Starting test case : DeActivate Process *****************************************");
		ProcessesPage.DeactivateProcess();	
		log.info("****************************** Ending test case : DeActivate Process *****************************************");
	}
}
