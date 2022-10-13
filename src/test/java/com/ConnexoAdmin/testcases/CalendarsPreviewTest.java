package com.ConnexoAdmin.testcases;

import org.testng.log4testng.Logger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ConnexoAdmin.pages.CalendarsPage.CalendarsPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class CalendarsPreviewTest extends TestBase {
	String AddCalendarsheet = "Calendar";
	Logger log = Logger.getLogger(CalendarsPreviewTest.class); 	        
	CalendarsPage Calendarspage;

	public CalendarsPreviewTest() {
		super();
	}	
	
	@DataProvider 
	public Object[][] getTestDataForCalendar() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(AddCalendarsheet);
		return testData;
	}


	@Test(priority = 1, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyViewPreviewOptionDisplayed")
	public void verifyViewPreviewOptionDisplayed(String Calendar) throws InterruptedException	
	{	
        log.info("****************************** starting test case : verifyViewPreviewOptionDisplayed *************");
        Calendarspage = new CalendarsPage();
		Calendarspage.clickCalendar();
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        
        assertTrue(Calendarspage.isPreviewOptionDisplayed(), "view preview option is not displayed");
        
        log.info("****** Ending the Test Case : verifyViewPreviewOptionDisplayed *************");
	}
	
	@Test(priority = 2, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyViewPreviewOptionDisplayed")
	public void verifyClickingOnViewPreviewOption(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyViewPreviewOptionDisplayed *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        
        assertTrue(Calendarspage.isDateButtonDisplayed(), "verify after clicking on view preview option it should navigate");
        
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyViewPreviewOptionDisplayed *************");
	}
	
	@Test(priority = 3, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyClearAllButtonEnable")
	public void verifyClearAllButtonEnable(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyClearAllButtonEnable *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        
        assertFalse(Calendarspage.isClearAllButtonSelected(), "verify Clear all button should disable by deafultly");
        
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyClearAllButtonEnable *************");
	}
	
	@Test(priority = 4, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyValuesForMonthAndYear")
	public void verifyValuesForMonthAndYear(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyValuesForMonthAndYear *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
                
        assertTrue(Calendarspage.isMonthsOptionsDisplayed(), "verify by click month and year dropdown month values should display");
        
        browserRefresh();
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyValuesForMonthAndYear *************");
	}
	
	@Test(priority = 5, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyByChangeMonth")
	public void verifyByChangeMonth(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyByChangeMonth *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.clickOkButton();
                
        assertEquals(Calendarspage.getMonthText(), "December", "verify by click december month value should change");
        
        browserRefresh();
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyByChangeMonth *************");
	}
	
	@Test(priority = 6, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyByChangeYear")
	public void verifyByChangeYear(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyByChangeYear *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.click2027Year();
        Calendarspage.clickOkButton();
                
        assertEquals(Calendarspage.getYearText(), "2027", "verify by click 2027 year value should change");
        
        browserRefresh();
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyByChangeYear *************");
	}
	
	@Test(priority = 7, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyByChangeDate")
	public void verifyByChangeDate(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyByChangeDate *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        String ActualValue = Calendarspage.getDateTextofUpdatedDateFromGraphs(0);
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.click2027Year();
        Calendarspage.clickOkButton();
        Calendarspage.click30Date();
                
        assertNotEquals(ActualValue, Calendarspage.getValueofUpdatedDateFromInput(), "date is not changed");
        
        browserRefresh();
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyByChangeDate *************");
	}
	
	@Test(priority = 8, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyDateAfterRefreshPreviewPage")
	public void verifyDateAfterRefreshPreviewPage(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyDateAfterRefreshPreviewPage *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.click2027Year();
        Calendarspage.clickOkButton();
        Calendarspage.click30Date();
        Calendarspage.clickApplyButtonInPreviewCalender();
        browserRefresh();
        String ActualValue = Calendarspage.getDateTextofUpdatedDateFromGraphs(0);
                
        assertNotEquals(ActualValue, Calendarspage.getValueofUpdatedDateFromInput(), "date should change after refresh preview page");
        
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyDateAfterRefreshPreviewPage *************");
	}
	
	@Test(priority = 9, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyClearAllButtonEnabled")
	public void verifyClearAllButtonEnabled(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyClearAllButtonEnabled *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.click2027Year();
        Calendarspage.clickOkButton();
        Calendarspage.click30Date();
        Calendarspage.clickApplyButtonInPreviewCalender();
                
        assertTrue(Calendarspage.isClearAllButtonEnabled(), "clear all button should enable");
        
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyClearAllButtonEnabled *************");
	}
	
	@Test(priority = 10, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyByClickClearAllButtonAfterRefresh")
	public void verifyByClickClearAllButtonAfterRefresh(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyByClickClearAllButtonAfterRefresh *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.click2027Year();
        Calendarspage.clickOkButton();
        Calendarspage.click30Date();
        Calendarspage.clickApplyButtonInPreviewCalender();
        browserRefresh();
        
        assertFalse(Calendarspage.isClearAllButtonSelected(), "clear all button should enable");
        
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyByClickClearAllButtonAfterRefresh *************");
	}
	
	@Test(priority = 11, enabled = true, dataProvider = "getTestDataForCalendar", description = "verifyByCLickClearAllButton")
	public void verifyByClickClearAllButton(String Calendar)	
	{	
        log.info("****************************** starting test case : verifyByCLickClearAllButton *************");
        Calendarspage.clickCalenderActionsDropdown(Calendar); 
        Calendarspage.clickPreviewOption();
        Calendarspage.clickDateButtonInPreviewCalender();
        Calendarspage.clickMonthAndYearDropdown();
        Calendarspage.clickDecMonth();
        Calendarspage.click2027Year();
        Calendarspage.clickOkButton();
        Calendarspage.click30Date();
        Calendarspage.clickApplyButtonInPreviewCalender();
        String ActualValue = Calendarspage.getDateTextofUpdatedDateFromGraphs(0);
        Calendarspage.clickClearAllButtonInPreviewCalender();
        String ExpectedValue = Calendarspage.getDateTextofUpdatedDateFromGraphs(0);
                
        assertNotEquals(ActualValue, ExpectedValue, "date should change after refresh preview page");
        
        Calendarspage.clickCalendersLink();
        log.info("****** Ending the Test Case : verifyByCLickClearAllButton *************");
	}
}

