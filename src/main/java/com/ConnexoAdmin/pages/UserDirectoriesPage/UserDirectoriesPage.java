package com.ConnexoAdmin.pages.UserDirectoriesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class UserDirectoriesPage extends TestBase {   
	
	public  UserDirectoriesPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}
				
	
	public void clickuserdirectory() throws InterruptedException
	{
		Thread.sleep(5000);
		try 
		{
			WebElement ConnexoAdmin_UserDirectoriesPage_UserDirectories = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_UserDirectories")));
			doClick(ConnexoAdmin_UserDirectoriesPage_UserDirectories);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
	public void clickAdduserdirectory() throws InterruptedException
		{
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			WebElement ConnexoAdmin_UserDirectoriesPage_AddUserButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_AddUserButton")));
			doClick(ConnexoAdmin_UserDirectoriesPage_AddUserButton);		
		}

	
	public void Adduserdirectory(String Name, String Url, String Backupurl, String securityprotocol, String directoryUser, String Password, String BaseUser, String BaseGroup) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_UserDirectoriesPage_UserName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_UserName")));
		doClear(ConnexoAdmin_UserDirectoriesPage_UserName);
		sendkeys(Name, ConnexoAdmin_UserDirectoriesPage_UserName);
		WebElement ConnexoAdmin_UserDirectoriesPage_url = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_url")));
		doClear(ConnexoAdmin_UserDirectoriesPage_url);
		sendkeys(Url, ConnexoAdmin_UserDirectoriesPage_url);
		WebElement ConnexoAdmin_UserDirectoriesPage_backupurl = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_backupurl")));
		doClear(ConnexoAdmin_UserDirectoriesPage_backupurl);
		sendkeys(Backupurl, ConnexoAdmin_UserDirectoriesPage_backupurl);
		WebElement ConnexoAdmin_UserDirectoriesPage_SecurityProtocol = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_SecurityProtocol")));
		doClick(ConnexoAdmin_UserDirectoriesPage_SecurityProtocol);
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options)
		{  
			if(element.getText().equals(securityprotocol))
			{
				element.click();
			}
		}
//		WebElement ConnexoAdmin_UserDirectoriesPage_TrustStoreDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_TrustStoreDropdown")));
//		doClick(ConnexoAdmin_UserDirectoriesPage_TrustStoreDropdown);
//		WebElement ConnexoAdmin_UserDirectoriesPage_TrustStore = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_TrustStore")));
//		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserDirectoriesPage_TrustStore, 10);
//		doClick(ConnexoAdmin_UserDirectoriesPage_TrustStore);
		WebElement ConnexoAdmin_UserDirectoriesPage_directoryuser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_directoryuser")));
		doClear(ConnexoAdmin_UserDirectoriesPage_directoryuser);
		sendkeys(directoryUser, ConnexoAdmin_UserDirectoriesPage_directoryuser);
		WebElement ConnexoAdmin_UserDirectoriesPage_password = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_password")));
		doClear(ConnexoAdmin_UserDirectoriesPage_password);
		sendkeys(Password, ConnexoAdmin_UserDirectoriesPage_password);
		WebElement ConnexoAdmin_UserDirectoriesPage_baseuser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_baseuser")));
		doClear(ConnexoAdmin_UserDirectoriesPage_baseuser);
		sendkeys(BaseUser, ConnexoAdmin_UserDirectoriesPage_baseuser);
		WebElement ConnexoAdmin_UserDirectoriesPage_basegroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_basegroup")));
		doClear(ConnexoAdmin_UserDirectoriesPage_basegroup);
		sendkeys(BaseGroup, ConnexoAdmin_UserDirectoriesPage_basegroup);
		WebElement ConnexoAdmin_UserDirectoriesPage_AddUserdirectoryButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_AddUserdirectoryButton")));
		doClick(ConnexoAdmin_UserDirectoriesPage_AddUserdirectoryButton);
	}
	
	public void removeuserdirectory(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_UserDirectoriesPage_RemoveuserNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserDirectoriesPage_RemoveuserNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserDirectoriesPage_RemoveuserNameButton, 10);
		doClick(ConnexoAdmin_UserDirectoriesPage_RemoveuserNameButton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}	
}


