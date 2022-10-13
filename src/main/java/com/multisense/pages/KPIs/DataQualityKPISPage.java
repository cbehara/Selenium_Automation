package com.multisense.pages.KPIs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataQualityKPISPage extends TestBase {
	
	 String DevicegroupValue= "Gas devices";
	 String CalculationfrequencyValue= "1 hour";


public DataQualityKPISPage()   {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
    Multisense();
    waitForTime(1000);
    Administration();
    waitForTime(3000);

}
public void clickonDataQualityKPIs()
{
	WebElement ConnexoMultisens_DQKPIS_DataQualityKPIs = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_DataQualityKPIs")));
	TestUtil.waitforElementTobeLocated(ConnexoMultisens_DQKPIS_DataQualityKPIs, 10);
	 doClick(ConnexoMultisens_DQKPIS_DataQualityKPIs);
	}

public void clickonAddDataQualityKPI()
{
	WebElement ConnexoMultisens_DQKPIS_DataQualityKPIsperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_DataQualityKPIsperpageDropdown")));
     if(ConnexoMultisens_DQKPIS_DataQualityKPIsperpage.isDisplayed())
     {
    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add data quality KPI')]//ancestor::a)[2]")).click();
    	
     }else {
    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add data quality KPI')]//ancestor::a)[1]")).click();
    }

}
	public void AddDataQualityKPI()	
		{		    
			waitForTime(3000);
			WebElement ConnexoMultisens_DQKPIS_DataQualityDeviceGroupDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_DataQualityDeviceGroupDropdown")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_DQKPIS_DataQualityDeviceGroupDropdown, 10);
			doClick(ConnexoMultisens_DQKPIS_DataQualityDeviceGroupDropdown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+DevicegroupValue+"']")).click();
			waitForTime(1000);
			WebElement ConnexoMultisens_DQKPIS_DataQualityCalculationfrequencyDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_DataQualityCalculationfrequencyDropdown")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_DQKPIS_DataQualityCalculationfrequencyDropdown, 10);
			doClick(ConnexoMultisens_DQKPIS_DataQualityCalculationfrequencyDropdown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+CalculationfrequencyValue+"']")).click();

			sendkeys(CalculationfrequencyValue, ConnexoMultisens_DQKPIS_DataQualityCalculationfrequencyDropdown);
			waitForTime(3000);
			WebElement ConnexoMultisens_DQKPIS_AddDataQualityKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_AddDataQualityKPIButton")));
			doClick(ConnexoMultisens_DQKPIS_AddDataQualityKPIButton);
		}
	  public void ChangingDataQualityKPIsperpagevalue()
	    {
	    	waitForTime(5000);
	    	WebElement ConnexoMultisens_DQKPIS_DataQualityKPIsperpageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_DataQualityKPIsperpageDropdown")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_DQKPIS_DataQualityKPIsperpageDropdown, 10);
			doClick(ConnexoMultisens_DQKPIS_DataQualityKPIsperpageDropdown);
			WebElement ConnexoMultisens_DQKPIS_DataQualityKPIsperpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_DataQualityKPIsperpagevalue")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisens_DQKPIS_DataQualityKPIsperpagevalue, 10);
			doClick(ConnexoMultisens_DQKPIS_DataQualityKPIsperpagevalue);
	    }
	  public void removeDataQualityKPI()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ DevicegroupValue+"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			/*
			 * WebElement ConnexoMultisens_DQKPIS_RemoveDataQualityKPIButton =
			 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
			 * "ConnexoMultisens_DQKPIS_RemoveDataQualityKPIButton")));
			 * TestUtil.waitforElementTobeLocated(
			 * ConnexoMultisens_DQKPIS_RemoveDataQualityKPIButton, 10);
			 * doClick(ConnexoMultisens_DQKPIS_RemoveDataQualityKPIButton);
			 * waitForTime(2000);
			 */
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+DevicegroupValue+"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	  
	  public void verifyAddDataQualityKPIFields()
		{
		  WebElement ConnexoMultisens_DQKPIS_AddDataQualityKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_AddDataQualityKPIButton")));
		  doClick(ConnexoMultisens_DQKPIS_AddDataQualityKPIButton);
		  String ExpectedDeviceGroup ="This field is required";
		  WebElement ActualDeviceGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_VerifyDeviceGroup")));
		  doClick(ActualDeviceGroup);
		  SoftAssertfunction(ActualDeviceGroup, ExpectedDeviceGroup);
		  String ExpectedCalculationFrequency ="This field is required";
		  WebElement ActualCalculationFrequency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_VerifyCalculationFrequency")));
		  doClick(ActualCalculationFrequency);
		  SoftAssertfunction(ActualCalculationFrequency, ExpectedCalculationFrequency);
		  WebElement ConnexoMultisens_DQKPIS_CancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DQKPIS_CancelButton")));
		  doClick(ConnexoMultisens_DQKPIS_CancelButton);
		}
}



