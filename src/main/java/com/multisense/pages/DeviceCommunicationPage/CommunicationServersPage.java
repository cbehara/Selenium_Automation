package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationServersPage extends TestBase {
	
	String OnlineCommunicationServerNameValue= generateRandomName(9);
	String UpdatedOnlineCommunicationServerNameValue= generateRandomName(10);
	
	
	 public CommunicationServersPage()	
		{
			login();
			PageFactory.initElements(DriverUtility.getDriver(), this);
			Multisense();
	        waitForTime(1000);
	        Administration();
	        waitForTime(3000);
		}
	    public void clickonCommunicationServer()
		{    	
	    	WebElement conxoMultisense_comSrvPage_communicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_communicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_communicationServer, 10);	
			doClick(conxoMultisense_comSrvPage_communicationServer);		
		}
	    
	    public String gettextofCommunicationServer()
		{
			waitForTime(5000);
			WebElement conxoMultisense_comSrvPage_verifyCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifyCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_verifyCommunicationServer, 10);
			return getText(conxoMultisense_comSrvPage_verifyCommunicationServer);
		}
	    
	    public void clickonAddOnlineCommunicationServer()
		{
	    	WebElement conxoMultisense_comSrvPage_CommunicationServerPerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_CommunicationServerPerpage")));
		     if(conxoMultisense_comSrvPage_CommunicationServerPerpage.isDisplayed())
		     {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add online communication server')]//ancestor::a)[2]")).click();
		     }else {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add online communication server')]//ancestor::a)[1]")).click();
		     }
		}
	    public void AddOnlineCommunicationServer()
		{
			waitForTime(5000);
			WebElement conxoMultisense_comSrvPage_OnlineCommunicationServerName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_OnlineCommunicationServerName")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_OnlineCommunicationServerName, 10);
			doClear(conxoMultisense_comSrvPage_OnlineCommunicationServerName);
			sendkeys(OnlineCommunicationServerNameValue, conxoMultisense_comSrvPage_OnlineCommunicationServerName);
			waitForTime(1000);
			WebElement conxoMultisense_comSrvPage_OnlineCommunicationServerAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_OnlineCommunicationServerAdd")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_OnlineCommunicationServerAdd, 10);
			doClick(conxoMultisense_comSrvPage_OnlineCommunicationServerAdd);
		}
	    
	    public void activateOnlineCommunicationServer()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ OnlineCommunicationServerNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement conxoMultisense_comSrvPage_activateOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_activateOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_activateOnlineCommunicationServer, 10);
			doClick(conxoMultisense_comSrvPage_activateOnlineCommunicationServer);
		}
	    public void editOnlineCommunicationServer()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ OnlineCommunicationServerNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			WebElement conxoMultisense_comSrvPage_EditOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_EditOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_EditOnlineCommunicationServer, 10);
			doClick(conxoMultisense_comSrvPage_EditOnlineCommunicationServer);
			waitForTime(5000);
			WebElement conxoMultisense_comSrvPage_OnlineCommunicationServerName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_OnlineCommunicationServerName")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_OnlineCommunicationServerName, 10);
			doClear(conxoMultisense_comSrvPage_OnlineCommunicationServerName);
			sendkeys(UpdatedOnlineCommunicationServerNameValue, conxoMultisense_comSrvPage_OnlineCommunicationServerName);
			WebElement conxoMultisense_comSrvPage_SaveOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_SaveOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_SaveOnlineCommunicationServer, 10);
			doClick(conxoMultisense_comSrvPage_SaveOnlineCommunicationServer);
		}
	    
	    public void deactivateOnlineCommunicationServer()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ UpdatedOnlineCommunicationServerNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement conxoMultisense_comSrvPage_DeactivateOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_DeactivateOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_DeactivateOnlineCommunicationServer, 10);
			doClick(conxoMultisense_comSrvPage_DeactivateOnlineCommunicationServer);
		}
	    
	    public void removeOnlineCommunicationServer()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ UpdatedOnlineCommunicationServerNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement conxoMultisense_comSrvPage_RemoveOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_RemoveOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_RemoveOnlineCommunicationServer, 10);
			doClick(conxoMultisense_comSrvPage_RemoveOnlineCommunicationServer);
			waitForTime(2000);
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdatedOnlineCommunicationServerNameValue +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	    
	    public String gettextofcsremove()
		{
	    	WebElement conxoMultisense_comSrvPage_verifytextremoveCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextremoveCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_verifytextremoveCommunicationServer, 10);
			return getText(conxoMultisense_comSrvPage_verifytextremoveCommunicationServer);
		}
	    
	    public String gettextofcsAdd()
		{
	    	WebElement conxoMultisense_comSrvPage_verifytextAddOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextAddOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_verifytextAddOnlineCommunicationServer, 10);
			return getText(conxoMultisense_comSrvPage_verifytextAddOnlineCommunicationServer);
		}
	    
	    public String gettextofcsSave()
		{
	    	WebElement conxoMultisense_comSrvPage_verifytextSaveOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextSaveOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_verifytextSaveOnlineCommunicationServer, 10);
			return getText(conxoMultisense_comSrvPage_verifytextSaveOnlineCommunicationServer);
		}
	    
	    public String gettextofcsActivate()
		{
	    	WebElement conxoMultisense_comSrvPage_verifytextactivateOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextactivateOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_verifytextactivateOnlineCommunicationServer, 10);
			return getText(conxoMultisense_comSrvPage_verifytextactivateOnlineCommunicationServer);
		}
	    
	    public String gettextofcsDeactivate()
		{
	    	WebElement conxoMultisense_comSrvPage_verifytextDeactivatedOnlineCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_comSrvPage_verifytextDeactivatedOnlineCommunicationServer")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_comSrvPage_verifytextDeactivatedOnlineCommunicationServer, 10);
			return getText(conxoMultisense_comSrvPage_verifytextDeactivatedOnlineCommunicationServer);
		}
	    
}
