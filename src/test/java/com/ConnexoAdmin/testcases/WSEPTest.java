package com.ConnexoAdmin.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ConnexoAdmin.pages.WebServices.WebServiceEndpointsPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class WSEPTest extends TestBase {
	
	Logger log = LogManager.getLogger (WSEPTest.class);
	String WSEP = "WebServiceEndpointWithOutName";
	WebServiceEndpointsPage WebServiceEndpointsPage;
	
	public WSEPTest() 
	{
		super();
	}	
	
	@DataProvider
	public Object[][] getTestDataFromWSEP() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(WSEP);
		return testData;
	}
	
	@Test(priority = 1 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="ValidateActionIcon")
	public void ValidateActionIcon(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : ValidateActionIcon *************");
		WebServiceEndpointsPage = new WebServiceEndpointsPage();
        WebServiceEndpointsPage.clickonWebServiceEndpoints(); 
        WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
        String Name = "AB" + generateRandomName(6);
        WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );				
        WebServiceEndpointsPage.clickActionIcon(Name);
        
        assertTrue(WebServiceEndpointsPage.isOptionsListDisplayedInActionDropdown(), "Options list is displayed");
        
        WebServiceEndpointsPage.removeCreatedWSEP(Name);
        log.info("****** Ending the Test Case :ValidateActionIcon *************");
	}
	
	@Test(priority = 2 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="ValidateRemoveOption")
	public void ValidateRemoveOption(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : ValidateRemoveOption *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );					
        WebServiceEndpointsPage.clickActionIcon(Name);
        WebServiceEndpointsPage.clickRemoveOption();
        
        assertTrue(WebServiceEndpointsPage.isRemoveWindowDisplayed(), "remove window popup should display");
        
        WebServiceEndpointsPage.clickCancelButtonInRemoveWindow();
        WebServiceEndpointsPage.removeCreatedWSEP(Name);
        log.info("****** Ending the Test Case :ValidateRemoveOption *************");
	}
	
	@Test(priority = 3 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="ValidateByClickRemoveButtonInRemoveWindow")
	public void ValidateByClickRemoveButtonInRemoveWindow(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : ValidateByClickRemoveButtonInRemoveWindow *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );					
        WebServiceEndpointsPage.clickActionIcon(Name);
        WebServiceEndpointsPage.clickRemoveOption();
        WebServiceEndpointsPage.clickRemoveButtonInRemoveWindow();
        browserRefresh();
        
        assertNotEquals(WebServiceEndpointsPage.getTableResultForFirstRow(), Name, "after click remove button created WSEP should removed");
        
        log.info("****** Ending the Test Case :ValidateByClickRemoveButtonInRemoveWindow *************");
	}
	
	@Test(priority = 4 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="ValidateByClickCancelButtonInRemoveWindow")
	public void ValidateByClickCancelButtonInRemoveWindow(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : ValidateByClickCancelButtonInRemoveWindow *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );					
        WebServiceEndpointsPage.clickActionIcon(Name);
        WebServiceEndpointsPage.clickRemoveOption();
        WebServiceEndpointsPage.clickCancelButtonInRemoveWindow();
        
        assertTrue(WebServiceEndpointsPage.isCreatedWSEPDisplayed(Name), "after click cancel button created WSEP should not removed");
        
        WebServiceEndpointsPage.removeCreatedWSEP(Name);
        log.info("****** Ending the Test Case :ValidateByClickCancelButtonInRemoveWindow *************");
	}
	
	@Test(priority = 5 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="ValidateByClickCrossIconInRemoveWindow")
	public void ValidateByClickCrossIconInRemoveWindow(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : ValidateByClickCrossIconInRemoveWindow *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );					
        WebServiceEndpointsPage.clickActionIcon(Name);
        WebServiceEndpointsPage.clickRemoveOption();
        WebServiceEndpointsPage.clickCancelButtonInRemoveWindow();
        
        assertTrue(WebServiceEndpointsPage.isCreatedWSEPDisplayed(Name), "after click cross icon for remove popup created WSEP should not removed");
        
        WebServiceEndpointsPage.removeCreatedWSEP(Name);
        log.info("****** Ending the Test Case :ValidateByClickCrossIconInRemoveWindow *************");
	}
	
	@Test(priority = 6 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyEditWSEP")
	public void VerifyEditWSEP(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyEditWSEP *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );					
        WebServiceEndpointsPage.clickActionIcon(Name);
        WebServiceEndpointsPage.clickEditOption();
        String ExpectedValue = "Edit";
        
        assertEquals(WebServiceEndpointsPage.getPageHeader(), ExpectedValue, "after click on edit option created WSEP should navigate to edit page");
        
        navigateBackToPreviousPage();
        WebServiceEndpointsPage.removeCreatedWSEP(Name);
        log.info("****** Ending the Test Case :VerifyEditWSEP *************");
	}
	
	@Test(priority = 7 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyByClickOnCreatedWSEP")
	public void VerifyByClickOnCreatedWSEP(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyByClickOnCreatedWSEP *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );					
        WebServiceEndpointsPage.clickOnCreatedWSEPLink(Name);
        String ExpectedValue = "Details";
        
        assertEquals(WebServiceEndpointsPage.getPageHeader(), ExpectedValue, "after click on created WSEP link it should navigate to details page");
        
        navigateBackToPreviousPage();
        WebServiceEndpointsPage.removeCreatedWSEP(Name);
        log.info("****** Ending the Test Case :VerifyByClickOnCreatedWSEP *************");
	}
	
	@Test(priority = 8 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyDetailsPageRemoveOption")
	public void VerifyDetailsPageRemoveOption(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyDetailsPageRemoveOption *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );	
        WebServiceEndpointsPage.clickOnCreatedWSEPLink(Name);
        WebServiceEndpointsPage.clickActionDropdownInDetailPage();
        WebServiceEndpointsPage.clickRemoveOption();
        WebServiceEndpointsPage.clickRemovepopup();
        
        //assertTrue(WebServiceEndpointsPage.isRemoveWindowDisplayed(), "remove window popup should display in detail page");
        
        log.info("****** Ending the Test Case :VerifyDetailsPageRemoveOption *************");
	}
	
	@Test(priority = 9 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyByClickRemoveButtonInRemoveWindowInDetailsPage")
	public void VerifyByClickRemoveButtonInRemoveWindowInDetailsPage(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyByClickRemoveButtonInRemoveWindowInDetailsPage *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );	
        WebServiceEndpointsPage.clickOnCreatedWSEPLink(Name);
        waitForTime(1000);
        WebServiceEndpointsPage.clickActionDropdownInDetailPage();
        waitForTime(1000);
        WebServiceEndpointsPage.clickRemoveOption();
        waitForTime(2000);

        WebServiceEndpointsPage.clickRemoveButtonInRemoveWindow();
        browserRefresh();
        
        assertNotEquals(WebServiceEndpointsPage.getTableResultForFirstRow(), Name, "after click remove button for created WSEP in detail page it should removed");
        
        log.info("****** Ending the Test Case :VerifyByClickRemoveButtonInRemoveWindowInDetailsPage *************");
	}
	
	@Test(priority = 10 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyByClickCancelButtonInRemoveWindowInDetailsPage")
	public void VerifyByClickCancelButtonInRemoveWindowInDetailsPage(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyByClickCancelButtonInRemoveWindowInDetailsPage *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );
        WebServiceEndpointsPage.clickOnCreatedWSEPLink(Name);
        WebServiceEndpointsPage.clickActionDropdownInDetailPage();
        WebServiceEndpointsPage.clickRemoveOption();
        WebServiceEndpointsPage.clickCancelButtonInRemoveWindow();
        
        assertTrue(WebServiceEndpointsPage.isCreatedWSEPDisplayed(Name), "after click cancel button for created WSEP in datail page it should not removed");
        
        WebServiceEndpointsPage.removeCreatedWSEPFromDetailPage();
        log.info("****** Ending the Test Case :VerifyByClickCancelButtonInRemoveWindowInDetailsPage *************");
	}
	
	@Test(priority = 11 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyByClickCrossIconInRemoveWindowInDetailsPage")
	public void VerifyByClickCrossIconInRemoveWindowInDetailsPage(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyByClickCrossIconInRemoveWindowInDetailsPage *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );	
        WebServiceEndpointsPage.clickOnCreatedWSEPLink(Name);
        WebServiceEndpointsPage.clickActionDropdownInDetailPage();
        WebServiceEndpointsPage.clickRemoveOption();
        WebServiceEndpointsPage.clickCancelButtonInRemoveWindow();
        
        assertTrue(WebServiceEndpointsPage.isCreatedWSEPDisplayed(Name), "after click cross icon for remove popup for created WSEP in detail page it should not removed");
        
        WebServiceEndpointsPage.removeCreatedWSEPFromDetailPage();
        log.info("****** Ending the Test Case :VerifyByClickCrossIconInRemoveWindowInDetailsPage *************");
	}
	
	@Test(priority = 12 , enabled = true, dataProvider = "getTestDataFromWSEP" ,description="VerifyEditWSEPInDetailsPage")
	public void VerifyEditWSEPInDetailsPage(String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		log.info("****** Starting the Test Case : VerifyEditWSEPInDetailsPage *************");
		String Name = "AB" + generateRandomName(6);
		browserRefresh();
		WebServiceEndpointsPage.clickonAddWebServiceEndpoint();
		WebServiceEndpointsPage.updateWSEPNameInput(Name);
        WebServiceEndpointsPage.createWebServiceEndpointWithoutName(Webservice,UrlPath,Loglevel ,Authentication );	
        WebServiceEndpointsPage.clickOnCreatedWSEPLink(Name);
        WebServiceEndpointsPage.clickActionDropdownInDetailPage();
        WebServiceEndpointsPage.clickEditOption();
        String ExpectedValue = "Edit";
        
        assertEquals(WebServiceEndpointsPage.getPageHeader(), ExpectedValue, "after click on edit option for created WSEP in detail page it should navigate to edit page");
        
        navigateBackToPreviousPage();
        WebServiceEndpointsPage.removeCreatedWSEPFromDetailPage();
        log.info("****** Ending the Test Case :VerifyEditWSEPInDetailsPage *************");
	}
	
}
