package com.ConnexoAdmin.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ConnexoAdmin.pages.ApplicationServers.ApplicationServersPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class ApplicationServerCreationTest  extends TestBase{

	Logger log = LogManager.getLogger(KeypairsTest.class);
	String ApplicationServerSpecialCharSheet = "App Server Name Special Char";
	String ApplicationServerMaxLengthSheet = "App Server Name Max Length";
	String ApplicationServerExportPathSpecialCharSheet="AppServer ExportPathSpecialChar";
	String ApplicationServerImportPathSpecialCharSheet="AppServer ImportPathSpecialChar";
	String ApplicationServerSheet = "Application Servers";
	ApplicationServersPage ApplicationServersPage;

	public ApplicationServerCreationTest() {
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataApplicationServer() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ApplicationServerSheet);
		return testData;
	}

	@DataProvider
	public Object[][] getTestDataApplicationServerForSpecialChar() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ApplicationServerSpecialCharSheet);
		return testData;
	}
	
	@DataProvider
	public Object[][] getTestDataApplicationServerForMaxLength() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ApplicationServerMaxLengthSheet);
		return testData;
	}
	
	@DataProvider
	public Object[][] getTestDataApplicationServerExportPathForSpecialChar() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ApplicationServerExportPathSpecialCharSheet);
		return testData;
	}
	
	@DataProvider
	public Object[][] getTestDataApplicationServerImportPathForSpecialChar() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(ApplicationServerImportPathSpecialCharSheet);
		return testData;
	}
	
	@Test(priority = 1, enabled = true, description= "verifyApplicationServerWithoutInputs")
	public void verifyApplicationServerWithoutInputs()                
	{  
		log.info("****************************** starting test case : verify application server without inputs *****************************************");
		ApplicationServersPage = new ApplicationServersPage();
		ApplicationServersPage.clickonApplicationServer();
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.clickAddButton();
		String expectedValue = "There are errors on this page that require your attention.";
		
		assertEquals(ApplicationServersPage.errorMessageForWithoutInput(), expectedValue, "error message without inputs is not displayed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verify application server without inputs *****************************************");
	}

	@Test(priority = 2, enabled = true, dataProvider = "getTestDataApplicationServerForSpecialChar", description= "verifyApplicationServerNameErrorWithSpecialChar")
	public void verifyApplicationServerNameErrorWithSpecialChar(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verify application server name with special characters *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickAddButton();
		
		assertTrue(ApplicationServersPage.specialCharErrorMessageForNameDisplayed(), "special char error message is not displayed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verify application server name error with special characters *****************************************");
	}
	
	@Test(priority = 3, enabled = true, dataProvider = "getTestDataApplicationServerForMaxLength", description= "verifyApplicationServerNameErrorWithMaxLength")
	public void verifyApplicationServerNameErrorWithMaxLength(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verify application server name with max length *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickAddButton();
		
		assertTrue(ApplicationServersPage.maxLengthErrorMessageDisplayed(), "max length error message is not displayed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verify application server name error with max length *****************************************");
	}
	
	@Test(priority = 4, enabled = true, dataProvider = "getTestDataApplicationServerExportPathForSpecialChar", description= "verifyApplicationServerExportPathErrorWithSpecialChar")
	public void verifyApplicationServerExportPathErrorWithSpecialChar(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verify application server exportPath with special char *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickAddButton();
		String expectedValue = "Characters #<>$+%!`&*'|?{@}\"= are not allowed.";
		
		assertEquals(ApplicationServersPage.specialCharErrorMessage(), expectedValue, "special char error message for exportpath is not displayed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verify application server exportPath error with special char *****************************************");
	}
	
	@Test(priority = 5, enabled = true, dataProvider = "getTestDataApplicationServerImportPathForSpecialChar", description= "verifyApplicationServerImportPathErrorWithSpecialChar")
	public void verifyApplicationServerImportPathErrorWithSpecialChar(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verify application server importPath with special char *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickAddButton();
		String expectedValue = "Characters #<>$+%!`&*'|?{@}\"= are not allowed.";
		
		assertEquals(ApplicationServersPage.specialCharErrorMessage(), expectedValue, "special char error message for importpath is not displayed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verify application server importPath error with special char *****************************************");
	}
	
	@Test(priority = 6, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyStatusChangeForMessageQueue")
	public void verifyStatusChangeForMessageQueue(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyStatusChangeForMessageQueue *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickMessageServiceStatus();
		ApplicationServersPage.clickMessageServiceStatusDropdown();
		ApplicationServersPage.updateStatusActiveToInactive();
		String expectedValue = "Inactive";
		
		assertEquals(ApplicationServersPage.getMessageServiceStatusFromTable(), expectedValue, "message service status should be inactive");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyStatusChangeForMessageQueue *****************************************");
	}
	
	@Test(priority = 7, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyThreadChangeForMessageQueue")
	public void verifyThreadChangeForMessageQueue(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyThreadChangeForMessageQueue *****************************************");
		String count = "8";
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickMessageServiceThreads();
		ApplicationServersPage.updateMessageServiceThreads(count);
		
		assertEquals(ApplicationServersPage.getMessageServiceThreadValueFromTable(), count, "message service thread value should be update");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyThreadChangeForMessageQueue *****************************************");
	}
	
	@Test(priority = 8, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyClickOnFirstCrossIconInMessageQueue")
	public void verifyClickOnFirstCrossIconInMessageQueue(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyClickOnFirstCrossIconInMessageQueue *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		String expectedValue = ApplicationServersPage.getFirstMessageServiceFromTable();
		ApplicationServersPage.clickCrossIconForMessageService();
		
		assertNotEquals(ApplicationServersPage.getFirstMessageServiceFromTable(), expectedValue, "after clicking on cross icon message service is not removed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyClickOnFirstCrossIconInMessageQueue *****************************************");
	}
	
	@Test(priority = 9, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyAddMessageServicesButtonEnabled")
	public void verifyAddMessageServicesButtonEnabled(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyAddMessageServicesButtonEnabled *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForMessageService();
		
		assertTrue(ApplicationServersPage.isAddMessageServicesButtonEnabled(), "add message services button is not enabled");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyAddMessageServicesButtonEnabled *****************************************");
	}
	
	@Test(priority = 10, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyRemovedMessageServiceAddedInAddMessageServicesPage")
	public void verifyRemovedMessageServiceAddedInAddMessageServicesPage(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyRemovedMessageServiceAddedInAddMessageServicesPage *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		String expectedValue = ApplicationServersPage.getFirstMessageServiceFromTable();
		ApplicationServersPage.clickCrossIconForMessageService();
		ApplicationServersPage.clickAddMessageServicesButton();
		
		assertEquals(ApplicationServersPage.getRemovedServiceFirstRowValue(), expectedValue, "after clicking on cross icon message service is added in add message services page");
		
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyRemovedMessageServiceAddedInAddMessageServicesPage *****************************************");
	}
	
	@Test(priority = 11, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyClickCheckboxForRemovedMessageService")
	public void verifyClickCheckboxForRemovedMessageService(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyClickCheckboxForRemovedMessageService *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForMessageService();
		ApplicationServersPage.clickAddMessageServicesButton();
		ApplicationServersPage.clickFirstCheckBoxOfMessageServices();
		
		assertTrue(ApplicationServersPage.isFirstCheckBoxOfServicesSelected(), "removed message service checkbox should check");
		
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyClickCheckboxForRemovedMessageService *****************************************");
	}
	
	@Test(priority = 12, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyByAddRemovedMessageService")
	public void verifyByAddRemovedMessageService(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyByAddRemovedMessageService *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		String expectedValue = ApplicationServersPage.getFirstMessageServiceFromTable();
		ApplicationServersPage.clickCrossIconForMessageService();
		ApplicationServersPage.clickAddMessageServicesButton();
		ApplicationServersPage.clickFirstCheckBoxOfMessageServices();
		ApplicationServersPage.clickAddButtonForServices();
				
		assertEquals(ApplicationServersPage.getFirstMessageServiceFromTable(), expectedValue, "after clicking on cross icon message service is not removed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyByAddRemovedMessageService *****************************************");
	}
	
	@Test(priority = 13, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyMultipleMessageServicesCheckboxes")
	public void verifyMultipleMessageServicesCheckboxes(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyMultipleMessageServicesCheckboxes *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForMessageService();
		ApplicationServersPage.clickCrossIconForMessageService();
		ApplicationServersPage.clickAddMessageServicesButton();
		ApplicationServersPage.clickCheckAllButtonForServices();
		
		assertTrue(ApplicationServersPage.isFirstCheckBoxOfServicesSelected(), "checking with multiple checkboxes selection");
		assertTrue(ApplicationServersPage.isSecondCheckBoxOfServicesSelected(), "checking with multiple checkboxes selection");
		
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyMultipleMessageServicesCheckboxes *****************************************");
	}
	
	@Test(priority = 14, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyUncheckAllButtonEnable")
	public void verifyUncheckAllButtonEnable(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyUncheckAllButtonEnable *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForMessageService();
		ApplicationServersPage.clickAddMessageServicesButton();
		ApplicationServersPage.clickFirstCheckBoxOfMessageServices();
		
		assertTrue(ApplicationServersPage.isUnCheckAllButtonEnabled(), "after select all checkboxes uncheck button should enable");
				
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyUncheckAllButtonEnable *****************************************");
	}
	
	@Test(priority = 15, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyAddImportServicesButtonEnabled")
	public void verifyAddImportServicesButtonEnabled(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyAddImportServicesButtonEnabled *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForFirstImportService();
		
		assertTrue(ApplicationServersPage.isAddImportServicesButtonEnabled(), "add import services button is not enabled");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyAddImportServicesButtonEnabled *****************************************");
	}
	
	@Test(priority = 16, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyRemovedMessageServiceAddedInAddImportServicesPage")
	public void verifyRemovedMessageServiceAddedInAddImportServicesPage(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyRemovedMessageServiceAddedInAddImportServicesPage *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		String expectedValue = ApplicationServersPage.getFirstImportServiceFromTable();
		ApplicationServersPage.clickCrossIconForFirstImportService();
		ApplicationServersPage.clickAddImportServiceButton();
		
		assertEquals(ApplicationServersPage.getRemovedServiceFirstRowValue(), expectedValue, "after clicking on cross icon message service is added in add message services page");
		
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyRemovedMessageServiceAddedInAddImportServicesPage *****************************************");
	}
	
	@Test(priority = 17, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyClickCheckboxForRemovedImportService")
	public void verifyClickCheckboxForRemovedImportService(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyClickCheckboxForRemovedImportService *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForFirstImportService();
		ApplicationServersPage.clickAddImportServiceButton();
		ApplicationServersPage.clickFirstCheckBoxOfMessageServices();
		
		assertTrue(ApplicationServersPage.isFirstCheckBoxOfServicesSelected(), "removed message service checkbox should check");
		
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyClickCheckboxForRemovedImportService *****************************************");
	}
	
	@Test(priority = 18, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyByAddRemovedImportService")
	public void verifyByAddRemovedImportService(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyByAddRemovedImportService *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		String expectedValue = ApplicationServersPage.getFirstImportServiceFromTable();
		ApplicationServersPage.clickCrossIconForFirstImportService();
		ApplicationServersPage.clickAddImportServiceButton();
		ApplicationServersPage.clickFirstCheckBoxOfMessageServices();
		ApplicationServersPage.clickAddButtonForServices();
				
		assertNotEquals(ApplicationServersPage.getFirstImportServiceFromTable(), expectedValue, "after clicking on cross icon message service is not removed");
		
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyByAddRemovedImportService *****************************************");
	}
	
	@Test(priority = 19, enabled = true, dataProvider = "getTestDataApplicationServer", description= "verifyMultipleImportServicesCheckboxes")
	public void verifyMultipleImportServicesCheckboxes(String Name, String Exportpath,String Importpath)                
	{  
		log.info("****************************** starting test case : verifyMultipleImportServicesCheckboxes *****************************************");
		ApplicationServersPage.clickonAddApplicationServer();
		ApplicationServersPage.ApplicationServerNameInput(Name);
		ApplicationServersPage.ApplicationServerExportPathInput(Exportpath);
		ApplicationServersPage.ApplicationServerImportPathInput(Importpath);
		ApplicationServersPage.clickCrossIconForFirstImportService();
		ApplicationServersPage.clickCrossIconForFirstImportService();
		ApplicationServersPage.clickAddImportServiceButton();
		ApplicationServersPage.clickCheckAllButtonForServices();
		
		assertTrue(ApplicationServersPage.isFirstCheckBoxOfServicesSelected(), "checking with multiple checkboxes selection");
		assertTrue(ApplicationServersPage.isSecondCheckBoxOfServicesSelected(), "checking with multiple checkboxes selection");
		
		ApplicationServersPage.clickCancelButtonForServices();
		ApplicationServersPage.clickonCancelButtonInApplicationServerCreation();
		log.info("****************************** Ending test case : verifyMultipleImportServicesCheckboxes *****************************************");
	}
}
