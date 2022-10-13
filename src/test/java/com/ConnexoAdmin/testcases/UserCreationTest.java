package com.ConnexoAdmin.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.RolesPage.RolesPage;
import com.ConnexoAdmin.pages.UserPage.UserPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class UserCreationTest  extends TestBase{

	String AddUsersheet = "AddUser";
	UserPage userpage;
	RolesPage Rolespage;
	Logger log = Logger.getLogger(UserCreationTest.class);  
	
	public UserCreationTest()
	{
		super();
	}
	
	@DataProvider 
	public Object[][] getTestDataForUser() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddUsersheet);
		return testData;
	}	
	
	@Test(priority = 1, description = "ValidateUserActionIcon" , enabled = true ) 
	public void ValidateUserActionIcon() throws InterruptedException
	{ 
		log.info("****************************** starting test case : ValidateUserActionIcon *****************************************");
		String Role = "Bob";
		userpage = new UserPage();
		userpage.clickuser();
		userpage.clickUserActionIcon(Role);
		
		assertTrue(userpage.isEditOptionDisplayedForCreatedUser(), "Clicking on user action icon options list should display");
		
		log.info("****************************** Ending test case : ValidateUserActionIcon *****************************************");
	}
	
	@Test(priority = 2, description = "VerifyByClickEditOptionInUserActionIcon" , enabled = true ) 
	public void VerifyByClickEditOptionInUserActionIcon()
	{ 
		log.info("****************************** starting test case : VerifyByClickEditOptionInUserActionIcon *****************************************");
		String Role = "Bob";
		browserRefresh();
		userpage.clickUserActionIcon(Role);
		userpage.clickEditOptionForCreatedUser();
		String ExpectedValue = "Edit";
		
		assertEquals(userpage.getEditPageHeaderText(), ExpectedValue, "Clicking on edit option in user action icon Page should navigate to edit page");
		
		userpage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyByClickEditOptionInUserActionIcon *****************************************");
	}
	
	@Test(priority = 3, description = "VerifySaveButton" , enabled = true ) 
	public void VerifySaveButton()
	{ 
		log.info("****************************** starting test case : VerifyByClickEditOptionInUserActionIcon *****************************************");
		String Role = "Bob";
		browserRefresh();
		userpage.clickUserActionIcon(Role);
		userpage.clickEditOptionForCreatedUser();
		userpage.clickSaveButton();
		String Expectedusersaved = "User saved";
		WebElement Actualusersaved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_verifyusersaved")));
		
		SoftAssertfunction(Actualusersaved, Expectedusersaved);
		
		log.info("****************************** Ending test case : VerifyByClickEditOptionInUserActionIcon *****************************************");
	}
	
	@Test(priority = 4, description = "VerifyCancelButtonForEditUser" , enabled = true ) 
	public void VerifyCancelButtonForEditUser()
	{ 
		log.info("****************************** starting test case : VerifyCancelButtonForEditUser *****************************************");
		String Role = "Bob";
		browserRefresh();
		userpage.clickUserActionIcon(Role);
		userpage.clickEditOptionForCreatedUser();
		userpage.clickCancelButton();
		
		assertTrue(userpage.isUserActionIcon(Role), "Clicking on user action icon options list should display");
		
		log.info("****************************** Ending test case : VerifyCancelButtonForEditUser *****************************************");
	}
	
	@Test(priority = 5, description = "VerifyUserNameInputDisbledInEditModeForBobUser" , enabled = true ) 
	public void VerifyUserNameInputDisbledInEditModeForBobUser()
	{ 
		log.info("****************************** starting test case : VerifyUserNameInputDisbledInEditModeForBobUser *****************************************");
		String Role = "Bob";
		browserRefresh();
		userpage.clickUserActionIcon(Role);
		userpage.clickEditOptionForCreatedUser();
		
		assertFalse(userpage.isUserNameInputDisbledInEditModeForBobUser(), "user name input should disable for edit");
		
		userpage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyUserNameInputDisbledInEditModeForBobUser *****************************************");
	}
	
	@Test(priority = 6, description = "VerifyUserDirectoryDisbledInEditModeForBobUser" , enabled = true ) 
	public void VerifyUserDirectoryDisbledInEditModeForBobUser()
	{ 
		log.info("****************************** starting test case : VerifyUserDirectoryDisbledInEditModeForBobUser *****************************************");
		String Role = "Bob";
		browserRefresh();
		userpage.clickUserActionIcon(Role);
		userpage.clickEditOptionForCreatedUser();
		
		assertFalse(userpage.isUserDirectoryDisbledInEditModeForBobUser(), "user directory input should disable for edit");
		
		userpage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyUserDirectoryDisbledInEditModeForBobUser *****************************************");
	}
	
	@Test(priority = 7, description = "VerifyUserNameDropdown" , enabled = true ) 
	public void VerifyUserNameDropdown()
	{ 
		log.info("****************************** starting test case : VerifyUserNameDropdown *****************************************");
		browserRefresh();
		userpage.clickUserNameDropdown();
		
		assertTrue(userpage.isOperatorDropdownDisplayed(), "operator dropdown should display in username dropdown");
		
		log.info("****************************** Ending test case : VerifyUserNameDropdown *****************************************");
	}
	
	@Test(priority = 8, description = "VerifyUserNameDropdownEqualOperator" , enabled = true ) 
	public void VerifyUserNameDropdownEqualOperator()
	{ 
		log.info("****************************** starting test case : VerifyUserNameDropdownEqualOperator *****************************************");
		browserRefresh();
		userpage.clickUserNameDropdown();
		userpage.clickOperatorDropdown();
		
		assertTrue(userpage.isEqualOperatorDisplayedInDropdown(), "Equal operator should display in username dropdown");
		
		log.info("****************************** Ending test case : VerifyUserNameDropdownEqualOperator *****************************************");
	}
	
	@Test(priority = 9, description = "VerifyUserNameInputInUserNameDropdown" , enabled = true ) 
	public void VerifyUserNameInputInUserNameDropdown()
	{ 
		log.info("****************************** starting test case : VerifyUserNameInputInUserNameDropdown *****************************************");
		browserRefresh();
		String value = "Bob";
		userpage.clickUserNameDropdown();
		userpage.clickOperatorDropdown();
		userpage.clickEqualOperatorInDropdown();
		userpage.updateEqualOperatorInputField(value);
		
		assertNotEquals(userpage.getFirstUsernameValueFromTableResults(), value, "table results should not change without clicking on search button in filters");
		
		log.info("****************************** Ending test case : VerifyUserNameInputInUserNameDropdown *****************************************");
	}
	
	@Test(priority = 10, description = "VerifyUserNameInputInUserNameDropdownWithApplySearch" , enabled = true ) 
	public void VerifyUserNameInputInUserNameDropdownWithApplySearch()
	{ 
		log.info("****************************** starting test case : VerifyUserNameInputInUserNameDropdownWithApplySearch *****************************************");
		browserRefresh();
		String value = "Bob";
		userpage.clickUserNameDropdown();
		userpage.clickOperatorDropdown();
		userpage.clickEqualOperatorInDropdown();
		userpage.updateEqualOperatorInputField(value);
		userpage.clickSearchButton();
		
		assertEquals(userpage.getFirstUsernameValueFromTableResults(), value, "table results should change by clicking on search button in filters");
		
		userpage.clickClearAllButton();
		userpage.clickUserNameDropdown();
		userpage.updateEqualOperatorInputField("*");
		userpage.clickSearchButton();
		log.info("****************************** Ending test case : VerifyUserNameInputInUserNameDropdownWithApplySearch *****************************************");
	}
	
	@Test(priority = 11, description = "VerifyDescriptionDropdown" , enabled = true ) 
	public void VerifyDescriptionDropdown()
	{ 
		log.info("****************************** starting test case : VerifyDescriptionDropdown *****************************************");
		browserRefresh();
		userpage.clickDescriptionDropdown();
		
		assertTrue(userpage.isOperatorDropdownDisplayed(), "user directory input should disable for edit");
		
		log.info("****************************** Ending test case : VerifyDescriptionDropdown *****************************************");
	}
	
	@Test(priority = 12, description = "VerifyUserNameDropdownEqualOperator" , enabled = true ) 
	public void VerifyDescriptionDropdownEqualOperator()
	{ 
		log.info("****************************** starting test case : VerifyUserNameDropdownEqualOperator *****************************************");
		browserRefresh();
		userpage.clickDescriptionDropdown();
		userpage.clickOperatorDropdown();
		
		assertTrue(userpage.isEqualOperatorDisplayedInDropdown(), "Equal operator should display in description dropdown");
		
		log.info("****************************** Ending test case : VerifyUserNameDropdownEqualOperator *****************************************");
	}
	
	@Test(priority = 13, description = "VerifyUserNameInputInUserNameDropdown" , enabled = true ) 
	public void VerifyDescriptionInputInUserNameDropdown()
	{ 
		log.info("****************************** starting test case : VerifyUserNameInputInUserNameDropdown *****************************************");
		browserRefresh();
		String value = "Data operator";
		userpage.clickDescriptionDropdown();
		userpage.clickOperatorDropdown();
		userpage.clickEqualOperatorInDropdown();
		userpage.updateEqualOperatorInputField(value);
		
		assertNotEquals(userpage.getFirstDescriptionValueFromTableResults(), value, "table results should not change without clicking on search button in filters");
		
		log.info("****************************** Ending test case : VerifyUserNameInputInUserNameDropdown *****************************************");
	}
	
	@Test(priority = 14, description = "VerifyDescriptionInputInDescriptionDropdownWithApplySearch" , enabled = true ) 
	public void VerifyDescriptionInputInDescriptionDropdownWithApplySearch()
	{ 
		log.info("****************************** starting test case : VerifyDescriptionInputInDescriptionDropdownWithApplySearch *****************************************");
		browserRefresh();
		String value = "Data operator";
		userpage.clickDescriptionDropdown();
		userpage.clickOperatorDropdown();
		userpage.clickEqualOperatorInDropdown();
		userpage.updateEqualOperatorInputField(value);
		userpage.clickSearchButton();
		
		assertEquals(userpage.getFirstDescriptionValueFromTableResults(), value, "table results should change by clicking on search button in filters");
		
		userpage.clickClearAllButton();
		userpage.clickUserNameDropdown();
		userpage.updateEqualOperatorInputField("*");
		userpage.clickSearchButton();
		log.info("****************************** Ending test case : VerifyDescriptionInputInDescriptionDropdownWithApplySearch *****************************************");
	}
	
	@Test(priority = 15, description = "VerifyActiveDropdown" , enabled = true ) 
	public void VerifyActiveDropdown()
	{ 
		log.info("****************************** starting test case : VerifyActiveDropdown *****************************************");
		browserRefresh();
		userpage.clickActiveDropdown();
		
		assertTrue(userpage.isOptionListDisplayedInActiveDropdown(), "dropdown list should display for active dropdown");
		
		log.info("****************************** Ending test case : VerifyActiveDropdown *****************************************");
	}
	
	@Test(priority = 16, description = "VerifyYesButtonActiveDropdown" , enabled = true ) 
	public void VerifyYesButtonActiveDropdown()
	{ 
		log.info("****************************** starting test case : VerifyYesButtonActiveDropdown *****************************************");
		browserRefresh();
		userpage.clickActiveDropdown();
		userpage.clickNoOptionInActiveDropdown();
		userpage.clickSearchButton();
		userpage.clickActiveDropdown();
		userpage.clickYesOptionInActiveDropdown();
		String expectedValue = "Active";
		
		assertNotEquals(userpage.getFirstStatusValueInTableResults(), expectedValue, "After click on yes option active status users should not display without search");
		
		log.info("****************************** Ending test case : VerifyYesButtonActiveDropdown *****************************************");
	}
	
	@Test(priority = 17, description = "VerifyYesButtonActiveDropdownWithSearch" , enabled = true ) 
	public void VerifyYesButtonActiveDropdownWithSearch()
	{ 
		log.info("****************************** starting test case : VerifyYesButtonActiveDropdownWithSearch *****************************************");
		browserRefresh();
		userpage.clickActiveDropdown();
		userpage.clickYesOptionInActiveDropdown();
		userpage.clickSearchButton();
		String expectedValue = "Active";
		
		assertEquals(userpage.getFirstStatusValueInTableResults(), expectedValue, "After click on yes option active status users should display with search");
		
		userpage.clickClearAllButton();
		userpage.clickUserNameDropdown();
		userpage.updateEqualOperatorInputField("*");
		userpage.clickSearchButton();
		log.info("****************************** Ending test case : VerifyYesButtonActiveDropdownWithSearch *****************************************");
	}
	
	@Test(priority = 18, description = "VerifyNoButtonActiveDropdown" , enabled = true ) 
	public void VerifyNoButtonActiveDropdown()
	{ 
		log.info("****************************** starting test case : VerifyNoButtonActiveDropdown *****************************************");
		browserRefresh();
		userpage.clickActiveDropdown();
		userpage.clickNoOptionInActiveDropdown();
		String expectedValue = "Inactive";
		
		assertNotEquals(userpage.getFirstStatusValueInTableResults(), expectedValue, "After click on no option active status users should not display without search");
		
		log.info("****************************** Ending test case : VerifyNoButtonActiveDropdown *****************************************");
	}
	
	@Test(priority = 19, description = "VerifyNoButtonActiveDropdownWithSearch" , enabled = true ) 
	public void VerifyNoButtonActiveDropdownWithSearch()
	{ 
		log.info("****************************** starting test case : VerifyNoButtonActiveDropdownWithSearch *****************************************");
		browserRefresh();
		userpage.clickActiveDropdown();
		userpage.clickNoOptionInActiveDropdown();
		userpage.clickSearchButton();
		String expectedValue = "Inactive";
		
		assertEquals(userpage.getFirstStatusValueInTableResults(), expectedValue, "After click on no option active status users should display with search");
		
		userpage.clickClearAllButton();
		userpage.clickUserNameDropdown();
		userpage.updateEqualOperatorInputField("*");
		userpage.clickSearchButton();
		log.info("****************************** Ending test case : VerifyNoButtonActiveDropdownWithSearch *****************************************");
	}
	
	@Test(priority = 20, description = "VerifyCountButton" , enabled = true ) 
	public void VerifyCountButton()
	{ 
		log.info("****************************** starting test case : VerifyCountButton *****************************************");
		browserRefresh();
		waitForTime(5000);
		userpage.clickCountButton();
		userpage.clickApplyButtonInPerformCountPopupWindow();
		String expectedValue = userpage.getCountValueOfUsers();
		
		assertEquals(userpage.getCountValueOfUsersFromCountButton(), expectedValue, "users count and clicking on count button getting text should match");
		
		log.info("****************************** Ending test case : VerifyCountButton *****************************************");
	}
	
	@Test(priority = 21, description = "VerifyColumnDropdown" , enabled = true ) 
	public void VerifyColumnDropdown()
	{ 
		log.info("****************************** starting test case : VerifyColumnDropdown *****************************************");
		browserRefresh();
		userpage.clickColumnsDropdown();
		
		assertTrue(userpage.isColumnsDropdownOptionsListDisplayed(), "users count and clicking on count button getting text should match");
		
		log.info("****************************** Ending test case : VerifyColumnDropdown *****************************************");
	}
	
	@Test(priority = 22, description = "VerifyRestoreDefaultsInColumnDropdown" , enabled = true ) 
	public void VerifyRestoreDefaultsInColumnDropdown()
	{ 
		log.info("****************************** starting test case : VerifyRestoreDefaultsInColumnDropdown *****************************************");
		browserRefresh();
		userpage.clickColumnsDropdown();
		userpage.clickRestoreDefaultsLinkInColumnsDropdown();
		
		assertTrue(userpage.isUserActionIcon("Bob"), "Clicking on restore default link in columns dropdown user should display");
		
		log.info("****************************** Ending test case : VerifyRestoreDefaultsInColumnDropdown *****************************************");
	}
	
	@Test(priority = 23, description = "VerifyDoneButtonInColumnDropdown" , enabled = true ) 
	public void VerifyDoneButtonInColumnDropdown()
	{ 
		log.info("****************************** starting test case : VerifyDoneButtonInColumnDropdown *****************************************");
		browserRefresh();
		userpage.clickColumnsDropdown();
		scrolltobottom();
		
		assertTrue(userpage.isDoneButtonInColumnsDropdown(), "Clicking on done button in columns dropdown user should display");
		
		log.info("****************************** Ending test case : VerifyDoneButtonInColumnDropdown *****************************************");
	}
	
	@Test(priority = 24, description = "VerifyCancelButtonInColumnDropdown" , enabled = true ) 
	public void VerifyCancelButtonInColumnDropdown()
	{ 
		log.info("****************************** starting test case : VerifyCancelButtonInColumnDropdown *****************************************");
		browserRefresh();
		userpage.clickColumnsDropdown();
		scrolltobottom();
		
		assertTrue(userpage.isCancelButtonInColumnsDropdown(), "Clicking on cancel button in columns dropdown user should display");
		
		log.info("****************************** Ending test case : VerifyCancelButtonInColumnDropdown *****************************************");
	}
		
	@Test(priority = 25, description = "VerifyClearAllButton" , enabled = true ) 
	public void VerifyClearAllButton()
	{ 
		log.info("****************************** starting test case : VerifyClearAllButton *****************************************");
		browserRefresh();
		userpage.clickUserNameDropdown();
		userpage.updateEqualOperatorInputField("Bob");
		userpage.clickSearchButton();
		userpage.clickClearAllButton();
		
		assertTrue(userpage.isPageHeaderDisplayed(), "Clicking on clearall button should not display any results");
		
		userpage.clickUserNameDropdown();
		userpage.updateEqualOperatorInputField("*");
		userpage.clickSearchButton();
		log.info("****************************** Ending test case : VerifyClearAllButton *****************************************");
	}
	
	@Test(priority = 26, description = "ValidateCreatedRoleInUserEditPage" , enabled = true ) 
	public void ValidateCreatedRoleInUserEditPage() throws InterruptedException
	{ 
		log.info("****************************** starting test case : ValidateCreatedRoleInUserEditPage *****************************************");
		String Name = "AB"+generateRandomName(5);
		String Role = "Bob";
		Rolespage = new RolesPage();
		Rolespage.clickRoles();
		Rolespage.clickAddRoleButton();
		Rolespage.addRoleWithoutDiscription(Name);
		
		userpage = new UserPage();
		userpage.clickuser();
		userpage.clickUserActionIcon(Role);
		userpage.clickEditOptionForCreatedUser();
		
		assertEquals(userpage.getCreatedRoleInUserCreationPage(Name), Name, "created role and users page role option should match");
		
		Rolespage = new RolesPage();
		Rolespage.clickRoles();
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : ValidateCreatedRoleInUserEditPage *****************************************");
	}
}

