		package com.Workspace.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class FirmwareCampaignPage extends TestBase {
	String Name = generateRandomName(9);
	String Nam = generateRandomName(9);
	String UpdateName = generateRandomName(9);
	@FindBy(xpath = "//span[text()='Firmware campaigns']")
	WebElement firmwarecampaign;

	public FirmwareCampaignPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Devices();
	}	

	public void clickfirmwarecampaign() throws InterruptedException
	{
		Workspace();
		WebElement firmwarecampaign = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign")));
		doClick(firmwarecampaign);
	}

	public void addfirmwarecampaign() throws InterruptedException
	{
		WebElement addfirmwarecampaign = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_addfirmwarecampaign")));

		if (addfirmwarecampaign.isDisplayed()){
			TestUtil.waitforElementTobeLocated(addfirmwarecampaign, 50);
			doClick(addfirmwarecampaign);
			waitForTime(5000);
		}
		else
		{
			WebElement addfirmwarecampaign1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_addfirmwarecampaign1")));
			TestUtil.waitforElementTobeLocated(addfirmwarecampaign1, 40);
			doClick(addfirmwarecampaign1);
			waitForTime(5000);
		}
	}

	public void devicegroups() throws InterruptedException, AWTException
	{

		//DriverUtility.getDriver().findElement(By.xpath("//span[text()='Devices']")).click();
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Device groups']")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//span[@class='x-btn-icon-el  '])[4]")).click();
		WebElement ganame = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_ganame")));
		ganame.sendKeys(Nam);
		DriverUtility.getDriver().findElement(By.xpath("//label[text()='Static device group (based on search results)']")).click();
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Next']/following-sibling::span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Device type']/following-sibling::span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//div[text()='Actaris SL7000']")).click();
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Apply']/following-sibling::span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//b[text()='Selected devices']")).click();
		//		WebElement a1 = DriverUtility.getDriver().findElement(By.xpath("//*[@class='x-grid-row x-grid-data-row x-grid-row-selected x-grid-row-focused'] //*[@class='x-grid-cell x-grid-td x-grid-cell-headerId-gridcolumn-2277 x-grid-cell-special x-grid-cell-row-checker x-grid-cell-special x-grid-cell-row-checker']"));

		//		WebElement a2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		//		a2.click();
		//		WebElement a3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		//		a3.click();
		//		TestUtil.waitforElementTobeLocated(a1, 10);
		//		doClick(a1);
		//		TestUtil.waitforElementTobeLocated(a2, 10);
		//		doClick(a2);
		//		DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-cell-inner ']//div)[2]")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB); robot.delay(500);
		robot.keyPress(KeyEvent.VK_TAB);robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);robot.delay(500);
		robot.keyPress(KeyEvent.VK_SHIFT);robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);robot.delay(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);robot.delay(500);

		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Next']/following-sibling::span")).click();
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Confirm']/following-sibling::span")).click();
	}	


	public void AddFirmwareCampaignvalue(String DeviceType , String DeviceGroup , String FirmwareFile , String Firmwarefilecommtask, String Validationcommtask , String connmethodstrayegy   ) throws InterruptedException
	{
		WebElement Namefield = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_Namefield")));	
		//WebElement connmethodstrayegyDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_connmethodstrayegyDropdown")));
		WebElement Addbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_Addbutton")));
		doClear(Namefield);
		Namefield.sendKeys(Name);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement DeviceTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_DeviceTypeDropdown")));
		doClick(DeviceTypeDropdown);
		sendkeys(DeviceType, DeviceTypeDropdown);
		DeviceTypeDropdown.sendKeys(Keys.ENTER);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement DeviceGroupDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_DeviceGroupDropdown")));
		doClick(DeviceGroupDropdown);
		sendkeys(Nam, DeviceGroupDropdown);
		DeviceGroupDropdown.sendKeys(Keys.ENTER);
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Upload firmware/image and activate immediately']")).click();
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		waitForTime(5000);
		WebElement FirmwareFileDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_FirmwareFileDropdown")));
		doClick(FirmwareFileDropdown);
		waitForTime(5000);
		sendkeys(FirmwareFile, FirmwareFileDropdown);
		waitForTime(5000);
		FirmwareFileDropdown.sendKeys(Keys.ENTER);
		waitForTime(5000);
		WebElement FirmwarefilecommtaskDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_FirmwarefilecommtaskDropdown")));
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		doClick(FirmwarefilecommtaskDropdown);
		sendkeys(Firmwarefilecommtask, FirmwarefilecommtaskDropdown);
		FirmwarefilecommtaskDropdown.sendKeys(Keys.ENTER);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement ValidationcommtaskDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_ValidationcommtaskDropdown")));
		doClick(ValidationcommtaskDropdown);
		sendkeys(Validationcommtask, ValidationcommtaskDropdown);
		ValidationcommtaskDropdown.sendKeys(Keys.ENTER);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//		doClick(connmethodstrayegyDropdown);
		//		sendkeys(connmethodstrayegy, connmethodstrayegyDropdown);
		//		connmethodstrayegyDropdown.sendKeys(Keys.ENTER);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		DriverUtility.getDriver().findElement(By.xpath("//label[text()='Final status of target firmware']")).click();
		DriverUtility.getDriver().findElement(By.xpath("//label[text()='Test status of target firmware']")).click();
		DriverUtility.getDriver().findElement(By.xpath("//b[text()='The target firmware version should have a higher rank than the current firmware version on the device with the same type']")).click();
		doClick(Addbutton);
	}

	public void editFirmwareCampaign()
	{
		
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("(//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span[@class='icon-cog2 x-action-col-icon x-action-col-0  icon-cog2'])[1]")).click();
		//DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement editcampaign = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_editcampaign")));
		TestUtil.waitforElementTobeLocated(editcampaign, 30);
		doClick(editcampaign);
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Save']/following-sibling::span")).click();

	}	

	public void cancelFirmwareCampaign()
	{

		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("(//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span[@class='icon-cog2 x-action-col-icon x-action-col-0  icon-cog2'])[1]")).click();
		//DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement cancelcampaign = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_firmwarecampaign_cancelcampaign")));
		TestUtil.waitforElementTobeLocated(cancelcampaign, 30);
		doClick(cancelcampaign);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Cancel campaign']")).click();

	}

}
