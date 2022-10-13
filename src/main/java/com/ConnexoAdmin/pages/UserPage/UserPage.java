package com.ConnexoAdmin.pages.UserPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class UserPage extends TestBase { 
          
	public  UserPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		logout();
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}				
	
	public void clickuser() throws InterruptedException
	{
		Thread.sleep(5000);
		try 
		{
			WebElement ConnexoAdmin_UserPage_Users = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_Users")));
			doClick(ConnexoAdmin_UserPage_Users);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
	public void editUser(String desc, String Name, String mail, String lang, String checkbox1)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+Name+"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoAdmin_UserPage_EditUser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EditUser")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_EditUser, 10);
		doClick(ConnexoAdmin_UserPage_EditUser);
		
		waitForTime(5000);
		WebElement ConnexoAdmin_UserPage_description = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_description")));
		doClick(ConnexoAdmin_UserPage_description);
		doClear(ConnexoAdmin_UserPage_description);
		sendkeys(desc, ConnexoAdmin_UserPage_description);
		
		WebElement ConnexoAdmin_UserPage_email = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_email")));
		doClick(ConnexoAdmin_UserPage_email);
		waitForTime(5000);
		doClear(ConnexoAdmin_UserPage_email);
		sendkeys(mail, ConnexoAdmin_UserPage_email);
		
		doClick(ConnexoAdmin_UserPage_email);
		waitForTime(5000);
		doClear(ConnexoAdmin_UserPage_email);
		sendkeys(mail, ConnexoAdmin_UserPage_email);
		
		WebElement ConnexoAdmin_UserPage_language = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_language")));
		doClick(ConnexoAdmin_UserPage_language);
		waitForTime(5000);
		doClear(ConnexoAdmin_UserPage_language);
		sendkeys(lang, ConnexoAdmin_UserPage_language);
		ConnexoAdmin_UserPage_language.sendKeys(Keys.ENTER);
		
		
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("label[class*='x-form-cb-label x-form-cb-label-after']"));  
		for (WebElement element : options)
		{  
		     if(element.getText().equals(checkbox1))
		     {  

		        element.click();
		     }
		}
		WebElement ConnexoAdmin_UserPage_savebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_savebutton")));
		doClick(ConnexoAdmin_UserPage_savebutton);
	}
	
	public void activateuser(String desc, String Name, String mail, String lang, String checkbox1)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_UserPage_UserActivated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_UserActivated")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_UserActivated, 10);
		doClick(ConnexoAdmin_UserPage_UserActivated);
	}
	 public void deactivateuser(String desc, String Name, String mail, String lang, String checkbox1r)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_UserPage_UserDeactivated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_UserDeactivated")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_UserDeactivated, 10);
		doClick(ConnexoAdmin_UserPage_UserDeactivated);
	}
	 
	public void clickEditOptionForCreatedUser()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_UserPage_EditUser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EditUser")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_EditUser, 10);
		doClick(ConnexoAdmin_UserPage_EditUser);
	}
	
	public boolean isEditOptionDisplayedForCreatedUser()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_UserPage_EditUser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EditUser")));
		return ConnexoAdmin_UserPage_EditUser.isDisplayed();
	}
	
	public String getEditPageHeaderText()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_UserPage_EditUser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_editPageHeader")));
		return ConnexoAdmin_UserPage_EditUser.getText().split(" ")[0];
	}
		
	public void clickUserActionIcon(String Name)
	{
		browserRefresh();
		WebElement UserActionIcon = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		TestUtil.waitforElementTobeLocated(UserActionIcon, 10);
		doClick(UserActionIcon);
	}
	
	public boolean isUserActionIcon(String Name)
	{
		waitForTime(3000);
		WebElement UserActionIcon = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		return UserActionIcon.isDisplayed();
	}
	
	public String getCreatedRoleInUserCreationPage(String roleName)
	{
		waitForTime(5000);
		WebElement RoleCheckBox = DriverUtility.getDriver().findElement(By.xpath("//label[text()='"+ roleName +"']"));
		return RoleCheckBox.getText();
	}
		
	public void clickCreatedRoleCheckBox(String roleName)
	{
		waitForTime(5000);
		WebElement RoleCheckBox = DriverUtility.getDriver().findElement(By.xpath("//label[text()='"+ roleName +"']/ancestor::td[1]//input[@class='x-form-field x-form-checkbox x-form-cb']"));
		TestUtil.waitforElementTobeLocated(RoleCheckBox, 10);
		doClick(RoleCheckBox);
	}
	
	public boolean isUserNameInputDisbledInEditModeForBobUser()
	{
		waitForTime(3000);
		WebElement UserNameInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_UserInputName")));
		return UserNameInput.isEnabled();
	}
	
	public boolean isUserDirectoryDisbledInEditModeForBobUser()
	{
		waitForTime(3000);
		WebElement UserNameInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_userDirectory")));
		return UserNameInput.isEnabled();
	}
	
	public void clickUserNameDropdown()
	{
		waitForTime(5000);
		WebElement userNameDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_userNameDropdown")));
		TestUtil.waitforElementTobeLocated(userNameDropdown, 10);
		doClickjavaScript(userNameDropdown);
	}
	
	public void clickDescriptionDropdown()
	{
		waitForTime(5000);
		WebElement userNameDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_descriptionDropdown")));
		TestUtil.waitforElementTobeLocated(userNameDropdown, 10);
		doClickjavaScript(userNameDropdown);
	}
	
	public boolean isOperatorDropdownDisplayed()
	{
		waitForTime(5000);
		WebElement UserNameOperatorDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_OperatorDropdown")));
		return UserNameOperatorDropdown.isDisplayed();
	}
	
	public void clickOperatorDropdown()
	{
		waitForTime(5000);
		WebElement UserNameOperatorDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_OperatorDropdown")));
		TestUtil.waitforElementTobeLocated(UserNameOperatorDropdown, 10);
		doClickjavaScript(UserNameOperatorDropdown);
	}
	
	public boolean isEqualOperatorDisplayedInDropdown()
	{
		waitForTime(5000);
		WebElement EqualOperator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EqualOperatorDropdown")));
		return EqualOperator.isDisplayed();
	}
	
	public void updateEqualOperatorInputField(String value)
	{
		waitForTime(5000);
		WebElement EqualOperator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EqualOperatorInputField")));
		TestUtil.waitforElementTobeLocated(EqualOperator, 10);
		doClear(EqualOperator);
		sendkeys(value, EqualOperator);
	}
	
	public void clickEqualOperatorInDropdown()
	{
		waitForTime(5000);
		WebElement EqualOperator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EqualOperatorDropdown")));
		TestUtil.waitforElementTobeLocated(EqualOperator, 10);
		doClick(EqualOperator);
	}
	
	public void clickActiveDropdown()
	{
		waitForTime(5000);
		WebElement EqualOperator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_activeDropdown")));
		TestUtil.waitforElementTobeLocated(EqualOperator, 10);
		doClick(EqualOperator);
	}
	
	public boolean isOptionListDisplayedInActiveDropdown()
	{
		waitForTime(5000);
		WebElement OptionList = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_yesOptionInActiveDropdown")));
		return OptionList.isDisplayed();
	}
	
	public void clickYesOptionInActiveDropdown()
	{
		waitForTime(5000);
		WebElement EqualOperator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_yesOptionInActiveDropdown")));
		TestUtil.waitforElementTobeLocated(EqualOperator, 10);
		doClick(EqualOperator);
	}
	
	public void clickNoOptionInActiveDropdown()
	{
		waitForTime(5000);
		WebElement EqualOperator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_noOptionInActiveDropdown")));
		TestUtil.waitforElementTobeLocated(EqualOperator, 10);
		doClick(EqualOperator);
	}
	
	public void clickSaveButton()
	{
		waitForTime(2000);
		WebElement saveButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_saveButton")));
		TestUtil.waitforElementTobeLocated(saveButton, 10);
		doClick(saveButton);
	}
	
	public void clickCancelButton()
	{
		waitForTime(2000);
		WebElement cancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_cancelButton")));
		TestUtil.waitforElementTobeLocated(cancelButton, 10);
		scrolldown(cancelButton);
	}
	
	public String getFirstUsernameValueFromTableResults()
	{
		waitForTime(2000);
		WebElement Username = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_usernameValueInTableResults")));
		return Username.getText();
	}
	
	public String getFirstDescriptionValueFromTableResults()
	{
		waitForTime(2000);
		WebElement description = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_descriptionValueInTableResults")));
		return description.getText();
	}
	
	public String getFirstStatusValueInTableResults()
	{
		waitForTime(2000);
		WebElement statusValueInTableResults = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_statusValueInTableResults")));
		return statusValueInTableResults.getText();
	}
	public void clickSearchButton()
	{
		waitForTime(2000);
		WebElement SearchButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_searchButtonForFilters")));
		TestUtil.waitforElementTobeLocated(SearchButton, 10);
		doClick(SearchButton);
	}
	
	public void clickClearAllButton()
	{
		waitForTime(2000);
		WebElement ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_clearAllButtonForFilters")));
		TestUtil.waitforElementTobeLocated(ClearAllButton, 10);
		doClick(ClearAllButton);
	}
	
	public void clickCountButton()
	{
		waitForTime(5000);
		WebElement countButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_countButton")));
		TestUtil.waitforElementTobeLocated(countButton, 10);
		doClick(countButton);
	}
	
	public boolean isPageHeaderDisplayed()
	{
		waitForTime(5000);
		WebElement PageHeader = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_editPageHeader")));
		return PageHeader.isDisplayed();
	}
	
	public String getCountValueOfUsersFromCountButton()
	{
		waitForTime(5000);
		WebElement countButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_countButton")));
		return countButton.getText();
	}
	
	public void clickApplyButtonInPerformCountPopupWindow()
	{
		waitForTime(5000);
		WebElement applyButtonInPerformCountPopupWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_applyButtonInPerformCountPopupWindow")));
		TestUtil.waitforElementTobeLocated(applyButtonInPerformCountPopupWindow, 10);
		doClick(applyButtonInPerformCountPopupWindow);
	}
	
	public String getCountValueOfUsers()
	{
		waitForTime(5000);
		WebElement countButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_totalUserCount")));
		return countButton.getText().split("-")[1].split(" ")[0];
	}
	
	public void clickColumnsDropdown()
	{
		waitForTime(5000);
		WebElement columnsDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_columnsDropdown")));
		TestUtil.waitforElementTobeLocated(columnsDropdown, 10);
		doClick(columnsDropdown);
	}
	
	public boolean isColumnsDropdownOptionsListDisplayed()
	{
		waitForTime(5000);
		WebElement columnsDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_columnsDropdownList")));
		return columnsDropdown.isDisplayed();
	}
	
	public void isColumnsOptionsListDisplayed()
	{
		waitForTime(5000);
		isDisplayed("ConnexoAdmin_UserPage_columnsDropdownList");
	}
	
	public boolean isDoneButtonInColumnsDropdown()
	{
		waitForTime(3000);
		WebElement DoneButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_doneButtonInColumnsDropdown")));
		return DoneButton.isDisplayed();
	}
	
	public boolean isCancelButtonInColumnsDropdown()
	{
		waitForTime(3000);
		WebElement cancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_cancelButtonInColumnsDropdown")));
		return cancelButton.isDisplayed();
	}
	
	public void clickRestoreDefaultsLinkInColumnsDropdown()
	{
		waitForTime(2000);
		WebElement restoreDefaultsLinkInColumnsDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_restoreDefaultsLinkInColumnsDropdown")));
		TestUtil.waitforElementTobeLocated(restoreDefaultsLinkInColumnsDropdown, 10);
		doClick(restoreDefaultsLinkInColumnsDropdown);
	}
}


