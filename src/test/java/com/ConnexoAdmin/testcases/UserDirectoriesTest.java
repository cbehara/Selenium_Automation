package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.UserDirectoriesPage.UserDirectoriesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class UserDirectoriesTest  extends TestBase{

	String AddUserDirectoriessheet = "AddDirectories";
	UserDirectoriesPage userdirectoriespage;
	Logger log = Logger.getLogger(UserDirectoriesTest.class);           
	public UserDirectoriesTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForUserDirectories() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddUserDirectoriessheet);
		return testData;
	}
	
	@Test(priority =1, description = "click user directories") 
	public void UserDirectories() throws InterruptedException
	{
		userdirectoriespage = new UserDirectoriesPage();    
		
		reporterLog("Starting testcase User Directories");
		
		log.info("****************************** starting test case : userdirectoriespage *****************************************");
		
		userdirectoriespage.clickuserdirectory();
		
		String Expectedusertitle = "User directories";
		
		WebElement Actualusertitle =DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_UserDirectories")));
		
		TitleAssertFunction(Actualusertitle, Expectedusertitle);
		
		log.info("****************************** Ending test case : userdirectoriespage *****************************************");
	}


	@Test(priority =2, description = "click add user directories", enabled = true) 
	public void clickAdduserdirectory() throws InterruptedException
	{
		reporterLog("Starting testcase Click Add User Directories");		
		
		log.info("****************************** starting test case : Click Add user directoriespage *****************************************");
		
		userdirectoriespage.clickAdduserdirectory();
		
		log.info("****************************** Ending test case : Click Add user directoriespage *****************************************");
	}

	@Test(priority =3, dataProvider = "getTestDataForUserDirectories", description = " add user directories details", enabled = true) 
	public void Adduserdirectory(String Name, String Url, String Backupurl, String securityprotocol,String directoryUser, String Password, String BaseUser, String BaseGroup) throws InterruptedException
	{
		reporterLog("Starting testcase Add User Directories");		
		
		log.info("****************************** starting test case : Add user directoriespage *****************************************");
		
		userdirectoriespage.Adduserdirectory( Name, Url,  Backupurl,  securityprotocol, directoryUser, Password,  BaseUser,  BaseGroup);
		
		String Expecteduseradded = "User directory added";
		
		WebElement Actualuseradded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_verifyuserdirectoryadded")));
		
		SoftAssertfunction(Actualuseradded, Expecteduseradded);
		
		log.info("****************************** Ending test case : Add user directoriespage *****************************************");
	}

	@Test(priority = 4, dataProvider = "getTestDataForUserDirectories", description = "remove user directories details", enabled = true) 
	public void Removeuserdirectory(String Name, String Url, String Backupurl, String securityprotocol,String directoryUser, String Password, String BaseUser, String BaseGroup) throws InterruptedException
	{ 
		reporterLog("Starting testcase Add Remove user Directory");		
		
		log.info("****************************** starting test case : Add Remove user Directory *****************************************");
		
		userdirectoriespage.removeuserdirectory(Name);;
		
		String Expecteduserremoved = "User directory removed";
		
		WebElement Actualuserremoved =DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_verifyuserdirectoryremoved")));
		
		SoftAssertfunction(Actualuserremoved, Expecteduserremoved);
		
		log.info("****************************** Ending test case : Add Remove user Directory *****************************************");
	}
}

