package com.DevicesAndSearch.pages.Devices;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;

public class DeviceLifeCycleManagementAddDevice extends TestBase {
	
	String DName = generateRandomName(6);	
	
	public DeviceLifeCycleManagementAddDevice()  {
		login();
        PageFactory.initElements(DriverUtility.getDriver(), this);
        Multisense();               
	}
	
	 public DeviceLifeCycleManagementAddDevice(boolean alreadyLoggedIn) 
	{
		if(!alreadyLoggedIn)
		{
			login();
		}
	}
	public void clickdevices() throws InterruptedException
	{
		WebElement devices = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices")));
		doClick(devices);
}
	public void clickadddevice() throws InterruptedException
	{
		WebElement adddevice = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice")));
		doClick(adddevice);
	}
		
	public void enterName() throws InterruptedException
	{
		WebElement enterName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Name")));
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys(DName, enterName);
}
	public void serialNumber(String SerialNumber) throws InterruptedException
	{
		WebElement serialNumber = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_SerialNo")));
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys(SerialNumber, serialNumber);
}
	public void deviceType() throws InterruptedException, AWTException
	{
		WebElement deviceType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_deviceType")));
		doClick(deviceType);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement deviceTypeSelect = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_deviceTypeSelect")));
		doClick(deviceTypeSelect);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
						
		}
	
	public void deviceConfiguration( ) throws InterruptedException, AWTException
	{
		WebElement deviceConfiguration = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_deviceConfiguration")));
		doClick(deviceConfiguration);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement deviceConfigurationSelect = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_deviceConfigurationSelect")));
		doClick(deviceConfigurationSelect);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}
	public void enterManufacture(String Manufacturer ) throws InterruptedException
	{
		WebElement enterManufacture = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_enterManufacture")));
		sendkeys(Manufacturer, enterManufacture);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}
	public void enterModelNumbr(String ModelNo) throws InterruptedException
	{
		WebElement enterModelNumbr = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_enterModelNumbr")));
		doClear(enterModelNumbr);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys(ModelNo, enterModelNumbr);
		
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}
	public void enterModelVrsn(String ModelVersion) throws InterruptedException
	{
		
		WebElement enterModelVrsn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_enterModelVrsn")));
		doClear(enterModelVrsn);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys(ModelVersion, enterModelVrsn);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
}
	public void enterBatch(String batch) throws InterruptedException
	{
		WebElement enterBatch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_enterBatch")));
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys(batch,enterBatch );
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}
	public void ClickaddButton() throws InterruptedException
	{	
		WebElement addButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Addbutton")));
		doClick(addButton);
}
	
	
	public WebElement  verifyOnOverview() throws InterruptedException
	{	
		WebElement Overview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Overview")));
		doClick(Overview);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement VerifyOverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_VerifyOverviewPage")));
		doClick(VerifyOverview);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return VerifyOverview;
		
	 
      }
	
