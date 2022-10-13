package com.ConnexoAdmin.pages.WorkgroupsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class WorkgroupsPage extends TestBase {
	
	public  WorkgroupsPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}


	public void clickWorkGroup() throws InterruptedException
	{
		Thread.sleep(5000);
		try {
			WebElement ConnexoAdmin_WorkgroupsPage_WorkGroups = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroups")));
			doClick(ConnexoAdmin_WorkgroupsPage_WorkGroups);
		} catch (Exception e) {						
			e.printStackTrace();
		}
	}

	public void clickAddWorkGroups() throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_WorkgroupsPage_AddWorkGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddWorkGroup")));
		doClick(ConnexoAdmin_WorkgroupsPage_AddWorkGroup);

	}


	public void AddWorkGroups(String Name, String Desc) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_WorkgroupsPage_WorkGroupName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroupName")));
		doClear(ConnexoAdmin_WorkgroupsPage_WorkGroupName);
		sendkeys(Name, ConnexoAdmin_WorkgroupsPage_WorkGroupName);
		WebElement ConnexoAdmin_WorkgroupsPage_WorkGroupDesc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroupDesc")));
		doClear(ConnexoAdmin_WorkgroupsPage_WorkGroupDesc);
		sendkeys(Desc, ConnexoAdmin_WorkgroupsPage_WorkGroupDesc);
		WebElement ConnexoAdmin_WorkgroupsPage_SelectUsersButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_SelectUsersButton")));
		doClick(ConnexoAdmin_WorkgroupsPage_SelectUsersButton);
		WebElement checkbox11 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox11.click();
		WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox12.click();
		WebElement ConnexoAdmin_WorkgroupsPage_AddUsersButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddUsersButton")));
		doClick(ConnexoAdmin_WorkgroupsPage_AddUsersButton);
		WebElement ConnexoAdmin_WorkgroupsPage_AddWorkGroupButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddWorkGroupButton")));
		doClick(ConnexoAdmin_WorkgroupsPage_AddWorkGroupButton);
	}



	public void removeWorkGroup(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton, 10);
		doClick(ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	public void clickSelectUserButton()
	{
		waitForTime(2000);
		WebElement SelectUsersButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_SelectUsersButton")));
		TestUtil.waitforElementTobeLocated(SelectUsersButton, 10);
		doClick(SelectUsersButton);
	}
	
	public void clickUnselectAllButtonSelectUserButton()
	{
		waitForTime(2000);
		WebElement SelectUsersButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_unselectAllButtonInSelectUser")));
		TestUtil.waitforElementTobeLocated(SelectUsersButton, 10);
		doClick(SelectUsersButton);
	}
	
	public void selectUser(String User)
	{
		WebElement userCheckBox = DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ User +"']/ancestor::tr//td[1]//div//div"));
		TestUtil.waitforElementTobeLocated(userCheckBox, 10);
		doClick(userCheckBox);
	}
	
	public boolean isWorkGroupPresent(String workGroup)
	{
		WebElement WorkGroup = DriverUtility.getDriver().findElement(By.xpath("//div[normalize-space()='" + workGroup + "']"));
		return WorkGroup.isDisplayed();
	}
	
	public String getSelectUserText()
	{
		WebElement user = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_selectedUserText")));
		TestUtil.waitforElementTobeLocated(user, 10);
		return user.getText();
	}
	
	public boolean isselectedUserSelected(String User)
	{
		WebElement userCheckBox = DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ User +"']/ancestor::tr//td[1]//div//div"));
		return userCheckBox.isSelected();
	}
	
	public void clickAddWorkGroupsButton()
	{
		waitForTime(5000);
		WebElement AddWorkGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddWorkGroup")));
		TestUtil.waitforElementTobeLocated(AddWorkGroup, 10);
		doClick(AddWorkGroup);
	}
	
	public void clickActionIconForWorkGroup(String Name)
	{
		WebElement ActionIcon = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		TestUtil.waitforElementTobeLocated(ActionIcon, 10);
		doClick(ActionIcon);
	}
	
	public boolean isRemoveOptionDisplayed()
	{
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton")));
		return RemoveOption.isDisplayed();
	}
	
	public boolean isRemoveWindowpopupDisplayed()
	{
		WebElement removeWindowpopup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_removeWindowpopup")));
		return removeWindowpopup.isDisplayed();
	}
	
	public void clickEditOption()
	{
		WebElement EditOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_EditOption")));
		TestUtil.waitforElementTobeLocated(EditOption, 10);
		doClick(EditOption);
	}
	
	public void clickRemoveOption()
	{
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton")));
		TestUtil.waitforElementTobeLocated(RemoveOption, 10);
		doClick(RemoveOption);
	}
	
	public void clickRemoveButtonInRemovePopup()
	{
		WebElement ActionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_removeButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(ActionIcon, 10);
		doClick(ActionIcon);
	}
	
	public void clickCancelButtonInRemoveWindow()
	{
		WebElement cancelButtonInRemoveWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_cancelButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(cancelButtonInRemoveWindow, 10);
		doClick(cancelButtonInRemoveWindow);
	}
	
	public void clickCrossIconInRemoveWindow()
	{
		WebElement CrossIconInRemoveWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_crossButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(CrossIconInRemoveWindow, 10);
		doClick(CrossIconInRemoveWindow);
	}
	
	public void updateWorkGroupNameInputField(String Name)
	{
		waitForTime(3000);
		WebElement WorkGroupName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroupName")));
		TestUtil.waitforElementTobeLocated(WorkGroupName, 10);
		doClear(WorkGroupName);
		sendkeys(Name, WorkGroupName);
	}
	
	public void clickAddButton()
	{
		waitForTime(3000);
		WebElement AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddButton")));
		TestUtil.waitforElementTobeLocated(AddButton, 10);
		scrolldown(AddButton);
	}
	
	public boolean isAddButtonSelected()
	{
		WebElement AddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddButton")));
		return AddButton.isSelected();
	}
	
	public void clickSaveButton()
	{
		WebElement SaveButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_saveButton")));
		TestUtil.waitforElementTobeLocated(SaveButton, 10);
		doClick(SaveButton);
	}
	
	public void clickCancelButton()
	{
		waitForTime(3000);
		WebElement CancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_cancelButton")));
		TestUtil.waitforElementTobeLocated(CancelButton, 10);
		scrolldown(CancelButton);
	}
	
	public String getPageHeader()
	{
		WebElement PageHeader = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_pageHeader")));
		TestUtil.waitforElementTobeLocated(PageHeader, 10);
		return PageHeader.getText();
	}
	
	public String getWorkGroupPageHeader()
	{
		WebElement PageHeader = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_pageHeader")));
		TestUtil.waitforElementTobeLocated(PageHeader, 10);
		return PageHeader.getText().split(" ")[0];
	}
	
	public String getSelectedUserName()
	{
		WebElement SelectedUserName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_slectedUserText")));
		TestUtil.waitforElementTobeLocated(SelectedUserName, 10);
		return SelectedUserName.getText();
	}
	
	public String getErrorMessage()
	{
		WebElement errorMessage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_errorMessage")));
		TestUtil.waitforElementTobeLocated(errorMessage, 10);
		return errorMessage.getText();
	}
	
	public String getNoUserText()
	{
		WebElement errorMessage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_noUserText")));
		TestUtil.waitforElementTobeLocated(errorMessage, 10);
		return errorMessage.getText();
	}
	public void clickCancelButtonInSelectUser()
	{
		WebElement CrossIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_cancelButtonInSelectUser")));
		TestUtil.waitforElementTobeLocated(CrossIcon, 10);
		doClick(CrossIcon);
	}
	
	public void removeCreatedWorkGroup(String Name)
	{
		waitForTime(5000);
		clickActionIconForWorkGroup(Name);
		clickRemoveOption();
		clickRemoveButtonInRemovePopup();
	}

}


