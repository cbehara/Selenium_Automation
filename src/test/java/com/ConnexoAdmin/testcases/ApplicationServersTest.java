package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.ApplicationServers.ApplicationServersPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ApplicationServersTest  extends TestBase{

	Logger log = LogManager.getLogger(KeypairsTest.class);
	String ApplicationServerSheet = "Application Servers";
	ApplicationServersPage ApplicationServersPage;

	public ApplicationServersTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataApplicationServer() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ApplicationServerSheet);
		return testData;
	}

	@Test(priority = 1, description= "verifyAndSelectMessageQueues")
	public void verifyAndSelectMessageQueues()                
	{  
		ApplicationServersPage = new ApplicationServersPage();
		ApplicationServersPage.clickonApplicationServer();
		reporterLog("Executing testcase verify And SelectMessageQueues");
		log.info("****************************** starting test case : verify And SelectMessageQueues *****************************************");
		String ExpectedValue= "Application servers";                             
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifyApplicationServers")));        
		SoftAssertfunction(ActualValue, ExpectedValue);

		ApplicationServersPage.clickonAddApplicationServer();
		log.info("****************************** Ending test case : verify And SelectMessageQueues *****************************************");
	}

	@Test(priority = 2, dataProvider = "getTestDataApplicationServer", description= "CreatingApplicationServers")
	public void CreatedApplicationServers(String Name, String Exportpath,String Importpath)           
	{
		reporterLog("Verify Create Application Servers");
		log.info("****************************** starting test case : Create Application Servers *****************************************");
		ApplicationServersPage.createApplicationServer(Name,Exportpath,Importpath);        

		String ExpetedaddApplicationServersvalue = "Application server added"; 
		WebElement ActualaddApplicationServersvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextAddApplicationServer")));        
		SoftAssertfunction(ActualaddApplicationServersvalue, ExpetedaddApplicationServersvalue);

		log.info("****************************** Ending test case : Create Application Servers *****************************************");
	}

	@Test(priority = 3, description= "ActivatingApplicationServers")
	public void activationApplicationServers()             
	{
		reporterLog("Verify Activate Application Servers");
		log.info("****************************** starting test case : Activate Application Servers *****************************************");
		ApplicationServersPage.activateApplicationServer();

		String ExpectedActivatedASValue= "Application server activated";                        
		WebElement ActualActivatedASValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextactivateApplicationServer")));       
		SoftAssertfunction(ActualActivatedASValue, ExpectedActivatedASValue);

		log.info("****************************** Endting test case : Activate Application Servers *****************************************");
	}

	@Test(priority = 4, description= "DeactivatingApplicationServers")
	public void deactivednApplicationServers()
	{
		reporterLog("Verify Deactivate Application Servers");
		log.info("****************************** starting test case : Deactivate Application Servers *****************************************");
		ApplicationServersPage.deactivateApplicationServer();

		String ExpectedDeactivatedASValue= "Application server deactivated";                               
		WebElement ActualDeactivatedASValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextDeactivatedApplicationServer")));        
		SoftAssertfunction(ActualDeactivatedASValue, ExpectedDeactivatedASValue);

		log.info("****************************** Ending test case : Deactivate Application Servers *****************************************");
	}

	@Test(priority = 5, description= "EditionofApplicationServers")
	public void editionnApplicationServers( )
	{
		reporterLog("Verify Save Application Servers");
		log.info("****************************** starting test case : Save Application Servers *****************************************");
		ApplicationServersPage.editApplicationServer();

		String ExpectedEditedASValue= "Application server saved";                                 
		WebElement ActualEditedASValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextSaveApplicationServer")));  
		SoftAssertfunction(ActualEditedASValue, ExpectedEditedASValue);


		log.info("****************************** Ending test case : Edit Application Servers *****************************************");
	}                     

	@Test(priority = 6, description= "RemovingApplicationServer")
	public void removedApplicationServer()
	{
		reporterLog("Verify remove Application Servers");
		log.info("****************************** starting test case : remove Application Servers *****************************************");
		ApplicationServersPage.removeApplicationServer();

		String ExpectedRemovedASValue= "Application server removed";                        
		WebElement ActualRemovedASValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextremoveApplicationServer")));   
		SoftAssertfunction(ActualRemovedASValue, ExpectedRemovedASValue);

		log.info("****************************** Ending test case : remove Application Servers *****************************************");
	}
}
