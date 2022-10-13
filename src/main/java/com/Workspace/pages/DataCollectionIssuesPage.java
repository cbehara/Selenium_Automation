package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class DataCollectionIssuesPage  extends TestBase{			
	Logger log = LogManager.getLogger(DataCollectionIssuesPage.class);
	public DataCollectionIssuesPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickDataCollectionIssues()
	{
		waitForTime(3000);
		WebElement DataCollectionIssues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DataCollectionIssues")));
		TestUtil.waitforElementTobeLocated(DataCollectionIssues, 10);
		doClick(DataCollectionIssues);
	} 

	public void ChangeDropdownperpage()
	{
		waitForTime(3000);
		WebElement DataCollectionIssuesPerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIPerpageDropDown")));
		doClick(DataCollectionIssuesPerpageDropDown);
		waitForTime(3000);
		WebElement DataCollectionIssuesPerpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIPerpagevalue")));
		doClick(DataCollectionIssuesPerpagevalue);
	}
	public void ClickBlukAction()
	{
		waitForTime(30000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		WebElement DataCollectionIssuesBulkAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIBulkAction")));
		doClick(DataCollectionIssuesBulkAction);	
	}

	public void StepBulkAction()
	{


		WebElement DataCollectionIssuesSelectedIssueradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCISelectedIssueradioButton")));		
		doClick(DataCollectionIssuesSelectedIssueradioButton);	
		waitForTime(20000);
		DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[5]")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]")).click();
		WebElement DataCollectionIssuesNextButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCINextButton")));
		doClickjavaScript(DataCollectionIssuesNextButton);

		waitForTime(3000);
		WebElement DataCollectionIssuesCloseIssueradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCICloseIssueradioButton")));
		doClick(DataCollectionIssuesCloseIssueradioButton);			
		doClick(DataCollectionIssuesNextButton);

		waitForTime(3000);
		WebElement DataCollectionIssuesResolvedRadioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIResolvedRadioButton")));
		doClick(DataCollectionIssuesResolvedRadioButton);		
		doClick(DataCollectionIssuesNextButton);		

	}

	public void FinshBulkAction()
	{
		waitForTime(3000);
		WebElement DataCollectionIssuesConfirmButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIConfirmButton")));
		doClick(DataCollectionIssuesConfirmButton);

		waitForTime(3000);
		WebElement DataCollectionIssuesFinishButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIFinishButton")));
		TestUtil.waitforElementTobeLocated(DataCollectionIssuesFinishButton, 10);
		doClick(DataCollectionIssuesFinishButton);
	}
	public void selectFilterAndValidateValue(String Field, String Webelement_prop,String ClearALLFilter) throws IOException, InterruptedException {
		if(ClearALLFilter=="ON") {
			click_ClearAllButton_IssueFilter();
			}
		String Field_str=TestUtil.readData("DataCollection",Field);
		WebElement InputWebelement=DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(Webelement_prop)));
		
		switch (Field) {
		case  "IssueID":
				TestUtil.waitforElementTobeLocated(InputWebelement , 10);
				sendkeys(Field_str, InputWebelement);
				break;	
		case "Device":
		case "Reason":
				TestUtil.waitforElementTobeLocated(InputWebelement , 10);
				sendkeys(Field_str, InputWebelement);
				WebElement Dropdownelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_Device").replaceAll("replacetext", Field_str)));
	            TestUtil.waitforElementTobeLocated(Dropdownelement , 10);
	            doClick(Dropdownelement);
	            break;
		case "User":
			if(Field_str.equalsIgnoreCase("Unassigned")) {
				TestUtil.waitforElementTobeLocated(InputWebelement , 20);
				doClick(InputWebelement);
				WebElement UserUnassigned = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_user_overview")));
				TestUtil.waitforElementTobeLocated(UserUnassigned , 20);
				Thread.sleep(10000);
				sendKeyMyCheck(UserUnassigned);
			}
			else if(!Field_str.equalsIgnoreCase("Unassigned")) {
				WebElement UserTextBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_User_TextBox")));
				TestUtil.waitforElementTobeLocated(UserTextBox , 20);
				sendkeys(Field_str, UserTextBox);
				String str =" "+Field_str+" ";
				WebElement UserNoTUnassigned = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_user_NOT_Unassigned").replaceAll("replacetext", str)));
				Thread.sleep(10000);
				sendKeyMyCheck(UserNoTUnassigned);
			}
			break;
		case  "Due date":
			TestUtil.waitforElementTobeLocated(InputWebelement , 10);
			sendkeys(Field_str, InputWebelement);
		case "Duedate":
		case "Status":
		case "Cleared":
		case "Workgroup":
		case "Devicegroup":
				TestUtil.waitforElementTobeLocated(InputWebelement , 10);
				doClick(InputWebelement);
				WebElement DropDownvalueSelection_Status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext", " "+Field_str)));
	            TestUtil.waitforElementTobeLocated(DropDownvalueSelection_Status , 10);
	            doClick(DropDownvalueSelection_Status);
	            break;
			
	case "Type":
		TestUtil.waitforElementTobeLocated(InputWebelement , 10);
		sendkeys(Field_str, InputWebelement);
		WebElement DropDownvalueSelection = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext", " "+Field_str)));
        TestUtil.waitforElementTobeLocated(DropDownvalueSelection , 10);
        doClick(DropDownvalueSelection);
        break;
	}
			click_ApplyButton_AlaramFilter();
			if(Field.equalsIgnoreCase("Duedate")) {
				DueDateValidation();
			}else {
			validateAlarmFilterValues(Field, Webelement_prop);
			}
			}
	public String generateTomorrow_DueDate() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		String date=new SimpleDateFormat("dd").format(c.getTime());
		String month=new SimpleDateFormat("MMM").format(c.getTime());
		String year=new SimpleDateFormat("YY").format(c.getTime());	
		String space =" ";
		String filler ="'";
		String Tomorrow_DueDate=date+space+month+space+filler+year;
		return Tomorrow_DueDate;
	}
	public void DueDateValidation() {
		WebElement DueDateDisaplyed = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Duedate")));
		String ActualDueDate =DueDateDisaplyed.getText().trim();
		String ExpectedDueDate=generateTomorrow_DueDate();
		if(ExpectedDueDate.equalsIgnoreCase(ActualDueDate)) {
			System.out.println("Due Date is Mapping as expected");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public void validateAlarmFilterValues(String Field, String Webelement_prop) throws IOException, InterruptedException {
		String Field_str=TestUtil.readData("DataCollection",Field);
		WebElement Field_Webelement;
		if(Field.equalsIgnoreCase("Cleared")) {
			 Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_ClearedValue_displayed")));	
		}
		else if(Field.equalsIgnoreCase("Devicegroup")) {
			Field_str=TestUtil.readData("DataCollection","Device");
			Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Values_displayed").replaceAll("replacetext", Field_str)));	
		}
		else {
		 Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Values_displayed").replaceAll("replacetext", Field_str).trim()));
		}
		TestUtil.waitforElementTobeLocated( Field_Webelement, 10);
		HardAssertfunction(Field_Webelement, Field_str.trim());
	}

	public  void click_ApplyButton_AlaramFilter() throws InterruptedException {
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 20);
	doClickjavaScript(alrmdevselapply);
	}
	public  void click_ClearAllButton_IssueFilter() throws IOException {
		WebElement ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		TestUtil.waitforElementTobeLocated(ClearAllButton , 10);
		doClick(ClearAllButton);
		log.info("ClearAllButton");
	}
	public void clickAddSort() {
		WebElement AddSortWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_AddSortButton")));
		 TestUtil.waitforElementTobeLocated(AddSortWE , 10);
        doClick(AddSortWE);	
	}
	public void clickPriorityButton() {
 		WebElement PriorityWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_PriorityButton")));
		 TestUtil.waitforElementTobeLocated(PriorityWE , 10);
        doClick(PriorityWE);
        }
	public void clickPriorityChange() {		
 		WebElement PriorityChange = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_PriorityChange")));
		 TestUtil.waitforElementTobeLocated(PriorityChange , 10);
        doClickjavaScript(PriorityChange);
        } 
	
	public List<Integer> getPriorities() {
		List<Integer> Priorities = new ArrayList();
		HashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
		List<WebElement> PrioritiesWE= DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Priorities")));
		int n=PrioritiesWE.size();
		for(int i =1;i<=n;i++) {
			String istr=Integer.toString(i);
			WebElement Priority = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Priority").replaceAll("replacetext", istr)));
			String prioritystr=Priority.getText();
		if(prioritystr.contains("Very high")) {
			hm.put(prioritystr, 4);
			}
		if(prioritystr.contains("High")) {
			hm.put(prioritystr, 3);
			}
		if(prioritystr.contains("Medium")) {
			hm.put(prioritystr, 2);
			}
		if(prioritystr.contains("Low")) {
			hm.put(prioritystr, 1);
			}
		}
		for(Entry<String, Integer> entry: hm.entrySet()) {
			Priorities.add(entry.getValue());
		}
		return Priorities;
	}
		public void validatePriorityListIncreasing() {
		List<Integer> PrioriesList =getPriorities();
		List<Integer> sortedPriority = PrioriesList.stream().sorted().collect(Collectors.toList());
		if(PrioriesList.equals(sortedPriority)) {
			System.out.println("Priority Filter Working as Expected");
			System.out.println(PrioriesList);System.out.println(sortedPriority);
		}
		else {
			System.out.println("fail");
		}}
		public void validatePriorityListDecreasing(){
		List<Integer> PrioriesList =getPriorities();
		List<Integer> sortedPriority = PrioriesList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		if(PrioriesList.equals(sortedPriority)) {
			System.out.println("Priority Filter Working as Expected");
			System.out.println(PrioriesList);System.out.println(sortedPriority);
		}
		else {
			System.out.println("fail");
		}}

		public void validatePriorityFilter(){
			if(DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_rmsort-duedt"))).isDisplayed()){
				WebElement Priorityremove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_rmsort-duedt")));
				TestUtil.waitforElementTobeLocated(Priorityremove , 10);
		        doClick(Priorityremove);		
			}	
			clickAddSort();
			clickPriorityButton();
			validatePriorityListIncreasing();
			clickPriorityChange();
			validatePriorityListDecreasing();
			}
		public void validateBulkaction() {
			System.out.println();
			WebElement BulkActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_BulkActions")));
			TestUtil.waitforElementTobeLocated(BulkActionButton , 10);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			doClick(BulkActionButton);
			waitForTime(3000);	
				WebElement selAllRadioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
				TestUtil.waitforElementTobeLocated(selAllRadioButton , 10);
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				doClick(selAllRadioButton);
				WebElement Step1Next = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
				TestUtil.waitforElementTobeLocated(Step1Next , 10);
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				doClick(Step1Next);
				WebElement SelectAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-AssignIssues")));
				TestUtil.waitforElementTobeLocated(SelectAction , 10);
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				doClick(SelectAction);
				TestUtil.waitforElementTobeLocated(Step1Next , 10);
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				doClick(Step1Next);
				TestUtil.waitforElementTobeLocated(Step1Next , 10);
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				doClick(Step1Next);
				WebElement Confirm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
				TestUtil.waitforElementTobeLocated(Confirm , 10);
				DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				doClick(Confirm);
				if(DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Bulkallocate_Successmsg"))).isDisplayed()){		
					log.info("able to perform Bulk Allocation- succesfully");
					WebElement Finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selfinish")));
					TestUtil.waitforElementTobeLocated(Finish , 10);
					DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					doClick(Finish);
				}
				else {
					log.error("Unable to perform Bulk Allocation");	
				}
				
			  }
		public void navigateTo_MultiSenceWorkspaceDatacollection_Issues()	
		{
		WebElement multiSenceWorkspaceDatacollection_Issues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspaceDatacollection_Issues")));
		TestUtil.waitforElementTobeLocated(multiSenceWorkspaceDatacollection_Issues, 30);
		doClick(multiSenceWorkspaceDatacollection_Issues);	
		}
		public void navigateTo_MultiSenceWorkspaceDatacollection_MyopenIssues()	
		{
		WebElement eleWorkspacIssuesLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspaceDatacollection_Myopenissues")));
		TestUtil.waitforElementTobeLocated(eleWorkspacIssuesLink, 30);
		doClick(eleWorkspacIssuesLink);	
		}
		public void navigateTo_MultiSenceWorkspaceDatacollection_MyworkgroupsIssues()	
		{
		PageFactory.initElements(DriverUtility.getDriver(), this);
		WebElement eleWorkspacissuesLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspaceDatacollection_Myworkgroupsissues")));
		TestUtil.waitforElementTobeLocated(eleWorkspacissuesLink, 30);
		doClick(eleWorkspacissuesLink);	
		}

}








