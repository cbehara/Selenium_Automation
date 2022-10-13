
package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.ToUCalendarCampaignsPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class ToUCalendarCampaignsTest  extends TestBase{

	Logger log = LogManager.getLogger(ToUCalendarCampaignsTest.class);
	
	String ToUCalendarCampaignsSheet = "ToUCalendarCampaign";
	ToUCalendarCampaignsPage ToUCalendarCampaignsPage;


	public ToUCalendarCampaignsTest() {
		super();
	} 

	@DataProvider
	public Object[][] getTestDataForToUCalendarCampaign() {
		Object testData[][] = TestUtil.getTestDataFromWorkspace(ToUCalendarCampaignsSheet);
		return testData;
	}
	
	@Test(priority = 1,description="verify And Select Communication Task")
	public void verifyAndSelectCommunicationTask()
	{
		ToUCalendarCampaignsPage = new ToUCalendarCampaignsPage();
		ToUCalendarCampaignsPage.clickonCommunicationTask();
		reporterLog("starting test case-Verify And Select Communication Task");
		log.info("************************* starting test case-Verify And Select Communication Task *****************************************");

		ToUCalendarCampaignsPage.ChangePerpagevalue();
		ToUCalendarCampaignsPage.clickonAddCommunicationTask();
		log.info("************* Ending test case : Verify And Select Communication Task ***********************");
	}
	
	@Test(priority = 2, description="ToU Create Communication Task")
	public void ToUCreateCommunicationTask()		
	{

		reporterLog("starting test case-Creating TOU Communication Task");
		log.info("************************* starting test case-Creating TOU Communication Task *****************************************");

		ToUCalendarCampaignsPage.TOUcreateCommunicationTask();		
		log.info("************* Ending test case : Creating TOU Communication Task ***********************");

	}
	
	@Test(priority = 3, dataProvider = "getTestDataForToUCalendarCampaign",description="TOU Created Actions")
	public void TOUCreatedActions(String DevicetypeNameValue,String TimeofusecalendarNameValue,
			String ConnectionmethodstrategyNameValue,String CategoryValue,String ActionDropDownValue,String SecuritySet)
	{
		reporterLog("starting test case-Created TOU Actions");
		log.info("************************* starting test case-Created TOU Actions ********");

		ToUCalendarCampaignsPage.createActions(CategoryValue,ActionDropDownValue);		
		log.info("************* Ending test case : Created TOU Actions ***********************");
	}

	@Test(priority = 4, description="TOU Created Common Categories")
	public void TOUCreatedCommonCategories( )

	{
		reporterLog("starting test case-TOU Created Common Categories");
		log.info("************************* starting test case-TOU Created Common Categories ********");
		ToUCalendarCampaignsPage.createCommandCategories();
		log.info("************* Ending test case : TOU Created Common Categories ***********************");
	}
	@Test(priority = 5, description="TOU Check Activity Calender Common Categories")
	public void TOUCheckActivityCalenderCommonCategories( )

	{
		reporterLog("starting test case-TOU Check Activity Calender Common Categories");
		log.info("************************* starting test case-TOU Check Activity Calender Common Categories ********");
		ToUCalendarCampaignsPage.CheckActivityCalender();
		log.info("************* Ending test case : TOU Check Activity Calender Common Categories ***********************");
	}
	
	@Test(priority = 6, description="Verify and Select PrivillageLevel")
	public void VerifyandSelectPrivllageLevel( )

	{
		reporterLog("starting test case-Verify and Select Privllage Level");
		log.info("************************* starting test case-Verify and Select Privllage Level ********");

		ToUCalendarCampaignsPage.verifyPrevillages();
		log.info("************* Ending test case :Verify and Select Privllage Level ***********************");
	}
	
	@Test(priority =7, description="click Device Type") 
	public void clickDeviceType() throws InterruptedException
	{
		reporterLog("starting test case-Clicking Device Type");
		log.info("************************* starting test case-Clicking Device Type ********");
		ToUCalendarCampaignsPage.SelectMultisenseAdminstration();
		log.info("************* Ending test case : Clicking Device Type ***********************");
	}

	@Test(priority =8, description="Device type Select" ) 
	public void devicetypeSelect() 
	{
		reporterLog("starting test case-Device type Select");
		log.info("************************* starting test case-Device type Select ********");
		ToUCalendarCampaignsPage.selectDeviceType();	      
		log.info("************* Ending test case : Device type Select ***********************");
	}

	@Test(priority =9, description="Consumer Select" ) 
	public void consumerSelect() 
	{
		reporterLog("starting test case-Consumer Select ");
		log.info("****************************** starting test case-Consumer Select *****************************************");
		ToUCalendarCampaignsPage.selectConsumer();	      
		log.info("************* Ending test case : Consumer Select***********************");
	}

	@Test(priority =10, description="Add Communication Task Configuration") 
	public void addCommunicationTaskConfiguration() 
	{
		reporterLog("starting test case-Adding Communication Task Configuration");
		log.info("****************************** starting test case-Adding Communication Task Configuration *****************************************");
		ToUCalendarCampaignsPage.addCommunicationTaskConfiguration();	      
		log.info("************* Ending test case : Adding Communication Task Configuration***********************");
	}

	@Test(priority =11, dataProvider = "getTestDataForToUCalendarCampaign",description="Add TOu Calender Communication Task Configuration" ) 
	public void addTOuCalenderCommunicationTaskConfiguration(String DevicetypeNameValue,String TimeofusecalendarNameValue,
			String ConnectionmethodstrategyNameValue,String CategoryValue,String ActionDropDownValue,String SecuritySet) 
	{
		reporterLog("starting test case-Adding TOU Calender Communication Task Configuration");
		log.info("****************************** starting test case-Adding TOU Calender Communication Task Configuration *****************************************");
		ToUCalendarCampaignsPage.addTaskTOUcalenderCommunicationTask(SecuritySet);	      
		log.info("************* Ending test case : Adding TOU Calender Communication Task Configuration***********************");
	}

	@Test(priority =12, description="Add Device Group" ) 
	public void addDeviceGroup() 
	{
		reporterLog("starting test case-Adding Device Group");
		log.info("****************************** starting test case-Adding Device Group *****************************************");
		ToUCalendarCampaignsPage.addDeviceGroup();	      
		log.info("************* Ending test case : Adding Device Group ***********************");
	}


	@Test(priority =13, description="Add TOU Calender Campaign workspace" ) 
	public void addTouCalenderCampaignworkspace() 
	{
		reporterLog("Adding TOU Calender Campaign workspace");
		log.info("****************************** starting test case-Adding TOU Calender Campaign workspace *****************************************");
		ToUCalendarCampaignsPage.addTouCalendercampaign();	      
		log.info("************* Ending test case : Adding TOU Calender Campaign workspace ***********************");
	}
	
	@Test(priority =14, description="Add TOUcalender Campaign" ) 
	public void  AddTOUcalenderCampaign()
	{
		reporterLog("starting test case-Add TOU calender Campaign");
		log.info("****************************** starting test case-Add TOU calender Campaign *****************************************");
		ToUCalendarCampaignsPage.clickonAddTouCalenderCampaign();	
		log.info("************* Ending test case : Add TOU calender Campaign ***********************");

	}

	@Test(priority =15, dataProvider = "getTestDataForToUCalendarCampaign",description="Create TouCalender Campaign workspace" ) 
	public void CreateTouCalenderCampaignworkspace(String DevicetypeNameValue,String TimeofusecalendarNameValue,
			String ConnectionmethodstrategyNameValue,String CategoryValue,String ActionDropDownValue,String SecuritySet) 
	{
		reporterLog("starting test case-Creating TOU Calender Campaign workspace");
		log.info("****************************** starting test case-Creating TOU Calender Campaign workspace *****************************************");
		
		ToUCalendarCampaignsPage.CreateTouCalenderCampaign(DevicetypeNameValue,TimeofusecalendarNameValue,ConnectionmethodstrategyNameValue);

		log.info("************* Ending test case : Creating TOU Calender Campaign workspace ***********************");

	}


	@Test(priority =16, description="Edit Campaign workspace" ) 
	public void EditCampaignworkspace() 
	{

		reporterLog("Starting test case-Editing Campaign workspace");
		log.info("****************************** Starting test case-Editing Campaign workspace *****************************************");
		ToUCalendarCampaignsPage.editCampaign();	
		log.info("************* Ending test case : Edited Campaign workspace ***********************");
	}


	@Test(priority =17, description="Cancel Campaign workspace") 
	public void CancelCampaignworkspace() 
	{
		reporterLog("Starting test case- Cancel Campaign workspace");
		log.info("****************************** Starting test case-Cancel Campaign workspace *****************************************");
		ToUCalendarCampaignsPage.cancelCampaign();
		log.info("************* Ending test case : Cancel Campaign workspace ***********************");
	}

	@Test(priority =18, description="Device LinkClick" ) 
	public void deviceLinkClick() 
	{
		reporterLog("Starting test case-Device Link Clicking");
		log.info("****************************** Starting test case-Device Link Clicking *****************************************");
		ToUCalendarCampaignsPage.clickDevicelink();	
		log.info("************* Ending test case : Device Link Clicking  ***********************");
	}
}
