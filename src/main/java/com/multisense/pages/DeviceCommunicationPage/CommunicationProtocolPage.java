package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationProtocolPage extends TestBase {

	
		 
	public CommunicationProtocolPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
	}
	
	public void clickonCommunicationProtocol()
	{
		WebElement conxoMultisense_ComProtocol_communicationProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_communicationProtocol")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_ComProtocol_communicationProtocol, 10);	
		doClick(conxoMultisense_ComProtocol_communicationProtocol);		
	}
	
	public String gettextofCommunicationProtocol()
	{
		waitForTime(5000);
		WebElement conxoMultisense_ComProtocol_verifyCommunicationProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_verifyCommunicationProtocol")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_ComProtocol_verifyCommunicationProtocol, 10);
		return getText(conxoMultisense_ComProtocol_verifyCommunicationProtocol);
	}
	
	public void selectDropDownValue()
	{
		waitForTime(5000);
		WebElement conxoMultisense_ComProtocol_communicationProtocolPerPageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_communicationProtocolPerPageDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_ComProtocol_communicationProtocolPerPageDropdown, 10);
		doClick(conxoMultisense_ComProtocol_communicationProtocolPerPageDropdown);	
		WebElement conxoMultisense_ComProtocol_communicationProtocolPerPageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_communicationProtocolPerPageDropdownValue")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_ComProtocol_communicationProtocolPerPageDropdownValue, 10);
		doClick(conxoMultisense_ComProtocol_communicationProtocolPerPageDropdownValue);
		waitForTime(2000);
	}
	
	public void clickonCommunicationProtocolName(String ProtocolName)
	{
		//String ProtocolName ="ACUD Gas";
		waitForTime(5000);
        DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),'"+ProtocolName+"')]//parent::td//following-sibling::td//div[@class='x-grid-cell-inner x-grid-cell-inner-action-col']//span")).click();
        waitForTime(3000);
        DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),'"+ProtocolName+"')]//ancestor::div//following-sibling::div//span[contains(text(),'Edit')]")).click();
        waitForTime(3000);
	}
	public void selectDevicetimezone(String Devicetimezone)
	{
		waitForTime(5000);
		WebElement conxoMultisense_ComProtocol_Devicetimezone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_Devicetimezone")));
		doClick(conxoMultisense_ComProtocol_Devicetimezone);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Devicetimezone+"']")).click();
		WebElement conxoMultisense_ComProtocol_saveProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_saveProtocol")));
		doClickjavaScript(conxoMultisense_ComProtocol_saveProtocol);

	}
	public void selectCheckboxBulkRequest()
	{
		waitForTime(5000);
		WebElement conxoMultisense_ComProtocol_checkboxBulkRequest = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_checkboxBulkRequest")));
		if(!conxoMultisense_ComProtocol_checkboxBulkRequest.isSelected())
		{
			waitForTime(3000);
			doClick(conxoMultisense_ComProtocol_checkboxBulkRequest);
		}
		else {
			waitForTime(3000);
			doClick(conxoMultisense_ComProtocol_checkboxBulkRequest);
			doClick(conxoMultisense_ComProtocol_checkboxBulkRequest);
		}
		WebElement conxoMultisense_ComProtocol_saveProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_saveProtocol")));
		doClickjavaScript(conxoMultisense_ComProtocol_saveProtocol);	
	}
	public String gettextofSaveCommunicationProtocol()
	{
		WebElement conxoMultisense_ComProtocol_saveProtocolMessage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_saveProtocolMessage")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_ComProtocol_saveProtocolMessage, 10);
		return getText(conxoMultisense_ComProtocol_saveProtocolMessage);
	}
	
	
}
