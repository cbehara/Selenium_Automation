package com.ConnexoAdmin.testcases;

import com.ConnexoAdmin.pages.Certificates.AddCertificatesPage;
import com.base.base.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class CertificateFiltersApplyTest extends TestBase {
	Logger log = LogManager.getLogger(CertificateFiltersApplyTest.class);
	AddCertificatesPage addCertificatespage;

	public CertificateFiltersApplyTest()
	{
		super();
	}
	
	@Test(priority = 1, enabled = true, description = "verifyCreatedCertificateInAliasDropDownList")
	public void verifyCreatedCertificateInAliasDropDownList() 
	{	
		log.info("****************************** starting test case : verifyCreatedCertificateInAliasDropDownList *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage = new AddCertificatesPage();
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		
		assertTrue(addCertificatespage.isAliasDropdownValueCheckboxDisplayed(certificateName), "alias dropdown values option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyCreatedCertificateInAliasDropDownList *****************************************");
	}
	
	@Test(priority = 2, enabled = true, description = "verifyByClickApplyButton")
	public void verifyByClickApplyButton() 
	{	
		log.info("****************************** starting test case : verifyByClickApplyButton *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickApplyButton();
		
		assertEquals(addCertificatespage.getFirstRowValueFromResultsTableForAlias(), certificateName, "Value should match with alias dropdown value");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickApplyButton *****************************************");
	}
	
	@Test(priority = 3, enabled = true, description = "verifyByClickOnCreatedCertificateInAliasDropDownList")
	public void verifyClearButton() 
	{	
		log.info("****************************** starting test case : verifyByClickOnCreatedCertificateInAliasDropDownList *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickClearAllButton();
		
		assertNotEquals(addCertificatespage.getFirstRowValueFromResultsTableForAlias(), certificateName, "Value should not match when we clear filter");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickOnCreatedCertificateInAliasDropDownList *****************************************");
	}
	
	@Test(priority = 4, enabled = true, description = "verifyClearButtonEnable")
	public void verifyClearButtonEnable() 
	{	
		log.info("****************************** starting test case : verifyClearButtonEnable *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickClearAllButton();
		browserRefresh();
		
		assertFalse(addCertificatespage.isClearAllButtonSelected(), "Clear all button is disabled defaultly");
		
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyClearButtonEnable *****************************************");
	}
	
	@Test(priority = 5, enabled = true, description = "verifyKeyUsageDropDown")
	public void verifyKeyUsageDropDown() 
	{	
		log.info("****************************** starting test case : verifyKeyUsageDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickKeyUsageDropdown();
		
		assertTrue(addCertificatespage.isKeyUsageDropdownValueCheckboxDisplayed(), "key usage dropdown values option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyKeyUsageDropDown *****************************************");
	}
	
	@Test(priority = 6, enabled = true, description = "verifyByClickCheckboxInKeyUsageDropDown")
	public void verifyByClickCheckboxInKeyUsageDropDown() 
	{	
		log.info("****************************** starting test case : verifyByClickCheckboxInKeyUsageDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickKeyUsageDropdown();
		addCertificatespage.clickKeyUsageDropdownValueCheckbox();
		addCertificatespage.clickApplyButton();
		
		assertEquals(addCertificatespage.getAliasName(certificateName), certificateName, "after select checkbox in key usage dropdown value shoud display in results table");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickCheckboxInKeyUsageDropDown *****************************************");
	}
	
	@Test(priority = 7, enabled = true, description = "verifyIssuerDropDown")
	public void verifyIssuerDropDown() 
	{	
		log.info("****************************** starting test case : verifyIssuerDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickIssuerDropdown();
		
		assertTrue(addCertificatespage.isIssuerDropdownValueCheckboxDisplayed(), "Issuer dropdown values option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyIssuerDropDown *****************************************");
	}
	
	@Test(priority = 8, enabled = true, description = "verifyByClickCheckboxInIssuerDropDown")
	public void verifyByClickCheckboxInIssuerDropDown() 
	{	
		log.info("****************************** starting test case : verifyByClickCheckboxInIssuerDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickIssuerDropdown();
		addCertificatespage.clickIssuerDropdownValueCheckbox();
		addCertificatespage.clickApplyButton();
		
		assertEquals(addCertificatespage.getAliasName(certificateName), certificateName, "after select checkbox in issuer dropdown value shoud display in results table");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickCheckboxInIssuerDropDown *****************************************");
	}
	
	@Test(priority = 9, enabled = true, description = "verifySubjectDropDown")
	public void verifySubjectDropDown() 
	{	
		log.info("****************************** starting test case : verifySubjectDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickSubjectDropdown();
		
		assertTrue(addCertificatespage.isSubjectDropdownValueCheckboxDisplayed(), "subject dropdown values option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifySubjectDropDown *****************************************");
	}
	
	@Test(priority = 10, enabled = true, description = "verifyByClickCheckboxInSubjectDropDown")
	public void verifyByClickCheckboxInSubjectDropDown() 
	{	
		log.info("****************************** starting test case : verifyByClickCheckboxInSubjectDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickSubjectDropdown();
		addCertificatespage.clickSubjectDropdownValueCheckbox();
		addCertificatespage.clickApplyButton();
		String ExpectedValue = "CN=www.google.com";
		
		assertEquals(addCertificatespage.getFirstRowValueFromResultsTableForSubject(), ExpectedValue, "after select checkbox in subject dropdown value shoud display in results table");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickCheckboxInSubjectDropDown *****************************************");
	}
	
	@Test(priority = 11, enabled = true, description = "verifySubjectDropDown")
	public void verifyStatusDropDown() 
	{	
		log.info("****************************** starting test case : verifySubjectDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickStatusDropdown();
		
		assertTrue(addCertificatespage.isStatusDropdownValueCheckboxDisplayed(), "status dropdown values option should display");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifySubjectDropDown *****************************************");
	}
	
	@Test(priority = 12, enabled = true, description = "verifyByClickAvailableOptionCheckboxInStatusDropDown")
	public void verifyByClickAvailableOptionCheckboxInStatusDropDown() 
	{	
		log.info("****************************** starting test case : verifyByClickAvailableOptionCheckboxInStatusDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickApplyButton();
		addCertificatespage.clickStatusDropdown();
		addCertificatespage.clickStatusDropdownAvailableValueCheckbox();
		addCertificatespage.clickApplyButton();
		String ExpectedValue = "Available";
		
		assertEquals(addCertificatespage.getFirstRowValueFromResultsTableForStatus(), ExpectedValue, "after select available checkbox in status dropdown value shoud display in results table");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickAvailableOptionCheckboxInStatusDropDown *****************************************");
	}
	
	@Test(priority = 13, enabled = true, description = "verifyByClickObsoleteOptionCheckboxInStatusDropDown")
	public void verifyByClickObsoleteOptionCheckboxInStatusDropDown() 
	{	
		log.info("****************************** starting test case : verifyByClickObsoleteOptionCheckboxInStatusDropDown *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickApplyButton();
		addCertificatespage.clickCertificateActionIcon(certificateName);
		addCertificatespage.clickMarkAsObsoleteOption();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(certificateName);
		addCertificatespage.clickApplyButton();
		addCertificatespage.clickStatusDropdown();
		addCertificatespage.clickStatusDropdownObsoleteValueCheckbox();
		addCertificatespage.clickApplyButton();
		String ExpectedValue = "Obsolete";
		
		assertEquals(addCertificatespage.getFirstRowValueFromResultsTableForStatus(), ExpectedValue, "after select obsolete checkbox in status dropdown value shoud display in results table");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyByClickObsoleteOptionCheckboxInStatusDropDown *****************************************");
	}
	
	@Test(priority = 14, enabled = true, description = "verifyBulkActionButton")
	public void verifyBulkActionButton() 
	{	
		log.info("****************************** starting test case : verifyBulkActionButton *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickBulkActionButton();
		String ExpectedValue = "Bulk action";
		
		assertEquals(addCertificatespage.getBulkActionHeadingText(), ExpectedValue, "after clicking on bulk action button it should navigate to bulk action page");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		log.info("****************************** Ending test case : verifyBulkActionButton *****************************************");
	}
	
	@Test(priority = 15, enabled = true, description = "verifyByClickOnCreatedCertificateInAliasDropDownList")
	public void verifyByClickOnCreatedCertificateInAliasDropDownList() 
	{	
		log.info("****************************** starting test case : verifyByClickOnCreatedCertificateInAliasDropDownList *****************************************");
		String certificateName = "AB" + generateRandomNumber(4);
		String newCertificateName = certificateName + generateRandomNumber(2);
		browserRefresh();
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(newCertificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickOnAddCertificateAction();
		addCertificatespage.updateAliasName(certificateName);
		addCertificatespage.importCertificateFromAddCertificate();
		addCertificatespage.clickAddButton();
		browserRefresh();
		addCertificatespage.clickAliasDropdown();
		addCertificatespage.clickAliasDropdownValueCheckbox(newCertificateName);
		
		assertNotEquals(addCertificatespage.getFirstRowValueFromResultsTableForAlias(), newCertificateName, "Value should not apply before click on apply button");
		
		browserRefresh();
		addCertificatespage.removeAddedCertificate(certificateName);
		browserRefresh();
		addCertificatespage.removeAddedCertificate(newCertificateName);
		log.info("****************************** Ending test case : verifyByClickOnCreatedCertificateInAliasDropDownList *****************************************");
	}
	
}
