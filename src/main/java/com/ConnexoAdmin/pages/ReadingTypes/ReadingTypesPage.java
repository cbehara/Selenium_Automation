package com.ConnexoAdmin.pages.ReadingTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ReadingTypesPage extends TestBase{
	
	String ReadingTypesNameValue= generateRandomName(8);
	
	public ReadingTypesPage()  {
		login();
        PageFactory.initElements(DriverUtility.getDriver(), this);
        Admin();
		waitForTime(5000);
	}
	
	public void clickonReadingTypes()
	{	
		WebElement ConnexoAdmin_ReadingTypePage_ReadingTypeSets = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_ReadingTypeSets")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_ReadingTypeSets, 10);
		doClickjavaScript(ConnexoAdmin_ReadingTypePage_ReadingTypeSets);
 	}
	
	public void clickonAddReadingTypeSet()
	{
		waitForTime(3000);
		WebElement ConnexoAdmin_ReadingTypePage_ReadingTypeSetsperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_ReadingTypeSetsperpage")));
	     if(ConnexoAdmin_ReadingTypePage_ReadingTypeSetsperpage.isDisplayed())
	     {
	 		waitForTime(3000);
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add reading type')]//ancestor::a)[2]")).click();
	     }else {
	 		waitForTime(3000);
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add reading type')]//ancestor::a)[1]")).click();
	     }
	}
	public void BlankAreaClick()
	{
		Actions action =new Actions(DriverUtility.getDriver());
		action.moveByOffset(400, 1200).click().build().perform();
	}
	public void CreateReadingTypelink(String Period,String Commodity,String Phases)
	{
		waitForTime(3000);
		WebElement ConnexoAdmin_ReadingTypePage_AddReadingTypeSetInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_AddReadingTypeSetInput")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_AddReadingTypeSetInput, 10);
		doClear(ConnexoAdmin_ReadingTypePage_AddReadingTypeSetInput);
		sendkeys(ReadingTypesNameValue, ConnexoAdmin_ReadingTypePage_AddReadingTypeSetInput);
		waitForTime(2000);	
		WebElement ConnexoAdmin_ReadingTypePage_ExtendedButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_ExtendedButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_ExtendedButton, 10);
		doClick(ConnexoAdmin_ReadingTypePage_ExtendedButton);
		WebElement ConnexoAdmin_ReadingTypePage_PeriodDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_PeriodDropdown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_PeriodDropdown, 10);
		doClick(ConnexoAdmin_ReadingTypePage_PeriodDropdown);		
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Period +"']")).click();
        DriverUtility.getDriver().findElement(By.xpath("(//label[text()='Period #1']//parent::td)[2]")).click();
//      WebElement ConnexoAdmin_ReadingTypePage_DirectionofFlowDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_DirectionofFlowDropdown")));
//		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_DirectionofFlowDropdown, 10);
//		doClick(ConnexoAdmin_ReadingTypePage_DirectionofFlowDropdown);
//		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Directionofflow +"']")).click();
		waitForTime(2000);	
		WebElement ConnexoAdmin_ReadingTypePage_CommodityDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_CommodityDropdown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_CommodityDropdown, 10);
		doClick(ConnexoAdmin_ReadingTypePage_CommodityDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Commodity +"']")).click();
		waitForTime(2000);
		WebElement ConnexoAdmin_ReadingTypePage_PhasesDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_PhasesDropdown")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_PhasesDropdown, 10);
		doClick(ConnexoAdmin_ReadingTypePage_PhasesDropdown);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Phases +"']")).click();
		waitForTime(2000);	
		WebElement ConnexoAdmin_ReadingTypePage_AddReadingTypeButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_AddReadingTypeButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_AddReadingTypeButton, 10);
		doClick(ConnexoAdmin_ReadingTypePage_AddReadingTypeButton);
		waitForTime(2000);	
		WebElement ConnexoAdmin_ReadingTypePage_PoupUpaddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_ReadingTypePage_PoupUpaddButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_ReadingTypePage_PoupUpaddButton, 10);
		doClick(ConnexoAdmin_ReadingTypePage_PoupUpaddButton);
	}
}
