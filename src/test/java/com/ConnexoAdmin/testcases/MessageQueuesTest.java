package com.ConnexoAdmin.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ConnexoAdmin.pages.ApplicationServers.MessageQueuesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class MessageQueuesTest extends TestBase {
	Logger log = LogManager.getLogger(MessageQueuesTest.class);

	String MessageQueuesSheet = "MessageQueues";
	MessageQueuesPage MessageQueuesPage;

	public MessageQueuesTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForMessageQueues() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(MessageQueuesSheet);
		return testData;
	}

	@Test(priority = 1, description="verify And Select Add Message Queues")
	public void verifyAndSelectMessageQueues()		
	{		
		MessageQueuesPage = new MessageQueuesPage();
		
		MessageQueuesPage.clickMessagequeues();
		
		reporterLog("Starting testcase Verify and Select Message queues");
		
		log.info("****** Starting the Test Case : Verify and Select Message queues *************");		

		String ExpectedValue= "Message queues";
		
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_VerifytextMessageQueues")));        
		
		SoftAssertfunction(ActualValue, ExpectedValue);
		
		MessageQueuesPage.clickonAddMessageQueue();

		log.info("****** Ending the Test Case : Verify and Select Message queues *************");	
	}

	@Test(priority = 2, dataProvider = "getTestDataForMessageQueues", description="Create Message Queues")
	public void CreatedMessageQueues(String TypeValue)
	{
		reporterLog("Starting testcase Create Message queues");
		
		log.info("****** Starting the Test Case : Adding testcase Create Message queues *************");		   

		MessageQueuesPage.CreateMessageQueues(TypeValue);	

		String ExpetedaddMessageueuesvalue = "Queue added"; 
		
		WebElement ActualaddMessageQueuesvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextQueueadded")));       
		
		SoftAssertfunction(ActualaddMessageQueuesvalue, ExpetedaddMessageueuesvalue);
		
		log.info("****** Ending the Test Case : Adding testcase Create Message queues *************");
	}

	@Test(priority = 3, dataProvider = "getTestDataForMessageQueues", description="Monitor Message Queues")
	public void MonitorMessageQueues(String TypeValue)		
	{	
		reporterLog("Starting testcase Monitor Message queues");
		
		log.info("****** Starting the testcase : Monitor Message queues *************");
		
		MessageQueuesPage.clickOnMonitorMessageQueue();	
		
		log.info("****** Ending the testcase : Monitor Message queues *************");	
	}

	@Test(priority = 4, dataProvider = "getTestDataForMessageQueues", description="Clear Error Message Queue")
	public void ClearErrorMessageQueue(String TypeValue)		
	{
		reporterLog("Starting testcase Clear ErrorMessage Queue");
		
		log.info("****** Starting the Test Case : Clear Message queues *************");		

		MessageQueuesPage.clickOnClearErrorMessageQueue();	
		
		String ExpetedErrorqueueclearedvalue = "Error queue cleared"; 
		
		WebElement ActualErrorqueueclearedvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextErrorQueueCleared")));        
		
		SoftAssertfunction(ActualErrorqueueclearedvalue, ExpetedErrorqueueclearedvalue);
		
		log.info("****** Ending the Test Case : Clear Message queues *************");
	}

	@Test(priority = 5, dataProvider = "getTestDataForMessageQueues", description="Remove Message Queues")
	public void RemovedMessageQueues(String TypeValue)
	{
		reporterLog("Starting testcase Remove Message queues");
		
		log.info("****** Starting testcase : Remove Message queues *************");	
		
		MessageQueuesPage.RemoveMessageQueues();	

		String ExpetedremoveMQvalue = "Queue removed"; 
		
		WebElement ActualremoveMQvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextQueueremoved")));    
		
		SoftAssertfunction(ActualremoveMQvalue, ExpetedremoveMQvalue);

		log.info("************** Ending Test Case : Remove Message queues *******************");
	}

}
