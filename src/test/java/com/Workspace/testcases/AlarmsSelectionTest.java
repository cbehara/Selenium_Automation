package com.Workspace.testcases;


import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.AlarmsSelectionPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class AlarmsSelectionTest extends TestBase {

	Logger log = LogManager.getLogger(AlarmsSelectionTest.class);
	
	String AlarmsSheet = "Alarms";	
	
	AlarmsSelectionPage alarmsSelectionPage;	
	

	public AlarmsSelectionTest()
	{
		super();
	}		

	@DataProvider(name = "dp1")
    public Object[][] getTestDataForWorkspaceAlarms() 
    { 
   	 Object testData[][] = TestUtil.getTestDataFromWorkspace(AlarmsSheet);
   	 return testData;
    }

	@Test (priority = 1, description = "Verify Navigation to Workspace Alarms page")	
	public void verifyNavigationToAlarmsPage() 
	{			
		alarmsSelectionPage = new AlarmsSelectionPage();
		
		reporterLog("Starting testcase Verify Navigation to Workspace Alarms page");
		
		log.info("************* starting test case : Verify Navigation to Workspace Alarms page **************");

		log.info("Asserting Alarms page title");
		
		String expectedAlarmPageTitle = "Alarms";
		
		WebElement eleActualPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Title")));
		
		TestUtil.waitforElementTobeLocated(eleActualPageTitle, 5);
		
		SoftAssertfunction(eleActualPageTitle, expectedAlarmPageTitle);		
	
		log.info("************** Ending test case : Verify Navigation to Workspace Alarms page ****************");
	}
	
	

	
	
	@Test (priority = 2, description = "device dropdown filter",enabled = true)

	public void clickwrkalrmdevdd() throws InterruptedException
	
	{
		WebElement alrmdevdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_devicedd")));
		TestUtil.waitforElementTobeLocated(alrmdevdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevdd);
	
		
		WebElement alrmdevddsel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_deviceddsel")));
		TestUtil.waitforElementTobeLocated(alrmdevddsel , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevddsel);
		
		WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
		TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevselapply);
		
		waitForTime(500);
		
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(500);
	}
	
	
	@Test (priority = 3, description = "duedate dropdown filter",enabled = true)

	public void clickwrkalrmduedtdd() throws InterruptedException
	{
		WebElement alrmduedtdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd")));
		TestUtil.waitforElementTobeLocated(alrmduedtdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmduedtdd);
	
		WebElement alrmduedtdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd1")));
		TestUtil.waitforElementTobeLocated(alrmduedtdd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmduedtdd1);
		WebElement alrmduedtdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd2")));
		TestUtil.waitforElementTobeLocated(alrmduedtdd2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmduedtdd2);
		WebElement alrmduedtdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd3")));
		TestUtil.waitforElementTobeLocated(alrmduedtdd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmduedtdd3);
		
		WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
		TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}
	
	


	
	@Test (priority = 4, description = "cleared dropdown filter",enabled = true)

	public void clickwrkcleardd() throws InterruptedException
	{
		WebElement alrmcleardd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleardd")));
		TestUtil.waitforElementTobeLocated(alrmcleardd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmcleardd);
		WebElement alrmclearddyes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddyes")));
		TestUtil.waitforElementTobeLocated(alrmclearddyes , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmclearddyes);
		WebElement alrmclearddno = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddno")));
		TestUtil.waitforElementTobeLocated(alrmclearddno , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmclearddno);
		
		WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
		TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}
	
	
	
	@Test (priority = 5, description = "workgroup dropdown filter",enabled = true)

	public void clickwrkgrdd() throws InterruptedException
	{
		WebElement alrmwrkgrpdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd")));
		TestUtil.waitforElementTobeLocated(alrmwrkgrpdd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmwrkgrpdd);
		
		WebElement alrmwrkgrpdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd1")));
		TestUtil.waitforElementTobeLocated(alrmwrkgrpdd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmwrkgrpdd1);
		WebElement alrmwrkgrpdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd2")));
		TestUtil.waitforElementTobeLocated(alrmwrkgrpdd2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmwrkgrpdd2);
		WebElement alrmwrkgrpdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd3")));
		TestUtil.waitforElementTobeLocated(alrmwrkgrpdd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmwrkgrpdd3);
		WebElement alrmwrkgrpdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd4")));
		TestUtil.waitforElementTobeLocated(alrmwrkgrpdd4 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmwrkgrpdd4);
		WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
		TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	
     
	}
	
	
	@Test (priority = 6, description = "user dropdown filter",enabled = true)

	public void clickusrdd() throws InterruptedException
	{
		WebElement alrmusrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmusrdd")));
		TestUtil.waitforElementTobeLocated(alrmusrdd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmusrdd);
		
		WebElement alrmusrroot = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmroot")));
		TestUtil.waitforElementTobeLocated(alrmusrroot , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmusrroot);

		WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
		TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	
     
	}
	
	
	@Test (priority = 7, description = "created between dropdown filter",enabled = true)

	public void clickcreatedbwdd() throws InterruptedException
	{
		WebElement alrmcreatedbwdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_createdbwdd")));
		TestUtil.waitforElementTobeLocated(alrmcreatedbwdd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmcreatedbwdd);
		
		WebElement calfrm= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_createdbwcalfrm")));
		TestUtil.waitforElementTobeLocated(calfrm , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(calfrm);
		
		WebElement today = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_createdbwtoday")));
		TestUtil.waitforElementTobeLocated(today , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(today);
	
		
//		WebElement createdbwapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_createdbwapply")));
//		TestUtil.waitforElementTobeLocated(createdbwapply , 10);
//		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		doClear(createdbwapply);
		

		WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_createdmainapply")));
		TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alrmdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}
	
	@Test (priority = 8, description = "priority sort",enabled = true)
		
		public void clickpriorsort() throws InterruptedException
		{
			WebElement priorsort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_prioritysort")));
			TestUtil.waitforElementTobeLocated(priorsort , 10);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			doClick(priorsort);
			
			waitForTime(3000);
			WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
			
			ConnexoWorkSpace_Alarms_ClearAllButton.click();
			
			waitForTime(3000);
		
     
	}
	
	
	@Test (priority = 9,dataProvider = "dp1", description = "Select Alarm Filter And Apply", enabled = true)
	public void selectStatusAndApply(String combobox1, String itemlist, String status, String reason, String combobox2) 
	{			
		reporterLog("Starting test case select Alarm Filter And Apply");
		
		log.info("************** starting test case : select Alarm Filter And Apply************************");
		
		log.info("Selecting value in the Reason field");
		
		selectComboBoxItems(combobox2, itemlist, reason);		
		
		waitForTime(500);
		
		log.info("Selecting value in the Status field" );
		
		waitForTime(500);
		
		selectComboBoxItems(combobox1, itemlist, status);	

		log.info("************** Ending test case : select Alarm Filter And Apply ********************");
		waitForTime(3000);
		
		
	}
	
	@Test (priority = 10, description = "sort",enabled = true)
	
	public void clicksort() throws InterruptedException
	{
		WebElement adsort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_adsort")));
		TestUtil.waitforElementTobeLocated(adsort , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(adsort);
		
		WebElement adsortduedt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_adsort-duedt")));
		TestUtil.waitforElementTobeLocated(adsortduedt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(adsortduedt);

	
		
 
       }
	
	@Test (priority = 11, description = "rm sort",enabled = true)
	
	public void clickrmsort() throws InterruptedException
	{
		WebElement rmsort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_rmsort-duedt")));
		TestUtil.waitforElementTobeLocated(rmsort , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(rmsort);
		waitForTime(500);
		WebElement rmsort2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_rmsort-duedt")));
		TestUtil.waitforElementTobeLocated(rmsort2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(rmsort2);
	

}
	
	@Test (priority = 12, description = "download",enabled = true)
	
	public void clickdwnld() throws InterruptedException
	{
		WebElement dwnld = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_downlodad")));
		TestUtil.waitforElementTobeLocated(dwnld , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(dwnld);
		waitForTime(500);

    }
	
	@Test (priority = 13, description = "bulkaction",enabled = true)
	
	public void clickbulkactions() throws InterruptedException
	{
		WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact")));
		TestUtil.waitforElementTobeLocated(blkact , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(blkact);
		waitForTime(500);
	
    }	
	@Test (priority = 14, description = "bulkaction_sel",enabled = true)
	
	public void clickbulkactionssel() throws InterruptedException
	{
		WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-sel")));
		TestUtil.waitforElementTobeLocated(selc , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selc);
		waitForTime(500);
    }
	
	@Test (priority = 15, description = "bulkaction_selone/uncheck",enabled = true)
	
	public void clickbulkactionsselone() throws InterruptedException
	{
		
		WebElement selcone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selone")));
		TestUtil.waitforElementTobeLocated(selcone , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selcone);
		waitForTime(500);
		
		WebElement unchkall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-unchkall")));
		TestUtil.waitforElementTobeLocated(selcone , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(unchkall);
		waitForTime(500);
		
		WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selone")));
		TestUtil.waitforElementTobeLocated(selcone1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selcone1);
		waitForTime(500);
		
		
		WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
		TestUtil.waitforElementTobeLocated(selconenxt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selconenxt);
		waitForTime(500);
		
	  }
	
@Test (priority = 16, description = "bulkaction_selalrmactassign",enabled = true)
	
	public void clickbulkactionsselalrmactassign() throws InterruptedException
	{

		WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
		TestUtil.waitforElementTobeLocated(selconenxt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selconenxt);
		waitForTime(500);
		
		WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
		TestUtil.waitforElementTobeLocated(selconenxt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selconenxt1);
		waitForTime(500);
		WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selconfirm")));
		TestUtil.waitforElementTobeLocated(cnfm , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(cnfm);
		waitForTime(2000);
		WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selfinish")));
		TestUtil.waitforElementTobeLocated(finish , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(finish);
		waitForTime(500);
		
		
    }

@Test (priority = 17, description = "bulkaction_selalrmactclose",enabled = true)

public void clickbulkactionsselalrmactclsalrm() throws InterruptedException

{
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);
	
	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(500);
	
	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(2000);
	
	
	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(2000);

	
	WebElement selactclose = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selactclose")));
	TestUtil.waitforElementTobeLocated(selactclose , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactclose);
	waitForTime(2000);
	
	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(5000);
	
	
	WebElement selactrea = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selactcloserea")));
	TestUtil.waitforElementTobeLocated(selactrea , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactrea);
	waitForTime(500);
	
	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);
	
	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(1000);
	
	
}

@Test (priority = 18, description = "bulkaction_selalrmactprio",enabled = true)

public void clickbulkactionsselalrmactsetprio() throws InterruptedException

{
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);
	
	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(500);
	
	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);
	
	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);
	
	WebElement selactprio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selactprio")));
	TestUtil.waitforElementTobeLocated(selactprio , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactprio);
	waitForTime(500);
	
	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);
	
	
	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);
	
	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);
	
	
}
	
@Test (priority = 19, description = "bulkaction_selalrmactsnz",enabled = true)

public void clickbulkactionsselalrmactsnz() throws InterruptedException

{
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);
	
	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(500);
	
	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);
	
	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);
	
	WebElement selactsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selactpriosnooze")));
	TestUtil.waitforElementTobeLocated(selactsnz , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactsnz);
	waitForTime(500);
	
	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);

	
	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);
	
	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);
	
	
}
@Test (priority = 20, description = "bulkaction_selall",enabled = true)



