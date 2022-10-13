package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.EstimationRuleSet.EstimationTaskSetPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class EstimateTaskTest extends TestBase{
	Logger log = LogManager.getLogger(EstimateTaskTest.class);
	String AddEstimateTaskSheet = "DataEstimationTask";
	String EditValidationTaskSheet = "EditEstimationTask";

	EstimationTaskSetPage EstimationTaskpage;

	public EstimateTaskTest()
	{
		super();
	}

	@DataProvider public Object[][] getTestDataForAddEstimateTask() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddEstimateTaskSheet); return testData;
	}

	@Test(priority =1,  description = "click Estimate Task", enabled = true ) 
	public void clickestimatetask()  throws InterruptedException
	{
		EstimationTaskpage = new EstimationTaskSetPage();	
		reporterLog("Starting Test case Click Estimate Task");
		log.info("****************************** starting test case : Estimation Task Set ****************************");

		EstimationTaskpage.clickestimatetask();
		log.info("****************************** Ending test case : Estimation Task Set ****************************");
	}

	@Test(priority =2, description = "click Add Estimate Task", enabled = true ) 
	public void clickAddEstimatetask()  throws InterruptedException
	{
		reporterLog("Starting Test case Add Estimate Task");
		log.info("****************************** starting test case :Add Estimation Task Set ****************************");
		EstimationTaskpage.clickAddEstimatetask();
		log.info("****************************** Ending test case : Add Estimation Task Set ****************************");
	}

	@Test(priority =3, dataProvider = "getTestDataForAddEstimateTask",description = "create Estimate Task", enabled = true ) 
	public void createestimatetask(String Loglevel, String Devicegroup, String UpdateLoglevel)  throws InterruptedException
	{
		reporterLog("Starting Test case Create Estimate Task");
		log.info("******************************Starting Test case : Create Estimate Task ****************************");
		EstimationTaskpage.createestimatetask(Loglevel,Devicegroup);		
		
		String Expectedtasksetadded = "Estimation task added";
		WebElement Actualtasksetadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_verifyestimationtaskadded")));
		SoftAssertfunction(Actualtasksetadded, Expectedtasksetadded);
		log.info("******************************Ending Test case : Create Estimate Task ****************************");
	}

	@Test(priority =4, dataProvider = "getTestDataForAddEstimateTask", description = "click on Edit Estimate Task",enabled = true ) 
	public void clickOnEditestimatetask(String Loglevel, String Devicegroup, String UpdateLoglevel)  throws InterruptedException
	{
		reporterLog("Starting Test case Edit Estimate Task");
		log.info("******************************Starting Test case : Edit Estimate Task ****************************");
		EstimationTaskpage.clickOnEditestimatetask(Loglevel,Devicegroup, UpdateLoglevel);

		String Expectedtasksetedited = "Estimation task saved";
		WebElement Actualtasksetedited = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_verifyestimationtasksaved")));

		SoftAssertfunction(Actualtasksetedited, Expectedtasksetedited);
		log.info("******************************Ending Test case : Edit Estimate Task ****************************");
	}

	@Test(priority =5, description = "click on Remove Estimate Task", enabled = true ) 
	public void clickRemovevalidationtask()  throws InterruptedException
	{
		reporterLog("Starting Test case Remove Estimate Task");
		log.info("******************************Starting Test case : Remove Estimate Task ****************************");
		EstimationTaskpage.clickRemovevalidationtask();

		String Expectedtasksetremoved = "Estimation task removed";
		WebElement Actualtasksetremoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_verifyestimationtaskremoved")));

		SoftAssertfunction(Actualtasksetremoved, Expectedtasksetremoved);
		log.info("****************************** ending test case - Remove Task Set **********************************");
	}
}
