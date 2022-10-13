package com.Workspace.pages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class IssuesSelectionPage extends TestBase {
	Logger log = LogManager.getLogger(IssuesSelectionPage.class);
	
	/*public IssuesSelectionPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(500);
		Workspace();
		WebElement eleWorkspacIssuesLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_IssuesLink")));
		TestUtil.waitforElementTobeLocated(eleWorkspacIssuesLink, 30);
		doClick(eleWorkspacIssuesLink);	
	}
	
	public String getPageTitle() {
		
		return DriverUtility.getDriver().getTitle();
	}*/
		
	public void navigateToWorkSpace_Issues_Createissue() {
		
		WebElement eleWorkspace_Createissue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_Issues_Createissue")));
		TestUtil.waitforElementTobeLocated(eleWorkspace_Createissue, 30);
		doClick(eleWorkspace_Createissue);	
	
	}
	public void navigateTo_MultiSenceWorkspaceIssues_Issues() {
		WebElement issues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_Issues_issues")));
		TestUtil.waitforElementTobeLocated(issues, 30);
		doClick(issues);	
	}
	public void navigateTo_MultiSenceWorkspaceissues_MyopenIssues(){
		WebElement issues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_Issues_Myopenissues")));
		TestUtil.waitforElementTobeLocated(issues, 30);
		doClick(issues);
	}
	public void navigateTo_MultiSenceWorkspaceissues_Myworkgroupsissues() {
		WebElement issues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_Issues_Myworkgroupsissues")));
		TestUtil.waitforElementTobeLocated(issues, 30);
		doClick(issues);	
	}
	public void navigateToIssuesOverView() {
		WebElement issues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_Issues_Overview")));
		TestUtil.waitforElementTobeLocated(issues, 30);
		doClick(issues);
	}
	public void selectFilterAndValidateValue(String Field, String Webelement_prop,String ClearALLFilter) throws IOException, InterruptedException {
		if(ClearALLFilter=="ON") {
			click_ClearAllButton_IssueFilter();
			}
		String Field_str=TestUtil.readData("DataCollection",Field);
		WebElement InputWebelement=DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(Webelement_prop)));
		
		switch (Field) {
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
		case "Status":
		case "Workgroup":
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
			validateissueFilterValues(Field, Webelement_prop);
			}
			
	public void validateissueFilterValues(String Field, String Webelement_prop) throws IOException, InterruptedException {
		String Field_str=TestUtil.readData("DataCollection",Field);
		WebElement Field_Webelement;
		Field_Webelement = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_Values_displayed").replaceAll("replacetext", Field_str).trim()));
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
	public void createIssue_Manual() throws IOException, InterruptedException {
		String device=TestUtil.readData("Workspace_IssueCreate","Device");
		WebElement DeviceWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_device")));
		TestUtil.waitforElementTobeLocated(DeviceWE, 30);	
		sendkeys(device, DeviceWE);
		
		String reason=TestUtil.readData("Workspace_IssueCreate","IssueReason");
		WebElement reasonWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_reason")));
		TestUtil.waitforElementTobeLocated(reasonWE, 30);
		sendkeys(reason, reasonWE);	
	
		String urgency=TestUtil.readData("Workspace_IssueCreate","Urgency");
		WebElement UrgencyWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_issueurgency")));
		TestUtil.waitforElementTobeLocated(UrgencyWE, 30);
		UrgencyWE.clear();
		sendkeys(urgency, UrgencyWE);	
	
		String impact=TestUtil.readData("Workspace_IssueCreate","Impact");
		WebElement ImpactWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_issueimpact")));
		TestUtil.waitforElementTobeLocated(ImpactWE, 30);
		ImpactWE.clear();
		sendkeys(impact, ImpactWE);	
		
		String dueDate=TestUtil.readData("Workspace_IssueCreate","DueDate");
		WebElement DuedateWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkgroup_dueDate")));
		TestUtil.waitforElementTobeLocated(DuedateWE, 30);
		sendkeys(dueDate, DuedateWE);
		
		String workgroup=TestUtil.readData("Workspace_IssueCreate","workgroup");
		WebElement WorkgroupWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_workgroup")));
		TestUtil.waitforElementTobeLocated(WorkgroupWE, 30);
		doClick(WorkgroupWE);
		WebElement DropDownvalueSelection = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext",workgroup)));
        TestUtil.waitforElementTobeLocated(DropDownvalueSelection , 10);
        doClick(DropDownvalueSelection);
       
		String user=TestUtil.readData("Workspace_IssueCreate","User");
		WebElement UserWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_user")));
		TestUtil.waitforElementTobeLocated(UserWE, 30);
		doClick(UserWE);
		String s="Show all users";
		WebElement DropDownvalueSelection_1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext",s)));
        TestUtil.waitforElementTobeLocated(DropDownvalueSelection_1 , 10);
        doClick(DropDownvalueSelection_1);
        doClick(UserWE);
		WebElement DropDownvalueSelection_2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Dropdown_option").replaceAll("replacetext",user)));
        TestUtil.waitforElementTobeLocated(DropDownvalueSelection_2, 10);
        doClick(DropDownvalueSelection_2);
		
		String comments=TestUtil.readData("Workspace_IssueCreate","Comments");
		WebElement CommentWE = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MultiSenceWorkspace_comment")));
		TestUtil.waitforElementTobeLocated(CommentWE, 30);
		sendkeys(comments, CommentWE);
		
		WebElement Save = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_savebutton")));
		TestUtil.waitforElementTobeLocated(Save, 30);
		doClick(Save);
		Thread.sleep(3000);
		if(DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_VerifyDataValidationIssues"))).isDisplayed()){
			log.info("able to create manual issue-succesfully");
		}
		else {
			log.error("Unable to create manual issue");
		}

}}
