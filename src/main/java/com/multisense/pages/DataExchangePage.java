package com.multisense.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class DataExchangePage extends TestBase {

	String taskname = generateRandomName(9);

	public String getFile()
	{
		return new File("resources/testdata/UploadFilesTestData.xlsx").getAbsolutePath();
	}


	public DataExchangePage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Administration();
	}
	
	public void clickExportHistory() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_ExportHistoryPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_ExportHistoryPage")));
		doClick(ConnexoMultisens_DataExchange_ExportHistoryPage);
	}
	
	public void clickImportHistory() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_ImportHistoryPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_ImportHistoryPage")));
		doClick(ConnexoMultisens_DataExchange_ImportHistoryPage);
	}
	
	public void clickAdministrationPage() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_AdministrationPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_AdministrationPage")));
		doClick(ConnexoMultisens_DataExchange_AdministrationPage);
	}

	public void clickUploadFileforImportPage() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_uploadfileimportpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_uploadfileimportpage")));
		doClick(ConnexoMultisens_DataExchange_uploadfileimportpage);
	}

	public void clickdataexporttaskspage() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_dataexporttaskspage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_dataexporttaskspage")));
		doClick(ConnexoMultisens_DataExchange_dataexporttaskspage);
}
	
	public void dataexporttaskspage() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_dataexporttasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_dataexporttasks")));
		doClick(ConnexoMultisens_DataExchange_dataexporttasks);
	}
	
	public void exportHistoryCheck(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus,  String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException
	{
		Thread.sleep(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisens_DataExchange_exporttaskdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_exporttaskdropdown")));
		ConnexoMultisens_DataExchange_exporttaskdropdown.click();
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options)
		{  
			if(element.getText().equals(ExportTask)){  

				element.click();
			}
		}
		
		WebElement ConnexoMultisens_DataExchange_exporthistorydropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_exporthistorydropdown")));
		ConnexoMultisens_DataExchange_exporthistorydropdown.click();
		List<WebElement> options1= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options1){  
			if(element.getText().equals(ExportStatus)){  

				element.click();
			}
		}
		
		WebElement ConnexoMultisens_DataExchange_exporthistoryapplybutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_exporthistoryapplybutton")));
		ConnexoMultisens_DataExchange_exporthistoryapplybutton.click();
	}	

	public void importHistoryCheck(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus,  String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException
	{
		Thread.sleep(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisens_DataExchange_importservicedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_importservicedropdown")));

		ConnexoMultisens_DataExchange_importservicedropdown.click();
		sendkeys(ImportService , ConnexoMultisens_DataExchange_importservicedropdown);
		ConnexoMultisens_DataExchange_importservicedropdown.sendKeys(Keys.ENTER);
		
		WebElement ConnexoMultisens_DataExchange_importhistoryapplybutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_importhistoryapplybutton")));
		ConnexoMultisens_DataExchange_importhistoryapplybutton.click();

	}

	public void importservices() throws InterruptedException
	{
		WebElement ConnexoMultisens_DataExchange_ImportServices = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_ImportServices")));
		doClick(ConnexoMultisens_DataExchange_ImportServices);
		WebElement ConnexoMultisens_DataExchange_ImportServicesperpagedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_ImportServicesperpagedropdown")));
		doClick(ConnexoMultisens_DataExchange_ImportServicesperpagedropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='50']")).click();

	}
	
	public void Addsort() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Add sort']/following-sibling::span")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Status'])[2]")).click();		
	}
	
	public void exportbuttonclick() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//span[@class='x-btn-icon-el icon-file-download ']")).click();
	}	

	public void clickOnAddExportTask(String strfilePath, String ExportTask, String ExportStatus, String ImportService, String ImportStatus,  String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException
	{

		WebElement ConnexoMultisens_DataExchange_addexporttask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_addexporttask")));
		WebElement ConnexoMultisens_DataExchange_addexporttask1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_addexporttask1")));

		{
			if (ConnexoMultisens_DataExchange_addexporttask.isDisplayed()){
				TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_addexporttask, 30);
				doClick(ConnexoMultisens_DataExchange_addexporttask);
				waitForTime(500);
			}
			else
			{
				TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_addexporttask1, 30);
				doClick(ConnexoMultisens_DataExchange_addexporttask1);
				waitForTime(500);
			}


			WebElement ConnexoMultisens_DataExchange_exporttaskname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_exporttaskname")));
			doClear(ConnexoMultisens_DataExchange_exporttaskname);
			doClick(ConnexoMultisens_DataExchange_exporttaskname);
			sendkeys(taskname, ConnexoMultisens_DataExchange_exporttaskname);

			WebElement ConnexoMultisens_DataExchange_logleveldropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_logleveldropdown")));
			doClick(ConnexoMultisens_DataExchange_logleveldropdown);
			WebElement loglevel= DriverUtility.getDriver().findElement(By.xpath("//ul[@class='x-list-plain']"));
			List<WebElement> loglevellist=loglevel.findElements(By.tagName("li"));
			for (WebElement li : loglevellist) {
				if (li.getText().equals(logLevel)) {
					li.click();
				}
			}

			WebElement ConnexoMultisens_DataExchange_dataselectordropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_dataselectordropdown")));
			doClick(ConnexoMultisens_DataExchange_dataselectordropdown);
			List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options){  
				if(element.getText().equals(dataselector)){  

					element.click();
				}
			}

			WebElement ConnexoMultisens_DataExchange_devicegroupdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_devicegroupdropdown")));
			doClick(ConnexoMultisens_DataExchange_devicegroupdropdown);

			List<WebElement> options1= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options1){  
				if(element.getText().equals(devicegroup)){  

					element.click();
				}
			}

			WebElement ConnexoMultisens_DataExchange_AddReadingTypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_AddReadingTypesbutton")));
			doClick(ConnexoMultisens_DataExchange_AddReadingTypesbutton);

			WebElement minutesBulkGas = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
			minutesBulkGas.click();
			WebElement minutesBulkGas1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
			minutesBulkGas1.click();
			WebElement minutesBulkGas2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
			minutesBulkGas2.click();

			WebElement ConnexoMultisens_DataExchange_Addreadingtypecheckboxbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_Addreadingtypecheckboxbutton")));
			doClick(ConnexoMultisens_DataExchange_Addreadingtypecheckboxbutton);

			WebElement ConnexoMultisens_DataExchange_ExportWindowdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_ExportWindowdropdown")));
			doClick(ConnexoMultisens_DataExchange_ExportWindowdropdown);
			List<WebElement> options7= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options7){  
				if(element.getText().equals(exportwindow)){  

					element.click();
				}
			}

			WebElement ConnexoMultisens_DataExchange_DataFormatterdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_DataFormatterdropdown")));
			doClick(ConnexoMultisens_DataExchange_DataFormatterdropdown);
			List<WebElement> options2= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options2){  
				if(element.getText().equals(dataformatter)){  

					element.click();
				}
			}

			WebElement ConnexoMultisens_DataExchange_Identifier = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_Identifier")));
			doClick(ConnexoMultisens_DataExchange_Identifier);
			sendkeys(identifier, ConnexoMultisens_DataExchange_Identifier);

			WebElement ConnexoMultisens_DataExchange_UpdateIdentifier = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_UpdateIdentifier")));
			doClick(ConnexoMultisens_DataExchange_UpdateIdentifier);
			sendkeys(updateidentifier, ConnexoMultisens_DataExchange_UpdateIdentifier);

			WebElement ConnexoMultisens_DataExchange_Seperatordropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_Seperatordropdown")));
			doClick(ConnexoMultisens_DataExchange_Seperatordropdown);


			List<WebElement> options3= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options3){  
				if(element.getText().equals(seperator)){  

					element.click();
				}
			}
			WebElement ConnexoMultisens_DataExchange_AddDestinationButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_AddDestinationButton")));
			doClick(ConnexoMultisens_DataExchange_AddDestinationButton);

			WebElement ConnexoMultisens_DataExchange_MethodDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_MethodDropDown")));
			doClick(ConnexoMultisens_DataExchange_MethodDropDown);
			List<WebElement> options4= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options4){  
				if(element.getText().equals(method)){  

					element.click();
				}
			}
			WebElement ConnexoMultisens_DataExchange_totextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_totextbox")));
			doClick(ConnexoMultisens_DataExchange_totextbox);
			sendkeys(Tobox, ConnexoMultisens_DataExchange_totextbox);

			WebElement ConnexoMultisens_DataExchange_subjecttextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_subjecttextbox")));
			doClick(ConnexoMultisens_DataExchange_subjecttextbox);
			sendkeys(subjectbox, ConnexoMultisens_DataExchange_subjecttextbox);

			WebElement ConnexoMultisens_DataExchange_attachmentname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_attachmentname")));
			doClick(ConnexoMultisens_DataExchange_attachmentname);
			sendkeys(atname, ConnexoMultisens_DataExchange_attachmentname);

			WebElement ConnexoMultisens_DataExchange_attachmentExtension = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_attachmentExtension")));
			doClick(ConnexoMultisens_DataExchange_attachmentExtension);
			sendkeys(atextension, ConnexoMultisens_DataExchange_attachmentExtension);

			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Add']/following-sibling::span")).click();
			WebElement ConnexoMultisens_DataExchange_addbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_addbutton")));
			doClick(ConnexoMultisens_DataExchange_addbutton);
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(2000);		
		}			
	}	
	
	public void run() throws InterruptedException, AWTException 
	{
		Robot robot = new Robot();
		waitForTime(5000);
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ taskname +"']//ancestor::td//following-sibling::td//span")); 
		scrolldown(a);
		waitForTime(3000);
		WebElement ConnexoMultisens_DataExchange_RunExportTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_RunExportTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_RunExportTask, 50);
		doClick(ConnexoMultisens_DataExchange_RunExportTask);
		waitForTime(2000);
		
		WebElement ConnexoMultisens_DataExchange_startdate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_startdate")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_startdate, 50);
		doClick(ConnexoMultisens_DataExchange_startdate);
		robot.keyPress(KeyEvent.VK_ENTER); robot.delay(100);		
		
		WebElement ConnexoMultisens_DataExchange_enddate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_enddate")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_enddate, 20);
		doClickjavaScript(ConnexoMultisens_DataExchange_enddate);
		robot.keyPress(KeyEvent.VK_RIGHT); robot.delay(100);
		robot.keyPress(KeyEvent.VK_TAB); robot.delay(100);

		WebElement ConnexoMultisens_DataExchange_RunbuttonExportTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_RunbuttonExportTask")));
		doClick(ConnexoMultisens_DataExchange_RunbuttonExportTask);		
		
	}
	
	public void Edit() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ taskname +"']//ancestor::td//following-sibling::td//span")); 
		scrolldown(a);
		waitForTime(3000);
		WebElement ConnexoMultisens_DataExchange_EditExportTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_EditExportTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_EditExportTask, 10);
		doClick(ConnexoMultisens_DataExchange_EditExportTask);
		WebElement ConnexoMultisens_DataExchange_SaveExportTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_SaveExportTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_SaveExportTask, 10);
		doClick(ConnexoMultisens_DataExchange_SaveExportTask);
		waitForTime(2000);
		
	}
	
	public void Viewhistory() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ taskname +"']//ancestor::td//following-sibling::td//span")); 
		scrolldown(a);
		waitForTime(3000);
		WebElement ConnexoMultisens_DataExchange_Viewhistory = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_Viewhistory")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_Viewhistory, 10);
		doClick(ConnexoMultisens_DataExchange_Viewhistory);
		waitForTime(2000);
		dataexporttaskspage();
		
	}
	
	
	public void runnow() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(2000);
		
		WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ taskname +"']//ancestor::td//following-sibling::td//span")); 
		scrolldown(a);
		waitForTime(3000);
		WebElement ConnexoMultisens_DataExchange_RunNowExportTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_RunNowExportTask")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_RunNowExportTask, 10);
		doClick(ConnexoMultisens_DataExchange_RunNowExportTask);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ taskname +"')]//ancestor::div//a[normalize-space()='Run']")).click();
		
	}
	
		public void uploadfileforimport(String strfilePath,String ExportTask, String ExportStatus, String ImportService, String ImportStatus,  String logLevel, String dataselector, String devicegroup, String exportwindow, String dataformatter, String identifier, String updateidentifier, String seperator, String method, String Tobox, String subjectbox, String atname, String atextension, String importserviceupload) throws InterruptedException, IOException
		{
			
			//String currentDir = System.getProperty("user.dir");
			//String strfilePath = currentDir + "//Generic-Library//Data//DATA.txt";
			Thread.sleep(5000);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			WebElement ConnexoMultisens_DataExchange_importservicedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_importservicedropdown")));
			ConnexoMultisens_DataExchange_importservicedropdown.click();
			List<WebElement> options9= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
			for (WebElement element : options9){  
			     if(element.getText().equals(importserviceupload)){  

				element.click();
			}
		}
		WebElement ConnexoMultisens_DataExchange_selectfile = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_selectfile")));
		//doClickjavaScript(TestUtil.waitforElementTobeLocated(ConnexoMultisens_DataExchange_selectfile, 60));
		sendkeys(getFile(), ConnexoMultisens_DataExchange_selectfile);		
		waitForTime(2000);
//		Runtime.getRuntime().exec(exeFilepath+" "+strfilePath);
//		waitForTime(1000);
//		sendkeys(getFile(), ConnexoMultisens_DataExchange_selectfile);		
//		waitForTime(2000);
		WebElement ConnexoMultisens_DataExchange_Uploadbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisens_DataExchange_Uploadbutton")));
		doClick(ConnexoMultisens_DataExchange_Uploadbutton);
		Thread.sleep(10000);


	}
}



