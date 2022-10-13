package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.AlarmCommunicationRule.AddActionInAlarmCreationRulePage;
import com.multisense.pages.AlarmCommunicationRule.AddEditAlarmCreationRulePage;
import com.multisense.pages.AlarmCommunicationRule.AlarmCreationRulesPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class AlarmCreationRulesTest extends TestBase {
	
	Logger log = LogManager.getLogger(AlarmCreationRulesTest.class);
	String addAlarmRuleSheet = "AlarmCreationRule";
	String actionsOnAlarmCreationRuleSheet = "ActionsOnAlarmCreationRule";
	AlarmCreationRulesPage alarmCreationRulesPage;
	AddEditAlarmCreationRulePage addEditAlarmCreationRulePage;
	AddActionInAlarmCreationRulePage addActionInAlarmCreationRulePage;
	
	public AlarmCreationRulesTest()
	{
		super();
	}	
	
	@DataProvider(name = "dp1")
	public Object[][] getTestDataForAdd() {
		Object testData[][] = TestUtil.getTestData(addAlarmRuleSheet);
		return testData;
	}
	
	@DataProvider(name = "dp2")
	public Object[][] getTestDataForActions() {
		Object testData[][] = TestUtil.getTestData(actionsOnAlarmCreationRuleSheet);
		return testData;
	}
	
	@Test(priority =1, enabled = true, description ="Verify Navigation to Alarm Creation rules page")	
	public void verifyNavigationToAlarmCreationRulesPage() 
	{	
		alarmCreationRulesPage = new AlarmCreationRulesPage();
		reporterLog("Starting testcase Verify navigation to Alarm creation rules"); 
		log.info("****************************** starting test case : Verify navigation to Alarm creation rules *****************************************");
		alarmCreationRulesPage.navigatetoAlarmCreationruleName();		
    	String ExpectedValue= "Alarm creation rules";
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AlarmCreationRulePage_eleAlarmCreationRulePageName")));
        SoftAssertfunction(ActualValue, ExpectedValue);
        log.info("****************************** Ending test case : Verify navigation to Alarm creation rules *****************************************");
	}
	
	@Test(priority =2, dataProvider = "dp1", enabled = true, description ="Add Alarms rule")
	public void addAlarmRule(String templateName, String raisedOrCleared, String isEventTypePartsSpecified, String eventType, String deviceType, String deviceDomain, String deviceSubDomain, String deviceEventOrAction, String deviceCode, String deviceGroups, String deviceTypes, String deviceStates, String logOnExistingOpenAlarms, String increaseUrgencyWhenRaised, String decreaseUrgencyWhenCleared, String numberofEvents, String eventsPerTime, String urgency, String impact, String dueInDays, String dueInPeriod, String alarmReason, String comment ) throws InterruptedException
	{		
	    reporterLog("Starting testcase Adding Alarm rules");
	    log.info("****************************** starting test case : Verify Add Alarm creation rules *****************************************");
		addEditAlarmCreationRulePage = alarmCreationRulesPage.clickOnAddRule();
		log.info("Clicked on Add rule button");		
		waitForTime(1000);
		addEditAlarmCreationRulePage.addName();		
		waitForTime(1000);
		addEditAlarmCreationRulePage.selectRuleTemplate(templateName);
		log.info("Selected Rule template : "+ templateName + " in Alarm Creation rule page");
		waitForTime(1000);		
		addEditAlarmCreationRulePage.addEventType(raisedOrCleared, isEventTypePartsSpecified, eventType, deviceType, deviceDomain, deviceSubDomain, deviceEventOrAction, deviceCode);
		log.info("Entered Raised on event types : "+ raisedOrCleared + " details in Alarm Creation rule page");
		waitForTime(1000);		
		addEditAlarmCreationRulePage.addRemoveDeviceGroups(deviceGroups);
		log.info("Entered values of device groups : "+ deviceGroups + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.addRemoveDeviceTypes(deviceTypes);
		log.info("Entered values of device Types : "+ deviceTypes + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.addRemoveDeviceStates(deviceStates);
		log.info("Entered values of device States : "+ deviceStates + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.raiseEventShouldLogOnExistingOpenAlarms(logOnExistingOpenAlarms);
		log.info("Entered values : "+ logOnExistingOpenAlarms + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.increaseUrgencyWhenRaisedAgain(increaseUrgencyWhenRaised);
		log.info("Entered values : "+ increaseUrgencyWhenRaised + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.decreaseUrgencyWhenRaisedAgain(decreaseUrgencyWhenCleared);
		log.info("Entered values : "+ decreaseUrgencyWhenCleared + " details in Alarm Creation rule page");
		waitForTime(1000);		
		addEditAlarmCreationRulePage.createAlarmsWhenAtLeast(numberofEvents, eventsPerTime);
		log.info("Entered values for Number of Events: "+ numberofEvents + " details in Alarm Creation rule page");
		log.info("Entered values for Events Per Time: "+ eventsPerTime + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.selectAlarmReason(alarmReason);
		log.info("Entered values for Alarm Reason: "+ alarmReason + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.setUrgency(urgency);
		log.info("Entered values for Urgency field: "+ urgency + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.setImpact(impact);
		log.info("Entered values for impact field: "+ alarmReason + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.setDueDate(dueInDays,dueInPeriod);
		log.info("Entered values for due In Days: "+ dueInDays + " details in Alarm Creation rule page");
		log.info("Entered values for due In Period: "+ dueInPeriod + " details in Alarm Creation rule page");
		waitForTime(1000);
		addEditAlarmCreationRulePage.addComment(comment);
		log.info("Entered values for comment: "+ comment + " details in Alarm Creation rule page");
		waitForTime(1000);
		log.info("****************************** Ending test case : Verify Add Alarm creation rules *****************************************");
	}
	
	@Test(priority = 3, enabled = true, description ="Verify Alarms rule creation")
	public void verifyalarmrulecreation() throws InterruptedException
	{
	     reporterLog("Starting testcase Verifying the Alarm rule creation");
	     log.info("******************************Starting Test Case : Verification of Alarm rule creation Completed*****************************************");
	     alarmCreationRulesPage = addEditAlarmCreationRulePage.clickOnAddButton();
	     log.info("Clicked on the button: Add Action");	                
         String ExpectedAlarmCreationRuleMsg = "Alarm creation rule added";
         WebElement ActualAlarmCreationRuleMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_verifyAddAlarmRuleCreation")));
         SoftAssertfunction(ActualAlarmCreationRuleMsg, ExpectedAlarmCreationRuleMsg);                 
         
         log.info("******************************Ending Test Case : Verification of Alarm rule creation Completed*****************************************");
       }
	
	@Test(priority = 4, dataProvider = "dp1", enabled = true, description ="Verify Alarms rule activation")
	public void verifyalarmruleActivation(String templateName, String raisedOrCleared, String isEventTypePartsSpecified, String eventType, String deviceType, String deviceDomain, String deviceSubDomain, String deviceEventOrAction, String deviceCode, String deviceGroups, String deviceTypes, String deviceStates, String logOnExistingOpenAlarms, String increaseUrgencyWhenRaised, String decreaseUrgencyWhenCleared, String numberofEvents, String eventsPerTime, String urgency, String impact, String dueInDays, String dueInPeriod, String alarmReason, String comment ) throws InterruptedException
	{
		String alarmName = addEditAlarmCreationRulePage.alarmName;
	     reporterLog("Starting testcase Verifying the Alarm rule activation");
	     log.info("****************************** Starting Test Case : Verification of Alarm rule Activation*****************************************");
	     	
	     addEditAlarmCreationRulePage.activateAlarmCreationRules(alarmName);
		 log.info(" Verifying the Alarm rule activation ");                
         String ExpectedAlarmCreationRuleActivationMsg = "Alarm creation rule activated";
         WebElement ActualAlarmCreationRuleActivationMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtActivateAlarmCreationRuleAlert")));
         SoftAssertfunction(ActualAlarmCreationRuleActivationMsg, ExpectedAlarmCreationRuleActivationMsg);
                          
         log.info("****************************** Ending Test Case : Verification of Alarm rule Activation*****************************************");
       }
	
	@Test(priority = 5, dataProvider = "dp1", enabled = true, description ="Verify Alarms rule De-Activation")
	public void verifyalarmruledeActivation(String templateName, String raisedOrCleared, String isEventTypePartsSpecified, String eventType, String deviceType, String deviceDomain, String deviceSubDomain, String deviceEventOrAction, String deviceCode, String deviceGroups, String deviceTypes, String deviceStates, String logOnExistingOpenAlarms, String increaseUrgencyWhenRaised, String decreaseUrgencyWhenCleared, String numberofEvents, String eventsPerTime, String urgency, String impact, String dueInDays, String dueInPeriod, String alarmReason, String comment ) throws InterruptedException
	{
		String alarmName = addEditAlarmCreationRulePage.alarmName;
	     reporterLog("Staring testcase Verifying the Alarm rule deactivation");
	     waitForTime(5000);
	     log.info("****************************** Starting Test Case : Verification of Alarm rule DeActivation*****************************************");
	     log.info("****************************** Assertions for Alarm rule deactivation*********");  	
	     addEditAlarmCreationRulePage.deActivateAlarmCreationRules(alarmName);
		 log.info(" Verifying the Alarm rule deactivation ");                
         String ExpectedAlarmCreationRuleDeActivationMsg = "Alarm creation rule deactivated";
         WebElement ActualAlarmCreationRuleDeActivationMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtDeActivateAlarmRuleCreation")));
         SoftAssertfunction(ActualAlarmCreationRuleDeActivationMsg, ExpectedAlarmCreationRuleDeActivationMsg);
            
         log.info("****************************** Ending Test Case : Verification of Alarm rule DeActivation*****************************************");
       }
	
	
	@Test(priority = 6, description ="Edit Alarm Creation Rule")
	public void editalarmcreationrule() throws InterruptedException
	{	
		String alarmName = addEditAlarmCreationRulePage.alarmName;
		log.info("****************************** Starting Test Case : Edit Alarm Creation Rule**********************");
		addEditAlarmCreationRulePage.editAlarmCreationRules(alarmName);
        log.info("****************************** Ending Test Case : Edit Alarm Creation Rule*****************************************");
	}

	@Test(priority = 7, enabled = true, description ="Verify Alarms rule removal")
	public void verifyalarmruleremoval() throws InterruptedException
	{
		String alarmName = addEditAlarmCreationRulePage.alarmName;
	     reporterLog("Starting testcase Verifying the Alarm rule Removal");
	     waitForTime(5000);
	     log.info("****************************** Starting Test Case : Verification of Alarm rule Removal Completed*****************************************");
	     	
	     addEditAlarmCreationRulePage.removeAlarmCreationRules(alarmName);
		 log.info(" Verifying the Alarm rule Removal ");                
         String ExpectedAlarmCreationRuleRemovalMsg = "Alarm creation rule removed";
         WebElement ActualAlarmCreationRuleRemovalMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation")));
         SoftAssertfunction(ActualAlarmCreationRuleRemovalMsg, ExpectedAlarmCreationRuleRemovalMsg);
            
         log.info("****************************** Ending Test Case : Verification of Alarm rule Removal Completed*****************************************");
       }

}
