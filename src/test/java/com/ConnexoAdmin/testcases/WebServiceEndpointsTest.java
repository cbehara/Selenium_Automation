package com.ConnexoAdmin.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ConnexoAdmin.pages.WebServices.WebServiceEndpointsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebServiceEndpointsTest extends TestBase {
	
	Logger log = LogManager.getLogger (WebServiceEndpointsTest.class);
	
	String WebServiceEndpointSheet = "WebServiceEndpoint";
	
	WebServiceEndpointsPage WebServiceEndpointsPage;
	
	public WebServiceEndpointsTest() 
	{
		super();
	}	
	
	@DataProvider
	public Object[][] getTestDataFromWebServiceEndpoint() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(WebServiceEndpointSheet);
		return testData;
	}
	
	@Test(priority = 1 ,description="verify And Select WebService Endpoints")
	public void verifyAndSelectWebServiceEndpoints()	
	{	
		WebServiceEndpointsPage = new WebServiceEndpointsPage();
		
		WebServiceEndpointsPage.clickonWebServiceEndpoints();
		
		reporterLog("Starting execution of Instances of Web service endpoints");
        
		log.info("****** Starting the Test Case : Instances of Web service endpoints *************");
        
        WebServiceEndpointsPage.clickonAddWebServiceEndpoint();        
        
        String ExpectedValue= "Web service endpoints";
        
        WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_verifytextWebServiceEndpoints")));    
        
        SoftAssertfunction(ActualValue, ExpectedValue);
        
        log.info("****** Ending the Test Case : Instances of Web service endpoints *************");	
	}
	
	@Test(priority = 2 ,dataProvider = "getTestDataFromWebServiceEndpoint" ,description="Create WebService Endpoints")
	public void createWebServiceEndpoints(String Name , String Webservice, String UrlPath ,String Loglevel, String Authentication)
	{
		reporterLog("Starting execution of create Web service endpoints");
        
		log.info("****** Adding the Test Case :create Web service endpoints *************");
		
        WebServiceEndpointsPage.createWebServiceEndpoints(Name ,Webservice,UrlPath,Loglevel ,Authentication );				
        
        String ExpecteAddedWSEPValue= "Web service endpoint added.";
        
        WebElement ActualAddedWSEPValue= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_verifytextaddedWSEP")));        
        
        SoftAssertfunction(ActualAddedWSEPValue, ExpecteAddedWSEPValue);
        
        log.info("****** Ending the Test Case :create Web service endpoints *************");
	}
	
	@Test(priority = 3,dataProvider = "getTestDataFromWebServiceEndpoint" ,description="Activate WEb Service Endpoint")
	public void activateWSEP (String Name , String Webservice, String UrlPath ,String Loglevel,String Authentication)
	{
		reporterLog("Starting execution of Activating Instances of Web service endpoints");
		
        log.info("****** Starting the Test Case :Activating Web service endpoints *************");
        
		WebServiceEndpointsPage.activateWSEP(Name);				
        
        String ExpecteactivateWSEPValue= "Web service endpoint activated";
        
        WebElement ActualactivateWSEPValue= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_verifytextActivatedWSEP")));      
        
        SoftAssertfunction(ActualactivateWSEPValue, ExpecteactivateWSEPValue);
        
        log.info("****** Ending the Test Case :Activating Web service endpoints *************");
	}
	
	@Test(priority = 4 ,dataProvider = "getTestDataFromWebServiceEndpoint" ,description="Deactivate & Remove webservice endpoints")
	public void DeactivateWSEP(String Name , String Webservice, String UrlPath ,String Loglevel,String Authentication)
	{
		WebServiceEndpointsPage.removeWSEP(Name);
				
		reporterLog("Starting the testcase Deactivate & Removing Instances of Web service endpoints");
		
        log.info("****** Starting testcase: Deactivate & Removing webservice endpoints  *************");  
               
        String ExpecteremoveWSEPValue= "Web service endpoint removed";
        
        WebElement ActualremoveWSEPValue= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_verifytextRemovedWSEP")));         
        
        SoftAssertfunction(ActualremoveWSEPValue, ExpecteremoveWSEPValue);
        
        log.info("****** Ending testcase:Deactivate & Removing webservice endpoints *************");	  
	}
}
