package com.ConnexoAdmin.testcases;

import com.ConnexoAdmin.pages.Certificates.AddCertificatesPage;
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


public class CertificatesTest extends TestBase {

	Logger log = LogManager.getLogger(CertificatesTest.class);
	
	String certificatesSheet = "CertificatesSheet";	
	
	AddCertificatesPage addCertificatesPage;
		

	public CertificatesTest()
	{
		super();
	}
	
	@DataProvider(name = "dp1")
	public Object[][] getTestDataForCertficates() 
	{
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(certificatesSheet);
		
		return testData;
	}

	@Test(priority = 1)	
	public void verifyNavigationToCertificatesPage() 
	{	
		addCertificatesPage = new AddCertificatesPage();
		
		reporterLog("Verify Navigation to Certifications page");
		
		log.info("****************************** starting test case : Navigate to Certificates page *****************************************");
		
		waitForTime(1000);
		
		log.info("Asserting Certificate page title");
		
		String ExpectedValue= "Certificates";
		
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle")));
		
		SoftAssertfunction(ActualValue, ExpectedValue);
		
		log.info("****************************** Ending test case : Navigate to Certificates page *****************************************");
	}

	@Test(priority = 2, dataProvider = "dp1")	
	public void AddCertificate(String strfilePath) 
	{		
		reporterLog("Verify Add Certificate");
		
		log.info("****************************** starting test case : Add Certificate *****************************************");

		addCertificatesPage.clickOnAddCertificateAction();
		
		log.info("Asserting Add Certificate page title");
		
		waitForTime(1000);	
		
		String ExpectedValue = "Add certificate";
		
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName")));
		
		SoftAssertfunction(ActualValue, ExpectedValue);

		addCertificatesPage.importcertificate(strfilePath);
		
		log.info("Asserting import Certificate message");
		
		String ExpectedImportMsg = "Certificate imported";
		
		WebElement ActualImportMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_msgCertificateImport")));
		
		SoftAssertfunction(ActualImportMsg, ExpectedImportMsg);

		log.info("****************************** Ending test case : Add Certificate *****************************************");
	}

	@Test(priority = 3, dataProvider = "dp1")	
	public void RevokeCertificate(String strfilePath) 
	{			
		reporterLog("Verify Revoke Certificate");
		
		log.info("****************************** starting test case : Revoke Certificate *****************************************");

		addCertificatesPage.revokeCertificate();
		
		log.info("Asserting revoke Certificate message");
		
		waitForTime(1000);	
		
		String ExpectedRevokeMsg = "Certificate revoked";
		
		WebElement ActualRevokeMsg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_msgCertificateRevoke")));
		
		SoftAssertfunction(ActualRevokeMsg, ExpectedRevokeMsg);

		log.info("****************************** Ending test case : Revoke Certificate *****************************************");
	}

}
