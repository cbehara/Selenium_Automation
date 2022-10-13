package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.DataExchange.UploadFileForImportPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class UploadFileForImportTest  extends TestBase{
	Logger log = LogManager.getLogger(UploadFileForImportTest.class);
	String UploadFileForImportSheet = "UploadFileForImport";
	UploadFileForImportPage UploadFileForImportPage;
	  
	  public UploadFileForImportTest() {
			super();
		}	 
		
		@DataProvider
		public Object[][] getTestDataForUploadFileForImport() {
			Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(UploadFileForImportSheet);
			return testData;
		}
		
		@Test(priority = 1)
		public void verifyAndSelectImportServices()		
		{	
			UploadFileForImportPage = new UploadFileForImportPage();
			UploadFileForImportPage.clickonUploadFileForImport();		
			reporterLog("Starting Instances of Upload file for import");
	        log.info(" Starting the Test Case : Upload file for import");	        
	        String ExpectedValue= "Upload file for import";
	        WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFIleForImport_verifyUploadFileForImport")));       
	        SoftAssertfunction(ActualValue,ExpectedValue );
	        log.info(" Ending the Test Case : Upload file for import");
		}
		
		@Test(priority = 2,dataProvider = "getTestDataForUploadFileForImport")
		public void CreatedUploadfileforImport(String ImportserviceValue)
		
		{
			UploadFileForImportPage.CreateUploadfileforImport(ImportserviceValue);
			
			reporterLog("Adding Instances of Upload file for import");
	        log.info(" Adding the Test Case-Upload file for import ");	        
	        String ExpectedValue= "Upload file for import";
	        WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UploadFIleForImport_verifyUploadFileForImport")));     
	        SoftAssertfunction(ActualValue,ExpectedValue );
	        
			UploadFileForImportPage.clickedonCommunicationPortPools();
			
			
			log.info("************** Ending Test Case-Message Queues*******************");
		}	
		 
}
