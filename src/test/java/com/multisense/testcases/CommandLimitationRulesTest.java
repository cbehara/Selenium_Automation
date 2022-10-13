package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommandLimitationRulePage;
import com.util.util.DriverUtility;

public class CommandLimitationRulesTest extends TestBase {

	CommandLimitationRulePage CommandLimitationRulePage;

	Logger log = LogManager.getLogger(CommandLimitationRulePage.class);

	public CommandLimitationRulesTest() {
		super();
	}	

	@Test(priority = 1,description="Verify And Select Command Limitation Rule")
	public void verifyAndSelectCommandLimitationRule()

	{
		CommandLimitationRulePage = new CommandLimitationRulePage();
		CommandLimitationRulePage.clickonCommandLimitationRule();
		reporterLog("Starting testcase Verify and Select Command Limitation Rule"); 
		log.info("****************************** starting test case : Verify and Select Command Limitation Rule *****************************************");
		String ExpectedValue= "Command limitation rules";
		String ActualValue =CommandLimitationRulePage.gettextofCommandLimitationRule();
		Assert.assertEquals(ActualValue, ExpectedValue);
		CommandLimitationRulePage.clickonAddCommandLimitationRule();
		log.info("****************************** Ending test case : Verify and Select Command Limitation Rule *****************************************");
	}

	@Test(priority = 2 , description="Create Command Limitation Rule")
	public void CreatedCommandLimitationRule()

	{
		reporterLog("Starting testcase Verify and Select Command Limitation Rule"); 
		log.info("****************************** starting test case : Create Command Limitation Rule *****************************************");

		CommandLimitationRulePage.AddCommandLimitationRule();

		log.info("****************************** Ending test case : Create Command Limitation Rule *****************************************");
	}

	@Test(priority = 3, description="Created ADD Command Command Limitation Rule")
	public void CreatedADDCommandCommandLimitationRule()

	{
		reporterLog("Starting testcase Create Add Command Limitation Rule"); 
		log.info("****************************** starting test case : Create Add Command Limitation Rule *****************************************");

		CommandLimitationRulePage.AddCommandsCommandLimitationRule();	


		log.info("****************************** Ending test case : Create Add Command Limitation Rule *****************************************"); 
	}

	@Test(priority = 4, description="Activate Command Limitation Rule")
	public void activationCommandLimitationRule()

	{
		reporterLog("Starting testcase Activate Command Limitation Rule"); 
		log.info("****************************** starting test case : Activate Command Limitation Rule *****************************************");
		CommandLimitationRulePage.activateCommandLimitationRule();

		log.info("****************************** Ending test case : Activate Command Limitation Rule *****************************************"); 
	}

	@Test(priority = 5, description="Edit Command Limitation Rule")
	public void editedCommandLimitationRule()
	{
		reporterLog("Starting testcase Edit Command Limitation Rule"); 
		log.info("****************************** starting test case : Edit Command Limitation Rule *****************************************");
		CommandLimitationRulePage.editCommandLimitationRule();
		log.info("****************************** Ending test case : Edit Command Limitation Rule *****************************************");
	}

	@Test(priority = 6, description="Changed Daylimit Command Limitation Rule")
	public void changedDaylimitCommandLimitationRule()
	{
		reporterLog("Starting testcase Change Daily Limit Command Limitation Rule"); 
		log.info("****************************** starting test case : Change Daily Limit Command Limitation Rule *****************************************");
		CommandLimitationRulePage.editdayLimitCommandLimitationRule();

		log.info("****************************** Ending test case : Change Daily Limit Command Limitation Rule *****************************************"); 
	}

	@Test(priority = 7, description="View Pending Changes Command Limitation Rule")
	public void viewPendingChangesCommandLimitationRule()
	{	
		reporterLog("Starting testcase viewPendingChanges Command Limitation Rule"); 
		log.info("****************************** starting test case : viewPendingChanges Command Limitation Rule *****************************************");
		CommandLimitationRulePage.viewPendingChanges();
		log.info("****************************** Ending test case : viewPendingChanges Command Limitation Rule *****************************************");
	}

