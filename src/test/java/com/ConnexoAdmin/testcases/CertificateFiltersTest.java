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


public class CertificateFiltersTest extends TestBase {
	Logger log = LogManager.getLogger(CertificateFiltersTest.class);
	AddCertificatesPage addCertificatespage;

	public CertificateFiltersTest()
	{
		super();
	}
	
	@Test(priority = 1, enabled = true, description = "verifyCertificateErrorMessage")
	public void verifyCertificateErrorMessage() 
	{	
		log.info("****************************** starting test case : verifyCertificateErrorMessage *****************************************");
		addCertificatespage = new AddCertificatesPage();
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName("icbwcywuiyci");
		addCertificatespage.clickAddButton();
		String expectedValue = "This field is required";
		
		assertEquals(addCertificatespage.getCertificateErrorMessage(), expectedValue, "error message should be match");
		
		addCertificatespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyCertificateErrorMessage *****************************************");
	}
	
	@Test(priority = 2, enabled = true, description = "verifyAliasErrorMessage")
	public void verifyAliasErrorMessage() 
	{	
		log.info("****************************** starting test case : verifyAliasErrorMessage *****************************************");
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		String expectedValue = "This field is required";
		
		assertEquals(addCertificatespage.getAliasErrorMessage(), expectedValue, "error message should be match");
		
		addCertificatespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyAliasErrorMessage *****************************************");
	}
	
	@Test(priority = 3, enabled = true, description = "verifErrorMessages")
	public void verifyErrorMessages() 
	{	
		log.info("****************************** starting test case : verifErrorMessages *****************************************");
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.clickAddButton();
		String expectedValue = "This field is required";
		
		assertEquals(addCertificatespage.getAliasErrorMessage(), expectedValue, "error message should be match");
		assertEquals(addCertificatespage.getCertificateErrorMessage(), expectedValue, "error message should be match");
		
		addCertificatespage.clickCancelButton();
		log.info("****************************** Ending test case : verifErrorMessages *****************************************");
	}
	
	@Test(priority = 4, enabled = true, description = "verifCancelButtonForAddCertificate")
	public void verifyCancelButtonForAddCertificate() 
	{	
		log.info("****************************** starting test case : verifCancelButtonForAddCertificate *****************************************");
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.clickCancelButton();
		
		assertTrue(addCertificatespage.isAddCertificateActionDisplayed(), "Page should navigate to certificates page from add certificates page");
		
		log.info("****************************** Ending test case : verifCancelButtonForAddCertificate *****************************************");
	}
	
	@Test(priority = 5, enabled = true, description = "verifMarkAsObsoleteOption")
	public void verifyMarkAsObsoleteOption() 
	{	
		log.info("****************************** starting test case : verifMarkAsObsoleteOption *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		
		assertTrue(addCertificatespage.isMarkAsObsoleteOptionDisplayed(), "mark as obsolete option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifMarkAsObsoleteOption *****************************************");
	}
	
	@Test(priority = 6, enabled = true, description = "verifyCertificateAfterMarkAsObsoleteStatus")
	public void verifyCertificateAfterMarkAsObsoleteStatus() 
	{	
		log.info("****************************** starting test case : verifyCertificateAfterMarkAsObsoleteStatus *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickMarkAsObsoleteOption();
		
		assertEquals(addCertificatespage.getCertificateStatus(certificateName), "Obsolete", "certificate status should be obsolete");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCertificateAfterMarkAsObsoleteStatus *****************************************");
	}
	
	@Test(priority = 7, enabled = true, description = "verifyUnMarkAsObsoleteOption")
	public void verifyUnMarkAsObsoleteOption() 
	{	
		log.info("****************************** starting test case : verifyUnMarkAsObsoleteOption *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickMarkAsObsoleteOption();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		
		assertTrue(addCertificatespage.isUnMarkObsoleteOptionDisplayed(), "unmark obsolete option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyUnMarkAsObsoleteOption *****************************************");
	}
	
	@Test(priority = 8, enabled = true, description = "verifyCertificateAfterUnMarkObsoleteStatus")
	public void verifyCertificateAfterUnMarkObsoleteStatus() 
	{	
		log.info("****************************** starting test case : verifyCertificateAfterUnMarkObsoleteStatus *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickMarkAsObsoleteOption();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickUnMarkAsObsoleteOption();
		
		assertEquals(addCertificatespage.getCertificateStatus(certificateName), "Available", "certificate status should be available");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCertificateAfterUnMarkObsoleteStatus *****************************************");
	}
	
	@Test(priority = 9, enabled = true, description = "verifyRemoveOption")
	public void verifyRemoveOption() 
	{	
		log.info("****************************** starting test case : verifyRemoveOption *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		
		assertTrue(addCertificatespage.isRemoveOptionDisplayed(), "remove option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyRemoveOption *****************************************");
	}
	
	@Test(priority = 10, enabled = true, description = "verifyClickRemoveOption")
	public void verifyByClickingRemoveOption() 
	{	
		log.info("****************************** starting test case : verifyClickRemoveOption *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickRemoveOption();
		
		assertTrue(addCertificatespage.isRemovePopupDisplayed(), "remove popup window should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyClickRemoveOption *****************************************");
	}
	
	@Test(priority = 11, enabled = true, description = "verifyCancelButtonForRemovePopup")
	public void verifyCancelButtonForRemovePopup() 
	{	
		log.info("****************************** starting test case : verifyCancelButtonForRemovePopup *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickRemoveOption();
		addCertificatespage.clickCancelButtonInRemoveWindow();
		
		assertTrue(addCertificatespage.isAliasNameDisplayed(certificateName), "certificate Should display after click cancel in remove popup window");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCancelButtonForRemovePopup *****************************************");
	}
	
	@Test(priority = 12, enabled = true, description = "verifyCrossIconForRemovePopup")
	public void verifyCrossIconForRemovePopup() 
	{	
		log.info("****************************** starting test case : verifyCrossIconForRemovePopup *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickRemoveOption();
		addCertificatespage.clickCrossIconInRemoveWindow();
		
		assertTrue(addCertificatespage.isAliasNameDisplayed(certificateName), "certificate Should display after click cancel in remove popup window");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCrossIconForRemovePopup *****************************************");
	}

	@Test(priority = 13, enabled = true, description = "verifyCancelButtonForRemovePopup")
	public void verifyRemoveButtonForRemovePopup() 
	{	
		log.info("****************************** starting test case : verifyCancelButtonForRemovePopup *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickRemoveOption();
		addCertificatespage.clickRemoveButtonInRemoveWindow();
		String ExpectedValue= "Certificate removed";
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_certificateRemoveMessage")));
		
		SoftAssertfunction(ActualValue, ExpectedValue);
		
		log.info("****************************** Ending test case : verifyCancelButtonForRemovePopup *****************************************");
	}
	
}
