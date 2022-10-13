package com.ConnexoAdmin.pages.AdminRelativePeriod;
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;
public class RelativePeriodPage extends TestBase{
String Name = generateRandomName(9);
	
	String UpdateName = generateRandomName(8);	

	public RelativePeriodPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		
		
	}	
	
	public void clickRelativePreiodLink()  throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement relativePageLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePeriodLink")));
		TestUtil.waitforElementTobeLocated(relativePageLink,10);	
		doClick(relativePageLink);
		waitForTime(1000);
		
	}
	//TesetCAse2
	
	public void clickAddRelativePreiodBtn()  throws InterruptedException
	{
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement addRelativeBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_AddRelativePeriodBtn")));
		TestUtil.waitforElementTobeLocated(addRelativeBtn,10);	
		doClick(addRelativeBtn);
		waitForTime(5000);
		
	}
		
	public void addRelativePage() throws InterruptedException, AWTException 
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement NameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_NameField")));
		TestUtil.waitforElementTobeLocated(NameField,15);	
		doClear(NameField);
		waitForTime(8000);
		sendkeys(Name, NameField);
		waitForTime(8000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_Categorydropdown")));
		doClick(dropdown);
		waitForTime(8000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement optionclick = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_CategoryCheckbox")));
		doClick(optionclick);
		waitForTime(8000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Add = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_Addbtn")));
		doClick(Add);
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(8000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConxoAdmin_Editbutton_Relative = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_Edit")));
		TestUtil.waitforElementTobeLocated(ConxoAdmin_Editbutton_Relative, 30);
		doClick(ConxoAdmin_Editbutton_Relative);
		waitForTime(8000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	}
	
//TestCase 3

	public void clickGearIconandSelectEdit( String EditName, String Days)  throws InterruptedException
	{
		waitForTime(5000);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement NameField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_EditNameField")));
		TestUtil.waitforElementTobeLocated(NameField,30);	
		doClear(NameField);
		waitForTime(5000);
		sendkeys(EditName, NameField);
		waitForTime(5000);
		WebElement radioBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_Relativepage_DateRadio")));
		doClick(radioBtn);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dateField = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_EditDayField")));
		TestUtil.waitforElementTobeLocated(NameField,25);	
		doClear(dateField);
		waitForTime(5000);
		sendkeys(Days, dateField);
		waitForTime(1000);
		
		WebElement dropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_frequecyDropdown")));
		doClick(dropDown);
		waitForTime(4000);
		WebElement daysFromdropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_dropDownValueAsDays")));
		doClick(daysFromdropDown);
		waitForTime(4000);
		WebElement dropDownDuration = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_durationDropdown")));
		doClick(dropDownDuration);
		waitForTime(4000);
		WebElement durationAgo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_duratioption")));
		doClick(durationAgo);
		waitForTime(4000);
		WebElement endRadobtnNow = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_EndRelartivePeriod")));
		doClick(endRadobtnNow);
		waitForTime(4000);
		WebElement saveBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_EditSave")));
		doClick(saveBtn);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ EditName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(5000);
		WebElement ConxoAdmin_Removebutton_Relative = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Admin_RelativePage_Remove")));
		TestUtil.waitforElementTobeLocated(ConxoAdmin_Removebutton_Relative, 10);
		waitForTime(2000);
		doClick(ConxoAdmin_Removebutton_Relative);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ EditName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
				
	}
	

		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


