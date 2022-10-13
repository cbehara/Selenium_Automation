package com.ConnexoAdmin.pages.KeyPair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class AddKeypairsPage extends TestBase {	
	
	String strAlias = generateRandomNumber(2);	
	
	public AddKeypairsPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(3000);		
	}	
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
	
	public void navigatetoKeypairsPage()	
	{		
		waitForTime(500);		
		WebElement ConnexoAdmin_AddKeypairsPage_eleKeypairsHyperLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleKeypairsHyperLink")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleKeypairsHyperLink, 30);
		doClick(ConnexoAdmin_AddKeypairsPage_eleKeypairsHyperLink);
		waitForTime(500);
	}
	
	 public String gettextOfKeypairsPage()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_AddKeypairsPage_eleKeypairsPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleKeypairsPageTitle")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleKeypairsPageTitle, 30);
		ConnexoAdmin_AddKeypairsPage_eleKeypairsPageTitle.isDisplayed();
		return getText(ConnexoAdmin_AddKeypairsPage_eleKeypairsPageTitle);
	}	
		
	public void clickgenerateKeypairs()	
	{
		WebElement ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairButton")));
		if (ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairButton.isDisplayed())
		{
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairButton, 30);
			doClick(ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairButton);
			waitForTime(500);
		}
		else 
		{
			WebElement ConnexoAdmin_AddKeypairsPage_eleActions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleActions")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleActions, 30);
			doClick(ConnexoAdmin_AddKeypairsPage_eleActions);
			waitForTime(500);
			WebElement ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairActionsMenu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairActionsMenu")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairActionsMenu, 30);
			doClick(ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairActionsMenu);
			waitForTime(500);
		}		
	}
   	
    public String gettextOfGenerateKeypairs()
	{		
    	WebElement ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairPageTitle")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairPageTitle, 30);
		waitForTime(500);
		ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairPageTitle.isDisplayed();
		return getText(ConnexoAdmin_AddKeypairsPage_eleGenerateKeypairPageTitle);
	}	
    
	public void generateKeypairs(String strStorageMethod, String strKeyType)
	{	
		try
		{	
			strAlias = "KeyPair" + strAlias;
			WebElement ConnexoAdmin_AddKeypairsPage_eleAliasInputBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleAliasInputBox")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleAliasInputBox, 30);
			sendkeys(strAlias, ConnexoAdmin_AddKeypairsPage_eleAliasInputBox);
			waitForTime(500);
			WebElement ConnexoAdmin_AddKeypairsPage_eleStorageMethod = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleStorageMethod")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleStorageMethod, 30);
			doClick(ConnexoAdmin_AddKeypairsPage_eleStorageMethod);
			waitForTime(500);
			doClick(DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()=\""+ strStorageMethod +"\"]")));			
			waitForTime(500);
			WebElement ConnexoAdmin_AddKeypairsPage_eleKeyType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleKeyType")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleKeyType, 30);
			doClick(ConnexoAdmin_AddKeypairsPage_eleKeyType);
			waitForTime(500);
			doClick(DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()=\""+ strKeyType +"\"]")));
			waitForTime(500);
			WebElement ConnexoAdmin_AddKeypairsPage_eleAddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleAddButton")));
			doClick(ConnexoAdmin_AddKeypairsPage_eleAddButton);
			waitForTime(2000);			
		}
		catch(Exception e)
		{			
			e.printStackTrace();
		}
	}
	
	public void downloadPublicKey()
	{		
		waitForTime(5000);		
		WebElement eleActionsBtn = DriverUtility.getDriver().findElement(By.xpath("//div[normalize-space()=\""+ strAlias +"\"]//ancestor::td//following::td[4]//div/span"));
		TestUtil.waitforElementTobeLocated(eleActionsBtn, 10);
		eleActionsBtn.click();
		waitForTime(2000);
		WebElement ConnexoAdmin_AddKeypairsPage_eleDownloadPublicKeyMenu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleDownloadPublicKeyMenu")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleDownloadPublicKeyMenu, 10);
		doClick(ConnexoAdmin_AddKeypairsPage_eleDownloadPublicKeyMenu);
		waitForTime(2000);	
		sendEnterKey(); 		
	}
	
	public void removeKeypair()
	{		
		waitForTime(3000);		
		WebElement eleActionsBtn = DriverUtility.getDriver().findElement(By.xpath("//div[normalize-space()=\""+ strAlias +"\"]//ancestor::td//following::td[4]//div/span"));
		TestUtil.waitforElementTobeLocated(eleActionsBtn, 10);
		eleActionsBtn.click();
		waitForTime(2000);
		WebElement ConnexoAdmin_AddKeypairsPage_eleRemoveMenu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_eleRemoveMenu")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_eleRemoveMenu, 10);
		doClick(ConnexoAdmin_AddKeypairsPage_eleRemoveMenu);
		waitForTime(2000);
		WebElement ConnexoAdmin_AddKeypairsPage_btnRemovePopUp = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddKeypairsPage_btnRemovePopUp")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddKeypairsPage_btnRemovePopUp, 10);
		doClick(ConnexoAdmin_AddKeypairsPage_btnRemovePopUp);
		waitForTime(500);
	}	
	
	public DashboardPage goToPreviousPage() {
		DriverUtility.getDriver().navigate().back();
		return new DashboardPage();
	}
}
