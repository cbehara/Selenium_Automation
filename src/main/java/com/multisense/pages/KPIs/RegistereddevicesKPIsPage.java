package com.multisense.pages.KPIs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class RegistereddevicesKPIsPage extends TestBase {
	
	 String DevicegroupValue= "Gas devices";
	 String CalculationfrequencyValue= "4 hours";
	 String TargetValue= "95";	 

	
		public RegistereddevicesKPIsPage()   {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
	    Multisense();
	    waitForTime(1000);
	    Administration();
	    waitForTime(3000);

	}
		public void clickonRegistereddevicesKPIs()
		{
			WebElement ConnexoMultisens_RDKPIS_RegistereddevicesKPIs = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_RegistereddevicesKPIs")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_RegistereddevicesKPIs, 10);
			 doClick(ConnexoMultisens_RDKPIS_RegistereddevicesKPIs);
			}

		public void clickonAddRegistereddevicesKPIs()
		{
			waitForTime(5000);
			WebElement ConnexoMultisens_RDKPIS_RegistereddevicesKPIsperpageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_RegistereddevicesKPIsperpageDropdown")));
		     if(ConnexoMultisens_RDKPIS_RegistereddevicesKPIsperpageDropdown.isDisplayed())
		     {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add registered devices KPI')]//ancestor::a)[2]")).click();
		    	 
		     }else {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add registered devices KPI')]//ancestor::a)[1]")).click();
		    }

		}
		public void AddRegistereddevicesKPI()	
		{		    
			waitForTime(3000);
			WebElement ConnexoMultisens_RDKPIS_RDKPIDeviceGroupDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_RDKPIDeviceGroupDropdown")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_RDKPIDeviceGroupDropdown, 10);
			doClick(ConnexoMultisens_RDKPIS_RDKPIDeviceGroupDropdown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+DevicegroupValue+"']")).click();
			waitForTime(1000);
			WebElement ConnexoMultisens_RDKPIS_RDKPICalculationfrequencyDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_RDKPICalculationfrequencyDropdown")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_RDKPICalculationfrequencyDropdown, 10);
			doClick(ConnexoMultisens_RDKPIS_RDKPICalculationfrequencyDropdown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+CalculationfrequencyValue+"']")).click();

			waitForTime(1000);
			WebElement ConnexoMultisens_RDKPIS_RDKPITarget = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_RDKPITarget")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_RDKPITarget, 10);
			doClear(ConnexoMultisens_RDKPIS_RDKPITarget);
			sendkeys(TargetValue, ConnexoMultisens_RDKPIS_RDKPITarget);
			waitForTime(3000);
			WebElement ConnexoMultisens_RDKPIS_AddRDKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_AddRDKPIButton")));
			doClick(ConnexoMultisens_RDKPIS_AddRDKPIButton);
		}
		 public void clickonRemoveRegistereddevicesKPI()
		  {
		   waitForTime(2000);
		  DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+DevicegroupValue+"']//ancestor::td//following-sibling::td//span")).click();
		   waitForTime(2000);
		   WebElement ConnexoMultisens_RDKPIS_RemoveRDKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_RemoveRDKPIButton")));
		   TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_RemoveRDKPIButton, 10);
		   doClick(ConnexoMultisens_RDKPIS_RemoveRDKPIButton);
		   waitForTime(2000);
		   DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+DevicegroupValue+"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		  }
		 
		  public void verifyAddRegisteredDeviceKPIFields()
			{
			  WebElement ConnexoMultisens_RDKPIS_AddRDKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_AddRDKPIButton")));
				doClick(ConnexoMultisens_RDKPIS_AddRDKPIButton);
			  String ExpectedDeviceGroup ="This field is required";
			  WebElement ActualDeviceGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_VerifyDeviceGroup")));
			  doClick(ActualDeviceGroup);
			  SoftAssertfunction(ActualDeviceGroup, ExpectedDeviceGroup);
			  String ExpectedCalculationFrequency ="This field is required";
			  WebElement ActualCalculationFrequency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_VerifyCalculationFrequency")));
			  doClick(ActualCalculationFrequency);
			  SoftAssertfunction(ActualCalculationFrequency, ExpectedCalculationFrequency);
			  WebElement ConnexoMultisens_RDKPIS_CancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_CancelButton")));
			  doClick(ConnexoMultisens_RDKPIS_CancelButton);
			}
		  public void clickonEditRegistereddevicesKPI()
		  {
		   waitForTime(2000);
		   DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+DevicegroupValue+"']//ancestor::td//following-sibling::td//span")).click();
		   waitForTime(2000);
		   WebElement ConnexoMultisens_RDKPIS_EditRDKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_EditRDKPIButton")));
		   TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_EditRDKPIButton, 10);
		   doClick(ConnexoMultisens_RDKPIS_EditRDKPIButton);
		   WebElement ConnexoMultisens_RDKPIS_SaveRDKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_RDKPIS_SaveRDKPIButton")));
		   TestUtil.waitforElementTobeLocated(ConnexoMultisens_RDKPIS_SaveRDKPIButton, 10);
		   doClick(ConnexoMultisens_RDKPIS_SaveRDKPIButton);
		   
		  }  

}
