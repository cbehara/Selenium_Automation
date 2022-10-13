package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.UserPage.UserPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class UserTest  extends TestBase{

	String AddUsersheet = "AddUser";
	UserPage userpage;
	Logger log = Logger.getLogger(UserTest.class);           
	public UserTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForUser() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddUsersheet);
		return testData;
	}	          

	@Test(priority =1, description = " click user" ) 
	public void UserDirectories() throws InterruptedException
	{
		userpage = new UserPage(); 
		reporterLog("Executing test case User Directory test");
		log.info("****************************** starting test case : user directories test *****************************************");
		
		userpage.clickuser();
		
		log.info("****************************** Ending test case : user directories test *****************************************");
	}

	@Test(priority = 2, description = "edit user" , dataProvider = "getTestDataForUser", enabled = true ) 

	public void editUser(String desc, String Name, String mail, String lang, String checkbox1 ) throws InterruptedException
	{ 
		reporterLog("Executing test case Edit User");
		log.info("****************************** starting test case : Edit user test *****************************************");
		userpage.editUser( desc,  Name,  mail,  lang,  checkbox1);
		String Expectedusersaved = "User saved";
		WebElement Actualusersaved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_verifyusersaved")));
		SoftAssertfunction(Actualusersaved, Expectedusersaved);
		log.info("****************************** Ending test case : Edit user test *****************************************");
	}


	@Test(priority = 3, description = "deactivate user", dataProvider = "getTestDataForUser", enabled = true ) 

	public void deactivateuser(String desc, String Name, String mail, String lang, String checkbox1 ) throws InterruptedException
	{ 
		reporterLog("Executing testcase Deactivate user");
		log.info("****************************** starting test case : Deactivate user test *****************************************");
		userpage.deactivateuser( desc,  Name,  mail,  lang,  checkbox1);
		String Expecteduserdeactivate = "User deactivated";
		WebElement Actualuserdeactivate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_verifyuserdeactivated")));
		SoftAssertfunction(Actualuserdeactivate, Expecteduserdeactivate);
		log.info("****************************** Ending test case : Deactivate user test *****************************************");
	}


	@Test(priority = 3, description = "activate user", dataProvider = "getTestDataForUser", enabled = true ) 

	public void activateuser(String desc, String Name, String mail, String lang, String checkbox1 ) throws InterruptedException
	{ 
		reporterLog("Executing testcase activate user");
		log.info("****************************** starting test case : activate user test *****************************************");
		userpage.activateuser( desc,  Name,  mail,  lang,  checkbox1);
		String Expecteduseractivate = "User activated";
		WebElement Actualuseractivate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_verifyuseractivated"))); 
		SoftAssertfunction(Actualuseractivate, Expecteduseractivate);
		log.info("****************************** Ending test case : activate user test *****************************************");

	}

}

