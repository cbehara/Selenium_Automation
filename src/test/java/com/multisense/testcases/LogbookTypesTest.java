package com.multisense.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.LogbookTypesPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class LogbookTypesTest  extends TestBase{

	String AddLogBookTypeSheet = "AddLogBookType";
	
	LogbookTypesPage LogbookTypespage;
	
	Logger log = LogManager.getLogger(LogbookTypesTest.class); 
	
	public LogbookTypesTest()
	{
		super();
	}


	@DataProvider 
	public Object[][] getTestDataForLogBookType() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddLogBookTypeSheet);
		return testData;
	}

	@Test(priority =1 ,description = " Click Log Book Types") 
	public void logbooktypes() throws InterruptedException
	{
		LogbookTypespage = new LogbookTypesPage(); 

		reporterLog("Starting Test case log book types");

		log.info("****************************** starting test case : log book types **************************");

		LogbookTypespage.clickLogbooktypes();

		String Expectedtitle = "Logbook types";

		WebElement Actualtitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_verifylogbooktitle")));

		TitleAssertFunction(Actualtitle, Expectedtitle);

		log.info("****************************** Ending test case : log book types  ************************");
	}

	@Test(priority =2, description = " Click Log Book Types Button",enabled = true ) 
	public void clickLogbooktypesbutton() throws InterruptedException
	{
		reporterLog("Starting Test case Click log book types button");

		log.info("****************************** starting test case : Click log book types button *****************");

		LogbookTypespage.clickLogbooktypesbutton();

		log.info("****************************** Ending test case : Click log book types button *****************");

	}

	@Test(priority =3, dataProvider = "getTestDataForLogBookType", description = " Add Log Book Types" ,enabled = true ) 
	public void addlogbookType(String OBISCode, String UpdateName) throws InterruptedException
	{ 
		reporterLog("Starting Test case Add log book types button");

		log.info("****************************** starting test case : Add log book types button *****************");

		LogbookTypespage.addlogbookType(OBISCode);

		String Expectedlogtypeadded = "Logbook type added";

		WebElement Actuallogtypeadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_verifylogbooktypeadded")));

		SoftAssertfunction(Actuallogtypeadded, Expectedlogtypeadded);

		log.info("****************************** Ending test case : Add log book types button *****************");
	}

	@Test(priority =4,dataProvider = "getTestDataForLogBookType", description = " Edit Log Book Types"  ,enabled = true  ) 
	public void editlogbookType(String OBISCode, String UpdateName) throws InterruptedException
	{ 
		reporterLog("Starting Test case Edit log book types button");

		log.info("****************************** starting test case : Edit log book types button *****************");

		LogbookTypespage.editlogbooktype(UpdateName);

		String Expectedlogtypeedited = "Logbook type saved";

		WebElement Actuallogtypeedited = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_verifylogbooktypeedited")));

		SoftAssertfunction(Actuallogtypeedited, Expectedlogtypeedited);

		log.info("****************************** Ending test case : Edit log book types button *****************");
	}

	@Test(priority =5,dataProvider = "getTestDataForLogBookType", description = " Remove Log Book Types" ,enabled = true ) 
	public void removelogbookType(String OBISCode, String UpdateName) throws InterruptedException
	{ 
		reporterLog("Starting Test case Remove log book types button");

		log.info("****************************** starting test case : Remove log book types button *****************");

		LogbookTypespage.removelogbooktype(UpdateName);

		String Expectedlogtyperemoved = "Logbook type removed";

		WebElement Actuallogtyperemoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_verifylogbooktyperemoved")));

		SoftAssertfunction(Actuallogtyperemoved, Expectedlogtyperemoved);

		log.info("****************************** Ending test case : Remove log book types button *****************");
	}
	

	@Test(priority =5, description = " Verify Logbook Type Fields" ,enabled = true ) 
	public void verifyLogbookTypeFields() throws InterruptedException
	{ 
		reporterLog("Starting Test case Verify Logbook Type Fields");

		log.info("****************************** starting test case : Verify Logbook Type Fields *****************");

		LogbookTypespage.verifylogbooktypefields();

		log.info("****************************** Ending test case : Verify Logbook Type Fields *****************");
	}
}

