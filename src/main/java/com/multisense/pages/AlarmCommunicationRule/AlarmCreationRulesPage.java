package com.multisense.pages.AlarmCommunicationRule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class AlarmCreationRulesPage extends TestBase {	
	
	
	public static WebElement verifyalarmruleadded;
	
	public AlarmCreationRulesPage() 
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);		
	}
	
	public AlarmCreationRulesPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
			login();
	}	
	
	public void navigatetoAlarmCreationruleName()
	{
		Multisense();
        waitForTime(1000);  
        Administration();
        waitForTime(1000); 
        WebElement ConxoMultisense_AlarmCreationRulePage_alarmcreationrules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AlarmCreationRulePage_alarmcreationrules")));
        TestUtil.waitforElementTobeLocated(ConxoMultisense_AlarmCreationRulePage_alarmcreationrules, 10);
        doClick(ConxoMultisense_AlarmCreationRulePage_alarmcreationrules);
		WebElement ConxoMultisense_AlarmCreationRulePage_eleAlarmCreationRulePageName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AlarmCreationRulePage_eleAlarmCreationRulePageName")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AlarmCreationRulePage_eleAlarmCreationRulePageName, 10);				
	}
	
	public AddEditAlarmCreationRulePage clickOnAddRule()
	{
		WebElement ConxoMultisense_AlarmCreationRulePage_AddAlarmRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AlarmCreationRulePage_AddAlarmRules")));
		waitForTime(2000);
		if (ConxoMultisense_AlarmCreationRulePage_AddAlarmRules.isDisplayed()) {
			TestUtil.waitforElementTobeLocated(ConxoMultisense_AlarmCreationRulePage_AddAlarmRules, 30);
			doClick(ConxoMultisense_AlarmCreationRulePage_AddAlarmRules);
			waitForTime(500);			
		}
		else {
			WebElement ConxoMultisense_AlarmCreationRulePage_AddAlarmRulesAction = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add rule\")]//parent::span")).get(2);
			TestUtil.waitforElementTobeLocated(ConxoMultisense_AlarmCreationRulePage_AddAlarmRulesAction, 30);
			doClick(ConxoMultisense_AlarmCreationRulePage_AddAlarmRulesAction);
			waitForTime(500);
			
		}
		return new AddEditAlarmCreationRulePage(true);
	}
	
	public void exportAlarmCreationRules()
	{
		//WebElement EleexportAlarmCreationRules = DriverUtility.getDriver().findElement(By.xpath("//span[@class = \"x-btn-icon-el icon-file-download \"]"));
		WebElement ConxoMultisense_AlarmCreationRulePage_Export = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AlarmCreationRulePage_Export")));
		doClick(ConxoMultisense_AlarmCreationRulePage_Export);
	}	
		
	public static void clickAlarmcreationrules() {
		
		
	}	

}
