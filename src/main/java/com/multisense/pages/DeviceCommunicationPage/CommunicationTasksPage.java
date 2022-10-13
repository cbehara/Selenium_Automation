package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationTasksPage extends TestBase {
	
	String CommunicationTaskNameValue= generateRandomName(9);
	String CategoryValue= "Status information";
	String ActionDropDownValue= "Read";
		
	 public CommunicationTasksPage()
	
	{	
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
	}

	
	public void clickonCommunicationTask()
	{
		WebElement conxoMultisense_commTaskPage_communicationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_communicationTask")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_communicationTask, 10);	
		doClick(conxoMultisense_commTaskPage_communicationTask);		
	}
	
	public String gettextofCommunicationTask()
	{
		waitForTime(2000);
		WebElement conxoMultisense_commTaskPage_verifyCommunicationTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_verifyCommunicationTask")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_verifyCommunicationTask, 10);
		return getText(conxoMultisense_commTaskPage_verifyCommunicationTask);
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
	
	public void createAction(String Categoty, String Action)	
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
        DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Categoty+"']")).click();
        waitForTime(1000);
        WebElement conxoMultisense_commTaskPage_ActionDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActionDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActionDropdown, 10);
		doClick(conxoMultisense_commTaskPage_ActionDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Action+"']")).click();
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

     public void verifycommunicationtasksNameField()	
       {
    	WebElement conxoMultisense_commTaskPage_addCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommunicationTaskbutton")));
 		doClick(conxoMultisense_commTaskPage_addCommunicationTaskbutton);	
 		String Expetedvalue = "This field is required"; 
		WebElement Actualvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddCommunicationTaskNameFiledReq")));
		SoftAssertfunction(Actualvalue, Expetedvalue);
		WebElement cancelCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_cancelCommunicationTaskbutton")));
 		doClick(cancelCommunicationTaskbutton);
       }
     
     public void createActions(String Categoty, String Action)	
 	{
 		waitForTime(3000);
 		WebElement conxoMultisense_commTaskPage_AddActionsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddActions")));
 		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_AddActionsLink, 10);		
 		doClick(conxoMultisense_commTaskPage_AddActionsLink);
 		waitForTime(1000);
 		WebElement conxoMultisense_commTaskPage_CategoryDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CategoryDropdown")));
 		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CategoryDropdown, 10);
 		doClick(conxoMultisense_commTaskPage_CategoryDropdown);
         DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Categoty+"']")).click();
         waitForTime(1000);
         WebElement conxoMultisense_commTaskPage_ActionDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActionDropdown")));
 		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActionDropdown, 10);
 		doClick(conxoMultisense_commTaskPage_ActionDropdown);
 		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Action+"']")).click();
 		waitForTime(1000);
 		WebElement conxoMultisense_commTaskPage_addCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommunicationTaskbutton")));
 		doClick(conxoMultisense_commTaskPage_addCommunicationTaskbutton);		
 	}
     
    public void createLoadProfileActions(String Categoty, String Action)	
  	  {
  		waitForTime(3000);
  		WebElement conxoMultisense_commTaskPage_AddActionsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddActions")));
  		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_AddActionsLink, 10);		
  		doClick(conxoMultisense_commTaskPage_AddActionsLink);
  		waitForTime(1000);
  		WebElement conxoMultisense_commTaskPage_CategoryDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CategoryDropdown")));
  		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CategoryDropdown, 10);
  		doClick(conxoMultisense_commTaskPage_CategoryDropdown);
        DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Categoty+"']")).click();
        waitForTime(1000);
        WebElement conxoMultisense_commTaskPage_ActionDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActionDropdown")));
  		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActionDropdown, 10);
  		doClick(conxoMultisense_commTaskPage_ActionDropdown);
  		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Action+"']")).click();
  		waitForTime(1000);
  		WebElement LoadProfileTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_LoadProfileTypeDropdown")));
  		TestUtil.waitforElementTobeLocated(LoadProfileTypeDropdown, 10);
  		doClick(LoadProfileTypeDropdown);
  		WebElement LoadProfileTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_LoadProfileTypeDropdownValue")));
  		TestUtil.waitforElementTobeLocated(LoadProfileTypeDropdownValue, 10);
  		doClick(LoadProfileTypeDropdownValue);
  		WebElement LoadProfileTypeDropdown1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_LoadProfileTypeDropdown")));
  		TestUtil.waitforElementTobeLocated(LoadProfileTypeDropdown1, 10);
  		doClick(LoadProfileTypeDropdown1);
  		WebElement conxoMultisense_commTaskPage_addCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommunicationTaskbutton")));
  		doClick(conxoMultisense_commTaskPage_addCommunicationTaskbutton);		
  	  }
    
    public void createLogbooksActions(String Categoty, String Action)	
	  {
		waitForTime(3000);
		WebElement conxoMultisense_commTaskPage_AddActionsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddActions")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_AddActionsLink, 10);		
		doClick(conxoMultisense_commTaskPage_AddActionsLink);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_CategoryDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CategoryDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CategoryDropdown, 10);
		doClick(conxoMultisense_commTaskPage_CategoryDropdown);
        DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Categoty+"']")).click();
        waitForTime(1000);
        WebElement conxoMultisense_commTaskPage_ActionDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActionDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActionDropdown, 10);
		doClick(conxoMultisense_commTaskPage_ActionDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Action+"']")).click();
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_cancelCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_cancelCommunicationTaskbutton")));
		doClick(conxoMultisense_commTaskPage_cancelCommunicationTaskbutton);		
	  }
    
    public void createRegisterActions(String Categoty, String Action)	
	  {
		waitForTime(3000);
		WebElement conxoMultisense_commTaskPage_AddActionsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddActions")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_AddActionsLink, 10);		
		doClick(conxoMultisense_commTaskPage_AddActionsLink);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_CategoryDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CategoryDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CategoryDropdown, 10);
		doClick(conxoMultisense_commTaskPage_CategoryDropdown);
        DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Categoty+"']")).click();
        waitForTime(1000);
        WebElement conxoMultisense_commTaskPage_ActionDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_ActionDropdown")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_ActionDropdown, 10);
		doClick(conxoMultisense_commTaskPage_ActionDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Action+"']")).click();
		waitForTime(1000);
		WebElement RegisterTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_RegisterGroupsTypeDropdown")));
		TestUtil.waitforElementTobeLocated(RegisterTypeDropdown, 10);
		doClick(RegisterTypeDropdown);
		WebElement RegisterTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_RegisterGroupsTypeDropdownValue")));
		TestUtil.waitforElementTobeLocated(RegisterTypeDropdownValue, 10);
		doClick(RegisterTypeDropdownValue);
		WebElement RegisterTypeDropdown1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_RegisterGroupsTypeDropdown")));
		TestUtil.waitforElementTobeLocated(RegisterTypeDropdown1, 10);
		doClick(RegisterTypeDropdown1);
		WebElement conxoMultisense_commTaskPage_addCommunicationTaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommunicationTaskbutton")));
		doClick(conxoMultisense_commTaskPage_addCommunicationTaskbutton);		
	  }
    
    public void RemovePrivilege()
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_Privileges = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_Privileges")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_Privileges, 10);		
		doClick(conxoMultisense_commTaskPage_Privileges);
		WebElement conxoMultisense_commTaskPage_PrivilegesRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_PrivilegesRemoveBtn")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_PrivilegesRemove, 10);		
		doClick(conxoMultisense_commTaskPage_PrivilegesRemove);
		WebElement conxoMultisense_commTaskPage_PrivilegesPopupRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_PrivilegesPopupRemoveBtn")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_PrivilegesPopupRemove, 10);		
		doClick(conxoMultisense_commTaskPage_PrivilegesPopupRemove);	
	}
    
    public void AddPrivilege()
	{
    waitForTime(2000);
    WebElement conxoMultisense_commTaskPage_PrivilegesAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddPrivilegeBtn")));
	TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_PrivilegesAdd, 10);		
	doClick(conxoMultisense_commTaskPage_PrivilegesAdd);
	WebElement conxoMultisense_commTaskPage_CheckallPriviegeLevel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CheckallPriviegeLevel")));
	TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CheckallPriviegeLevel, 10);		
	doClick(conxoMultisense_commTaskPage_CheckallPriviegeLevel);
	waitForTime(1000);
	WebElement conxoMultisense_commTaskPage_addCommandCategoriesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommandCategoriesButton")));
	TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_addCommandCategoriesButton, 10);		
	doClick(conxoMultisense_commTaskPage_addCommandCategoriesButton);
	}
    
    public void CreateCommandCategoriesCheckAll()	
	{
		waitForTime(5000);
		WebElement conxoMultisense_commTaskPage_CommandCategories = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CommandCategories")));
		TestUtil.waitforElementTobeLocated(conxoMultisense_commTaskPage_CommandCategories, 10);		
		doClick(conxoMultisense_commTaskPage_CommandCategories);
		waitForTime(1000);
		WebElement conxoMultisense_commTaskPage_AddCommandCategories = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_AddCommandCategorie")));
		doClick(conxoMultisense_commTaskPage_AddCommandCategories);		
		WebElement conxoMultisense_commTaskPage_CheckAllCommandCategories = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_CheckallPriviegeLevel")));
		doClick(conxoMultisense_commTaskPage_CheckAllCommandCategories);
		waitForTime(2000);
		WebElement conxoMultisense_commTaskPage_addCommandCategoriesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_commTaskPage_addCommandCategoriesButton")));
		doClickjavaScript(conxoMultisense_commTaskPage_addCommandCategoriesButton);
	}
}