	@Test(priority = 8, description="Remove Command Limitation Rule")
	public void removedCommandLimitationRule()
	{	
		reporterLog("Starting testcase Remove Command Limitation Rule"); 
		log.info("****************************** starting test case : Remove Command Limitation Rule *****************************************");
		CommandLimitationRulePage.removeCommandLimitationRule();

		log.info("****************************** Ending test case : Remove Command Limitation Rule *****************************************");
	}
	
	@Test(priority = 9, description="Verify Add Command Limitation Rule Name")
	public void VerifyAddCommandLimitationRuleName()

	{
		reporterLog("Starting test case Verify the error message for Add Command Limitation Rule Name"); 
		log.info("****************************** starting test case : Verify Add Command Limitation Rule Name *****************************************");
		CommandLimitationRulePage.clickonAddCommandLimitationRule();
		CommandLimitationRulePage.VerifyCommandLimitationRuleName();
		String ExpectedValue= "This field is required";
		String ActualValue =CommandLimitationRulePage.gettextofAddCommandLimitationRuleName();
		Assert.assertEquals(ActualValue, ExpectedValue);
		CommandLimitationRulePage.AddCommandsLimitationRuleCancel();
		
		log.info("****************************** Ending test case : Verify Add Command Limitation Rule Name *****************************************");
	}
	
	@Test(priority = 10, description="Verify Add Commands")
	public void VerifyAddCommands()

	{
		reporterLog("Starting test case Verify the error message for Add Commands in Add Command Limitation Rule "); 
		log.info("****************************** starting test case : Verify Add Commands *****************************************");
		CommandLimitationRulePage.clickonAddCommandLimitationRule();
		CommandLimitationRulePage.VerifyCommandLimitationRuleCommand();
		String ExpectedValue= "At least one command is required";
		String ActualValue =CommandLimitationRulePage.gettextofAddCommandLimitationRuleCommand();
		Assert.assertEquals(ActualValue, ExpectedValue);
		CommandLimitationRulePage.AddCommandsLimitationRuleCancel();
		
		log.info("****************************** Ending test case : Verify Add Commands *****************************************");
	}
	
	@Test(priority = 11, description="Add Commands Check All Category")
	public void AddCommadsCheckAllCategory()

	{
		reporterLog("Starting test case Verify the Check All Category in Add Commands"); 
		log.info("****************************** starting test case : Add Commands Check All Category *****************************************");
		CommandLimitationRulePage.clickonAddCommandLimitationRule();
		CommandLimitationRulePage.AddCommandLimitationRule();
		CommandLimitationRulePage.AddCommandsCheckAll();
		waitForTime(4000);
		CommandLimitationRulePage.AddCommandsAdd();
		CommandLimitationRulePage.AddCommandLimitationRuleAdd();
		waitForTime(13000);
		
		log.info("****************************** Ending test case : Add Commands Check All Category *****************************************");
	}
	
	@Test(priority = 12, description="Add Commands Check All Category")
	public void AddCommadsTest()

	{
		reporterLog("Starting test case Verify the Check All Category in Add Commands"); 
		log.info("****************************** starting test case : Add Commands Check All Category *****************************************");
		HashMap<String, Integer> commandmap = new HashMap<>();
		commandmap.put("Alarm configuration", 21);
		commandmap.put("Clock", 22);
		commandmap.put("Configuration change", 43);
		commandmap.put("Contactor", 33);
	    commandmap.put("Device action", 43);
	    commandmap.put("Device charge configuration", 13);
	    commandmap.put("Device credit configuration", 6);
	    commandmap.put("Display", 7);
	    commandmap.put("DLMS configuration", 6);
	    commandmap.put("Firewall configuration", 7);
		
		CommandLimitationRulePage.clickonAddCommandLimitationRule();
		CommandLimitationRulePage.AddCommandLimitationRule();
		for (String command:commandmap.keySet()){
			int commandcount = commandmap.get(command);
			String commandcategory = command;
			int locatorcount = CommandLimitationRulePage.SelectCommandCategory(commandcategory);
			Assert.assertEquals(locatorcount, commandcount);	
			WebElement AddCommandClearall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_AddCommandsCategoryClearall")));
			doClick(AddCommandClearall);
		}
		
		log.info("****************************** Ending test case : Add Commands Check All Category *****************************************");
	}
}