public void clickbulkactionsselall() throws InterruptedException

{
	
	
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(500);
	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);
	
	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(500);
	
	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);
	
	WebElement selactsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selactpriosnooze")));
	TestUtil.waitforElementTobeLocated(selactsnz , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactsnz);
	waitForTime(500);
	
	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);

	
	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);
	
	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);
	
	
}

@Test (priority = 21, description = "scrollpage",enabled = true)
public void scrollAlarmpage() throws InterruptedException
{
	
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(500);
	
	WebElement scrollpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alperpage")));	
	TestUtil.waitforElementTobeLocated(scrollpage, 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	scrolldown(scrollpage);
	waitForTime(5000);
}

@Test (priority = 22, description = "perpage",enabled = true)

public void clickbulkactionsselalperpage() throws InterruptedException
{
	
	WebElement selc50page = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_al50perpage")));
	TestUtil.waitforElementTobeLocated(selc50page , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc50page);
	waitForTime(5000);


}
@Test (priority = 23, description = "Next page",enabled = true)

public void clickbulkactionsselalnextpage() throws InterruptedException
{
	WebElement selcnextpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_nextpage")));
	TestUtil.waitforElementTobeLocated(selcnextpage , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcnextpage);
	waitForTime(2000);
	
}

@Test (priority = 24, description = "alarms overview page",enabled = true)
public void verifyNavigationToAlarmsoverviewPage() 
{			
	
	WebElement wrk = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_workspace")));
	TestUtil.waitforElementTobeLocated(wrk , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(wrk);
	waitForTime(3000);
	
	WebElement ovr = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsOverviewPage_Title")));
	TestUtil.waitforElementTobeLocated(ovr , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(ovr);
	waitForTime(3000);
	
}
@Test (priority = 25, description = "duedate dropdown filter",enabled = true)

public void clickwrkalrmovrduedtdd() throws InterruptedException
{
	WebElement alrmduedtdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd, 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd);

	WebElement alrmduedtdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd1")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd1);
	WebElement alrmduedtdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd2")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd2);
	WebElement alrmduedtdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd3")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd3 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd3);
	
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}





@Test (priority = 26, description = "cleared dropdown filter",enabled = true)

public void clickalrmovrcleardd() throws InterruptedException
{
	WebElement alrmcleardd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleardd")));
	TestUtil.waitforElementTobeLocated(alrmcleardd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmcleardd);
	WebElement alrmclearddyes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddyes")));
	TestUtil.waitforElementTobeLocated(alrmclearddyes , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmclearddyes);
	WebElement alrmclearddno = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddno")));
	TestUtil.waitforElementTobeLocated(alrmclearddno , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmclearddno);
	
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 27, description = "workgroup dropdown filter",enabled = true)

public void clickalrmovrwrkgrdd() throws InterruptedException
{
	WebElement alrmwrkgrpdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd);
	
	WebElement alrmwrkgrpdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd1")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd1);
	WebElement alrmwrkgrpdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd2")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd2);
	WebElement alrmwrkgrpdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd3")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd3 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd3);
	WebElement alrmwrkgrpdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd4")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd4 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd4);
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

 
}


@Test (priority = 28, description = "user dropdown filter",enabled = true)

public void clickalaovrusrdd() throws InterruptedException
{
	WebElement alrmusrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmusrdd")));
	TestUtil.waitforElementTobeLocated(alrmusrdd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmusrdd);
	
	WebElement alrmusrroot = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmroot")));
	TestUtil.waitforElementTobeLocated(alrmusrroot , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmusrroot);

	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

 
}

@Test (priority = 29, description = "open alarms page",enabled = true)
public void verifyNavigationToopenAlarmsPage() 
{			
	
	WebElement wrk = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_workspace")));
	TestUtil.waitforElementTobeLocated(wrk , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(wrk);
	waitForTime(3000);
	
	WebElement ovr = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsopenPage_Title")));
	TestUtil.waitforElementTobeLocated(ovr , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(ovr);
	waitForTime(3000);
	
}
@Test (priority = 30, description = "duedate dropdown filter",enabled = true)

public void clickwrkopenalrmduedtdd() throws InterruptedException
{
	WebElement alrmduedtdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd, 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd);

	WebElement alrmduedtdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd1")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd1);
	WebElement alrmduedtdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd2")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd2);
	WebElement alrmduedtdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd3")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd3 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd3);
	
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}


@Test (priority = 31, description = "cleared dropdown filter",enabled = true)

public void clickopenalrmcleardd() throws InterruptedException
{
	WebElement alrmcleardd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleardd")));
	TestUtil.waitforElementTobeLocated(alrmcleardd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmcleardd);
	WebElement alrmclearddyes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddyes")));
	TestUtil.waitforElementTobeLocated(alrmclearddyes , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmclearddyes);
	WebElement alrmclearddno = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddno")));
	TestUtil.waitforElementTobeLocated(alrmclearddno , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmclearddno);
	
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 32, description = "workgroup dropdown filter",enabled = true)

public void clickopenalrmwrkgrdd() throws InterruptedException
{
	WebElement alrmwrkgrpdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd);
	
	WebElement alrmwrkgrpdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd1")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd1);
	WebElement alrmwrkgrpdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd2")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd2);
	WebElement alrmwrkgrpdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd3")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd3 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd3);
	WebElement alrmwrkgrpdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd4")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd4 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd4);
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

 
}


@Test (priority = 33, description = "user dropdown filter",enabled = true)

public void clickopenalausrdd() throws InterruptedException
{
	WebElement alrmusrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmusrdd")));
	TestUtil.waitforElementTobeLocated(alrmusrdd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmusrdd);
	
	WebElement alrmusrroot = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmroot")));
	TestUtil.waitforElementTobeLocated(alrmusrroot , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmusrroot);

	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

 
}
@Test (priority = 34, description = "open alarms page",enabled = true)
public void verifyNavigationTowrkAlarmsPage() 
{			
	
	WebElement wrk = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_workspace")));
	TestUtil.waitforElementTobeLocated(wrk , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(wrk);
	waitForTime(3000);
	
	WebElement ovr = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsworkgroupPage_Title")));
	TestUtil.waitforElementTobeLocated(ovr , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(ovr);
	waitForTime(3000);
	
}
@Test (priority = 35, description = "duedate dropdown filter",enabled = true)

public void clickmywrkalrmduedtdd() throws InterruptedException
{
	WebElement alrmduedtdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd, 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd);

	WebElement alrmduedtdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd1")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd1);
	WebElement alrmduedtdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd2")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd2);
	WebElement alrmduedtdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_duedatedd3")));
	TestUtil.waitforElementTobeLocated(alrmduedtdd3 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmduedtdd3);
	
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}


@Test (priority = 36, description = "cleared dropdown filter",enabled = true)

public void clickwrknalrmcleardd() throws InterruptedException
{
	WebElement alrmcleardd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleardd")));
	TestUtil.waitforElementTobeLocated(alrmcleardd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmcleardd);
	WebElement alrmclearddyes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddyes")));
	TestUtil.waitforElementTobeLocated(alrmclearddyes , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmclearddyes);
	WebElement alrmclearddno = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_cleareddno")));
	TestUtil.waitforElementTobeLocated(alrmclearddno , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmclearddno);
	
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 37, description = "workgroup dropdown filter",enabled = true)

public void clickwrkalrmwrkgrdd() throws InterruptedException
{
	WebElement alrmwrkgrpdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd);
	
	WebElement alrmwrkgrpdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd1")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd1);
	WebElement alrmwrkgrpdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd2")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd2);
	WebElement alrmwrkgrpdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd3")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd3 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd3);
	WebElement alrmwrkgrpdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmwrkgrpdd4")));
	TestUtil.waitforElementTobeLocated(alrmwrkgrpdd4 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmwrkgrpdd4);
	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

 
}


@Test (priority = 38, description = "user dropdown filter",enabled = true)

public void clickwrkalausrdd() throws InterruptedException
{
	WebElement alrmusrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmusrdd")));
	TestUtil.waitforElementTobeLocated(alrmusrdd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmusrdd);
	
	WebElement alrmusrroot = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_alrmroot")));
	TestUtil.waitforElementTobeLocated(alrmusrroot , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmusrroot);

	WebElement alrmdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ApplyButton")));
	TestUtil.waitforElementTobeLocated(alrmdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(alrmdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);

 
}
}