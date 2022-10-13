package com.DevicesAndSearch.pages.Search;
import com.base.base.TestBase;

import com.google.common.primitives.Booleans;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Calendar; 

public class MultisenseSearchPage extends TestBase {

	public  MultisenseSearchPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
	}

	public void selectSearchTitle()
	{
		Multisense();
		waitForTime(1000);
		Workspace();
		waitForTime(500);
		catchCFT1000Alert();
		waitForTime(5000);
		WebElement eleMainSearchBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleMainSearchBtn")));
		doClick(eleMainSearchBtn);
		waitForTime(1000);	
	}
	
	public void clickondeviceType() 
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleDeviceType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleDeviceType")));
		TestUtil.waitforElementTobeLocated(eleDeviceType,30);
		doClick(eleDeviceType);
		waitForTime(2000);		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleSelectTypeAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSelectTypeAll")));
		TestUtil.waitforElementTobeLocated(eleSelectTypeAll,30);
		doClick(eleSelectTypeAll);
		waitForTime(2000);
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(1000);				
	}
	
	public void clickonDeviceGroup()
	{
		WebElement DeviceGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_DeviceGroup")));
		TestUtil.waitforElementTobeLocated(DeviceGroup,10);
		doClick(DeviceGroup);
		waitForTime(1000);		
		WebElement DeviceGroup2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_DeviceGroup2")));
		TestUtil.waitforElementTobeLocated(DeviceGroup2,10);
		doClick(DeviceGroup2);		
		waitForTime(1000);	
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(1000);
	}
	
	public void clickonGroupOptionSelect()
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//doClick(Multisense_Search_eleElectricityDevice);
		waitForTime(1000);
		
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(1000);	
	}
	
	public void clickSearchBtn()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		WebElement eleSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSearch")));
		TestUtil.waitforElementTobeLocated(eleSearch,30);
		doClick(eleSearch);	
		waitForTime(1000);
	}

	//Test Case 2

	public void clickPerPage()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement selectPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectPerPage")));
		TestUtil.waitforElementTobeLocated(selectPerPage,30);
		doClick(selectPerPage);
		waitForTime(5000);		 

		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement selectPagesNumber = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectPagesNumber")));
		TestUtil.waitforElementTobeLocated(selectPagesNumber,10);
		doClick(selectPagesNumber);
		
		waitForTime(5000);		
	}
	
	public void clickCount()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		if (isDisplayed("Multisense_Search_selectCount")) {
			WebElement selectCount = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectCount")));
			TestUtil.waitforElementTobeLocated(selectCount,30);
			doClick(selectCount);		 
			waitForTime(5000);
		}
	}

	//Test case 3
	public void clickonColumnSelectOption()
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectColumn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectColumn")));
		TestUtil.waitforElementTobeLocated(selectColumn,10);
		doClick(selectColumn);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectOption1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectOption1")));
		TestUtil.waitforElementTobeLocated(selectOption1,10);
		doClick(selectOption1);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectOption2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectOption2")));
		TestUtil.waitforElementTobeLocated(selectOption2,10);
		doClick(selectOption2);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnDone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnDone")));
		TestUtil.waitforElementTobeLocated(btnDone,30);
		doClick(btnDone);
		
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(5000);		
	}	
	
	// Test case 4
	public void clickBulkAction()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement btnBulkAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnBulkAction")));
		TestUtil.waitforElementTobeLocated(btnBulkAction,50);
		doClick(btnBulkAction);

		waitForTime(5000);

	}
	
	//Test Case 4
	public void clickSelectoptionClickNext()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement btnSelectAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnSelectAll")));
		TestUtil.waitforElementTobeLocated(btnSelectAll,10);
		doClick(btnSelectAll);
		waitForTime(5000);
		WebElement option1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_option1")));
		TestUtil.waitforElementTobeLocated(option1,10);
		doClick(option1);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		waitForTime(5000);
		WebElement option2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_option2")));
		TestUtil.waitforElementTobeLocated(option2,10);
		doClick(option2);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement nxtBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nxtBtn")));	
		TestUtil.waitforElementTobeLocated(nxtBtn,10);
		doClick(nxtBtn);
		waitForTime(5000);
	}
	//Test Case 5
	public void clickcommunicationSchedule()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//DriverUtility.getDriver().findElement(By.xpath("//b[normalize-space()='Add shared communication schedules']")).click();
		WebElement addSharedBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_addSharedBtn")));
		TestUtil.waitforElementTobeLocated(addSharedBtn,0);
		doClick(addSharedBtn);

		waitForTime(5000);
		WebElement forAddbtnNext = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_forAddbtnNext")));	
		TestUtil.waitforElementTobeLocated(forAddbtnNext,10);
		doClick(forAddbtnNext);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectDailyRead = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectDailyRead")));
		TestUtil.waitforElementTobeLocated(selectDailyRead,10);
		doClick(selectDailyRead);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement nextBtnforActiondetails = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nextBtnforActiondetails")));
		TestUtil.waitforElementTobeLocated(nextBtnforActiondetails,30);
		doClick(nextBtnforActiondetails);
		waitForTime(5000);
	}

	//Test Case 6
	public void clickRemoveScheduleandConfirm()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement radioBtnRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_radioBtnRemove")));
		TestUtil.waitforElementTobeLocated(radioBtnRemove,30);
		doClick(radioBtnRemove);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ConfirmBtnforActiondetails = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_ConfirmBtnforActiondetails")));
		TestUtil.waitforElementTobeLocated(ConfirmBtnforActiondetails,30);
		doClick(ConfirmBtnforActiondetails);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Finish")));
		TestUtil.waitforElementTobeLocated(Finish,30);
		doClick(Finish);
		waitForTime(5000);
	}

	//Test Case 7

	public void clickAddCriteria()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement addCriteria = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_addCriteria")));
		TestUtil.waitforElementTobeLocated(addCriteria,30);
		doClick(addCriteria);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement OptionConnectionMethod = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_OptionConnectionMethod")));
		TestUtil.waitforElementTobeLocated(OptionConnectionMethod,30);
		doClick(OptionConnectionMethod);
		waitForTime(5000);
		
		Actions action = new Actions(DriverUtility.getDriver());
		WebElement Multisense_Search_Channel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Channel")));
		TestUtil.waitforElementTobeLocated(Multisense_Search_Channel,10);
		action.moveToElement(Multisense_Search_Channel).build().perform();
		waitForTime(1000);
		WebElement Multisense_Search_Interval = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Interval")));
		TestUtil.waitforElementTobeLocated(Multisense_Search_Interval,10);
		waitForTime(2000);
		action.moveToElement(Multisense_Search_Interval).click().build().perform();
		waitForTime(5000);
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(5000);
		action.sendKeys(Keys.ESCAPE).build().perform();		
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSearch")));
		TestUtil.waitforElementTobeLocated(eleSearch,10);
		doClick(eleSearch);
		waitForTime(5000);
	}
	
	//Test Case 9
	public void clickBulkActionBtn()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnBulkAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnBulkAction")));
		TestUtil.waitforElementTobeLocated(btnBulkAction,30);
		doClick(btnBulkAction);

		waitForTime(5000);
	}

	public void clickNextForAddDevice()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement nextAddDeviceBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nextAddDeviceBtn")));
		TestUtil.waitforElementTobeLocated(nextAddDeviceBtn,30);
		doClick(nextAddDeviceBtn);
		waitForTime(5000);
	}
	public void clickAddDeviceandNext()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement startProcessRadiobtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_startProcessRadiobtn")));
		TestUtil.waitforElementTobeLocated(startProcessRadiobtn,30);
		doClick(startProcessRadiobtn);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement adDeviceNextBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_adDeviceNextBtn")));
		TestUtil.waitforElementTobeLocated(adDeviceNextBtn,30);
		doClick(adDeviceNextBtn);
		waitForTime(5000);
	}
	//Test Case 10
	public void clickCreateIssue()
	{	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	waitForTime(5000);
	WebElement allDeviceRadiobtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_allDeviceRadiobtn")));
	TestUtil.waitforElementTobeLocated(allDeviceRadiobtn,30);
	doClick(allDeviceRadiobtn);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	waitForTime(5000);
	WebElement NxtSelectAllDeviceBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_NxtSelectAllDeviceBtn")));
	TestUtil.waitforElementTobeLocated(NxtSelectAllDeviceBtn,30);
	doClick(NxtSelectAllDeviceBtn);
	waitForTime(5000);
	WebElement radioClickIssuebtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_radioClickIssuebtn")));
	TestUtil.waitforElementTobeLocated(radioClickIssuebtn,30);
	doClick(radioClickIssuebtn);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement nextBtnFrmSelectActionPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nextBtnFrmSelectActionPage")));
	TestUtil.waitforElementTobeLocated(nextBtnFrmSelectActionPage,30);
	doClick(nextBtnFrmSelectActionPage);
	waitForTime(5000);
	}

	public void createIssue(String IssueReason,String IssueUrgency, String IssueImpact ) 
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Reason = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Reason")));
		TestUtil.waitforElementTobeLocated(Reason,30);
		doClear(Reason);
		waitForTime(5000);
		sendkeys(IssueReason, Reason);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Urgency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Urgency")));
		TestUtil.waitforElementTobeLocated(Urgency,30);
		doClear(Urgency);
		waitForTime(5000);
		sendkeys(IssueUrgency, Urgency);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Impact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Impact")));
		TestUtil.waitforElementTobeLocated(Impact,30);
		doClear(Impact);
		waitForTime(5000);
		sendkeys(IssueImpact, Impact);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnNextToCreate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnNextToCreate")));
		TestUtil.waitforElementTobeLocated(btnNextToCreate,30);
		doClick(btnNextToCreate);
		waitForTime(5000);				
	}
	
	public void FinishBulkAction()
	{		
		waitForTime(5000);
		WebElement btnConfirm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnConfirm")));		
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(btnConfirm));
		doClick(btnConfirm);
		waitForTime(5000);
		WebElement btnFinish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnFinish")));
		wait.until(ExpectedConditions.visibilityOf(btnFinish));
		doClick(btnFinish);		
	}

	public void selectSearchTitleDirect()
	{
		Multisense();
		waitForTime(1000);
		WebElement eleMainSearchBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleMainSearchBtn")));
		doClick(eleMainSearchBtn);
		waitForTime(1000);	
	}
	public void SelectMultiSense()
	{
		Multisense();
		waitForTime(1000);
			
	}
	public void ClickOnSearchOption()
	{
		WebElement eleMainSearchBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleMainSearchBtn")));
		doClick(eleMainSearchBtn);
		waitForTime(2000);
	}
	public void clickClearAllBtn()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));	
		if (isDisplayed("Multisense_Search_eleClearAllBtn"))
		{
		WebElement eleClearAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleClearAllBtn")));
		TestUtil.waitforElementTobeLocated(eleClearAll,30);
		doClick(eleClearAll);	
		waitForTime(1000);
		}
	}
	 private boolean check(String[] arr, String toCheckValue)
	    {
	     	boolean bResult =false;
		 	// check if the specified element
	        // is present in the array or not
	        // using Linear Search method
	        
	        for (String element : arr) {
	            if (element.equalsIgnoreCase(toCheckValue)) {
	            	bResult= true;
	                break;
	            }
	        }
	        return bResult;
	 
	    }
		public void clickonCriteria(String CriteriaXPath, String CriteriaVal) 
		{
			if(!CriteriaXPath.equalsIgnoreCase("NA"))
			{
				WebElement eleName = null;
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				eleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(CriteriaXPath)));
				
					
				
				TestUtil.waitforElementTobeLocated(eleName,30);
				doClick(eleName);
				waitForTime(2000);		
				WebElement eleNameCriteria;
				if(CriteriaVal.equalsIgnoreCase("YES"))
				{
					eleNameCriteria = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleRadioBtnCriteria_Yes")));
					TestUtil.waitforElementTobeLocated(eleNameCriteria,30);
					doClick(eleNameCriteria);
					waitForTime(2000);
					
					Actions action = new Actions(DriverUtility.getDriver());		
					action.sendKeys(Keys.ESCAPE).build().perform();
					waitForTime(1000);
				}
				else if (CriteriaVal.equalsIgnoreCase("NO"))
				{
					eleNameCriteria = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleRadioBtnCriteria_No")));
					TestUtil.waitforElementTobeLocated(eleNameCriteria,30);
					doClick(eleNameCriteria);
					waitForTime(2000);
					
					Actions action = new Actions(DriverUtility.getDriver());		
					action.sendKeys(Keys.ESCAPE).build().perform();
					waitForTime(1000);
				}
				else
				{
					waitForTime(2000);
					DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
					 eleNameCriteria = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleCriteria")));
					TestUtil.waitforElementTobeLocated(eleNameCriteria,30);
					doClick(eleNameCriteria);
					waitForTime(2000);
					String[] NameArray = CriteriaVal.split(":");
					WebElement eleNameCriteriaVal;
					if(NameArray[0].equalsIgnoreCase("="))		
						 eleNameCriteriaVal = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleEqualCriteria")));
					else if (NameArray[0].equalsIgnoreCase("!=")) 
						 eleNameCriteriaVal = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleNotequalCriteria")));
					else
						 eleNameCriteriaVal = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleINCriteria")));
						
					TestUtil.waitforElementTobeLocated(eleNameCriteriaVal,30);
					doClick(eleNameCriteriaVal);
					waitForTime(2000);
					WebElement NameField;
					if(NameArray[0].equalsIgnoreCase("IN"))
						 NameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleINField")));
					else
					{
						if (isDisplayed("Multisense_Search_eleEqualNotEqualField_Input"))
							NameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleEqualNotEqualField_Input")));
						else
						{
							if (isDisplayed("Multisense_Search_eleEqualNotEqualField_MultiOptionInput"))
								NameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleEqualNotEqualField_MultiOptionInput")));
							else
								//'x-form-field x-form-text x-form-empty-field'
								NameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleEqualNotEqualField_MultiOptionInput1")));
						}
											
						
						/*
						 * if((Criteria.equalsIgnoreCase("MRID"))) NameField =
						 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
						 * "Multisense_Search_eleEqualNotEqualField_Advance"))); else if
						 * ((Criteria.equalsIgnoreCase("Channel OBISCODE"))) if
						 * (isDisplayed("Multisense_Search_eleEqualNotEqualField_Advance")) NameField =
						 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
						 * "Multisense_Search_eleEqualNotEqualField_Advance"))); else NameField =
						 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
						 * "Multisense_Search_eleEqualNotEqualField_Advance_OBISCode"))); else
						 * if((Criteria.equalsIgnoreCase("NAME"))||(Criteria.
						 * equalsIgnoreCase("SERIAL NUMBER"))||(Criteria.equalsIgnoreCase("MRID"))||(
						 * Criteria.equalsIgnoreCase("Channel OBISCODE"))||(Criteria.
						 * equalsIgnoreCase("Connection Name"))) NameField =
						 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
						 * "Multisense_Search_eleEqualNotEqualField_SingleOption"))); else NameField =
						 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
						 * "Multisense_Search_eleEqualNotEqualField")));
						 */
					}
					TestUtil.waitforElementTobeLocated(NameField,30);
					doClear(NameField);
					waitForTime(5000);			
					sendkeys(NameArray[1], NameField);
						
					waitForTime(2000);
					
					String XPath;
					if (CriteriaXPath.equalsIgnoreCase("Multisense_Search_eleLocation"))
						XPath = "//div[@class='x-grid-cell-inner '][1]";
					else
						XPath = "//div[@class='x-grid-cell-inner '][text()='" + NameArray[1] + "']";
					if (isDisplayed_ByXpath(XPath))
					{	
						waitForTime(5000);
						eleName = DriverUtility.getDriver().findElement(By.xpath(XPath));
						TestUtil.waitforElementTobeLocated(eleName,30);
						doClick(eleName);
						waitForTime(2000);
						Actions action = new Actions(DriverUtility.getDriver());		
						action.sendKeys(Keys.ESCAPE).build().perform();
						waitForTime(1000);
					}
					else
					{
						Actions action = new Actions(DriverUtility.getDriver());		
						action.sendKeys(Keys.ESCAPE).build().perform();
						waitForTime(1000);	
					}		
				}
			}
		}
	public boolean ValidateDataColumnBasis(int ColumnNo, String ValidateString)
	{
		boolean bResult=true;
		
		if (isDisplayed("Multisense_Search_NoSearchResult"))
		{
			return false;			
		}	
		//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[1]/div/a
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		WebElement eleSearchResultCount = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleResultCount")));
		TestUtil.waitforElementTobeLocated(eleSearchResultCount,30);
		int nCount=Integer.parseInt(eleSearchResultCount.getText());
		String[] Criteria = ValidateString.split(":");
		String Xpath;
		if(Criteria[0].equalsIgnoreCase("IN")) //E.g. IN:SPE01000001;SPE01000002
		{
			String[] szItemstoValidate= Criteria[1].split(";");
			if(nCount != szItemstoValidate.length)
				bResult = false;
			else
			{
				for(int count = 0; count < szItemstoValidate.length; count++)
				{
					if((ColumnNo == 1) || (ColumnNo == 3)||(ColumnNo == 4))
						Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + (count+1) + "]/td[" + ColumnNo + "]/div/a";
					else
						Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + (count+1) + "]/td[" + ColumnNo + "]/div";
					
					DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
					WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(Xpath));
					TestUtil.waitforElementTobeLocated(SearchEle,30);
					String szText = SearchEle.getText();
					if(check(szItemstoValidate,szText))					
						bResult = bResult && true;					
					else
						bResult = bResult && false;
				}				
			}			
		}
		else
		{
			if ((Criteria[1].contains("*"))||(Criteria[1].contains("*")==false && Criteria[0].contains("!="))) //partial search e.g. =SP*,!=SP*
			{
				String RowstoValidate;
				if (nCount >=10)		
					RowstoValidate= "1,5,10";
				else if ((nCount >=3)&& (nCount <10))
					RowstoValidate= "1,2,3";
				else if ((nCount >=1)&& (nCount <3))
					RowstoValidate= "1";
				else
				{
					bResult = false;
					return bResult;
				}			
				String[] RowstoValidateArray = RowstoValidate.split(",");
				for(int count = 0; count < RowstoValidateArray.length; count++)
				{
					if((ColumnNo == 1) || (ColumnNo == 3)||(ColumnNo == 4))
						Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + RowstoValidateArray[count] + "]/td[" +  (ColumnNo) + "]/div/a";
					else
						Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + RowstoValidateArray[count] + "]/td[" +  (ColumnNo) + "]/div";
					
					
					DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
					WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(Xpath));
					TestUtil.waitforElementTobeLocated(SearchEle,30);
					String szText = SearchEle.getText();
					if((Criteria[0].equalsIgnoreCase("=")))
					{
						String StringtoValidate = Criteria[1].replace("*","");
						if (szText.startsWith(StringtoValidate))
						{
							bResult = bResult && true;
						}
						else
							bResult = bResult && false;
					}
					
					else if((Criteria[0].equalsIgnoreCase("!=")))
					{
						if (Criteria[1].contains("*")) {
							String StringtoValidate = Criteria[1].replace("*","");
							if (szText.startsWith(StringtoValidate)==false)
							{
								bResult = bResult && true;
							}
							else
								bResult = bResult && false;
						}
						else
						{
							if (szText.equalsIgnoreCase(Criteria[1])==false)
							{
								bResult = bResult && true;
							}
							else
								bResult = bResult && false;
						}
						
						
					}					
				}
			}
			else //Exact Match e.g. =SPE01000001
			{
				if((ColumnNo == 1) || (ColumnNo == 3)||(ColumnNo == 4))
					Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[" + ColumnNo + "]/div/a";
				else
					Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[1]/td[" + ColumnNo + "]/div";
				
				
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
				WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(Xpath));
				TestUtil.waitforElementTobeLocated(SearchEle,30);
				String szText = SearchEle.getText();
				if((nCount != 1)&&((ColumnNo == 1) || (ColumnNo == 2)))
					bResult = false;
				else
				{
					if((Criteria[0].equalsIgnoreCase("=")))
					{
						String StringtoValidate;
						if (szText.contains("("))
							StringtoValidate =  Criteria[1];
						else
							StringtoValidate = Criteria[1].split("\\(")[0];
						
						if (szText.equalsIgnoreCase(StringtoValidate.trim()))
						{
							bResult = true;
						}
						else
							bResult =  false;
					}					
				}
			}
		}
		return bResult;
	}

	/*
	 * public void AddCriteria(String CriteriaName) { String szLocatorVar=""; String
	 * szLocatorVar1=""; if(CriteriaName.equalsIgnoreCase("CONNECTION METHOD"))
	 * szLocatorVar = "Multisense_Search_OptionConnectionMethod"; else if
	 * (CriteriaName.equalsIgnoreCase("MRID")) szLocatorVar =
	 * "Multisense_Search_OptionMRID"; else if
	 * (CriteriaName.equalsIgnoreCase("SHARED SCHEDULE")) szLocatorVar =
	 * "Multisense_Search_OptionSharedSchedule"; else if
	 * (CriteriaName.equalsIgnoreCase("CHANNEL INTERVAL")) { szLocatorVar =
	 * "Multisense_Search_Channel"; szLocatorVar1 = "Multisense_Search_Interval"; }
	 * else if (CriteriaName.equalsIgnoreCase("CHANNEL OBISCODE")) { szLocatorVar =
	 * "Multisense_Search_Channel"; szLocatorVar1 = "Multisense_Search_OBISCode"; }
	 * else if (CriteriaName.equalsIgnoreCase("CommunicationTask Name")) {
	 * szLocatorVar = "Multisense_Search_CommunicationTask"; szLocatorVar1 =
	 * "Multisense_Search_CommunicationTask_Name"; } // else if
	 * (CriteriaName.equalsIgnoreCase("CommunicationTask NextCommunication")) {
	 * szLocatorVar = "Multisense_Search_CommunicationTask"; szLocatorVar1 =
	 * "Multisense_Search_CommunicationTask_NextCommunication"; } else if
	 * (CriteriaName.equalsIgnoreCase("CommunicationTask ScheduleName")) {
	 * szLocatorVar = "Multisense_Search_CommunicationTask"; szLocatorVar1 =
	 * "Multisense_Search_CommunicationTask_ScheduleName"; } else if
	 * (CriteriaName.equalsIgnoreCase("CommunicationTask ScheduleType")) {
	 * szLocatorVar = "Multisense_Search_CommunicationTask"; szLocatorVar1 =
	 * "Multisense_Search_CommunicationTask_ScheduleType"; } else if
	 * (CriteriaName.equalsIgnoreCase("CommunicationTask PlannedDate")) {
	 * szLocatorVar = "Multisense_Search_CommunicationTask"; szLocatorVar1 =
	 * "Multisense_Search_CommunicationTask_PlannedDate"; }
	 * //Multisense_Search_Connection_AllowSimulataneousConnection else if
	 * (CriteriaName.equalsIgnoreCase("Connection AllowSimulataneousConnection")) {
	 * szLocatorVar = "Multisense_Search_Connection"; szLocatorVar1 =
	 * "Multisense_Search_Connection_AllowSimulataneousConnection"; } else if
	 * (CriteriaName.equalsIgnoreCase("Connection CommunicationPortPool")) {
	 * szLocatorVar = "Multisense_Search_Connection"; szLocatorVar1 =
	 * "Multisense_Search_Connection_CommunicationPortPool"; } else if
	 * (CriteriaName.equalsIgnoreCase("Connection Direction")) { szLocatorVar =
	 * "Multisense_Search_Connection"; szLocatorVar1 =
	 * "Multisense_Search_Connection_Direction"; } else if
	 * (CriteriaName.equalsIgnoreCase("Connection Name")) { szLocatorVar =
	 * "Multisense_Search_Connection"; szLocatorVar1 =
	 * "Multisense_Search_Connection_Name"; } else if
	 * (CriteriaName.equalsIgnoreCase("Connection Status")) { szLocatorVar =
	 * "Multisense_Search_Connection"; szLocatorVar1 =
	 * "Multisense_Search_Connection_Status"; } else if
	 * (CriteriaName.equalsIgnoreCase("DeviceAttributes ModelNumber")) {
	 * szLocatorVar = "Multisense_Search_DeviceAttribute"; szLocatorVar1 =
	 * "Multisense_Search_DeviceAttribute_ModelNo"; } else if
	 * (CriteriaName.equalsIgnoreCase("DeviceAttributes ModelVersion")) {
	 * szLocatorVar = "Multisense_Search_DeviceAttribute"; szLocatorVar1 =
	 * "Multisense_Search_DeviceAttribute_ModelVersion"; } else if
	 * (CriteriaName.equalsIgnoreCase("DeviceAttributes Manufacturer")) {
	 * szLocatorVar = "Multisense_Search_DeviceAttribute"; szLocatorVar1 =
	 * "Multisense_Search_DeviceAttribute_Manufacturer"; } else if
	 * (CriteriaName.equalsIgnoreCase("DeviceAttributes Yearofcertification")) {
	 * szLocatorVar = "Multisense_Search_DeviceAttribute"; szLocatorVar1 =
	 * "Multisense_Search_DeviceAttribute_YrOfCertificate"; } else if
	 * (CriteriaName.equalsIgnoreCase("Estimation Dataestimation")) { szLocatorVar =
	 * "Multisense_Search_Estimation"; szLocatorVar1 =
	 * "Multisense_Search_Estimation_DataEstimation"; } else if
	 * (CriteriaName.equalsIgnoreCase("Loadprofile Name")) { szLocatorVar =
	 * "Multisense_Search_LoadProfile"; szLocatorVar1 =
	 * "Multisense_Search_LoadProfile_Name"; } else if
	 * (CriteriaName.equalsIgnoreCase("Logbook Name")) { szLocatorVar =
	 * "Multisense_Search_Logbook"; szLocatorVar1 =
	 * "Multisense_Search_Logbook_Name"; } else if
	 * (CriteriaName.equalsIgnoreCase("Logbook OBISCode")) { szLocatorVar =
	 * "Multisense_Search_Logbook"; szLocatorVar1 =
	 * "Multisense_Search_Logbook_OBISCode"; } else if
	 * (CriteriaName.equalsIgnoreCase("Register OBISCode")) { szLocatorVar =
	 * "Multisense_Search_Register"; szLocatorVar1 =
	 * "Multisense_Search_Register_OBISCode"; } else if
	 * (CriteriaName.equalsIgnoreCase("Register RegisterTypeName")) { szLocatorVar =
	 * "Multisense_Search_Register"; szLocatorVar1 =
	 * "Multisense_Search_Register_Name"; }
	 * DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.
	 * ofSeconds(60)); WebElement addCriteria =
	 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
	 * "Multisense_Search_addCriteria")));
	 * TestUtil.waitforElementTobeLocated(addCriteria,30); doClick(addCriteria);
	 * waitForTime(5000);
	 * if((CriteriaName.equalsIgnoreCase("CONNECTION METHOD"))||(CriteriaName.
	 * equalsIgnoreCase("MRID"))||(CriteriaName.equalsIgnoreCase("SHARED SCHEDULE"))
	 * ) { DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.
	 * ofSeconds(60)); WebElement OptionConnectionMethod =
	 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szLocatorVar)
	 * )); TestUtil.waitforElementTobeLocated(OptionConnectionMethod,30);
	 * doClick(OptionConnectionMethod); waitForTime(5000); } else { Actions action =
	 * new Actions(DriverUtility.getDriver()); WebElement Multisense_Search_Channel
	 * =
	 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szLocatorVar)
	 * )); TestUtil.waitforElementTobeLocated(Multisense_Search_Channel,10);
	 * action.moveToElement(Multisense_Search_Channel).build().perform();
	 * waitForTime(2000); WebElement Multisense_Search_Interval =
	 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szLocatorVar1
	 * ))); TestUtil.waitforElementTobeLocated(Multisense_Search_Interval,10);
	 * waitForTime(2000);
	 * action.moveToElement(Multisense_Search_Interval).click().build().perform();
	 * waitForTime(5000); action.sendKeys(Keys.ESCAPE).build().perform();
	 * waitForTime(5000); action.sendKeys(Keys.ESCAPE).build().perform();
	 * waitForTime(5000); }
	 * 
	 * }
	 */
	public void AddCriteria(String szMenuXPath,String szSubMenuXPath)
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement addCriteria = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_addCriteria")));
		TestUtil.waitforElementTobeLocated(addCriteria,30);
		doClick(addCriteria);
		waitForTime(5000);
		if(szSubMenuXPath.equalsIgnoreCase(""))
		{
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			WebElement OptionConnectionMethod = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szMenuXPath)));
			TestUtil.waitforElementTobeLocated(OptionConnectionMethod,30);
			doClick(OptionConnectionMethod);
			waitForTime(5000);	
		}
		else
		{
			Actions action = new Actions(DriverUtility.getDriver());
			WebElement Multisense_Search_Channel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szMenuXPath)));
			TestUtil.waitforElementTobeLocated(Multisense_Search_Channel,10);
			action.moveToElement(Multisense_Search_Channel).build().perform();
			waitForTime(2000);
			WebElement Multisense_Search_Interval = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szSubMenuXPath)));
			TestUtil.waitforElementTobeLocated(Multisense_Search_Interval,10);
			waitForTime(2000);
			action.moveToElement(Multisense_Search_Interval).click().build().perform();
			waitForTime(5000);
			action.sendKeys(Keys.ESCAPE).build().perform();
			waitForTime(5000);
			action.sendKeys(Keys.ESCAPE).build().perform();		
			waitForTime(5000);			
		}
		
	}	
	public void OpenDevicePage(String nRow,String MenutoSelect,String SubMenutoSelect)
	{
		String Xpath;
		Xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + nRow + "]/td[1]/div/a";
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		WebElement EleName = DriverUtility.getDriver().findElement(By.xpath(Xpath));
		TestUtil.waitforElementTobeLocated(EleName,30);
		doClick(EleName);
		waitForTime(5000);
		if (!(MenutoSelect.equalsIgnoreCase("")))
		{
			if (isDisplayed(MenutoSelect) == true)
			{
				waitForTime(5000);
				WebElement Menu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(MenutoSelect)));
				TestUtil.waitforElementTobeLocated(Menu,30);
				doClick(Menu);
				waitForTime(5000);
			}		
			
		}
		if (!(SubMenutoSelect.equalsIgnoreCase("")))
		{
			if (isDisplayed(SubMenutoSelect) == true)
			{
				waitForTime(5000);
				WebElement SubMenu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(SubMenutoSelect)));
				TestUtil.waitforElementTobeLocated(SubMenu,30);
				doClick(SubMenu);
				waitForTime(5000);
			}		
			
		}	
		
	}
	public String DevicePageDetails(String szItemtoLook)
	{
		String szAttributeValString="";
		/*
		 * if (szItemtoLook.equalsIgnoreCase("MRID"))
		 * Xpath="MultiSense_Devices_DeviceAttribute_MRIDText"; else if
		 * (szItemtoLook.equalsIgnoreCase("Connection type"))
		 * Xpath="MultiSense_Devices_ConnectionMethods_ConnectionTypeText"; else if
		 * (szItemtoLook.equalsIgnoreCase("Channel OBISCode"))
		 * Xpath="MultiSense_Devices_Channels_OBISCodeText"; else if
		 * (szItemtoLook.equalsIgnoreCase("CommunicationTask ScheduleType"))
		 * Xpath="MultiSense_Devices_CommunicationTask_ScheduleTypeHeaderText";
		 */		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szItemtoLook)));
		TestUtil.waitforElementTobeLocated(SearchEle,30);
		 szAttributeValString = SearchEle.getText();
		return szAttributeValString;
	}
	public String DevicePageDetailsFromTable( String szColumn)
	{
		String szAttributeValString="";
		String Xpath="";
		String Xpath_Count="";
		String szText="";
		//if ((szItemtoLook.equalsIgnoreCase("Shared Schedule"))||(szItemtoLook.equalsIgnoreCase("Channels"))||(szItemtoLook.equalsIgnoreCase("Communication tasks"))||(szItemtoLook.equalsIgnoreCase("CommunicationTask NextCommunication")))
		Xpath_Count="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr";
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		if (!(isDisplayed_ByXpath(Xpath_Count)))
			return "NO TABLE FOUND";
			
		int nRowCount = DriverUtility.getDriver().findElements(By.xpath(Xpath_Count)).size();
		
		for(int count = 1; count <= nRowCount; count++)
		{
			Xpath = "//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + count + "]/td[" + szColumn + "]/div";
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(Xpath));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			
			if(count == 1)
			{
				szText = SearchEle.getText();
				if(!(szText.contentEquals("-")))
					szAttributeValString = szAttributeValString.concat(szText);
			}
			else
			{
				szText = SearchEle.getText();
				if(!(szText.contentEquals("-")))
				{
				szAttributeValString = szAttributeValString.concat(",");
				szAttributeValString = szAttributeValString.concat(szText);
				}
			}
				
		}
		
		return szAttributeValString;
	}
	public String DevicePageTableDetails(String szItemtoLook)
	{
		String szAttributeValString="";
		String Xpath="";
		String Xpath_Count="";
		String szText="";
		
		Xpath_Count="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr";
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		int nRowCount = DriverUtility.getDriver().findElements(By.xpath(Xpath_Count)).size();
		
		for(int count = 1; count <= nRowCount; count++)
		{
			Xpath = "//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + count + "]/td[" + 2 + "]/div";
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(Xpath));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			doClick(SearchEle);
			waitForTime(5000);
			
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			SearchEle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szItemtoLook)));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			if(count == 1)
			{
				szText = SearchEle.getText();
				if(!(szText.contentEquals("-")))
					szAttributeValString = szAttributeValString.concat(szText);
			}
			else
			{
				szText = SearchEle.getText();
				if(!(szText.contentEquals("-")))
				{
				szAttributeValString = szAttributeValString.concat(",");
				szAttributeValString = szAttributeValString.concat(szText);
				}
			}
				
		}
		
		return szAttributeValString;
	}
	public String ReadDevicePageRegister_IconInfoDetails(String szItemtoLook)
	{
		String szAttributeValString="";
		String Xpath="";
		String Xpath_Count="";
		String szText="";
		
		Xpath_Count="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr";
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		int nRowCount = DriverUtility.getDriver().findElements(By.xpath(Xpath_Count)).size();
		
		for(int count = 1; count <= nRowCount; count++)
		{
			Xpath = "//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr[" + count + "]/td[" + 2 + "]/div";
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement SearchEle = DriverUtility.getDriver().findElement(By.xpath(Xpath));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			doClick(SearchEle);
			waitForTime(5000);
			
			//";
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			SearchEle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSense_Devices_Registers_CollectReadingTypeIconInfo")));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			doClick(SearchEle);
			waitForTime(5000);
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			SearchEle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(szItemtoLook)));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			
			if(count == 1)
			{
				szText = SearchEle.getText();
				if(!(szText.contentEquals("-")))
					szAttributeValString = szAttributeValString.concat(szText);
			}
			else
			{
				szText = SearchEle.getText();
				if(!(szText.contentEquals("-")))
				{
				szAttributeValString = szAttributeValString.concat(",");
				szAttributeValString = szAttributeValString.concat(szText);
				}
			}
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			SearchEle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSense_Devices_Registes_PopupClose")));
			TestUtil.waitforElementTobeLocated(SearchEle,30);
			doClick(SearchEle);
			waitForTime(5000);
				
		}
		
		return szAttributeValString;
	}
	public void GobacktoSearchPage()
	{
		while(!(isDisplayed("Multisense_Search_PageHeader")))
		{
			DriverUtility.getDriver().navigate().back();
			waitForTime(5000);
		}	
		
	}
	public boolean ValidateAdvanceSearch(String CriteriaName,String ValidateString)
	{
		boolean bResult=true;

		
		if (isDisplayed("Multisense_Search_NoSearchResult"))
		{
			if((((CriteriaName.equalsIgnoreCase("Connection AllowSimulataneousConnection"))&&(ValidateString.contains("NO")))||((CriteriaName.equalsIgnoreCase("Connection Status")))&&(ValidateString.contains("!=:"))))
				return true;
			else
				return false;			
		}	
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		WebElement eleSearchResultCount = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleResultCount")));
		TestUtil.waitforElementTobeLocated(eleSearchResultCount,30);
		int nCount=Integer.parseInt(eleSearchResultCount.getText());
		String[] Criteria = ValidateString.split(":");
		String CriteriaCond,CriteriaVal;
		if (Criteria.length==1)
		{
			CriteriaCond = Criteria[0];
			CriteriaVal = "";
		}
		else
		{
			CriteriaCond = Criteria[0];
			CriteriaVal = Criteria[1];
		}
		if(CriteriaCond.equalsIgnoreCase("IN")) //E.g. IN:SPE01000001;SPE01000002
		{
			String[] szItemstoValidate= CriteriaVal.split(";");
			if(nCount != szItemstoValidate.length)
				bResult = false;
			else
			{
				for(int count = 0; count < szItemstoValidate.length; count++)
				{		
					String szRow = Integer.toString(count+1);
					String szText="";
					if(CriteriaName.equalsIgnoreCase("MRID"))
					{
						OpenDevicePage(szRow,"MultiSense_Devices_DeviceAttributeMenu","");
						szText =DevicePageDetails(CriteriaName);
					}
					else if(CriteriaName.equalsIgnoreCase("Connection Method"))
					{
						OpenDevicePage(szRow,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
						 szText =DevicePageDetails("MultiSense_Devices_ConnectionMethods_ConnectionTypeText");
					}									
					GobacktoSearchPage();
					
					if(check(szItemstoValidate,szText))					
						bResult = bResult && true;					
					else
						bResult = bResult && false;
				}				
			}			
		}
		/*
		 * else if(Criteria[0].equalsIgnoreCase("BETWEEN")) { String[]
		 * szItemstoValidate= Criteria[1].split(";");
		 * 
		 * String RowstoValidate; if (nCount >=10) RowstoValidate= "1,5,10"; else if
		 * ((nCount >=3)&& (nCount <10)) RowstoValidate= "1,2,3"; else if ((nCount
		 * >=1)&& (nCount <3)) RowstoValidate= "1"; else { bResult = false; return
		 * bResult; } String[] RowstoValidateArray = RowstoValidate.split(","); for(int
		 * count = 0; count < RowstoValidateArray.length; count++) { String szText="";
		 * if(CriteriaName.equalsIgnoreCase("CommunicationTask NextCommunication")) {
		 * OpenDevicePage(RowstoValidateArray[count],"Communication Tasks"); szText =
		 * DevicePageDetailsFromTable("5"); bResult = bResult &&
		 * CompareText(Criteria[0],Criteria[1],szText); } else
		 * if(CriteriaName.equalsIgnoreCase("CommunicationTask PlannedDate")) {
		 * OpenDevicePage(RowstoValidateArray[count],"Communication planning"); szText =
		 * DevicePageDetailsFromTable("4"); bResult = bResult &&
		 * CompareText(Criteria[0],Criteria[1],szText); } GobacktoSearchPage();
		 * 
		 * } }
		 */
		else
		{
			if((nCount != 1)&&(CriteriaName.equalsIgnoreCase("MRID")&&(CriteriaCond.equalsIgnoreCase("="))))
				bResult = false;
			else			
			{
				String RowstoValidate;
				if (nCount >=10)		
					RowstoValidate= "1,5,10";
				else if ((nCount >=3)&& (nCount <10))
					RowstoValidate= "1,2,3";
				else if ((nCount >=1)&& (nCount <3))
					RowstoValidate= "1";
				else
				{
					bResult = false;
					return bResult;
				}			
				String[] RowstoValidateArray = RowstoValidate.split(",");
				for(int count = 0; count < RowstoValidateArray.length; count++)
				{
					bResult = bResult && ValidateAdvSearchFromDevPage(CriteriaName,RowstoValidateArray[count],CriteriaCond,CriteriaVal);
					GobacktoSearchPage();								
				}		
			}
		}
		return bResult;
	}
	public boolean ValidateAdvSearchFromDevPage(String CriteriaName,String RowtoValidate,String CriteriaType,String CriteriaVal)
	{
		String szText = "";
		boolean bResult=true;
		if(CriteriaName.equalsIgnoreCase("MRID"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_MRIDText");
			bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Connection Method"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
			szText = DevicePageDetailsFromTable("4");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal,szText,true);
		}
		else if((CriteriaName.equalsIgnoreCase("Shared schedule")))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationPlanningSubMenu");
			// szText =DevicePageDetails("Communication planning");
			szText = DevicePageDetailsFromTable("3");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Channel Interval"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_ChannelsSubMenu");
			// szText =DevicePageDetails("Communication planning");
			szText = DevicePageDetailsFromTable("2");
			if(!(CriteriaVal.contains("(s)")))
			CriteriaVal = CriteriaVal.toString().substring(0,CriteriaVal.length()-1).concat("(s)");
			bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Channel OBISCOde"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_ChannelsSubMenu");
			//szText =DevicePageDetails(CriteriaName);
			szText =DevicePageTableDetails("MultiSense_Devices_Channels_OBISCodeText");
			bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("communicationTask Name"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationTasksSubMenu");
			// szText =DevicePageDetails("Communication planning");
			szText = DevicePageDetailsFromTable("1");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("CommunicationTask ScheduleName"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationTasksSubMenu");
			// szText =DevicePageDetails("Communication planning");
			szText = DevicePageDetailsFromTable("3");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("CommunicationTask ScheduleType"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationTasksSubMenu");
			 szText =DevicePageTableDetails("MultiSense_Devices_CommunicationTask_ScheduleType");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal + " schedule",szText,true);
		}
		///////
		else if(CriteriaName.equalsIgnoreCase("Connection AllowSimulataneousConnection"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
			String Xpath_Count="//div[@class='x-grid-view x-fit-item x-grid-view-default']//tr";						
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			int nRowCount = DriverUtility.getDriver().findElements(By.xpath(Xpath_Count)).size();
			if ((nRowCount >=1) && (CriteriaType.equalsIgnoreCase("YES")))
				bResult = bResult && true;
			else 
				bResult = bResult && false;
		}
		else if(CriteriaName.equalsIgnoreCase("Connection CommunicationPortPool"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
			 szText =DevicePageTableDetails("MultiSense_Devices_Connection_CommunicationPortpool");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Connection Direction"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
			 szText =DevicePageDetailsFromTable("3");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Connection Name"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
			 szText =DevicePageDetailsFromTable("2");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal ,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Connection Status"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_ConnectionMethodsSubMenu");
			 szText =DevicePageDetailsFromTable("5");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		/////////////////////////////////////////////////
		else if(CriteriaName.equalsIgnoreCase("DeviceAttributes Manufacturer"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			 szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_ManufacturerText");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("DeviceAttributes ModelNumber"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			 szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_ModelNoText");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("DeviceAttributes ModelVersion"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			 szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_ModelVersionText");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("DeviceAttributes Yearofcertification"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			 szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_YrOfCertificateText");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Estimation Dataestimation"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_LoadProfilesSubMenu");
			szText =DevicePageTableDetails("MultiSense_Devices_LoadProfiles_DevicevalidationstatusText");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal ,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Loadprofile Name"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_LoadProfilesSubMenu");
			 szText =DevicePageDetailsFromTable("1");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal ,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Logbook Name"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_LogbooksSubMenu");
			 szText =DevicePageDetailsFromTable("1");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal ,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Logbook OBISCode"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_LogbooksSubMenu");
			 szText =DevicePageDetailsFromTable("2");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal ,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Register OBISCode"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_RegistersSubMenu");
			szText =DevicePageTableDetails("MultiSense_Devices_Registers_OBISCodeText");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal ,szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Register RegisterTypeName"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_RegistersSubMenu");
			 szText =DevicePageDetailsFromTable("1");
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,CriteriaVal ,szText,false);
		}
		else if(CriteriaName.equalsIgnoreCase("Register RegisterTypeUnitofmeasure"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DataSourcesMenu","MultiSense_Devices_RegistersSubMenu");
			 szText =ReadDevicePageRegister_IconInfoDetails("MultiSense_Devices_Registers_UnitofMeasureText");
			 if (CriteriaType.equalsIgnoreCase("="))
				 CriteriaType = "contains";
			 else
				 CriteriaType = "notcontains";
			 bResult = bResult && MatchAnyOneamongAll(CriteriaType,"(" + CriteriaVal + ")",szText,false);
		}
		else if(CriteriaName.equalsIgnoreCase("CommunicationTask NextCommunication"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationTasksSubMenu");
			szText = DevicePageDetailsFromTable("5");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("CommunicationTask PlannedDate"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationPlanningSubMenu");
			szText = DevicePageDetailsFromTable("4");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Security HasServiceKey"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_SecuritySetsSubMenu");
			szText = DevicePageDetailsFromTable("1");
			if(szText.equalsIgnoreCase("NO TABLE FOUND"))
				bResult = bResult && true;
			else
				bResult = bResult && MatchAnyOneamongAll("=","no security",szText,true);
		}
		else if(CriteriaName.equalsIgnoreCase("Topology HasMasterDevice"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationTopologySubMenu");
			if(CriteriaType.toString().equalsIgnoreCase("YES"))
				CriteriaType = "=";
			else
				CriteriaType = "!=";
			if ((isDisplayed("Multisense_Devices_NoSlavesText")) && (CriteriaType.equalsIgnoreCase("!=")))
				bResult = bResult && true;
			else if ((isDisplayed("Multisense_Devices_NoSlavesText")) && (CriteriaType.equalsIgnoreCase("=")))
				bResult = bResult && false;
			else
			{
				szText =DevicePageDetails("MultiSense_Devices_CommunicationTopology_MasterLabel");
			
				bResult = bResult && CompareText(CriteriaType,"MASTER",szText);
			}
		}
		else if(CriteriaName.equalsIgnoreCase("Topology SlaveDevice"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_CommunicationMenu","MultiSense_Devices_CommunicationTopologySubMenu");
			if (isDisplayed("Multisense_Devices_NoSlavesText"))
				bResult = bResult && false;
			else
			{
			szText =DevicePageDetails("MultiSense_Devices_CommunicationTopology_SlavesLabel");
			bResult = bResult && CompareText(CriteriaType,"Slaves",szText);
			}
		}
		else if(CriteriaName.equalsIgnoreCase("Transition Installationdate"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_InstallationDateText");
			 bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		else if(CriteriaName.equalsIgnoreCase("Transition Shipmentdate"))
		{
			OpenDevicePage(RowtoValidate,"MultiSense_Devices_DeviceAttributeMenu","");
			szText =DevicePageDetails("MultiSense_Devices_DeviceAttribute_ShipmentDateText");
			bResult = bResult && CompareText(CriteriaType,CriteriaVal,szText);
		}
		return bResult;
	}
	public boolean CompareText(String Criteriatype, String Criteria, String ActualStrings)
	{
		boolean bResult=true;
		String ActualStringArr[] = ActualStrings.split(",");
		for(int i=0; i<ActualStringArr.length;i++)
		{
			if ((ActualStringArr[i].equalsIgnoreCase("-"))||(ActualStringArr[i].equalsIgnoreCase("")))
				continue;
			if(Criteriatype.equalsIgnoreCase("!="))
			{
				if (Criteria.contains("*")) {
					String StringtoValidate = Criteria.replace("*","");
					if (ActualStringArr[i].startsWith(StringtoValidate)==false)
					{
						bResult = bResult && true;
					}
					else
						bResult =  bResult && false;
				}
				else
				{
					if (ActualStringArr[i].equalsIgnoreCase(Criteria)==false)
					{
						bResult =  bResult &&  true;
					}
					else
						bResult =  bResult &&  false;
				}
			}
			else if(Criteriatype.equalsIgnoreCase("BETWEEN"))
			{
				String Dates[] = Criteria.split(";");
				String szFromdate;
				String szTodate;
				Date Fromdate=new Date();
				Date Todate=new Date();
				SimpleDateFormat dFormat = new SimpleDateFormat("dd MMM yy");
		        Date date = new Date();
		         szFromdate = Dates[0];	
		         szTodate= Dates[1];	
		        //create instance of the Calendar class and set the date to the given date  
		        Calendar cal = Calendar.getInstance(); 	          
		         
		        // use add() method to add the days to the given date  
		        if (szTodate.contains("TODAY+"))
		        {
		        	cal.add(Calendar.DAY_OF_MONTH, 1); 
		        	szTodate = dFormat.format(cal.getTime());
		        }
		        else if (szTodate.contains("TODAY-"))
		        {
		        	cal.add(Calendar.DAY_OF_MONTH, -1);
		        	szTodate = dFormat.format(cal.getTime());
		        }
		        else if (szTodate.equalsIgnoreCase("TODAY"))
		        	szTodate = dFormat.format(date);
		       		        
		        if (szFromdate.contains("TODAY+"))
		        {
		        	cal.add(Calendar.DAY_OF_MONTH, 1); 
		        	szFromdate = dFormat.format(cal.getTime());
		        }
		        else if (szFromdate.contains("TODAY-"))
		        {
		        	cal.add(Calendar.DAY_OF_MONTH, -1);
		        	szFromdate = dFormat.format(cal.getTime());
		        }
		        else if (szFromdate.equalsIgnoreCase("TODAY"))
		        	szFromdate = dFormat.format(date);	       
		        
		                        
		        try {
					Fromdate =dFormat.parse(szFromdate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					Todate = dFormat.parse(szTodate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        String StringtoValidate="";
		        if (ActualStringArr[i].length() == 19)
		        {
		        	StringtoValidate = ActualStringArr[i].replace(" at "," ").replace("'","");
					StringtoValidate = StringtoValidate.toString();
		        }
		        else
		        {
				StringtoValidate = ActualStringArr[i].replace(" at "," ").replace("'","");
				StringtoValidate = StringtoValidate.substring(4, StringtoValidate.length());
				StringtoValidate = StringtoValidate.toString();
		        }
				Date DatetoValidate=new Date();
				try {
					DatetoValidate = dFormat.parse(StringtoValidate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				bResult = bResult && DatetoValidate.equals(Fromdate) || (DatetoValidate.after(Fromdate) && DatetoValidate.before(Todate)) || DatetoValidate.equals(Todate);
				
			}
			else
			{
				if (Criteria.contains("*")) {
					String StringtoValidate = Criteria.replace("*","");
					if (ActualStringArr[i].startsWith(StringtoValidate)==false)
					{
						bResult = bResult &&  true;
					}
					else
						bResult =  bResult && false;
				}
				else
				{
					String StringtoValidate="";
					if (!(Criteria.toString().contains("(s)")))
					{
						StringtoValidate = Criteria.split("\\(")[0];
					}
					else
						StringtoValidate = Criteria;
					if (ActualStringArr[i].equalsIgnoreCase(StringtoValidate))
					{
						bResult =  bResult &&  true;
					}
					else
						bResult =  bResult &&  false;
				}	
			}
		}
		return bResult;
	}
	public boolean MatchAnyOneamongAll(String Criteriatype, String Criteria, String ActualStrings,boolean IgnoreBrackets)
	{
		boolean bResult=false;
		String StringtoValidate;
		String ActualStringArr[] = ActualStrings.split(",");
		if (IgnoreBrackets == true)
			StringtoValidate = Criteria.split("\\(")[0];
		else
			StringtoValidate = Criteria;
		
		for(int i=0; i<ActualStringArr.length;i++)
		{			
			
			if(Criteriatype.equalsIgnoreCase("="))
			{
				if (ActualStringArr[i].equalsIgnoreCase(StringtoValidate))			
					bResult =  bResult ||  true;			
				else
					bResult =  bResult ||  false;
			}
			else if(Criteriatype.equalsIgnoreCase("!="))
			{
				if (ActualStringArr[i].equalsIgnoreCase(StringtoValidate)==false)			
					bResult =  bResult ||  true;			
				else
					bResult =  bResult ||  false;
			}
			else if(Criteriatype.equalsIgnoreCase("Contains"))
			{
				if (ActualStringArr[i].toString().contains(StringtoValidate)==true)			
					bResult =  bResult ||  true;			
				else
					bResult =  bResult ||  false;
			}
			else if(Criteriatype.equalsIgnoreCase("NotContains"))
			{
				if (ActualStringArr[i].toString().contains(StringtoValidate)==true)			
					bResult =  bResult ||  true;			
				else
					bResult =  bResult ||  false;
			}
			
		}
		return bResult;
	}
	public Boolean isDisplayed_ByXpath(String xpath)
	{
		WebDriverWait wait;

		wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(2));

		try 
		{
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

			return element.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void SelectDatefromDatePicker(String szDate)
	{
		//Multisense_Search_eleFromDatePicker
		/*SimpleDateFormat dFormat = new SimpleDateFormat("dd-MMM-yy HH-mm-ss");
        Date date = new Date();
        dFormat.format(date);
        LocalDate.now().plusDays(7)*/
		if (szDate.equalsIgnoreCase("TODAY"))
		{
			String Today = "//span[@class='x-btn-inner x-btn-inner-center'][normalize-space()='Today']/parent::span";
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement OptionforMonYearSel = DriverUtility.getDriver().findElement(By.xpath(Today));
			if (!(isDisplayed_ByXpath(Today)))
				OptionforMonYearSel = DriverUtility.getDriver().findElements(By.xpath(Today)).get(1);
			TestUtil.waitforElementTobeLocated(OptionforMonYearSel,30);
			doClick(OptionforMonYearSel);
			waitForTime(2000);
		}
		else
		{//dd MMM yy
			String date_dd_MMM_yyyy[] = szDate.toString().split(" ");
			int Dt = Integer.parseInt(date_dd_MMM_yyyy[0]);
			String day = "//td[@class='x-datepicker-active x-datepicker-cell']/a[normalize-space()='" + Integer.toString(Dt) + "']";
			String MonYear="//a[@class='x-btn x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'][contains(@id,'splitbutton')]";
			String Month="//div[@class='x-monthpicker-item x-monthpicker-month']/a[normalize-space()='" + date_dd_MMM_yyyy[1] + "']";
			String Year="//div[@class='x-monthpicker-item x-monthpicker-year']/a[normalize-space()='" + date_dd_MMM_yyyy[2] + "']";
			String OKBtn = "//div[@class=\"x-monthpicker-buttons\"]//span[normalize-space()='OK']";
			
			
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement OptionforMonYearSel = DriverUtility.getDriver().findElement(By.xpath(MonYear));
			if (!(isDisplayed_ByXpath(MonYear)))
				OptionforMonYearSel = DriverUtility.getDriver().findElements(By.xpath(MonYear)).get(1);
			TestUtil.waitforElementTobeLocated(OptionforMonYearSel,30);
			doClick(OptionforMonYearSel);
			waitForTime(2000);
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement EleMonYrSel = DriverUtility.getDriver().findElement(By.xpath(Year));
			TestUtil.waitforElementTobeLocated(EleMonYrSel,30);
			doClick(EleMonYrSel);
			waitForTime(2000);
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			EleMonYrSel = DriverUtility.getDriver().findElement(By.xpath(Month));
			TestUtil.waitforElementTobeLocated(EleMonYrSel,30);
			doClick(EleMonYrSel);
			waitForTime(2000);
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement EleOKBtn = DriverUtility.getDriver().findElement(By.xpath(OKBtn));
			TestUtil.waitforElementTobeLocated(EleOKBtn,30);
			doClick(EleOKBtn);
			waitForTime(2000);
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
			WebElement EleDay = DriverUtility.getDriver().findElement(By.xpath(day));
			if (!(isDisplayed_ByXpath(day)))
				 EleDay = DriverUtility.getDriver().findElements(By.xpath(day)).get(1);
			TestUtil.waitforElementTobeLocated(EleDay,30);
			doClick(EleDay);
			waitForTime(2000);
		}
		
		/*
		 * Actions action = new Actions(DriverUtility.getDriver());
		 * action.sendKeys(Keys.ESCAPE).build().perform(); waitForTime(1000);
		 */
		
	}
	public void clickonCriteria_DateFilter(String Criteria, String CriteriaVal) 
	{
		if(!Criteria.equalsIgnoreCase("NA"))
		{
			/*SimpleDateFormat dFormat = new SimpleDateFormat("dd-MMM-yy HH-mm-ss");
	        Date date = new Date();
	        dFormat.format(date);
	        LocalDate.now().plusDays(7)*/
			WebElement eleName = null;
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			String Fromdate=(CriteriaVal.split(":")[1]).split(";")[0];
			String Todate=(CriteriaVal.split(":")[1]).split(";")[1];
			/*
			 * if(Criteria.equalsIgnoreCase("CommunicationTask NextCommunication")) Xpath =
			 * "Multisense_Search_eleCommunicationTask_NextCommunication"; else
			 * if(Criteria.equalsIgnoreCase("CommunicationTask PlannedDate")) Xpath =
			 * "Multisense_Search_eleCommunicationTask_PlannedDate";
			 */
					
				eleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(Criteria)));
				SimpleDateFormat dFormat = new SimpleDateFormat("dd MMM yyyy");
				Calendar cal;
		         
		        // use add() method to add the days to the given date  
		        if (Fromdate.contains("TODAY+"))
		        {
		        	 cal = Calendar.getInstance();
		        	cal.add(Calendar.DAY_OF_MONTH, 1); 
		        	Fromdate = dFormat.format(cal.getTime());
		        	
		        }
		        else if (Fromdate.contains("TODAY-"))
		        {
		        	cal = Calendar.getInstance();
		        	cal.add(Calendar.DAY_OF_MONTH, -1);	
		        	Fromdate = dFormat.format(cal.getTime());		        	
		        } 
		        	        	
		        
		        //create instance of the Calendar class and set the date to the given date  
		         	          
		         
		        // use add() method to add the days to the given date  
		        if (Todate.contains("TODAY+"))
		        {cal = Calendar.getInstance(); 
		        	cal.add(Calendar.DAY_OF_MONTH, 1); 
		        	 Todate = dFormat.format(cal.getTime());
		        }
		        else if (Todate.contains("TODAY+"))
		        {cal = Calendar.getInstance(); 
		        	cal.add(Calendar.DAY_OF_MONTH, -1);
		        	 Todate = dFormat.format(cal.getTime());
		        }	        
		        
					
			
			TestUtil.waitforElementTobeLocated(eleName,30);
			doClick(eleName);
			waitForTime(2000);		
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			eleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleFromDatePicker")));
			TestUtil.waitforElementTobeLocated(eleName,30);
			doClick(eleName);
			waitForTime(2000);	
			
			SelectDatefromDatePicker(Fromdate);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			eleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleToDatePicker")));
			TestUtil.waitforElementTobeLocated(eleName,30);
			doClick(eleName);
			waitForTime(2000);	
			
			SelectDatefromDatePicker(Todate);
			
			Actions action = new Actions(DriverUtility.getDriver());		
			action.sendKeys(Keys.ESCAPE).build().perform();
			waitForTime(1000);	
			
		}
	}
	public String fetchSelectedLocation(String CriteriaXPath)
	{
		WebElement eleName = null;
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		eleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(CriteriaXPath)));
				
		TestUtil.waitforElementTobeLocated(eleName,30);
		doClick(eleName);
		waitForTime(2000);		
		String XPath;
		String szText="";
		XPath = "//div[@class='x-grid-cell-inner '][1]";
		if (isDisplayed_ByXpath(XPath))
		{						
			eleName = DriverUtility.getDriver().findElement(By.xpath(XPath));
			TestUtil.waitforElementTobeLocated(eleName,30);
			szText =  eleName.getText();
			Actions action = new Actions(DriverUtility.getDriver());		
			action.sendKeys(Keys.ESCAPE).build().perform();
			waitForTime(1000);
		}
		return szText;
	}
}
