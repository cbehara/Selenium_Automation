package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.DataExchangePage;
import com.util.util.TestUtil;

public class DataExchangeTest extends TestBase{
	Logger log = LogManager.getLogger(DataExchangeTest.class);
	String DataExchangeSheet = "DataExchange";
	
	DataExchangePage DataExchangepage;
	public DataExchangeTest()
	{
		super();
	}
	
	  @DataProvider 
	  public Object[][] getTestDataForDataExchange() 
	  { 
		  Object testData[][] = TestUtil.getTestData(DataExchangeSheet); 
		  return testData;
	  }
	  	 
	  @Test(priority =1, description = " export history click" , enabled = true ) 
	  public void exportHistoryClick() throws InterruptedException
	  {
		  DataExchangepage = new  DataExchangePage();
		  reporterLog("Starting testcase Export History click");
		  log.info("******  Starting Testcase : Export History click *************");
		  DataExchangepage.clickExportHistory();
		  
	  }
//	  @Test(priority =2, dataProvider = "getTestDataForDataExchange", description = " export history functionality" , enabled = true ) 
//	  public void exportHistoryCheck(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException
//	  {
//		  reporterLog("Starting testcase Export History Check");
//		  log.info("******  Starting Testcase : Export History Check *************");
//		  Thread.sleep(5000);
//		  DataExchangepage.exportHistoryCheck(strfilePath, ExportTask, ExportStatus, ImportService, ImportStatus, logLevel, dataselector, devicegroup, exportwindow, dataformatter, identifier, updateidentifier, seperator, method, Tobox, subjectbox, atname, atextension, importserviceupload);
//		  
//		  log.info("******  Ending Testcase : Export History Check *************");
//	  }
//	  
//	  @Test(priority = 3, description = " Add sort functionality in export history", enabled = true)
//	  	public void Addsort() throws InterruptedException
//	  	{
//	      DataExchangepage.Addsort();
//	      DataExchangepage.clickAdministrationPage();
//	  	}	  
//	  
//	  
//	  @Test(priority =4, dataProvider = "getTestDataForDataExchange", description = " import history click" ,enabled = true ) 
//	  public void importHistoryClick(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload, String seperator) throws InterruptedException
//	  {
//		  DataExchangepage.clickImportHistory();
//		  DataExchangepage.importHistoryCheck(strfilePath , ExportTask, ExportStatus,ImportService,ImportStatus, logLevel, dataselector, devicegroup, exportwindow, dataformatter, identifier, updateidentifier, seperator, method, Tobox, subjectbox, atname, atextension, importserviceupload);
//	  }
//	  
//	  @Test(priority =5, dataProvider = "getTestDataForDataExchange", description = " import history check", enabled = true ) 
//	  public void importHistoryCheck(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload, String seperator) throws InterruptedException
//	  {
//		  
//		  DataExchangepage.importHistoryCheck(strfilePath , ExportTask, ExportStatus,ImportService,ImportStatus, logLevel, dataselector, devicegroup, exportwindow, dataformatter, identifier, updateidentifier, seperator, method, Tobox, subjectbox, atname, atextension, importserviceupload);
//	  }
//	  
//	  @Test(priority = 6, description = "Add sort", enabled = true)
//	  	public void Addsort1() throws InterruptedException
//
//	  	{
//	      DataExchangepage.Addsort();
//	      DataExchangepage.clickAdministrationPage();
//	  	}
//	  
//	  @Test(priority =7 , description = " import services",  enabled = true ) 
//	  public void importservices() throws InterruptedException
//	  {
//		  DataExchangepage.importservices();
//		  
//	  }
//	  
//	  @Test(priority =8 ,description = " export button click",   enabled = true ) 
//	  public void exportbuttonclick() throws InterruptedException
//	  {
//		  DataExchangepage.exportbuttonclick();
//		  DataExchangepage.clickAdministrationPage();
//	  }
//	  
//	  @Test(priority =9, dataProvider = "getTestDataForDataExchange", description = " click export task", enabled = true )
//	  public void clickOnAddExportTask(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException, AWTException
//	  {
//		  reporterLog("Starting testcase Export Tasks addition");
//		  log.info("******  Starting Testcase : Export Task click *************");
//		  Thread.sleep(5000);
//		  //DataExchangepage.clickAdministrationPage();
//		  DataExchangepage.clickdataexporttaskspage();
//	      log.info("Export Tasks added");
//	      log.info("******  Ending Testcase : Export Task click *************");}
//	  
//	  @Test(priority =10, dataProvider = "getTestDataForDataExchange", description = " Add export task", enabled = true )
//	  public void AddExportTask(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException, AWTException
//	  {
//		  reporterLog("Starting testcase Export Tasks addition");
//		  log.info("******  Starting Testcase : Export Task additon *************");
//		  Thread.sleep(5000);
//		  //DataExchangepage.clickAdministrationPage();
//		  
//		  DataExchangepage.clickOnAddExportTask(strfilePath, ExportTask, ExportStatus,ImportService,ImportStatus,logLevel, dataselector, devicegroup, exportwindow, dataformatter, identifier, updateidentifier, seperator, method, Tobox, subjectbox, atname, atextension, importserviceupload);
//		  
//	      log.info("Export Tasks added");
//	      log.info("******  Ending Testcase : Export Task additon *************");}
//	      
////	    @Test(priority = 8, enabled = false)
////	  	public void Run() throws InterruptedException, AWTException
////
////	  	{
////	    	waitForTime(2000);
////	      DataExchangepage.run();
////	     }
//	    
//	    @Test(priority = 11, description = "Run now" )
//	  	public void Runnow() throws InterruptedException
//
//	  	{
//	    	waitForTime(2000);
//	      DataExchangepage.runnow();}
//	    
//	    @Test(priority = 12, description = "View History")
//	  	public void Viewhistory() throws InterruptedException
//
//	  	{
//	    	waitForTime(3000);
//	      DataExchangepage.Viewhistory();}
//	    
//	    @Test(priority = 13, description = "Edit Export Task" )
//	  	public void Edit() throws InterruptedException
//
//	  	{
//	    	waitForTime(2000);
//	      DataExchangepage.Edit();
//	      DataExchangepage.clickAdministrationPage();
//	  }
////	    ConnexoAdmin_UploadFIleForImport_FileUpload	  
//	    
//	    @Test(priority =14, dataProvider = "getTestDataForDataExchange",  description = "upload file" , enabled = true
//				  ) 
//		  
//		  public void uploadfileforimportclick(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException, IOException
//			{
//			  reporterLog("Starting testcase Export File upload click");
//			  log.info("******  Starting Testcase : Export File upload click *************");
//			  DataExchangepage.clickUploadFileforImportPage();
//			  
//			}
		  
	  @Test(priority =15, dataProvider = "getTestDataForDataExchange", description = "upload file" , enabled = true) 	  
	  public void uploadfileforimport(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus, String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException, IOException
		{
		  reporterLog("Starting testcase Export File upload");
		  log.info("******  Starting Testcase : Export File upload *************");
		  
		  DataExchangepage.uploadfileforimport(strfilePath,ExportTask, ExportStatus,ImportService,ImportStatus,logLevel, dataselector, devicegroup, exportwindow, dataformatter, identifier, updateidentifier, seperator, method, Tobox, subjectbox, atname, atextension, importserviceupload);
		  
	      log.info("Export File uploaded");
	      log.info("************************Assertions verified for export task added***************************");
	      log.info("******  Ending Testcase : Export File upload *************");
		}  

}
