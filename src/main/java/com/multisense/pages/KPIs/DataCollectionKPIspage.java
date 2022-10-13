package com.multisense.pages.KPIs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataCollectionKPIspage extends TestBase {

	String DatacollectionKPISValue = "AdddatacollectionKPI";

	public DataCollectionKPIspage() {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Administration();
		waitForTime(3000);}
	public void clickonDatacollectionKPIs()
	{
		WebElement ConnexoMultisens_DCKPIS_DatacollectionKPIs = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_DatacollectionKPIs")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_DatacollectionKPIs, 10);
		doClick(ConnexoMultisens_DCKPIS_DatacollectionKPIs);
	}
	public void clickAddDatacollectionKPI()
	{
		WebElement ConnexoMultisens_DCKPIS_AddDatacollectionKPI = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_DatacollectionKPIsperpage")));
		if(ConnexoMultisens_DCKPIS_AddDatacollectionKPI.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add data collection KPI')]//ancestor::a)[2]")).click();
		}
		else 
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add data collection KPI')]//ancestor::a)[1]")).click();
		}
	}
	public void AddDatacollectionKPI(String Devicegroup, String Calculationfrequency, String Displayrange, String ConnectionKPI, String CommunicationKPI)
	{
		waitForTime(5000);
		WebElement ConnexoMultisens_DCKPIS_DeviceGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_DeviceGroup")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_DeviceGroup, 10);
		doClick(ConnexoMultisens_DCKPIS_DeviceGroup);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Devicegroup+"']")).click();
		waitForTime(1000);
		WebElement ConnexoMultisens_DCKPIS_Calculationfrequency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_Calculationfrequency")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_Calculationfrequency, 10);
		doClick(ConnexoMultisens_DCKPIS_Calculationfrequency);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Calculationfrequency+"']")).click();
		waitForTime(5000);
		WebElement ConnexoMultisens_DCKPIS_Displayrange = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_Displayrange")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_Displayrange, 10);
		doClick(ConnexoMultisens_DCKPIS_Displayrange);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+Displayrange+"']")).click();
		waitForTime(5000);
		WebElement ConnexoMultisens_DCKPIS_ConnectionKPIRadiobutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_ConnectionKPIRadiobutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_ConnectionKPIRadiobutton, 10);
		doClick(ConnexoMultisens_DCKPIS_ConnectionKPIRadiobutton);
		WebElement ConnexoMultisens_DCKPIS_ConnectionKPITargetValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_ConnectionKPITargetValue")));
		//label[contains(text(),'Connection KPI')]//parent::td//following-sibling::td//table[2]//table//td//input
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_ConnectionKPITargetValue, 10);
		doClear(ConnexoMultisens_DCKPIS_ConnectionKPITargetValue);
		sendkeys(CommunicationKPI, ConnexoMultisens_DCKPIS_ConnectionKPITargetValue);
		waitForTime(2000);
		WebElement ConnexoMultisens_DCKPIS_CommunicationKPIRadiobutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_CommunicationKPIRadiobutton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_CommunicationKPIRadiobutton, 10);
		doClick(ConnexoMultisens_DCKPIS_CommunicationKPIRadiobutton);
		WebElement ConnexoMultisens_DCKPIS_CommunicationKPITargetValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_CommunicationKPITargetValue")));
		//label[contains(text(),'Communication KPI')]//parent::td//following-sibling::td//table[2]//table//td//input
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_CommunicationKPITargetValue, 10);
		doClear(ConnexoMultisens_DCKPIS_CommunicationKPITargetValue);
		sendkeys(CommunicationKPI, ConnexoMultisens_DCKPIS_CommunicationKPITargetValue);
		waitForTime(3000);
		WebElement ConnexoMultisens_DCKPIS_AddDatacollectionKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_AddDatacollectionKPIButton")));
		doClick(ConnexoMultisens_DCKPIS_AddDatacollectionKPIButton);
	}
	public void clickonRemoveDatacollectionKPIButton(String Devicegroup)
	{
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+Devicegroup+"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(2000);
		WebElement ConnexoMultisens_DCKPIS_RemoveDatacollectionKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_RemoveDatacollectionKPIButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_RemoveDatacollectionKPIButton, 10);
		doClick(ConnexoMultisens_DCKPIS_RemoveDatacollectionKPIButton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+Devicegroup+"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	public void verifyAddDataCollectionKPI()
	{
		WebElement ConnexoMultisens_DCKPIS_AddDatacollectionKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_AddDatacollectionKPIButton")));
		doClick(ConnexoMultisens_DCKPIS_AddDatacollectionKPIButton);
		String ExpectedName ="This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_VerifyName")));
		SoftAssertfunction(ActualName, ExpectedName);
		String ExpectedCalculationFrequesncy ="This field is required";
		WebElement ActualCalculationFrequency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_VerifyCalculationFrequency")));
		SoftAssertfunction(ActualCalculationFrequency, ExpectedCalculationFrequesncy);
		String ExpectedDisplayFrequency ="This field is required";
		WebElement ActualDisplayFrequency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_VerifyDisplayRange")));
		SoftAssertfunction(ActualDisplayFrequency, ExpectedDisplayFrequency);
		String ExpectedKPI ="At least one KPI has to be selected";
		WebElement ActualKPI = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_VerifyKPI")));
		SoftAssertfunction(ActualKPI, ExpectedKPI);
		WebElement ConnexoMultisens_DCKPIS_CancelButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_CancelButton")));
		doClick(ConnexoMultisens_DCKPIS_CancelButton);	
	}
	
	public void clickonEditDatacollectionKPIButton(String Devicegroup)
	{
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+Devicegroup+"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(2000);
		WebElement ConnexoMultisens_DCKPIS_EditDatacollectionKPIButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_EditDatacollectionKPIButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_EditDatacollectionKPIButton, 10);
		doClick(ConnexoMultisens_DCKPIS_EditDatacollectionKPIButton);
		waitForTime(2000);
		WebElement ConnexoMultisens_DCKPIS_SaveButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DCKPIS_SaveButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DCKPIS_SaveButton, 10);
		doClick(ConnexoMultisens_DCKPIS_SaveButton);	
	}
	
	
}