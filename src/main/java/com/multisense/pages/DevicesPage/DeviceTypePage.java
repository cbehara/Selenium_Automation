package com.multisense.pages.DevicesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class DeviceTypePage extends TestBase {	
String Name = generateRandomName(9);
		
	public  DeviceTypePage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}
				
	
	public void clickDeviceType() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConnexoMultisense_DeviceTypePage_DeviceTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_DeviceTypes")));
		doClick(ConnexoMultisense_DeviceTypePage_DeviceTypes);
		} catch (Exception e) {
			
			e.printStackTrace();
			}
			}
	
	public void DetailsTab() throws InterruptedException
	{
		DriverUtility.getDriver().navigate().refresh();
		WebElement m = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_detailstab")));
		
		try {
			   
			m.click();
		}
		catch(StaleElementReferenceException ex)
		{
			WebElement n= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_detailstab")));
			doClick(n);
		}
	}
				
	public void clickaddDevicetypebutton() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton")));
		doClick(ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton);		
		}

	
	public void addDeviceType(String Type, String Communicationprotocol , String DeviceLifecyle) throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConnexoMultisense_DeviceTypePage_Devicetypedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Devicetypedropdown")));
	doClear(ConnexoMultisense_DeviceTypePage_Devicetypedropdown);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	sendkeys(Type, ConnexoMultisense_DeviceTypePage_Devicetypedropdown);
	ConnexoMultisense_DeviceTypePage_Devicetypedropdown.sendKeys(Keys.ENTER);
	waitForTime(5000);	
	
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox")));
	sendkeys(Communicationprotocol, ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox);
	ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox.sendKeys(Keys.ENTER);

	waitForTime(5000);

WebElement ConnexoMultisense_DeviceTypePage_Name = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Name")));
doClear(ConnexoMultisense_DeviceTypePage_Name);
sendkeys(Name, ConnexoMultisense_DeviceTypePage_Name);
ConnexoMultisense_DeviceTypePage_Name.sendKeys(Keys.ENTER);



waitForTime(5000);



