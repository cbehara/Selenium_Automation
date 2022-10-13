package com.Workspace.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class WorkspaceDataExchangePage extends TestBase{
	Logger log = Logger.getLogger(WorkspaceDataExchangePage.class);
	WorkspaceDataExchangePage dataExchange;

	public WorkspaceDataExchangePage()   {
		super();
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		waitForTime(500);
		Multisense();
		waitForTime(500);
		Workspace();
	}

	public void openExportHistoryLink() throws InterruptedException
	{
	
		waitForTime(500);
		WebElement workspaceexportHistoryPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_workspaceexportHistoryPage")));
		TestUtil.waitforElementTobeLocated(workspaceexportHistoryPage, 10);
		doClick(workspaceexportHistoryPage);

	}
	public void openImportHistoryLink() throws InterruptedException
	{
		WebElement workspaceimportHistoryPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_workspaceimportHistoryPage")));
		TestUtil.waitforElementTobeLocated(workspaceimportHistoryPage, 10);
		doClick(workspaceimportHistoryPage);
	}
	public void openUploadFileLink() throws InterruptedException 
	{	
		WebElement workspaceUploadfileForImport = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_workspaceUploadfileForImport")));
		TestUtil.waitforElementTobeLocated(workspaceUploadfileForImport, 10);
		doClick(workspaceUploadfileForImport);
	}
	public void openImportDropdownAndSelect(String serviceFileName) throws InterruptedException 
	{
		WebElement Importdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_Importdropdown")));
		TestUtil.waitforElementTobeLocated(Importdropdown, 10);
		doClick(Importdropdown);
		waitForTime(500);
		doClick(DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()=\""+ serviceFileName +"\"]")));
		waitForTime(500);
	}

	public void fileUpload(String strfilePath) throws InterruptedException {


		String currentDir = System.getProperty("user.dir");
		String exeFilepath = currentDir + "\\Generic-Library\\Executables\\FileUpload.exe";
		WebElement eleSelectFileButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_eleSelectFileButton")));
		TestUtil.waitforElementTobeLocated(eleSelectFileButton, 30);
		waitForTime(500);			
		doClick(eleSelectFileButton);
		waitForTime(5000);
		try {
			Runtime.getRuntime().exec(exeFilepath+" "+strfilePath);
		} catch (IOException e)
		{	
			e.printStackTrace();
		}
		waitForTime(5000);
		WebElement UploadButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_UploadButton")));
		TestUtil.waitforElementTobeLocated(UploadButton, 30);
		doClick(UploadButton);
		waitForTime(500);
	}


	public void clickonWorkspace() {
		WebElement workspace = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_workspace")));
		TestUtil.waitforElementTobeLocated(workspace,15);	

		doClick(workspace);

	}
}