package com.ConnexoAdmin.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ConnexoAdmin.pages.ApplicationServers.MessageQueuesPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MessageQueuesOverviewTest extends TestBase {
	Logger log = LogManager.getLogger(MessageQueuesOverviewTest.class);
	String MessageQueuesSheet = "MessageQueues";
	MessageQueuesPage MessageQueuesPage;

	public MessageQueuesOverviewTest() {
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataForMessageQueues() {
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(MessageQueuesSheet);
		return testData;
	}

	@Test(priority = 1, enabled = true, description="verifyMessageQueueErrorMessageForNameInput", dataProvider = "getTestDataForMessageQueues")
	public void verifyMessageQueueErrorMessageForNameInput(String TypeValue)		
	{		
		log.info("****** Starting the Test Case : verifyMessageQueueErrorMessageForNameInput *************");
		MessageQueuesPage = new MessageQueuesPage();
		MessageQueuesPage.clickMessagequeues();
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.clickTypeDropdown();
		MessageQueuesPage.clickTypeOptions(TypeValue);
		MessageQueuesPage.clickAddButton();
		String ExpectedValue = "This field is required";
		
		assertEquals(MessageQueuesPage.getErrorMessageDisplayedForNameInputField(), ExpectedValue, "Error message is not displayed for empty name input field");

		MessageQueuesPage.clickCancelButton();
		log.info("****** Ending the Test Case : verifyMessageQueueErrorMessageForNameInput *************");	
	}
	
	@Test(priority = 2, enabled = true, description="verifyMessageQueueErrorMessageForMaxLengthNameInputField", dataProvider = "getTestDataForMessageQueues")
	public void verifyMessageQueueErrorMessageForMaxLengthNameInputField(String TypeValue)		
	{		
		log.info("****** Starting the Test Case : verifyMessageQueueErrorMessageForMaxLengthNameInputField *************");		
		String name= "bcuwvyaxiskxiaydsbcjdncjdou";
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.AddMessageQueueNameInput(name);
		MessageQueuesPage.clickTypeDropdown();
		MessageQueuesPage.clickTypeOptions(TypeValue);
		MessageQueuesPage.clickAddButton();
		String ExpectedValue = "Queue name is too long.";
		
		assertEquals(MessageQueuesPage.getErrorMessageDisplayedForNameInputField(), ExpectedValue, "Error message is not displayed for max length for name input field");

		MessageQueuesPage.clickCancelButton();
		log.info("****** Ending the Test Case : verifyMessageQueueErrorMessageForMaxLengthNameInputField *************");	
	}
	
	@Test(priority = 3, enabled = true, description="verifyMessageQueueErrorMessageWithNumaricCharForNameInputField", dataProvider = "getTestDataForMessageQueues")
	public void verifyMessageQueueErrorMessageWithNumaricCharForNameInputField(String TypeValue)		
	{		
		log.info("****** Starting the Test Case : verifyMessageQueueErrorMessageWithNumaricCharForNameInputField *************");		
		String name= "A1";
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.AddMessageQueueNameInput(name);
		MessageQueuesPage.clickTypeDropdown();
		MessageQueuesPage.clickTypeOptions(TypeValue);
		MessageQueuesPage.clickAddButton();
		String ExpectedValue = "Queue name is missing or contains forbidden characters.";
		
		assertEquals(MessageQueuesPage.getErrorMessageDisplayedForNameInputField(), ExpectedValue, "Error message is not displayed for max length for name input field");

		MessageQueuesPage.clickCancelButton();
		log.info("****** Ending the Test Case : verifyMessageQueueErrorMessageWithNumaricCharForNameInputField *************");	
	}
	
	@Test(priority = 4, enabled = true, description="verifyMessageQueueErrorMessageForTypeDropdown")
	public void verifyMessageQueueErrorMessageForTypeDropdown()		
	{		
		log.info("****** Starting the Test Case : verifyMessageQueueErrorMessageForTypeDropdown *************");		
		String name= "test";
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.AddMessageQueueNameInput(name);
		MessageQueuesPage.clickAddButton();
		String ExpectedValue = "This field is required";
		
		assertEquals(MessageQueuesPage.getErrorMessageDisplayedForTypeDropdown(), ExpectedValue, "Error message is not displayed for empty type dropdown field");

		MessageQueuesPage.clickCancelButton();
		log.info("****** Ending the Test Case : verifyMessageQueueErrorMessageForTypeDropdown *************");	
	}
	
	@Test(priority = 5, enabled = true, description="verifyCancelButton")
	public void verifyCancelButton()		
	{		
		log.info("****** Starting the Test Case : verifyCancelButton *************");		
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.clickCancelButton();
		
		assertTrue(MessageQueuesPage.isAddMessageQueueButtonDisplayed(), "Clicking cancel button should navigate to message queue page");

		log.info("****** Ending the Test Case : verifyCancelButton *************");	
	}
	
	@Test(priority = 6, enabled = true, description="verifyAddButton", dataProvider = "getTestDataForMessageQueues")
	public void verifyAddButton(String TypeValue)		
	{		
		log.info("****** Starting the Test Case : verifyAddButton *************");		
		String name= "abcd";
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.AddMessageQueueNameInput(name);
		MessageQueuesPage.clickTypeDropdown();
		MessageQueuesPage.clickTypeOptions(TypeValue);
		MessageQueuesPage.clickAddButton();
		
		assertTrue(MessageQueuesPage.isCreatedMessageQueueDisplayed(name.toUpperCase()), "Clicking add button should create message queue");

		log.info("****** Ending the Test Case : verifyAddButton *************");	
	}
	
	@Test(priority = 7, enabled = true, description="verifyAddExistingQueue", dataProvider = "getTestDataForMessageQueues")
	public void verifyAddExistingQueue(String TypeValue)		
	{		
		log.info("****** Starting the Test Case : verifyAddExistingQueue *************");		
		String name= "abcd";
		MessageQueuesPage.clickonAddMessageQueue();
		MessageQueuesPage.AddMessageQueueNameInput(name);
		MessageQueuesPage.clickTypeDropdown();
		MessageQueuesPage.clickTypeOptions(TypeValue);
		MessageQueuesPage.clickAddButton();
		String ExpectedValue = "Queue is already defined";
		
		assertEquals(MessageQueuesPage.getErrorMessageDisplayedForNameInputField(), ExpectedValue, "Error message is not displayed for Already existing queue");

		MessageQueuesPage.clickCancelButton();
		MessageQueuesPage.RemoveMessageQueue(name.toUpperCase());
		log.info("****** Ending the Test Case : verifyAddExistingQueue *************");	
	}
	
	@Test(priority = 8, enabled = true, description="verifySaveSettingsButton")
	public void verifySaveSettingsButtonEabled()		
	{		
		log.info("****** Starting the Test Case : verifySaveSettingsButtonEabled *************");		
		String updateCount= "9";
		browserRefresh();
		MessageQueuesPage.updateRetriesValueInTableResults(updateCount);
		
		assertTrue(MessageQueuesPage.isSaveSettingsEnabled(), "save settings button is enabled after update values in table");

		log.info("****** Ending the Test Case : verifySaveSettingsButtonEabled *************");	
	}
	
	@Test(priority = 9, enabled = true, description="verifyUndoButton")
	public void verifyUndoButtonEabled()		
	{		
		log.info("****** Starting the Test Case : verifyUndoButtonEabled *************");		
		String updateCount= "9";
		browserRefresh();
		MessageQueuesPage.updateRetriesValueInTableResults(updateCount);
		
		assertTrue(MessageQueuesPage.isUndoEnabled(), "undo button is enabled after update values in table");

		log.info("****** Ending the Test Case : verifyUndoButtonEabled *************");	
	}
	
	@Test(priority = 10, enabled = true, description="verifyByClickingSaveSettingsButton")
	public void verifyByClickingSaveSettingsButton()		
	{		
		log.info("****** Starting the Test Case : verifyByClickingSaveSettingsButton *************");		
		String updateCount= "9";
		browserRefresh();
		MessageQueuesPage.updateRetriesValueInTableResults(updateCount);
		MessageQueuesPage.clickSaveSettingsButton();
		
		assertEquals(MessageQueuesPage.getRetriesValueFromTableResult(), updateCount, "Clicking save settings button should update retries value");

		log.info("****** Ending the Test Case : verifyByClickingSaveSettingsButton *************");	
	}
	
	@Test(priority = 11, enabled = true, description="verifyByClickingUndoButton")
	public void verifyByClickingUndoButton()		
	{		
		log.info("****** Starting the Test Case : verifyByClickingUndoButton *************");
		String previousCount = MessageQueuesPage.getRetriesValueFromTableResult();
		String newCount= "5";
		browserRefresh();
		MessageQueuesPage.updateRetriesValueInTableResults(newCount);
		MessageQueuesPage.clickUndoButton();
		
		assertEquals(MessageQueuesPage.getRetriesValueFromTableResult(), previousCount, "updated values should not match");

		MessageQueuesPage.clickSaveSettingsButton();
		log.info("****** Ending the Test Case : verifyByClickingUndoButton *************");	
	}
	
	@Test(priority = 12, enabled = true, description="verifyTimeBeforeRetryBySaveChanges")
	public void verifyTimeBeforeRetryBySaveChanges()		
	{		
		log.info("****** Starting the Test Case : verifyTimeBeforeRetryBySaveChanges *************");		
		String updateCount= "9";
		browserRefresh();
		MessageQueuesPage.updateTimeBeforeRetryValueInTableResults(updateCount);
		MessageQueuesPage.clickSaveSettingsButton();
		
		assertEquals(MessageQueuesPage.getTimeBeforeRetryValueFromTableResult(), updateCount+" minutes", "Clicking save settings button should update retries value");

		log.info("****** Ending the Test Case : verifyTimeBeforeRetryBySaveChanges *************");	
	}
	
	@Test(priority = 13, enabled = true, description="verifyTimeBeforeRetryByUndoChanges")
	public void verifyTimeBeforeRetryByUndoChanges()		
	{		
		log.info("****** Starting the Test Case : verifyTimeBeforeRetryByUndoChanges *************");
		String previousCount = MessageQueuesPage.getRetriesValueFromTableResult();
		String newCount= "5";
		browserRefresh();
		MessageQueuesPage.updateTimeBeforeRetryValueInTableResults(newCount);
		MessageQueuesPage.clickUndoButton();
		
		assertEquals(MessageQueuesPage.getTimeBeforeRetryValueFromTableResult(), previousCount+" minutes", "updated values should not match");

		log.info("****** Ending the Test Case : verifyTimeBeforeRetryByUndoChanges *************");	
	}
}
