package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Workspace.pages.ProcessesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class ProcessesTest  extends TestBase {

	Logger log = LogManager.getLogger(DataCollectionMyOpenIssuesTest.class);	
	ProcessesPage ProcessesPage;

	public ProcessesTest()
	{
		super();
	}

	@Test(priority = 1)
	public void ApplyProcesses()
	{
		ProcessesPage = new ProcessesPage();
		ProcessesPage.clickProcesses();
		reporterLog("Starting Test case Apply Processes");
		log.info("******************** starting test case :  Apply Processes******************************");
		String ExpectedValue= "Processes"; 
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_ProcessPage_VerifyProcesses")));
		HardAssertfunction(ActualValue, ExpectedValue);
		SoftAssertfunction(ActualValue, ExpectedValue);
		ProcessesPage.ApplyProcesses();
		log.info("******************** Ending test case :  Apply Processes******************************");
	}
}



