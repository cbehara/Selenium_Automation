package com.multisense.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.LoadProfileTypePage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class LoadProfileTypesTest  extends TestBase{

	String AddLoadProfileTypeSheet = "AddLoadProfileType";
	LoadProfileTypePage LoadProfileTypepage;
	Logger log = LogManager.getLogger(LoadProfileTypesTest.class);


	public LoadProfileTypesTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForLoadProfileType() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddLoadProfileTypeSheet);
		return testData;
	}

	@Test(priority =1, description = " Load profile type ")     
	public void LoadProfileType() throws InterruptedException
	{
		LoadProfileTypepage = new LoadProfileTypePage(); 
		reporterLog("Starting Test case Load profile type");
		log.info("****************************** starting test case : Load profile type ********************");

		LoadProfileTypepage.clickLoadProfile();
		String Expectedloadproftitle = "Load profile types";
		WebElement Actualloadproftitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_verifyloadproftitle")));

		TitleAssertFunction(Actualloadproftitle, Expectedloadproftitle);
		log.info("****************************** starting test case : Load profile type *********************");
	}

	@Test(priority =2, dataProvider = "getTestDataForLoadProfileType", description = " Add Load profile type ",enabled = true    )     
	public void addloadprofileType(String OBISCode) throws InterruptedException
	{
		reporterLog("Starting Test case Add Load profile type");
		log.info("****************************** starting test case : Add Load profile type ********************");
		LoadProfileTypepage.clickLoadProfilebutton();
		LoadProfileTypepage.addloadprofileType(OBISCode);
		String Expectedloadprofadded = "Load profile type added";
		WebElement Actualloadprofadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_verifyloadprofadded")));

		SoftAssertfunction(Actualloadprofadded, Expectedloadprofadded);
		log.info("****************************** Ending test case : Add Load profile type ********************");
	}

	@Test(priority =3, description = " Edit Load profile type ",enabled = true    )     
	public void editloadprofileType() throws InterruptedException
	{
		reporterLog("Starting Test case Edit Load profile type");
		log.info("****************************** starting test case : Edit Load profile type ********************");
		LoadProfileTypepage.editOnlineLoadProfiletype();
		log.info("****************************** Ending test case : Edit Load profile type ********************");
	}

	@Test(priority =4, description = " Remove Load profile type " ,enabled = true    )     
	public void removeOnlineLoadProfiletype() throws InterruptedException
	{
		reporterLog("Starting Test case Remove Load profile type");
		log.info("****************************** starting test case : Remove Load profile type ********************");
		LoadProfileTypepage.removeOnlineLoadProfiletype();
		String Expectedloadprofremoved = "Load profile type removed";
		WebElement Actualloadprofremoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_verifyloadprofremoved")));

		SoftAssertfunction(Actualloadprofremoved, Expectedloadprofremoved);
		log.info("****************************** Ending test case : Remove Load profile type ********************");
	}
	
	@Test(priority =5, description = " Verify Add Load Profile Type Fields " ,enabled = true    )     
	public void verifyAddLoadProfileTypeFields() throws InterruptedException
	{
		reporterLog("Starting Test case Verify Add Load Profile Type Fields");
		log.info("****************************** starting test case : Verify Add Load Profile Type Fields ********************");
		LoadProfileTypepage.verifyAddLoadProfileTypeFields();
		
		log.info("****************************** Ending test case : Verify Add Load Profile Type Fields ********************");
	}
	
	@Test(priority =6, dataProvider = "getTestDataForLoadProfileType", description = " Add All Register Types " ,enabled = true    )     
	public void addAllRegisterTypes(String OBISCode) throws InterruptedException
	{
		reporterLog("Starting Test case Add All Register Types");
		log.info("****************************** starting test case : Add All Register Types ********************");
		LoadProfileTypepage.addAllRegisterTypes(OBISCode);
		
		log.info("****************************** Ending test case : Add All Register Types ********************");
	}
}

