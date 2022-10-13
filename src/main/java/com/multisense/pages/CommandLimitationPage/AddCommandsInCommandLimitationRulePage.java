package com.multisense.pages.CommandLimitationPage;

import org.openqa.selenium.By;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class AddCommandsInCommandLimitationRulePage extends TestBase {

	public AddCommandsInCommandLimitationRulePage()
	{
		login();
	}
	
	public AddCommandsInCommandLimitationRulePage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
		{
		login();
		}
	}
	
	public void applyCategoryFilter(String categoreies)
	{
		if(!categoreies.equalsIgnoreCase("NA"))
		{
			DriverUtility.getDriver().findElement(By.xpath("//input[@placeholder = \"Category\"]//parent::td//following-sibling::td//div")).click();
			waitForTime(500);
			String[] categoryArray = categoreies.split(", ");
			for(int count =0; count< categoryArray.length;count++)
			{
				DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+categoryArray[count]+"\")]//img")).click();
				waitForTime(500);
			}
			DriverUtility.getDriver().findElement(By.xpath("//input[@placeholder = \"Category\"]//parent::td//following-sibling::td//div")).click();
			waitForTime(500);
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Apply\")]//parent::span")).click();
			waitForTime(2000);
		}
	}
	
	public void checkAllCommands()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Check all\")]//parent::span")).click();
	}
	
	public void uncheckAllCommands()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Uncheck all\")]//parent::span")).click();
	}
	
	public void checkCommands(String commandNames)
	{
		String[] commandNameArray = commandNames.split(", ");
		for(int count =0; count< commandNameArray.length; count++)
		{
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+commandNameArray[count]+"\")]//parent::td//preceding-sibling::td[2]//div//div")).click();
		waitForTime(500);
		}
	}
	
	public AddEditCommandLimitationRulePage clickOnAddButton()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add\") and @class = \"x-btn-inner x-btn-inner-center\"]//parent::span")).click();
		return new AddEditCommandLimitationRulePage(true);
	}
	
	public AddEditCommandLimitationRulePage clickOnCancel()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Cancel\") and @class = \"x-btn-inner x-btn-inner-center\"]//parent::span")).click();
		return new AddEditCommandLimitationRulePage(true);
	}
	public void clickOnApply()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Apply\")]//parent::span")).click();
	}
	
	public void clickOnClearAll()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Clear all\")]//parent::span")).click();
	}
}