	public WebElement Verifydeviceattribute() throws InterruptedException
	{	
		WebElement DeviceAttribute = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute")));
		doClick(DeviceAttribute);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement VerifyDeviceAttribute = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_VerifyDeviceAttribute")));
		doClick(VerifyDeviceAttribute);
		return VerifyDeviceAttribute;

	}
	public void DeviceattributesModifyName() throws InterruptedException
	{	
		
		WebElement Actions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_Actions")));
		doClick(Actions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement editDeviceAttribute = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_editDeviceAttribute")));
		doClick(editDeviceAttribute);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement editName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_editName")));
		doClick(editName);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys("1",editName);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Sdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_Sdown")));
		doClick(Sdown);
		scrolldown(Sdown);
		WebElement editDeviceAttributeSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_editDeviceAttributeSave")));
		doClick(editDeviceAttributeSave);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	}
	
	public void deviceattributesEInfo() throws InterruptedException
	{	
		
		WebElement Actions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_Actions")));
		doClick(Actions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement editDeviceEMeter = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_editDeviceEMeter")));
		doClick(editDeviceEMeter);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement maxRating = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_maxRating")));
		doClick(maxRating);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		doClear(maxRating);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys("125",maxRating);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement maxRatingSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceAttribute_maxRatingSave")));
         doClick(maxRatingSave);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	public WebElement  verifyOnHistory() throws InterruptedException
	{	
		WebElement History = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_History")));
		doClick(History);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Historylogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Historylogo")));
		doClick(Historylogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Historylogo;		
	 
      }
	public void  verifyOnFirmware() throws InterruptedException
	{	
		WebElement Firmware = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Firmware")));
		doClick(Firmware);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Deviceactivation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Deviceactivation")));
		doClick(Deviceactivation);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement IssuesandAlarms = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_IssuesandAlarms")));
		doClick(IssuesandAlarms);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//WebElement EnddeviceSAPinfo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_EnddeviceSAPinfo")));
		//doClick(EnddeviceSAPinfo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
	  }
	public WebElement  verifyOnProcesses() throws InterruptedException
	{	
		WebElement Process = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Process")));
		doClick(Process);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Processlogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Processlogo")));
		doClick(Processlogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement PHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_PHistory")));
		doClick(PHistory);
		return Processlogo;		
	 
      }
	public WebElement  verifyOnServicecalls() throws InterruptedException
	{	
		
		
		WebElement serviceCalls = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_serviceCalls")));
		doClick(serviceCalls);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement serviceCallslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_serviceCallslogo")));
		doClick(serviceCallslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement sHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_sHistory")));
		doClick(sHistory);
		return serviceCallslogo;		
	 
      }
	public WebElement  verifyDataSourceLoadservice() throws InterruptedException
	{	
		
		WebElement dataSource = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_dataSource")));
		doClick(dataSource);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement loadProfiles = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_loadProfiles")));
		//doClick(loadProfiles);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", loadProfiles);			
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement loadProfilesLogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_loadProfilesLogo")));
		doClick(loadProfilesLogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return loadProfilesLogo;		
	 
      }
	public WebElement  VerifyViewSuspect() throws InterruptedException
	{	
		WebElement LPactions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_LPactions")));
		doClick(LPactions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement viewSuspects = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_viewSuspects")));
		doClick(viewSuspects);
//		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		WebElement minElectricity = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_minElectricity")));
//		doClick(minElectricity);
		return viewSuspects;
      }
	
	public WebElement  VerifyChannels() throws InterruptedException
	{	
		
		WebElement Channels = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Channels")));
		//doClick(Channels);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Channels);	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Channelslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Channelslogo")));
		doClick(Channelslogo);
		return Channelslogo;
      }
	public void  VerifyChannelsFractions() throws InterruptedException
	{	
		
		
		WebElement Channelsactions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Channelsactions")));
		doClick(Channelsactions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ChannelsEdit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ChannelsEdit")));
		doClick(ChannelsEdit);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Fractiondigit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Fractiondigit")));
		doClear(Fractiondigit);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		sendkeys("1", Fractiondigit);
		WebElement FractiondigitSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_FractiondigitSave")));
		doClick(FractiondigitSave);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
      }
	
	
	
	public WebElement  verifyLogbook() throws InterruptedException
	{	
		WebElement Logbooks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Logbooks")));
		doClick(Logbooks);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Logbookslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Logbookslogo")));
		doClick(Logbookslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Logbookslogo;		
	 
      }
	public WebElement  verifyEvents() throws InterruptedException
	{	
		WebElement Events = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Events")));
		doClick(Events);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Eventslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Eventslogo")));
		doClick(Eventslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Eventslogo;		
	 
      }
	public WebElement  verifyRegister() throws InterruptedException
	{	
		WebElement Register = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Register")));
		doClick(Register);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Registerlogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Registerlogo")));
    	doClick(Registerlogo);
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//scrolldown(Register);		
		return Registerlogo;
				
	 
      }
	public WebElement  verifyValidationConfiguartion() throws InterruptedException
	{	
		WebElement ReadingQuality = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ReadingQuality")));
		//doClick(ReadingQuality);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", ReadingQuality);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ValidationConfiguration = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ValidationConfiguration")));
		//doClick(ValidationConfiguration);
		JavascriptExecutor executor1 = (JavascriptExecutor)DriverUtility.getDriver();
		executor1.executeScript("arguments[0].click();", ValidationConfiguration);
		WebElement ValidationConfigurationlogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ValidationConfigurationlogo")));
		doClick(ValidationConfigurationlogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return ValidationConfigurationlogo;		
	 
      }
	
	public void  verifyValidationConfiguartionDeactivatenactive() throws InterruptedException
	{	
		WebElement ValidationConfigurationAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ValidationConfigurationAction")));
		doClick(ValidationConfigurationAction);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement VCdeactive = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_VCdeactive")));
		doClick(VCdeactive);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		doClick(ValidationConfigurationAction);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement VCactive = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_VCactive")));
		doClick(VCactive);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

      }
	
	public WebElement  VerifyGeneralAtrributes() throws InterruptedException
	{	
		WebElement Communication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Communication")));
		//doClick(Communication);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Communication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GeneralAttributes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_GeneralAttributes")));
		JavascriptExecutor executor1 = (JavascriptExecutor)DriverUtility.getDriver();
		executor1.executeScript("arguments[0].click();", GeneralAttributes);
		//doClick(GeneralAttributes);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement GeneralAttributeslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_GeneralAttributeslogo")));
		doClick(GeneralAttributeslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return GeneralAttributeslogo;		
	 
      }
	
	public void  verifyChangeManufacture() throws InterruptedException
	{	
		WebElement GeneralAttributesActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_GeneralAttributesActions")));
		doClick(GeneralAttributesActions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement GeneralAttributesActionsEdit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_GeneralAttributesActionsEdit")));
		doClick(GeneralAttributesActionsEdit);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Manufacture = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Manufacture")));
		doClick(Manufacture);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ManufactureActarisPLCC = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ManufactureActarisPLCC")));
		doClick(ManufactureActarisPLCC);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Toscrooldown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Toscrooldown")));
		doClick(Toscrooldown);
		scrolldown(Toscrooldown);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement GASave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_GASave")));
		doClick(GASave);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		
      }
	
	public WebElement  VerifyCommunicationPlanning() throws InterruptedException
	{	
		
		WebElement CommunicationPlanning = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationPlanning")));
		doClick(CommunicationPlanning);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement CommunicationPlanninglogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationPlanninglogo")));
		doClick(CommunicationPlanninglogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return CommunicationPlanninglogo;		
	 
      }
	
	public void  addSharedCommunicationPlanning() throws InterruptedException
	{	
		WebElement Addschedule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Addschedule")));
		//doClick(Addschedule);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Addschedule);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Addschedule_chkbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Addschedule_chkbox")));
		doClick(Addschedule_chkbox);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Addschedule_add = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Addschedule_add")));
		doClick(Addschedule_add);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
	 
      }
	
	public void  RemoveSharedCommunicationPlanning() throws InterruptedException
	{	
		
		WebElement Removeschedule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Removeschedule")));
		//doClick(Removeschedule);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Removeschedule);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Removeschedule_chkbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Removeschedule_chkbox")));
		doClick(Removeschedule_chkbox);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Addschedule_Remove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Addschedule_Remove")));
		doClick(Addschedule_Remove);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	 
      }
	
	public WebElement  VerifyCommunicationtask() throws InterruptedException
	{	
		WebElement Communicationtasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Communicationtasks")));
		//doClick(Communicationtasks);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Communicationtasks);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Communicationtaskslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Communicationtaskslogo")));
		doClick(Communicationtaskslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Communicationtaskslogo;		 
      }
	  
	public WebElement  VerifyCommunicationMethods() throws InterruptedException
	{	
		WebElement CommunicationMethods = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationMethods")));
		//doClick(CommunicationMethods);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", CommunicationMethods);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement CommunicationMethodslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationMethodslogo")));
		doClick(CommunicationMethodslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		return CommunicationMethodslogo;		
	 
      }
	
	public void DeactivateCM() throws InterruptedException
	{	
		WebElement CommunicationMethodsActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CMActions")));
		doClick(CommunicationMethodsActions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement CommunicationMethodsDeactivate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationMethodsDeactivate")));
		doClick(CommunicationMethodsDeactivate);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      }
	public void  ActivateCM() throws InterruptedException
	{	
		WebElement CommunicationMethodsActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CMActions")));
		doClick(CommunicationMethodsActions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement CommunicationMethodsactivate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationMethodsactivate")));
		doClick(CommunicationMethodsactivate);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
      }
		
	public void  VerifyCommunicationMethodsHistory() throws InterruptedException
	{	
		
		WebElement CommunicationMethodsActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CMActions")));
		doClick(CommunicationMethodsActions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement CommunicationMethodsHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommunicationMethodsHistory")));
		doClick(CommunicationMethodsHistory);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
	 
      }
	
	public WebElement  VerifySecuritysets() throws InterruptedException
	{	
		WebElement SecuritySets = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_SecuritySets")));
		doClick(SecuritySets);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement SecuritySetslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_SecuritySetslogo")));
		doClick(SecuritySetslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return SecuritySetslogo;		
	 
      }
	
	public WebElement  VerifySecurityaccessors() throws InterruptedException
	{	
		
		WebElement Securityaccessors = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Securityaccessors")));
		doClick(Securityaccessors);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Securityaccessorslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Securityaccessorslogo")));
		doClick(Securityaccessorslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Certificate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Certificate")));
		doClick(Certificate);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		
		return Securityaccessorslogo;		
	 
      }
	
	
	public WebElement  VerifyProtocolDialects() throws InterruptedException
	{	
		WebElement Protocoldialects = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Protocoldialects")));
		doClick(Protocoldialects);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Protocoldialectslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Protocoldialectslogo")));
		doClick(Protocoldialectslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Protocoldialectslogo;		
	 
      }
	
	public void  ChangeProtocolDialectsRetries() throws InterruptedException
	{	
		WebElement ProtocoldialectsActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_ProtocoldialectsActions")));
		doClick(ProtocoldialectsActions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Protocoldialectsedit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Protocoldialectsedit")));
		doClick(Protocoldialectsedit);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Retries = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Retries")));
	  doClear(Retries);
	  sendkeys("4",Retries);
		WebElement PDSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_PDSave")));
	  doClick(PDSave);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

      }
	public WebElement  VerifyCommands() throws InterruptedException
	{	
		WebElement Commands = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Commands")));
		doClick(Commands);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Commandslogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Commandslogo")));
		doClick(Commandslogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Commandslogo;		
	 
      }
	
	public void  AddCommandsandTrigger() throws InterruptedException
	{	
		WebElement addCommands = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_addCommands")));
		doClick(addCommands);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement CommandsCategory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommandsCategory")));
		doClick(CommandsCategory);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement DeviceActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_DeviceActions")));
		doClick(DeviceActions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement SelectCommands = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_SelectCommands")));
		doClick(SelectCommands);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement AlarmRegisterRset = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_AlarmRegisterRset")));
		doClick(AlarmRegisterRset);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement CommandsAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_CommandsAdd")));
		doClick(CommandsAdd);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Trigger = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Multisense_Devices_DLCM_Adddevice_Trigger")));
		 doClick(Trigger);

      }
	
	public void  Revoke() throws InterruptedException
	{	
		WebElement Commandsactions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Commandsactions")));
		doClick(Commandsactions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Revoke = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Revoke")));
		doClick(Revoke);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Revokebtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Revokebtn")));
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Revokebtn);
		//doClick(Revokebtn);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		

      }
	
	public WebElement  Verifyfirmware() throws InterruptedException
	{	
		WebElement Configuration = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Configuration")));
		//doClick(Configuration);
		JavascriptExecutor executor = (JavascriptExecutor)DriverUtility.getDriver();
		executor.executeScript("arguments[0].click();", Configuration);
		WebElement FirmwareConfiguration = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_FirmwareConfiguration")));
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		JavascriptExecutor executor1 = (JavascriptExecutor)DriverUtility.getDriver();
		executor1.executeScript("arguments[0].click();", FirmwareConfiguration);
		//doClick(FirmwareConfiguration);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Firmwarelogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Firmwarelogo")));
		doClick(Firmwarelogo);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement FirmwareConfigurationHistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_FirmwareConfigurationHistory")));
		doClick(FirmwareConfigurationHistory);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return Firmwarelogo;		
	 
      }
	public WebElement  VerifyTimeofUse() throws InterruptedException
	{	
		WebElement TimeofUse = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_TimeofUse")));
		//doClick(TimeofUse);
		JavascriptExecutor executor1 = (JavascriptExecutor)DriverUtility.getDriver();
		executor1.executeScript("arguments[0].click();", TimeofUse);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement TimeofUselogo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_TimeofUselogo")));
		doClick(TimeofUselogo);		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return TimeofUselogo;		
	 
      }
	public void  Sendtimeofusecalender () throws InterruptedException
	{	
		WebElement SendCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_SendCalender")));
		doClick(SendCalender);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement SendCalenderSelect = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_SendCalenderSelect")));
		doClick(SendCalenderSelect);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Recu01 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Recu01")));
		doClick(Recu01);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement TUSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_TUSave")));
		doClick(TUSave);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement TOUTrigger = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Configuration_TOUTrigger_Trigger")));	
		doClick(TOUTrigger);

      }
	public void  ChangeTime () throws InterruptedException
	{	
		WebElement TUactions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_TUactions")));
		doClick(TUactions);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement Checktime = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_Devices_DLCM_Adddevice_Checktime")));
		doClick(Checktime);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		/*
		 * WebElement Trigger = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
		 * "ConnexoMultisense_Devices_DLCM_Adddevice_Configuration_TOUTrigger_Trigger"))
		 * ); doClick(Trigger);
		 */
	}
	
}
