package com.multisense.pages.CommandLimitationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class AddEditCommandLimitationRulePage extends TestBase {

	public AddEditCommandLimitationRulePage()
	{
		login();
	}
	
	public AddEditCommandLimitationRulePage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
		login();
		}
	}
	
	public void addName(String name)
	{
		WebElement nameField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"name\"]"));
		nameField.clear();
		nameField.sendKeys(name);
	}
	
	public void setDayLimit(String dayLimit)
	{
		if(dayLimit.equalsIgnoreCase("None"))
		{
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"None\")]//preceding-sibling::input")).get(0).click();
		}
		else
		{
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"Limit to\")]//preceding-sibling::input")).get(0).click();
			WebElement dayLimitField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"dayLimit\"]"));
			dayLimitField.clear();
			dayLimitField.sendKeys(dayLimit);
		}
	}
	
	public void setWeekLimit(String weekLimit)
	{
		if(weekLimit.equalsIgnoreCase("None"))
		{
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"None\")]//preceding-sibling::input")).get(1).click();
		}
		else
		{
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"Limit to\")]//preceding-sibling::input")).get(1).click();
			WebElement weekLimitField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"weekLimit\"]"));
			weekLimitField.clear();
			weekLimitField.sendKeys(weekLimit);
		}
	}
	
	public void setMonthLimit(String monthLimit)
	{
		if(monthLimit.equalsIgnoreCase("None"))
		{
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"None\")]//preceding-sibling::input")).get(2).click();
		}
		else
		{
			DriverUtility.getDriver().findElements(By.xpath("//label[contains(text(),\"Limit to\")]//preceding-sibling::input")).get(2).click();
			WebElement monthLimitField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"monthLimit\"]"));
			monthLimitField.clear();
			monthLimitField.sendKeys(monthLimit);
		}
	}
	
	public AddCommandsInCommandLimitationRulePage clickOnAddCommands()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add commands\")]//parent::span")).click();
		return new AddCommandsInCommandLimitationRulePage();
	}
	
	public void removeCommands(String commands)
	{
		if(!commands.equalsIgnoreCase("NA"))
		{
			String[] commandArray = commands.split(", ");
			for(int count =0; count< commandArray.length;count++)
			{
			DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+commandArray[count]+"\")]//parent::td//following-sibling::td//div//span")).click();
			waitForTime(500);
			}
		}
	}
}
