package com.multisense.pages.DevicesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class AddDevicePage extends TestBase {

	public AddDevicePage() {
		login();
	}
	
	public AddDevicePage(boolean isLoggedIn)
	{
		if(!isLoggedIn)
			login();
	}
	
	public boolean isAddDeviceLogoPresent() {
		return DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add device\")]")).isDisplayed();
	}
	
	public void addName(String name) {
		WebElement nameField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"name\"]"));
		nameField.clear();
		nameField.sendKeys(name);
	}
	
	public void addSerialNumber(String serialNumber)
	{
		if(!serialNumber.equals("NA"))
		{
		WebElement serialNumberField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"serialNumber\"]"));
		serialNumberField.clear();
		serialNumberField.sendKeys(serialNumber);
		}
	}
	
	public void selectDeviceConfiguration(String deviceType, String deviceConfiguration)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"deviceType\"]//parent::td//following-sibling::td//div")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+deviceType+"\")]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"deviceType\"]//parent::td//following-sibling::td//div")).click();
		
		if(!deviceConfiguration.equalsIgnoreCase("NA"))
		{
			DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"deviceConfiguration\"]//parent::td//following-sibling::td//div")).click();
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+deviceConfiguration+"\")]")).click();
			DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"deviceConfiguration\"]//parent::td//following-sibling::td//div")).click();
		}
	}
	
	public void addManufacturer(String manufacturer)
	{
		if(!manufacturer.equalsIgnoreCase("NA"))
		{
		WebElement manufacturerField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"manufacturer\"]"));
		manufacturerField.clear();
		manufacturerField.sendKeys(manufacturer);
		}
	}
	
	public void addModelNumber(String modelNumber)
	{
		if(!modelNumber.equalsIgnoreCase("NA"))
		{
		WebElement modelNumberField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"modelNbr\"]"));
		modelNumberField.clear();
		modelNumberField.sendKeys(modelNumber);
		}
	}
	
	public void addModelVersion(String modelVersion)
	{
		if(!modelVersion.equalsIgnoreCase("NA"))
		{
		WebElement modelVersionField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"modelVersion\"]"));
		modelVersionField.clear();
		modelVersionField.sendKeys(modelVersion);
		}
	}
	
	public void selectYearOfCertification(String yearOfCertification)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"yearOfCertification\"]//parent::td//following-sibling::td//div")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+yearOfCertification+"\")]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"yearOfCertification\"]//parent::td//following-sibling::td//div")).click();
	}
	
	public void setShipmentDate(String date)
	{
//		String dateOfMonth = date.substring(0,2);
//		String month = date.substring(3,6);
//		String year = date.substring(date.length()-2, date.length());
//		
//		DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Shipment date\")]//parent::td//following-sibling::td//table//tbody//tr//td//input")).click();
//		DriverUtility.getDriver().findElement(By.xpath("//a[@data-qtip = \"Choose a month (Control+Up/Down to move years)\"]")).click();
//		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),\""+month+"\")]")).click();
//		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),\""+year+"\")]")).click();
//		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"OK\")]//parent::span")).click();
//		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),\""+dateOfMonth+"\")]")).click();
		WebElement dateField = DriverUtility.getDriver().findElement(By.xpath("//label[contains(text(),\"Shipment date\")]//parent::td//following-sibling::td//table//tbody//tr//td//input"));
		dateField.sendKeys(date);
	}
	
	public void addBatch(String batch)
	{
		if(!batch.equalsIgnoreCase("NA"))
		{
		WebElement batchField = DriverUtility.getDriver().findElement(By.xpath("//input[@name = \"batch\"]"));
		batchField.clear();
		batchField.sendKeys(batch);
		}
	}
	
	public void clickOnAddButton()
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),\"Add\")]//parent::span[@class = \"x-btn-button\"]")).click();
		
	}
}
