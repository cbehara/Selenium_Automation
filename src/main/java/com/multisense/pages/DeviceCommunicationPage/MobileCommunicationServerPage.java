package com.multisense.pages.DeviceCommunicationPage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MobileCommunicationServerPage extends TestBase {
		
	 String ServerName= generateRandomName(8);	
	 String PortNumber = generateRandomNumber(2);

	 public MobileCommunicationServerPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
	}
	public void clickonMobileCommunicationServer()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers, 10);	
		doClick(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers);		
	}
	
	public String gettextofmobileCommunicationServer()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer);
	}
	
	
	public void clickonAddMobileCommunicationServer()
	{
		waitForTime(2000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerperpage")));
	     if(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerperpage.isDisplayed())
	     {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add mobile communication server')]//ancestor::a)[2]")).click();
	     }else {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add mobile communication server')]//ancestor::a)[1]")).click();
	     }
	}
     
	public void createMobileCommunicationServer(String OnlineComServer)	
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName, 10);
		doClear(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName);
		sendkeys(ServerName, ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName);
		waitForTime(1000);
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName, 10);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown")));
		doClick(ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown);
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown, 10);
		DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()='"+OnlineComServer+"']")).click();
		
//		WebElement ConnexoMultisense_MobileCommsSrvrPage_onlineComServerValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_onlineComServerValue")));
//		doClick(ConnexoMultisense_MobileCommsSrvrPage_onlineComServerValue);;
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer")));
		doClick(ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer);
		waitForTime(1000);
	}
	
	public void activateMobileCommunicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_activateServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_activateServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_activateServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_activateServer);
	}
	
	public void editMobileCommunicationServer(String Changesinterpolldelay)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoMultisense_MobileCommsSrvrPage_EditServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_EditServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_EditServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_EditServer);
		waitForTime(10000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay, 10);
		doClear(ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay);
		sendkeys(Changesinterpolldelay, ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay);
		waitForTime(5000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication, 10);
		doClear(ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication);
		sendkeys(ServerName, ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication);
		waitForTime(1000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_saveServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_saveServer")));
		doClick(ConnexoMultisense_MobileCommsSrvrPage_saveServer);
	}
	
	public void deactivateMobileCommunicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_deactivateServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_deactivateServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_deactivateServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_deactivateServer);
	}
	
	public void removeMobileCommunicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_removeServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_removeServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_removeServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_removeServer);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ ServerName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	
	public String gettextofmcsremove()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer);
	}
	
	public String gettextofmcsadd()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer);
	}
	public String gettextofmcsActivate()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer);
	}
	
	public String gettextofmcsSaved()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer);
	}
	
	public String gettextofmcsDeactivate()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer);
	}
	
	public void verifyMobileCommunicationServerFields()
	{
		WebElement MobileCommunicationServerAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer")));
		doClick(MobileCommunicationServerAdd);
		String ExpetedName = "This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifyNameMobileCommunicationServer")));
		doClick(ActualName);
		SoftAssertfunction(ActualName, ExpetedName);
		String ExpetedServerName = "This field is required";
		WebElement ActualServerName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifyServerNameMobileCommunicationServer")));
		doClick(ActualServerName);
		SoftAssertfunction(ActualServerName, ExpetedServerName);
		String ExpetedComServer = "This field is required";
		WebElement ActualComServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifyComServerMobileCommunicationServer")));
		doClick(ActualComServer);
		SoftAssertfunction(ActualComServer, ExpetedComServer);
		WebElement MobileCommunicationServerCancel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_MobileCommunicationServerCancel")));
		doClick(MobileCommunicationServerCancel);
	}
	
	public void InboundMobileCommunicationPortSerial()
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(5000);
		WebElement MobileCommunicationServerlink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_NoCommunicationPortsLink")));
		doClick(MobileCommunicationServerlink);
		waitForTime(2000);
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortInboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInboundBtn")));
		doClick(AddCommunicationPortInboundBtn);
		WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
		doClear(InboundCommunicationPortPoolName);
		sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
		waitForTime(1000);
		WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
		doClick(InboundCommunicationPortPoolTypeDropDown);
		WebElement InboundCommunicationPortPoolTcpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSerialTypeValue")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTcpType, 10);
		doClick(InboundCommunicationPortPoolTcpType);		
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
	}
	
	public void InboundMobileCommunicationServerServlet()
	{
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInsideBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortInboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInboundBtn")));
		doClick(AddCommunicationPortInboundBtn);
		WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
		doClear(InboundCommunicationPortPoolName);
		sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
		waitForTime(1000);
		WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
		doClick(InboundCommunicationPortPoolTypeDropDown);
		WebElement InboundCommunicationPortPoolTcpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolServletTypeValue")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTcpType, 10);
		doClick(InboundCommunicationPortPoolTcpType);
		WebElement InboundCommunicationPortNumber = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddInboundCommunicationPortNumber")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortNumber, 10);
		doClear(InboundCommunicationPortNumber);
		sendkeys(generateRandomNumber(3), InboundCommunicationPortNumber);
		WebElement InboundCommunicationPortPoolContextType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolContextPath")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolContextType, 10);
		doClear(InboundCommunicationPortPoolContextType);
		sendkeys(ServerName, InboundCommunicationPortPoolContextType);
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
	}
		
	public void InboundMobileCommunicationServerTCP()
	{
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInsideBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortInboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInboundBtn")));
		doClick(AddCommunicationPortInboundBtn);
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
		WebElement InboundCommunicationPortNumber = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddInboundCommunicationPortNumber")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortNumber, 10);
		doClear(InboundCommunicationPortNumber);
		sendkeys(PortNumber, InboundCommunicationPortNumber);
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
	}
	
	public void InboundMobileCommunicationServerUDP()
	{
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInsideBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortInboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInboundBtn")));
		doClick(AddCommunicationPortInboundBtn);
		WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
		doClear(InboundCommunicationPortPoolName);
		sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
		waitForTime(1000);
		WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
		doClick(InboundCommunicationPortPoolTypeDropDown);
		WebElement InboundCommunicationPortPoolTcpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolUdpTypeValue")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTcpType, 10);
		doClick(InboundCommunicationPortPoolTcpType);		
		WebElement InboundCommunicationPortNumber = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddInboundCommunicationPortNumber")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortNumber, 10);
		doClear(InboundCommunicationPortNumber);
		sendkeys(generateRandomNumber(1), InboundCommunicationPortNumber);
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
		waitForTime(3000);
	}
	
	public void OutboundMobileCommunicationServerSerial()
	{
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInsideBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortOutboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortOutboundBtn")));
		doClick(AddCommunicationPortOutboundBtn);
		WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
		doClear(InboundCommunicationPortPoolName);
		sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
		waitForTime(1000);
		WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
		doClick(InboundCommunicationPortPoolTypeDropDown);
		WebElement InboundCommunicationPortPoolTcpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolSerialTypeValue")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTcpType, 10);
		doClick(InboundCommunicationPortPoolTcpType);		
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
	}
	
	public void OutboundMobileCommunicationServerTcp()
	{
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInsideBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortOutboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortOutboundBtn")));
		doClick(AddCommunicationPortOutboundBtn);
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
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
	}
	
	public void OutboundMobileCommunicationServerUdp()
	{
		WebElement AddCommunicationPortBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortInsideBtn")));
		doClick(AddCommunicationPortBtn);
		WebElement AddCommunicationPortOutboundBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_AddCommunicationPortOutboundBtn")));
		doClick(AddCommunicationPortOutboundBtn);
		WebElement InboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolName")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolName, 10);
		doClear(InboundCommunicationPortPoolName);
		sendkeys(generateRandomName(8), InboundCommunicationPortPoolName);
		waitForTime(1000);
		WebElement InboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolTypeDropDown")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTypeDropDown, 10);
		doClick(InboundCommunicationPortPoolTypeDropDown);
		WebElement InboundCommunicationPortPoolTcpType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_InboundCommunicationPortPoolUdpTypeValue")));
		TestUtil.waitforElementTobeLocated(InboundCommunicationPortPoolTcpType, 10);
		doClick(InboundCommunicationPortPoolTcpType);		
		WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
		doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
	}
	
	public void removeCommunicationPortPool()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();
		waitForTime(2000);
		List<WebElement> Removepopup= DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),'" + ServerName + "')]//ancestor::div//a[normalize-space()='Remove']"));
		if(Removepopup.size() > 1)
		{
		   DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'" + ServerName + "')]//ancestor::div//a[normalize-space()='Remove'])[2]")).click();
		}else{
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'" + ServerName + "')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	}
}
