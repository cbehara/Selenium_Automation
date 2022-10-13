package com.ConnexoAdmin.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ConnexoAdmin.pages.ApplicationServers.TaskOverViewPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class TaskOverViewFiltersTest extends TestBase{
	Logger log = LogManager.getLogger(KeypairsTest.class);
	String PriorityValue = "Priority Value";
	String UpdatePriorityValue = "Update Priority Value";
	TaskOverViewPage TaskOverViewPage;
	
	public TaskOverViewFiltersTest() {
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataTaskOverviewForPriority() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(PriorityValue);
		return testData;
	}
	
	@Test(priority = 1, enabled = true, description = "verifyApplicationFilterWithMultisenseValue")
	public void verifyApplicationFilterWithMultisenseValue()	
	{	
        log.info("****************************** starting test case : verifyApplicationFilterWithMultisenseValue *************");
        TaskOverViewPage = new TaskOverViewPage();
		TaskOverViewPage.clickonTaskOverView();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectMultisenseApplicationOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "MultiSense";
		
		assertEquals(TaskOverViewPage.getApplicationValue(), expectedValue, "multisense application type is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyApplicationFilterWithMultisenseValue *************");
	}
	
	@Test(priority = 2, enabled = true, description = "verifyApplicationFilterWithAdminValue")
	public void verifyApplicationFilterWithAdminValue()	
	{	
        log.info("****************************** starting test case : verifyApplicationFilterWithAdminValue *************");
        
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectAdminApplicationOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "Admin";
		
		assertEquals(TaskOverViewPage.getApplicationValue(), expectedValue, "admin application type is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyApplicationFilterWithAdminValue *************");
	}
	
	@Test(priority = 3, enabled = true, description = "verifyApplicationFilterWithMultiValues")
	public void verifyApplicationFilterWithMultiValues()	
	{	
        log.info("****************************** starting test case : verifyApplicationFilterWithMultiValues *************");
        
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectAdminApplicationOption();
        TaskOverViewPage.selectMultisenseApplicationOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "MultiSense";
		
		assertEquals(TaskOverViewPage.getApplicationValue(), expectedValue, "admin and multisense application type is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyApplicationFilterWithMultiValues *************");
	}
	
	@Test(priority = 4, enabled = true, description = "verifyCreatePartitionQueueValue")
	public void verifyCreatePartitionQueueValue()	
	{	
        log.info("****************************** starting test case : verifyCreatePartitionQueueValue *************");
        TaskOverViewPage.clickQueueDropdown();
        TaskOverViewPage.selectCreatePartitionsQueueTypeOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "CreatePartitions";
		
		assertEquals(TaskOverViewPage.getQueueValueFromResult(), expectedValue, "CreatePartitions queue is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyCreatePartitionQueueValue *************");
	}
	
	@Test(priority = 5, enabled = true, description = "verifyMultipleQueueValue")
	public void verifyMultipleQueueValue()	
	{	
        log.info("****************************** starting test case : verifyMultipleQueueValue *************");
        TaskOverViewPage.clickQueueDropdown();
        TaskOverViewPage.selectCALTimeSeriesExtQQueueTypeOption();
        TaskOverViewPage.selectCreatePartitionsQueueTypeOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "CreatePartitions";
		
		assertEquals(TaskOverViewPage.getQueueValueFromResult(), expectedValue, "CreatePartitions and CALTimeSeriesExtQ queue is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyMultipleQueueValue *************");
	}
	
	@Test(priority = 6, enabled = true, description = "verifyCreatePartitionQueueTypeValue")
	public void verifyCreatePartitionQueueTypeValue()	
	{	
        log.info("****************************** starting test case : verifyCreatePartitionQueueTypeValue *************");
        browserRefresh();
        TaskOverViewPage.clickQueueTypeDropdown();
        TaskOverViewPage.selectCreatePartitionsQueueTypeOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "CreatePartitions";
		
		assertEquals(TaskOverViewPage.getQueueTypeValueFromResult(), expectedValue, "CreatePartitions queue type is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyCreatePartitionQueueTypeValue *************");
	}
	
	@Test(priority = 7, enabled = true, description = "verifyMultipleQueueTypeValue")
	public void verifyMultipleQueueTypeValue()	
	{	
        log.info("****************************** starting test case : verifyMultipleQueueTypeValue *************");
        TaskOverViewPage.clickQueueTypeDropdown();
        TaskOverViewPage.selectCALTimeSeriesExtQQueueTypeOption();
        TaskOverViewPage.selectCreatePartitionsQueueTypeOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "CreatePartitions";
		
		assertEquals(TaskOverViewPage.getQueueTypeValueFromResult(), expectedValue, "CreatePartitions and CALTimeSeriesExtQ queue type is not displayed");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyMultipleQueueTypeValue *************");
	}
	
	@Test(priority = 8, enabled = true, description = "verifyNextRunSort")
	public void verifyNextRunSort()	
	{	
        log.info("****************************** starting test case : verifyNextRunSort *************");
        String expectedValue = "Next run";

        assertEquals(TaskOverViewPage.getNextRunSortText(), expectedValue, "nextrun sort is displayed");
		
        log.info("****** Ending the Test Case : verifyNextRunSort *************");
	}
	
	@Test(priority = 9, enabled = true, description = "verifyQueueSort")
	public void verifyQueueSort()	
	{	
        log.info("****************************** starting test case : verifyQueueSort *************");
        String expectedValue = "Queue";

        assertEquals(TaskOverViewPage.getQueueSortText(), expectedValue, "queue sort is displayed");
		
		
        log.info("****** Ending the Test Case : verifyQueueSort *************");
	}
	
	@Test(priority = 10, enabled = true, description = "verifyPrioritySortCancel")
	public void verifyPrioritySort()	
	{	
        log.info("****************************** starting test case : verifyPrioritySort *************");
        String expectedValue = "Priority";

        assertEquals(TaskOverViewPage.getPrioritySortText(), expectedValue, "priority sort is displayed");
		
        log.info("****** Ending the Test Case : verifyPrioritySort *************");
	}
	
	@Test(priority = 11, enabled = true, description = "verifyNextRunTableResultsWithSort")
	public void verifyNextRunTableResultsWithSort()	
	{	
        log.info("****************************** starting test case : verifyNextRunTableResultsWithSort *************");
        String expectedValue="Not scheduled";
        TaskOverViewPage.clickNextRunSort();
        
        assertEquals(TaskOverViewPage.getNextRunValueFromResult(), expectedValue, "nextrun value is changed to not scheduled");
        
        log.info("****** Ending the Test Case : verifyNextRunTableResultsWithSort *************");
	}
	
	@Test(priority = 12, enabled = true, description = "verifyNextRunSortCancel")
	public void verifyNextRunSortCancel()	
	{	
        log.info("****************************** starting test case : verifyNextRunSortCancel *************");
        TaskOverViewPage.clickSortCrossButton(0);
			
        assertTrue(TaskOverViewPage.isQueueSortDisplayed(), "queue sort should not display");
		assertTrue(TaskOverViewPage.isPrioritySortDisplayed(), "priority sort is displayed");

		log.info("****** Ending the Test Case : verifyNextRunSortCancel *************");
	}
	
	@Test(priority = 13, enabled = true, description = "verifyQueueSortCancel")
	public void verifyQueueSortCancel()	
	{	
        log.info("****************************** starting test case : verifyQueueSortCancel *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(1);
		
        assertTrue(TaskOverViewPage.isNextRunSortDisplayed(), "nextrun sort should not display");
		assertTrue(TaskOverViewPage.isPrioritySortDisplayed(), "priority sort is displayed");
		
        log.info("****** Ending the Test Case : verifyQueueSortCancel *************");
	}
	
	@Test(priority = 14, enabled = true, description = "verifyPrioritySortCancel")
	public void verifyPrioritySortCancel()	
	{	
        log.info("****************************** starting test case : verifyPrioritySortCancel *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(2);
		
        assertTrue(TaskOverViewPage.isNextRunSortDisplayed(), "nextrun sort should not display");
        assertTrue(TaskOverViewPage.isQueueSortDisplayed(), "queue sort should not display");
		
        log.info("****** Ending the Test Case : verifyPrioritySortCancel *************");
	}
	
	@Test(priority = 15, enabled = true, description = "verifyApplyButtonForFilter")
	public void verifyApplyButtonForFilter()	
	{	
        log.info("****************************** starting test case : verifyApplyButtonForFilter *************");
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectMultisenseApplicationOption();
        TaskOverViewPage.clickApplyButton();
        String expectedValue = "MultiSense";
		
		assertEquals(TaskOverViewPage.getApplicationValue(), expectedValue, "apply button is not working");
		
		TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyApplyButtonForFilter *************");
	}
	
	@Test(priority = 16, enabled = true, description = "verifyApplyButtonForFilter")
	public void verifyClearAllButtonForFilter()	
	{	
        log.info("****************************** starting test case : verifyApplyButtonForFilter *************");
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectAdminApplicationOption();
        TaskOverViewPage.clickApplyButton();
        String beforeValue = "Admin";
		
		assertEquals(TaskOverViewPage.getApplicationValue(), beforeValue, "only admin application type should display before clicking clearAll button");
        
        TaskOverViewPage.clickClearAllButton(0);
        String afterValue = "MultiSense";
		
		assertEquals(TaskOverViewPage.getApplicationValue(), afterValue, "all application types should display after clicking clearAll button");
		
        log.info("****** Ending the Test Case : verifyApplyButtonForFilter *************");
	}
	
	@Test(priority = 17, enabled = true, description = "verifyAddSortDropdownEnable")
	public void verifyAddSortDropdownEnable()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownEnable *************");
		browserRefresh();
		
        assertFalse(TaskOverViewPage.isAddSortEnabled(), "add sort button is enabled before any action on sorts");
        
        log.info("****** Ending the Test Case : verifyAddSortDropdownEnable *************");
	}
	
	@Test(priority = 18, enabled = true, description = "verifyAddSortDropdownNextRunValueDisable")
	public void verifyAddSortDropdownNextRunValueDisable()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownNextRunValueDisable *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(0);
        TaskOverViewPage.clickAddSortDropdown();
		
        assertFalse(TaskOverViewPage.isNextRunSortSelectedInDropdown(), "nextrun sort option is not selected before any action on sort");
        
        log.info("****** Ending the Test Case : verifyAddSortDropdownNextRunValueDisable *************");
	}
	
	@Test(priority = 19, enabled = true, description = "verifyAddSortDropdownQueueValueDisable")
	public void verifyAddSortDropdownQueueValueDisable()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownQueueValueDisable *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(1);
        TaskOverViewPage.clickAddSortDropdown();
		
        assertFalse(TaskOverViewPage.isQueueSortSelectedInDropdown(), "queue sort option is not selected before any action on sort");
        
        log.info("****** Ending the Test Case : verifyAddSortDropdownQueueValueDisable *************");
	}
	
	@Test(priority = 20, enabled = true, description = "verifyAddSortDropdownProrityValueDisable")
	public void verifyAddSortDropdownProrityValueDisable()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownProrityValue *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(2);
        TaskOverViewPage.clickAddSortDropdown();
		
        assertFalse(TaskOverViewPage.isPrioritySortSelectedInDropdown(), "priority sort option is not selected before any action on sort");
        
        log.info("****** Ending the Test Case : verifyAddSortDropdownProrityValueDisable *************");
	}
	
	@Test(priority = 21, enabled = true, description = "verifyAddSortDropdownNextRunValue")
	public void verifyAddSortDropdownNextRunValue()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownNextRunValue *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(0);
        TaskOverViewPage.clickAddSortDropdown();
		
        assertTrue(TaskOverViewPage.isNextRunSortEnabledInDropdown(), "nextrun sort option is enabled after cancel that sort");
        
        TaskOverViewPage.clickNextRunSortFromAddSortDropdown();
        log.info("****** Ending the Test Case : verifyAddSortDropdownNextRunValue *************");
	}
	
	@Test(priority = 22, enabled = true, description = "verifyAddSortDropdownQueueValue")
	public void verifyAddSortDropdownQueueValue()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownQueueValue *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(1);
        TaskOverViewPage.clickAddSortDropdown();
		
        assertTrue(TaskOverViewPage.isQueueSortEnabledInDropdown(), "queue sort option is enabled after cancel that sort");
        
        log.info("****** Ending the Test Case : verifyAddSortDropdownQueueValue *************");
	}
	
	@Test(priority = 23, enabled = true, description = "verifyAddSortDropdownProrityValue")
	public void verifyAddSortDropdownProrityValue()	
	{	
        log.info("****************************** starting test case : verifyAddSortDropdownProrityValue *************");
        browserRefresh();
        TaskOverViewPage.clickSortCrossButton(2);
        TaskOverViewPage.clickAddSortDropdown();
		
        assertTrue(TaskOverViewPage.isPrioritySortEnabledInDropdown(), "priority sort option is enabled after cancel that sort");
        
        log.info("****** Ending the Test Case : verifyAddSortDropdownProrityValue *************");
	}
	
	@Test(priority = 24, enabled = true, description = "verifyClearAllSortButton")
	public void verifyClearAllSortButton()	
	{	
        log.info("****************************** starting test case : verifyClearAllSortButton *************");
        browserRefresh();
        TaskOverViewPage.clickClearAllButton(1);
        
        assertTrue(TaskOverViewPage.isSortsEmptyPanelDisplayed(), "clicking on Clearall button should display empty sort panel");
        
        log.info("****** Ending the Test Case : verifyClearAllSortButton *************");
	}
	
	@Test(priority = 25, enabled = true, description = "verifyClickingClearAllSortEnableSortOptionsInAddSortDropdown")
	public void verifyClickingClearAllSortEnableSortOptionsInAddSortDropdown()	
	{	
        log.info("****************************** starting test case : verifyClickingClearAllSortEnableSortOptionsInAddSortDropdown *************");
        browserRefresh();
        TaskOverViewPage.clickClearAllButton(1);
        TaskOverViewPage.clickAddSortDropdown();
        
        assertTrue(TaskOverViewPage.isNextRunSortEnabledInDropdown(), "nextrun sort option is not enabled after clearAll button for sorts");
        assertTrue(TaskOverViewPage.isQueueSortEnabledInDropdown(), "queue sort is not enabled after clearAll button for sorts");
        assertTrue(TaskOverViewPage.isPrioritySortEnabledInDropdown(), "priority sort is not enabled after clearAll button for sorts");
        
        log.info("****** Ending the Test Case : verifyClickingClearAllSortEnableSortOptionsInAddSortDropdown *************");
	}
	
	@Test(priority = 26, enabled = true, description = "verifyActionIconForInsightApplication")
	public void verifyActionIconForInsightApplication()	
	{	
        log.info("****************************** starting test case : verifyActionIconForInsightApplication *************");
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
		
        assertTrue(TaskOverViewPage.isActionIconEnabled(), "action icon is not displayed for insight application type");
		
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyActionIconForInsightApplication *************");
	}
	
	@Test(priority = 27, enabled = true, description = "verifySetQueueAndPriorityOption")
	public void verifySetQueueAndPriorityOption()	
	{	
        log.info("****************************** starting test case : verifySetQueueAndPriorityOption *************");
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
		
        assertTrue(TaskOverViewPage.isSetQueueAndPriorityOptionDisplayed(), "set queue and priority option is not displayed for insight application type");
		
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifySetQueueAndPriorityOption *************");
	}
	
	@Test(priority = 28, enabled = true, description = "verifyClickingOnSetQueueAndPriorityOption")
	public void verifyClickingOnSetQueueAndPriorityOption()	
	{	
        log.info("****************************** starting test case : verifyClickingOnSetQueueAndPriorityOption *************");
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
		
        assertTrue(TaskOverViewPage.isSetQueueAndPriorityWindowDisplayed(), "set queue and priority window is not displayed for insight application type");
		
        TaskOverViewPage.clickCrossIconButton();
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyClickingOnSetQueueAndPriorityOption *************");
	}
	
	@Test(priority = 29, enabled = true, description = "verifyPriorityValueUpdate")
	public void verifyPriorityValueUpdate()	
	{	
        log.info("****************************** starting test case : verifyPriorityValueUpdate *************");
        String priorityValue = "3";
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.priorityInputValue(priorityValue);
        TaskOverViewPage.clickSaveButton();
		
        assertEquals(TaskOverViewPage.getPrioritySortTableResult(), priorityValue,  "priority value is not updated");
		
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyPriorityValueUpdate *************");
	}
	
	@Test(priority = 30, enabled = true, description = "verifyPriorityValueUpdate")
	public void verifyPriorityValueUpdateWithMaxLength()	
	{	
        log.info("****************************** starting test case : verifyPriorityValueUpdate *************");
        String priorityValue = "074-83964734734";
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.priorityInputValue(priorityValue);
        TaskOverViewPage.clickSaveButton();
		
        assertNotSame(TaskOverViewPage.getPrioritySortTableResult(), priorityValue,  "priority value is not updated with numeric and special char");
		
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyPriorityValueUpdate *************");
	}
	
	@Test(priority = 31, enabled = true, description = "verifyRefreshButtonForPriorityInput")
	public void verifyRefreshButtonForPriorityInput()	
	{	
        log.info("****************************** starting test case : verifyRefreshButtonForPriorityInput *************");
        String priorityValue = "8";
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.priorityInputValue(priorityValue);
        TaskOverViewPage.clickSaveButton();
        String priorityValueBeforeRefresh = TaskOverViewPage.getPrioritySortTableResult();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.clickRefreshButton();
        TaskOverViewPage.clickSaveButton();
        
        assertNotSame(TaskOverViewPage.getPrioritySortTableResult(), priorityValueBeforeRefresh, "priority value is not matched after clicking refresh button");
        
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyRefreshButtonForPriorityInput *************");
	}
	
	@Test(priority = 32, enabled = true, description = "verifyRefreshButtonEnable")
	public void verifyRefreshButtonEnable()	
	{	
        log.info("****************************** starting test case : verifyRefreshButtonEnable *************");
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
		
        assertFalse(TaskOverViewPage.isRefreshButtonSelected(),  "refresh button is not enabled");
		
        TaskOverViewPage.clickCancelButton();
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyRefreshButtonEnable *************");
	}
	
	@Test(priority = 33, enabled = true, description = "verifyPriorityValueUpdate")
	public void verifyRefreshButtonEnableAfterUpdatePriority()	
	{	
        log.info("****************************** starting test case : verifyRefreshButtonEnableAfterUpdatePriority *************");
        String priorityValue = "074-83964734734";
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.priorityInputValue(priorityValue);
		
        assertTrue(TaskOverViewPage.isRefreshButtonEnabled(),  "refresh button is enabled");
		
        TaskOverViewPage.clickCancelButton();
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyRefreshButtonEnableAfterUpdatePriority *************");
	}
	
	@Test(priority = 34, enabled = true, description = "verifyRefreshButtonForPriorityInputWithoutSave")
	public void verifyRefreshButtonForPriorityInputWithoutSave()	
	{	
        log.info("****************************** starting test case : verifyRefreshButtonForPriorityInputWithoutSave *************");
        String priorityValue = "4";
        browserRefresh();
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.priorityInputValue(priorityValue);
        String priorityValueBeforeRefresh = TaskOverViewPage.getPriorityInputValue();
        TaskOverViewPage.clickRefreshButton();
        
        assertNotSame(TaskOverViewPage.getPrioritySortTableResult(), priorityValueBeforeRefresh, "priority value is not matched after clicking refresh button");
        
        TaskOverViewPage.clickCancelButton();
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyRefreshButtonForPriorityInputWithoutSave *************");
	}
	
	@Test(priority = 35, enabled = true, description = "verifyPriorityDropdownInFilters")
	public void verifyPriorityDropdownForFilters()	
	{	
        log.info("****************************** starting test case : verifyPriorityDropdownInFilters *************");
        browserRefresh();
        TaskOverViewPage.clickPriorityDropdown();
        
        assertTrue(TaskOverViewPage.isPriorityDropdownWindowDisplayed(), "priority dropdown window is not displayed");
		
        log.info("****** Ending the Test Case : verifyPriorityDropdownInFilters *************");
	}
	
	@Test(priority = 36, enabled = true, description = "verifyOperatorDropdownInPriorityDropdown")
	public void verifyOperatorDropdownInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : verifyOperatorDropdownInPriorityDropdown *************");
        browserRefresh();
        TaskOverViewPage.clickPriorityDropdown();
        TaskOverViewPage.clickOperatorDropdownInPriorityDropdownWindow();
        
        assertTrue(TaskOverViewPage.isBetweenOperatorDisplayedInPriorityDropdownWindow(), "between operator is not displayed");
		
        log.info("****** Ending the Test Case : verifyOperatorDropdownInPriorityDropdown *************");
	}
	
	@Test(priority = 37, enabled = true, description = "verifyOperatorListInPriorityDropdown")
	public void verifyOperatorListInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : verifyOperatorListInPriorityDropdown *************");
        browserRefresh();
        TaskOverViewPage.clickPriorityDropdown();
        TaskOverViewPage.clickOperatorDropdownInPriorityDropdownWindow();
        
        assertTrue(TaskOverViewPage.isOperatorListDisplayedInPriorityDropdownWindow(), "operators list is displayed");
				
        log.info("****** Ending the Test Case : verifyOperatorListInPriorityDropdown *************");
	}
	
	@Test(priority = 38, enabled = true, description = "verifyClearAllButtonSelectedInPriorityDropdown")
	public void verifyClearAllButtonSelectedInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : verifyClearAllButtonSelectedInPriorityDropdown *************");
        browserRefresh();
        TaskOverViewPage.clickPriorityDropdown();
        TaskOverViewPage.clickOperatorDropdownInPriorityDropdownWindow();
        TaskOverViewPage.selectBetweenOperator();
        TaskOverViewPage.updatePriorityFirstInputField("3");

        assertTrue(TaskOverViewPage.isClearAllButtonSelectedInPriorityDropdown(), "clearAll button should enable");
		
        log.info("****** Ending the Test Case : verifyClearAllButtonSelectedInPriorityDropdown *************");
	}
	
	@Test(priority = 39, enabled = true, description = "verifyApplyButtonInPriorityDropdownForFilters")
	public void verifyApplyButtonInPriorityDropdownForFilters()	
	{	
        log.info("****************************** starting test case : verifyApplyButtonInPriorityDropdownForFilters *************");
        browserRefresh();
        TaskOverViewPage.clickPriorityDropdown();
        
        assertTrue(TaskOverViewPage.isApplyButtonEnabledInPriorityDropdown(), "apply button in priority dropdown is not enabled defaultly");
		
        log.info("****** Ending the Test Case : verifyApplyButtonInPriorityDropdownForFilters *************");
	}
	
	@Test(priority = 40, enabled = true, description = "verifyEqualOperatorInPriorityDropdown")
	public void verifyEqualOperatorInPriorityDropdown()	
	{	
        log.info("****************************** starting test case : verifyEqualOperatorInPriorityDropdown *************");
        String priorityValue = "8";
        TaskOverViewPage.clickApplicationDropdown(); 
        TaskOverViewPage.selectInsightApplicationOption();
        TaskOverViewPage.clickApplyButton();
        TaskOverViewPage.clickActionIcon();
        TaskOverViewPage.selectSetQueueAndPriorityOption();
        TaskOverViewPage.priorityInputValue(priorityValue);
        TaskOverViewPage.clickSaveButton();
        TaskOverViewPage.clickPriorityDropdown();
        TaskOverViewPage.updatePriorityFirstInputField(priorityValue);
        TaskOverViewPage.clickApplyButtonInPriorityDropdown();
        
        assertEquals(TaskOverViewPage.getPrioritySortTableResult(), priorityValue, "expected and actual priority value should match");
		
        TaskOverViewPage.clickClearAllButton(0);
        log.info("****** Ending the Test Case : verifyEqualOperatorInPriorityDropdown *************");
	}
}
