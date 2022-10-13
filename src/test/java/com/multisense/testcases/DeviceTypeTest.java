package com.multisense.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.base.base.TestBase;
import com.multisense.pages.DevicesPage.DeviceTypePage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class DeviceTypeTest  extends TestBase{

	String AddDeviceTypeSheet = "AddDeviceType";
	Logger log = LogManager.getLogger(DeviceTypeTest.class);            

	DeviceTypePage DeviceTypespage;

	public DeviceTypeTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForAddDeviceType() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddDeviceTypeSheet);
		return testData;
	}	             

	@Test(priority =1, description = "click device type", enabled = true ) 
	public void clickDeviceType() throws InterruptedException
	{
		DeviceTypespage = new DeviceTypePage();            
		reporterLog("Starting testcase Click DeviceType");
		log.info("****************************** starting test case : Click Device Type ***************************");
		DeviceTypespage.clickDeviceType();
		log.info("****************************** Ending test case  Click Device Type ***************************");		
	}

	@Test(priority =2, description = "click add device type button", enabled = true ) 
	public void clickaddDevicetypebutton() throws InterruptedException
	{
		reporterLog("Starting testcase Click and Add DeviceType button");
		log.info("****************************** starting test case : Click and Add DeviceType button ******************");
		DeviceTypespage.clickaddDevicetypebutton();
		log.info("****************************** Ending test case : Click and Add DeviceType button ******************");
	}

	@Test(priority =3, dataProvider = "getTestDataForAddDeviceType", description = " add device type ", enabled = true ) 
	public void addDeviceType(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Add DeviceType");
		log.info("****************************** starting test case : Add DeviceType ******************");
		DeviceTypespage.addDeviceType(Type, Communicationprotocol,DeviceLifecyle );
		String Expecteddevicetypeeadded = "Device type added";
		WebElement Actuallifetypeadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_verifydevicetypeadded")));        
		SoftAssertfunction(Actuallifetypeadded, Expecteddevicetypeeadded);
		waitForTime(5000);
		log.info("****************************** Ending test case : Add DeviceType ******************");
	}

	@Test(priority =4, dataProvider = "getTestDataForAddDeviceType", description = "add device type config", enabled = true ) 
	public void addDeviceTypeconfig(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Add DeviceType Configuration");
		log.info("****************************** starting test case : Add DeviceType Configuration******************");
		DeviceTypespage.devicetypeconfig(Name , Description);
		log.info("****************************** Ending test case : Add Device Type Configuration********************");

	}
	
	@Test(priority =5, dataProvider = "getTestDataForAddDeviceType", description = "Edit Device Configuration", enabled = true ) 
	public void editDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Edit Device Configuration");
		log.info("****************************** starting test case : Edit Device Configuration******************");
		DeviceTypespage.EditDeviceConfiguration(Name);
		log.info("****************************** Ending test case : Edit Device Configuration********************");
	}
	
	@Test(priority =6, dataProvider = "getTestDataForAddDeviceType", description = "Clone Device Configuration", enabled = true ) 
	public void cloneDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Clone Device Configuration");
		log.info("****************************** starting test case : Clone Device Configuration******************");
		DeviceTypespage.CloneDeviceConfiguration(Name);
		waitForTime(5000);
		log.info("****************************** Ending test case : Clone Device Configuration********************");
	}
	
	@Test(priority =7, dataProvider = "getTestDataForAddDeviceType", description = "Activate Device Configuration", enabled = true ) 
	public void ActivateDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Activate Device Configuration");
		log.info("****************************** starting test case : Activate Device Configuration******************");
		DeviceTypespage.ActivateDeviceConfiguration(Name);
		log.info("****************************** Ending test case : Activate Device Configuration********************");
	}
	
	@Test(priority =8, dataProvider = "getTestDataForAddDeviceType", description = "Set As Default Device Configuration", enabled = true ) 
	public void SetAsDefaultDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Set As Default Device Configuration");
		log.info("****************************** starting test case : Set As Default Device Configuration******************");
		DeviceTypespage.SetAsDefaultDeviceConfiguration(Name);
		log.info("****************************** Ending test case : Set As Default Device Configuration********************");
	}
	
	@Test(priority =9, dataProvider = "getTestDataForAddDeviceType", description = "Remove As Default Device Configuration", enabled = true ) 
	public void RemoveAsDefaultDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Remove As Default Device Configuration");
		log.info("****************************** starting test case : Remove As Default Device Configuration******************");
		DeviceTypespage.RemoveAsDefaultDeviceConfiguration(Name);
		log.info("****************************** Ending test case : Remove As Default Device Configuration********************");
	}
	
	@Test(priority =10, dataProvider = "getTestDataForAddDeviceType", description = "Deactivate Device Configuration", enabled = true ) 
	public void DeactivateDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Deactivate Device Configuration");
		log.info("****************************** starting test case : Deactivate Device Configuration******************");
		DeviceTypespage.DeactivateDeviceConfiguration(Name);
		log.info("****************************** Ending test case : Deactivate Device Configuration********************");
	}
	
	@Test(priority =11, dataProvider = "getTestDataForAddDeviceType", description = "Remove Device Configuration", enabled = true ) 
	public void RemoveDeviceConfiguration(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Remove Device Configuration");
		log.info("****************************** starting test case : Remove Device Configuration******************");
		DeviceTypespage.RemoveDeviceConfiguration(Name);
		log.info("****************************** Ending test case : Remove Device Configuration********************");
	}
	
	@Test(priority =12, description = "Edit Load Profile Type", enabled = true ) 
	public void EditLoadProfileType() throws InterruptedException
	{
		reporterLog("Starting testcase Edit Load Profile");
		log.info("****************************** starting test case : Edit Load Profile Type******************");
		DeviceTypespage.EditLoadProfileType();
		log.info("****************************** Ending test case : Edit Load Profile Type********************");
	}
	
	@Test(priority =13, description = "Remove Load Profile Type", enabled = true ) 
	public void RemoveLoadProfileType() throws InterruptedException
	{
		reporterLog("Starting testcase Remove Load Profile Type");
		log.info("****************************** starting test case : Remove Load Profile Type******************");
		DeviceTypespage.RemoveLoadProfileType();
		log.info("****************************** Ending test case : Remove Load Profile Type********************");
	}
	
	@Test(priority =14, description = "Remove Logbook Type", enabled = true ) 
	public void RemoveLogbookType() throws InterruptedException
	{
		reporterLog("Starting testcase Remove Logbook Type");
		log.info("****************************** starting test case : Remove Logbook Type******************");
		DeviceTypespage.RemoveLogbookType();
		log.info("****************************** Ending test case : Remove Logbook Type********************");
	}
	
	@Test(priority =15, description = "Edit Register Type", enabled = true ) 
	public void EditRegisterType() throws InterruptedException
	{
		reporterLog("Starting testcase Edit Register Type");
		log.info("****************************** starting test case : Edit Register Type******************");
		DeviceTypespage.EditRegisterType();
		log.info("****************************** Ending test case : Edit Register Type********************");
	}
	
	@Test(priority =16, description = "Remove Register Type", enabled = true ) 
	public void RemoveRegisterType() throws InterruptedException
	{
		reporterLog("Starting testcase Remove Register Type");
		log.info("****************************** starting test case : Remove Register Type******************");
		DeviceTypespage.RemoveRegisterType();
		log.info("****************************** Ending test case : Remove Register Type********************");
	}
	
	@Test(priority =17, description = "Add Custom Attribute Set", enabled = true ) 
	public void addCustomAttributeSet() throws InterruptedException
	{
		reporterLog("Starting testcase Add Custom Attribute Set");
		log.info("****************************** starting test case : Add Custom Attribute Set******************");
		DeviceTypespage.AddCustomAttributeSet();
		log.info("****************************** Ending test case : Add Custom Attribute Set********************");
	}
	
	@Test(priority =18, description = "Remove Custom Attribute Set", enabled = true ) 
	public void removeCustomAttributeSet() throws InterruptedException
	{
		reporterLog("Starting testcase Remove Custom Attribute Set");
		log.info("****************************** starting test case : Remove Custom Attribute Set******************");
		DeviceTypespage.RemoveCustomAttributeSet();
		log.info("****************************** Ending test case : Remove Custom Attribute Set********************");
	}
	
	@Test(priority =19, description = "Edit Firmware Specifications", enabled = true ) 
	public void EditFirmwareSpecifications() throws InterruptedException
	{
		reporterLog("Starting testcase Edit Firmware Specifications");
		log.info("****************************** starting test case : Edit Firmware Specifications******************");
		DeviceTypespage.EditFirmwareSpecifications();
		log.info("****************************** Ending test case : Edit Firmware Specifications********************");
	}
	
	@Test(priority =20, description = "Verify Firmware Vesion Fields", enabled = true ) 
	public void VerifyFirmwareVesionFields() throws InterruptedException
	{
		reporterLog("Starting testcase Edit Firmware Specifications");
		log.info("****************************** starting test case : Verify Firmware Vesion Fields******************");
		DeviceTypespage.VerifyFirmwareVersions();
		log.info("****************************** Ending test case : Verify Firmware Vesion Fields********************");
	}
	
	@Test(priority =21, description = "Add Security Accessors", enabled = true ) 
	public void addSecurityAccessors() throws InterruptedException
	{
		reporterLog("Starting testcase Add Custom Attribute Set");
		log.info("****************************** starting test case : Add Security Accessors******************");
		DeviceTypespage.AddSecurityAccessors();
		log.info("****************************** Ending test case : Add Security Accessors********************");
	}
	
	@Test(priority =22, description = "Configure Key Renewal", enabled = true ) 
	public void configureKeyRenewal() throws InterruptedException
	{
		reporterLog("Starting testcase Configure Key Renewal");
		log.info("****************************** starting test case : Configure Key Renewal******************");
		DeviceTypespage.ConfigureKeyRenewal();
		log.info("****************************** Ending test case : Configure Key Renewal********************");
	}
	
	@Test(priority =23, description = "Remove Security Accessors", enabled = true ) 
	public void removeSecurityAccessors() throws InterruptedException
	{
		reporterLog("Starting testcase Remove Security Accessors");
		log.info("****************************** starting test case : Remove Security Accessors******************");
		DeviceTypespage.RemoveSecurityAccessors();
		log.info("****************************** Ending test case : Remove Security Accessors********************");
	}
	
	@Test(priority =24, dataProvider = "getTestDataForAddDeviceType", enabled = true ) 
	public void removedevicetype(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Remove DeviceType Configuration");
		log.info("****************************** starting test case : Add DeviceType Configuration******************");
		DeviceTypespage.removeDevicetype(Communicationprotocol);
		log.info("****************************** Ending test case: Remove Device Type ******************************");

	}	
	
	@Test(priority =25, enabled = true ) 
	public void verifyDeviceTypeFields() throws InterruptedException
	{
		reporterLog("Starting testcase Remove DeviceType Configuration");
		log.info("****************************** starting test case : Verify Device Type Fields******************");
		DeviceTypespage.VerifyAddDeviceTypeFields();
		
		log.info("****************************** Ending test case: Verify Device Type Fields ******************************");

	}

}