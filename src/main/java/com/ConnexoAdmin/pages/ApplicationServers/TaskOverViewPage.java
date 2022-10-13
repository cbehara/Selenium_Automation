package com.ConnexoAdmin.pages.ApplicationServers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TaskOverViewPage extends TestBase{
	
	
	public TaskOverViewPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(5000);
	}
	
	public void clickonTaskOverView()
	{ 
		WebElement ConnexoAdmin_TaskOverviewPage_TaskOverView = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_TaskOverView")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_TaskOverView, 10);	
		doClick(ConnexoAdmin_TaskOverviewPage_TaskOverView);		
	}
	public String gettextofTaskOverView()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView, 10);
		return getText(ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView);
	}
	
	public void selectDropDownValue()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverview_TasksPerPageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverview_TasksPerPageDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverview_TasksPerPageDropdown);
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue, 10);	
		doClick(ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue);
	}
	
	public void checkQueueType()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown);
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue, 10);
		doClick(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue);			
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview")));
		doClick(ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview);
	}
	
	public void clickQueueTypeDropdown()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown);
	}
	
	public void clickQueueDropdown()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown);
	}
	
	public void selectCALTimeSeriesExtQQueueTypeOption()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue, 10);
		doClick(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue);			
	}
	
	public void selectCreatePartitionsQueueTypeOption()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_CreatePartitionsQueueType")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue, 10);
		doClick(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue);			
	}
	
	public void clickApplicationDropdown()
	{
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_ApplicationDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplicationDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverviewPage_ApplicationDropdown);
	}
	
	public void selectMultisenseApplicationOption()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_ApplicationValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_MultisenseApplicationOption")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_ApplicationValue, 10);
		doClick(ConnexoAdmin_TaskOverviewPage_ApplicationValue);			
	}
	
	public void selectAdminApplicationOption()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_ApplicationValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AdminApplicationOption")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_ApplicationValue, 10);
		doClick(ConnexoAdmin_TaskOverviewPage_ApplicationValue);			
	}
	
	public void selectInsightApplicationOption()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_TaskOverviewPage_ApplicationValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_InsightApplicationOption")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_ApplicationValue, 10);
		doClick(ConnexoAdmin_TaskOverviewPage_ApplicationValue);			
	}
	
	public String getApplicationValue()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_TableResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public String getQueueTypeValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public String getQueueValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public String getNextRunValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_NextRunResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void clickApplyButton()
	{	
		waitForTime(3000);
		WebElement eleApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview")));
		TestUtil.waitforElementTobeLocated(eleApply,10);
		doClick(eleApply);
		waitForTime(3000);
	}
	
	public void clickSortCrossButton(int sortNumber)
	{
		waitForTime(2000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SortCrossButton")));
	    WebElement select=options.get(sortNumber);
        select.click();
	}
	
	public boolean isNextRunSortDisplayed()
	{
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_NextRunSort")));
		try{
		    if(sort.isDisplayed())
		        return true;
		    else
		        return false; 
		}catch (NoSuchElementException e) {
		    System.out.println("Element is not present, hence not displayed as well");
		    return false;
		}
	}
	
	public void clickNextRunSort()
	{
		waitForTime(5000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_NextRunSort")));
	    doClick(sort);
	}
	
	public String getNextRunSortText()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_NextRunSort")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public boolean isQueueSortDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueSort")));
	    return sort.isDisplayed();
	}
	
	public String getQueueSortText()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueSort")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public boolean isPrioritySortDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PrioritySort")));
	    return sort.isDisplayed();
	}
	
	public String getPrioritySortText()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PrioritySort")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public String getPrioritySortTableResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PriorityResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public boolean isAddSortEnabled()
	{
		waitForTime(2000);
		WebElement eleApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddSortButton")));
	    return eleApply.isSelected();
	}
	
	public void clickAddSortDropdown()
	{
		waitForTime(2000);
		WebElement addSort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddSortButton")));
		TestUtil.waitforElementTobeLocated(addSort, 10);
		doClick(addSort);			
	}
	
	public void selectAddSortDropdownValue(int sortIndex)
	{
		waitForTime(2000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SortDropdownValues")));
	    WebElement select=options.get(sortIndex);
        select.click();
	}
	
	public void clickNextRunSortFromAddSortDropdown()
	{
		waitForTime(2000);
		WebElement addSort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortNextRunDropdownValue")));
		TestUtil.waitforElementTobeLocated(addSort, 10);
		doClick(addSort);			
	}
	
	public boolean isNextRunSortSelectedInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortNextRunDropdownValue")));
	    return sort.isSelected();
	}
	
	public void isNextRunDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortNextRunDropdownValue")));
		sort.isDisplayed();
	}
	
	public boolean isNextRunSortEnabledInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortNextRunDropdownValue")));
	    return sort.isEnabled();
	}
	
	public boolean isSortsEmptyPanelDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_EmptySortPanel")));
	    return sort.isDisplayed();
	}
	
	public void clickQueueSortFromAddSortDropdown()
	{
		waitForTime(2000);
		WebElement addSort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortQueueDropdownValue")));
		TestUtil.waitforElementTobeLocated(addSort, 10);
		doClick(addSort);			
	}
	
	public boolean isQueueSortSelectedInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortQueueDropdownValue")));
	    return sort.isSelected();
	}
	
	public boolean isQueueSortEnabledInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortQueueDropdownValue")));
	    return sort.isEnabled();
	}
	
	public void clickPrioritySortFromAddSortDropdown()
	{
		waitForTime(2000);
		WebElement addSort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortPriorityDropdownValue")));
		TestUtil.waitforElementTobeLocated(addSort, 10);
		doClick(addSort);			
	}
	
	public boolean isPrioritySortSelectedInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortPriorityDropdownValue")));
	    return sort.isSelected();
	}
	
	public boolean isPrioritySortEnabledInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_AddsortPriorityDropdownValue")));
	    return sort.isEnabled();
	}
	
	public boolean isSortOptionEnabledInDropdown(int sortIndex)
	{
		waitForTime(8000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SortDropdownValues")));
	    WebElement select=options.get(sortIndex);
        return select.isEnabled();
	}
	
	public void clickClearAllButton(int clearAllNumber)
	{
		waitForTime(2000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_clearallButtons")));
	    WebElement select=options.get(clearAllNumber);
        select.click();
	}
	
	public boolean isClearAllEnabled(int clearAllNumber)
	{
		waitForTime(2000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_clearallButtons")));
	    WebElement select=options.get(clearAllNumber);
        return select.isEnabled();
	}
	
	public void clickSuspendedDropdown()
	{
		waitForTime(2000);
		WebElement suspendedDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SuspendedDropdown")));
		TestUtil.waitforElementTobeLocated(suspendedDropdown, 10);
		doClick(suspendedDropdown);			
	}
	
	public void clickPriorityDropdown()
	{
		waitForTime(2000);
		WebElement priorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PriorityDropdown")));
		TestUtil.waitforElementTobeLocated(priorityDropdown, 10);
		doClick(priorityDropdown);			
	}
	
	public void selectEqualOperator()
	{
		waitForTime(2000);
		WebElement operator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_EqualOperatorInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(operator, 10);
		doClick(operator);			
	}
	
	public void selectBetweenOperator()
	{
		waitForTime(2000);
		WebElement operator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_BetweenOperatorInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(operator, 10);
		doClick(operator);			
	}
	
	public void clickClearAllButtonInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement clearAllButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ClearAllButtonInPriorityDropdown")));
		TestUtil.waitforElementTobeLocated(clearAllButtonInPriorityDropdown, 10);
		doClick(clearAllButtonInPriorityDropdown);			
	}
	
	public void clickApplyButtonInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement ApplyButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplyButtonInPriorityDropdown")));
		TestUtil.waitforElementTobeLocated(ApplyButtonInPriorityDropdown, 10);
		doClickjavaScript(ApplyButtonInPriorityDropdown);			
	}
	
	public void clickOperatorDropdownInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement OperatorDropdownInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_OperatorDropdownInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(OperatorDropdownInPriorityDropdownWindow, 10);
		doClick(OperatorDropdownInPriorityDropdownWindow);			
	}
	
	public void clickBetweenOperatorInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement BetweenOperatorInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_BetweenOperatorInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(BetweenOperatorInPriorityDropdownWindow, 10);
		doClick(BetweenOperatorInPriorityDropdownWindow);			
	}
	
	public boolean isPriorityDropdownWindowDisplayed()
	{
		waitForTime(2000);
		WebElement PriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PriorityDropdownWindow")));
		return PriorityDropdownWindow.isDisplayed();
	}
	
	public void updatePriorityFirstInputField(String inputValue)
	{
		waitForTime(2000);
		WebElement priorityInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_FirstInputForOperatorInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(priorityInput, 10);
		doClear(priorityInput);	
		sendkeys(inputValue, priorityInput);
	}
	
	public boolean isOperatorListDisplayedInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement OperatorListInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_BetweenOperatorInPriorityDropdownWindow")));
		return OperatorListInPriorityDropdownWindow.isDisplayed();
	}
	
	public boolean isEqualOperatorSelectedInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement EqualOperatorInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_EqualOperatorInPriorityDropdownWindow")));
		return EqualOperatorInPriorityDropdownWindow.isSelected();
	}
	
	public boolean isBetweenOperatorDisplayedInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement BetweenOperatorInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_BetweenOperatorInPriorityDropdownWindow")));
		return BetweenOperatorInPriorityDropdownWindow.isDisplayed();
	}
	
	public boolean isApplyButtonEnabledInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement applyButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplyButtonInPriorityDropdown")));
		return applyButtonInPriorityDropdown.isEnabled();
	}
	
	public boolean isClearAllButtonEnabledInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement clearAllButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ClearAllButtonInPriorityDropdown")));
		return clearAllButtonInPriorityDropdown.isEnabled();
	}
	
	public boolean isClearAllButtonSelectedInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement clearAllButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ClearAllButtonInPriorityDropdown")));
		return clearAllButtonInPriorityDropdown.isEnabled();
	}
	
	public void selectNoOption()
	{
		waitForTime(2000);
		WebElement noOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_NoOption")));
		TestUtil.waitforElementTobeLocated(noOption, 10);
		doClick(noOption);			
	}
	
	public String getSuspendedValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SuspendedResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void clickActionIcon()
	{
		waitForTime(2000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ActionButton")));
		TestUtil.waitforElementTobeLocated(actionIcon, 10);
		doClick(actionIcon);			
	}
	
	public boolean isActionIconEnabled()
	{
		waitForTime(2000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ActionButton")));
        return actionIcon.isEnabled();
	}
	
	public void selectSetQueueAndPriorityOption()
	{
		waitForTime(2000);
		WebElement noOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SetQueueAndPriorityOption")));
		TestUtil.waitforElementTobeLocated(noOption, 10);
		doClick(noOption);			
	}
	
	public boolean isSetQueueAndPriorityOptionDisplayed()
	{
		waitForTime(2000);
		WebElement noOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SetQueueAndPriorityOption")));
		return noOption.isDisplayed();			
	}
	
	public void priorityInputValue(String inputValue)
	{
		waitForTime(2000);
		WebElement priorityInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PriorityInput")));
		TestUtil.waitforElementTobeLocated(priorityInput, 10);
		doClear(priorityInput);	
		sendkeys(inputValue, priorityInput);
	}
	
	public String getPriorityInputValue()
	{
		waitForTime(5000);
        WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_PriorityInput")));
        TestUtil.waitforElementTobeLocated(eleTableResult, 10);
        return getText(eleTableResult);
	}
	
	public void clickSaveButton()
	{
		waitForTime(2000);
		WebElement saveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SaveButton")));
		TestUtil.waitforElementTobeLocated(saveOption, 10);
		doClick(saveOption);			
	}
	
	public void clickRefreshButton()
	{
		waitForTime(2000);
		WebElement refreshButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_RefreshButton")));
		TestUtil.waitforElementTobeLocated(refreshButton, 10);
		doClick(refreshButton);			
	}
	
	public boolean isRefreshButtonSelected()
	{
		waitForTime(2000);
		WebElement refreshButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_RefreshButton")));
		return refreshButton.isSelected();			
	}
	
	public boolean isRefreshButtonEnabled()
	{
		waitForTime(2000);
		WebElement refreshButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_RefreshButton")));
		return refreshButton.isEnabled();			
	}
	
	public void clickCancelButton()
	{
		waitForTime(2000);
		WebElement cancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_CancelButton")));
		TestUtil.waitforElementTobeLocated(cancelButton, 10);
		doClick(cancelButton);			
	}
	
	public void clickCrossIconButton()
	{
		waitForTime(2000);
		WebElement crossIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_CrossButton")));
		TestUtil.waitforElementTobeLocated(crossIcon, 10);
		doClick(crossIcon);			
	}
	
	public Boolean isSetQueueAndPriorityWindowDisplayed()
	{
		waitForTime(2000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_SetQueueAndPriorityWindow")));
        return actionIcon.isDisplayed();
	}
	
}
	