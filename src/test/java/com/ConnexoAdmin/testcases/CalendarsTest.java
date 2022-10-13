package com.ConnexoAdmin.testcases;

import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.CalendarsPage.CalendarsPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class CalendarsTest extends TestBase {
	String AddCalendarsheet = "Calendar";
	Logger log = Logger.getLogger(CalendarsTest.class); 	        
	CalendarsPage Calendarspage;

	public CalendarsTest() {
		super();
	}	
	
	@DataProvider 
	public Object[][] getTestDataForCalendar() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddCalendarsheet);
		return testData;
	}


	@Test(priority = 1 )
	public void calendar()
	{
		Calendarspage = new CalendarsPage();
		reporterLog("Executing Calenders testcase");
		log.info("****************************** starting test case : verify Calenders *****************************************");
		try {
			Calendarspage.clickCalendar();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
		@Test(priority = 2, dataProvider = "getTestDataForCalendar", enabled = true )
		public void Activatecalendar(String Calendar)
		{
		
		Calendarspage.Activatecalendar( Calendar); 

		log.info("****************************** Ending test case : verify Calenders *****************************************");
	}
		
		@Test(priority = 3, dataProvider = "getTestDataForCalendar", enabled = true )
		public void Deactivatecalendar(String Calendar)
		{
		
		Calendarspage.Deactivatecalendar(Calendar); 

		log.info("****************************** Ending test case : verify Calenders *****************************************");
	}
}

