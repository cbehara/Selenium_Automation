package com.ConnexoAdmin.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ConnexoAdmin.pages.DataExchange.ImportHistoryPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class ImportHistoryTest extends TestBase {
	
	Logger log = LogManager.getLogger(ImportHistoryTest.class);
	
	ImportHistoryPage ImportHistoryPage;
	
	public ImportHistoryTest() {
		super();
	}
	
	
	@Test(priority = 1, description="verify & Select Add Import History")
	public void verifyAndSelectImportHistory()	
	{ 	
		ImportHistoryPage = new ImportHistoryPage();
		
		ImportHistoryPage.clickonImportHistory();
		
		reporterLog("Starting Instances of Import History");
		
		log.info("****************************** starting test case : Case-Import History *****************************************");
        
        ImportHistoryPage.selectDropDownValue();  
        		    	
        String ExpectedValue= "Import history";
        
        WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ImportHistoryPage_VerifytextImportHistory")));
       
        SoftAssertfunction(ActualValue, ExpectedValue);
        
        log.info("****************************** Ending test case : Case-Import History *****************************************");		
	}
	
	@Test(priority = 2, description="Apply Import History")
	public void ApplyImportHistory()	
	{	
		reporterLog("Starting test case Applying Import History");
		
        log.info("****** Starting test case : Applying Import History *************"); 
        
        ImportHistoryPage.selectDropDownValue();
        
        log.info("****** Ending test case : Applying Import History *************");
	     
	}
}
