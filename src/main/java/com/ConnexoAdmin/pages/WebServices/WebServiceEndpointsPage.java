package com.ConnexoAdmin.pages.WebServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class WebServiceEndpointsPage extends TestBase{
			
	 public WebServiceEndpointsPage()	
		{
			login();
			PageFactory.initElements(DriverUtility.getDriver(), this);
			Admin();
			waitForTime(3000);
		}	
	 
	 public void clickonWebServiceEndpoints()
		{	
		 	WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpoints = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpoints")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpoints, 10);	
			doClick(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpoints);		
		}
	 
	 
	 
	//a[normalize-space()='Web service endpoints']
	 public String gettextofWebServiceEndpoints()
		{
			waitForTime(5000);
			WebElement ConnexoAdmin_WebSrvcEndPntsPage_verifytextWebServiceEndpoints = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_verifytextWebServiceEndpoints")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_verifytextWebServiceEndpoints, 10);
			return getText(ConnexoAdmin_WebSrvcEndPntsPage_verifytextWebServiceEndpoints);
		}	
	 
	 public void clickonAddWebServiceEndpoint()
		{
//		 	WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointPerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointPerpage")));
		    if(isDisplayed("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointPerpage"))
		    {
		    	DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add web service endpoint')]//ancestor::a)[2]")).click();
		    }else {
		    	DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add web service endpoint')]//ancestor::a)[1]")).click();
			}
		}
	 
	 
	 public void createWebServiceEndpoints(String Name , String Webservice, String UrlPath,String Loglevel ,String Authentication)	
      { 	 
	    waitForTime(5000);
	    WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointName")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointName, 10);
		doClear(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointName);
		sendkeys(Name, ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointName);
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown);
		waitForTime(1000);
		try {
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Webservice +"')]")).click();
		}catch (Exception e) {
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Webservice +"')]")).click();
		}
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue, 10);
		doClear(ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue);
		sendkeys(UrlPath, ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue);	
		waitForTime(1000);	
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Loglevel +"')]")).click();
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown);
		waitForTime(1000);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Authentication +"')]")).click();
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd);
		
      }
	 public void activateWSEP(String Name)
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConnexoAdmin_WebSrvcEndPntsPage_activateWSEP = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_activateWSEP")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_activateWSEP, 10);
			doClick(ConnexoAdmin_WebSrvcEndPntsPage_activateWSEP);
		} 
	
	 public void removeWSEP(String Name)
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint, 10);
			doClick(ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint);
			DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'SampleWeb')]//ancestor::div//a[normalize-space()='Remove']")).click();
		} 
	 
	 public void createWebServiceEndpointWithoutName(String Webservice, String UrlPath,String Loglevel ,String Authentication)	
     { 	 
	    waitForTime(5000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceDropDown);
		waitForTime(1000);
		try {
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Webservice +"')]")).click();
		}catch (Exception e) {
			DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Webservice +"')]")).click();
		}
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue, 10);
		doClear(ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue);
		sendkeys(UrlPath, ConnexoAdmin_WebSrvcEndPntsPage_UrlPathValue);	
		waitForTime(1000);	
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_LoglevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Loglevel +"')]")).click();
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_AuthenticationDropDown);
		waitForTime(1000);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+Authentication +"')]")).click();
		waitForTime(1000);
		WebElement ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd, 10);
		doClick(ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointAdd);
		
     }
	 
	 public void updateWSEPNameInput(String Name)
		{
		    WebElement webServiceEndpointName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_WebServiceEndpointName")));
			TestUtil.waitforElementTobeLocated(webServiceEndpointName, 10);
			doClear(webServiceEndpointName);
			sendkeys(Name, webServiceEndpointName);
		}
	 
	 public void removeCreatedWSEP(String Name)
		{
			waitForTime(5000);
			clickActionIcon(Name);
			clickRemoveOption();
			clickRemoveButtonInRemoveWindow();
		}
	 
	 public void clickActionIcon(String Name)
		{
			WebElement ActionIcon = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
			TestUtil.waitforElementTobeLocated(ActionIcon, 10);
			doClick(ActionIcon);
		}
	 
	 public void clickActionDropdownInDetailPage()
		{
		 	WebElement actionDropdownInDetailPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_actionDropdownInDetailPage")));
			TestUtil.waitforElementTobeLocated(actionDropdownInDetailPage, 10);
			doClick(actionDropdownInDetailPage);
		}
	 
	 public void removeCreatedWSEPFromDetailPage()
		{
			waitForTime(5000);
			clickActionDropdownInDetailPage();
			clickRemoveOption();
			clickRemoveButtonInRemoveWindow();
		}
	 
	 public void clickOnCreatedWSEPLink(String Name)
		{
		 	waitForTime(5000);
			WebElement CreatedWSEP = DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ Name +"']"));
			TestUtil.waitforElementTobeLocated(CreatedWSEP, 10);
			doClick(CreatedWSEP);
		}
	 
	 public boolean isCreatedWSEPDisplayed(String Name)
		{
			WebElement CreatedWSEP = DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ Name +"']"));
			return CreatedWSEP.isDisplayed();
		}
	 
	 public void clickEditOption()
		{
		 	WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_editWSEP")));
			TestUtil.waitforElementTobeLocated(removeOption, 10);
			doClick(removeOption);
		}
	 
	 public void clickRemoveOption()
		{
		 	WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint")));
			TestUtil.waitforElementTobeLocated(removeOption, 10);
			doClick(removeOption);
		}
	 
	 public void clickRemovepopup()
		{
		 	WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint_history")));
			TestUtil.waitforElementTobeLocated(removeOption, 10);
			doClick(removeOption);
		}
	 
	 public boolean isRemoveWindowDisplayed()
		{
			waitForTime(3000);
			WebElement RemoveWindow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_RemoveWindow")));
			return RemoveWindow.isDisplayed();
		}
	 
	 public void clickRemoveButtonInRemoveWindow()
		{
			waitForTime(5000);
			WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_removeButtonInRemoveWindow")));
			TestUtil.waitforElementTobeLocated(RemoveOption, 10);
			doClick(RemoveOption);
		}
		
		public void clickCancelButtonInRemoveWindow()
		{
			waitForTime(2000);
			WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_cancelButtonInRemoveWindow")));
			TestUtil.waitforElementTobeLocated(RemoveOption, 10);
			doClick(RemoveOption);
		}
		
		public void clickCrossIconInRemoveWindow()
		{
			waitForTime(2000);
			WebElement RemoveOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_crossButtonInRemoveWindow")));
			TestUtil.waitforElementTobeLocated(RemoveOption, 10);
			doClick(RemoveOption);
		}
		
	 public boolean isOptionsListDisplayedInActionDropdown()
		{
		 	WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_removeWebServiceEndpoint")));
			return removeOption.isDisplayed();
		}
	 
	 public String getWSEPPageHeader()
		{
		 	WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_pageHeader")));
			return removeOption.getText();
		}
	 
	 public String getTableResultForFirstRow()
		{
		 	WebElement tableResultForFirstRow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_tableResultForFirstRow")));
			return tableResultForFirstRow.getText();
		}
	 public String getPageHeader()
		{
		 	WebElement removeOption = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_pageHeader")));
			return removeOption.getText().split(" ")[0];
		}

	public void clickwebservicebreadcrum() {
		// TODO Auto-generated method stub
		{	
		 	WebElement ConnexoAdmin_WebSrvcEndPntsPage_webservicebreadcrum = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WebSrvcEndPntsPage_webservicebreadcrum")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_WebSrvcEndPntsPage_webservicebreadcrum, 10);	
			doClick(ConnexoAdmin_WebSrvcEndPntsPage_webservicebreadcrum);		
		}
	}
}
