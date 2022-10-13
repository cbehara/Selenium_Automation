package com.ConnexoAdmin.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.WorkgroupsPage.WorkgroupsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class WorkGroupsEditTest  extends TestBase{

	String AddWorkGroupssheet = "AddWorkGroups";
	WorkgroupsPage Workgroupspage;
	Logger log = Logger.getLogger(WorkGroupsEditTest.class); 
	
	public WorkGroupsEditTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForWorkGroups() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddWorkGroupssheet);
		return testData;
	}             

	@Test(priority = 1, enabled = true, description = "VerifyWorkGroupPage"  ) 
	public void VerifyWorkGroupPage() throws InterruptedException
	{
		log.info("****************************** starting test case : VerifyWorkGroupPage*****************************************");
		Workgroupspage = new WorkgroupsPage();
		Workgroupspage.clickWorkGroup();
		String ExpectedValue = "Workgroups";

		assertEquals(Workgroupspage.getPageHeader(), ExpectedValue, "Workgroup page should display");
		
		log.info("****************************** Ending test case : VerifyWorkGroupPage*****************************************");
	} 
	
	@Test(priority = 2, enabled = true, description = "verifyClickActionIcon"  ) 
	public void verifyClickActionIcon()
	{
		log.info("****************************** starting test case : verifyClickActionIcon*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);

		assertTrue(Workgroupspage.isRemoveOptionDisplayed(), "options list is displayed");
		
		log.info("****************************** Ending test case : verifyClickActionIcon*****************************************");
	}
	
	@Test(priority = 3, enabled = true, description = "VerifyClickEditOption"  ) 
	public void VerifyClickEditOption()
	{
		log.info("****************************** starting test case : VerifyClickEditOption*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);
		Workgroupspage.clickEditOption();
		String ExpectedValue = "Edit";

		assertEquals(Workgroupspage.getWorkGroupPageHeader(), ExpectedValue, "Workgroup edit page should display");
		
		Workgroupspage.clickCancelButton();
		browserRefresh();
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyClickEditOption*****************************************");
	}
	
	@Test(priority = 4, enabled = true, description = "VerifyClickSaveButton"  ) 
	public void VerifyClickSaveButton()
	{
		log.info("****************************** starting test case : VerifyClickSaveButton*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);
		Workgroupspage.clickEditOption();
		Workgroupspage.clickSaveButton();
		String Expectedworkgroupremoved = "Workgroup saved";
		WebElement Actualworkgroupemoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_workgroupsaved")));
		
		SoftAssertfunction(Actualworkgroupemoved, Expectedworkgroupremoved);
		
		browserRefresh();
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyClickSaveButton*****************************************");
	}
	
	@Test(priority = 5, enabled = true, description = "VerifyClickCancelButton"  ) 
	public void VerifyClickCancelButton()
	{
		log.info("****************************** starting test case : VerifyClickCancelButton*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);
		Workgroupspage.clickEditOption();
		Workgroupspage.clickCancelButton();
		String ExpectedValue = "Workgroups";

		assertEquals(Workgroupspage.getPageHeader(), ExpectedValue, "Workgroup page should display");
		
		browserRefresh();
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyClickCancelButton*****************************************");
	}
	
	@Test(priority = 6, enabled = true, description = "VerifyClickSelectUser"  ) 
	public void VerifyClickSelectUser()
	{
		log.info("****************************** starting test case : VerifyClickSelectUser*****************************************");
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickSelectUserButton();
		String ExpectedValue = "Select";

		assertEquals(Workgroupspage.getWorkGroupPageHeader(), ExpectedValue, "Workgroup select users page should display");
		
		Workgroupspage.clickCancelButtonInSelectUser();
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyClickSelectUser*****************************************");
	}
	
	@Test(priority = 7, enabled = true, description = "VerifyClickCancelButtonInSelectUser"  ) 
	public void VerifyClickCancelButtonInSelectUser()
	{
		log.info("****************************** starting test case : VerifyClickCancelButtonInSelectUser*****************************************");
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickSelectUserButton();
		Workgroupspage.clickCancelButtonInSelectUser();
		String ExpectedValue = "Add";

		assertEquals(Workgroupspage.getWorkGroupPageHeader(), ExpectedValue, "Workgroup select users page should display");
		
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyClickCancelButtonInSelectUser*****************************************");
	}
	
	@Test(priority = 8, enabled = true, description = "VerifyClickUncheckAllButtonInSelectUser"  ) 
	public void VerifyClickUncheckAllButtonInSelectUser()
	{
		log.info("****************************** starting test case : VerifyClickUncheckAllButtonInSelectUser*****************************************");
		String user = "Bob";
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickSelectUserButton();
		Workgroupspage.selectUser(user);
		Workgroupspage.clickUnselectAllButtonSelectUserButton();

		assertFalse(Workgroupspage.isselectedUserSelected(user), "user is not selected");
		
		Workgroupspage.clickCancelButtonInSelectUser();
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyClickUncheckAllButtonInSelectUser*****************************************");
	}
	
	@Test(priority = 9, enabled = true, description = "VerifyAddButtonInSelectUser"  ) 
	public void VerifyAddButtonInSelectUser()
	{
		log.info("****************************** starting test case : VerifyAddButtonInSelectUser*****************************************");
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickSelectUserButton();

		assertFalse(Workgroupspage.isAddButtonSelected(), "add button is disbled by defaultly in selected user page");
		
		Workgroupspage.clickCancelButtonInSelectUser();
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyAddButtonInSelectUser*****************************************");
	}
	
	@Test(priority = 10, enabled = true, description = "VerifyEmptyUserNameErrorMessage"  ) 
	public void VerifyEmptyUserNameErrorMessage()
	{
		log.info("****************************** starting test case : VerifyEmptyUserNameErrorMessage*****************************************");
		String expectedValue = "This field is required";
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickAddButton();

		assertEquals(Workgroupspage.getErrorMessage(), expectedValue, "error message should be match");
		
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifyEmptyUserNameErrorMessage*****************************************");
	}
	
	
	
	@Test(priority = 11, enabled = true, description = "VerifySelectedUserDisplayedInSelectUser"  ) 
	public void VerifySelectedUserDisplayedInSelectUser()
	{
		log.info("****************************** starting test case : VerifySelectedUserDisplayedInSelectUser*****************************************");
		String user = "Bob";
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickSelectUserButton();
		Workgroupspage.selectUser(user);
		Workgroupspage.clickAddButton();

		assertEquals(Workgroupspage.getSelectUserText(), user, "selected user is displayed in add workgroup page");
		
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifySelectedUserDisplayedInSelectUser*****************************************");
	}
	
	@Test(priority = 12, enabled = true, description = "VerifySelectdUserByRefreshWorkGroupPage"  ) 
	public void VerifySelectdUserByRefreshWorkGroupPage()
	{
		log.info("****************************** starting test case : VerifySelectdUserByRefreshWorkGroupPage*****************************************");
		String user = "Bob";
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.clickSelectUserButton();
		Workgroupspage.selectUser(user);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		browserRefresh();
		String expectedValue = "No users have been added";
		
		assertEquals(Workgroupspage.getNoUserText(), expectedValue, "selected user is displayed in add workgroup page");
		
		Workgroupspage.clickCancelButton();
		log.info("****************************** Ending test case : VerifySelectdUserByRefreshWorkGroupPage*****************************************");
	}
	
	@Test(priority = 13, enabled = true, description = "VerifyBySelectUser"  ) 
	public void VerifyBySelectUser()
	{
		log.info("****************************** starting test case : VerifyBySelectUser*****************************************");
		String user = "Bob";
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickSelectUserButton();
		Workgroupspage.selectUser(user);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickAddButton();
		String Expectedworkgroupadded = "Workgroup added";
		WebElement Actualworkgroupadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_workgroupadded")));
		
		SoftAssertfunction(Actualworkgroupadded, Expectedworkgroupadded);
		
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyBySelectUser*****************************************");
	}
	
	@Test(priority = 14, enabled = true, description = "VerifyRemoveOptionForCreatedWorkgroupActionIcon"  ) 
	public void VerifyRemoveOptionForCreatedWorkgroupActionIcon()
	{
		log.info("****************************** starting test case : VerifyRemoveOptionForCreatedWorkgroupActionIcon*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);
		Workgroupspage.clickRemoveOption();
		
		assertTrue(Workgroupspage.isRemoveWindowpopupDisplayed(), "by clicking on remove option remove popup window should display");
		
		browserRefresh();
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyRemoveOptionForCreatedWorkgroupActionIcon*****************************************");
	}
	
	@Test(priority = 15, enabled = true, description = "VerifyCancelButtonInRemovePopup"  ) 
	public void VerifyCancelButtonInRemovePopup()
	{
		log.info("****************************** starting test case : VerifyCancelButtonInRemovePopup*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);
		Workgroupspage.clickRemoveOption();
		Workgroupspage.clickCancelButtonInRemoveWindow();
		
		assertTrue(Workgroupspage.isWorkGroupPresent(workgroupName), "by clicking on cancel button in remove popup it should not remove work group");
		
		browserRefresh();
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyCancelButtonInRemovePopup*****************************************");
	}
	
	@Test(priority = 16, enabled = true, description = "VerifyCrossIconInRemovePopup"  ) 
	public void VerifyCrossIconInRemovePopup()
	{
		log.info("****************************** starting test case : VerifyCrossIconInRemovePopup*****************************************");
		String workgroupName = "AB" + generateRandomName(5);
		browserRefresh();
		Workgroupspage.clickAddWorkGroupsButton();
		Workgroupspage.updateWorkGroupNameInputField(workgroupName);
		Workgroupspage.clickAddButton();
		waitForTime(5000);
		Workgroupspage.clickActionIconForWorkGroup(workgroupName);
		Workgroupspage.clickRemoveOption();
		Workgroupspage.clickCrossIconInRemoveWindow();
		
		assertTrue(Workgroupspage.isWorkGroupPresent(workgroupName), "by clicking on cross icon in remove popup it should not remove work group");
		
		browserRefresh();
		Workgroupspage.removeCreatedWorkGroup(workgroupName);
		log.info("****************************** Ending test case : VerifyCrossIconInRemovePopup*****************************************");
	}
}

