package com.ConnexoAdmin.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ConnexoAdmin.pages.DataExchange.ImportServicesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ImportServicesTest extends TestBase {

	Logger log = LogManager.getLogger(ImportServicesTest.class);

	String ImportServicesSheet = "ImportServices";

	ImportServicesPage ImportServicesPage;

	public ImportServicesTest() {
		super();
	}

	@DataProvider
	public Object[][] getTestDataForImportServices() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ImportServicesSheet);
		return testData;
	}

	@Test(priority = 1, description="verify & Select add Import Services")
	public void verifyAndSelectImportServices()         
	{ 		
		ImportServicesPage = new ImportServicesPage(); 

		ImportServicesPage.clickonImportServices();

		reporterLog("Starting tescase Select Import services");

		log.info("****** Starting the Test Case : Select Import services *************");		

		ImportServicesPage.clickonAddImportServices();

		log.info("****** Ending the Test Case : Select Import services *************");	

	}

	@Test(priority = 2, dataProvider = "getTestDataForImportServices", description="Create Import Services")
	public void CreatedImportServices(String LogLevel, String Fileimporter, String Importfolder, String Inprogressfolder, String Successfolder, String Failurefolder)   
	{   
		reporterLog("Starting testcase Create Import Services");

		log.info("****** Starting the Test Case : Create Import Services *************");		

		ImportServicesPage.createImportServices(LogLevel,Fileimporter,Importfolder,Inprogressfolder,Successfolder ,Failurefolder);

		String ExpectedAddISValue= "Import service added";

		WebElement ActualAddISValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_verifytextImportserviceadded")));         

		SoftAssertfunction(ActualAddISValue, ExpectedAddISValue);

		log.info("****** Ending the Test Case : Create Import Services *************");		
	}

	@Test(priority = 3, dataProvider = "getTestDataForImportServices", description="Activate Import Services")
	public void activationImportServices(String LogLevel, String Fileimporter, String Importfolder, String Inprogressfolder, String Successfolder, String Failurefolder)   
	{   		
		reporterLog("Starting testcase Activate Import services");

		log.info("****** Starting the Test Case : Activate Import services *************");		 

		ImportServicesPage.activateImportServices();

		String ExpectedActivaedISValue= "Import service activated";

		WebElement ActualActivaedISValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_verifytextImportserviceactivated")));       

		SoftAssertfunction(ActualActivaedISValue, ExpectedActivaedISValue);

		log.info("****** Ending the Test Case : Activate Import services *************");		
	}         

	@Test(priority = 4, enabled = false, dataProvider = "getTestDataForImportServices", description="Remove Import Services")
	public void removedImportServices(String LogLevel, String Fileimporter, String Importfolder, String Inprogressfolder, String Successfolder, String Failurefolder)
	{		
		reporterLog("Staring testcase Remove Import services");

		log.info("****** Staring the Test Case : Remove Import services *************");		 

		ImportServicesPage.removeImportServices();

		String ExpectedremoveISValue= "Import service removed";

		WebElement ActualremoveISValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportServices_verifytextImportserviceremoved")));         

		SoftAssertfunction(ActualremoveISValue, ExpectedremoveISValue);

		log.info("************** Ending Test Case : Remove Import services *******************");		
	}	

}
