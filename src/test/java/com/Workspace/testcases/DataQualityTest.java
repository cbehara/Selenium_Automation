package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.DataQualityPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataQualityTest extends TestBase {
	String DataQuality = "Dataquality";
	Logger log = LogManager.getLogger(DataQualityTest.class);	
	DataQualityPage DataQualityPage;

	public DataQualityTest()
	{
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataForDataquality() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(DataQuality);
		return testData;
	}
	
	@Test(priority = 1 , dataProvider = "getTestDataForDataquality",description="Apply Data Quality" )
	public void ApplyDataQuality(String estimator)
	{
		DataQualityPage = new DataQualityPage();
		DataQualityPage.clickDataQuality();
		reporterLog("Starting Test case Apply Data quality");
		log.info("**************** starting test case : Apply Data quality ******************************");
		String ExpectedValue= "Data quality"; 
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVDQ_VerifyDataQuality")));		
		SoftAssertfunction(ActualValue, ExpectedValue);				 
		DataQualityPage.ApplyDataQuality(estimator); 
		log.info("**************** Ending test case : Apply Data quality ******************************");
	}
}








