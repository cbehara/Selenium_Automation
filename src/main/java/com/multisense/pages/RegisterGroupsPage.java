package com.multisense.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RegisterGroupsPage extends TestBase {

	String Name = generateRandomName(9);   
    
	//WebElement ConxoMultisense_RegGroupsPage_AddRegistergroupname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_AddRegistergroupname")));
	
	public  RegisterGroupsPage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}
				
	
	public void clickRegisterGroups() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConxoMultisense_RegGroupsPage_RegisterGroups = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_RegisterGroups")));
		doClick(ConxoMultisense_RegGroupsPage_RegisterGroups);
		} catch (Exception e) {
						// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
				
	public void clicAddRegisterGroupbutton() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConxoMultisense_RegGroupsPage_AddRegistergroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_AddRegistergroup")));
		doClick(ConxoMultisense_RegGroupsPage_AddRegistergroup);
		
		}

	
	public void clicAddRegisterGroupname() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_RegGroupsPage_RegisterName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_RegisterName")));
	doClear(ConxoMultisense_RegGroupsPage_RegisterName);
	sendkeys(Name, ConxoMultisense_RegGroupsPage_RegisterName);
	WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
	checkbox12.click();
	WebElement checkbox13 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
	checkbox13.click();
	WebElement ConxoMultisense_RegGroupsPage_Addregistergroupbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_Addregistergroupbutton")));
	doClick(ConxoMultisense_RegGroupsPage_Addregistergroupbutton);
	}
	
	public void editRegistergroup(String UpdateName)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		WebElement ConxoMultisense_RegGroupsPage_Editregistergroupbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_Editregistergroupbutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegGroupsPage_Editregistergroupbutton, 10);
		doClick(ConxoMultisense_RegGroupsPage_Editregistergroupbutton);
		waitForTime(5000);
		WebElement ConxoMultisense_RegGroupsPage_RegisterName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_RegisterName")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegGroupsPage_RegisterName, 10);
		doClear(ConxoMultisense_RegGroupsPage_RegisterName);
		sendkeys(UpdateName, ConxoMultisense_RegGroupsPage_RegisterName);
		WebElement checkbox17 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[7]"));
		checkbox17.click();
		WebElement checkbox18 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[8]"));
		checkbox18.click();
		WebElement ConxoMultisense_RegGroupsPage_saveregistergroupbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_saveregistergroupbutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegGroupsPage_saveregistergroupbutton, 10);
		doClick(ConxoMultisense_RegGroupsPage_saveregistergroupbutton);
	}
	public void removeregistergroup(String UpdateName)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		WebElement a =DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ UpdateName +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		waitForTime(3000);
		WebElement ConxoMultisense_RegGroupsPage_Registergroupremove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_Registergroupremove")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegGroupsPage_Registergroupremove, 10);
		doClick(ConxoMultisense_RegGroupsPage_Registergroupremove);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdateName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	public void verifyaddregistergroupfields()
	{
		WebElement ConxoMultisense_RegGroupsPage_AddRegistergroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_AddRegistergroup")));
		doClick(ConxoMultisense_RegGroupsPage_AddRegistergroup);
		WebElement ConxoMultisense_RegGroupsPage_Addregistergroupbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_Addregistergroupbutton")));
		doClick(ConxoMultisense_RegGroupsPage_Addregistergroupbutton);
		String Expectedname = "This field is required";
		WebElement Actualname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_verifynamefield")));
		doClick(Actualname);
		TitleAssertFunction(Actualname, Expectedname);
		String Expectedregistertype = "You should select at least one register type";
		WebElement Actualregistertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_verifyregistertype")));
		doClick(Actualregistertype);
		TitleAssertFunction(Actualregistertype, Expectedregistertype);
		WebElement Cancelregistergroupbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegGroupsPage_CancelRegisterbutton")));
		doClick(Cancelregistergroupbutton);
	}
		
	
}


