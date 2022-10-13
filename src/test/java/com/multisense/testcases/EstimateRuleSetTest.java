package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.EstimationRuleSet.EstimationRuleSetPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class EstimateRuleSetTest extends TestBase{
	Logger log = LogManager.getLogger(EstimateRuleSetTest.class);
	String AddEstimationRuleSetSheet = "AddEstimationRuleSet";
	EstimationRuleSetPage EstimationRuleSetPage;
	
	String Name = generateRandomName(8);

	public EstimateRuleSetTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForAddEstimationRuleSet() 
	{ 

		Object testData[][] = TestUtil.getTestData(AddEstimationRuleSetSheet); 
		return testData;
	}

	@Test(priority =1, description = "click Add Estimate Rule Set") 
	public void clickAddEstimationRuleSet( ) throws InterruptedException
	{
		EstimationRuleSetPage = new  EstimationRuleSetPage();
		reporterLog("Starting Test case Click Estimation RuleSet Set");
		log.info("************************ starting testcase : Click Estimation RuleSet Set*************************");
		
		EstimationRuleSetPage.clickEstimationRuleSet();
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.clickAddEstimationRuleSet();
		log.info("************************Ending testcase : Click Estimation RuleSet Set ** ***********************");
	}

	@Test(priority =2, dataProvider = "getTestDataForAddEstimationRuleSet", description = "create Estimation Rule Set" ,enabled = true ) 
	public void createEstimationRuleset(String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType ) throws InterruptedException
	{
		reporterLog("Starting Test case Create Estimation RuleSet Set");
		log.info("************************ starting testcase : Create Estimation RuleSet Set*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.createEstimationRuleset(Description);
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

		EstimationRuleSetPage.clickAddEstimationRuleSetButton();
		log.info("Rule Set Added");
		log.info("************************Assertions verified for estimate rule added***************************");
		String Expectedrulesetadded = "Estimation rule set added";
		WebElement Actualrulesetadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_verifyestimationruleadded")));
		
		SoftAssertfunction(Actualrulesetadded, Expectedrulesetadded);
		log.info("************************ Ending testcase : Create Estimation RuleSet Set*************************");
		EstimationRuleSetPage.clickOnAddEstimateRules(UpdateDescription);
	}  

	@Test(priority =3, dataProvider = "getTestDataForAddEstimationRuleSet" ,description = "click on edit Estimation Rule Set" ,enabled = true ) 
	public void clickOnEditEstimateRuleSet(String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType ) throws InterruptedException
	{
		reporterLog("Starting Test case Edit Estimation RuleSet Set");
		log.info("************************ starting testcase : Edit Estimation RuleSet Set*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.clickOnEstimationRules( Estimationrule,  Estimator,  EstimationComment,  ReadingType);
		log.info("Rule Set edited");
		log.info("************************Assertions verified for estimate rule edited***************************");
		
	}
	
	@Test(priority =4, description = "Edit Order" ,enabled = true ) 
	public void EditOrder() throws InterruptedException
	{
		reporterLog("Starting Test case Edit Order");
		log.info("************************ starting testcase : Edit Order*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.EditOrder();

		log.info("************************ Ending testcase : Edit Order*************************");	
	}
	
	@Test(priority =5, description = "Undo Order" ,enabled = true ) 
	public void UndoOrder() throws InterruptedException
	{
		reporterLog("Starting Test case Undo Order");
		log.info("************************ starting testcase : Undo Order*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.UndoOrder();

		log.info("************************ Ending testcase : Undo Order*************************");	
	}
	
	@Test(priority =6, description = "Save Order" ,enabled = true ) 
	public void SaveOrder() throws InterruptedException
	{
		reporterLog("Starting Test case Save Order");
		log.info("************************ starting testcase : Save Order*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.EditOrder();
		EstimationRuleSetPage.SaveOrder();

		log.info("************************ Ending testcase : Save Order*************************");	
	}
	
	@Test(priority =7, description = "Activate Estimation Rule", enabled = true ) 
	public void ActivateEstimationRule() throws InterruptedException
	{
		reporterLog("Activate Estimation Rule Set");
		log.info("************************ starting testcase : Activate Estimation Rule Set*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.ActivateEstimationRule();
		log.info("Rule Set Activated");
		
	}
	
	@Test(priority =8,description = "Deactivate Estimation Rule ") 
	public void DectivateEstimationRule() throws InterruptedException
	{
		reporterLog("Deactivate Estimation Rule Set");
		log.info("************************ starting testcase : Deactivate Estimation Rule Set*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.DectivateEstimationRule();
		log.info("Rule Set Dectivated");		
	}
	
	@Test(priority =9, description = "Edit Estimation Rule ") 
	public void EditEstimationRule() throws InterruptedException
	{
		reporterLog("Edit Estimation Rule Set");
		log.info("************************ starting testcase : Edit Estimation Rule Set*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.EditEstimationRule();
		log.info("Rule Set Edited");	
	}
	
	@Test(priority =10,  description = "Remove Estimation Rule") 
	public void RemoveEstimationRule() throws InterruptedException
	{
		reporterLog("Remove Estimation Rule Set");
		log.info("************************ starting testcase : Remove Estimation Rule Set*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.RemoveEstimationRule();
		log.info("Rule Set Removed");
	}
	
	@Test(priority =11, dataProvider = "getTestDataForAddEstimationRuleSet", description = "Add Estimation Rule Equal Distribution") 
	public void AddEstimationRuleEqualDistribution(String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType) throws InterruptedException
	{
		reporterLog("Add Estimation Rule Equal Distribution");
		log.info("************************ starting testcase : Add Estimation Rule Equal Distribution*************************");
		EstimationRuleSetPage.Addestimationrulesbutton();
		EstimationRuleSetPage.clickOnEstimationRules(Estimationrule,"Equal distribution [STD]", EstimationComment, ReadingType);
		EstimationRuleSetPage.RemoveEstimationRule();
		
		log.info("************************ Ending testcase : Add Estimation Rule Equal Distribution*************************");
	}
	
	@Test(priority =12, dataProvider = "getTestDataForAddEstimationRuleSet", description = "Add Estimation Rule Linear Interpolation") 
	public void AddEstimationRuleLinearInterpolation(String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType) throws InterruptedException
	{
		reporterLog("Add Estimation Rule Linear Interpolation");
		log.info("************************ starting testcase : Add Estimation Rule Linear Interpolation*************************");
		EstimationRuleSetPage.Addestimationrulesbutton();
		EstimationRuleSetPage.clickOnEstimationRules(Estimationrule,"Linear interpolation [STD]", EstimationComment, ReadingType);
		EstimationRuleSetPage.RemoveEstimationRule();
		
		log.info("************************ Ending testcase : Add Estimation Rule Linear Interpolation*************************");
	}
	
	@Test(priority =13, dataProvider = "getTestDataForAddEstimationRuleSet", description = "Add Estimation Rule Nearest Average Value") 
	public void AddEstimationRuleNearestAverageValue(String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType) throws InterruptedException
	{
		reporterLog("Add Estimation Rule Linear Interpolation");
		log.info("************************ starting testcase : Add Estimation Rule Nearest Average Value*************************");
		EstimationRuleSetPage.Addestimationrulesbutton();
		EstimationRuleSetPage.clickOnEstimationRules(Estimationrule,"Nearest average value (Day) [STD]", EstimationComment, ReadingType);
		EstimationRuleSetPage.RemoveEstimationRule();
		
		log.info("************************ Ending testcase : Add Estimation Rule Nearest Average Value*************************");
	}
	
	@Test(priority =14, dataProvider = "getTestDataForAddEstimationRuleSet", description = "Add EstimationRule Power Gap Fill") 
	public void AddEstimationRulePowerGapFill(String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType) throws InterruptedException
	{
		reporterLog("Add EstimationRule Power Gap Fill");
		log.info("************************ starting testcase : Add EstimationRule Power Gap Fill*************************");
		EstimationRuleSetPage.Addestimationrulesbutton();
		EstimationRuleSetPage.clickOnEstimationRules(Estimationrule,"Power gap fill [STD]", EstimationComment, ReadingType);
		EstimationRuleSetPage.RemoveEstimationRule();
		
		log.info("************************ Ending testcase : Add EstimationRule Power Gap Fill*************************");
	}
	
	@Test(priority =15, dataProvider = "getTestDataForAddEstimationRuleSet", description = "Add Estimation Rule Value Fill") 
	public void AddEstimationRuleValueFill (String Description, String UpdateDescription, String Estimationrule, String Estimator, String EstimationComment, String ReadingType) throws InterruptedException
	{
		reporterLog("Add Estimation Rule Value Fill");
		log.info("************************ starting testcase : Add Estimation Rule Value Fill*************************");
		EstimationRuleSetPage.Addestimationrulesbutton();
		EstimationRuleSetPage.clickOnEstimationRules(Estimationrule,"Value fill [STD]", EstimationComment, ReadingType);
		EstimationRuleSetPage.RemoveEstimationRule();
		
		log.info("************************ Ending testcase : Add Estimation Rule Value Fill*************************");
	}
	
	@Test(priority =16, description = "Remove Estimation Rule Set") 
	public void Removeestimationruleset() throws InterruptedException
	{
		reporterLog("Remove Estimation Rule Set");
		log.info("************************ starting testcase : Remove Estimation Rule Set*************************");
		EstimationRuleSetPage.Removeestimationruleset();
		
		log.info("************************ Ending testcase : Remove Estimation Rule Set*************************");
	}
	
	@Test(priority =17,  description = "Verify Estimation Rule Set Field") 
	public void VerifyEstimationRuleSetField() throws InterruptedException
	{
		reporterLog("Verify Estimation Rule Set Field");
		log.info("************************ starting testcase : Verify Estimation Rule Set Field*************************");
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		EstimationRuleSetPage.VerifyEstimationRuleSetField();

		log.info("************************ Ending testcase : Verify Estimation Rule Set Field*************************");
	}


}
