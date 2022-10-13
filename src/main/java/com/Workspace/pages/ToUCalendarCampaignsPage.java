package com.Workspace.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ToUCalendarCampaignsPage extends TestBase {

	String TouCalenderCampaignNamevalue;
	String TOUCalenderCommunicationTaskNameValue= generateRandomName(8);
	String DeviceGroupNameValue= generateRandomName(8);
	String CommunicationTaskNameValue= generateRandomName(9);
		
	public ToUCalendarCampaignsPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);

		Administration();
		waitForTime(3000);
	}

	public void TOUcreateCommunicationTask()	
	{
		waitForTime(5000);
		WebElement CommunicationTaskName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_CommunicationTaskName")));
		TestUtil.waitforElementTobeLocated(CommunicationTaskName, 10);
		doClear(CommunicationTaskName);
		sendkeys(TOUCalenderCommunicationTaskNameValue, CommunicationTaskName);
		waitForTime(1000);
		WebElement SystemTaskCheckBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_SystemTaskCheckBox")));
		TestUtil.waitforElementTobeLocated(SystemTaskCheckBox, 10);
		doClick(SystemTaskCheckBox);
		waitForTime(1000);
		WebElement Addbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_Addbutton")));
		doClick(Addbutton);	

	}

	public void SelectMultisenseAdminstration()
	{
		waitForTime(1000);
		MenuClick();
		waitForTime(1000);
		Multisense();
		waitForTime(1000);
		Administration();
		waitForTime(5000);
		try {
			WebElement ConnexoMultisense_DeviceTypePage_DeviceTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_DeviceTypes")));
			doClick(ConnexoMultisense_DeviceTypePage_DeviceTypes);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void addTaskTOUcalenderCommunicationTask(String SecuritySet)
	{
		waitForTime(5000);
		WebElement CommunicationTaskDropDwon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_CommunicationTaskDropDwon")));
		doClick(CommunicationTaskDropDwon);
		waitForTime(1000);
		List<WebElement> options1= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options1)
		{  
			if(element.getText().equals(TOUCalenderCommunicationTaskNameValue))
			{  
				element.click();
			}		
		}

		waitForTime(2000);
		WebElement SecuritySetDropDwon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_SecuritySetDropDown")));
		doClick(SecuritySetDropDwon);		
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+SecuritySet+"']")).click();
		waitForTime(5000);
		WebElement Addbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_Addbutton")));
		doClick(Addbutton);
		waitForTime(15000);

	}

	public void  selectDeviceType()
	{
		waitForTime(5000);
		WebElement DeviceTypeName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_DeviceTypeName")));
		doClick(DeviceTypeName);
		waitForTime(5000);
		WebElement ConfigurationsArrow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_ConfigurationsArrow")));
		doClick(ConfigurationsArrow);
		waitForTime(1000);
		WebElement ConfigurationsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_ConfigurationsLink")));
		doClick(ConfigurationsLink);
	}

	public void  selectConsumer()
	{
		waitForTime(5000);
		WebElement ConsumersLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_ConsumersLink")));
		doClick(ConsumersLink);
	}

	public void addCommunicationTaskConfiguration()
	{
		waitForTime(5000);
		WebElement CommunicationArrow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_CommunicationArrow")));
		doClick(CommunicationArrow);
		waitForTime(2000);
		WebElement CommunicationtasksLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_CommunicationtasksLink")));
		doClick(CommunicationtasksLink);
		waitForTime(3000);
		WebElement AddCommunicationTaskConfigurationButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_AddCommunicationTaskConfigurationButton")));
		doClick(AddCommunicationTaskConfigurationButton);
	}


	public void addDeviceGroup()
	{
		waitForTime(1000);
		MenuClick();
		waitForTime(3000);
		Multisense();
		waitForTime(1000);
		Devices();
		waitForTime(3000);
		WebElement Devicegroups = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_Devicegroups")));
		TestUtil.waitforElementTobeLocated(Devicegroups, 10);
		doClick(Devicegroups);
		clickonAddDeviceGroup();
		waitForTime(5000);
		WebElement CommunicationTaskName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_CommunicationTaskName")));
		TestUtil.waitforElementTobeLocated(CommunicationTaskName, 10);
		doClear(CommunicationTaskName);
		sendkeys(DeviceGroupNameValue, CommunicationTaskName);
		waitForTime(2000);
		WebElement StaticdevicegroupradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_StaticdevicegroupradioButton")));
		TestUtil.waitforElementTobeLocated(StaticdevicegroupradioButton, 10);
		doClick(StaticdevicegroupradioButton);
		WebElement NextButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_NextButton")));
		TestUtil.waitforElementTobeLocated(NextButton, 10);
		doClick(NextButton);
		waitForTime(5000);
		WebElement DeviceTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_DeviceTypeDropDown")));
		TestUtil.waitforElementTobeLocated(DeviceTypeDropDown, 10);
		doClick(DeviceTypeDropDown);
		waitForTime(3000);
		WebElement DeviceTypeValueCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_DeviceTypeValueCheckbox")));
		TestUtil.waitforElementTobeLocated(DeviceTypeValueCheckbox, 10);
		doClick(DeviceTypeValueCheckbox);
		waitForTime(3000);
		WebElement ApplyButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ApplyButton")));
		TestUtil.waitforElementTobeLocated(ApplyButton, 10);
		doClick(ApplyButton);     
		waitForTime(2000);
		deviceCheckBoxSelected();
		waitForTime(3000);
		WebElement NextButton1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_NextButton")));
		TestUtil.waitforElementTobeLocated(NextButton1, 10);
		doClickjavaScript(NextButton1);
		waitForTime(3000);
		WebElement ConfirmButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ConfirmButton")));
		TestUtil.waitforElementTobeLocated(ConfirmButton, 10);
		doClick(ConfirmButton);
		waitForTime(3000);
		WebElement FinishButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_FinishButton")));
		TestUtil.waitforElementTobeLocated(FinishButton, 10);
		doClick(FinishButton);
		waitForTime(5000);

	}

	public void deviceCheckBoxSelected()
	{

		WebElement SelecteddevicesradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_SelecteddevicesradioButton")));
		TestUtil.waitforElementTobeLocated(SelecteddevicesradioButton , 10);
		doClick(SelecteddevicesradioButton);
		waitForTime(5000);
		for(int i=3;i<=7;i++)
		{
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='SPE0100000"+i+"']//ancestor::td//preceding-sibling::td")).click();
		}	
	}

	public void clickonAddDeviceGroup()
	{
		WebElement DeviceGroupsperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_DeviceGroupsperpage")));
		if(DeviceGroupsperpage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add device group')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add device group')]//ancestor::a)[1]")).click();
		}
	}

	public void addTouCalendercampaign()
	{
		waitForTime(1000);
		MenuClick();
		waitForTime(1000);
		Multisense();
		waitForTime(1000);
		Workspace();
		waitForTime(1000);
		WebElement ToUCalendarCampaignsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ToUCalendarCampaignsLink")));
		TestUtil.waitforElementTobeLocated(ToUCalendarCampaignsLink, 10);
		doClick(ToUCalendarCampaignsLink);
		waitForTime(5000);
	}
	public void clickonAddTouCalenderCampaign()
	{
		WebElement ToUcalendercampaignsperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ToUcalendercampaignsperpage")));
		if(ToUcalendercampaignsperpage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add ToU calendar campaign')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add ToU calendar campaign')]//ancestor::a)[1]")).click();
		}
	}

	public void CreateTouCalenderCampaign(String DevicetypeNameValue,String TimeofusecalendarNameValue,String ConnectionmethodstrategyNameValue)
	{
		waitForTime(5000);		 
		TouCalenderCampaignNamevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_CommunicationTaskName"))).getText();
		waitForTime(1000);
		WebElement TouDevicetypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_TouDevicetypeDropDown")));
		doClick(TouDevicetypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+DevicetypeNameValue+"']")).click();
		waitForTime(1000);
		WebElement TouDevicegroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_TouDevicegroupDropDown")));
		doClick(TouDevicegroupDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+DeviceGroupNameValue+"']")).click();
		waitForTime(1000);
		WebElement TouActivityCalenderradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_TouActivityCalenderradioButton")));
		doClick(TouActivityCalenderradioButton);
		waitForTime(1000);
		WebElement TimeofusecalendarDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_TimeofusecalendarDropDown")));
		doClickjavaScript(TimeofusecalendarDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+TimeofusecalendarNameValue+"']")).click();
		waitForTime(1000);
		WebElement CalendaruploadcommunicationtaskDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_CalendaruploadcommunicationtaskDropDown")));
		doClick(CalendaruploadcommunicationtaskDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+TOUCalenderCommunicationTaskNameValue+"']")).click();
		waitForTime(1000);
		WebElement ConnectionmethodstrategyDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ConnectionmethodstrategyDropDown")));
		doClick(ConnectionmethodstrategyDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ConnectionmethodstrategyNameValue+"']")).click();
		waitForTime(1000);
		WebElement ValidationcommunicationtaskDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ValidationcommunicationtaskDropDown")));
		doClick(ValidationcommunicationtaskDropDown);
		DriverUtility.getDriver().findElement(By.xpath("(//li[text()='"+TOUCalenderCommunicationTaskNameValue+"'])[2]")).click();
		waitForTime(1000);
		WebElement ConnectionmethodstrategyTwoDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_ConnectionmethodstrategyTwoDropDown")));
		doClick(ConnectionmethodstrategyTwoDropDown);
		WebElement Addbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_Addbutton")));
		DriverUtility.getDriver().findElement(By.xpath("(//li[text()='"+ConnectionmethodstrategyNameValue+"'])[2]")).click();
		doClick(Addbutton);

	}

	public void editCampaign( )
	{
		waitForTime(5000);
		//DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+TouCalenderCampaignNamevalue+"']//ancestor::td//following-sibling::td//span[@class='icon-cog2 x-action-col-icon x-action-col-0  icon-cog2']")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//*[contains(text(),'TOU-CP-')]//ancestor::td//following-sibling::td//span[@class='icon-cog2 x-action-col-icon x-action-col-0  icon-cog2'])[1]")).click();
		waitForTime(1000);
		WebElement Editcampaignbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_Editcampaignbutton")));
		TestUtil.waitforElementTobeLocated(Editcampaignbutton, 10);
		doClick(Editcampaignbutton);
		waitForTime(3000);
		WebElement savebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_savebutton")));
		TestUtil.waitforElementTobeLocated(savebutton, 10);
		doClick(savebutton);

	}

	public void cancelCampaign()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("(//*[contains(text(),'TOU-CP-')]//ancestor::td//following-sibling::td//span[@class='icon-cog2 x-action-col-icon x-action-col-0  icon-cog2'])[1]")).click();
		WebElement Cancelcampaignbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_Cancelcampaignbutton")));
		waitForTime(1000);
		TestUtil.waitforElementTobeLocated(Cancelcampaignbutton, 10);
		doClick(Cancelcampaignbutton);
		WebElement POPUPCancelcampaignbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_POPUPCancelcampaignbutton")));
		TestUtil.waitforElementTobeLocated(POPUPCancelcampaignbutton, 1000);
		doClick(POPUPCancelcampaignbutton);
	}

	public void clickDevicelink()
	{
		waitForTime(5000);	
		DriverUtility.getDriver().findElement(By.xpath("(//div[text()='Actaris SL7000']//parent::td//preceding-sibling::td)[1]")).click();
		WebElement DevicesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_TOUCampaign_DevicesButton")));
		waitForTime(3000);
		TestUtil.waitforElementTobeLocated(DevicesButton, 10);
		doClick(DevicesButton);
	}

	public void clickonAddCommunicationTask()
	{
		WebElement conxoMultisense_commTaskPage_CommunicationTaskperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CommunicationTaskperpage")));
		if(conxoMultisense_commTaskPage_CommunicationTaskperpage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication task')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication task')]//ancestor::a)[1]")).click();
		}
	}

	public void createCommunicationTask()	
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_CommunicationTaskName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CommunicationTaskName")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CommunicationTaskName, 10);
		doClear(conxoMultisense_commTaskPage_CommunicationTaskName);
		sendkeys(CommunicationTaskNameValue, conxoMultisense_commTaskPage_CommunicationTaskName);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_SystemTaskCheckBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_SystemTaskCheckBox")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_SystemTaskCheckBox, 10);
		doClick(conxoMultisense_commTaskPage_SystemTaskCheckBox);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_addCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommunicationTaskbutton")));
		doClick(conxoMultisense_commTaskPage_addCommunicationTaskbutton);	

	}

	public void createActions(String CategoryValue,String ActionDropDownValue)	
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_Actions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_Actions")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_Actions, 10);		
		doClick(conxoMultisense_commTaskPage_Actions);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_AddActionsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddActionsLink")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_AddActionsLink, 10);		
		doClick(conxoMultisense_commTaskPage_AddActionsLink);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_CategoryDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CategoryDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CategoryDropdown, 10);
		doClick(conxoMultisense_commTaskPage_CategoryDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+CategoryValue+"']")).click();
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_ActionDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActionDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActionDropdown, 10);
		doClick(conxoMultisense_commTaskPage_ActionDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ActionDropDownValue+"']")).click();
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_addCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommunicationTaskbutton")));
		doClick(conxoMultisense_commTaskPage_addCommunicationTaskbutton);		
	}

	public void createCommandCategories()	
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_CommandCategories = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CommandCategories")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CommandCategories, 10);		
		doClick(conxoMultisense_commTaskPage_CommandCategories);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_AddCommandCategories = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddCommandCategories")));
		doClick(conxoMultisense_commTaskPage_AddCommandCategories);		
	}

	public void CheckActivityCalender()	
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_ActivityCalendarCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActivityCalendarCheckbox")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActivityCalendarCheckbox, 10);		
		doClick(conxoMultisense_commTaskPage_ActivityCalendarCheckbox);
		waitForTime(2000);
		WebElement conxoMultisense_commTaskPage_addCommandCategoriesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommandCategoriesButton")));
		doClickjavaScript(conxoMultisense_commTaskPage_addCommandCategoriesButton);
	}	
	public void verifyPrevillages()
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_Privileges = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_Privileges")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_Privileges, 10);		
		doClick(conxoMultisense_commTaskPage_Privileges);
		waitForTime(2000);
		WebElement conxoMultisense_commTaskPage_AddPrivilegeLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddPrivilegeLink")));
		boolean Privilegebool =conxoMultisense_commTaskPage_AddPrivilegeLink.isEnabled();

		if(!Privilegebool ==true)
		{
			WebElement conxoMultisense_commTaskPage_AddPrivilegeLink1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddPrivilegeLink")));
			doClick(conxoMultisense_commTaskPage_AddPrivilegeLink1);
			waitForTime(5000);
			WebElement conxoMultisense_commTaskPage_CheckallPriviegeLevel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CheckallPriviegeLevel")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CheckallPriviegeLevel, 10);		
			doClick(conxoMultisense_commTaskPage_CheckallPriviegeLevel);
			waitForTime(1000);
			WebElement conxoMultisense_commTaskPage_addCommandCategoriesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommandCategoriesButton")));
			TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_addCommandCategoriesButton, 10);		
			doClick(conxoMultisense_commTaskPage_addCommandCategoriesButton);
		}		
	}

	public void clickonCommunicationTask()
	{
		WebElement conxoMultisense_commTaskPage_communicationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_communicationTask")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_communicationTask, 10);	
		doClick(conxoMultisense_commTaskPage_communicationTask);		
	}
	public void  ChangePerpagevalue()
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_communicationTasksPerPageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_communicationTasksPerPageDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_communicationTasksPerPageDropdown, 10);
		doClick(conxoMultisense_commTaskPage_communicationTasksPerPageDropdown);	
		WebElement conxoMultisense_commTaskPage_communicationTasksPerPageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_communicationTasksPerPageDropdownValue")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_communicationTasksPerPageDropdownValue, 10);
		doClick(conxoMultisense_commTaskPage_communicationTasksPerPageDropdownValue);
	}

}
