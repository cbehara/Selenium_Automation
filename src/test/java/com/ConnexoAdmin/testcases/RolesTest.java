package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.RolesPage.RolesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class RolesTest  extends TestBase{

	String AddRolessheet = "AddRoles";
	RolesPage Rolespage;
	Logger log = Logger.getLogger(RolesTest.class);           
	public RolesTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForRoles() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddRolessheet);
		return testData;
	}                 

	@Test(priority =1, description = " click roles link" ) 
	public void Roles() throws InterruptedException
	{	
		Rolespage = new RolesPage();	
		reporterLog("Starting Testcase Roles Test ");
		log.info("****************************** starting test case : Roles*****************************************");

		Rolespage.clickRoles();
		String Expectedrolestitle = "Roles";
		WebElement Actualrolestitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_Roles")));
		TitleAssertFunction(Actualrolestitle, Expectedrolestitle);
		log.info("****************************** Ending test case : Roles*****************************************");
	}

	@Test(priority =2, description = "click add roles" , enabled = true) 
	public void clickAddRoles() throws InterruptedException
	{
		reporterLog("Starting Testcase Add Roles Test ");
		log.info("****************************** starting test case : Add Roles*****************************************");
		
		Rolespage.clickAddRoles();	
		
		log.info("****************************** Ending test case : Add Roles*****************************************");
	}	 


	@Test(priority =3, description = "click role name", dataProvider = "getTestDataForRoles", enabled = true) 
	public void clickRolename(String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting Testcase Click Role Name ");
		log.info("****************************** starting test case : Click Role Name*****************************************");
		Rolespage.clickRolename(Name,Description);
		String Expectedroleadded = "Role added";
		WebElement Actualroleadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_verifyroleadded")));
		SoftAssertfunction(Actualroleadded, Expectedroleadded);
		log.info("****************************** Ending test case : Click Role Name*****************************************");
	}

	@Test(priority =4, description = "edit role name", dataProvider = "getTestDataForRoles", enabled = true) 
	public void editRoleName(String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting Testcase Edit Role Name ");
		log.info("****************************** starting test case : Edit Role Name*****************************************");
		Rolespage.editRoleName(Name);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		String Expectedrolesaved = "Role saved";
		WebElement Actualrolesaved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_verifyrolesaved")));
		SoftAssertfunction(Actualrolesaved, Expectedrolesaved);
		log.info("****************************** Ending test case : Edit Role Name*****************************************");
	}	 

	@Test(priority =5, description = "remove role name", dataProvider = "getTestDataForRoles", enabled = true) 
	public void removerolename(String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting Testcase Remove Role Name ");
		log.info("****************************** starting test case : Remove Role Name*****************************************");
		Rolespage.removerolename(Name);
		String Expectedroleremoved = "Role removed";
		WebElement Actualroleremoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_verifyroleremoved")));
		SoftAssertfunction(Actualroleremoved, Expectedroleremoved);
		log.info("****************************** Ending test case : Remove Role Name*****************************************");
	}
}

