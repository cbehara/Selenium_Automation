package com.ConnexoAdmin.testcases;
import com.ConnexoAdmin.pages.AdminRelativePeriod.RelativePeriodPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class RelativePeriodTest extends TestBase {
	//getTestDataFromConnexoAdmin
	String AddSheet = "RelativePeriod_Add";
	String EditSheet = "RelativePeriod_Edit";
	RelativePeriodPage RelativePeriodPage;
	Logger log = Logger.getLogger(RelativePeriodTest.class);         
	public RelativePeriodTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] dpAdd() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddSheet);
		return testData;
	}
	
	@DataProvider 
	public Object[][] dpEdit() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(EditSheet);
		return testData;
	}

	@Test(priority =1, description = "Verify Relative Period Test") 
	public void verifyRelativePeriodText() throws InterruptedException, IOException
	{
		RelativePeriodPage = new RelativePeriodPage();  
		reporterLog("Starting testcase Verify  Relative Period  text page");
		log.info("************************ starting Relative Period assert text test case *************************");
		RelativePeriodPage.clickRelativePreiodLink();
		String ExpectedValue= "Relative periods";                             
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifyRelativePeriod")));        
		SoftAssertfunction(ActualValue, ExpectedValue);
		//RelativePeriodPage.clickAddRelativePreiodBtn();
		waitForTime(2000);
		waitForTime(2000);
		RelativePeriodPage.clickAddRelativePreiodBtn();
		waitForTime(1000);
	}

	
	@Test(priority =2,  enabled = true, description = "Add Relative Period Data")
	public void AddRelativePeriodData() throws InterruptedException, IOException, AWTException
	{

		reporterLog("Starting testcase Verify  Add Relative Period Form Fill page");
		log.info("************************ starting  Add Relative Period Form Fill test case *************************");	
		
		RelativePeriodPage.addRelativePage();
		log.info("************************ Ending  Add Relative Period Form Fill test case *************************");
		waitForTime(2000); 
		
	}
	


	@Test(priority =3, dataProvider = "dpEdit", enabled = true, description = "Edit Relative Period Data") 
	public void EditRelativePeriodData(String EditName, String Days) throws InterruptedException, IOException, AWTException
	{

		reporterLog("Starting testcase Verify  Edit Relative Period Form page ");
		log.info("************************ starting Edit Relative Period and Remove Relative Period Form test case *************************");

		RelativePeriodPage.clickGearIconandSelectEdit(EditName ,Days );
		waitForTime(2000);
		
		log.info("************************ Ending  Edit Relative Period and Remove Relative Period Form test case *************************");
		
		waitForTime(2000);
	}
}
