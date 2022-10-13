package com.ConnexoAdmin.pages.CalendarsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class CalendarsPage extends TestBase {	

	String Calendar = prop.getProperty("ConnexoAdmin_CalenderPage_strCalendar");

	public  CalendarsPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}				

	public void clickCalendar() throws InterruptedException
	{
		Thread.sleep(5000);
		try {
			WebElement ConnexoAdmin_CalenderPage_Calendars = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_Calendars")));
			doClick(ConnexoAdmin_CalenderPage_Calendars);
		} 
		catch (Exception e)
		{			
			e.printStackTrace();
		}
	}

	public void Activatecalendar(String Calendar)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Calendar +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_CalenderPage_activateCalendar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_activateCalendar")));


		TestUtil.waitforElementTobeLocated(ConnexoAdmin_CalenderPage_activateCalendar, 30);
		doClick(ConnexoAdmin_CalenderPage_activateCalendar);
		waitForTime(500);
	}
	
	public void clickCalenderActionsDropdown(String Calendar)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Calendar +"']//ancestor::td//following-sibling::td//span")).click();
	}
	
	public void clickCalendersLink()
	{
		waitForTime(2000);
		WebElement viewPreview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_calendarsLink")));
		TestUtil.waitforElementTobeLocated(viewPreview, 10);
		doClickjavaScript(viewPreview);		
	}
	
	public void clickPreviewOption()
	{
		waitForTime(2000);
		WebElement viewPreview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_ViewPreviewCalendar")));
		TestUtil.waitforElementTobeLocated(viewPreview, 10);
		doClick(viewPreview);		
	}
	
	public boolean isPreviewOptionDisplayed()
	{
		waitForTime(2000);
		WebElement viewPreview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_ViewPreviewCalendar")));
		return viewPreview.isDisplayed();		
	}
	
	public boolean isDateButtonDisplayed()
	{
		waitForTime(2000);
		WebElement viewPreview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_dateButtonInPreviewCalender")));
		return viewPreview.isDisplayed();		
	}

	public void Deactivatecalendar(String Calendar)
	{
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Calendar +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_CalenderPage_DeactivateCalendar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_DeactivateCalendar")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_CalenderPage_DeactivateCalendar, 30);			
		doClick(ConnexoAdmin_CalenderPage_DeactivateCalendar);
		waitForTime(500);
	}
	
	public void updateDateValue(String dateValue)
	{
		waitForTime(2000);
		WebElement dateInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_dateInputTextFieldInPreviewCalendar")));
		TestUtil.waitforElementTobeLocated(dateInput, 10);
		doClear(dateInput);	
		sendkeys(dateValue, dateInput);
	}
	
	public String getValueofUpdatedDateFromInput()
	{
		waitForTime(5000);
		WebElement UpdatedDate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_dateInputTextFieldInPreviewCalendar")));
		TestUtil.waitforElementTobeLocated(UpdatedDate, 10);
		return UpdatedDate.getAttribute("value").split(" ")[1];
	}
	//*[name()='tspan' or contains(@x,'*.*')][2]
	public String getDateTextofUpdatedDateFromGraphs(int index)
	{
		waitForTime(5000);
		List<WebElement> elementName = DriverUtility.getDriver().findElements(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_graphDateTextChange")));
		 return elementName.get(index).getText();
	}
	
	public void clickApplyButtonInPreviewCalender()
	{
		waitForTime(2000);
		WebElement ApplyButtonInPreviewCalende = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_applyButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(ApplyButtonInPreviewCalende, 10);
		doClick(ApplyButtonInPreviewCalende);			
	}
	
	public void clickClearAllButtonInPreviewCalender()
	{
		waitForTime(2000);
		WebElement ClearAllButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_clearAllButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(ClearAllButtonInPreviewCalender, 10);
		doClick(ClearAllButtonInPreviewCalender);			
	}
	
	public boolean isClearAllButtonEnabled()
	{
		waitForTime(2000);
		WebElement ClearAllButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_clearAllButtonInPreviewCalender")));
		return ClearAllButtonInPreviewCalender.isEnabled();
	}
	
	public boolean isClearAllButtonSelected()
	{
		waitForTime(2000);
		WebElement ClearAllButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_clearAllButtonInPreviewCalender")));
		return ClearAllButtonInPreviewCalender.isSelected();
	}
	
	public void clickDateButtonInPreviewCalender()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_dateButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public void clickMonthAndYearDropdown()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_monthYearDropdownButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public String getMonthText()
	{
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_monthYearDropdownTextInPreviewCalender")));
		return dateButtonInPreviewCalender.getText().split(" ")[0];			
	}
	
	public String getYearText()
	{
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_monthYearDropdownTextInPreviewCalender")));
		return dateButtonInPreviewCalender.getText().split(" ")[1];			
	}
	
	public void clickDecMonth()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_decemberMonthButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public boolean isMonthsOptionsDisplayed()
	{
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_decemberMonthButtonInPreviewCalender")));
		return dateButtonInPreviewCalender.isDisplayed();			
	}
	
	public void click2027Year()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_2027YearButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public void click30Date()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_dec30ButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public void clickOkButton()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_okButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public void clickCancelButton()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_cancelButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
	public void clickTodayButton()
	{
		waitForTime(2000);
		WebElement dateButtonInPreviewCalender = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_todayButtonInPreviewCalender")));
		TestUtil.waitforElementTobeLocated(dateButtonInPreviewCalender, 10);
		doClick(dateButtonInPreviewCalender);			
	}
	
}


