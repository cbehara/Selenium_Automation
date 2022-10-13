package com.multisense.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.RegisterGroupsPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class RegistergroupTest  extends TestBase{

	String AddRegistergroupsheet = "AddRegistergroup";
	RegisterGroupsPage RegisterGroupspage;
	Logger log = LogManager.getLogger(RegistergroupTest.class);


	public RegistergroupTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForRegisterGroupsType() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddRegistergroupsheet);
		return testData;
	}	           

	@Test(priority =1,description = " Click Register Groups"  ) 
	public void Registergroups() throws InterruptedException
	{
		RegisterGroupspage = new RegisterGroupsPage(); 
		reporterLog("Starting Test case Register gropus");
		log.info("****************************** starting test case : Register groups***********************");

		RegisterGroupspage.clickRegisterGroups();
		String Expectedregistergrouptitle = "Register groups";
		WebElement Actualregistergrouptitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_verifyregistergrouptitle")));

		TitleAssertFunction(Actualregistergrouptitle, Expectedregistergrouptitle);
		log.info("******************************Ending test case : Register groups  ************************");
	}

	@Test(priority =2, description = " Click Add Register Groups Button" ,enabled = true   ) 
	public void AddRegisterButton() throws InterruptedException
	{
		reporterLog("Starting Test case Add Register gropus");
		log.info("****************************** starting test case : Add Register groups********************");
		RegisterGroupspage.clicAddRegisterGroupbutton();
		log.info("****************************** Ending test case : Add Register groups********************");

	}



	@Test(priority =3, description = " Click Add Register Groups Name"  ,enabled = true   ) 
	public void clicAddRegisterGroupname() throws InterruptedException
	{
		reporterLog("Starting Test case Click Add Register gropus");
		log.info("****************************** starting test case : Click Add Register groups********************");
		RegisterGroupspage.clicAddRegisterGroupname();
		String Expectedregistergroupadded = "Register group added";
		WebElement Actualregistergroupadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_verifyregistergroupadded")));

		SoftAssertfunction(Actualregistergroupadded, Expectedregistergroupadded);
		log.info("****************************** Ending test case : Click Add Register groups********************");
	}


	@Test(priority =4, dataProvider = "getTestDataForRegisterGroupsType", description = " Edit Register Groups " , enabled = true ) 
	public void editRegistergroup(String UpdateName) throws InterruptedException
	{
		reporterLog("Starting Test case Edit Register gropus");
		log.info("****************************** starting test case : Edit Register groups********************");
		RegisterGroupspage.editRegistergroup(UpdateName);
		String Expectedregistergroupsaved = "Register group saved";
		WebElement Actualregistergroupsaved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_verifyregistergroupedited")));

		SoftAssertfunction(Actualregistergroupsaved, Expectedregistergroupsaved);
		log.info("****************************** starting test case : Edit Register groups********************");
	}	 


	@Test(priority =5, dataProvider = "getTestDataForRegisterGroupsType", description = " Remove Register Groups ", enabled = true ) 
	public void removeregistergroup(String UpdateName) throws InterruptedException
	{
		reporterLog("Starting Test case Remove Register gropus");
		log.info("****************************** starting test case : Remove Register groups********************");
		RegisterGroupspage.removeregistergroup(UpdateName);
		String Expectedregistergroupremoved = "Register group removed";
		WebElement Actualregistertyperemoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_verifyregistergrouperemoved")));

		SoftAssertfunction(Actualregistertyperemoved, Expectedregistergroupremoved);
		log.info("****************************** Ending test case : Remove Register groups********************");
	}
	
	@Test(priority =6, description = " Verify Add Register Group Fields ", enabled = true ) 
	public void verifyaddregistergroupfields() throws InterruptedException
	{
		reporterLog("Starting Test case Verify Add Register Group Fields");
		log.info("****************************** starting test case : Verify Add Register Group Fields********************");
		RegisterGroupspage.verifyaddregistergroupfields();
		
		log.info("****************************** Ending test case : Verify Add Register Group Fields********************");
	}

}

