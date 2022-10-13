package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.ValidationPage.ValidationTaskpage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ValidationTaskTest extends TestBase {
	Logger log = LogManager.getLogger(ValidationTaskTest.class);

	String AddValidationTaskSheet = "DataValidationTask";
	ValidationTaskpage ValidationTaskpage;

	public ValidationTaskTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForAddValidationTask() {
		Object testData[][] = TestUtil.getTestData(AddValidationTaskSheet);
		return testData;
	}

	@Test(priority = 1,description="Verify and Select Validation Task")
	public void VerifyandSelectValidationTask()
	{		
		ValidationTaskpage = new ValidationTaskpage();
		ValidationTaskpage.clickonvalidationTasks();
		reporterLog("Starting Testcase Creation of Validation Tasks");
		log.info(" ***********************Starting Testcase: Add Validation Tasks ********************");

		ValidationTaskpage.clicknewAddvalidationtask();	
		log.info("*********************** Ending Testcase: Add Validation Tasks ********************");
	}

	@Test(priority = 2, dataProvider = "getTestDataForAddValidationTask",description="Create Validation Task")
	public void CreateValidationTask(String Loglevel, String Devicegroup, String UpdateLoglevel)
	{
		reporterLog("Starting Testcase Create Validation Tasks");
		log.info(" ***********************Starting Testcase: Create Validation Tasks ********************");
		ValidationTaskpage.createValidationtask(Loglevel, Devicegroup);
		
		log.info(" ***********************Ending Testcase: Create Validation Tasks ********************");		
	}


	@Test(priority = 3, description="Add Validation Task")
	public void Addvalidationtask() 
	{
		reporterLog("Starting Test case  Add Validation Task");
		log.info("********************** Starting Test case: Add Validation Task****************");
		ValidationTaskpage.clickaddvalidationtask();
		String ExpectedAddValidationTask ="Validation task added";
		WebElement ActualAddValidationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifytextAddValidationTask")));
		SoftAssertfunction(ActualAddValidationTask, ExpectedAddValidationTask);
		log.info("********************** Starting Test case: Add Validation Task****************");
	}
	
	@Test(priority = 4, dataProvider = "getTestDataForAddValidationTask",description="Edit Validation Task")
	public void EditValidationTask(String Loglevel, String Devicegroup, String UpdateLoglevel)
	{
		reporterLog("Starting Testcase Edit Validation Tasks");
		log.info(" ***********************Starting Testcase: Edit Validation Tasks ********************");
		ValidationTaskpage.clickOnEditvalidatetask(Loglevel, UpdateLoglevel);
		String ExpectedSaveValidationTask ="Validation task saved";
		WebElement ActualSaveValidationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifytextSaveValidationTask")));

		SoftAssertfunction(ActualSaveValidationTask, ExpectedSaveValidationTask);
		log.info(" ***********************Ending Testcase: Edit Validation Tasks ********************");
	}

	@Test(priority = 5, description="View History Validation task")
	public void ViewHistoryValidationtask()
	{
		reporterLog("Starting Testcase View History Validation Tasks");
		log.info(" ***********************Starting Testcase: View History Validation Tasks ********************");
		ValidationTaskpage.clickOnViewHistoryvalidationTask();
		log.info(" ***********************Ending Testcase: View History Validation Tasks ********************");
	}

	@Test(priority = 6, description="Removed validation Task")
	public void removedvalidationTask()
	{
		reporterLog("Starting Testcase Remove Validation Tasks");
		log.info(" ***********************Starting Testcase: Remove Validation Tasks ********************");
		ValidationTaskpage.clickRemovevalidationtask();		
		String ExpectedRemoveValidationTask ="Validation task removed";
		WebElement ActualRemoveValidationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifytextremoveValidationTask")));
		SoftAssertfunction(ActualRemoveValidationTask,ExpectedRemoveValidationTask);
		log.info(" ***********************Ending Testcase: Remove Validation Tasks ********************");
	}
	
	@Test(priority = 7, description="Verify Add Validation Task Fields")
	public void verifyAddValidationTaskFields()
	{
		reporterLog("Starting Testcase Verify Add Validation Task Fields");
		log.info(" ***********************Starting Testcase: Verify Add Validation Task Fields ********************");
		ValidationTaskpage.verifyAddValidationTaskFields();		
		log.info(" ***********************Ending Testcase: Verify Add Validation Task Fields ********************");
	}

}

