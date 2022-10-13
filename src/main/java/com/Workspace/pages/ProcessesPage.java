package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ProcessesPage extends TestBase{

	public  ProcessesPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickProcesses()
	{
		waitForTime(3000);
		WebElement ConnexoWorkSpace_ProcessPage_Processes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_ProcessPage_Processes")));
		TestUtil.waitforElementTobeLocated(ConnexoWorkSpace_ProcessPage_Processes, 10);
		doClick(ConnexoWorkSpace_ProcessPage_Processes);
	} 		

	public void ApplyProcesses()
	{
		waitForTime(3000);
		WebElement ConnexoWorkSpace_ProcessPage_ProcessesClearAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_ProcessPage_ProcessesClearAll")));
		TestUtil.waitforElementTobeLocated(ConnexoWorkSpace_ProcessPage_ProcessesClearAll, 10);
		doClick(ConnexoWorkSpace_ProcessPage_ProcessesClearAll);
		waitForTime(2000);
		WebElement ConnexoWorkSpace_ProcessPage_ProcessesDropDwon = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_ProcessPage_ProcessesDropDwon")));
		TestUtil.waitforElementTobeLocated(ConnexoWorkSpace_ProcessPage_ProcessesDropDwon, 10);
		doClick(ConnexoWorkSpace_ProcessPage_ProcessesDropDwon);
		waitForTime(1000);
		WebElement ConnexoWorkSpace_ProcessPage_ProcessesDropDwonValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_ProcessPage_ProcessesDropDwonValue")));
		doClick(ConnexoWorkSpace_ProcessPage_ProcessesDropDwonValue);
		waitForTime(1000);
		WebElement ConnexoWorkSpace_ProcessPage_ProcessessApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_ProcessPage_ProcessessApply")));
		TestUtil.waitforElementTobeLocated(ConnexoWorkSpace_ProcessPage_ProcessessApply, 10);
		doClick(ConnexoWorkSpace_ProcessPage_ProcessessApply);
	}
}



