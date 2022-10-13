
package com.multisense.pages.TaskManagement;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TaskManagmentPage extends TestBase {

	String TaskManagementNameValue= generateRandomName(9);

	
	public TaskManagmentPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Administration();
		waitForTime(3000);
	}
	public void clickonTasksManagement()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_TasksLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksLink")));
		doClickjavaScript(ConnexoMultisense_TaskMgmtPage_TasksLink);   
	}

	public String gettextofTasksManagement()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_verifyTasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifyTasks")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifyTasks, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifyTasks);
	}

	public void ChangeDropDownofperpage(String Tasksperpage)
	{
		waitForTime(1000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown);
		waitForTime(1000);
		//int IntTasksperpage=Integer.parseInt(Tasksperpage);
		//String strTasksperpage =String.valueOf(IntTasksperpage);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Tasksperpage +"']")).click();

		/*
		 * WebElement ConnexoMultisense_TaskMgmtPage_TasksPerPageValue =
		 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
		 * "ConnexoMultisense_TaskMgmtPage_TasksPerPageValue")));
		 * TestUtil.waitforElementTobeLocated(
		 * ConnexoMultisense_TaskMgmtPage_TasksPerPageValue, 10);
		 * doClick(ConnexoMultisense_TaskMgmtPage_TasksPerPageValue);
		 */

	}
	public void clickonAddTasksManagementLink()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_TasksPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksPerPage")));
		if(ConnexoMultisense_TaskMgmtPage_TasksPerPage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add task')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add task')]//ancestor::a)[1]")).click();
		}
	}
	
	public void addTaskSManagement(String Type,String Loglevel, String Devicegroup)
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TypeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_NameInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_NameInput")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_NameInput, 10);
		doClear(ConnexoMultisense_TaskMgmtPage_NameInput);
		sendkeys(TaskManagementNameValue, ConnexoMultisense_TaskMgmtPage_NameInput);
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_LoglevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_LoglevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_LoglevelDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_LoglevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Loglevel +"']")).click();
		waitForTime(1000);
		WebElement ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Devicegroup +"']")).click(); 
		WebElement ConnexoMultisense_TaskMgmtPage_addTasksButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_addTasksButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_addTasksButton, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_addTasksButton);         
	}
	
	public void addRegisteredDevicesKPITask(String Type,String Loglevel, String Devicegroup)
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TypeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown);
		DriverUtility.getDriver().findElement(By.xpath("(//li[@class='x-boundlist-item'])[7]")).click(); 
		WebElement ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown); 
		WebElement ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue);
		WebElement ConnexoMultisense_TaskMgmtPage_addTasksButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_addTasksButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_addTasksButton, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_addTasksButton);         
	}
	
	public void addDataCollectionKPITask(String Type,String Loglevel, String Devicegroup)
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TypeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDown); 
		WebElement ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDownValue, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_CollectionTypeDropDownValue);
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown);
		DriverUtility.getDriver().findElement(By.xpath("(//li[@class='x-boundlist-item'])[8]")).click(); 
		WebElement ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDown); 
		WebElement ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_CalculationFrquencyDropDownValue);
		WebElement ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDown); 
		WebElement ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDownValue, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DisplayRangeDropDownValue);
		WebElement ConnexoMultisense_TaskMgmtPage_addTasksButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_addTasksButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_addTasksButton, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_addTasksButton);         
	}
	
	public void addCRLRequestTask(String Type,String Loglevel, String Devicegroup)
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TypeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_cancelTasksButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_cancelTasksButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_cancelTasksButton, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_cancelTasksButton); 
	}	

	public void runTasksManagement()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ TaskManagementNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksRun = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksRun")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksRun, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksRun);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ TaskManagementNameValue +"')]//ancestor::div//a[normalize-space()='Run']")).click();
	}


	public void suspendTasksManagement()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ TaskManagementNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksSuspend = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksSuspend")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksSuspend, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksSuspend);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ TaskManagementNameValue +"')]//ancestor::div//a[normalize-space()='Suspend']")).click();
	}
	
	public void editTasksManagement()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ TaskManagementNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksEdit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksEdit")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksEdit, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksEdit);
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksSave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksSave")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksSave, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksSave);
	}
	
	public void removeTasksManagement()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ TaskManagementNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksRemove")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksRemove, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksRemove);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ TaskManagementNameValue +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}

	public String gettextofValidationtaskadded()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded);
	}

	public String getthetextDatavalidationtaskrunqueued()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued);
	}

	public String getthetexExporttasksuspended()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended);
	}
	
	public String getNextRunSortText()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_NextRunSort")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public String getQueueSortText()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueSort")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public String getPrioritySortText()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PrioritySort")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void clickNextRunSort()
	{
		waitForTime(5000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_NextRunSort")));
	    doClick(sort);
	}
	
	public String getNextRunValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_NextRunResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void clickNextRunSortFromAddSortDropdown()
	{
		waitForTime(2000);
		WebElement addSort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortNextRunDropdownValue")));
		TestUtil.waitforElementTobeLocated(addSort, 10);
		doClick(addSort);			
	}
	
	public void clickSortCrossButton(int sortNumber)
	{
		waitForTime(2000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_SortCrossButton")));
	    WebElement select=options.get(sortNumber);
        select.click();
	}
	
	public boolean isQueueSortDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueSort")));
	    return sort.isDisplayed();
	}
	
	public boolean isPrioritySortDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PrioritySort")));
	    return sort.isDisplayed();
	}
	
	public boolean isNextRunSortDisplayed()
	{
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_NextRunSort")));
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
	
	public void clickApplyButton()
	{	
		waitForTime(3000);
		WebElement eleApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_ApplyTaskOverview")));
		TestUtil.waitforElementTobeLocated(eleApply,10);
		doClick(eleApply);
		waitForTime(3000);
	}
	
	public String getApplicationValue()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TableResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void clickClearAllButton(int clearAllNumber)
	{
		waitForTime(2000);
		List<WebElement> options=DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_clearallButtons")));
	    WebElement select=options.get(clearAllNumber);
        select.click();
	}
	
	public void clickQueueDropdown()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_QueueDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueDropdown")));
		doClickjavaScript(ConnexoMultisense_TaskMgmtPage_QueueDropdown);
	}
	
	public void selectDataValidationQueueTypeOption()
	{
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_DataValidationQueueType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DataValidationQueueType")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DataValidationQueueType, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DataValidationQueueType);			
	}
	
	public String getQueueValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void selectKeyRenewalQueueTypeOption()
	{
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_QueueTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueTypeDropdownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_QueueTypeDropdownValue, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_QueueTypeDropdownValue);			
	}
	
	public void clickQueueTypeDropdown()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_QueueTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueTypeDropdown")));
		doClickjavaScript(ConnexoMultisense_TaskMgmtPage_QueueTypeDropdown);
	}
	
	public String getQueueTypeValueFromResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_QueueTypeResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public boolean isAddSortEnabled()
	{
		waitForTime(2000);
		WebElement eleApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddSortButton")));
	    return eleApply.isSelected();
	}
	
	public void clickAddSortDropdown()
	{
		waitForTime(2000);
		WebElement addSort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddSortButton")));
		TestUtil.waitforElementTobeLocated(addSort, 10);
		doClick(addSort);			
	}
	
	public boolean isNextRunSortSelectedInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortNextRunDropdownValue")));
	    return sort.isSelected();
	}
	
	public boolean isQueueSortSelectedInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortQueueDropdownValue")));
	    return sort.isSelected();
	}
	
	public boolean isPrioritySortSelectedInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortPriorityDropdownValue")));
	    return sort.isSelected();
	}
	
	public boolean isNextRunSortEnabledInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortNextRunDropdownValue")));
	    return sort.isEnabled();
	}
	
	public boolean isQueueSortEnabledInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortQueueDropdownValue")));
	    return sort.isEnabled();
	}
	
	public boolean isPrioritySortEnabledInDropdown()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_AddsortPriorityDropdownValue")));
	    return sort.isEnabled();
	}
	
	public boolean isSortsEmptyPanelDisplayed()
	{
		waitForTime(2000);
		WebElement sort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_EmptySortPanel")));
	    return sort.isDisplayed();
	}
	
	public void clickPriorityDropdown()
	{
		waitForTime(2000);
		WebElement priorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PriorityDropdown")));
		TestUtil.waitforElementTobeLocated(priorityDropdown, 10);
		doClick(priorityDropdown);			
	}
	
	public void clickOperatorDropdownInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement OperatorDropdownInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_OperatorDropdownInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(OperatorDropdownInPriorityDropdownWindow, 10);
		doClick(OperatorDropdownInPriorityDropdownWindow);			
	}
	
	public void selectBetweenOperator()
	{
		waitForTime(2000);
		WebElement operator = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_BetweenOperatorInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(operator, 10);
		doClick(operator);			
	}
	
	public void updatePriorityFirstInputField(String inputValue)
	{
		waitForTime(2000);
		WebElement priorityInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_FirstInputForOperatorInPriorityDropdownWindow")));
		TestUtil.waitforElementTobeLocated(priorityInput, 10);
		doClear(priorityInput);	
		sendkeys(inputValue, priorityInput);
	}
	
	public boolean isClearAllButtonSelectedInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement clearAllButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_ClearAllButtonInPriorityDropdown")));
		return clearAllButtonInPriorityDropdown.isEnabled();
	}
	
	public boolean isApplyButtonEnabledInPriorityDropdown()
	{
		waitForTime(2000);
		WebElement applyButtonInPriorityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_ApplyButtonInPriorityDropdown")));
		return applyButtonInPriorityDropdown.isEnabled();
	}
	
	public boolean isPriorityDropdownWindowDisplayed()
	{
		waitForTime(2000);
		WebElement PriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PriorityDropdownWindow")));
		return PriorityDropdownWindow.isDisplayed();
	}
	
	public boolean isBetweenOperatorDisplayedInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement BetweenOperatorInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_BetweenOperatorInPriorityDropdownWindow")));
		return BetweenOperatorInPriorityDropdownWindow.isDisplayed();
	}
	
	public boolean isOperatorListDisplayedInPriorityDropdownWindow()
	{
		waitForTime(2000);
		WebElement OperatorListInPriorityDropdownWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_BetweenOperatorInPriorityDropdownWindow")));
		return OperatorListInPriorityDropdownWindow.isDisplayed();
	}
	
	public void clickActionIcon()
	{
		waitForTime(2000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_ActionButton")));
		TestUtil.waitforElementTobeLocated(actionIcon, 10);
		doClick(actionIcon);			
	}
	
	public void clickActionButton()
	{
		waitForTime(2000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_Action")));
		TestUtil.waitforElementTobeLocated(actionIcon, 10);
		doClick(actionIcon);		
	}
	
	public void selectSetQueueAndPriorityOption()
	{
		waitForTime(2000);
		WebElement noOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_SetQueueAndPriorityOption")));
		TestUtil.waitforElementTobeLocated(noOption, 10);
		doClick(noOption);			
	}
	
	public void priorityInputValue(String inputValue)
	{
		waitForTime(2000);
		WebElement priorityInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PriorityInput")));
		TestUtil.waitforElementTobeLocated(priorityInput, 10);
		doClear(priorityInput);	
		sendkeys(inputValue, priorityInput);
	}
	
	public String getPriorityInputValue()
	{
		waitForTime(5000);
        WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PriorityInput")));
        TestUtil.waitforElementTobeLocated(eleTableResult, 10);
        return getText(eleTableResult);
	}
	
	public void clickRefreshButton()
	{
		waitForTime(2000);
		WebElement refreshButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_RefreshButton")));
		TestUtil.waitforElementTobeLocated(refreshButton, 10);
		doClick(refreshButton);			
	}
	
	public String getPrioritySortTableResult()
    {
         waitForTime(5000);
         WebElement eleTableResult = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_PriorityResult")));
         TestUtil.waitforElementTobeLocated(eleTableResult, 10);
         return getText(eleTableResult);
    }
	
	public void clickCancelButton()
	{
		waitForTime(2000);
		WebElement cancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CancelButton")));
		TestUtil.waitforElementTobeLocated(cancelButton, 10);
		doClick(cancelButton);			
	}
	
	public boolean isSetQueueAndPriorityOptionDisplayed()
	{
		waitForTime(2000);
		WebElement noOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_SetQueueAndPriorityOption")));
		return noOption.isDisplayed();			
	}
	
	public Boolean isSetQueueAndPriorityWindowDisplayed()
	{
		waitForTime(2000);
		WebElement actionIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_SetQueueAndPriorityWindow")));
        return actionIcon.isDisplayed();
	}
	
	public void clickCrossIconButton()
	{
		waitForTime(2000);
		WebElement crossIcon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_CrossButton")));
		TestUtil.waitforElementTobeLocated(crossIcon, 10);
		doClick(crossIcon);			
	}
	
	public void clickSaveButton()
	{
		waitForTime(2000);
		WebElement saveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_SaveButton")));
		TestUtil.waitforElementTobeLocated(saveOption, 10);
		doClick(saveOption);			
	}
	
	public void clickClearAllButton()
	{
		waitForTime(2000);
		WebElement saveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_ClearallButton")));
		TestUtil.waitforElementTobeLocated(saveOption, 10);
		doClick(saveOption);			
	}
	
	public boolean isRefreshButtonSelected()
	{
		waitForTime(2000);
		WebElement refreshButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_RefreshButton")));
		return refreshButton.isSelected();			
	}
	
	public boolean isRefreshButtonEnabled()
	{
		waitForTime(2000);
		WebElement refreshButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_RefreshButton")));
		return refreshButton.isEnabled();			
	}
}
