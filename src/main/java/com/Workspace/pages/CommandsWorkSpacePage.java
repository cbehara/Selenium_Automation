package com.Workspace.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class CommandsWorkSpacePage extends TestBase {
	String Name = generateRandomName(9);

	@FindBy(xpath = "//span[text()='Commands']")
	public
	WebElement Commands;

	public CommandsWorkSpacePage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickcommands() throws InterruptedException
	{
		WebElement Commands = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands")));
		doClick(Commands);

	}

	public void addcommands() throws InterruptedException
	{
		WebElement addcommands = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_addcommands")));
		if (addcommands.isDisplayed()){
			TestUtil.waitforElementTobeLocated(addcommands, 30);
			doClick(addcommands);
			waitForTime(500);
		}
		else
		{
			WebElement addcommands1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_addcommands1")));
			TestUtil.waitforElementTobeLocated(addcommands1, 30);
			doClick(addcommands1);
			waitForTime(500);
		}
	}




	public void selectDevicegroup(String Devicegroup , String CommandCategory , String Command ) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement Devicegroupdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_Devicegroupdropdown")));
		doClick(Devicegroupdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+Devicegroup+"\")]")).click();
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement Nextbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_Nextbutton")));
		doClick(Nextbutton);	
	}

	public void selectcommand(String Devicegroup , String CommandCategory , String Command ) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement CommandCategorydropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_CommandCategorydropdown")));
		doClick(CommandCategorydropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+CommandCategory+"\")]")).click();
		WebElement Commanddropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_Commanddropdown")));
		doClick(Commanddropdown)  ;
		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),\""+Command+"\")]")).click();
		WebElement Nextbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_Nextbutton")));
		doClick(Nextbutton);
		DriverUtility.getDriver().findElement(By.xpath("//label[text()='Yes']")).click();
		WebElement Confirm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_Confirm")));
		doClick(Confirm);
		WebElement Finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_Commands_Finish")));
		doClick(Finish);
	}		
}