WebElement ConnexoMultisense_DeviceTypePage_selectDeviceLifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_selectDeviceLifecycle")));
doClick(ConnexoMultisense_DeviceTypePage_selectDeviceLifecycle);
List<WebElement> options1= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));
for (WebElement element : options1){
if(element.getText().equals(DeviceLifecyle)){



	        element.click();
	    }
	    }
	waitForTime(5000);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton")));
	TestUtil.waitforElementTobeLocated(ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton, 30)	;
	doClick(ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton);
	
	}
	public void devicetypeconfig(String Name, String Description) throws InterruptedException
				{
//		WebElement ConnexoMultisense_DeviceTypePage_detailstab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_detailstab")));
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_NoRegisterTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_NoRegisterTypes")));
		doClick(ConnexoMultisense_DeviceTypePage_NoRegisterTypes);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceTypePage_Addregistertypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Addregistertypes")));
		doClick(ConnexoMultisense_DeviceTypePage_Addregistertypes);
		WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox1.click();
		WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox3.click();
		WebElement ConnexoMultisense_DeviceTypePage_Addregistertypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Addregistertypesbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_Addregistertypesbutton);
		Thread.sleep(5000);
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_Noloadprofiletypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Noloadprofiletypes")));
		doClick(ConnexoMultisense_DeviceTypePage_Noloadprofiletypes);
		WebElement ConnexoMultisense_DeviceTypePage_addloadprofiletypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addloadprofiletypes")));
		doClick(ConnexoMultisense_DeviceTypePage_addloadprofiletypes);
		Thread.sleep(5000);
		WebElement checkbox4 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox4.click();
		WebElement checkbox5 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox5.click();
		WebElement checkbox6 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox6.click();
		WebElement ConnexoMultisense_DeviceTypePage_addloadprofiletypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addloadprofiletypesbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_addloadprofiletypesbutton);
		
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_nologbooktypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_nologbooktypes")));
		doClick(ConnexoMultisense_DeviceTypePage_nologbooktypes);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceTypePage_addlogbooktypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addlogbooktypes")));
		doClick(ConnexoMultisense_DeviceTypePage_addlogbooktypes);
		WebElement checkbox10 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox10.click();
		WebElement checkbox11 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox11.click();
		WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox12.click();
		WebElement ConnexoMultisense_DeviceTypePage_addlogbooktypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addlogbooktypesbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_addlogbooktypesbutton);
		Thread.sleep(5000);
		
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_nodeviceconfig = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_nodeviceconfig")));
		doClick(ConnexoMultisense_DeviceTypePage_nodeviceconfig);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceTypePage_adddeviceconfig = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_adddeviceconfig")));
		doClick(ConnexoMultisense_DeviceTypePage_adddeviceconfig);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisense_DeviceTypePage_deviceconfigname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_deviceconfigname")));
		doClear(ConnexoMultisense_DeviceTypePage_deviceconfigname);
		sendkeys(Name, ConnexoMultisense_DeviceTypePage_deviceconfigname);
		
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisense_DeviceTypePage_deviceconfigdesc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_deviceconfigdesc")));
		doClear(ConnexoMultisense_DeviceTypePage_deviceconfigdesc);
		sendkeys(Description, ConnexoMultisense_DeviceTypePage_deviceconfigdesc);
		WebElement ConnexoMultisense_DeviceTypePage_adddeviceconfigbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_adddeviceconfigbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_adddeviceconfigbutton);
		waitForTime(2000);
		}
	
	    public void EditDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Edit']//parent::a")).click();	    
		    WebElement savedeviceconfigbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SaveDeviceConfiguration")));
			doClick(savedeviceconfigbutton);
	    }
	    
	    public void CloneDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Clone']//parent::a")).click();	    
		    WebElement ConnexoMultisense_DeviceTypePage_deviceconfigname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_deviceconfigname")));
			doClear(ConnexoMultisense_DeviceTypePage_deviceconfigname);
			sendkeys(generateRandomName(9), ConnexoMultisense_DeviceTypePage_deviceconfigname);
			WebElement clonedeviceconfigbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_CloneDeviceConfigurationButton")));
			doClick(clonedeviceconfigbutton);
	    }
	    
	    public void ActivateDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Activate']//parent::a")).click();	    
		    String ExpectedActivate = "Device configuration activated";
			WebElement ActualActivate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyActivate")));         
			TitleAssertFunction(ActualActivate, ExpectedActivate);
	    }
	    
	    public void SetAsDefaultDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Set as default']//parent::a")).click();	    
		    String ExpectedSetasdefault = "Device configuration set as default";
			WebElement ActualSetasdefault = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifySetasdefault")));         
			TitleAssertFunction(ActualSetasdefault, ExpectedSetasdefault);
	    }
	    
	    public void RemoveAsDefaultDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Remove as default']//parent::a")).click();	    
		    String ExpectedRemovedasdefault = "Device configuration removed as default";
			WebElement ActualRemovedasdefault = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyRemovedasdefault")));         
			TitleAssertFunction(ActualRemovedasdefault, ExpectedRemovedasdefault);
	    }
	    
	    public void DeactivateDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Deactivate']//parent::a")).click();	    
		    String ExpectedDeactivate = "Device configuration deactivated";
			WebElement ActualDeactivate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyDeactivate")));         
			TitleAssertFunction(ActualDeactivate, ExpectedDeactivate);
	    }
	    
	    public void RemoveDeviceConfiguration(String Name)
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//a[text()='" + Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();	    
		    DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'" + Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		    String ExpectedRemove = "Device configuration removed";
			WebElement ActualRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyRemoved")));         
			TitleAssertFunction(ActualRemove, ExpectedRemove);
	    }
	    
	    public void EditLoadProfileType()
	    {
		    waitForTime(3000);
		    WebElement DataSourceIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_DataSourcesIcon")));
			doClick(DataSourceIcon);
		    WebElement LoadProfileTypesTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_LoadProfileTypesTab")));
			doClick(LoadProfileTypesTab);
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='15min Electricity A+']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='15min Electricity A+']//ancestor::td//following-sibling::td//span//following::span[text()='Edit']//parent::a")).click();	    
		    WebElement saveloadprofilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SaveLoadProfileTypes")));
			doClick(saveloadprofilebutton);
		    String ExpectedEdit = "Load profile type saved";
			WebElement ActualEdit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyEditLoadProfile")));         
			TitleAssertFunction(ActualEdit, ExpectedEdit);
	    }
	    
	    public void RemoveLoadProfileType()
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='15min Electricity A+']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='15min Electricity A+']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();	    	    
		    DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'15min Electricity A+')]//ancestor::div//a[normalize-space()='Remove']")).click();
		    String ExpectedRemove = "Load profile type removed";
			WebElement ActualRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyRemoveLoadProfile")));         
			TitleAssertFunction(ActualRemove, ExpectedRemove);
	    }
	    
	    public void RemoveLogbookType()
	    {
		    waitForTime(3000);
		    WebElement LogbookTypeTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_LogbookTypesTab")));
			doClick(LogbookTypeTab);
			waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='Standard event logbook']//ancestor::td//following-sibling::td//span")).click();    
		    DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'Standard event logbook')]//ancestor::div//a[normalize-space()='Remove']")).click();
		    String ExpectedRemove = "Logbook type removed";
			WebElement ActualRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyRemoveLogbookType")));         
			TitleAssertFunction(ActualRemove, ExpectedRemove);
	    }
	    
	    public void EditRegisterType()
	    {
		    waitForTime(3000);
		    WebElement RegisterTypesTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_RegisterTypesTab")));
			doClick(RegisterTypesTab);
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='Active meter firmware version (status)']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='Active meter firmware version (status)']//ancestor::td//following-sibling::td//span//following::span[text()='Edit']//parent::a")).click();	    
		    WebElement saveloadprofilebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SaveLoadProfileTypes")));
			doClick(saveloadprofilebutton);
		    String ExpectedEdit = "Register type saved";
			WebElement ActualEdit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyEditRegisterType")));         
			TitleAssertFunction(ActualEdit, ExpectedEdit);
	    }
	    
	    public void RemoveRegisterType()
	    {
		    waitForTime(3000);
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='Active meter firmware version (status)']//ancestor::td//following-sibling::td//span")).click();
		    DriverUtility.getDriver().findElement(By.xpath("//div[text()='Active meter firmware version (status)']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();	    	    
		    DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'Active meter firmware version (status)')]//ancestor::div//a[normalize-space()='Remove']")).click();
		    String ExpectedRemove = "Register type removed";
			WebElement ActualRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_DevicesPage_verifyRemoveRegister")));         
			TitleAssertFunction(ActualRemove, ExpectedRemove);
	    }    
	    
		public void removeDevicetype(String Communicationprotocol)
		{
			waitForTime(5000);
			WebElement ConxoMultisense_LoadProfileTypePage_PerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_PerpageDropDown")));
			doClick(ConxoMultisense_LoadProfileTypePage_PerpageDropDown);		
			waitForTime(1000);
			WebElement ConxoMultisense_LoadProfileTypePage_Perpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Perpagevalue")));
			doClick(ConxoMultisense_LoadProfileTypePage_Perpagevalue);
			WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
			scrolldown(a);
			waitForTime(3000);
			DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ Name +"']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();
			waitForTime(4000);
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
		
		public void VerifyAddDeviceTypeFields()
		{
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			WebElement ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton")));
			doClick(ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton);	
			WebElement ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton, 30);
			doClick(ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton);
			String ExpectedCommunicationProtocol = "This field is required";
			WebElement ActualCommunicationProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_VerifyCommunicationProtocolField")));         
			TitleAssertFunction(ActualCommunicationProtocol, ExpectedCommunicationProtocol);
			String ExpectedName = "This field is required";
			WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_VerifyNameField")));         
			TitleAssertFunction(ActualName, ExpectedName);
			String ExpectedDeviceLifeCycle = "This field is required";
			WebElement ActualDeviceLifeCycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_VerifyDeviceLifeCycleField")));         
			TitleAssertFunction(ActualDeviceLifeCycle, ExpectedDeviceLifeCycle);
			WebElement Cancelevicelifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Canceldevicelifecycle")));
			TestUtil.waitforElementTobeLocated(Cancelevicelifecycle, 30);
			doClick(Cancelevicelifecycle);
		}
		
		public void AddCustomAttributeSet()
		{
			WebElement CustomAttributeSetIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_CustomAttributeSetIcon")));
			doClick(CustomAttributeSetIcon);
			WebElement CustomAttributeSetTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_CustomAttributeSetTab")));
			doClick(CustomAttributeSetTab);
			WebElement AddCustomAttributeSetButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AddCustomAttributeSetButton")));
			doClick(AddCustomAttributeSetButton);
			WebElement CheckAllCustomAttributeSetButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_CheckAllCustomAttributeSetButton")));
			doClick(CheckAllCustomAttributeSetButton);
			WebElement AddCustomAttributeSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AddCustomAttributeSet")));
			doClick(AddCustomAttributeSet);
		}
		
		public void RemoveCustomAttributeSet()
		{
			waitForTime(2000);
			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Manufacturer-info']//ancestor::td//following-sibling::td//span")).click();
			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Manufacturer-info']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'Manufacturer-info')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
		
		public void AddSecurityAccessors()
		{
			WebElement SecurityAccessorsTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SecurityAccessorsTab")));
			doClick(SecurityAccessorsTab);
			WebElement AddSecurityAccessorsButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AddSecurityAccessorsButton")));
			doClick(AddSecurityAccessorsButton);
			WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
			checkbox1.click();
			WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
			checkbox2.click();
			WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
			checkbox3.click();
			WebElement AddSecurityAccessors = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AddSecurityAccessors")));
			doClick(AddSecurityAccessors);
		}
		
		public void ConfigureKeyRenewal()
		{
			waitForTime(2000);
			DriverUtility.getDriver().findElement(By.xpath("//div[text()='AuthenticationKey']//ancestor::td//following-sibling::td//span")).click();
			DriverUtility.getDriver().findElement(By.xpath("//div[text()='AuthenticationKey']//ancestor::td//following-sibling::td//span//following::span[text()='Configure key renewal']//parent::a")).click();
			WebElement SaveSecurityAccessors = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SaveSecurityAccessors")));
			doClick(SaveSecurityAccessors);		
		}
		
		public void RemoveSecurityAccessors()
		{
			waitForTime(2000);
			DriverUtility.getDriver().findElement(By.xpath("//div[text()='AuthenticationKey']//ancestor::td//following-sibling::td//span")).click();
			DriverUtility.getDriver().findElement(By.xpath("//div[text()='AuthenticationKey']//ancestor::td//following-sibling::td//span//following::span[text()='Remove']//parent::a")).click();
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'AuthenticationKey')]//ancestor::div//a[normalize-space()='Remove']")).click();
			DriverUtility.getDriver().findElement(By.xpath("//a[@href='#/administration/devicetypes']")).click();
		}	
		
		public void EditFirmwareSpecifications()
		{
			WebElement SpecificationIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SpecificationIcon")));
			doClick(SpecificationIcon);
			WebElement FirmwareVersionsTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_FirmwareVersionsTab")));
			doClick(FirmwareVersionsTab);
			WebElement SpecificationTabs = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SpecificationTab")));
			doClick(SpecificationTabs);
			WebElement SpecificationActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SpecificationActionButton")));
			doClick(SpecificationActionButton);
			WebElement SpecificationEditButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SpecificationEditButton")));
			doClick(SpecificationEditButton);
			WebElement AllowFirmwareManagement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AllowFirmwareManagement")));
			doClick(AllowFirmwareManagement);
			WebElement SaveSecurityAccessors = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_SaveSecurityAccessors")));
			doClick(SaveSecurityAccessors);	
		}
		
		public void VerifyFirmwareVersions()
		{
			WebElement FirmwareVersionsTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_FirmwareVersionsInnerTab")));
			doClick(FirmwareVersionsTab);
			WebElement AddFirmwareVersionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AddFirmwareVersionButton")));
			doClick(AddFirmwareVersionButton);
			String Expected = "There are no firmware files of this type uploaded to the device type";
			WebElement Actual = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_VerifyFirmwareVersionFields")));         
			TitleAssertFunction(Actual, Expected);
		}
		
	}