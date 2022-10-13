package com.multisense.pages.ValidationPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class ValidationRuleSetPage extends TestBase {
	String UName = generateRandomName(9);
	
	public ValidationRuleSetPage()  {
		login();
        PageFactory.initElements(DriverUtility.getDriver(), this);
        Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
	}
	
	public void sendText(String value)
	{
		WebElement ConnexoMultisense_ValidationRulePage_validarionRuleSetName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validarionRuleSetName")));
		sendkeys(value, ConnexoMultisense_ValidationRulePage_validarionRuleSetName);
	}
	public void clickValidationRuleSet()
	{
		WebElement ConnexoMultisense_ValidationRulePage_validationruleset = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validationruleset")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_validationruleset, 10);
		 doClick(ConnexoMultisense_ValidationRulePage_validationruleset);
 	}
	public void clickAddValidationRuleSet()
	{
		WebElement ConnexoMultisense_ValidationRulePage_ValidationRuleSetPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationRuleSetPerPage")));
		if(ConnexoMultisense_ValidationRulePage_ValidationRuleSetPerPage.isDisplayed())
	     {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add validation rule set')]//ancestor::a)[2]")).click();
	     }else {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add validation rule set')]//ancestor::a)[1]")).click();
	     }	
	}
	
	public void createAndEditValidationRuleset(String Description)
	{
		WebElement ConnexoMultisense_ValidationRulePage_validarionRuleSetName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validarionRuleSetName")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_validarionRuleSetName, 10);
		doClear(ConnexoMultisense_ValidationRulePage_validarionRuleSetName);
		sendkeys(UName, ConnexoMultisense_ValidationRulePage_validarionRuleSetName);
		WebElement ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription")));
		doClear(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription);
		sendkeys(Description, ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription);
	}
	public void clickAddValidationRuleSetButton()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton")));
		doClick(ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton);
	}
	public void clickOnEditvalidateRuleSet() 
	{
		WebElement ConnexoMultisense_ValidationRulePage_detailsValidarionRuleSetLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_detailsValidarionRuleSetLink")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_detailsValidarionRuleSetLink, 10);
		doClick(ConnexoMultisense_ValidationRulePage_detailsValidarionRuleSetLink);
		waitForTime(5000);
		WebElement ConnexoMultisense_ValidationRulePage_actionValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_actionValidationRuleSet")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_actionValidationRuleSet, 10);
		doClick(ConnexoMultisense_ValidationRulePage_actionValidationRuleSet);
		WebElement ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton);
	}
	public void clickOnSavevalidateRuleSet()
	{
		WebElement ConnexoMultisense_ValidationRulePage_savevalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_savevalidationRuleSetbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_savevalidationRuleSetbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_savevalidationRuleSetbutton);
		waitForTime(4000);
	}	
	
	public void clickRemovevalidationRuleSet()
	{
		waitForTime(2000);
		WebElement ConnexoMultisense_ValidationRulePage_actionValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_actionValidationRuleSet")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_actionValidationRuleSet, 10);
		doClick(ConnexoMultisense_ValidationRulePage_actionValidationRuleSet);
		waitForTime(2000);
		WebElement ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton);
		waitForTime(2000);
		//DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		List<WebElement> Removepopup= DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),'"+ UName +"')]//ancestor::div//a[normalize-space()='Remove']"));
		if(Removepopup.size() > 1)
		{
		   DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'"+ UName +"')]//ancestor::div//a[normalize-space()='Remove'])[2]")).click();
		}else{
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
		waitForTime(2000);
		/*TestUtil.waitforElementTobeLocated(removepopupvalidationRuleSetbutton, 10);;
		doClick(removepopupvalidationRuleSetbutton);
		waitForTime(2000);*/
	}
	
	public void addValidationRuleSetVersion(String Description,String UpdateDescription ,String CloneUpdateVersionDescription)
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_ValidationRulePage_versionValidarionRuleSetLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_versionValidarionRuleSetLink")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_versionValidarionRuleSetLink, 10);
		doClick(ConnexoMultisense_ValidationRulePage_versionValidarionRuleSetLink);
		WebElement ConnexoMultisense_ValidationRulePage_addValidationRuleSetVersionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_addValidationRuleSetVersionButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_addValidationRuleSetVersionButton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_addValidationRuleSetVersionButton);
		WebElement ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription, 10);
		doClear(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription);
		sendkeys(Description, ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription);
		WebElement ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton")));
		doClick(ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton);
		waitForTime(5000);
		WebElement ConnexoMultisense_ValidationRulePage_actionValidationRuleSetVersion = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_actionValidationRuleSetVersion")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_actionValidationRuleSetVersion, 10);
		doClick(ConnexoMultisense_ValidationRulePage_actionValidationRuleSetVersion);
		WebElement ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_editvalidationRuleSetbutton);
		WebElement ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription1, 10);
		doClear(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription1);
		sendkeys(UpdateDescription, ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription1);
		clickOnSavevalidateRuleSet();
		waitForTime(5000);		
		DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'"+UpdateDescription+"')]//ancestor::td//following-sibling::td//div//span")).click();
		WebElement ConnexoMultisense_ValidationRulePage_clonevalidationRuleSetVersionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_clonevalidationRuleSetVersionbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_clonevalidationRuleSetVersionbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_clonevalidationRuleSetVersionbutton);
		waitForTime(2000);
		WebElement ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription2, 10);
		doClear(ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription2);
		sendkeys(CloneUpdateVersionDescription, ConnexoMultisense_ValidationRulePage_validarionRuleSetDescription2);
		WebElement ConnexoMultisense_ValidationRulePage_startonValidationRuleSetVersion = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_startonValidationRuleSetVersion")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_startonValidationRuleSetVersion , 10);
		doClick(ConnexoMultisense_ValidationRulePage_startonValidationRuleSetVersion);
		WebElement ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton1, 10);
		doClick(ConnexoMultisense_ValidationRulePage_addValidarionRuleSetButton1);
		
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'"+UpdateDescription+"')]//ancestor::td//following-sibling::td//div//span")).click();
		waitForTime(2000);
		WebElement ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton);
		List<WebElement> Removepopup= DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),'Until')]//ancestor::div//a[normalize-space()='Remove']"));
		if(Removepopup.size() > 1)
		{
		   DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Until')]//ancestor::div//a[normalize-space()='Remove'])[2]")).click();
		}else{
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'Until')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
		waitForTime(2000);
	}
	

	public String gettextofVRSAdd()
	{
		WebElement ConnexoMultisense_ValidationRulePage_verifytextAddValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRuleSet")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_verifytextAddValidationRuleSet, 10);
		return getText(ConnexoMultisense_ValidationRulePage_verifytextAddValidationRuleSet);
	}
	
	
	public String gettextofVRSSave()
	{
		WebElement ConnexoMultisense_ValidationRulePage_verifytextsavedValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextsavedValidationRuleSet")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_verifytextsavedValidationRuleSet, 10);
		return getText(ConnexoMultisense_ValidationRulePage_verifytextsavedValidationRuleSet);
	}
	
	public String gettextofVRSRemove()
	{
		WebElement ConnexoMultisense_ValidationRulePage_verifytextremoveValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextremoveValidationRuleSet")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_verifytextremoveValidationRuleSet, 10);
		return getText(ConnexoMultisense_ValidationRulePage_verifytextremoveValidationRuleSet);
	}	
	
	public void addValidationRule(String validator)
	{
		waitForTime(5000);
		WebElement AddValidationRuleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddValidationRuleButton")));
		TestUtil.waitforElementTobeLocated(AddValidationRuleButton, 10);
		doClick(AddValidationRuleButton);
		WebElement ValidationRuleTextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationRuleTextbox")));
		TestUtil.waitforElementTobeLocated(ValidationRuleTextbox, 10);
		doClear(ValidationRuleTextbox);
		sendkeys(UName, ValidationRuleTextbox);
		WebElement ValidatorDrodown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodown")));
		TestUtil.waitforElementTobeLocated(ValidatorDrodown, 10);
		doClick(ValidatorDrodown);
		String locator = prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodownValue");
		locator = locator.replace("ReplaceText", validator);
		WebElement ValidatoValue =  DriverUtility.getDriver().findElement(By.xpath(locator));
		doClick(ValidatoValue);
		WebElement AddReadingTypesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingTypesButton")));
		TestUtil.waitforElementTobeLocated(AddReadingTypesButton, 10);
		doClick(AddReadingTypesButton);
		WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox1.click();
		WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox3.click();
		WebElement ReadingPage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ReadingPage_AddButton, 10);
		doClick(ReadingPage_AddButton);
		WebElement ValidationRulePage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ValidationRulePage_AddButton, 10);	
		doClick(ValidationRulePage_AddButton);
		String ExpectedAddedValidationRule ="Validation rule added";
		WebElement ActualAddedValidationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRule")));
        SoftAssertfunction(ActualAddedValidationRule , ExpectedAddedValidationRule);	
	}
	
	public void addValidationRules(String validator)
	{
		waitForTime(5000);
		WebElement AddValidationRuleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddValidationRuleInnerButton")));
		TestUtil.waitforElementTobeLocated(AddValidationRuleButton, 10);
		doClick(AddValidationRuleButton);
		WebElement ValidationRuleTextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationRuleTextbox")));
		TestUtil.waitforElementTobeLocated(ValidationRuleTextbox, 10);
		doClear(ValidationRuleTextbox);
		sendkeys(generateRandomName(9), ValidationRuleTextbox);
		WebElement ValidatorDrodown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodown")));
		TestUtil.waitforElementTobeLocated(ValidatorDrodown, 10);
		doClick(ValidatorDrodown);
		String locator = prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodownValue");
		locator = locator.replace("ReplaceText", validator);
		WebElement ValidatoValue =  DriverUtility.getDriver().findElement(By.xpath(locator));
		doClick(ValidatoValue);
		WebElement AddReadingTypesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingTypesButton")));
		TestUtil.waitforElementTobeLocated(AddReadingTypesButton, 10);
		doClick(AddReadingTypesButton);
		WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox1.click();
		WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox3.click();
		WebElement ReadingPage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ReadingPage_AddButton, 10);
		doClick(ReadingPage_AddButton);
		WebElement ValidationRulePage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ValidationRulePage_AddButton, 10);	
		doClick(ValidationRulePage_AddButton);
		String ExpectedAddedValidationRule ="Validation rule added";
		WebElement ActualAddedValidationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRule")));
        SoftAssertfunction(ActualAddedValidationRule , ExpectedAddedValidationRule);	
	}
	
	public void addMeterAdvanceValidationRule(String validator)
	{
		waitForTime(5000);
		WebElement AddValidationRuleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddValidationRuleInnerButton")));
		TestUtil.waitforElementTobeLocated(AddValidationRuleButton, 10);
		doClick(AddValidationRuleButton);
		WebElement ValidationRuleTextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationRuleTextbox")));
		TestUtil.waitforElementTobeLocated(ValidationRuleTextbox, 10);
		doClear(ValidationRuleTextbox);
		sendkeys(generateRandomName(9), ValidationRuleTextbox);
		WebElement ValidatorDrodown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodown")));
		TestUtil.waitforElementTobeLocated(ValidatorDrodown, 10);
		doClick(ValidatorDrodown);
		String locator = prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodownValue");
		locator = locator.replace("ReplaceText", validator);
		WebElement ValidatoValue =  DriverUtility.getDriver().findElement(By.xpath(locator));
		doClick(ValidatoValue);
		WebElement AddReadingTypesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingTypesButton")));
		TestUtil.waitforElementTobeLocated(AddReadingTypesButton, 10);
		doClick(AddReadingTypesButton);
		WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox1.click();
		WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox3.click();
		WebElement ReadingPage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ReadingPage_AddButton, 10);
		doClick(ReadingPage_AddButton);
		WebElement ReferenceReadingTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ReferenceReadingTypeDropdown")));
		TestUtil.waitforElementTobeLocated(ReferenceReadingTypeDropdown, 10);
		doClick(ReferenceReadingTypeDropdown);
		WebElement ReferenceReadingTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ReferenceReadingTypeDropdownValue")));
		TestUtil.waitforElementTobeLocated(ReferenceReadingTypeDropdownValue, 10);
		doClick(ReferenceReadingTypeDropdownValue);
		WebElement ValidationRulePage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ValidationRulePage_AddButton, 10);	
		doClick(ValidationRulePage_AddButton);
		String ExpectedAddedValidationRule ="Validation rule added";
		WebElement ActualAddedValidationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRule")));
        SoftAssertfunction(ActualAddedValidationRule , ExpectedAddedValidationRule);	
	}
	
	public void addReadingQualitiesValidationRule(String validator)
	{
		waitForTime(5000);
		WebElement AddValidationRuleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddValidationRuleInnerButton")));
		TestUtil.waitforElementTobeLocated(AddValidationRuleButton, 10);
		doClick(AddValidationRuleButton);
		WebElement ValidationRuleTextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationRuleTextbox")));
		TestUtil.waitforElementTobeLocated(ValidationRuleTextbox, 10);
		doClear(ValidationRuleTextbox);
		sendkeys(generateRandomName(9), ValidationRuleTextbox);
		WebElement ValidatorDrodown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodown")));
		TestUtil.waitforElementTobeLocated(ValidatorDrodown, 10);
		doClick(ValidatorDrodown);
		String locator = prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidatorDrodownValue");
		locator = locator.replace("ReplaceText", validator);
		WebElement ValidatoValue =  DriverUtility.getDriver().findElement(By.xpath(locator));
		doClick(ValidatoValue);
		WebElement AddReadingTypesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingTypesButton")));
		TestUtil.waitforElementTobeLocated(AddReadingTypesButton, 10);
		doClick(AddReadingTypesButton);
		WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox1.click();
		WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox3.click();
		WebElement ReadingPage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ReadingPage_AddButton, 10);
		doClick(ReadingPage_AddButton);
		WebElement AddReadingQualitiesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingQualitiesButton")));
		TestUtil.waitforElementTobeLocated(AddReadingQualitiesButton, 10);
		doClick(AddReadingQualitiesButton);
		WebElement AddReadingQualitiesTextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingQualitiesTextbox")));
		doClear(AddReadingQualitiesTextbox);
		sendkeys("1.2.3", AddReadingQualitiesTextbox);
		WebElement AddReadingQualitiesAddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddReadingQualitiesAddButton")));
		TestUtil.waitforElementTobeLocated(AddReadingQualitiesAddButton, 10);
		doClick(AddReadingQualitiesAddButton);
		WebElement ValidationRulePage_AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_AddButton")));
		TestUtil.waitforElementTobeLocated(ValidationRulePage_AddButton, 10);	
		doClick(ValidationRulePage_AddButton);
		String ExpectedAddedValidationRule ="Validation rule added";
		WebElement ActualAddedValidationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRule")));
        SoftAssertfunction(ActualAddedValidationRule , ExpectedAddedValidationRule);	
	}
	
	public void editValidationRule()
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'" + UName + "')]//ancestor::td//following-sibling::td//div//span")).click();
		WebElement ValidationEditButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationEditButton")));
		TestUtil.waitforElementTobeLocated(ValidationEditButton, 10);	
		doClick(ValidationEditButton);
		WebElement ValidationSaveButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationSaveButton")));
		TestUtil.waitforElementTobeLocated(ValidationSaveButton, 10);	
		doClick(ValidationSaveButton);
	}
	
	public void activateValidationRule()
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'" + UName + "')]//ancestor::td//following-sibling::td//div//span")).click();
		WebElement ValidationActivateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationActivateButton")));
		TestUtil.waitforElementTobeLocated(ValidationActivateButton, 10);	
		doClick(ValidationActivateButton);
	}
	
	public void deactivateValidationRule()
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'" + UName + "')]//ancestor::td//following-sibling::td//div//span")).click();
		WebElement ValidationDeactivateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_ValidationDeactivateButton")));
		TestUtil.waitforElementTobeLocated(ValidationDeactivateButton, 10);	
		doClick(ValidationDeactivateButton);
	}
	
	public void removeValidationRule()
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'" + UName + "')]//ancestor::td//following-sibling::td//div//span")).click();
		WebElement ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton, 10);
		doClick(ConnexoMultisense_ValidationRulePage_removevalidationRuleSetbutton);
		List<WebElement> Removepopup= DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),'" + UName + "')]//ancestor::div//a[normalize-space()='Remove']"));
		if(Removepopup.size() > 1)
		{
		   DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'" + UName + "')]//ancestor::div//a[normalize-space()='Remove'])[2]")).click();
		}else{
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'" + UName + "')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	}
}
