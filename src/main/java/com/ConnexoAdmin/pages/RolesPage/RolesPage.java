package com.ConnexoAdmin.pages.RolesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RolesPage extends TestBase {	
	
	public  RolesPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		logout();
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}
				
	
	public void clickRoles() throws InterruptedException
	{
		Thread.sleep(5000);
		try 
		{
			WebElement ConnexoAdmin_RolesPage_Roles = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_Roles")));
			doClick(ConnexoAdmin_RolesPage_Roles);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
	public void clickAddRoles() throws InterruptedException
		{
		WebElement ConnexoAdmin_RolesPage_AddRoleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddRoleButton")));
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			doClick(ConnexoAdmin_RolesPage_AddRoleButton);		
		}

	
	public void clickRolename(String Name, String Description) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_RolesPage_RoleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleName")));
		doClear(ConnexoAdmin_RolesPage_RoleName);
		sendkeys(Name, ConnexoAdmin_RolesPage_RoleName);
		WebElement ConnexoAdmin_RolesPage_RoleDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleDescription")));
		doClear(ConnexoAdmin_RolesPage_RoleDescription);
		sendkeys(Description, ConnexoAdmin_RolesPage_RoleDescription);
		WebElement ConnexoAdmin_RolesPage_FullAccessButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_FullAccessButton")));
		doClick(ConnexoAdmin_RolesPage_FullAccessButton);
		WebElement ConnexoAdmin_RolesPage_AddRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddRoleNameButton")));
		scrolldown(ConnexoAdmin_RolesPage_AddRoleNameButton);
	}
	
	public void addRoleWithoutDiscription(String Name)
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_RolesPage_RoleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleName")));
		doClear(ConnexoAdmin_RolesPage_RoleName);
		sendkeys(Name, ConnexoAdmin_RolesPage_RoleName);
		WebElement ConnexoAdmin_RolesPage_FullAccessButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_FullAccessButton")));
		doClick(ConnexoAdmin_RolesPage_FullAccessButton);
		WebElement ConnexoAdmin_RolesPage_AddRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddRoleNameButton")));
		scrolldown(ConnexoAdmin_RolesPage_AddRoleNameButton);
	}
	
	public void updateRolename(String Name)
	{
		WebElement ConnexoAdmin_RolesPage_RoleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleName")));
		doClear(ConnexoAdmin_RolesPage_RoleName);
		sendkeys(Name, ConnexoAdmin_RolesPage_RoleName);
	}
	
	public void clickAddRoleButton()
	{
		WebElement AddRoleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddRoleButton")));
		TestUtil.waitforElementTobeLocated(AddRoleButton, 10);
		scrolldown(AddRoleButton);
	}
	
	public String getAddRolePageHeader()
	{
		waitForTime(3000);
		WebElement AddRolePageHeade = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RolePageHeaderText")));
		return AddRolePageHeade.getText();
	}
	
	public String getEditRolePageHeader()
	{
		waitForTime(3000);
		WebElement AddRolePageHeade = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RolePageHeaderText")));
		return AddRolePageHeade.getText().split(" ")[0];
	}
	
	public void clickNoAccessButton()
	{
		WebElement NoAccessButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_NoAccessButton")));
		TestUtil.waitforElementTobeLocated(NoAccessButton, 10);
		doClick(NoAccessButton);
	}
	
	public void clickRolesPerPageDropdown()
	{
		WebElement RolesPerPageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RolesPerPageDropdown")));
		TestUtil.waitforElementTobeLocated(RolesPerPageDropdown, 10);
		scrolldown(RolesPerPageDropdown);
	}
	
	public void click20PerPageOptionInRolesPerPageDropdown()
	{
		WebElement RolesPerPageDropdown20PerPageOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RolesPerPageDropdown20PerPageOption")));
		TestUtil.waitforElementTobeLocated(RolesPerPageDropdown20PerPageOption, 10);
		doClick(RolesPerPageDropdown20PerPageOption);
	}
	
	public void clickFullAccessButton()
	{
		WebElement FullAccessButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_FullAccessButton")));
		TestUtil.waitforElementTobeLocated(FullAccessButton, 10);
		doClick(FullAccessButton);
	}
	
	public void clickCreatedRoleActionIcon(String Name)
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_RolesPage_EditRoleNameButton = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_EditRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_EditRoleNameButton);
	}
	
	public void clickEditOptionForCreatedRole()
	{
		waitForTime(5000);
		WebElement EditOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_EditRoleNameButton")));
		TestUtil.waitforElementTobeLocated(EditOption, 10);
		doClick(EditOption);
	}
	
	public void clickRemoveOptionForCreatedRole()
	{
		waitForTime(3000);
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RemoveRoleNameButton")));
		TestUtil.waitforElementTobeLocated(RemoveOption, 10);
		doClick(RemoveOption);
	}
	
	public boolean isRemoveOptionDisplayed()
	{
		waitForTime(3000);
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RemoveRoleNameButton")));
		return RemoveOption.isDisplayed();
	}
	
	public boolean isRemoveWindowDisplayed()
	{
		waitForTime(3000);
		WebElement RemoveWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RemoveWindow")));
		return RemoveWindow.isDisplayed();
	}
	
	public void clickRemoveButtonInRemoveWindow()
	{
		waitForTime(5000);
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_removeButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(RemoveOption, 10);
		doClick(RemoveOption);
		waitForTime(5000);
	}
	
	public void clickCancelButtonInRemoveWindow()
	{
		waitForTime(2000);
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_cancelButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(RemoveOption, 10);
		doClick(RemoveOption);
	}
	
	public void clickCrossIconInRemoveWindow()
	{
		waitForTime(2000);
		WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_crossButtonInRemoveWindow")));
		TestUtil.waitforElementTobeLocated(RemoveOption, 10);
		doClick(RemoveOption);
	}
	
	public void clickCancelButton()
	{
		waitForTime(5000);
		WebElement CancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_CancelButton")));
		TestUtil.waitforElementTobeLocated(CancelButton, 10);
		doClickjavaScript(CancelButton);
	}
	
	public void clickSaveButton()
	{
		waitForTime(3000);
		WebElement SaveButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_SaveRoleNameButton")));
		TestUtil.waitforElementTobeLocated(SaveButton, 10);
		doClick(SaveButton);
	}
	
	public void clickAddButtonInAddRolePage()
	{
		waitForTime(3000);
		WebElement AddButtonInAddRolePage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddButtonInAddRolePage")));
		TestUtil.waitforElementTobeLocated(AddButtonInAddRolePage, 10);
		doClick(AddButtonInAddRolePage);
	}
	
	public String getFirstRoleNameInResultsTable()
	{
		waitForTime(2000);
		WebElement deletedRole = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleValueFromTableResultForFirstRow")));
		return deletedRole.getText();
	}
	
	public void removeCreatedRole(String Name)
	{
		waitForTime(5000);
		clickCreatedRoleActionIcon(Name);
		clickRemoveOptionForCreatedRole();
		clickRemoveButtonInRemoveWindow();
	}	
	
	public void clickActionIconForAdminApplicationInAddRolePage()
	{
		waitForTime(2000);
		WebElement ActionIconForApplication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_adminApplicationActionIcon")));
		TestUtil.waitforElementTobeLocated(ActionIconForApplication, 10);
		doClick(ActionIconForApplication);
	}
	
	public void clickActionIconForMultisenseApplicationInAddRolePage()
	{
		waitForTime(2000);
		WebElement ActionIconForApplication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_multisenseApplicationActionIcon")));
		TestUtil.waitforElementTobeLocated(ActionIconForApplication, 10);
		doClick(ActionIconForApplication);
	}
	
	public void clickActionIconForCalendarsResourcesInAddRolePage()
	{
		waitForTime(2000);
		WebElement ActionIconForApplication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_calendarsResourceActionIcon")));
		TestUtil.waitforElementTobeLocated(ActionIconForApplication, 10);
		doClick(ActionIconForApplication);
	}
	
	public void clickFullControlForApplicationInAddRolePage()
	{
		waitForTime(2000);
		WebElement ActionIconForApplication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_fullControlOptionForApplicationInAddRolePage")));
		TestUtil.waitforElementTobeLocated(ActionIconForApplication, 10);
		doClick(ActionIconForApplication);
	}
	
	public void clickNoAccessForApplicationInAddRolePage()
	{
		waitForTime(2000);
		WebElement ActionIconForApplication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_noAccessOptionForApplicationInAddRolePage")));
		TestUtil.waitforElementTobeLocated(ActionIconForApplication, 10);
		doClick(ActionIconForApplication);
	}
	
	public void clickAdministrateOptionForCalenderResourceInAddRolePage()
	{
		waitForTime(2000);
		WebElement AdministrateOptionForCalenderResource = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AdministrateOptionForCalenderResourceInAddRolePage")));
		TestUtil.waitforElementTobeLocated(AdministrateOptionForCalenderResource, 10);
		doClick(AdministrateOptionForCalenderResource);
	}
	
	public boolean isNoAccessForApplicationInAddRolePageDisplayed()
	{
		waitForTime(2000);
		WebElement ActionIconForApplication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_noAccessOptionForApplicationInAddRolePage")));
		return ActionIconForApplication.isDisplayed();
	}
	
	public String getErrorMessageForEmptyNameInAddRolePageDisplayed()
	{
		waitForTime(2000);
		WebElement ErrorMessage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_errorMessageForEmptyNameInAddRolePage")));
		return ErrorMessage.getText();
	}
	
	public void editRoleName(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoAdmin_RolesPage_EditRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_EditRoleNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_EditRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_EditRoleNameButton);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='Facts']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoAdmin_RolesPage_SaveRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_SaveRoleNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_SaveRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_SaveRoleNameButton);
	}
	public void removerolename(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_RolesPage_RemoveRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RemoveRoleNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_RemoveRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_RemoveRoleNameButton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}	
}


