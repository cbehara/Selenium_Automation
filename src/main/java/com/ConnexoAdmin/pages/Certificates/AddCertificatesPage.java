package com.ConnexoAdmin.pages.Certificates;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class AddCertificatesPage extends TestBase {	
	
	String strAlias = generateRandomNumber(4);
		
	public AddCertificatesPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(3000);
		waitForTime(500);
		WebElement eleCertificatesHyperLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleCertificatesHyperLink")));
		TestUtil.waitforElementTobeLocated(eleCertificatesHyperLink, 30);		
		waitForTime(500);
		doClick(eleCertificatesHyperLink);
		waitForTime(500);
	}	
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
	
	public void navigatetoCertificatesPage()	
	{
		
	}
	
	 public String gettextOfCertificatesPage()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle, 30);
		ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle.isDisplayed();
		return getText(ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle);
	}	
		
	public void clickOnAddCertificateAction()	
	{
		browserRefresh();
		if (isDisplayed("ConnexoAdmin_AddCertificatePage_eleActionButton")){
			waitForTime(3000);
			WebElement ConnexoAdmin_AddCertificatePage_eleActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleActionButton")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleActionButton, 30);
			doClick(ConnexoAdmin_AddCertificatePage_eleActionButton);
			waitForTime(500);
			WebElement ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu,10);
			doClick(ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu);
			waitForTime(5000);
		}
		else
		{
			WebElement ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn, 30);
			doClick(ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn);
			waitForTime(5000);
		}
	}
	
	public boolean isAddCertificateActionDisplayed()	
	{
		WebElement ConnexoAdmin_AddCertificatePage_eleActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleActionButton")));
		return ConnexoAdmin_AddCertificatePage_eleActionButton.isDisplayed();
	}
	
	public boolean isMarkAsObsoleteOptionDisplayed()	
	{
		WebElement MarkAsObsoleteOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_markAsObsoleteOption")));
		return MarkAsObsoleteOption.isDisplayed();
	}
	
	public void clickMarkAsObsoleteOption()	
	{
		WebElement MarkAsObsoleteOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_markAsObsoleteOption")));
		TestUtil.waitforElementTobeLocated(MarkAsObsoleteOption, 10);
		doClick(MarkAsObsoleteOption);
	}
	
	public boolean isUnMarkObsoleteOptionDisplayed()	
	{
		WebElement unMarkAsObsoleteOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_unMarkObsoleteOption")));
		return unMarkAsObsoleteOption.isDisplayed();
	}
	
	public void clickUnMarkAsObsoleteOption()	
	{
		WebElement unMarkAsObsoleteOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_unMarkObsoleteOption")));
		TestUtil.waitforElementTobeLocated(unMarkAsObsoleteOption, 10);
		doClick(unMarkAsObsoleteOption);
	}
   	
    public String gettextOfAddCertificatesPage()
	{		
    	WebElement ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName")));
    	TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName, 30);
		waitForTime(500);		
		ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName.isDisplayed();
		return getText(ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName);
	}
    
    public String getFile()
	{
		return new File("./Generic-Library/Certificates/AppCert.cert").getAbsolutePath();
	}
    
    public String uploadCertificatePath()
	{
		return new File("./Generic-Library/Certificates/Google.cert").getAbsolutePath();
	}
    
	public void importcertificate(String strfilePath)
	{	
		try {
			 String strCertName = "TestCert" + strAlias; 
			 /*String currentDir = System.getProperty("user.dir"); String exeFilepath = currentDir +
			 * "\\Generic-Library\\Executables\\FileUpload.exe";
			 */
			WebElement ConnexoAdmin_AddCertificatePage_eleAliasInputBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAliasInputBox")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAliasInputBox, 30);
			sendkeys(strCertName, ConnexoAdmin_AddCertificatePage_eleAliasInputBox);
			waitForTime(500);			
			WebElement ConnexoAdmin_AddCertificatePage_eleSelectFileButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleSelectFileButton")));
			//doClick(ConnexoAdmin_AddCertificatePage_eleSelectFileButton);
			sendkeys(getFile(), ConnexoAdmin_AddCertificatePage_eleSelectFileButton);
			/*
			 * try { Runtime.getRuntime().exec(exeFilepath+" "+strfilePath); } catch
			 * (IOException e) { e.printStackTrace(); }
			 */
			waitForTime(5000);
			WebElement ConnexoAdmin_AddCertificatePage_eleAddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddButton")));
			WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ConnexoAdmin_AddCertificatePage_eleAddButton));			
			doClick(ConnexoAdmin_AddCertificatePage_eleAddButton);
		}
		catch(Exception e)
		{			
			e.printStackTrace();
		}
	}
	
	public void updateAliasName(String strCertName) {
		browserRefresh();
		waitForTime(2000);
		WebElement ConnexoAdmin_AddCertificatePage_eleAliasInputBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAliasInputBox")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAliasInputBox, 10);
		doClear(ConnexoAdmin_AddCertificatePage_eleAliasInputBox);
		sendkeys(strCertName, ConnexoAdmin_AddCertificatePage_eleAliasInputBox);
	}
	
	public void importCertificateFromAddCertificate()
	{
		WebElement ConnexoAdmin_AddCertificatePage_eleSelectFileButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleSelectFileButton")));
		doClear(ConnexoAdmin_AddCertificatePage_eleSelectFileButton);
		sendkeys(uploadCertificatePath(), ConnexoAdmin_AddCertificatePage_eleSelectFileButton);
	}
	
	public void clickAddButton()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_AddCertificatePage_eleAddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddButton")));
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ConnexoAdmin_AddCertificatePage_eleAddButton));			
		doClick(ConnexoAdmin_AddCertificatePage_eleAddButton);
	}
	
	public String getCertificateErrorMessage()
	{
		waitForTime(5000);
		WebElement UpdatedDate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_certificateErrorMessage")));
		return UpdatedDate.getText();
	}
	
	public String getAliasErrorMessage()
	{
		waitForTime(5000);
		WebElement UpdatedDate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_aliasErrorMessage")));
		return UpdatedDate.getText();
	}
	
	public void clickCancelButton()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_AddCertificatePage_eleAddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleCancelLink")));
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ConnexoAdmin_AddCertificatePage_eleAddButton));			
		doClick(ConnexoAdmin_AddCertificatePage_eleAddButton);
	}
	
	public void revokeCertificate()
	{
		String strName = "TestCert" + strAlias;
		waitForTime(8000);		
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		WebElement eleRevokeCertificate = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()=\""+ strName +"\"]//ancestor::td//following::td[5]//div//span"));
		TestUtil.waitforElementTobeLocated(eleRevokeCertificate, 50);
		eleRevokeCertificate.click();
		waitForTime(5000);
		WebElement ConnexoAdmin_AddCertificatePage_btnRevoke = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_btnRevoke")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_btnRevoke, 50);
		doClick(ConnexoAdmin_AddCertificatePage_btnRevoke);
		waitForTime(3000);
		WebElement ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation, 30);
		doClick(ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation);
		WebElement ConnexoAdmin_AddCertificatePage_msgCertificateRevoke = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_msgCertificateRevoke")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_msgCertificateRevoke, 30);		
	}
	
	public void removeAddedCertificate(String strName)
	{
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()=\""+ strName +"\"]//ancestor::td//following::td[5]//div//span"));
		TestUtil.waitforElementTobeLocated(actionIcon, 10);
		doClick(actionIcon);
		waitForTime(5000);
		WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeOption")));
		TestUtil.waitforElementTobeLocated(removeOption, 10);			
		doClick(removeOption);
		waitForTime(5000);
		WebElement removeButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(removeButton, 10);			
		doClick(removeButton);
	}
	
	public void clickRemoveOption()	
	{
		waitForTime(5000);
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeOption")));
		TestUtil.waitforElementTobeLocated(RemoveOption, 10);
		doClick(RemoveOption);
	}
	
	public void clickRemoveButtonInRemoveWindow() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickCancelButtonInRemoveWindow() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_cancelButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickCrossIconInRemoveWindow() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_crossButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public boolean isRemoveOptionDisplayed()	
	{
		WebElement MarkAsObsoleteOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeOption")));
		return MarkAsObsoleteOption.isDisplayed();
	}
	
	public boolean isRemovePopupDisplayed() {
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_certificateRemoveWindow")));
		return certificateAlias.isDisplayed();
	}
	
	public void clickActionIconInCertificatePage() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_actionDropdownInCertificateViewPage")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void removeCertificateFromViewPage(String strName)
	{
		waitForTime(5000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_actionDropdownInCertificateViewPage")));
		TestUtil.waitforElementTobeLocated(actionIcon, 10);
		doClick(actionIcon);
		waitForTime(5000);
		WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeOptionInCertificatePage")));
		TestUtil.waitforElementTobeLocated(removeOption, 10);			
		doClick(removeOption);
		waitForTime(5000);
		WebElement removeButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeButtonInRemoveWindowForCertificatePage")));
		TestUtil.waitforElementTobeLocated(removeButton, 10);			
		doClick(removeButton);
		waitForTime(5000);
	}
	
	public void clickRemoveOptionForCertificatePage() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeOptionInCertificatePage")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickRemoveButtonForCertificatePage() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_removeButtonInRemoveWindowForCertificatePage")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickCancelButtonForCertificatePage() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_cancelButtonInRemoveWindowForCertificatePage")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickCrossIconForCertificatePage() {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_crossIconInRemoveWindowForCertificatePage")));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickCertificateActionIcon(String strName) {
		waitForTime(5000);
		WebElement certificateActionIcon = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()='"+ strName +"']//ancestor::td//following::td[5]//div//span"));
		TestUtil.waitforElementTobeLocated(certificateActionIcon, 10);
		doClick(certificateActionIcon);
	}
	
	public void clickOnCertificateAliasLink(String strName) {
		waitForTime(5000);
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()='"+ strName +"']"));
		TestUtil.waitforElementTobeLocated(certificateAlias, 10);
		doClick(certificateAlias);
	}
	
	public void clickAliasDropdown() {
		waitForTime(5000);
		if (isDisplayed("ConnexoAdmin_AddCertificatePage_aliasDropdown")) {
			WebElement AliasDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_aliasDropdown")));
			TestUtil.waitforElementTobeLocated(AliasDropdown, 10);
			doClick(AliasDropdown);
		}
		else {
			navigateBackToPreviousPage();
			WebElement AliasDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_aliasDropdown")));
			TestUtil.waitforElementTobeLocated(AliasDropdown, 10);
			doClick(AliasDropdown);
		}
		
	}

	public void clickAliasDropdownValueCheckbox(String strName) {
		waitForTime(5000);
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(), '"+ strName +"')]//img"));
		TestUtil.waitforElementTobeLocated(certificateAlias, 10);
		doClick(certificateAlias);
	}
	
	public boolean isAliasDropdownValueCheckboxDisplayed(String strName) {
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(), '"+ strName +"')]//img"));
		return certificateAlias.isDisplayed();
	}
	
	public void clickKeyUsageDropdown() {
		waitForTime(5000);
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_keyUsageDropdown")));
		TestUtil.waitforElementTobeLocated(KeyUsageDropdown, 10);
		doClick(KeyUsageDropdown);
	}

	public void clickKeyUsageDropdownValueCheckbox() {
		waitForTime(5000);
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_keyUsageDropdownDigitalSignatureCheckBox")));
		TestUtil.waitforElementTobeLocated(KeyUsageDropdown, 10);
		doClick(KeyUsageDropdown);
	}
	
	public boolean isKeyUsageDropdownValueCheckboxDisplayed() {
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_keyUsageDropdownDigitalSignatureCheckBox")));
		return KeyUsageDropdown.isDisplayed();
	}
	
	public void clickIssuerDropdown() {
		waitForTime(5000);
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_issuerDropdown")));
		TestUtil.waitforElementTobeLocated(KeyUsageDropdown, 10);
		doClick(KeyUsageDropdown);
	}

	public void clickIssuerDropdownValueCheckbox() {
		waitForTime(5000);
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_issuerDropdownGoogleCheckbox")));
		TestUtil.waitforElementTobeLocated(KeyUsageDropdown, 10);
		doClick(KeyUsageDropdown);
	}
	
	public boolean isIssuerDropdownValueCheckboxDisplayed() {
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_issuerDropdownGoogleCheckbox")));
		return KeyUsageDropdown.isDisplayed();
	}
	
	public void clickSubjectDropdown() {
		waitForTime(5000);
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_subjectDropdown")));
		TestUtil.waitforElementTobeLocated(KeyUsageDropdown, 10);
		doClick(KeyUsageDropdown);
	}

	public void clickSubjectDropdownValueCheckbox() {
		waitForTime(5000);
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_subjectDropdownGoogleLinkCheckbox")));
		TestUtil.waitforElementTobeLocated(KeyUsageDropdown, 10);
		doClick(KeyUsageDropdown);
	}
	
	public boolean isSubjectDropdownValueCheckboxDisplayed() {
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_subjectDropdownGoogleLinkCheckbox")));
		return KeyUsageDropdown.isDisplayed();
	}
	
	public void clickStatusDropdown() {
		waitForTime(5000);
		WebElement StatusDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_statusDropdown")));
		TestUtil.waitforElementTobeLocated(StatusDropdown, 10);
		doClick(StatusDropdown);
	}

	public void clickStatusDropdownAvailableValueCheckbox() {
		waitForTime(3000);
		WebElement StatusDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_statusDropdownAvailableCheckbox")));
		TestUtil.waitforElementTobeLocated(StatusDropdown, 10);
		doClick(StatusDropdown);
	}
	
	public void clickStatusDropdownObsoleteValueCheckbox() {
		waitForTime(3000);
		WebElement StatusDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_statusDropdownObsoleteCheckbox")));
		TestUtil.waitforElementTobeLocated(StatusDropdown, 10);
		doClick(StatusDropdown);
	}
	
	public boolean isStatusDropdownValueCheckboxDisplayed() {
		WebElement KeyUsageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_statusDropdownObsoleteCheckbox")));
		return KeyUsageDropdown.isDisplayed();
	}
	
	public void clickApplyButton() {
		waitForTime(5000);
		WebElement ApplyButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_ApplyButton")));
		TestUtil.waitforElementTobeLocated(ApplyButton, 10);
		doClick(ApplyButton);
	}
	
	public void clickClearAllButton() {
		waitForTime(3000);
		WebElement ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_clearallButtons")));
		TestUtil.waitforElementTobeLocated(ClearAllButton, 10);
		doClick(ClearAllButton);
	}
	
	public boolean isClearAllButtonSelected() {
		WebElement ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_clearallButtons")));
		return ClearAllButton.isSelected();
	}
	
	public String getFirstRowValueFromResultsTableForAlias() {
		WebElement result = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_aliasValueFromTableResultForFirstRow")));
		return result.getText();
	}
	
	public String getFirstRowValueFromResultsTableForStatus() {
		WebElement result = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_statusValueFromTableResultForFirstRow")));
		return result.getText();
	}
	
	public String getFirstRowValueFromResultsTableForSubject() {
		WebElement result = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_subjectValueFromTableResultForFirstRow")));
		return result.getText();
	}
	
	public String getFirstRowValueFromResultsTableForIssuer() {
		WebElement result = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_issuerValueFromTableResultForFirstRow")));
		return result.getText();
	}
	
	
	public String getAliasName(String strName) {
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()='"+ strName +"']"));
		return certificateAlias.getText();
	}
	
	public String getAliasNameInCertificatePage(String strName) {
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//div[@role='textbox'][normalize-space()='"+ strName +"']"));
		return certificateAlias.getText();
	}
	
	public boolean isAliasNameDisplayed(String strName) {
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()='"+ strName +"']"));
		return certificateAlias.isDisplayed();
	}
	
	public boolean isAliasNameDisplayedInCertificatePage(String strName) {
		WebElement certificateAlias = DriverUtility.getDriver().findElement(By.xpath("//div[@role='textbox'][normalize-space()='"+ strName +"']"));
		return certificateAlias.isDisplayed();
	}
	
	public String getCertificateStatus(String strName) {
		WebElement status = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()='"+ strName +"']//ancestor::td//following::td[3]//div"));
		return status.getText();
	}
	
	public void clickBulkActionButton() {
		waitForTime(5000);
		WebElement BulkActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_BulkActionButton")));
		TestUtil.waitforElementTobeLocated(BulkActionButton, 10);
		doClick(BulkActionButton);
	}
	
	public String getBulkActionHeadingText() {
		WebElement status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_BulkActionText")));
		return status.getText();
	}
	
	public DashboardPage goToPreviousPage() {
		DriverUtility.getDriver().navigate().back();
		return new DashboardPage();
	}
}
