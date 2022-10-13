package com.Workspace.testcases;
import org.testng.log4testng.Logger;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.WorkspaceDataExchangePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class WorkspaceDataexchangeTest extends TestBase {
	String FileNameAndPath = "UploadFileTypeSheet";
	Logger log = Logger.getLogger(WorkspaceDataexchangeTest.class);
	WorkspaceDataExchangePage dataExchange;


	public WorkspaceDataexchangeTest()
	{
		super();
	}	
	
	@DataProvider 
	public Object[][] getFileNameAndPathFromXL() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(FileNameAndPath);
		return testData;
	}

	@Test(priority =1, enabled = true , description=" ") 
	public void WorkspaceDataExchangeopenExportHistoryLink() throws InterruptedException, Throwable {
		dataExchange = new WorkspaceDataExchangePage();	
		log.info("*************** starting test case : workspace Data Exchange*****************");
		reporterLog("Staring testcase workspace Data Exchange");
	
		dataExchange.clickonWorkspace(); waitForTime(1000);
		dataExchange.openExportHistoryLink(); waitForTime(2000);
		log.info("Ending Data Exchange openExportHistory Page tests");
	
	}
	
	@Test(priority =2, enabled = true , description="click and verify workspace ImportHistoryLink " ) 
	public void WorkspaceDataExchangeopenImportHistoryLink() throws InterruptedException, Throwable {

		reporterLog("Staring testcase workspace Data Exchange ImportHistoryLink");
		reporterLog("Starting testcase Verify Data Exchange Import History  page");
		dataExchange.clickonWorkspace(); waitForTime(2000);
		dataExchange.openImportHistoryLink(); waitForTime(1000);
		log.info("Ending Data Exchange openImportHistory Page tests");
		TestUtil.takeScreenshotAtEndOfTest();
		
	}

	@Test(priority =3, enabled = true , description="click Upload File HistoryLink " ) 
	public void WorkspaceDataExchangeClickUploadLink() throws InterruptedException, Throwable {
		dataExchange.clickonWorkspace();
		waitForTime(2000);
		dataExchange.openUploadFileLink();
		waitForTime(2000);
		TestUtil.takeScreenshotAtEndOfTest();
	}	
	
	@Test(priority =4, dataProvider = "getFileNameAndPathFromXL", enabled = false ,description="fetch data from excel and enter in form ") 
	public void WorkspaceDataExchange(String serviceFileName, String strfilePath) throws InterruptedException, Throwable {	
		reporterLog("Starting testcase Verify Data Exchange Upload File  page");
		dataExchange.clickonWorkspace();

		waitForTime(2000);
		dataExchange.openUploadFileLink();
		waitForTime(1000);
		dataExchange.openImportDropdownAndSelect(serviceFileName);
		waitForTime(2000);
		dataExchange.fileUpload(strfilePath);
		//dataExchange.clickonShipment();
		TestUtil.takeScreenshotAtEndOfTest();
		waitForTime(2000);

		log.info("*************** Ending test case : workspace Data Exchange*****************");
	}

}