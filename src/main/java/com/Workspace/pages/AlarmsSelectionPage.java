package com.Workspace.pages;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;


public class AlarmsSelectionPage extends TestBase {	
	Logger log = LogManager.getLogger(AlarmsSelectionPage.class);
	
	/*public AlarmsSelectionPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(500);
		Workspace();
		WebElement eleWorkspacAlarmsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_AlarmsLink")));
		TestUtil.waitforElementTobeLocated(eleWorkspacAlarmsLink, 30);
		doClick(eleWorkspacAlarmsLink);	
	}*/
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
		
	public void selectFilterAndValidateValue(String Field, String Webelement_prop,String ClearALLFilter) throws IOException, InterruptedException {
		if(ClearALLFilter=="ON") {
			click_ClearAllButton_AlarmFilter();
			}
		String Field_str=TestUtil.readData("Alarms",Field);
		WebElement InputWebelement=DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(Webelement_prop)));
		
		switch (Field) {
		case  "AlarmID":
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
		case "Workgroup":
		case "Devicegroup":
				TestUtil.waitforElementTobeLocated(InputWebelement , 10);
				doClick(InputWebelement);
				WebElement DropDownSelection = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext", " "+Field_str)));
	            TestUtil.waitforElementTobeLocated(DropDownSelection , 10);
	            doClick(DropDownSelection);
	            break;
	case "Cleared":
		try {
		TestUtil.waitforElementTobeLocated(InputWebelement , 10);
		doClick(InputWebelement);
		WebElement ClearedNoWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ClearedNo")));
        TestUtil.waitforElementTobeLocated(ClearedNoWE , 10);
        doClick(ClearedNoWE);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
        break;
	}
			click_ApplyButton_AlaramFilter();
			if(Field.equalsIgnoreCase("Duedate")) {
				DueDateValidation();
			}else {
			validateAlarmFilterValues(Field, Webelement_prop);
			}
			}
	
	
	public void validateAlarmFilterValues(String Field, String Webelement_prop) throws IOException, InterruptedException {
		String Field_str=TestUtil.readData("Alarms",Field);
		WebElement Field_Webelement;
		if(Field.equalsIgnoreCase("Cleared")) {
			 Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_ClearedValue_displayed")));	
		}
		else if(Field.equalsIgnoreCase("Devicegroup")) {
			Field_str=TestUtil.readData("Alarms","Device");
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
	public  void click_ClearAllButton_AlarmFilter() throws IOException {
		WebElement ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		TestUtil.waitforElementTobeLocated(ClearAllButton , 10);
		doClick(ClearAllButton);
		log.info("ClearAllButton");
	}
	public void navigateToAlarms()	
	{
	WebElement eleWorkspacAlarmsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_AlarmsLink")));
	TestUtil.waitforElementTobeLocated(eleWorkspacAlarmsLink, 30);
	doClick(eleWorkspacAlarmsLink);	
	}
	public void navigateToAlarmsOverView()	
	{
	WebElement eleWorkspacAlarmsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_AlarmsOverView")));
	TestUtil.waitforElementTobeLocated(eleWorkspacAlarmsLink, 30);
	doClick(eleWorkspacAlarmsLink);	
	}
	public void navigateToMyopenalarms()	
	{
	WebElement eleWorkspacAlarmsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Myopenalarms")));
	TestUtil.waitforElementTobeLocated(eleWorkspacAlarmsLink, 30);
	doClick(eleWorkspacAlarmsLink);	
	}
	public void navigateToMyworkgroupsalarms()	
	{
	PageFactory.initElements(DriverUtility.getDriver(), this);
	WebElement eleWorkspacAlarmsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Myworkgroupsalarms")));
	TestUtil.waitforElementTobeLocated(eleWorkspacAlarmsLink, 30);
	doClick(eleWorkspacAlarmsLink);	
	}

	public void validateAlarmOverViewScreen(String Field, String Webelement_prop,String ClearALLFilter) throws IOException, InterruptedException {
		String Field_str=TestUtil.readData("Alarms",Field);
		WebElement InputWebelement=DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(Webelement_prop)));
		if(ClearALLFilter=="ON") {
			click_ClearAllButton_AlarmFilter();
			}
		switch (Field) {
		case "Reason":
			sendkeys(Field_str, InputWebelement);
			WebElement Dropdownelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_Device").replaceAll("replacetext", Field_str)));
            TestUtil.waitforElementTobeLocated(Dropdownelement , 10);
            doClick(Dropdownelement);
            break;
		case "User":
			if(Field_str.trim().equalsIgnoreCase("Unassigned")) {
				doClick(InputWebelement);
				WebElement UserUnassigned = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_user_overview")));
				doClick(UserUnassigned);
			}
			else {
				doClick(InputWebelement);
				WebElement Dropdownelement_User = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext", Field_str)));
	            TestUtil.waitforElementTobeLocated(Dropdownelement_User , 10);
	            doClick(Dropdownelement_User);
			}
			break;
		case "Status":
		case "Workgroup":
			doClick(InputWebelement);
			WebElement DropDownvalueSelection_Status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext", " "+Field_str)));
            TestUtil.waitforElementTobeLocated(DropDownvalueSelection_Status , 10);
            doClick(DropDownvalueSelection_Status);
            break;
		}
		click_ApplyButton_AlaramFilter();
		validateAlarmFilterValues_AlarmOverView(Field,Webelement_prop);
		}
	public void validateAlarmFilterValues_AlarmOverView(String Field, String Webelement_prop) throws IOException, InterruptedException {
		String Field_str=TestUtil.readData("Alarms",Field);
		if(Field_str.equals("Meter operators")) {
			WebElement Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsOverView_values").replaceAll("replacetext", "The group for meter operators.").trim()));
			HardAssertfunction(Field_Webelement, "meter operators");
			}
		if(Field.equals("Status")) {
			WebElement Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsOverView_value_Status").replaceAll("replacetext", Field_str).trim()));
			HardAssertfunction(Field_Webelement,Field_str.trim());
			}
		else {
		WebElement Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsOverView_values").replaceAll("replacetext", Field_str).trim()));
		HardAssertfunction(Field_Webelement, Field_str.trim());}
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
		
	public void validateBulkaction() throws IOException {
		
		WebElement BulkActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_connection_BulkActions")));
		TestUtil.waitforElementTobeLocated(BulkActionButton , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(BulkActionButton);
		waitForTime(3000);	
			WebElement selAllRadioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selall")));
			TestUtil.waitforElementTobeLocated(selAllRadioButton , 10);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			doClick(selAllRadioButton);
			
			WebElement StepNext = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
			TestUtil.waitforElementTobeLocated(StepNext , 10);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			doClick(StepNext);
			
			//Selection of bulk action
			String Bulkaction=TestUtil.readData("Alarms","BulkAction");
			WebElement BulkactionWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("BulkActionselection").replaceAll("replacetext",Bulkaction )));
			TestUtil.waitforElementTobeLocated(BulkactionWE , 10);
			doClick(BulkactionWE);	
			doClick(StepNext);
			
			switch (Bulkaction) {
			case  "Assign alarms":
				String Bulkactionworkgroup=TestUtil.readData("Alarms","BulkActionWorkGroup");
				WebElement SelectWorkGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplicationDropdown")));		
				TestUtil.waitforElementTobeLocated(SelectWorkGroup , 10);
				doClick(SelectWorkGroup);
				WebElement DropDownvalueSelection_Status = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("li_ReplaceText").replaceAll("replacetext", Bulkactionworkgroup)));
	            TestUtil.waitforElementTobeLocated(DropDownvalueSelection_Status , 10);
	            doClick(DropDownvalueSelection_Status);
	            WebElement UserWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown")));
	    		TestUtil.waitforElementTobeLocated(UserWE, 30);
	    		doClick(UserWE);
	    		String s="Show all users";
	    		WebElement DropDownvalueSelection_1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("BulkActionselection").replaceAll("replacetext",s)));
	            TestUtil.waitforElementTobeLocated(DropDownvalueSelection_1 , 10);
	            doClick(DropDownvalueSelection_1);
	            doClick(UserWE);
	            String Bulkactionuser=TestUtil.readData("Alarms","BulkActionUser");
	    		WebElement DropDownvalueSelection_2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("user_Bulkaction").replaceAll("replacetext",Bulkactionuser)));
	            TestUtil.waitforElementTobeLocated(DropDownvalueSelection_2, 10);
	            doClick(DropDownvalueSelection_2);
	            break;	
			case "Close alarms":
				String Reasonforclose=TestUtil.readData("Alarms","Reasontoclose");
				WebElement Selectreasonforclose = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("BulkActionselection").replaceAll("replacetext",Reasonforclose)));		
				TestUtil.waitforElementTobeLocated(Selectreasonforclose , 10);
				doClick(Selectreasonforclose);
					break;		
			case "Set priority":
				String urgencybulkaction=TestUtil.readData("Alarms","Urgencybulkaction");
				WebElement UrgencyWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("urgency_Bulkaction")));
				TestUtil.waitforElementTobeLocated(UrgencyWE, 30);
				UrgencyWE.clear();
				sendkeys(urgencybulkaction, UrgencyWE);	
			
				String impactbulkaction=TestUtil.readData("Alarms","Impactbulkaction");
				WebElement ImpactWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("impact_Bulkaction")));
				TestUtil.waitforElementTobeLocated(ImpactWE, 30);
				ImpactWE.clear();
				sendkeys(impactbulkaction, ImpactWE);
		            break;
			case "Snooze":
					break;
			}	
			TestUtil.waitforElementTobeLocated(StepNext , 10);
			doClick(StepNext);
			WebElement Confirm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selconfirm")));
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

	}



