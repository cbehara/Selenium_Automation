package com.multisense.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class LoadProfileTypePage extends TestBase {

	String Name = generateRandomName(9);
	
	String UpdateName = generateRandomName(8);	
	
	//WebElement eleAConxoMultisense_LoadProfileTypePage_AddloadprofiletypebuttondminBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton")));	
	    
	public  LoadProfileTypePage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}				
	
	public void clickLoadProfile() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConxoMultisense_LoadProfileTypePage_LoadProfileTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_LoadProfileTypes")));
		doClick(ConxoMultisense_LoadProfileTypePage_LoadProfileTypes);
		} catch (Exception e) {
			e.printStackTrace();
			}
			}
				
	public void clickLoadProfilebutton() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConxoMultisense_LoadProfileTypePage_AddLoadProfileType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_AddLoadProfileType")));
		doClick(ConxoMultisense_LoadProfileTypePage_AddLoadProfileType);		
		}
	
	public void addloadprofileType(String OBISCode ) throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_LoadProfileTypePage_loadprofilename = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_loadprofilename")));
	doClear(ConxoMultisense_LoadProfileTypePage_loadprofilename);
	sendkeys(Name, ConxoMultisense_LoadProfileTypePage_loadprofilename);
	
	
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_LoadProfileTypePage_obiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_obiscode")));
	doClear(ConxoMultisense_LoadProfileTypePage_obiscode);
	sendkeys(OBISCode, ConxoMultisense_LoadProfileTypePage_obiscode);
	
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
	WebElement ConxoMultisense_LoadProfileTypePage_Addregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addregistertypebutton")));
	WebElement ConxoMultisense_LoadProfileTypePage_selectregistertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_selectregistertype")));
	doClick(ConxoMultisense_LoadProfileTypePage_Addregistertypebutton);
	doClick(ConxoMultisense_LoadProfileTypePage_selectregistertype);
	WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
	checkbox12.click();
	WebElement ConxoMultisense_LoadProfileTypePage_Addregistertypecheckbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addregistertypecheckbutton")));
	doClick(ConxoMultisense_LoadProfileTypePage_Addregistertypecheckbutton);
	WebElement ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton")));
	doClick(ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton);
	}
	public void editOnlineLoadProfiletype()
	{
		waitForTime(5000);
		WebElement ConxoMultisense_LoadProfileTypePage_PerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_PerpageDropDown")));
		doClick(ConxoMultisense_LoadProfileTypePage_PerpageDropDown);
		waitForTime(1000);
		WebElement ConxoMultisense_LoadProfileTypePage_Perpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Perpagevalue")));
		doClick(ConxoMultisense_LoadProfileTypePage_Perpagevalue);
		
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		WebElement ConxoMultisense_LoadProfileTypePage_EditLoadProfilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_EditLoadProfilebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LoadProfileTypePage_EditLoadProfilebutton, 10);
		doClick(ConxoMultisense_LoadProfileTypePage_EditLoadProfilebutton);
		waitForTime(5000);
		WebElement ConxoMultisense_LoadProfileTypePage_loadprofilename = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_loadprofilename")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LoadProfileTypePage_loadprofilename, 10);
		doClear(ConxoMultisense_LoadProfileTypePage_loadprofilename);
		sendkeys(UpdateName, ConxoMultisense_LoadProfileTypePage_loadprofilename);
		WebElement ConxoMultisense_LoadProfileTypePage_saveloadprofilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_saveloadprofilebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LoadProfileTypePage_saveloadprofilebutton, 10);
		doClick(ConxoMultisense_LoadProfileTypePage_saveloadprofilebutton);
		waitForTime(8000);
	}
	public void removeOnlineLoadProfiletype()
	{
		waitForTime(5000);
		WebElement ConxoMultisense_LoadProfileTypePage_PerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_PerpageDropDown")));
		doClick(ConxoMultisense_LoadProfileTypePage_PerpageDropDown);		
		waitForTime(1000);
		WebElement ConxoMultisense_LoadProfileTypePage_Perpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Perpagevalue")));
		doClick(ConxoMultisense_LoadProfileTypePage_Perpagevalue);
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ UpdateName +"']//ancestor::td//following-sibling::td//span")); 
		scrolldown(a);
		waitForTime(3000);
		WebElement ConxoMultisense_LoadProfileTypePage_RemoveLoadProfilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_RemoveLoadProfilebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LoadProfileTypePage_RemoveLoadProfilebutton, 10);
		doClick(ConxoMultisense_LoadProfileTypePage_RemoveLoadProfilebutton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdateName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}	
	
	public void verifyAddLoadProfileTypeFields()
	{
		WebElement ConxoMultisense_LoadProfileTypePage_AddLoadProfileType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_AddLoadProfileType")));
		doClick(ConxoMultisense_LoadProfileTypePage_AddLoadProfileType);	
		WebElement ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton")));
		doClick(ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton);
		String Expectedname = "This field is required";
		WebElement Actualname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_verifynamefield")));
		SoftAssertfunction(Actualname, Expectedname);
		String Expectedobiscode = "Invalid obis code";
		WebElement Actualobiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_verifyobiscode")));
		SoftAssertfunction(Actualobiscode, Expectedobiscode);
		String Expectedregistertype = "You should select at least one register type";
		WebElement Actualregistertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_verifyregistertype")));
		SoftAssertfunction(Actualregistertype, Expectedregistertype);
		WebElement Cancelloadprofiletype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_CancelLoadProfilebutton")));
		doClick(Cancelloadprofiletype);
	}
	
	public void addAllRegisterTypes(String OBISCode)
	{
		WebElement ConxoMultisense_LoadProfileTypePage_AddLoadProfileType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_AddLoadProfileType")));
		doClick(ConxoMultisense_LoadProfileTypePage_AddLoadProfileType);	
		WebElement ConxoMultisense_LoadProfileTypePage_loadprofilename = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_loadprofilename")));
		doClear(ConxoMultisense_LoadProfileTypePage_loadprofilename);
		sendkeys(Name, ConxoMultisense_LoadProfileTypePage_loadprofilename);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConxoMultisense_LoadProfileTypePage_obiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_obiscode")));
		doClear(ConxoMultisense_LoadProfileTypePage_obiscode);
		sendkeys(OBISCode, ConxoMultisense_LoadProfileTypePage_obiscode);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement ConxoMultisense_LoadProfileTypePage_Addregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addregistertypebutton")));
		doClick(ConxoMultisense_LoadProfileTypePage_Addregistertypebutton);
		WebElement ConxoMultisense_LoadProfileTypePage_allregistertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Allregistertypes")));
		doClick(ConxoMultisense_LoadProfileTypePage_allregistertype);
		WebElement ConxoMultisense_LoadProfileTypePage_Addregistertypecheckbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addregistertypecheckbutton")));
		doClick(ConxoMultisense_LoadProfileTypePage_Addregistertypecheckbutton);
		WebElement ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton")));
		doClick(ConxoMultisense_LoadProfileTypePage_Addloadprofiletypebutton);
	}
}


