package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.TaskManagement.TaskManagmentPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TaskManagmentTest extends TestBase {
	String TaskManagementSheet = "TaskManagement";
	TaskManagmentPage TaskManagementPage;
	Logger log = LogManager.getLogger(TaskManagmentTest.class);   
	public TaskManagmentTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForTaskManagement() {
		Object testData[][] = TestUtil.getTestData(TaskManagementSheet);
		return testData;
	}

	@Test(priority = 1,description="verify And Change Tasks Management",dataProvider = "getTestDataForTaskManagement")
	public void verifyAndChangeTasksManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		TaskManagementPage = new TaskManagmentPage();
		TaskManagementPage.clickonTasksManagement();
		reporterLog("Starting Test case Change Task Management");
		log.info("****************************** starting test case : Change Task Management*********************");
		String ExpectedValue= "Tasks";
		String ActualValue =TaskManagementPage.gettextofTasksManagement();
		Assert.assertEquals(ActualValue, ExpectedValue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);                     

		log.info("****************************** Ending test case : Change Task Management*********************");
	}
	
	@Test(priority = 2, enabled = true, description = "Verify Create Partition Queue Value")
	public void verifyCreatePartitionQueueValue()	
	{	
        log.info("****************************** starting test case : Verify Create Partition Queue Value *************");
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        String expectedValue = "DataValidation";
		
		assertEquals(TaskManagementPage.getQueueTypeValueFromResult(), expectedValue, "DataValidation queue is not displayed");
		
		TaskManagementPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : Verify Create Partition Queue Value *************");
	}
	
	@Test(priority = 3, enabled = true, description = "Verify Multiple Queue Value")
	public void verifyMultipleQueueValue()	
	{	
        log.info("****************************** starting test case : Verify Multiple Queue Value *************");
        browserRefresh();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectKeyRenewalQueueTypeOption();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        String expectedValue = "DataValidation";
		
		assertEquals(TaskManagementPage.getQueueTypeValueFromResult(), expectedValue, "DataValidation and KeyRenewal queue is not displayed");
		
		TaskManagementPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : Verify Multiple Queue Value *************");
	}
	
	@Test(priority = 4, enabled = true, description = "Verify Create Partition Queue Type Value")
	public void verifyCreatePartitionQueueTypeValue()	
	{	
        log.info("****************************** starting test case : Verify Create Partition Queue Type Value *************");
        browserRefresh();
        TaskManagementPage.clickQueueDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        String expectedValue = "DataValidation";
		
		assertEquals(TaskManagementPage.getQueueValueFromResult(), expectedValue, "DataValidation queue type is not displayed");
		
		TaskManagementPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : Verify Create Partition Queue Type Value *************");
	}
	
	@Test(priority = 5, enabled = true, description = "Verify Multiple Queue Type Value")
	public void verifyMultipleQueueTypeValue()
	{	
        log.info("****************************** starting test case : Verify Multiple Queue Type Value *************");
        browserRefresh();
        TaskManagementPage.clickQueueDropdown();
        TaskManagementPage.selectKeyRenewalQueueTypeOption();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        String expectedValue = "DataValidation";
		
		assertEquals(TaskManagementPage.getQueueValueFromResult(), expectedValue, "DataValidation and KeyRenewal queue type is not displayed");
		
		TaskManagementPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : Verify Multiple Queue Type Value *************");
	}
	
	@Test(priority = 6, enabled = true, description = "Verify Next Run Sort")
	public void verifyNextRunSort()	
	{	
        log.info("****************************** starting test case : Verify Next Run Sort *************");
        String expectedValue = "Next run";

        assertEquals(TaskManagementPage.getNextRunSortText(), expectedValue, "nextrun sort is displayed");
		
        log.info("****** Ending the Test Case : Verify Next Run Sort *************");
	}
	
	@Test(priority = 7, enabled = true, description = "Verify Queue Sort")
	public void verifyQueueSort()	
	{	
        log.info("****************************** starting test case : Verify Queue Sort *************");
        String expectedValue = "Queue";

        assertEquals(TaskManagementPage.getQueueSortText(), expectedValue, "queue sort is displayed");
		
        log.info("****** Ending the Test Case : Verify Queue Sort *************");
	}
	
	@Test(priority = 8, enabled = true, description = "Verify Priority Sort")
	public void verifyPrioritySort()	
	{	
        log.info("****************************** starting test case : Verify Priority Sort *************");
        String expectedValue = "Priority";

        assertEquals(TaskManagementPage.getPrioritySortText(), expectedValue, "priority sort is displayed");
		
        log.info("****** Ending the Test Case : Verify Priority Sort *************");
	}
	
	@Test(priority = 9, enabled = true, description = "Verify Next Run Table Results With Sort")
	public void verifyNextRunTableResultsWithSort()	
	{	
        log.info("****************************** starting test case : Verify Next Run Table Results With Sort *************");
        String expectedValue="No";
        TaskManagementPage.clickNextRunSort();
        
        assertEquals(TaskManagementPage.getNextRunValueFromResult(), expectedValue, "nextrun value is changed to not scheduled");
        
        log.info("****** Ending the Test Case : Verify Next Run Table Results With Sort *************");
	}
	
	@Test(priority = 10, enabled = true, description = "Verify Next Run Sort Cancel")
	public void VerifyNextRunSortCancel()	
	{	
        log.info("****************************** starting test case : Verify Next Run Sort Cancel *************");
        TaskManagementPage.clickSortCrossButton(0);
			
        assertTrue(TaskManagementPage.isQueueSortDisplayed(), "queue sort should not display");
		assertTrue(TaskManagementPage.isPrioritySortDisplayed(), "priority sort is displayed");

		log.info("****** Ending the Test Case : Verify Next Run Sort Cancel *************");
	}
	
	@Test(priority = 11, enabled = true, description = "Verify Queue Sort Cancel")
	public void verifyQueueSortCancel()	
	{	
        log.info("****************************** starting test case : Verify Queue Sort Cancel *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(1);
		
        assertTrue(TaskManagementPage.isNextRunSortDisplayed(), "nextrun sort should not display");
		assertTrue(TaskManagementPage.isPrioritySortDisplayed(), "priority sort is displayed");
		
        log.info("****** Ending the Test Case : Verify Queue Sort Cancel *************");
	}
	
	@Test(priority = 12, enabled = true, description = "Verify Priority Sort Cancel")
	public void verifyPrioritySortCancel()	
	{	
        log.info("****************************** starting test case : Verify Priority Sort Cancel *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(2);
		
        assertTrue(TaskManagementPage.isNextRunSortDisplayed(), "nextrun sort should not display");
        assertTrue(TaskManagementPage.isQueueSortDisplayed(), "queue sort should not display");
		
        log.info("****** Ending the Test Case : verifyPrioritySortCancel *************");
	}
	
	@Test(priority = 13, enabled = true, description = "Verify Add Sort Dropdown Enable")
	public void verifyAddSortDropdownEnable()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Enable *************");
		browserRefresh();
		
        assertFalse(TaskManagementPage.isAddSortEnabled(), "add sort button is enabled before any action on sorts");
        
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Enable *************");
	}
	
	@Test(priority = 14, enabled = true, description = "Verify Add Sort Dropdown Next Run Value Disable")
	public void verifyAddSortDropdownNextRunValueDisable()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Next Run Value Disable *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(0);
        TaskManagementPage.clickAddSortDropdown();
		
        assertFalse(TaskManagementPage.isNextRunSortSelectedInDropdown(), "nextrun sort option is not selected before any action on sort");
        
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Next Run Value Disable *************");
	}
	
	@Test(priority = 15, enabled = true, description = "Verify Add Sort Dropdown Queue Value Disable")
	public void verifyAddSortDropdownQueueValueDisable()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Queue Value Disable *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(1);
        TaskManagementPage.clickAddSortDropdown();
		
        assertFalse(TaskManagementPage.isQueueSortSelectedInDropdown(), "queue sort option is not selected before any action on sort");
        
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Queue Value Disable *************");
	}
	
	@Test(priority = 16, enabled = true, description = "Verify Add Sort Dropdown Prority Value Disable")
	public void verifyAddSortDropdownProrityValueDisable()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Prority Value Disable *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(2);
        TaskManagementPage.clickAddSortDropdown();
		
        assertFalse(TaskManagementPage.isPrioritySortSelectedInDropdown(), "priority sort option is not selected before any action on sort");
        
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Prority Value Disable *************");
	}
	
	@Test(priority = 17, enabled = true, description = "Verify Add Sort Dropdown Next Run Value")
	public void verifyAddSortDropdownNextRunValue()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Next Run Value *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(0);
        TaskManagementPage.clickAddSortDropdown();
		
        assertTrue(TaskManagementPage.isNextRunSortEnabledInDropdown(), "nextrun sort option is enabled after cancel that sort");
        
        TaskManagementPage.clickNextRunSortFromAddSortDropdown();
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Next Run Value *************");
	}
	
	@Test(priority = 18, enabled = true, description = "Verify Add Sort Dropdown Queue Value")
	public void verifyAddSortDropdownQueueValue()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Queue Value *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(1);
        TaskManagementPage.clickAddSortDropdown();
		
        assertTrue(TaskManagementPage.isQueueSortEnabledInDropdown(), "queue sort option is enabled after cancel that sort");
        
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Queue Value *************");
	}
	
	@Test(priority = 19, enabled = true, description = "Verify Add Sort Dropdown Prority Value")
	public void verifyAddSortDropdownProrityValue()	
	{	
        log.info("****************************** starting test case : Verify Add Sort Dropdown Prority Value *************");
        browserRefresh();
        TaskManagementPage.clickSortCrossButton(2);
        TaskManagementPage.clickAddSortDropdown();
		
        assertTrue(TaskManagementPage.isPrioritySortEnabledInDropdown(), "priority sort option is enabled after cancel that sort");
        
        log.info("****** Ending the Test Case : Verify Add Sort Dropdown Prority Value *************");
	}
	
	@Test(priority = 20, enabled = true, description = "Verify Clear All Sort Button")
	public void verifyClearAllSortButton()	
	{	
        log.info("****************************** starting test case : Verify Clear All Sort Button *************");
        browserRefresh();
        TaskManagementPage.clickClearAllButton(1);
        
        assertTrue(TaskManagementPage.isSortsEmptyPanelDisplayed(), "clicking on Clearall button should display empty sort panel");
        
        log.info("****** Ending the Test Case : Verify Clear All Sort Button *************");
	}
	
	@Test(priority = 21, enabled = true, description = "Verify Clicking Clear All Sort Enable Sort Options In Add Sort Dropdown")
	public void verifyClickingClearAllSortEnableSortOptionsInAddSortDropdown()	
	{	
        log.info("****************************** starting test case : Verify Clicking Clear All Sort Enable Sort Options In Add Sort Dropdown *************");
        browserRefresh();
        TaskManagementPage.clickClearAllButton(1);
        TaskManagementPage.clickAddSortDropdown();
        
        assertTrue(TaskManagementPage.isNextRunSortEnabledInDropdown(), "nextrun sort option is not enabled after clearAll button for sorts");
        assertTrue(TaskManagementPage.isQueueSortEnabledInDropdown(), "queue sort is not enabled after clearAll button for sorts");
        assertTrue(TaskManagementPage.isPrioritySortEnabledInDropdown(), "priority sort is not enabled after clearAll button for sorts");
        
        log.info("****** Ending the Test Case : Verify Clicking Clear All Sort Enable Sort Options In Add Sort Dropdown *************");
	}
	
	@Test(priority = 22, enabled = true, description = "Verify Refresh Button For Priority Input Without Save")
	public void verifyRefreshButtonForPriorityInputWithoutSave()	
	{	
        log.info("****************************** starting test case : Verify Refresh Button For Priority Input Without Save *************");
        String priorityValue = "4";
        browserRefresh();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
        TaskManagementPage.priorityInputValue(priorityValue);
        TaskManagementPage.clickRefreshButton();
        
        TaskManagementPage.clickCancelButton();
        log.info("****** Ending the Test Case : Verify Refresh Button For Priority Input Without Save *************");
	}
	
	@Test(priority = 23, enabled = true, description = "Verify Set Queue And Priority Option")
	public void verifySetQueueAndPriorityOption()	
	{	
        log.info("****************************** starting test case : Verify Set Queue And Priority Option *************");
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
		
        assertTrue(TaskManagementPage.isSetQueueAndPriorityOptionDisplayed(), "set queue and priority option is not displayed for insight application type");
		
        log.info("****** Ending the Test Case : Verify Set Queue And Priority Option *************");
	}
	
	@Test(priority = 24, enabled = true, description = "Verify Clicking On Set Queue And Priority Option")
	public void verifyClickingOnSetQueueAndPriorityOption()	
	{	
        log.info("****************************** starting test case : Verify Clicking On Set Queue And Priority Option *************");
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
		
        assertTrue(TaskManagementPage.isSetQueueAndPriorityWindowDisplayed(), "set queue and priority window is not displayed for insight application type");
		
        TaskManagementPage.clickCrossIconButton();
        log.info("****** Ending the Test Case : Verify Clicking On Set Queue And Priority Option *************");
	}
	
	@Test(priority = 25, enabled = true, description = "Verify Priority Value Update")
	public void verifyPriorityValueUpdate()	
	{	
        log.info("****************************** starting test case : Verify Priority Value Update *************");
        String priorityValue = "3";
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
        TaskManagementPage.priorityInputValue(priorityValue);
        TaskManagementPage.clickSaveButton();
		
        log.info("****** Ending the Test Case : Verify Priority Value Update *************");
	}
	
	@Test(priority = 26, enabled = true, description = "Verify Priority Value Update With Max Length")
	public void verifyPriorityValueUpdateWithMaxLength()	
	{	
        log.info("****************************** starting test case : Verify Priority Value Update With Max Length *************");
        String priorityValue = "074-83964734734";
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
        TaskManagementPage.priorityInputValue(priorityValue);
        TaskManagementPage.clickSaveButton();
		
        log.info("****** Ending the Test Case : Verify Priority Value Update With Max Length *************");
	}
	
	@Test(priority = 27, enabled = true, description = "Verify Refresh Button For Priority Input")
	public void verifyRefreshButtonForPriorityInput()	
	{	
        log.info("****************************** starting test case : Verify Refresh Button For Priority Input *************");
        String priorityValue = "8";
        browserRefresh();
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
        TaskManagementPage.priorityInputValue(priorityValue);
        TaskManagementPage.clickSaveButton();
        
        log.info("****** Ending the Test Case : Verify Refresh Button For Priority Input *************");
	}
	
	@Test(priority = 28, enabled = true, description = "Verify Refresh Button Enable")
	public void verifyRefreshButtonEnable()	
	{	
        log.info("****************************** starting test case : Verify Refresh Button Enable *************");
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
		
        assertFalse(TaskManagementPage.isRefreshButtonSelected(),  "refresh button is not enabled");
		
        TaskManagementPage.clickCancelButton();
        log.info("****** Ending the Test Case : Verify Refresh Button Enable *************");
	}
	
	@Test(priority = 29, enabled = true, description = "Verify Refresh Button Enable After Update Priority")
	public void verifyRefreshButtonEnableAfterUpdatePriority()	
	{	
        log.info("****************************** starting test case : Verify Refresh Button Enable After Update Priority *************");
        String priorityValue = "074-83964734734";
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickClearAllButton();
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        TaskManagementPage.clickActionIcon();
        TaskManagementPage.clickActionButton();
        TaskManagementPage.selectSetQueueAndPriorityOption();
        TaskManagementPage.priorityInputValue(priorityValue);
		
        assertTrue(TaskManagementPage.isRefreshButtonEnabled(),  "refresh button is enabled");
		
        TaskManagementPage.clickCancelButton();
        log.info("****** Ending the Test Case : Verify Refresh Button Enable After Update Priority *************");
	}
	
	@Test(priority = 30, enabled = true, description = "Verify Priority Dropdown In Filters")
	public void verifyPriorityDropdownForFilters()	
	{	
        log.info("****************************** starting test case : Verify Priority Dropdown In Filters *************");
        navigateBackToPreviousPage();
        browserRefresh();
        TaskManagementPage.clickPriorityDropdown();
        
        assertTrue(TaskManagementPage.isPriorityDropdownWindowDisplayed(), "priority dropdown window is not displayed");
		
        log.info("****** Ending the Test Case : Verify Priority Dropdown In Filters *************");
	}
	
	@Test(priority = 31, enabled = true, description = "Verify Operator Dropdown In Priority Dropdown")
	public void verifyOperatorDropdownInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : Verify Operator Dropdown In Priority Dropdown *************");
        browserRefresh();
        TaskManagementPage.clickPriorityDropdown();
        TaskManagementPage.clickOperatorDropdownInPriorityDropdownWindow();
        
        assertTrue(TaskManagementPage.isBetweenOperatorDisplayedInPriorityDropdownWindow(), "between operator is not displayed");
		
        log.info("****** Ending the Test Case : Verify Operator Dropdown In Priority Dropdown *************");
	}
	
	@Test(priority = 32, enabled = true, description = "Verify Operator List In Priority Dropdown")
	public void verifyOperatorListInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : Verify Operator List In Priority Dropdown *************");
        browserRefresh();
        TaskManagementPage.clickPriorityDropdown();
        TaskManagementPage.clickOperatorDropdownInPriorityDropdownWindow();
        
        assertTrue(TaskManagementPage.isOperatorListDisplayedInPriorityDropdownWindow(), "operators list is displayed");
				
        log.info("****** Ending the Test Case : Verify Operator List In Priority Dropdown *************");
	}
	
	@Test(priority = 33, enabled = true, description = "Verify Clear All Button Selected In Priority Dropdown")
	public void verifyClearAllButtonSelectedInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : Verify Clear All Button Selected In Priority Dropdown *************");
        browserRefresh();
        TaskManagementPage.clickPriorityDropdown();
        TaskManagementPage.clickOperatorDropdownInPriorityDropdownWindow();
        TaskManagementPage.selectBetweenOperator();
        TaskManagementPage.updatePriorityFirstInputField("3");

        assertTrue(TaskManagementPage.isClearAllButtonSelectedInPriorityDropdown(), "clearAll button should enable");
		
        log.info("****** Ending the Test Case : Verify Clear All Button Selected In Priority Dropdown *************");
	}
	
	@Test(priority = 34, enabled = true, description = "Verify Apply Button In Priority Dropdown For Filters")
	public void verifyApplyButtonInPriorityDropdownForFilters()	
	{	
        log.info("****************************** starting test case : Verify Apply Button In Priority Dropdown For Filters *************");
        browserRefresh();
        TaskManagementPage.clickPriorityDropdown();
        
        assertTrue(TaskManagementPage.isApplyButtonEnabledInPriorityDropdown(), "apply button in priority dropdown is not enabled defaultly");
		
        log.info("****** Ending the Test Case : Verify Apply Button In Priority Dropdown For Filters *************");
	}
	
	@Test(priority = 35, enabled = true, description = "Verify Apply Button For Filter")
	public void verifyApplyButtonForFilter()	
	{	
        log.info("****************************** starting test case : Verify Apply Button For Filter *************");
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
		
		TaskManagementPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : Verify Apply Button For Filter *************");
	}
	
	@Test(priority = 36, enabled = true, description = "Verify Clear All Button For Filter")
	public void verifyClearAllButtonForFilter()	
	{	
        log.info("****************************** starting test case : Verify Clear All Button For Filter *************");
        TaskManagementPage.clickQueueTypeDropdown();
        TaskManagementPage.selectDataValidationQueueTypeOption();
        TaskManagementPage.clickApplyButton();
        String afterValue = "DataValidation";
		
		assertEquals(TaskManagementPage.getApplicationValue(), afterValue, "all application types should display after clicking clearAll button");
		
        log.info("****** Ending the Test Case : Verify Clear All Button For Filter *************");
	}

	@Test(priority = 37, dataProvider = "getTestDataForTaskManagement",description="Created Task Management")
	public void CreatedTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Create Task Management");
		log.info("****************************** starting test case : Create Task Management*********************");
		TaskManagementPage.clickonAddTasksManagementLink();
		TaskManagementPage.addTaskSManagement(Type,Loglevel,Devicegroup);

		String ExpectedaddTaskvalue = "Validation task added";
		WebElement ActualaddTaskvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded")));         
		SoftAssertfunction(ActualaddTaskvalue, ExpectedaddTaskvalue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Create Task Management*********************");
	}

	@Test(priority = 38, dataProvider = "getTestDataForTaskManagement",description="Run Task Management")
	public void RunTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Run Task Management");
		log.info("****************************** starting test case : Run Task Management*********************");	
		TaskManagementPage.runTasksManagement();

		String ExpectedDVTrunvalue = "Data validation task run queued";
		WebElement ActualDVTrunvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued")));       
		SoftAssertfunction(ActualDVTrunvalue, ExpectedDVTrunvalue);
		log.info("******************************Ending test case : Run Task Management*********************");	
	}
   
	@Test(priority = 39, description="Changing DropDown perpage",dataProvider = "getTestDataForTaskManagement")
	public void ChangingDropDownperpage(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Change Drop Down Page of Task Management");
		log.info("****************************** starting test case : Change Drop Down Page of Task Management*********************");	
		
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("******************************Ending test case : Change Drop Down Page of Task Management*********************");	
	}
	
	@Test(priority = 40, dataProvider = "getTestDataForTaskManagement", description="Edit Task Management")
	public void EditTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)
	{
		reporterLog("Starting Test case Edit Task Management");
		log.info("****************************** starting test case : Edit Task Management*********************");
		TaskManagementPage.editTasksManagement();

		String ExpectedETsuspenedvalue = "Validation task saved";
		WebElement ActualETsuspenedvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextValidationtasksaved")));         
		SoftAssertfunction(ActualETsuspenedvalue, ExpectedETsuspenedvalue);

		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Edit Task Management*********************");
	}
	
	@Test(priority = 41, dataProvider = "getTestDataForTaskManagement",description="Suspend Task Management")
	public void SuspendTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)
	{
		reporterLog("Starting Test case Suspend Task Management");
		log.info("****************************** starting test case : Suspend Task Management*********************");
		TaskManagementPage.suspendTasksManagement();

		String ExpectedETsuspenedvalue = "Export task suspended";
		WebElement ActualETsuspenedvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended")));         
		SoftAssertfunction(ActualETsuspenedvalue, ExpectedETsuspenedvalue);

		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Suspend Task Management*********************");
	}
	
	@Test(priority = 42, dataProvider = "getTestDataForTaskManagement" ,description="Remove Task Management")
	public void RemoveTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)
	{
		reporterLog("Starting Test case Remove Task Management");
		log.info("****************************** starting test case : Remove Task Management*********************");
		TaskManagementPage.removeTasksManagement();

		String ExpectedETsuspenedvalue = "Validation task removed";
		WebElement ActualETsuspenedvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskremoved")));         
		SoftAssertfunction(ActualETsuspenedvalue, ExpectedETsuspenedvalue);

		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Remove Task Management*********************");
	}
	
	@Test(priority = 43, dataProvider = "getTestDataForTaskManagement",description="Add Estimation Task Management")
	public void AddEstimationTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Add Estimation Task Management");
		log.info("****************************** starting test case : Add Estimation Task Management*********************");
		TaskManagementPage.clickonAddTasksManagementLink();
		TaskManagementPage.addTaskSManagement("Data estimation",Loglevel,Devicegroup);

		String ExpectedaddTaskvalue = "Estimation task added";
		WebElement ActualaddTaskvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextEstimationtaskadded")));         
		SoftAssertfunction(ActualaddTaskvalue, ExpectedaddTaskvalue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Add Estimation Task Management*********************");
	}
	
	@Test(priority = 43, dataProvider = "getTestDataForTaskManagement",description="Add Registered Devices KPI Task")
	public void AddRegisteredDevicesKPITask(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Add Registered Devices KPI Task");
		log.info("****************************** starting test case : Add Registered Devices KPI Task*********************");
		TaskManagementPage.clickonAddTasksManagementLink();
		TaskManagementPage.addRegisteredDevicesKPITask("Registered devices KPI",Loglevel,"North region");

		String ExpectedaddTaskvalue = "Registered devices KPI added";
		WebElement ActualaddTaskvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextRegisteredDevicetaskadded")));         
		SoftAssertfunction(ActualaddTaskvalue, ExpectedaddTaskvalue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Add Registered Devices KPI Task*********************");
	}
	
	@Test(priority = 44, dataProvider = "getTestDataForTaskManagement",description="Add Data Collection KPI Task")
	public void AddDataCollectionKPITask(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Add Data Collection KPI Task");
		log.info("****************************** starting test case : Add Data Collection KPI Task*********************");
		TaskManagementPage.clickonAddTasksManagementLink();
		TaskManagementPage.addDataCollectionKPITask("Data collection KPI",Loglevel,"Gas devices");

		String ExpectedaddTaskvalue = "Data collection KPI added";
		WebElement ActualaddTaskvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextDataCollectiontaskadded")));         
		SoftAssertfunction(ActualaddTaskvalue, ExpectedaddTaskvalue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Add Data Collection KPI Task*********************");
	}
	
	@Test(priority = 45, dataProvider = "getTestDataForTaskManagement",description="Add CRL Request Task")
	public void AddCRLRequestTask(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Add CRL Request Task");
		log.info("****************************** starting test case : Add CRL Request Task*********************");
		TaskManagementPage.clickonAddTasksManagementLink();
		TaskManagementPage.addCRLRequestTask("CRL Request",Loglevel,Devicegroup);

		log.info("****************************** Ending test case : Add CRL Request Task*********************");
	}

}
