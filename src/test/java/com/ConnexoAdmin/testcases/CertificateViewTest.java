package com.ConnexoAdmin.testcases;

import com.ConnexoAdmin.pages.Certificates.AddCertificatesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class CertificateViewTest extends TestBase {
	Logger log = LogManager.getLogger(CertificateViewTest.class);
	AddCertificatesPage addCertificatespage;

	public CertificateViewTest()
	{
		super();
	}

	@Test(priority = 1, enabled = true, description = "verifyByClickingRemoveOptionInCertificatePage")
	public void verifyByClickingRemoveOptionInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyByClickingRemoveOptionInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage = new AddCertificatesPage();
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickRemoveOptionForCertificatePage();
		
		assertTrue(addCertificatespage.isRemovePopupDisplayed(), "remove popup window should display");
		
		browserRefresh();
		addCertificatespage.removeCertificateFromViewPage(certificateName);
		log.info("****************************** Ending test case : verifyByClickingRemoveOptionInCertificatePage *****************************************");
	}
	
	@Test(priority = 2, enabled = true, description = "verifyByClickingRemoveOptionInCertificatePage")
	public void verifyCancelButtonForRemovePopupInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyByClickingRemoveOptionInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickRemoveOptionForCertificatePage();
		addCertificatespage.clickCancelButtonForCertificatePage();
		
		assertTrue(addCertificatespage.isAliasNameDisplayedInCertificatePage(certificateName), "certificate Should display after click cancel in remove popup window");
		
		browserRefresh();
		addCertificatespage.removeCertificateFromViewPage(certificateName);
		log.info("****************************** Ending test case : verifyByClickingRemoveOptionInCertificatePage *****************************************");
	}
	
	@Test(priority = 3, enabled = true, description = "verifyCrossIconForRemovePopupInCertificatePage")
	public void verifyCrossIconForRemovePopupInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyCrossIconForRemovePopupInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickRemoveOptionForCertificatePage();
		addCertificatespage.clickCrossIconForCertificatePage();
		
		assertTrue(addCertificatespage.isAliasNameDisplayedInCertificatePage(certificateName), "certificate Should display after click cancel in remove popup window");
		
		browserRefresh();
		addCertificatespage.removeCertificateFromViewPage(certificateName);
		log.info("****************************** Ending test case : verifyCrossIconForRemovePopupInCertificatePage *****************************************");
	}

	@Test(priority = 4, enabled = true, description = "verifyRemoveButtonForRemovePopupInCertificatePage")
	public void verifyRemoveButtonForRemovePopupInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyRemoveButtonForRemovePopupInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickRemoveOptionForCertificatePage();
		addCertificatespage.clickRemoveButtonForCertificatePage();
		String ExpectedValue= "Certificate removed";
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_certificateRemoveMessage")));
		
		SoftAssertfunction(ActualValue, ExpectedValue);
		
		log.info("****************************** Ending test case : verifyRemoveButtonForRemovePopupInCertificatePage *****************************************");
	}
	
	@Test(priority = 5, enabled = true, description = "verifyMarkAsObsoleteOptionInCertificatePage")
	public void verifyMarkAsObsoleteOptionInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyMarkAsObsoleteOptionInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		
		assertTrue(addCertificatespage.isMarkAsObsoleteOptionDisplayed(), "mark as obsolete option should display");
		
		browserRefresh();
		addCertificatespage.removeCertificateFromViewPage(certificateName);
		log.info("****************************** Ending test case : verifyMarkAsObsoleteOptionInCertificatePage *****************************************");
	}
	
	@Test(priority = 6, enabled = true, description = "verifyCertificateAfterMarkAsObsoleteStatusInCertificatePage")
	public void verifyCertificateAfterMarkAsObsoleteStatusInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyCertificateAfterMarkAsObsoleteStatusInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickMarkAsObsoleteOption();
		
		assertEquals(addCertificatespage.getCertificateStatus(certificateName), "Obsolete", "certificate status should be obsolete");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCertificateAfterMarkAsObsoleteStatusInCertificatePage *****************************************");
	}
	
	@Test(priority = 7, enabled = true, description = "verifUnMarkAsObsoleteOptionInCertificatePage")
	public void verifUnMarkAsObsoleteOptionInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifUnMarkAsObsoleteOptionInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickMarkAsObsoleteOption();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		
		assertTrue(addCertificatespage.isUnMarkObsoleteOptionDisplayed(), "unmark obsolete option should display");
		
		browserRefresh();
		addCertificatespage.removeCertificateFromViewPage(certificateName);
		log.info("****************************** Ending test case : verifUnMarkAsObsoleteOptionInCertificatePage *****************************************");
	}
	
	@Test(priority = 8, enabled = true, description = "verifyCertificateAfterUnMarkObsoleteStatusInCertificatePage")
	public void verifyCertificateAfterUnMarkObsoleteStatusInCertificatePage() 
	{	
		log.info("****************************** starting test case : verifyCertificateAfterUnMarkObsoleteStatusInCertificatePage *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickMarkAsObsoleteOption();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		addCertificatespage.clickActionIconInCertificatePage();
		addCertificatespage.clickUnMarkAsObsoleteOption();
		
		assertEquals(addCertificatespage.getCertificateStatus(certificateName), "Available", "certificate status should be available");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCertificateAfterUnMarkObsoleteStatusInCertificatePage *****************************************");
	}
	
	@Test(priority = 9, enabled = true, description = "verifyClickOnCertificateAlias")
	public void verifyClickOnCertificateAlias() 
	{	
		log.info("****************************** starting test case : verifyClickOnCertificateAlias *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickOnCertificateAliasLink(certificateName);
		
		assertEquals(addCertificatespage.getAliasNameInCertificatePage(certificateName), certificateName, "certificate name and alias name in certificate page should match");
		
		browserRefresh();
		addCertificatespage.removeCertificateFromViewPage(certificateName);
		log.info("****************************** Ending test case : verifyClickOnCertificateAlias *****************************************");
	}
	
}
