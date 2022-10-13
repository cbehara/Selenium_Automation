package com.multisense.pages.AlarmCommunicationRule;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class AddEditAlarmCreationRulePage extends TestBase {

	//WebElement ConxoMultisense_AddEditAlarmCreationRulePage_eleAddClrearedOnEventTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_eleAddClrearedOnEventTypes")));
	public String alarmName = generateRandomName(6);
	
	public AddEditAlarmCreationRulePage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
			login();
	}
	
	public void addName()
	{
		if(!alarmName.equalsIgnoreCase("NA"))
		{	
			waitForTime(3000);			
			WebElement ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField, 30);		
			highlightelement(ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField);
			ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField.clear();
			ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField.sendKeys(alarmName);
			ConxoMultisense_AddEditAlarmCreationRulePage_eleNameField.sendKeys(Keys.ENTER);
			waitForTime(500);
		}
	}
	
	public void selectRuleTemplate(String templateName)
	{
		if(!templateName.equalsIgnoreCase("NA"))
		{
			WebElement ConxoMultisense_AddEditAlarmCreationRulePage_templateNameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_templateNameField")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_templateNameField, 10);		
			doClick(ConxoMultisense_AddEditAlarmCreationRulePage_templateNameField);
			WebElement selectTemplateField = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),\""+templateName+"\")]")));
			doClick(selectTemplateField);
			waitForTime(500);
		}
	}
	
	public void clickOnAddRaisedOnEventTypes()
	{	
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_eleAddEventTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_eleAddEventTypes")));
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_eleAddEventTypes);
		waitForTime(500);
	}
	
	public void clickOnAddClearedOnEventTypes()
	{
		WebElement eleAddClrearedOnEventTypes = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add event types\")]//parent::span")).get(1);
		doClick(eleAddClrearedOnEventTypes);
		waitForTime(500);
	}
	
	public void addRemoveDeviceGroups(String deviceGroups)
	{
		if(!deviceGroups.equals("NA"))
		{
			WebElement eleDeviceInGroup = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"properties.BasicDeviceAlarmRuleTemplate.deviceInGroup\"]//parent::td//following-sibling::td//div"));
			doClick(eleDeviceInGroup);	
			waitForTime(500);
			String[] deviceGroupArray = deviceGroups.split(", ");
			for(int count =0; count<deviceGroupArray.length;count++)
			{
				DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+deviceGroupArray[count]+"\")]//img")).click();
			}
			doClick(eleDeviceInGroup);
			waitForTime(500);
		}
	}
	
	public void addRemoveDeviceTypes(String deviceTypes)
	{
		if(!deviceTypes.equals("NA"))
		{
			WebElement  eleDeviceTypes = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"deviceType\"]"));			
			doClick(eleDeviceTypes);
			waitForTime(500);
			String[] deviceTypeArray = deviceTypes.split(", ");
			for(int count =0; count<deviceTypeArray.length;count++)
			{
				DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+deviceTypeArray[count]+"\")]//img")).click();
				
			}				
			eleDeviceTypes.sendKeys(Keys.ENTER);
			waitForTime(500);
		}
	}
	
	public void addRemoveDeviceStates(String deviceStates)
	{
		if(!deviceStates.equals("NA"))
		{
			WebElement  element = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"properties.BasicDeviceAlarmRuleTemplate.deviceLifecyleInDeviceTypes\"]"));
			doClick(element);
			String[] deviceStateArray = deviceStates.split(", ");
			for(int count =0; count<deviceStateArray.length; count++)
			{
				DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+deviceStateArray[count]+"\")]//img")).click();
				
			}
			element.sendKeys(Keys.ENTER);
			waitForTime(500);
			JavascriptExecutor js = (JavascriptExecutor)DriverUtility.getDriver();
			js.executeScript("window.scrollBy(0,250)", "");
		}
	}
	
	public void raiseEventShouldLogOnExistingOpenAlarms(String logOnExistingOpenAlarms)
	{
		WebElement  element;
		if(logOnExistingOpenAlarms.equalsIgnoreCase("yes"))
		{
			element = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Log on existing open alarms\")]//parent::div//input"));
			doClick(element);
			waitForTime(500);
		}
		else if(logOnExistingOpenAlarms.equalsIgnoreCase("No"))
		{
			element = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Create new alarms\")]//parent::div//input"));
			doClick(element);
			waitForTime(500);
		}
	}
	
	public void increaseUrgencyWhenRaisedAgain( String increaseUrgency)
	{
		if(increaseUrgency.equalsIgnoreCase("yes"))
		{
			WebElement eleIncreaseUrgency = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Increase urgency\")]//parent::div//input"));
			doClick(eleIncreaseUrgency);
			waitForTime(500);
		}
	}
	
	public void decreaseUrgencyWhenRaisedAgain( String decreaseUrgency)
	{
		if(decreaseUrgency.equalsIgnoreCase("yes"))
		{
			WebElement eleDecreaseUrgency = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Decrease urgency\")]//parent::div//input"));
			doClick(eleDecreaseUrgency);
			waitForTime(500);
		}
	}
	
	public void createAlarmsWhenAtLeast(String numberOfEvents, String timeForEvents)
	{
		if(!numberOfEvents.equalsIgnoreCase("NA"))
		{		
		WebElement eventsCount = DriverUtility.getDriver().findElement(By.xpath("//input[@name='countEvents']"));		
		doClick(eventsCount);
		waitForTime(500);
		eventsCount.sendKeys(numberOfEvents);
		waitForTime(500);
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		doClick(eventsCount);	
		waitForTime(500);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		if(!timeForEvents.equalsIgnoreCase("NA"))
		{
		WebElement element = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"event(s) per\")]//parent::td//following-sibling::td//table//tbody//tr//td[2]//div"));
		doClick(element);
		waitForTime(500);
		WebElement durationField = new WebDriverWait(DriverUtility.getDriver(),Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),\""+timeForEvents+"\")]")));		
		doClick(durationField);	
		waitForTime(500);
		}
	}
	
	public void selectAlarmReason(String alarmReason)
	{
		if(!alarmReason.equalsIgnoreCase("NA"))
		{
		WebElement elealarmReason = DriverUtility.getDriver().findElement(By.xpath("//input[@name='reason']"));	
		highlightelement(elealarmReason);
		elealarmReason.clear();
		waitForTime(500);
		elealarmReason.sendKeys(alarmReason);
		waitForTime(500);
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		doClick(elealarmReason);		
		waitForTime(500);
		JavascriptExecutor js = (JavascriptExecutor)DriverUtility.getDriver();
		js.executeScript("window.scrollBy(0,350)", "");
		}
	}
	
	public void setUrgency(String urgency)
	{
		if(!urgency.equalsIgnoreCase("NA"))
		{
		waitForTime(500);
		WebElement urgencyField = DriverUtility.getDriver().findElement(By.xpath("//input[@name =\"priority.urgency\"]"));
		highlightelement(urgencyField);
		urgencyField.clear();
		urgencyField.sendKeys(urgency);
		}
	}
	
	public void setImpact(String impact)
	{
		if(!impact.equalsIgnoreCase("NA"))
		{
		WebElement impactField = DriverUtility.getDriver().findElement(By.xpath("//input[@name =\"priority.impact\"]"));
		highlightelement(impactField);
		impactField.clear();
		impactField.sendKeys(impact);
		}
	}
	
	public void setDueDate(String number, String period)
	{
		if(!number.equalsIgnoreCase("NA"))
		{			
		DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Due in\")]//parent::div//input")).click();
		WebElement dueInNumberField = DriverUtility.getDriver().findElement(By.xpath("//input[@name =\"dueIn.number\"]"));
		highlightelement(dueInNumberField);
		dueInNumberField.clear();
		waitForTime(500);
		dueInNumberField.sendKeys(number);
		waitForTime(500);		
		dueInNumberField.sendKeys(Keys.ENTER);
		waitForTime(500);
		}
		if(!period.equalsIgnoreCase("NA"))
		{
		WebElement eleDueInType = DriverUtility.getDriver().findElement(By.xpath("//*[@name='dueIn.type']"));
		eleDueInType.click();
		waitForTime(500);
		WebElement element =DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+period+"\")]"));		
		element.click();	
		waitForTime(500);
		}
	}
	
	public void addComment(String comment)
	{
		if(!comment.equals("NA"))
		{		
		WebElement textArea = DriverUtility.getDriver().findElement(By.xpath("//textarea[@name='comment']"));
		scrolldown(textArea);
		highlightelement(textArea);
		textArea.clear();
		textArea.sendKeys(comment);
		}
	}
	
	public AddActionInAlarmCreationRulePage clickOnAddActionBtn()
	{
		WebElement element = DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add action\")]//parent::span"));
		doClick(element);
		return new AddActionInAlarmCreationRulePage(true);
	}
	
	public void addEventType(String raisedOrCleared, String isEventTypePartsSpecified, String eventType, String deviceType, String deviceDomain, String deviceSubDomain, String deviceEventOrAction, String deviceCode )
	{
		String[] raisedOrClearedArray = raisedOrCleared.split(", ");
		String[] isEventTypePartsSpecifiedArray = isEventTypePartsSpecified.split(", ");
		String[] eventTypeArray = eventType.split(", ");
		String[] deviceTypeArray = deviceType.split(", ");
		String[] deviceDomainArray = deviceDomain.split(", ");
		String[] deviceSubDomainArray = deviceSubDomain.split(", ");
		String[] deviceEventOrActionArray = deviceEventOrAction.split(", ");
		String[] deviceCodeArray = deviceCode.split(", ");
		
		
		for(int count = 0; count < raisedOrClearedArray.length; count++)
		{
		if(raisedOrClearedArray[count].equalsIgnoreCase("raised"))
		{
			WebElement element = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add event types\")]//parent::span")).get(0);
			doClick(element);
			waitForTime(500);
		}
		else
		{
			WebElement element = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add event types\")]//parent::span")).get(2);
			doClick(element);
			waitForTime(500);
		}
		
		if(isEventTypePartsSpecifiedArray[count].equalsIgnoreCase("No"))
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Specify event type\")]//parent::label//parent::div//input"));
			doClick(element);
			waitForTime(500);
			WebElement eventTypeField = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Event type\")]//parent::td//following-sibling::td//input"));
			eventTypeField.clear();
			eventTypeField.sendKeys(eventTypeArray[count]);
			
			if(!deviceCodeArray[count].equals("NA"))
			{
				WebElement deviceCodeField = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Device code\")]//parent::td//following-sibling::td//input"));
				deviceCodeField.clear();
				deviceCodeField.sendKeys(deviceCodeArray[count]);
			}
		}
		else
		{
			DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Specify event type parts\")]//parent::div//input")).click();
			
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"Device type\")]//parent::td//following-sibling::td//input")).get(1).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+deviceTypeArray[count]+"\")]")).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Device domain\")]//parent::td//following-sibling::td//input")).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+deviceDomainArray[count]+"\")]")).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Device subdomain\")]//parent::td//following-sibling::td//input")).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+deviceSubDomainArray[count]+"\")]")).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Device event or action\")]//parent::td//following-sibling::td//input")).click();
			
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+deviceEventOrActionArray[count]+"\")]")).click();
			
			if(!deviceCodeArray[count].equals("NA"))
			{
				WebElement deviceCodeField = DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"Device code\")]//parent::td//following-sibling::td//input")).get(1);
				deviceCodeField.clear();
				deviceCodeField.sendKeys(deviceCodeArray[count]);
			}
		}
		
		DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add\") and @class = \"x-btn-inner x-btn-inner-center\"]//parent::span")).get(8).click();
		}
	}
	
	public void clickAddButtonOnAddWindow()
	{
		WebElement element = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Add\") and @class = \"x-btn-inner x-btn-inner-center\"]")).get(4);
		doClick(element);
		waitForTime(500);
		//DriverUtility.getDriver().findElements(By.xpath("//a[contains(@class,'x-btn x-unselectable x-btn-action-small x-noicon x-btn-noicon x-btn-action-small-noicon x-over x-btn-over x-btn-action-small-over')]//span[contains(@role,'presentation')]//span[contains(@role,'presentation')]//span[contains(@role,'presentation')]")).click();
}
	
	public void clickCancelButtonOnAddWindow()
	{
		WebElement element = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Cancel\")]")).get(1);
		doClick(element);
		waitForTime(500);
	}
	
	public String gettextofAlarmCreationRule()
	{
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_verifyAddAlarmRuleCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_verifyAddAlarmRuleCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_verifyAddAlarmRuleCreation, 10);
		return getText(ConxoMultisense_AddEditAlarmCreationRulePage_verifyAddAlarmRuleCreation);
	}	
	
	public void removeEventTypes(String eventTypes)
	{
		String[] eventTypeArray = eventTypes.split(", ");
		for(int count = 0; count <eventTypeArray.length; count++)
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\""+eventTypeArray[count]+"\")]//parent::div//parent::td//following-sibling::td//div//span"));
			doClick(element);
			waitForTime(500);
		}
	}
	
	public AlarmCreationRulesPage clickOnSaveButton()
	{			
		WebElement element = DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Save\")]//parent::span")).get(7);
		Actions actions = new Actions(DriverUtility.getDriver());
		actions.moveToElement(element);
		actions.perform();
		doClick(element);
		waitForTime(500);
		return null;
	}
	
	public void activateAlarmCreationRules(String strName)
	{
		waitForTime(5000);		
		//WebElement eleRowName = DriverUtility.getDriver().findElement(By.xpath("//*[normalize-space()='"+strName+"']"));
		WebElement eleActivatelarmRule = DriverUtility.getDriver().findElement(By.xpath("//div[text()= \""+ strName +"\"]//ancestor::td//following::td[3]/div/span"));
		TestUtil.waitforElementTobeLocated(eleActivatelarmRule, 10);
		eleActivatelarmRule.click();
		waitForTime(2000);
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_activateAlarmCreationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_activateAlarmCreationRule")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_activateAlarmCreationRule, 10);
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_activateAlarmCreationRule);	
		waitForTime(500);
	}
	
	public String gettextofActivateAlarmCreationRuleAlert()
	{
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_txtActivateAlarmCreationRuleAlert = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtActivateAlarmCreationRuleAlert")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_txtActivateAlarmCreationRuleAlert, 10);
		return getText(ConxoMultisense_AddEditAlarmCreationRulePage_txtActivateAlarmCreationRuleAlert);
	}
	
	public void deActivateAlarmCreationRules(String strName)
	{
		waitForTime(5000);
		//WebElement eleRowName = DriverUtility.getDriver().findElement(By.xpath("//*[normalize-space()='"+strName+"']"));
		WebElement eledeActivatelarmRule = DriverUtility.getDriver().findElement(By.xpath("//div[text()= \""+ strName +"\"]//ancestor::td//following::td[3]/div/span"));
		TestUtil.waitforElementTobeLocated(eledeActivatelarmRule, 10);
		eledeActivatelarmRule.click();	
		waitForTime(2000);
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_deActivateAlarmCreationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_deActivateAlarmCreationRule")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_deActivateAlarmCreationRule, 10);
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_deActivateAlarmCreationRule);	
		waitForTime(500);
	}
	
	public String gettextofDeactivateAlarmCreationRuleAlert()
	{
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_txtDeActivateAlarmRuleCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtDeActivateAlarmRuleCreation")));
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation, 10);
		return getText(ConxoMultisense_AddEditAlarmCreationRulePage_txtDeActivateAlarmRuleCreation);
	}
	
	public void editActivateAlarmCreationRules(String strName)
	{
		waitForTime(3000);
		//WebElement eleRowName = DriverUtility.getDriver().findElement(By.xpath("//*[normalize-space()='"+strName+"']"));
		WebElement eleEditAlarmAction = DriverUtility.getDriver().findElement(By.xpath("//div[text()= \""+ strName +"\"]//ancestor::td//following::td[3]/div/span"));
		TestUtil.waitforElementTobeLocated(eleEditAlarmAction, 10);
		eleEditAlarmAction.click();
		waitForTime(1000);
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule, 10);
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule);
		waitForTime(2000);
	}
	
	public String gettextofEditAlarmCreationRuleAlert()
	{
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_txtEditAlarmRuleCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtEditAlarmRuleCreation")));
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation, 10);
		return getText(ConxoMultisense_AddEditAlarmCreationRulePage_txtEditAlarmRuleCreation);
	}
		
	public void removeAlarmCreationRules(String strName)
	{
		//WebElement eleRowName = DriverUtility.getDriver().findElement(By.xpath("//*[normalize-space()='"+strName+"']"));
		WebElement eleRemovelarmRule = DriverUtility.getDriver().findElement(By.xpath("//div[text()= \""+ strName +"\"]//ancestor::td//following::td[3]/div/span"));
		TestUtil.waitforElementTobeLocated(eleRemovelarmRule, 10);
		eleRemovelarmRule.click();
		//DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ strName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_removeAlarmCreationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_removeAlarmCreationRule")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_removeAlarmCreationRule, 10);
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_removeAlarmCreationRule);
		WebElement eleConfirmRemove = DriverUtility.getDriver().findElement(By.xpath("//span[@class='x-btn-button'][normalize-space()='Remove']"));
		waitForTime(3000);
		TestUtil.waitforElementTobeLocated(eleConfirmRemove, 30);
		doClick(eleConfirmRemove);
		waitForTime(500);
	}
	
	public String gettextofRemoveAlarmCreationRuleAlert()
	{
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation, 10);
		return getText(ConxoMultisense_AddEditAlarmCreationRulePage_txtRemoveAlarmRuleCreation);
	}

	public AlarmCreationRulesPage clickOnAddButton() {		
		WebElement element = DriverUtility.getDriver().findElement(By.xpath("//a[@class='x-btn x-unselectable x-btn-action-small x-noicon x-btn-noicon x-btn-action-small-noicon']//span[@role='presentation']//span[@role='presentation']//span[@role='presentation']"));
		doClick(element);		
		return null;
	}
	
	public void editAlarmCreationRules(String strName)
	{
		WebElement eleRemovelarmRule = DriverUtility.getDriver().findElement(By.xpath("//div[text()= \""+ strName +"\"]//ancestor::td//following::td[3]/div/span"));
		TestUtil.waitforElementTobeLocated(eleRemovelarmRule, 10);
		doClick(eleRemovelarmRule);
		waitForTime(3000);
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule, 10);
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_editAlarmCreationRule);
		WebElement ConxoMultisense_AddEditAlarmCreationRulePage_saveAlarmCreationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddEditAlarmCreationRulePage_saveAlarmCreationRule")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_AddEditAlarmCreationRulePage_saveAlarmCreationRule, 10);
		doClick(ConxoMultisense_AddEditAlarmCreationRulePage_saveAlarmCreationRule);
	}
}
