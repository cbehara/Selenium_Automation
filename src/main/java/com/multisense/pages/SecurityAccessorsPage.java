
package com.multisense.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class SecurityAccessorsPage extends TestBase {

	String Name = generateRandomName(9);	
	
	public SecurityAccessorsPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);                
		Administration();
		waitForTime(3000);     
	}

	public void clickonSecurityAccessors()
	{      
		WebElement ConxoMultisense_SecAccessorsPage_SecurityAccessors = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SecurityAccessors")));
		doClickjavaScript(ConxoMultisense_SecAccessorsPage_SecurityAccessors);          
	}

	public String gettextofSecurityAccessors()
	{
		waitForTime(5000);
		WebElement ConxoMultisense_SecAccessorsPage_verifySecurityAccessors = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifySecurityAccessors")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_verifySecurityAccessors, 10);
		return getText(ConxoMultisense_SecAccessorsPage_verifySecurityAccessors);
	}

	public void clickonAddSecurityAccessorsLink()
	{
		WebElement ConxoMultisense_SecAccessorsPage_SecurityAccessorsPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SecurityAccessorsPerPage")));
		if(ConxoMultisense_SecAccessorsPage_SecurityAccessorsPerPage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add security accessor')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add security accessor')]//ancestor::a)[1]")).click();
		}
	}
	public void addSecurityAccessors( String Description,String KeyType,String KeyPurpose)
	{
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName, 10);
		doClear(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName);
		sendkeys(Name, ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName);
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription, 10);
		doClear(ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription);
		sendkeys(Description, ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription);
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_KeyTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_KeyTypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_KeyTypeDropDown, 10);
		doClick(ConxoMultisense_SecAccessorsPage_KeyTypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ KeyType +"']")).click();
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown, 10);
		doClick(ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ KeyPurpose +"']")).click();
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox, 10);
		doClick(ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox);
		WebElement ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton, 10);
		doClick(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton);                                
	}
	
	public void addSecurityAccessor( String Description,String KeyType,String KeyPurpose)
	{
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName, 10);
		doClear(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName);
		sendkeys(generateRandomName(9), ConxoMultisense_SecAccessorsPage_AddSecurityAccessorsName);
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription, 10);
		doClear(ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription);
		sendkeys(Description, ConxoMultisense_SecAccessorsPage_SecurityAccessorsDescription);
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_KeyTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_KeyTypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_KeyTypeDropDown, 10);
		doClick(ConxoMultisense_SecAccessorsPage_KeyTypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ KeyType +"']")).click();
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown, 10);
		doClick(ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ KeyPurpose +"']")).click();
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox, 10);
		doClick(ConxoMultisense_SecAccessorsPage_IsWrapperCheckbox);
		WebElement ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton, 10);
		doClick(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton);                                
	}

	public void changePreviliegesSecurityAccessors()
	{
		waitForTime(10000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+Name+"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConxoMultisense_SecAccessorsPage_ChangePrivileges = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_ChangePrivileges")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_ChangePrivileges, 10);
		doClick(ConxoMultisense_SecAccessorsPage_ChangePrivileges);
		WebElement ConxoMultisense_SecAccessorsPage_ViewPrivilagesCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_ViewPrivilagesCheckbox")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_ViewPrivilagesCheckbox, 10);
		doClick(ConxoMultisense_SecAccessorsPage_ViewPrivilagesCheckbox);
		WebElement ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor, 10);
		doClick(ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor);
	}

	public void editedSecurityAccessors(String UpdatedKeyPurpose )
	{
		waitForTime(10000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+Name+"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConxoMultisense_SecAccessorsPage_EditSecurityAccessor = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_EditSecurityAccessor")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_EditSecurityAccessor, 10);
		doClick(ConxoMultisense_SecAccessorsPage_EditSecurityAccessor); 
		WebElement ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown, 10);
		doClick(ConxoMultisense_SecAccessorsPage_KeyPurposeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ UpdatedKeyPurpose +"']")).click();
		waitForTime(10000);
		WebElement ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor, 10);
		doClick(ConxoMultisense_SecAccessorsPage_SaveSecurityAccessor);
	}

	public void removeSecurityAccessors()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConxoMultisense_SecAccessorsPage_SecurityAccessorRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_SecurityAccessorRemove")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_SecurityAccessorRemove, 10);
		doClick(ConxoMultisense_SecAccessorsPage_SecurityAccessorRemove);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	public String gettextofaddSecurityAccessors()
	{
		WebElement ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor, 10);
		return getText(ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor);
	}

	public String gettextofSaveSecurityAccessors()
	{
		WebElement ConxoMultisense_SecAccessorsPage_verifytextSecurityAccessorSaved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextSecurityAccessorSaved")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_verifytextSecurityAccessorSaved, 10);
		return getText(ConxoMultisense_SecAccessorsPage_verifytextSecurityAccessorSaved);
	}

	public String gettextofRemoveSecurityAccessors()
	{
		WebElement ConxoMultisense_SecAccessorsPage_verifytextremovedSecurityAccessor = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextremovedSecurityAccessor")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_verifytextremovedSecurityAccessor, 10);
		return getText(ConxoMultisense_SecAccessorsPage_verifytextremovedSecurityAccessor);
	}
	
	public void verifyAddSecurityAccessorsFields()
	{
		WebElement ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton, 10);
		doClick(ConxoMultisense_SecAccessorsPage_AddSecurityAccessorButton);
		String Expetedname = "This field is required";
		WebElement Actualname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifyNameField")));
		SoftAssertfunction(Actualname, Expetedname);
		String Expetedkeytype = "This field is required";
		WebElement Actualkeytype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifyKeyTypeField")));
		SoftAssertfunction(Actualkeytype, Expetedkeytype);
		String Expetedkeypurpose = "This field is required";
		WebElement Actualkeypurpose = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifyKeyPurposeField")));
		SoftAssertfunction(Actualkeypurpose, Expetedkeypurpose);
		WebElement ConxoMultisense_SecAccessorsPage_cancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_cancelButton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_SecAccessorsPage_cancelButton, 10);
		doClick(ConxoMultisense_SecAccessorsPage_cancelButton);
	}
}
