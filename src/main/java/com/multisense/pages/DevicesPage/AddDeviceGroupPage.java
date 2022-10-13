package com.multisense.pages.DevicesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class AddDeviceGroupPage extends TestBase {

	public AddDeviceGroupPage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
			login();
	}
	
	public void addName(String name)
	{
		WebElement nameField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"name\"]"));
		nameField.clear();
		nameField.sendKeys(name);
	}
	
	public void selectType(String type)
	{
		DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\""+type+"\")]//parent::div//input")).click();
	}
	
	public void clickOnNextButton() {
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Next\")]//parent::span")).click();
	}
	
	public DeviceGroupsPage clickOnCancel() {
		DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),\"Cancel\")]//parent::span")).get(2).click();
		return new DeviceGroupsPage(true);
	}
	
	public void clickOnBackButton() {
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Back\")]//parent::span")).click();
	}
	
	public void setNameInCriteria(String option, String name)
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Name\")]//parent::span")).click();
		DriverUtility.getDriver().findElements(By.xpath("//input[@role = \"combobox\"]")).get(1).click();
		if(option.equals("="))
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\"=\")]")).click();
		else if(option.equals("IN"))
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\"IN\")]")).click();
		else DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\"≠\")]")).click();
		WebElement nameField = DriverUtility.getDriver().findElement(By.xpath("//input[@class = \"x-form-field x-form-text\"]"));
		nameField.clear();
		nameField.sendKeys(name);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Name\")]//parent::span")).click();
	}
	
	public void setSerialNumberInCriteria(String option, String serialNumber)
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Serial number\")]//parent::span")).click();
		DriverUtility.getDriver().findElements(By.xpath("//input[@role = \"combobox\"]")).get(3).click();
		if(option.equals("="))
			DriverUtility.getDriver().findElements(By.xpath("//li[contains(text(),\"=\")]")).get(1).click();
		else if(option.equals("IN"))
			DriverUtility.getDriver().findElements(By.xpath("//li[contains(text(),\"IN\")]")).get(1).click();
		else DriverUtility.getDriver().findElements(By.xpath("//li[contains(text(),\"≠\")]")).get(1).click();
		WebElement serialNumberField = DriverUtility.getDriver().findElements(By.xpath("//input[@class = \"x-form-field x-form-text\"]")).get(1);
		serialNumberField.clear();
		serialNumberField.sendKeys(serialNumber);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Serial number\")]//parent::span")).click();
	}
	
	public void selectDeviceGroupsInCriteria(String deviceGroups)
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Device group\")]//parent::span")).click();	
		String[] deviceGroupArray = deviceGroups.split(", ");
		for(int count =0; count<deviceGroupArray.length; count++)
		{
			DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+deviceGroupArray[count]+"\")]//parent::td//preceding-sibling::td//div//div")).click();
			waitForTime(500);
		}
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Device group\")]//parent::span")).click();
	}
	
	public void selectLocationInCriteria(String location)
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Location\")]//parent::span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+location+"\")]")).click();
	}
	
//	public void addCriteria(String criterias, String subCriterias)
//	{
//		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add criteria\")]//parent::span")).click();
//		String criteriaArray[] = criterias.split(", ");
//		String subCriteriaArray[] = subCriterias.split(", ");
//		for(int count = 0; count < criteriaArray.length; count++)
//		{
//		if(!criteriaArray[count].equalsIgnoreCase("NA"))
//		{
//			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\""+criteriaArray[count]+"\")]//parent::a//parent::div")).click();
//		}
//		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\""+subCriteriaArray[count]+"\")]//following-sibling::div")).click();
//		}
//	}
	
	public void clickOnPreviewButton() 
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Preview\")]//parent::span")).click();
	}
	
	public void clickOnClearAll()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Clear all\")]//parent::span")).click();
	}
	
	public void clickOnConfirmButton()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Confirm\")]//parent::span")).click();
	}
	
	public DeviceGroupsPage clickOnFinishButton()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Finish\")]//parent::span")).click();
		return new DeviceGroupsPage(true);
	}
	public void selectDevices(String nameOption, String name, String serialNumberOption, String serialNumber, String deviceGroups, String location)
	{
		if(!name.equalsIgnoreCase("NA"))
		{
			setNameInCriteria(nameOption, name);
			waitForTime(500);
		}
		
		if(!serialNumber.equalsIgnoreCase("NA"))
		{
			setSerialNumberInCriteria(serialNumberOption, serialNumber);
			waitForTime(500);
		}
		
		if(!deviceGroups.equalsIgnoreCase("NA"))
		{
			selectDeviceGroupsInCriteria(deviceGroups);
			waitForTime(500);
		}
		
		if(!location.equalsIgnoreCase("NA"))
		{
			selectLocationInCriteria(location);
			waitForTime(500);
		}
		
		clickOnPreviewButton();
		waitForTime(30000);
	}
	
	public void selectDevicesInTable(String selectCriterias)
	{
		DriverUtility.getDriver().findElement(By.xpath("//b[contains(text(),\"Selected devices\")]//parent::label//preceding-sibling::input")).click();
		waitForTime(500);
		String[] selectCriteriaArray = selectCriterias.split(", ");
		for(int count = 0; count < selectCriteriaArray.length; count++)
		{
		if(!selectCriteriaArray[count].equalsIgnoreCase("NA"))
		{
			DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),\""+selectCriteriaArray[count]+"\")]//parent::div//parent::td//preceding-sibling::td//div//div")).click();
			waitForTime(500);
		}
		}
	}
	
	public void selectAllDevicesInStaticDeviceGroup()
	{
		DriverUtility.getDriver().findElement(By.xpath("//b[contains(text(),\"Selected devices\")]//parent::label//preceding-sibling::input")).click();
		waitForTime(500);
	}
}
