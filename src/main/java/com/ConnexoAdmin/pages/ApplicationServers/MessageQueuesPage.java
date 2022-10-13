package com.ConnexoAdmin.pages.ApplicationServers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MessageQueuesPage extends TestBase {
	
	//String MessageQueuesNameValue= generateRandomName(8); 
	String MessageQueuesNameValue= "SAMPLEMONITOR";		
	
	public MessageQueuesPage()  {
		login();
        PageFactory.initElements(DriverUtility.getDriver(), this);
        Admin();
		waitForTime(5000);
	}
	
	public void clickMessagequeues()
	{	
		WebElement connexoAdmin_MessageQueues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_MessageQueues")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_MessageQueues, 10);
		doClick(connexoAdmin_MessageQueues);
 	}
	
	public void clickonAddMessageQueue()
	{
		waitForTime(3000);
		WebElement connexoAdmin_AddMessageQueuelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_AddMessageQueuelink")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_AddMessageQueuelink, 10);
		doClick(connexoAdmin_AddMessageQueuelink);
	}
	public void clickonRemoveMessageQueue()
	{
		waitForTime(3000);
		WebElement connexoAdmin_RemoveMessageQueues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_RemoveMessageQueues")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_RemoveMessageQueues, 10);
		doClick(connexoAdmin_RemoveMessageQueues);
	}
	public void CreateMessageQueues(String TypeValue)
	{
		waitForTime(3000);
		WebElement connexoAdmin_AddMessageQueueName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_AddMessageQueueName")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_AddMessageQueueName, 10);
		doClear(connexoAdmin_AddMessageQueueName);
		sendkeys(MessageQueuesNameValue, connexoAdmin_AddMessageQueueName);
		WebElement connexoAdmin_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_TypeDropDown, 10);
		doClick(connexoAdmin_TypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ TypeValue +"']")).click();
		waitForTime(2000);
		WebElement connexoAdmin_AddMessageQueueButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_AddMessageQueueButton")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_AddMessageQueueButton, 10);
		doClick(connexoAdmin_AddMessageQueueButton);
	}
	public void RemoveMessageQueues()
	{
		waitForTime(3000);
		WebElement connexoAdmin_OverviewLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_OverviewLink")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_OverviewLink, 10);
		doClick(connexoAdmin_OverviewLink);		
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ MessageQueuesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'"+MessageQueuesNameValue+"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	} 
	public void clickOnMonitorMessageQueue()
	{
		waitForTime(3000);
		WebElement connexoAdmin_MonitorLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_MonitorLink")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_MonitorLink, 10);
		doClick(connexoAdmin_MonitorLink);
	}
	
	public void clickOnClearErrorMessageQueue()
	{
		waitForTime(3000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ MessageQueuesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(1000);
		WebElement connexoAdmin_ClearErrorMessageQueue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ClearErrorMessageQueue")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_ClearErrorMessageQueue, 10);
		doClick(connexoAdmin_ClearErrorMessageQueue);
	}	

	public String getErrorMessageDisplayedForNameInputField()
	{	
		WebElement error = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_errorMessageForNameInputField")));
		return error.getText();
 	}
	
	public String getErrorMessageDisplayedForTypeDropdown()
	{	
		WebElement error = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_errorMessageForNameTypeDropdown")));
		return error.getText();
 	}
	
	public boolean isAddMessageQueueButtonDisplayed()
	{	
		WebElement AddMessageQueueButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_AddMessageQueuelink")));
		return AddMessageQueueButton.isDisplayed();
 	}
	
	public boolean isSaveSettingsEnabled()
	{	
		WebElement SaveSettingsButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_SaveSettingsButton")));
		return SaveSettingsButton.isEnabled();
 	}
	
	public void clickSaveSettingsButton()
	{
		WebElement SaveSettingsButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_SaveSettingsButton")));
		TestUtil.waitforElementTobeLocated(SaveSettingsButton, 10);
		doClick(SaveSettingsButton);
	}
	
	public boolean isUndoEnabled()
	{	
		WebElement SaveSettingsButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_UndoButton")));
		return SaveSettingsButton.isEnabled();
 	}
	
	public void clickUndoButton()
	{
		WebElement UndoButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_UndoButton")));
		TestUtil.waitforElementTobeLocated(UndoButton, 10);
		doClick(UndoButton);
	}
	
	public void AddMessageQueueNameInput(String name)
	{
		waitForTime(1000);
		WebElement connexoAdmin_AddMessageQueueName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_AddMessageQueueName")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_AddMessageQueueName, 10);
		doClear(connexoAdmin_AddMessageQueueName);
		sendkeys(name, connexoAdmin_AddMessageQueueName);
	}
	
	public void clickTypeOptions(String TypeValue)
	{
		waitForTime(1000);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ TypeValue +"']")).click();
	}
	
	public boolean isCreatedMessageQueueDisplayed(String QueueName)
	{
		waitForTime(1000);
		WebElement MessageQueueValue = DriverUtility.getDriver().findElement(By.xpath("//td[2]//div[contains(text(), '"+ QueueName +"')]"));
		scrolldown(MessageQueueValue);
		return MessageQueueValue.isDisplayed();
	}
	
	public void updateRetriesValueInTableResults(String retriesCount)
	{
		waitForTime(3000);
		WebElement retriesValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_retriesValuesInTable")));
		doClick(retriesValue);
		WebElement retriesInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_retriesInputFieldInTable")));
		TestUtil.waitforElementTobeLocated(retriesInput, 10);
		doClear(retriesInput);
		sendkeys(retriesCount, retriesInput);
		sendEnterKey();
//		retriesInput.sendKeys(Keys.ENTER);
	}
	
	public String getRetriesValueFromTableResult()
	{	
		WebElement input = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_retriesValuesInTable")));
		return input.getText();
 	}
	
	public void updateTimeBeforeRetryValueInTableResults(String retriesCount)
	{
		waitForTime(3000);
		WebElement retriesValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_TimeBeforeRetryValueInTable")));
		doClick(retriesValue);
		WebElement retriesInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_TimeBeforeRetryValueInputInTable")));
		TestUtil.waitforElementTobeLocated(retriesInput, 10);
		doClear(retriesInput);
		sendkeys(retriesCount, retriesInput);
		retriesInput.sendKeys(Keys.ENTER);
	}
	
	public String getTimeBeforeRetryValueFromTableResult()
	{	
		WebElement input = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_TimeBeforeRetryValueInTable")));
		return input.getText();
 	}
	
	public void clickTypeDropdown()
	{
		waitForTime(2000);
		WebElement connexoAdmin_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_TypeDropDown, 10);
		doClick(connexoAdmin_TypeDropDown);
	}
	
	public void clickAddButton()
	{
		waitForTime(2000);
		WebElement connexoAdmin_AddMessageQueueButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_AddMessageQueueButton")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_AddMessageQueueButton, 10);
		doClick(connexoAdmin_AddMessageQueueButton);
	}
	
	public void clickCancelButton()
	{
		waitForTime(2000);
		WebElement connexoAdmin_AddMessageQueueButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_CancelMessageQueueButton")));
		TestUtil.waitforElementTobeLocated(connexoAdmin_AddMessageQueueButton, 10);
		doClick(connexoAdmin_AddMessageQueueButton);
	}
	
	public void RemoveMessageQueue(String MessageQueue)
	{	
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ MessageQueue +"']//ancestor::td//following-sibling::td//span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'"+MessageQueue+"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
}
