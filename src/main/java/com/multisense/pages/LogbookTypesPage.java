package com.multisense.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class LogbookTypesPage extends TestBase {
	
	String Name = generateRandomName(9);  
    
    
	public  LogbookTypesPage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}
				
	
	public void clickLogbooktypes() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConxoMultisense_LogbookTypesPage_Logbooktypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_Logbooktypes")));
		doClick(ConxoMultisense_LogbookTypesPage_Logbooktypes);
		} catch (Exception e) {
						// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
				
	public void clickLogbooktypesbutton() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConxoMultisense_LogbookTypesPage_AddLogbooktypesname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_AddLogbooktypesname")));
		doClick(ConxoMultisense_LogbookTypesPage_AddLogbooktypesname);
		
		}

	
	public void addlogbookType(String OBISCode ) throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_LogbookTypesPage_Logbookname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_Logbookname")));
	doClear(ConxoMultisense_LogbookTypesPage_Logbookname);
	sendkeys(Name, ConxoMultisense_LogbookTypesPage_Logbookname);
	
	
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_LogbookTypesPage_obiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_obiscode")));
	doClear(ConxoMultisense_LogbookTypesPage_obiscode);
	sendkeys(OBISCode, ConxoMultisense_LogbookTypesPage_obiscode);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_LogbookTypesPage_Addlogbookbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_Addlogbookbutton")));
	doClick(ConxoMultisense_LogbookTypesPage_Addlogbookbutton);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	}
	public void editlogbooktype(String UpdateName)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConxoMultisense_LogbookTypesPage_EditLoadProfilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_EditLoadProfilebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LogbookTypesPage_EditLoadProfilebutton, 10);
		doClick(ConxoMultisense_LogbookTypesPage_EditLoadProfilebutton);
		waitForTime(5000);
		WebElement ConxoMultisense_LogbookTypesPage_Logbookname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_Logbookname")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LogbookTypesPage_Logbookname, 10);
		doClear(ConxoMultisense_LogbookTypesPage_Logbookname);
		sendkeys(UpdateName, ConxoMultisense_LogbookTypesPage_Logbookname);
		
		WebElement ConxoMultisense_LogbookTypesPage_saveloadprofilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_saveloadprofilebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LogbookTypesPage_saveloadprofilebutton, 10);
		doClick(ConxoMultisense_LogbookTypesPage_saveloadprofilebutton);
	}
	public void removelogbooktype(String UpdateName)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ UpdateName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConxoMultisense_LogbookTypesPage_logbooktyperemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_logbooktyperemove")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_LogbookTypesPage_logbooktyperemove, 10);
		doClick(ConxoMultisense_LogbookTypesPage_logbooktyperemove);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdateName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}	
	
	public void verifylogbooktypefields()
	{
		WebElement ConxoMultisense_LogbookTypesPage_AddLogbooktypesname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_AddLogbooktypesname")));
		doClick(ConxoMultisense_LogbookTypesPage_AddLogbooktypesname);
		WebElement ConxoMultisense_LogbookTypesPage_Addlogbookbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_Addlogbookbutton")));
		doClick(ConxoMultisense_LogbookTypesPage_Addlogbookbutton);
		String Expectedname = "This field is required";
		WebElement Actualname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_verifynamefield")));
		doClick(Actualname);
		SoftAssertfunction(Actualname, Expectedname);
		String Expectedobiscode = "Invalid obis code";
		WebElement Actualobiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_verifyobiscode")));
		doClick(Actualobiscode);
		SoftAssertfunction(Actualobiscode, Expectedobiscode);
		WebElement CancelLogbookType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LogbookTypesPage_CancelLogbookbutton")));
		doClick(CancelLogbookType);
	}
	
}


