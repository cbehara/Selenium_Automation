package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommunicationProtocolPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationProtocolTest extends TestBase {
	Logger log = LogManager.getLogger(CommunicationProtocolTest .class); 	
	CommunicationProtocolPage CommunicationProtocolPage;
	//ABB/GE PPM Issue1 OPUS
	//CommunicationProtocol
	String CommunicationProtocolSheet = "CommunicationProtocol";

	public CommunicationProtocolTest() 
	{
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataForCommunicationProtocol() {
		Object testData[][] = TestUtil.getTestData(CommunicationProtocolSheet);
		return testData;
	}


	@Test(priority = 1,description="Verify And Select Communication Protocol")
	public void verifyAndSelectCommunicationProtocol()

	{
		CommunicationProtocolPage = new CommunicationProtocolPage();
		CommunicationProtocolPage.clickonCommunicationProtocol();
		reporterLog("Starting Communication protocols");
		log.info("****************************** starting test case : Assertions verified for Communication protocols ***********************************");

		CommunicationProtocolPage.selectDropDownValue();
		log.info("****************************** Ending test case : Assertions verified for Communication protocols  *******");
	}

	@Test(priority = 2, description="Edit Communication Protocol Name", dataProvider = "getTestDataForCommunicationProtocol")
	public void editCommunicationProtocolName(String ProtocolName,String Devicetimezone)

	{
		reporterLog("Starting Communication protocols");
		log.info("****************************** starting test case : Edit Communication Protocol Name ***********************************");

		CommunicationProtocolPage.clickonCommunicationProtocolName(ProtocolName);

		log.info("****************************** Ending test case : Edit Communication Protocol Name  *******");
	}
	@Test(priority = 3, description="Timezone And Save", dataProvider = "getTestDataForCommunicationProtocol")
	public void devicetimezonedropdwon(String ProtocolName,String Devicetimezone)

	{
		reporterLog("Editing Communication protocols");
		log.info("****************************** starting test case : Edit Communication protocols***********************************");

		String ExpectedSaveProtcolMessage = "Protocol saved";
		CommunicationProtocolPage.selectDevicetimezone(Devicetimezone);       
		WebElement ActualSaveProtcolMessage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("conxoMultisense_ComProtocol_saveProtocolMessage")));

		SoftAssertfunction(ActualSaveProtcolMessage, ExpectedSaveProtcolMessage);

		log.info("****************************** Ending test case : Edit Communication protocols *******");
	}

	/*
	 * @Test(priority = 3, description="Check Bluk Request And Save")
	 * public void
	 * CheckBlukRequestAndSave()
	 * 
	 * { reporterLog("Editing Communication protocols"); log.
	 * info("****************************** starting test case : Edit Communication protocols***********************************"
	 * );
	 * 
	 * String ExpectedSaveProtcolMessage = "Protocol saved";
	 * CommunicationProtocolPage.selectCheckboxBulkRequest(); WebElement
	 * ActualSaveProtcolMessage = driver.findElement(By.xpath(prop.getProperty(
	 * "conxoMultisense_ComProtocol_saveProtocolMessage")));
	 * 
	 * SoftAssertfunction(ActualSaveProtcolMessage, ExpectedSaveProtcolMessage);
	 * 
	 * log.
	 * info("****************************** Ending test case : Edit Communication protocols *******"
	 * ); }
	 */
}

