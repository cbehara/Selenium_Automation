package com.ConnexoAdmin.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.RolesPage.RolesPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;


public class RoleAccessTest  extends TestBase{

	String AddRolessheet = "AddRoles";
	RolesPage Rolespage;
	Logger log = Logger.getLogger(RoleAccessTest.class);
	
	public RoleAccessTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForRoles() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddRolessheet);
		return testData;
	}                 

	@Test(priority =1, description = "verifyAddRolePage", enabled = true) 
	public void verifyAddRolePage() throws InterruptedException
	{
		log.info("****************************** starting test case : verifyAddRolePage*****************************************");
		Rolespage = new RolesPage();
		Rolespage.clickRoles();
		Rolespage.clickAddRoleButton();
		String ExpectedValue = "Add role";
		
		assertEquals(Rolespage.getAddRolePageHeader(), ExpectedValue, "add role page heading and expected value should match");
		
		Rolespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyAddRolePage*****************************************");
	}

	@Test(priority =2, description = "verifyEditRolePage", enabled = true) 
	public void verifyEditRolePage()
	{
		log.info("****************************** starting test case : verifyEditRolePage*****************************************");
		String Name = "Batch executor";
		Rolespage.clickCreatedRoleActionIcon(Name);
		Rolespage.clickEditOptionForCreatedRole();
		String ExpectedValue = "Edit";
		
		assertEquals(Rolespage.getEditRolePageHeader(), ExpectedValue, "edit page heading and expected value should match");
		
		Rolespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyEditRolePage*****************************************");
	}
	
	@Test(priority =3, description = "verifyByClickActionIcon", enabled = true) 
	public void verifyByClickActionIcon()
	{
		log.info("****************************** starting test case : verifyByClickActionIcon*****************************************");
		String Name = "Batch executor";
		Rolespage.clickCreatedRoleActionIcon(Name);
		
		assertTrue(Rolespage.isRemoveOptionDisplayed(), "After click on action icon options should display");
		
		log.info("****************************** Ending test case : verifyByClickActionIcon*****************************************");
	}
	
	@Test(priority =4, description = "verifyByClickRemoveOption", enabled = true) 
	public void verifyByClickRemoveOption()
	{
		log.info("****************************** starting test case : verifyByClickRemoveOption*****************************************");
		String Name = "Batch executor";
		Rolespage.clickCreatedRoleActionIcon(Name);
		Rolespage.clickRemoveOptionForCreatedRole();
		
		assertTrue(Rolespage.isRemoveWindowDisplayed(), "remove window popup should display");
		
		log.info("****************************** Ending test case : verifyByClickRemoveOption*****************************************");
	}
	
	@Test(priority =5, description = "verifyByClickRemoveButtonInRemoveWindow", enabled = true) 
	public void verifyByClickRemoveButtonInRemoveWindow()
	{
		log.info("****************************** starting test case : verifyByClickRemoveButtonInRemoveWindow*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.addRoleWithoutDiscription(Name);
		Rolespage.clickRolesPerPageDropdown();
		Rolespage.click20PerPageOptionInRolesPerPageDropdown();
		Rolespage.clickCreatedRoleActionIcon(Name);
		Rolespage.clickRemoveOptionForCreatedRole();
		Rolespage.clickRemoveButtonInRemoveWindow();
		
		assertNotEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "remove window popup should not display");
		
		log.info("****************************** Ending test case : verifyByClickRemoveButtonInRemoveWindow*****************************************");
	}
	
	@Test(priority =6, description = "verifyByClickCancelButtonInRemoveWindow", enabled = true) 
	public void verifyByClickCancelButtonInRemoveWindow()
	{
		log.info("****************************** starting test case : verifyByClickCancelButtonInRemoveWindow*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.addRoleWithoutDiscription(Name);
		Rolespage.clickRolesPerPageDropdown();
		Rolespage.click20PerPageOptionInRolesPerPageDropdown();
		browserRefresh();
		Rolespage.clickCreatedRoleActionIcon(Name);
		Rolespage.clickRemoveOptionForCreatedRole();
		Rolespage.clickCancelButtonInRemoveWindow();
		
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "role and first column role in results table should match");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickCancelButtonInRemoveWindow*****************************************");
	}
	
	@Test(priority =7, description = "verifyByClickCrossIconForRemoveWindow", enabled = true) 
	public void verifyByClickCrossIconForRemoveWindow()
	{
		log.info("****************************** starting test case : verifyByClickCrossIconForRemoveWindow*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.addRoleWithoutDiscription(Name);
		Rolespage.clickRolesPerPageDropdown();
		Rolespage.click20PerPageOptionInRolesPerPageDropdown();
		browserRefresh();
		Rolespage.clickCreatedRoleActionIcon(Name);
		Rolespage.clickRemoveOptionForCreatedRole();
		Rolespage.clickCrossIconInRemoveWindow();
		
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "remove window popup should not display");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickCrossIconForRemoveWindow*****************************************");
	}
	
	@Test(priority =8, description = "verifyEmptyRoleName", enabled = true) 
	public void verifyEmptyRoleName()
	{
		log.info("****************************** starting test case : verifyEmptyRoleName*****************************************");
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.clickAddButtonInAddRolePage();
		String expectedValue = "This field is required";
				
		assertEquals(Rolespage.getErrorMessageForEmptyNameInAddRolePageDisplayed(), expectedValue, "without giving role name we should get error message");
		
		Rolespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyEmptyRoleName*****************************************");
	}
	
	@Test(priority =9, description = "verifyByClickActionIconForAdminApplication", enabled = true) 
	public void verifyByClickActionIconForAdminApplication()
	{
		log.info("****************************** starting test case : verifyByClickActionIconForAdminApplication*****************************************");
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename("Name");
		Rolespage.clickActionIconForAdminApplicationInAddRolePage();
				
		assertTrue(Rolespage.isNoAccessForApplicationInAddRolePageDisplayed(),"after click on action icon for application option list should display");
		
		Rolespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyByClickActionIconForAdminApplication*****************************************");
	}
		
	@Test(priority =10, description = "verifyByClickNoAccessForAdminApplication", enabled = true) 
	public void verifyByClickNoAccessForAdminApplication()
	{
		log.info("****************************** starting test case : verifyByClickNoAccessForAdminApplication*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename(Name);
		Rolespage.clickActionIconForAdminApplicationInAddRolePage();
		Rolespage.clickNoAccessForApplicationInAddRolePage();
		Rolespage.clickAddButtonInAddRolePage();
				
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "role should create with noaccess for admin application");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickNoAccessForAdminApplication*****************************************");
	}
	
	@Test(priority =11, description = "verifyByClickFullControlForAdminApplication", enabled = true) 
	public void verifyByClickFullControlForAdminApplication()
	{
		log.info("****************************** starting test case : verifyByClickFullControlForAdminApplication*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename(Name);
		Rolespage.clickActionIconForAdminApplicationInAddRolePage();
		Rolespage.clickFullControlForApplicationInAddRolePage();
		Rolespage.clickAddButtonInAddRolePage();
				
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "role should create with full control for admin application");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickFullControlForAdminApplication*****************************************");
	}
	
	@Test(priority =12, description = "verifyByClickActionIconForCalenderResources", enabled = true) 
	public void verifyByClickActionIconForCalenderResources()
	{
		log.info("****************************** starting test case : verifyByClickActionIconForCalenderResources*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename(Name);
		Rolespage.clickActionIconForCalendarsResourcesInAddRolePage();
						
		assertTrue(Rolespage.isNoAccessForApplicationInAddRolePageDisplayed(),"after click on calender icon for resources option list should display");
		
		Rolespage.clickCancelButton();
		log.info("****************************** Ending test case : verifyByClickActionIconForCalenderResources*****************************************");
	}
	
	@Test(priority =13, description = "verifyByClickNoAccessForCalenderResources", enabled = true) 
	public void verifyByClickNoAccessForCalenderResources()
	{
		log.info("****************************** starting test case : verifyByClickNoAccessForCalenderResources*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename(Name);
		Rolespage.clickActionIconForCalendarsResourcesInAddRolePage();
		Rolespage.clickNoAccessForApplicationInAddRolePage();
		Rolespage.clickAddButtonInAddRolePage();
				
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "role should create with noaccess for calender resources");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickNoAccessForCalenderResources*****************************************");
	}
	
	@Test(priority =14, description = "verifyByClickFullControlForCalenderResources", enabled = true) 
	public void verifyByClickFullControlForCalenderResources()
	{
		log.info("****************************** starting test case : verifyByClickFullControlForCalenderResources*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename(Name);
		Rolespage.clickActionIconForCalendarsResourcesInAddRolePage();
		Rolespage.clickFullControlForApplicationInAddRolePage();
		Rolespage.clickAddButtonInAddRolePage();
				
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "role should create with full control for calender resources");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickFullControlForCalenderResources*****************************************");
	}
	
	@Test(priority =15, description = "verifyByClickAdministrateCheckboxForCalenderResources", enabled = true) 
	public void verifyByClickAdministrateCheckboxForCalenderResources()
	{
		log.info("****************************** starting test case : verifyByClickAdministrateCheckboxForCalenderResources*****************************************");
		String Name = "AB"+generateRandomName(5);
		browserRefresh();
		Rolespage.clickAddRoleButton();
		Rolespage.updateRolename(Name);
		Rolespage.clickActionIconForCalendarsResourcesInAddRolePage();
		Rolespage.clickAdministrateOptionForCalenderResourceInAddRolePage();
		Rolespage.clickAddButtonInAddRolePage();
				
		assertEquals(Rolespage.getFirstRoleNameInResultsTable(), Name, "role should create with full control for calender resources");
		
		Rolespage.removeCreatedRole(Name);
		log.info("****************************** Ending test case : verifyByClickAdministrateCheckboxForCalenderResources*****************************************");
	}
}

