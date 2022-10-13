package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.ReadingTypes.ReadingTypesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ReadingTypesTest extends TestBase {

	Logger log = LogManager.getLogger(ReadingTypesTest.class);

	String ReadingTypeSheet = "ReadingType";

	ReadingTypesPage ReadingTypesPage;


	public ReadingTypesTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForReadingType() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ReadingTypeSheet);
		return testData;
	}

	@Test(priority = 1, description="AddReadingTypeSetInput")
	public void verifyReadingTypeSets()	
	{   	
		ReadingTypesPage = new ReadingTypesPage();

		ReadingTypesPage.clickonReadingTypes();

		reporterLog("Starting testcase Verify Reading type sets ");

		log.info("****** Starting the Test Case : Verify Reading type sets *************");

		log.info("************ Assertions verified for Reading type sets  *******");

		String ExpectedRTSvalue = "Reading type sets";

		WebElement ActualRTSvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_verifyReadingTypeSets")));

		SoftAssertfunction(ActualRTSvalue, ExpectedRTSvalue);

		ReadingTypesPage.clickonAddReadingTypeSet();

		log.info("****** Ending the Test Case : Verify Reading type sets *************");
	}

	@Test(priority = 2, dataProvider = "getTestDataForReadingType", description="AddReadingTypeSetInput")
	public void AddReadingTypeSetInput(String Period, String Commodity, String Phases)	
	{	   	
		reporterLog("Starting Testcase Add Reading type set input ");

		log.info("****** Starting Test Case : Add Reading TypeSet Input *************");

		ReadingTypesPage.CreateReadingTypelink(Period,Commodity,Phases);

		log.info("************ Assertions verified for Removed Security Accessor *******");

		String ExpectedRTSAddvalue = "1 reading type added";

		WebElement ActualRTSAddvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_verifytext1readingtypeadded")));

		SoftAssertfunction(ActualRTSAddvalue, ExpectedRTSAddvalue);

		log.info("************** Ending Test Case : Add Reading TypeSet Input *******************");	    
	}	
}