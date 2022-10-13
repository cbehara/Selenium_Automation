package com.DevicesAndSearch.pages.Devices;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class DevicesPage extends TestBase {
	String Name = generateRandomName(8);
    
	public  DevicesPage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Devices();
	}				
	
	public void AddDevices() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConnexoDevices_DevicesPage_AddDevice = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_AddDevice")));
		doClick(ConnexoDevices_DevicesPage_AddDevice);
		} catch (Exception e) {
						// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
				
	public void AddDevicesSpecs(String DeviceTypeConfig, String IssueReason) throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConnexoDevices_DevicesPage_Name = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Name")));
		doClick(ConnexoDevices_DevicesPage_Name);	
		sendkeys(Name, ConnexoDevices_DevicesPage_Name);
		WebElement ConnexoDevices_DevicesPage_DeviceTypeConfig = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_DeviceTypeConfig")));
		doClick(ConnexoDevices_DevicesPage_DeviceTypeConfig);	
		sendkeys(DeviceTypeConfig, ConnexoDevices_DevicesPage_DeviceTypeConfig);
		ConnexoDevices_DevicesPage_DeviceTypeConfig.sendKeys(Keys.ENTER);
		WebElement ConnexoDevices_DevicesPage_Addbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Addbutton")));
		doClick(ConnexoDevices_DevicesPage_Addbutton);	
		}
	
	public void CreateIssue(String DeviceTypeConfig, String IssueReason) throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ConnexoDevices_DevicesPage_CreateActionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_CreateActionbutton")));
	doClick(ConnexoDevices_DevicesPage_CreateActionbutton);	
	WebElement ConnexoDevices_DevicesPage_CreateAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_CreateAction")));
	doClick(ConnexoDevices_DevicesPage_CreateAction);
	WebElement ConnexoDevices_DevicesPage_IssueReason = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_IssueReason")));
	doClick(ConnexoDevices_DevicesPage_IssueReason);
	sendkeys(IssueReason, ConnexoDevices_DevicesPage_IssueReason);
	ConnexoDevices_DevicesPage_IssueReason.sendKeys(Keys.ENTER);
	WebElement ConnexoDevices_DevicesPage_Savebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Savebutton")));
	doClick(ConnexoDevices_DevicesPage_Savebutton);	
		
	}
	
	public void DeactivateConnButton() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ConnexoDevices_DevicesPage_Actionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Actionbutton")));
	doClick(ConnexoDevices_DevicesPage_Actionbutton);	
	WebElement ConnexoDevices_DevicesPage_Deactivatebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Deactivatebutton")));
	doClick(ConnexoDevices_DevicesPage_Deactivatebutton);	
	}
	
	public void ActivateConnButton() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ConnexoDevices_DevicesPage_Actionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Actionbutton")));
	doClick(ConnexoDevices_DevicesPage_Actionbutton);	
	WebElement ConnexoDevices_DevicesPage_Conn_Activatebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Conn_Activatebutton")));
	doClick(ConnexoDevices_DevicesPage_Conn_Activatebutton);	
	}
	
	public void RunNowConnButton() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ConnexoDevices_DevicesPage_Actionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Actionbutton")));
	doClick(ConnexoDevices_DevicesPage_Actionbutton);	
	WebElement ConnexoDevices_DevicesPage_RunNowbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_RunNowbutton")));
	doClick(ConnexoDevices_DevicesPage_RunNowbutton);	
	}

	
	public void ActivateAll() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ConnexoDevices_DevicesPage_Activateallbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Activateallbutton")));
	doClick(ConnexoDevices_DevicesPage_Activateallbutton);	
	}
	
	public void DeactivateAll() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement ConnexoDevices_DevicesPage_Activateallbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Activateallbutton")));
	doClick(ConnexoDevices_DevicesPage_Activateallbutton);	
	}
	
	public void RunNowCommButton() throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConnexoDevices_DevicesPage_Comm_Actionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_Comm_Actionbutton")));
		doClick(ConnexoDevices_DevicesPage_Comm_Actionbutton);	
		WebElement ConnexoDevices_DevicesPage_RunNowbutton1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDevices_DevicesPage_RunNowbutton1")));
		TestUtil.waitforElementTobeLocated(ConnexoDevices_DevicesPage_RunNowbutton1,20);
		doClick(ConnexoDevices_DevicesPage_RunNowbutton1);
	}
	
	
		
	
	}


