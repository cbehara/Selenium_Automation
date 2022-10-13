package com.multisense.pages.ValidationPage;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ValidationTaskpage extends TestBase {

	String Name= generateRandomName(7);
	int Removepopup =1;	
	
	public ValidationTaskpage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
	}	
		
	public void sendText(String value)
	{
		WebElement ConnexoMultisense_ValidationTaskPage_validationName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_validationName")));
		sendkeys(value, ConnexoMultisense_ValidationTaskPage_validationName);
	}
	public void clickOnEditvalidatetask(String Loglevel, String UpdateLoglevel) 
	{
		changeperpagevalue();
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'"+Name+"')]//ancestor::td//following-sibling::td[4]//div//span")).click();
		waitForTime(5000);
		WebElement ConnexoMultisense_ValidationTaskPage_editvalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_editvalidationtaskbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_editvalidationtaskbutton, 10);	
		doClick(ConnexoMultisense_ValidationTaskPage_editvalidationtaskbutton);
		WebElement ConnexoMultisense_ValidationTaskPage_logLevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_logLevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_logLevelDropDown, 10);	
		doClick(ConnexoMultisense_ValidationTaskPage_logLevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()='"+ UpdateLoglevel +"']")).click();
		WebElement ConnexoMultisense_ValidationTaskPage_savevalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_savevalidationtaskbutton")));
		doClick(ConnexoMultisense_ValidationTaskPage_savevalidationtaskbutton);
	}
	
	public void createValidationtask (String Loglevel, String Devicegroup)
	{
		WebElement ConnexoMultisense_ValidationTaskPage_validationName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_validationName")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_validationName, 10);
		doClear(ConnexoMultisense_ValidationTaskPage_validationName);
		sendkeys(Name, ConnexoMultisense_ValidationTaskPage_validationName);
		WebElement ConnexoMultisense_ValidationTaskPage_logLevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_logLevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_logLevelDropDown, 10);
		doClick(ConnexoMultisense_ValidationTaskPage_logLevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()='"+ Loglevel +"']")).click();
		WebElement ConnexoMultisense_ValidationTaskPage_deviceGroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_deviceGroupDropDown")));
		doClick(ConnexoMultisense_ValidationTaskPage_deviceGroupDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()='"+ Devicegroup +"']")).click();
	}
	public void clickaddvalidationtask()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_ValidationTaskPage_addvalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_addvalidationtaskbutton")));
		doClick(ConnexoMultisense_ValidationTaskPage_addvalidationtaskbutton);		
	}
		
	public void clicknewAddvalidationtask()
	{
		waitForTime(3000);
		WebElement ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPage")));
		if(ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPage.isDisplayed())
	     {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add validation task')]//ancestor::a)[2]")).click();
	     }else {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add validation task')]//ancestor::a)[1]")).click();
	     }			
	}
	
	public void clickonvalidationTasks()
	{
		Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
        WebElement ConnexoMultisense_ValidationTaskPage_validationtasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_validationtasks")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_validationtasks, 10);
		doClick(ConnexoMultisense_ValidationTaskPage_validationtasks);
	}
	
	public void changeperpagevalue()
	{
		waitForTime(3000);
		WebElement ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageDropDown, 10);
		doClick(ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageDropDown);
		WebElement ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageValue")));
		doClick(ConnexoMultisense_ValidationTaskPage_ValidationTaskPerPageValue);
	}
	
	public void clickRemovevalidationtask()
	{
		changeperpagevalue();
		waitForTime(3000);
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'"+Name+"')]//ancestor::td//following-sibling::td[4]//div//span")).click();
		WebElement ConnexoMultisense_ValidationTaskPage_removevalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_removevalidationtaskbutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_removevalidationtaskbutton, 10);
		doClick(ConnexoMultisense_ValidationTaskPage_removevalidationtaskbutton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove'])["+Removepopup+"]")).click();
		waitForTime(3000);
	}
	
	public void clickOnViewHistoryvalidationTask() 
	{
		changeperpagevalue();
		waitForTime(3000);
		DriverUtility.getDriver().findElement(By.xpath("//a[contains(text(),'"+Name+"')]//ancestor::td//following-sibling::td[4]//div//span")).click();
		WebElement ConnexoMultisense_ValidationTaskPage_viewhistorybutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_viewhistorybutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_viewhistorybutton, 10);
		doClick(ConnexoMultisense_ValidationTaskPage_viewhistorybutton);
		WebElement ConnexoMultisense_ValidationTaskPage_backValidationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_backValidationTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_backValidationTask, 10);
		doClick(ConnexoMultisense_ValidationTaskPage_backValidationTask);
		waitForTime(3000);
	}
	
	public String gettextofVTAdd()
	{
		WebElement ConnexoMultisense_ValidationTaskPage_VerifytextAddValidationTask= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifytextAddValidationTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_VerifytextAddValidationTask, 10);
		return getText(ConnexoMultisense_ValidationTaskPage_VerifytextAddValidationTask);
	}
	
	public String gettextofVTSave()
	{
		WebElement ConnexoMultisense_ValidationTaskPage_VerifytextSaveValidationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifytextSaveValidationTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_VerifytextSaveValidationTask, 10);
		return getText(ConnexoMultisense_ValidationTaskPage_VerifytextSaveValidationTask);
	}
	
	
	public String gettextofVTRemove()
	{
		WebElement ConnexoMultisense_ValidationTaskPage_VerifytextremoveValidationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifytextremoveValidationTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_ValidationTaskPage_VerifytextremoveValidationTask, 10);
		return getText(ConnexoMultisense_ValidationTaskPage_VerifytextremoveValidationTask);
	}


	public void selectRandomAction()
	{
		List<WebElement> options = DriverUtility.getDriver().findElements(By.xpath("//*[@class=\"x-grid-cell-inner x-grid-cell-inner-action-col\"]/span"));
		
		Iterator<WebElement> itr = options.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());		
	      }
	}	
	
	public void verifyAddValidationTaskFields()
	{
		clicknewAddvalidationtask();
		WebElement ConnexoMultisense_ValidationTaskPage_addvalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_addvalidationtaskbutton")));
		doClick(ConnexoMultisense_ValidationTaskPage_addvalidationtaskbutton);	
		String ExpectedName ="This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifyNameField")));
		doClick(ActualName);	
		SoftAssertfunction(ActualName,ExpectedName);
		String ExpectedDeviceGroup ="This field is required";
		WebElement ActualDeviceGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_VerifyNameField")));
		doClick(ActualDeviceGroup);
		SoftAssertfunction(ActualDeviceGroup,ExpectedDeviceGroup);
		WebElement ConnexoMultisense_ValidationTaskPage_cancelvalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationTaskPage_cancelvalidationtaskbutton")));
		doClick(ConnexoMultisense_ValidationTaskPage_cancelvalidationtaskbutton);
	}
	
}
