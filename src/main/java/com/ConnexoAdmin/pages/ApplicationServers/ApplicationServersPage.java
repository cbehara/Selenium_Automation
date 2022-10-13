
package com.ConnexoAdmin.pages.ApplicationServers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ApplicationServersPage extends TestBase {

	String ApplicationServersNameValue= generateRandomName(8);
	String UpdatedApplicationServerNameValue= "updateApplicationServersAutomatedTest";

	public ApplicationServersPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(5000);
	}

	public void clickonApplicationServer()
	{            
		WebElement eleApplicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServers")));
		TestUtil.waitforElementTobeLocated(eleApplicationServers, 10);           
		doClick(eleApplicationServers);               
	}

	public String gettextofApplicationServer()
	{
		waitForTime(5000);
		WebElement eleverifyApplicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifyApplicationServers")));
		TestUtil.waitforElementTobeLocated(eleverifyApplicationServers, 10);
		return getText(eleverifyApplicationServers);
	}

	public void clickonAddApplicationServer()
	{
		WebElement eleApplicationServersPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServersPerPage")));
		if(eleApplicationServersPerPage.isDisplayed())
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add application server']//ancestor::a)[2]"));
			doClick(element);
		}else {
			WebElement element = DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add application server']//ancestor::a)[1]"));
			doClick(element);
		}
	}

	public void createApplicationServer(String ServerName,String ExportPath,String ImportPath) 
	{
		WebElement eleInputNameApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_InputNameApplicationServer")));
		waitForTime(5000);
		TestUtil.waitforElementTobeLocated(eleInputNameApplicationServer, 10);
		doClear(eleInputNameApplicationServer);
		sendkeys(ApplicationServersNameValue, eleInputNameApplicationServer);
		waitForTime(1000);
		WebElement eleExportPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ExportPathValue")));
		TestUtil.waitforElementTobeLocated(eleExportPathValue, 10);               
		doClear(eleExportPathValue);
		sendkeys(ExportPath, eleExportPathValue);
		waitForTime(1000);
		WebElement eleImportPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ImportPathValue")));
		TestUtil.waitforElementTobeLocated(eleImportPathValue, 10);
		doClear(eleImportPathValue);
		sendkeys(ImportPath, eleImportPathValue);
		waitForTime(1000);
		WebElement eleApplicationServerAdded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServerAdded")));
		doClickjavaScript(eleApplicationServerAdded);         
	}

	public void activateApplicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement eleActivateApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ActivateApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleActivateApplicationServer, 10);
		doClick(eleActivateApplicationServer);
	}

	public void deactivateApplicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement eleDeactivateApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_DeactivateApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleDeactivateApplicationServer, 10);
		doClick(eleDeactivateApplicationServer);
	}

	public void editApplicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement eleEditApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_EditApplicationServere")));
		TestUtil.waitforElementTobeLocated(eleEditApplicationServer, 10);
		doClick(eleEditApplicationServer);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='BulkSAPRegNotificationQS']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(1000);
		WebElement eleSaveApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_SaveApplicationServer")));
		doClickjavaScript(eleSaveApplicationServer);
	}

	public void removeApplicationServer()
	{
		waitForTime(5000);
		WebElement element = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span"));
		doClick(element);
		waitForTime(3000);
		WebElement eleRemoveApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_RemoveApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleRemoveApplicationServer, 10);
		doClick(eleRemoveApplicationServer);
		waitForTime(2000);
		WebElement eleAppServerValue = DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'"+ ApplicationServersNameValue +"')]//ancestor::div//a[normalize-space()='Remove']"));
		doClick(eleAppServerValue);
	}

	public String gettextofAddApplicationServer()
	{
		WebElement eleverifytextAddApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextAddApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleverifytextAddApplicationServer, 10);
		return getText(eleverifytextAddApplicationServer);
	}
	
    public void clickMessageServiceStatus()
    {            
 	   WebElement status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_satusValueFromMessageServicesTableResults")));
        TestUtil.waitforElementTobeLocated(status, 10);           
        doClick(status);               
    }
    
    public String getFirstMessageServiceFromTable()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_messageServiceFirstValueFromMessageServicesTableResults")));
        return MessageService.getText();               
    }
    
    public String getFirstImportServiceFromTable()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_importServiceFirstValueFromMessageServicesTableResults")));
        return MessageService.getText();               
    }
    
    public void clickMessageServiceStatusDropdown()
    {            
 	   WebElement status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_satusValueInputFromMessageServicesTableResults")));
        TestUtil.waitforElementTobeLocated(status, 10);           
        doClick(status);               
    }
    
    public String getMessageServiceStatusFromTable()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_satusValueFromMessageServicesTableResults")));
        return MessageService.getText();               
    }
    
    public String getMessageServiceThreadValueFromTable()
    {            
 	   WebElement ThreadValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_threadsValueFromMessageServicesTableResults")));
        return ThreadValue.getText();               
    }
    
    public void updateStatusActiveToInactive()
    {   
 	   WebElement status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_satusDropdownInactiveOptionFromMessageServicesTableResults")));
        TestUtil.waitforElementTobeLocated(status, 10);           
        doClick(status);
        DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_threadsValueFromMessageServicesTableResults"))).click();
    }
    
    public void clickMessageServiceThreads()
    {            
 	   WebElement status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_threadsValueFromMessageServicesTableResults")));
        TestUtil.waitforElementTobeLocated(status, 10);           
        doClick(status);               
    }
    
    public void updateMessageServiceThreads(String ThreadValue)
    {            
 	   WebElement status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_threadsInputForMessageServicesTableResults")));
        TestUtil.waitforElementTobeLocated(status, 10); 
        doClear(status);
        sendkeys(ThreadValue, status);
        status.sendKeys(Keys.ENTER);
    }
    
    public void clickCrossIconForMessageService()
    {            
 	   WebElement crossIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_crossIconForFirstValueFromMessageServicesTableResults")));
        TestUtil.waitforElementTobeLocated(crossIcon, 10);           
        doClick(crossIcon);               
    }
    
    public void clickAddMessageServicesButton()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addMessageServicesButton")));
        TestUtil.waitforElementTobeLocated(AddMessageServicesButton, 10);           
        doClick(AddMessageServicesButton);               
    }
    
    public boolean isAddMessageServicesButtonEnabled()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addMessageServicesButton")));
        return AddMessageServicesButton.isEnabled();             
    }
    
    public boolean isAddImportServicesButtonEnabled()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addImportServicesButton")));
        return AddMessageServicesButton.isEnabled();             
    }
    
    public void clickCrossIconForFirstImportService()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_crossIconForFirstValueFromImportServicesTableResults")));
        TestUtil.waitforElementTobeLocated(MessageService, 10);           
        doClick(MessageService);               
    }
    
    public void clickAddImportServiceButton()
    {            
 	   WebElement ImportService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addImportServicesButton")));
        TestUtil.waitforElementTobeLocated(ImportService, 10);           
        doClick(ImportService);               
    }
    
    public void clickFirstCheckBoxOfMessageServices()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addRemovedServiceFirstCheckBox")));
        TestUtil.waitforElementTobeLocated(MessageService, 10);           
        doClick(MessageService);               
    }
    
    public boolean isFirstCheckBoxOfServicesSelected()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addRemovedServiceFirstCheckBox")));
        return MessageService.isEnabled();               
    }
    
    public boolean isSecondCheckBoxOfServicesSelected()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addRemovedServiceSecondCheckBox")));
        return MessageService.isEnabled();               
    }
    
    public String getRemovedServiceFirstRowValue()
    {            
 	   WebElement MessageService = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_removedServiceFirstValue")));
        return MessageService.getText();               
    }
    
    public void clickAddButtonForServices()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_addButtonForServices")));
        TestUtil.waitforElementTobeLocated(AddMessageServicesButton, 10);           
        doClick(AddMessageServicesButton);               
    }
    
    public void clickCancelButtonForServices()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_cancelButtonForServices")));
        TestUtil.waitforElementTobeLocated(AddMessageServicesButton, 10);           
        doClickjavaScript(AddMessageServicesButton);               
    }
    
    public void clickCheckAllButtonForServices()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_checkAllButtonForServices")));
        TestUtil.waitforElementTobeLocated(AddMessageServicesButton, 10);           
        doClick(AddMessageServicesButton);               
    }
    
    public void clickUnCheckAllButtonForServices()
    {            
 	   WebElement AddMessageServicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_unCheckAllButtonForServices")));
        TestUtil.waitforElementTobeLocated(AddMessageServicesButton, 10);           
        doClick(AddMessageServicesButton);               
    }
    
    public boolean isUnCheckAllButtonEnabled()
    {            
 	   WebElement UnCheckAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_unCheckAllButtonForServices")));
        return UnCheckAllButton.isEnabled();               
    }
    
    public void ApplicationServerNameInput(String ServerName) 
    {
 	   WebElement eleInputNameApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_InputNameApplicationServer")));
        waitForTime(5000);
        TestUtil.waitforElementTobeLocated(eleInputNameApplicationServer, 10);
        doClear(eleInputNameApplicationServer);
        sendkeys(ServerName, eleInputNameApplicationServer);
    }
    
    public void ApplicationServerExportPathInput(String ExportPath) 
    {
 	   WebElement eleExportPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ExportPathValue")));
        TestUtil.waitforElementTobeLocated(eleExportPathValue, 10);               
        doClear(eleExportPathValue);
        sendkeys(ExportPath, eleExportPathValue);
    }
    
    public void ApplicationServerImportPathInput(String ImportPath) 
    {
 	   WebElement eleImportPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ImportPathValue")));
        TestUtil.waitforElementTobeLocated(eleImportPathValue, 10);
        doClear(eleImportPathValue);
        sendkeys(ImportPath, eleImportPathValue);
    }
    
    public void clickAddButton() {
 	   waitForTime(1000);
        WebElement eleApplicationServerAdded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServerAdded")));
        doClickjavaScript(eleApplicationServerAdded);  			
    }
    
    public boolean specialCharErrorMessageForNameDisplayed() {
 	   waitForTime(1000);
 	   WebElement error = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifySpecialCharErrorMessageForName")));
 	   return error.isDisplayed(); 			
    }
    
    public boolean maxLengthErrorMessageDisplayed() {
 	   waitForTime(1000);
 	   WebElement error = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifyMaxLengthErrorMessage")));
 	   return error.isDisplayed(); 	
    }
    
    public String specialCharErrorMessage() {
 	   waitForTime(1000);
 	   WebElement error = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifySpecialCharErrorMsg")));
 	   return error.getText(); 	
    }
    
    public String errorMessageForWithoutInput() {
 	   waitForTime(1000);
 	   WebElement error = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifyErrorMsgWithoutInput")));
 	   return error.getText(); 	
    }
    
    public void clickonCancelButtonInApplicationServerCreation()
    {
 	   waitForTime(1000);
 	   WebElement eleApplicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_cancelButtonApplicationServerCreation")));           
        doClickjavaScript(eleApplicationServers);               
    }

}

