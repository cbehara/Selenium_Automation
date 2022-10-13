package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataQualityPage extends TestBase{


	public  DataQualityPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickDataQuality()
	{
		waitForTime(3000);
		WebElement DataQuality = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVDQ_DataQuality")));
		TestUtil.waitforElementTobeLocated(DataQuality, 10);
		doClick(DataQuality);
	} 		

	public void ApplyDataQuality(String estimator)
	{
		waitForTime(3000);
		WebElement DataQualityDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVDQ_DataQualityDropDwon")));
		TestUtil.waitforElementTobeLocated(DataQualityDropDown, 10);
		doClick(DataQualityDropDown);
		waitForTime(1000);
		WebElement element =DriverUtility.getDriver().findElement(By.xpath("//div[contains(text(),\""+ estimator +"\")]"));		
		element.click();
		//DriverUtility.getDriver().findElement(By.xpath("//div[text()=' Linear interpolation [STD] ']")).click();
		//waitForTime(1000);
		WebElement DataQualitypply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVDQ_DataQualitypply")));
		TestUtil.waitforElementTobeLocated(DataQualitypply, 10);
		doClick(DataQualitypply);
	}
}



