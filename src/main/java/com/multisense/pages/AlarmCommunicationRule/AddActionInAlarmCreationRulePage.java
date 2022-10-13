package com.multisense.pages.AlarmCommunicationRule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class AddActionInAlarmCreationRulePage extends TestBase {	
	
	//WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleUserID = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleUserID")));
	
	
	public AddActionInAlarmCreationRulePage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
			login();
	}
	
	public void whenToPerform(String when) 
	{
		WebElement eleWhen = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\""+when+"\")]//parent::div//input"));
		doClick(eleWhen);
	}
	
	public void selectAction(String action)
	{
		WebElement element = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"type\"]//parent::td//following-sibling::td//div"));
		doClick(element);
		WebElement eleAction = DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+action+"\")]"));
		doClick(eleAction);
	}
	
	public void selectWorkGroup(String workGroup)
	{
		WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleWorkGroupID = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleWorkGroupID")));
		Select selectBox = new Select(ConxoMultisense_AddActnAlarmCreationRulePage_eleWorkGroupID);
		selectBox.selectByVisibleText(workGroup);
	}
	
	public void selectUser(String user)
	{
		Select selectBox = new Select(DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"userId\"]")));
		selectBox.selectByVisibleText(user);
	}
	
	public void addComment(String comment)
	{
		if(!comment.equals("NA"))
		{
			WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleComment = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleComment")));
			WebElement commentTextArea = ConxoMultisense_AddActnAlarmCreationRulePage_eleComment;
			commentTextArea.clear();
			commentTextArea.sendKeys(comment);
		}
	}
	
	public void sendMailTo(String emailAddress)
	{
		WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleMailToField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleMailToField")));
		WebElement mailToField = ConxoMultisense_AddActnAlarmCreationRulePage_eleMailToField;
		mailToField.clear();
		mailToField.sendKeys(emailAddress);
	}
	
	public void selectWebServiceNotification(String webServiceNotification)
	{
		WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleSendNotification = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleSendNotification")));
		doClick(ConxoMultisense_AddActnAlarmCreationRulePage_eleSendNotification);
		WebElement eleWebSrvcNotification = DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+webServiceNotification+"\")]"));
		doClick(eleWebSrvcNotification);
	}
	
	public void assignAlarm(String workgroup, String user, String comment)
	{
		WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleCloseAlrm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleCloseAlrm")));
		doClick(ConxoMultisense_AddActnAlarmCreationRulePage_eleCloseAlrm);
		if(!workgroup.equalsIgnoreCase("NA"))
		{
			waitForTime(2000);
			WebElement eleWorkGroupId = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"workgroupId\"]"));
			doClick(eleWorkGroupId);
			waitForTime(2000);
			WebElement eleWorkGroup = DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+workgroup+"\")]"));
			doClick(eleWorkGroup);
		}
		
		if(!user.equalsIgnoreCase("NA"))
		{
			waitForTime(2000);
			WebElement ConxoMultisense_AddActnAlarmCreationRulePage_eleUserId = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_AddActnAlarmCreationRulePage_eleUserId")));
			doClick(ConxoMultisense_AddActnAlarmCreationRulePage_eleUserId);
			waitForTime(2000);
			WebElement eleShowAllUsers = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Show all users\")]/input"));
			doClick(eleShowAllUsers);
			waitForTime(2000);
			WebElement eleUser = DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+user+"\")]"));
			doClick(eleUser);
		}
		
		if(!comment.equalsIgnoreCase("NA"))
		{
			waitForTime(2000);
			WebElement commentTextArea = DriverUtility.getDriver().findElement(By.xpath("//textarea[@name = \"comment\"]"));
			commentTextArea.clear();
			commentTextArea.sendKeys(comment);
		}
	}
	
	public void closeAlarm(String closeStatus, String comment)
	{
		WebElement eleCloseAlarm = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Close alarm\")]//parent::td//following-sibling::td//div//input"));
		doClick(eleCloseAlarm);
		waitForTime(2000);
		WebElement eleIssueStatusId = DriverUtility.getDriver().findElement(By.xpath("//input[@ name =\"issueStatusId\"]//parent::td//following-sibling::td//div"));
		doClick(eleIssueStatusId);
		waitForTime(2000);
		WebElement eleCloseStatus = DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+closeStatus+"\")]"));
		doClick(eleCloseStatus);
		waitForTime(2000);
		if(!comment.equalsIgnoreCase("NA"))
		{
		WebElement commentTextArea = DriverUtility.getDriver().findElements(By.xpath("//textarea[@name = \"comment\"]")).get(1);
		commentTextArea.clear();
		waitForTime(2000);
		commentTextArea.sendKeys(comment);
		}
	}
		
	public AddEditAlarmCreationRulePage clickOnAddButton() 
	{
		WebElement eleBtnAdd = DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add\") and @class = \"x-btn-inner x-btn-inner-center\" ]//parent::span"));
		doClick(eleBtnAdd);
		return new AddEditAlarmCreationRulePage(true);
	}
	
	public AddEditAlarmCreationRulePage clickOnCancel()
	{
		WebElement eleBtnCancel = DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Cancel\") and @class = \"x-btn-inner x-btn-inner-center\" ]//parent::span"));
		doClick(eleBtnCancel);
		return new AddEditAlarmCreationRulePage(true);
	}
	
}
