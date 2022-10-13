package com.ConnexoAdmin.pages.DataExchange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ImportHistoryPage extends TestBase {	
	
	
	public ImportHistoryPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(3000);
	}
	
	
	public void clickonImportHistory()
	{	
		WebElement ConnexoAdmin_ImportHistoryPage_ImportHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportHistoryPage_ImportHistory")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportHistoryPage_ImportHistory, 10);	
		doClick(ConnexoAdmin_ImportHistoryPage_ImportHistory);		
	}
	public String gettextofImportHistory()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportHistoryPage_VerifytextImportHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportHistoryPage_VerifytextImportHistory")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportHistoryPage_VerifytextImportHistory, 10);
		return getText(ConnexoAdmin_ImportHistoryPage_VerifytextImportHistory);
	}
	
	public void selectDropDownValue()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportHistoryPage_StatusDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportHistoryPage_StatusDropdown")));
		doClickjavaScript(ConnexoAdmin_ImportHistoryPage_StatusDropdown);
		waitForTime(2000);
		WebElement ConnexoAdmin_ImportHistoryPage_StatusDropdownCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportHistoryPage_StatusDropdownCheckbox")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportHistoryPage_StatusDropdownCheckbox, 10);	
		doClick(ConnexoAdmin_ImportHistoryPage_StatusDropdownCheckbox);
		waitForTime(2000);
		WebElement ConnexoAdmin_ImportHistoryPage_ApplyImportHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportHistoryPage_ApplyImportHistory")));
		doClick(ConnexoAdmin_ImportHistoryPage_ApplyImportHistory);
	}
}
