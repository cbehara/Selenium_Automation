package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationPortPoolsPage extends TestBase{
	
	String communicationPortPoolNameValue= generateRandomName(8);				

	 public CommunicationPortPoolsPage()	
		{
			login();
			PageFactory.initElements(DriverUtility.getDriver(), this);
			Multisense();
	        waitForTime(1000);
	        Administration();
	        waitForTime(3000);
		}
	    public void clickonCommunicationPortPool()
		{ 
	    	WebElement ConxoMultisense_CommPortPoolsPage_communicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_communicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_communicationPortPool, 10);	
			doClick(ConxoMultisense_CommPortPoolsPage_communicationPortPool);		
		}
	    
	    public String gettextofCommunicationPortPool()
		{
			waitForTime(5000);
			WebElement ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool);
		}
	    
	    public void clickonAddCommunicationPortPool()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage")));
		     if(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage.isDisplayed())
		     {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication port pool')]//ancestor::a)[2]")).click();
		    	 WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool")));
		    	 TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool, 10);
					doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool);
		     }else {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication port pool')]//ancestor::a)[1]")).click();
		    	 WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool")));
		    	 TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool, 10);
					doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool);
				}
		}
	    public void AddOnlineCommunicationPortPool(String Type,String TaskExecutionTimeout)
		{
			waitForTime(5000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName, 10);
			doClear(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			sendkeys(communicationPortPoolNameValue, ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			waitForTime(1000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
//			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue")));
//			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue, 10);
//			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ TaskExecutionTimeout +"']")).click();
//			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue")));
//			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue, 10);
//			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
		}
	    
	    public void ChangePerpageCommunicationPortPool()
	    {
	    	waitForTime(5000);
	    	WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown);
			WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue);
	    }
	    
	    public void activateCommunicationPortPool()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer  = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer);
		}
	  
	    
	    public void deactivateCommunicationPortPool()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool);
		}
	    
	    public void removeCommunicationPortPool()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool);
			waitForTime(2000);
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ communicationPortPoolNameValue +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	    
	    public String gettextofCPPremove()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool);
		}
	    
	    public String gettextofCPPAdd()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool);
		}
	    
	    public String gettextofcsSave()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextSaveCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextSaveCommunicationPortPool")));
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool")));
	    	TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextSaveCommunicationPortPool);
		}
	    
	    public String gettextofCPPActivate()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool);
		}
	    
	    public String gettextofCPPDeactivate()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool);
		}
	    
	    public void clickonAddCommunicationPortPoolInbound()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage")));
		    if(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage.isDisplayed())
		    {
		     DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication port pool')]//ancestor::a)[2]")).click();
		     WebElement AddInboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_AddCommunicationPortPoolInbound")));
		     TestUtil.waitforElementTobeLocated(AddInboundCommunicationPortPool, 10);
			 doClick(AddInboundCommunicationPortPool);
		    }
		}
	    
	    public void InboundCommunicationPortPoolAdd()
	    {
	       WebElement InboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolAdd")));
		   TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolAdd, 10);
		   doClick(InboundCommunicationPortPoolAdd);
	    }
	    
	    public void InboundCommunicationPortPoolCancel()
	    {
	      WebElement InboundCommunicationPortPoolCancel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolCancel")));
		  TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolCancel, 10);
		  doClick(InboundCommunicationPortPoolCancel);
	    }
	    
	    public void VerifyInboundCommunicationPortPoolFileds()
	    {
	    clickonAddCommunicationPortPoolInbound();
	    InboundCommunicationPortPoolAdd();
		String ExpectedName = "This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolNameFieldRequired")));
		doClick(ActualName);
		SoftAssertfunction(ActualName, ExpectedName);
		String ExpectedType = "This field is required";
		WebElement ActualType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeFieldRequired")));
		doClick(ActualType);
		SoftAssertfunction(ActualType, ExpectedType);
		String ExpectedProtocol = "This field is required";
		WebElement ActualProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolProtocolFiledRequired")));
		doClick(ActualProtocol);
		SoftAssertfunction(ActualProtocol, ExpectedProtocol);
		InboundCommunicationPortPoolCancel();
	    }
	    
	    public void VerifyOutboundCommunicationPortPoolFileds()
	    {
	    clickonAddCommunicationPortPool();
	    InboundCommunicationPortPoolAdd();
	    String ExpectedTask = "This field is required";
		WebElement ActualTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTaskFiledRequired")));
		doClick(ActualTask);
		SoftAssertfunction(ActualTask, ExpectedTask);
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown);
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue);
		InboundCommunicationPortPoolAdd();
		String ExpectedName = "This field is required";
	    WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolNameFieldRequired")));
		doClick(ActualName);
		SoftAssertfunction(ActualName, ExpectedName);
	    String ExpectedType = "This field is required";
		WebElement ActualType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeFieldRequired")));
		doClick(ActualType);
		SoftAssertfunction(ActualType, ExpectedType);
		InboundCommunicationPortPoolCancel();
	    }
	    
	    public void AddOutboundSerialType()
		{
			waitForTime(5000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName, 10);
			doClear(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			sendkeys(generateRandomName(8), ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			waitForTime(1000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown);
			WebElement OutboundCommunicationPortPoolSerialType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolSerialTypeValue")));
			TestUtil.waitforElementTobeLocated(OutboundCommunicationPortPoolSerialType, 10);
			doClick(OutboundCommunicationPortPoolSerialType);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
			waitForTime(3000);
		}
	    
	    public void AddOutboundTCPType()
		{
			waitForTime(5000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName, 10);
			doClear(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			sendkeys(generateRandomName(8), ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			waitForTime(1000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown);
			WebElement OutboundCommunicationPortPoolSerialType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTcpTypeValue")));
			TestUtil.waitforElementTobeLocated(OutboundCommunicationPortPoolSerialType, 10);
			doClick(OutboundCommunicationPortPoolSerialType);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
			waitForTime(3000);
		}
	    
	    public void AddInboundSerialType()
		{
			waitForTime(5000);
			WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
			doClear(InboundCommunicationPortPoolName);
			sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
			waitForTime(1000);
			WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
			doClick(InboundCommunicationPortPoolTypeDropDown);
			WebElement InboundCommunicationPortPoolSerialType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSerialTypeValue")));
			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolSerialType, 10);
			doClick(InboundCommunicationPortPoolSerialType);
			WebElement InboundCommunicationPortPoolProtocolDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolProtocolDropDown")));
			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolProtocolDropDown, 10);
			doClick(InboundCommunicationPortPoolProtocolDropDown);
			WebElement InboundCommunicationPortPoolA2Type = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSA2TypeValue")));
			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolA2Type, 10);
			doClick(InboundCommunicationPortPoolA2Type);			
			InboundCommunicationPortPoolAdd();
			waitForTime(3000);
		}
	    
	    public void AddInboundServletType()
	 		{
	 			waitForTime(5000);
	 			WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
	 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
	 			doClear(InboundCommunicationPortPoolName);
	 			sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
	 			waitForTime(1000);
	 			WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
	 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
	 			doClick(InboundCommunicationPortPoolTypeDropDown);
	 			WebElement InboundCommunicationPortPoolServletType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolServletTypeValue")));
	 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolServletType, 10);
	 			doClick(InboundCommunicationPortPoolServletType);
	 			WebElement InboundCommunicationPortPoolProtocolDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolProtocolDropDown")));
	 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolProtocolDropDown, 10);
	 			doClick(InboundCommunicationPortPoolProtocolDropDown);
	 			WebElement InboundCommunicationPortPoolA2Type = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSA2TypeValue")));
	 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolA2Type, 10);
	 			doClick(InboundCommunicationPortPoolA2Type);			
	 			InboundCommunicationPortPoolAdd();
	 			waitForTime(3000);
	 		}
	    
	    public void AddInboundTCPType()
 		{
 			waitForTime(5000);
 			WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
 			doClear(InboundCommunicationPortPoolName);
 			sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
 			waitForTime(1000);
 			WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
 			doClick(InboundCommunicationPortPoolTypeDropDown);
 			WebElement InboundCommunicationPortPoolTcpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTcpTypeValue")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTcpType, 10);
 			doClick(InboundCommunicationPortPoolTcpType);
 			WebElement InboundCommunicationPortPoolProtocolDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolProtocolDropDown")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolProtocolDropDown, 10);
 			doClick(InboundCommunicationPortPoolProtocolDropDown);
 			WebElement InboundCommunicationPortPoolA2Type = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSA2TypeValue")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolA2Type, 10);
 			doClick(InboundCommunicationPortPoolA2Type);			
 			InboundCommunicationPortPoolAdd();
 			waitForTime(3000);
 		}
	    
	    public void AddInboundUDPType()
 		{
 			waitForTime(5000);
 			WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
 			doClear(InboundCommunicationPortPoolName);
 			sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
 			waitForTime(1000);
 			WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
 			doClick(InboundCommunicationPortPoolTypeDropDown);
 			WebElement InboundCommunicationPortPoolUdpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolUdpTypeValue")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolUdpType, 10);
 			doClick(InboundCommunicationPortPoolUdpType);
 			WebElement InboundCommunicationPortPoolProtocolDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolProtocolDropDown")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolProtocolDropDown, 10);
 			doClick(InboundCommunicationPortPoolProtocolDropDown);
 			WebElement InboundCommunicationPortPoolA2Type = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSA2TypeValue")));
 			TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolA2Type, 10);
 			doClick(InboundCommunicationPortPoolA2Type);			
 			InboundCommunicationPortPoolAdd();
 			waitForTime(3000);
 		}
	    
	    public void removePortPool()
			{
				waitForTime(5000);
				DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
				waitForTime(2000);
				WebElement CommunicationPortPoolRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolRemove")));
				TestUtil.waitforElementTobeLocated(CommunicationPortPoolRemove, 10);
				doClick(CommunicationPortPoolRemove); 
			}
			
}
