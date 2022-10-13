package com.ConnexoAdmin.testcases;

import com.ConnexoAdmin.pages.KeyPair.AddKeypairsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeypairsTest extends TestBase {

	Logger log = LogManager.getLogger(KeypairsTest.class);
	
	String keypairssheet = "Keypairs";	
	
	AddKeypairsPage addKeypairsPage;		

	public KeypairsTest()
	{
		super();
	}	
	
	@DataProvider(name = "dp1")
	public Object[][] getTestDataForKeypairs() {
		
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(keypairssheet);
		return testData;
	}

	@Test(priority = 1, enabled = true, description ="Verify Navigation to Keypairs page")	
	public void verifyNavigationToKeypairsPage() 
	{		
		addKeypairsPage = new AddKeypairsPage();   
		
		reporterLog("Verify Navigation to Keypairs page");
		
		log.info("************ starting test case : Navigate to Keypairs page **********************");		
		
		addKeypairsPage.navigatetoKeypairsPage();
		
		waitForTime(1000);
		
		log.info("Asserting Keypairs page title");
		
		String ExpectedKeyPairValue= "Key pairs";
		
		WebElement ActualKeyPairValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleKeypairsPageTitle")));
		
		SoftAssertfunction(ActualKeyPairValue, ExpectedKeyPairValue);

		addKeypairsPage.clickgenerateKeypairs();

		log.info("************* Ending test case : Navigate to Keypairs page **********************");
	}

	@Test(priority = 2, dataProvider = "dp1", enabled = true, description ="Generate Keypairs")	
	public void generateKeypairs(String strStorageMethod, String strKeyType) 
	{			
		reporterLog("Verify Generate keys");
		
		log.info("************** starting test case : Generate key **************************");		
		
		waitForTime(1000);		

		log.info("Asserting Generate Keypairs page title");
		
		String ExpectedGenKeyPairValue= "Generate key pair";
		
		WebElement ActualGenKeyPairValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairPageTitle")));
		
		SoftAssertfunction(ActualGenKeyPairValue, ExpectedGenKeyPairValue);

		log.info("Adding Key pair details");
		
		addKeypairsPage.generateKeypairs(strStorageMethod, strKeyType);
		
		log.info("Asserting Add Certificate page title");
		
		waitForTime(2000);	
		
		log.info("Asserting Generation of key pairs message");
		
		String ExpectedKeypairMsg = "Key pair generated";
		
		WebElement ActualKeypairMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_msgkeypairGenerated")));
		
		SoftAssertfunction(ActualKeypairMsg, ExpectedKeypairMsg);

		log.info("*************** Ending test case : Generate key *************************");
	}

	@Test(priority = 3, dataProvider = "dp1", enabled = true, description ="Download generated Keypairs")
	public void downloadKeypair(String strStorageMethod, String strKeyType) 
	{			
		reporterLog("Download Generated Keypair");		
		
		log.info("*************** starting test case : Download Generated Keypair *****************");	
		
		waitForTime(1000);	

		addKeypairsPage.downloadPublicKey();
		
		waitForTime(1000);   	

		log.info("*************** Ending test case : Download Generated Keypair ********************");
	}

	@Test(priority = 4, dataProvider = "dp1")	
	public void removeKeypair(String strStorageMethod, String strKeyType) 
	{		
		reporterLog("Remove Generated Keypair");		
		
		log.info("**************** starting test case : Remove Generated Keypair *******************");

		addKeypairsPage.removeKeypair();
		
		log.info("Asserting remove Certificate message");
		
		waitForTime(1000);
		
		String ExpectedKeypairMsg = "Key pair removed";
		
		WebElement ActualKeypairMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_msgkeypairRemoved")));
		
		SoftAssertfunction(ActualKeypairMsg, ExpectedKeypairMsg);

		log.info("**************** Ending test case : Remove Generated Keypair ********************");
	}		
}
