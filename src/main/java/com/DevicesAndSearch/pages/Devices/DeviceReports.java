package com.DevicesAndSearch.pages.Devices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class DeviceReports extends TestBase {
	
	String DName = generateRandomName(6);	
	
	public DeviceReports()  {
		login();
        PageFactory.initElements(DriverUtility.getDriver(), this);
        Multisense();             
	}	
	
	public void clickdevices() throws InterruptedException
	{
		WebElement devices = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices")));
		doClick(devices);
    }
	
	public void clickDeviceCommunicationTasks() throws InterruptedException
	{
		WebElement devicecommunicationtasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceCommunicationTasks")));
		doClick(devicecommunicationtasks);
    }
	
	public void clickDeviceConfigurationOverview() throws InterruptedException
	{
		WebElement deviceconfigurationoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConfigurationOverview")));
		doClick(deviceconfigurationoverview);
    }
	
	public void clickDeviceConnections() throws InterruptedException
	{
		WebElement deviceconnections = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConnections")));
		doClick(deviceconnections);
    }
	
	public void clickGatePerformance() throws InterruptedException
	{
		WebElement gateperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_GatePerformance")));
		doClick(gateperformance);
    }
	
	public void clickMeterPerformance() throws InterruptedException
	{
		WebElement meterperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_MeterPerformance")));
		doClick(meterperformance);
    }
	
	public void clickPointToPointPerformance() throws InterruptedException
	{
		WebElement pointtopointperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_PointToPointPerformance")));
		doClick(pointtopointperformance);
    }
	
	public void clickRegisterReport() throws InterruptedException
	{
		WebElement registerreport = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_RegisterReport")));
		doClick(registerreport);
    }
	
	public WebElement verifyOnSelectReportType() throws InterruptedException
	{	
		WebElement selectreporttype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_SelectReportTypeText")));
	    doClick(selectreporttype);
		return selectreporttype;
    }
	
	public void clickNext() throws InterruptedException
	{
		WebElement clicknext = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_Next")));
		doClick(clicknext);
    }
	
	public void clickBack() throws InterruptedException
	{
		WebElement clickback = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_Back")));
		doClick(clickback);
    }
	
	public void clickCancel() throws InterruptedException
	{
		WebElement clickcancel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_Cancel")));
		doClick(clickcancel);
    }
	
	public void clickGenerate() throws InterruptedException
	{
		WebElement clickgenerate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_Generate")));
		doClick(clickgenerate);
    }
	
	public WebElement verifyDeviceConfigurationOverview() throws InterruptedException
	{	
		WebElement deviceconfigurationoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConfigurationOverviewText")));
	    doClick(deviceconfigurationoverview);
		return deviceconfigurationoverview;
    }
	
	public WebElement verifyDeviceConnections() throws InterruptedException
	{	
		WebElement deviceconnections = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConnectionsText")));
	    doClick(deviceconnections);
		return deviceconnections;
    }
	
	public WebElement verifyDeviceCommunicationTasks() throws InterruptedException
	{	
		WebElement devicecommunicationtasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceCommunicationTasksText")));
	    doClick(devicecommunicationtasks);
		return devicecommunicationtasks;
    }
	
	public WebElement verifyGatePerformance() throws InterruptedException
	{	
		WebElement gatewayperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_GatewayPerormanceText")));
	    doClick(gatewayperformance);
		return gatewayperformance;
    }
	
	public WebElement verifyMeterPerformance() throws InterruptedException
	{	
		WebElement meterperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_MeterPerformanceText")));
	    doClick(meterperformance);
		return meterperformance;
    }
	
	public WebElement verifyPointToPointPerformance() throws InterruptedException
	{	
		WebElement pointtopointperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_PointToPointPerformanceText")));
	    doClick(pointtopointperformance);
		return pointtopointperformance;
    }
	
	public WebElement verifyRegisterReport() throws InterruptedException
	{	
		WebElement registerreport = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_RegisterReportText")));
	    doClick(registerreport);
		return registerreport;
    }

	public WebElement verifyFieldRequired() throws InterruptedException
	{	
		WebElement fieldrequired = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_FiledRequiredText")));
	    doClick(fieldrequired);
		return fieldrequired;
    }
	
	public void clickDeviceGroupInListDropdown() throws InterruptedException
	{
		WebElement devicegroupinlist = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceGroupInListDropdown")));
		doClick(devicegroupinlist);
    }
	
	public void selectDeviceGroupInListDropdownValue() throws InterruptedException
	{
		WebElement devicegroupinlistvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceGroupInListDropdownValue")));
		doClick(devicegroupinlistvalue);
    }
	
	public void clickDeviceConfigurationOverviewRadio() throws InterruptedException
	{
		WebElement devicecommunicationtasksradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConfigurationOverviewRadio")));
		doClick(devicecommunicationtasksradio);
    }
	
	public void clickDeviceConnectionsRadio() throws InterruptedException
	{
		WebElement deviceconnectionsradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConnectionsRadio")));
		doClick(deviceconnectionsradio);
    }
	
	public void clickDeviceCommunicationTasksRadio() throws InterruptedException
	{
		WebElement devicecommunicationtasksradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceCommunicationTasksRadio")));
		doClick(devicecommunicationtasksradio);
    }
	
	public void clickGatewayPerformanceRadio() throws InterruptedException
	{
		WebElement gatewayperformanceradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_GatewayPerformanceRadio")));
		doClick(gatewayperformanceradio);
    }
	
	public void clickMeterPerformanceRadio() throws InterruptedException
	{
		WebElement meterperformanceradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_MeterPerformanceRadio")));
		doClick(meterperformanceradio);
    }
	
	public void clickPointToPointPerformanceRadio() throws InterruptedException
	{
		WebElement pointtopointperformanceradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_PointToPointPerformanceRadio")));
		doClick(pointtopointperformanceradio);
    }
	
	public void clickRegisterReportRadio() throws InterruptedException
	{
		WebElement registerreportradio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_RegisterReportRadio")));
		doClick(registerreportradio);
    }
	
	public void clickPeriodBetweenFromDropdown() throws InterruptedException
	{
		WebElement periodbetweenfrom = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_PeriodBetweenFromListDropdown")));
		doClick(periodbetweenfrom);
    }
	
	public void clickPeriodBetweenToDropdown() throws InterruptedException
	{
		WebElement periodbetweento = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_PeriodBetweenToListDropdown")));
		doClick(periodbetweento);
    }
	
	public void clickTodayFromButton() throws InterruptedException
	{
		WebElement todayfrombutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_TodayFromButton")));
		doClick(todayfrombutton);
    }
	
	public void clickTodayToButton() throws InterruptedException
	{
		WebElement todaytobutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_TodayToButton")));
		doClick(todaytobutton);
    }
	
	public WebElement verifyDeviceConfigurationOverviewReport() throws InterruptedException
	{	
		WebElement verifydeviceconfigurationoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConfigurationOverviewReport")));
		verifydeviceconfigurationoverview.click();
		return verifydeviceconfigurationoverview;
    }
	
	public WebElement verifyDeviceConnectionsReport() throws InterruptedException
	{	
		WebElement verifydeviceconnections = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceConnectionsReport")));
		verifydeviceconnections.click();
		return verifydeviceconnections;
    }
	
	public WebElement verifyDeviceCommunicationTasksReport() throws InterruptedException
	{	
		WebElement verifydevicecommunicationtasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_DeviceCommunicationTasksReport")));
		verifydevicecommunicationtasks.click();
		return verifydevicecommunicationtasks;
    }
	
	public WebElement verifyGatewayPerformanceReport() throws InterruptedException
	{	
		WebElement verifygatewayperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_GatewayPerformanceReport")));
		verifygatewayperformance.click();
		return verifygatewayperformance;
    }
	
	public WebElement verifyMeterPerformanceReport() throws InterruptedException
	{	
		WebElement verifymeterperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_MeterPerformanceReport")));
		verifymeterperformance.click();
		return verifymeterperformance;
    }
	
	public WebElement verifyPointToPointPerformanceReport() throws InterruptedException
	{	
		WebElement verifypointtopointperformance = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_PointToPointPerformanceReport")));
		verifypointtopointperformance.click();
		return verifypointtopointperformance;
    }
	
	public WebElement verifyRegisterReportReport() throws InterruptedException
	{	
		WebElement verifyregisterreport = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_Reports_RegisterReport")));
		verifyregisterreport.click();
		return verifyregisterreport;
    }
	
}
