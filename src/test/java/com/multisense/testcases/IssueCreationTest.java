package com.multisense.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.IssueCreationPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class IssueCreationTest  extends TestBase{

	String AddIssueCreationSheet = "AddIssueCreation";
	Logger log = LogManager.getLogger(IssueCreationTest.class); 	

	IssueCreationPage Issuecreationpage;

	public IssueCreationTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForIssueCreation() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddIssueCreationSheet);
		return testData;
	}

	@Test(priority =1, description = "click on issue creation") 
	public void issuecreation () throws InterruptedException
	{
		Issuecreationpage = new IssueCreationPage();      
		reporterLog("Starting Testcase Issue Creation");
   	 	log.info("****************************** starting testcase : Issue Creation*****************************************");
		Issuecreationpage.clickissuecreationpage();
		log.info("****************************** Ending testcase : Issue Creation*****************************************");
	}

	@Test(priority =2, description = "click add issue button" ,enabled = true) 
	public void clickaddissuebutton () throws InterruptedException
	{
		reporterLog("Starting Testcase Add Issue");
   	 	log.info("****************************** starting testcase : Add Issue*****************************************");
		Issuecreationpage.clickaddissuebutton();
		log.info("****************************** Ending testcase : Add Issue*****************************************");
	}

	@Test(priority =3, dataProvider = "getTestDataForIssueCreation", description = "click add creation rule" ,enabled = true) 
	public void addCreationrule (String IssueType , String RuleTemplate , String DeviceType, String devicestate, String Threshhold ,String Event , String IssueReason, String Action, String To, String UpdateName ) throws InterruptedException
	{
		reporterLog("Starting Testcase Add Creation Rule");
   	 	log.info("****************************** starting testcase : Add Creation Rule*****************************************");
		Issuecreationpage.addCreationrule(IssueType,RuleTemplate,DeviceType,devicestate,Threshhold,Event,IssueReason,Action,To,UpdateName );
		Thread.sleep(5000);
		log.info("****************************** Ending test case : Add Creation Rule*****************************************");
	}
	
	@Test(priority =4, description = "activate issue creation", enabled = true) 
	public void activateIssueCreation () throws InterruptedException
	{
		reporterLog("Starting Testcase activate issue creation");
   	 	log.info("****************************** starting test case : activate issue creation*****************************************");
		Issuecreationpage.activateIssueCreation();
		
		String ExpectedIssueactivated = "Issue creation rule activated";	  
		WebElement ActualIssueactivated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationruleactivated")));

		SoftAssertfunction(ActualIssueactivated, ExpectedIssueactivated);
		log.info("****************************** Ending test case : activate issue creation*****************************************");
	}
	
	@Test(priority =5, description = "deactivate issue creation", enabled = true) 
	public void deactivateIssueCreation () throws InterruptedException
	{
		reporterLog("Starting Testcase deactivate issue creation");
   	 	log.info("****************************** starting test case : deactivate issue creation*****************************************");
		Issuecreationpage.deactivateIssueCreation();
		
		String ExpectedIssuedeactivated = "Issue creation rule deactivated";	  
		WebElement ActualIssuedeactivated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationruledeactivated")));

		SoftAssertfunction(ActualIssuedeactivated, ExpectedIssuedeactivated);
		log.info("****************************** Ending test case : deactivate issue creation*****************************************");
	}

	@Test(priority =6, dataProvider = "getTestDataForIssueCreation" , description = "edit issue creation", enabled = true) 
	public void editIssueCreation (String IssueType , String RuleTemplate , String DeviceType, String devicestate, String Threshhold ,String Event , String IssueReason, String Action, String To, String UpdateName) throws InterruptedException
	{
		reporterLog("Starting Testcase Edit Issue");
   	 	log.info("****************************** starting test case : Edit Issue*****************************************");
		Issuecreationpage.editIssueCreation( UpdateName);
		
		String ExpectedIssueupdated = "Issue creation rule updated";	  
		WebElement ActualIssueupdated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationruleupdated")));

		SoftAssertfunction(ActualIssueupdated, ExpectedIssueupdated);
		log.info("****************************** Ending test case : Edit Issue*****************************************");
	}
	
	@Test(priority =7, dataProvider = "getTestDataForIssueCreation" ,description = "remove issue creation", enabled = true) 
	public void removeIssueCreation (String IssueType , String RuleTemplate , String DeviceType, String devicestate, String Threshhold ,String Event , String IssueReason, String Action, String To, String UpdateName) throws InterruptedException
	{
		reporterLog("Starting Testcase Remove Issue");
   	 	log.info("****************************** starting test case : Remove Issue*****************************************");
		Issuecreationpage.removeIssueCreation(UpdateName);
		
		String ExpectedIssueremoved = "Issue creation rule removed";
		WebElement ActualIssueremoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationruleremoved")));

		SoftAssertfunction(ActualIssueremoved, ExpectedIssueremoved);
		log.info("****************************** Ending test case : Remove Issue*****************************************");
	}
	
	@Test(priority =8, description = "Verify Add Issue Creation Rule Fields") 
	public void VerifyAddIssueCreationRuleFields() throws InterruptedException
	{      
		reporterLog("Starting Testcase Issue Creation field verification");
   	 	log.info("****************************** starting testcase : Verify Add Issue Creation Rule Fields *****************************************");
   	    Issuecreationpage.clickaddissuebutton();
   	    Issuecreationpage.VerifyAddIssueCreationRulesFields();
   	 
		log.info("****************************** Ending testcase : Verify Add Issue Creation Rule Fields *****************************************");
	}

}

