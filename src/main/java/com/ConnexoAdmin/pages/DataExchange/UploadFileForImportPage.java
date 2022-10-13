package com.ConnexoAdmin.pages.DataExchange;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class UploadFileForImportPage extends TestBase {
	
	public String getFile()
	{
		return new File("resources/testdata/UploadFilesTestData.xlsx").getAbsolutePath();
	}
	

	public UploadFileForImportPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(3000);
	}
	public void clickonUploadFileForImport()
	{
		waitForTime(5000);
		WebElement UploadFileForImportLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_UploadFileForImportLink")));
		TestUtil.waitforElementTobeLocated(UploadFileForImportLink, 10);	
		doClick(UploadFileForImportLink);		
	}
	
	public String gettextofImportservice()
	{
		waitForTime(5000);
		WebElement verifyUploadFileForImport = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_verifyUploadFileForImport")));
		TestUtil.waitforElementTobeLocated(verifyUploadFileForImport, 10);
		return getText(verifyUploadFileForImport);
	}
	
	public void CreateUploadfileforImport(String ImportserviceValue)
	{
		waitForTime(5000);
		WebElement ImportserviceDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_ImportserviceDropDown")));
		TestUtil.waitforElementTobeLocated(ImportserviceDropDown, 10);	
		doClick(ImportserviceDropDown);
		waitForTime(1000);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ImportserviceValue+"']")).click();
		/*
		 * TestUtil.waitforElementTobeLocated(ImportserviceValue, 10);
		 * doClick(ImportserviceValue);
		 */		
		waitForTime(2000);
		/*
		 * LocalFileDetector Detector = new LocalFileDetector();
		 * ((RemoteWebElement)FileUpload).setFileDetector(Detector);
		 */
		WebElement FileUpload = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_FileUpload")));
		sendkeys(getFile(), FileUpload);		
		waitForTime(3000);
		WebElement UploadButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_UploadButton")));
		TestUtil.waitforElementTobeLocated(UploadButton, 10);	
		doClickjavaScript(UploadButton);
	}
	
	public void clickedonCommunicationPortPools()
	{
		waitForTime(5000);		
		MenuClick();
		waitForTime(5000);
		Multisense();
		waitForTime(5000);
		Administration();
		waitForTime(5000);
		WebElement communicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_communicationPortPool")));
		TestUtil.waitforElementTobeLocated(communicationPortPool, 10);	
		doClick(communicationPortPool);
		waitForTime(3000);
		WebElement ExportcommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFileForImport_ExportcommunicationPortPool")));
		TestUtil.waitforElementTobeLocated(ExportcommunicationPortPool, 10);	
		doClick(ExportcommunicationPortPool);
	}
	
	

	
	

}
