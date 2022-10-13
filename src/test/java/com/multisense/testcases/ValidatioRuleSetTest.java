package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.ValidationPage.ValidationRuleSetPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ValidatioRuleSetTest extends TestBase{
	Logger log = LogManager.getLogger(ValidatioRuleSetTest.class);	

	String AddValidationRuleSetSheet = "AddValidationRuleSet";

	ValidationRuleSetPage ValidationRuleSetPage;

	public ValidatioRuleSetTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForAddValidationRuleSet() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddValidationRuleSetSheet); 
		return testData;
	}

	@Test(priority =1,description="verifyandSelectValidationRuleSet") 
	public void verifyandSelectValidationRuleSet( ) 
	{
		ValidationRuleSetPage = new  ValidationRuleSetPage();
		ValidationRuleSetPage.clickValidationRuleSet();
		reporterLog("Starting Test case  Validation rule Set");
		log.info("********************** Starting Test case: Adding Validation Rule Set ***********************");

		ValidationRuleSetPage.clickAddValidationRuleSet();
		log.info("********************** Ending Test case: Adding Validation Rule Set ***********************");

	}
	@Test(priority = 2, dataProvider = "getTestDataForAddValidationRuleSet",description="Create Validation RuleSet")
	public void CreateValidationRuleSet(String Description,  String UpdateDescription,
			String versionDescription, String UpdateVersionDescription,String CloneUpdateVersionDescription)
	{
		reporterLog("Starting Test case  Create Validation rule Set");
		log.info("********************** Starting Test case: Create Validation Rule Set ***********************");
		ValidationRuleSetPage.createAndEditValidationRuleset( Description);
			  
		log.info("********************** Ending Test case: Create Validation Rule Set ***********************"); 
	}
	
	@Test(priority = 3, description="Add Validation RuleSet")
	public void addValidationRuleSet()
	{
		reporterLog("Starting Test case  Create Validation rule Set");
		log.info("********************** Starting Test case: Create Validation Rule Set ***********************");
		ValidationRuleSetPage.clickAddValidationRuleSetButton();
		String ExpectedAddedValidationRuleSet ="Validation rule set added";
		WebElement ActualAddedValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRuleSet")));
        SoftAssertfunction(ActualAddedValidationRuleSet , ExpectedAddedValidationRuleSet);		  
		log.info("********************** Ending Test case: Create Validation Rule Set ***********************"); 
	}

	@Test(priority = 4, dataProvider = "getTestDataForAddValidationRuleSet",description="Create ValidtionruleSetVersion")
	public void CreateValidtionruleSetVersion(String Description,  String UpdateDescription,
			String versionDescription, String UpdateVersionDescription,String CloneUpdateVersionDescription)
	{
		reporterLog("Starting Test case  Create Validation rule Set version");
		log.info("********************** Starting Test case: Create Validation Rule Set version****************");
		ValidationRuleSetPage.addValidationRuleSetVersion(versionDescription,UpdateVersionDescription,CloneUpdateVersionDescription);
		log.info("********************** Ending Test case: Create Validation Rule Set version****************");
	}
	
	@Test(priority = 5, description="Add Checking Missing Values Rule")
	public void AddCheckingMissingValuesRule()
	{
		reporterLog("Starting Test case Add Checking Missing Values Rule");
		log.info("********************** Starting Test case: Add Checking Missing Values Rule****************");
		ValidationRuleSetPage.addValidationRule("Check missing values  [STD]");
		log.info("********************** Ending Test case: Add Checking Missing Values Rule****************");
	}
	
	@Test(priority = 6, description="Edit Validation Rule")
	public void EditValidationRule()
	{
		reporterLog("Starting Test case Edit Validation Rule");
		log.info("********************** Starting Test case: Edit Validation Rule****************");
		ValidationRuleSetPage.editValidationRule();
		log.info("********************** Ending Test case: Edit Validation Rule****************");
	}
	
	@Test(priority = 7, description="Activate Validation Rule")
	public void ActivateValidationRule()
	{
		reporterLog("Starting Test case Activate Validation Rule");
		log.info("********************** Starting Test case: Activate Validation Rule****************");
		ValidationRuleSetPage.activateValidationRule();
		log.info("********************** Ending Test case: Activate Validation Rule****************");
	}
	
	@Test(priority = 8, description="Deactivate Validation Rule")
	public void DeactivateValidationRule()
	{
		reporterLog("Starting Test case Deactivate Validation Rule");
		log.info("********************** Starting Test case: Deactivate Validation Rule****************");
		ValidationRuleSetPage.deactivateValidationRule();
		log.info("********************** Ending Test case: Deactivate Validation Rule****************");
	}
	
	@Test(priority = 9, description="Remove Validation Rule")
	public void RemoveValidationRule()
	{
		reporterLog("Starting Test case Remove Validation Rule");
		log.info("********************** Starting Test case: Remove Validation Rule****************");
		ValidationRuleSetPage.removeValidationRule();
		log.info("********************** Ending Test case: Remove Validation Rule****************");
	}

	@Test(priority = 10, description="Add Consecutive Zero Values")
	public void AddConsecutiveZeroValues()
	{
		reporterLog("Starting Test case Add Consecutive Zero Values");
		log.info("********************** Starting Test case: Add Consecutive Zero Values****************");
		ValidationRuleSetPage.addValidationRule("Consecutive zero values [STD]");
		log.info("********************** Ending Test case: Add Consecutive Zero Values****************");
	}
	
	@Test(priority = 11, description="Add Meter advance")
	public void AddMeterAdvance()
	{
		reporterLog("Starting Test case Meter advance");
		log.info("********************** Starting Test case: Meter advance****************");
		ValidationRuleSetPage.addMeterAdvanceValidationRule("Meter advance [STD]");
		log.info("********************** Ending Test case: Meter advance****************");
	}
	
	@Test(priority = 12, description="Add Reading qualities")
	public void AddReadingQualities()
	{
		reporterLog("Starting Test case Reading qualities");
		log.info("********************** Starting Test case: Reading qualities****************");
		ValidationRuleSetPage.addReadingQualitiesValidationRule("Reading qualities [STD]");
		log.info("********************** Ending Test case: Reading qualities****************");
	}
	
	@Test(priority = 13, description="Add Register increase")
	public void AddReadingIncrease()
	{
		reporterLog("Starting Test case Register increase");
		log.info("********************** Starting Test case: Register increase****************");
		ValidationRuleSetPage.addValidationRules("Register increase [STD]");
		log.info("********************** Ending Test case: Register increase****************");
	}
	
	@Test(priority = 14, description="Add Threshold violation")
	public void AddThresholdViolation()
	{
		reporterLog("Starting Test case Threshold violation");
		log.info("********************** Starting Test case: Threshold violation****************");
		ValidationRuleSetPage.addValidationRules("Threshold violation [STD]");
		log.info("********************** Ending Test case: Threshold violation****************");
	}

	@Test(priority = 15, description="Edit Validation ruleSet")
	public void editValidationruleSet() 
	{
		reporterLog("Starting Test case  Edit Validation rule Set version");
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
		ValidationRuleSetPage.clickOnEditvalidateRuleSet();
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
	}
	
	@Test(priority = 16, dataProvider = "getTestDataForAddValidationRuleSet",description="Create and edit Validation ruleSet")
	public void createandeditValidationruleSet(String Description,  String UpdateDescription,
			String versionDescription, String UpdateVersionDescription,String CloneUpdateVersionDescription) 
	{
		reporterLog("Starting Test case  Edit Validation rule Set version");
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
		ValidationRuleSetPage.createAndEditValidationRuleset( UpdateDescription);
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
	}

	@Test(priority = 17, description="Save validation Rule Set")
	public void savevalidationRuleSet()
	{
		reporterLog("Starting Test case  Save Validation rule Set version");
		log.info("********************** Starting Test case: Save Validation Rule Set version****************");
		ValidationRuleSetPage.clickOnSavevalidateRuleSet();
		String ExpectedSavedValidationRuleSet ="Validation rule set saved";
		WebElement ActualSavedValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextsavedValidationRuleSet")));

		SoftAssertfunction(ActualSavedValidationRuleSet,ExpectedSavedValidationRuleSet);
		log.info("********************** Ending Test case: Save Validation Rule Set version****************");
	}

	@Test(priority = 18, description="Remove validation Rule set")
	public void removevalidationRuleset()
	{
		reporterLog("Starting Test case  Remove Validation rule Set version");
		log.info("********************** Starting Test case: Remove Validation Rule Set version****************");
		ValidationRuleSetPage.clickRemovevalidationRuleSet();
		String ExpectedRemoveValidationRuleSet = "Validation rule set removed";
		WebElement ActualRemoveValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextremoveValidationRuleSet")));
		//HardAssertfunction(ActualRemoveValidationRuleSet, ExpectedRemoveValidationRuleSet);   
		SoftAssertfunction(ActualRemoveValidationRuleSet, ExpectedRemoveValidationRuleSet);


		log.info("********************** Ending Test case: Remove Validation Rule Set version****************");

	}
}

