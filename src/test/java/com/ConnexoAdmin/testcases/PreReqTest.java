package com.ConnexoAdmin.testcases;

import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ConnexoAdmin.pages.DataExchange.ImportServicesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class PreReqTest extends TestBase {

	Logger log = LogManager.getLogger(PreReqTest.class);
	ImportServicesPage importServicesPage;

	public PreReqTest() {
		super();
	}
	
	@Test(priority = 1, enabled = true, description="VerifyByActivateInstallationImportService")
	public void VerifyByActivateInstallationImportService()   
	{   		
		log.info("****** Starting the Test Case : VerifyByActivateInstallationImportService *************");	
		String importService = "Installation";
		importServicesPage = new ImportServicesPage(); 
		importServicesPage.clickonImportServices();
		if (importServicesPage.getServiceStatusFromResultsTable(importService) != "Active") {
			importServicesPage.clickImportServiceActionIcon(importService);
			importServicesPage.clickActivateOption(importService);
			String ExpectedActivaedISValue= "Import service activated";
			WebElement ActualActivaedISValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_verifytextImportserviceactivated")));       

			SoftAssertfunction(ActualActivaedISValue, ExpectedActivaedISValue);
		}
		log.info("****** Ending the Test Case : VerifyByActivateInstallationImportService *************");		
	} 
}
