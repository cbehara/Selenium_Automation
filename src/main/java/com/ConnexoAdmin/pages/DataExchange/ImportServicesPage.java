
package com.ConnexoAdmin.pages.DataExchange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ImportServicesPage extends TestBase {

	String ImportServicesNameValue= generateRandomName(8);	       

	public ImportServicesPage()    
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(5000);
	}

	public void clickonImportServices()
	{   
		WebElement ConnexoAdmin_ImportServices_ImportServices = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_ImportServices")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_ImportServices, 10);      
		doClick(ConnexoAdmin_ImportServices_ImportServices);           
	}
	public String gettextofImportServices()
	{
		waitForTime(10000);
		WebElement ConnexoAdmin_ImportServices_VerifytextImportServices = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_VerifytextImportServices")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_VerifytextImportServices, 10);
		return getText(ConnexoAdmin_ImportServices_VerifytextImportServices);
	}
	public void clickonAddImportServices()
	{
		WebElement ConnexoAdmin_ImportServices_ImportServicesPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_ImportServicesPerPage")));
		if(ConnexoAdmin_ImportServices_ImportServicesPerPage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add import service')]//ancestor::a)[2]")).click();
		}else 
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add import service')]//ancestor::a)[1]")).click();
		}
	}

	public void createImportServices( String LogLevel,String Fileimporter,String Importfolder,
			String Inprogressfolder,String Successfolder ,String Failurefolder )      
	{
		waitForTime(10000);
		WebElement ConnexoAdmin_ImportServices_AddImportServiceName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_AddImportServiceName")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_AddImportServiceName, 10);
		doClear(ConnexoAdmin_ImportServices_AddImportServiceName);
		sendkeys(ImportServicesNameValue, ConnexoAdmin_ImportServices_AddImportServiceName);
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_LogLevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_LogLevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_LogLevelDropDown, 10);
		doClick(ConnexoAdmin_ImportServices_LogLevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+LogLevel +"')]")).click();
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_FileimporterDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_FileimporterDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_FileimporterDropDown, 10);
		doClick(ConnexoAdmin_ImportServices_FileimporterDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Fileimporter +"')]")).click();
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_ImportfolderName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_ImportfolderName")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_ImportfolderName, 10);
		doClear(ConnexoAdmin_ImportServices_ImportfolderName);
		sendkeys(Importfolder, ConnexoAdmin_ImportServices_ImportfolderName);                   
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_InprogressfolderName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_InprogressfolderName")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_InprogressfolderName, 10);
		doClear(ConnexoAdmin_ImportServices_InprogressfolderName);
		sendkeys(Inprogressfolder, ConnexoAdmin_ImportServices_InprogressfolderName);      
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_SuccessfolderName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_SuccessfolderName")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_SuccessfolderName, 10);
		doClear(ConnexoAdmin_ImportServices_SuccessfolderName);
		sendkeys(Successfolder, ConnexoAdmin_ImportServices_SuccessfolderName);                
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_FailurefolderName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_FailurefolderName")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_FailurefolderName, 10);
		doClear(ConnexoAdmin_ImportServices_FailurefolderName);
		sendkeys(Failurefolder, ConnexoAdmin_ImportServices_FailurefolderName);
		waitForTime(5000);
		WebElement ConnexoAdmin_ImportServices_addImportService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_addImportService")));
		doClick(ConnexoAdmin_ImportServices_addImportService);                 
	}

	public void activateImportServices()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ImportServicesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_ImportServices_activateImportService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_activateImportService")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_activateImportService, 10);
		doClick(ConnexoAdmin_ImportServices_activateImportService);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ ImportServicesNameValue +"')]//ancestor::div//a[normalize-space()='Activate']")).click();
	}

	public void removeImportServices()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ImportServicesNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_ImportServices_removeImportService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_removeImportService")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ImportServices_removeImportService, 10);
		doClick(ConnexoAdmin_ImportServices_removeImportService);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'"+ ImportServicesNameValue +"')]//ancestor::div//a[normalize-space()='Remove'])")).click();
	}
	
	public void clickImportServiceActionIcon(String importService)
	{
		waitForTime(5000);
		WebElement importServices = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ importService +"']//ancestor::td//following-sibling::td//span"));
		TestUtil.waitforElementTobeLocated(importServices, 10);
		doClick(importServices);
	}
	
	public void clickDeactivateOption()
	{
		waitForTime(5000);
		WebElement DeactivateOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_deActivateImportService")));
		TestUtil.waitforElementTobeLocated(DeactivateOption, 10);
		doClick(DeactivateOption);
	}
	
	public void clickDeActivateButtonInPopupWindow()
	{
		waitForTime(5000);
		WebElement DeactivateOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_deActivateButtonInPopupWindow")));
		TestUtil.waitforElementTobeLocated(DeactivateOption, 10);
		doClick(DeactivateOption);
	}
	
	public void clickActivateButtonInPopupWindow()
	{
		waitForTime(5000);
		WebElement activateOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_activateButtonInPopupWindow")));
		TestUtil.waitforElementTobeLocated(activateOption, 10);
		doClick(activateOption);
	}
	
	public void clickActivateOptionInActionIcon()
	{
		waitForTime(5000);
		WebElement DeactivateOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_activateImportService")));
		TestUtil.waitforElementTobeLocated(DeactivateOption, 10);
		doClick(DeactivateOption);
	}
	
	public void clickActivateOption(String importService)
	{
		waitForTime(5000);
		if (isDisplayed("ConnexoAdmin_ImportServices_activateImportService")) {
			DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_activateImportService"))).click();
			clickActivateButtonInPopupWindow();
		}
		else {
			browserRefresh();
			clickImportServiceActionIcon(importService);
			DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_deActivateImportService"))).click();
			DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_deActivateButtonInPopupWindow"))).click();
			browserRefresh();
			clickImportServiceActionIcon(importService);
			DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_activateImportService"))).click();
			DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_activateButtonInPopupWindow"))).click();
		}
	}

	public String getServiceStatusFromResultsTable(String importService)
	{
		waitForTime(5000);
		WebElement importServices = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ importService +"']//parent::div//parent::td//following::td[2]/div"));
		return importServices.getText();
	}
}
