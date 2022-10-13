package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.DataCollectionMyOpenIssuesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataCollectionMyOpenIssuesTest extends TestBase {
	String DataCollectionMyOpenIssues = "Myopenissues";
	Logger log = LogManager.getLogger(DataCollectionMyOpenIssuesTest.class);	
	DataCollectionMyOpenIssuesPage DataCollectionMyOpenIssuesPage;

	public DataCollectionMyOpenIssuesTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataFormyopenissues() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(DataCollectionMyOpenIssues);
		return testData;
	}

	@Test(priority = 1, dataProvider = "getTestDataFormyopenissues",description="Apply My open Issue -Data Collection" )
	public void ApplyMyopenIssue(String reason)
	{
		DataCollectionMyOpenIssuesPage = new DataCollectionMyOpenIssuesPage();
		DataCollectionMyOpenIssuesPage.clickDataCollectionMyOpenIssues();
		reporterLog("Starting Test case Apply my open issue");
		log.info("*************** Starting test case : Apply my open issue***************************");
		DataCollectionMyOpenIssuesPage.ApplyMyOpenIssuesConnectionIssue(reason); 
		log.info("*************** Ending test case : Apply my open issue***************************");
	}
	
	
	@Test (priority = 2, description = "Verify Navigation to Workspace DC open issues page",enabled = true)	
	public void NavigationToDCOpenIssuesPage() 
	
	{			
		
		WebElement wrkspace = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_workspace")));
		TestUtil.waitforElementTobeLocated(wrkspace, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(wrkspace);
	    WebElement opniss = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_openIssuesPage")));
		TestUtil.waitforElementTobeLocated(opniss, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(opniss);
		
	}





	@Test (priority = 27, description = "device dropdown filter",enabled = false)

	public void clickwrkopnissdevdd() throws InterruptedException

	{
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
		
		WebElement issdevdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_devicedd")));
		TestUtil.waitforElementTobeLocated(issdevdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevdd);

		
		WebElement issdevddsel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_deviceddsel")));
		TestUtil.waitforElementTobeLocated(issdevddsel , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevddsel);
		
		WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(issdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevselapply);
		
		waitForTime(500);
		
		WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
		
		ConnexoWorkSpace_Issues_ClearAllButton.click();
		
		waitForTime(500);
	}


	@Test (priority = 28, description = "duedate dropdown filter",enabled = false)

	public void clickwrkopnissduedtdd() throws InterruptedException
	{
		WebElement issduedtdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_duedatedd")));
		TestUtil.waitforElementTobeLocated(issduedtdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issduedtdd);

		WebElement issduedtdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_duedatedd1")));
		TestUtil.waitforElementTobeLocated(issduedtdd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issduedtdd1);
		WebElement issduedtdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_duedatedd2")));
		TestUtil.waitforElementTobeLocated(issduedtdd2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issduedtdd2);
		WebElement issduedtdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_duedatedd3")));
		TestUtil.waitforElementTobeLocated(issduedtdd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issduedtdd3);
		
		WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(issdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}





	@Test (priority = 29, description = "Type dropdown filter",enabled = false)

	public void clickpnisswrktypedd() throws InterruptedException
	{
		WebElement isstypedd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typedd")));
		TestUtil.waitforElementTobeLocated(isstypedd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isstypedd);

		WebElement isstypedddv = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDV")));
		TestUtil.waitforElementTobeLocated(isstypedddv , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isstypedddv);
		
		
		WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(issdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevselapply);
		
		WebElement isstypedd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typedd")));
		TestUtil.waitforElementTobeLocated(isstypedd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isstypedd1);

		
		WebElement isstypedddc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDC")));
		TestUtil.waitforElementTobeLocated(isstypedddc , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isstypedddc);
		
		WebElement issdevselapply1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(issdevselapply1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevselapply1);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}



	@Test (priority = 30, description = "workgroup dropdown filter",enabled = false)

	public void clickopnwrkgrdd() throws InterruptedException
	{
		WebElement isswrkgrpdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_isswrkgrpdd")));
		TestUtil.waitforElementTobeLocated(isswrkgrpdd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isswrkgrpdd);
		
		WebElement isswrkgrpdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_isswrkgrpdd1")));
		TestUtil.waitforElementTobeLocated(isswrkgrpdd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isswrkgrpdd1);
		WebElement isswrkgrpdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_isswrkgrpdd2")));
		TestUtil.waitforElementTobeLocated(isswrkgrpdd2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isswrkgrpdd2);
		WebElement isswrkgrpdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_isswrkgrpdd3")));
		TestUtil.waitforElementTobeLocated(isswrkgrpdd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isswrkgrpdd3);
		WebElement isswrkgrpdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_isswrkgrpdd4")));
		TestUtil.waitforElementTobeLocated(isswrkgrpdd4 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(isswrkgrpdd4);
		WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(issdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);

	 
	}


	@Test (priority = 31, description = "user dropdown filter",enabled = false)

	public void clickopnissusrdd() throws InterruptedException
	{
		WebElement issusrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issusrdd")));
		TestUtil.waitforElementTobeLocated(issusrdd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issusrdd);
		
		WebElement issusrroot = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issroot")));
		TestUtil.waitforElementTobeLocated(issusrroot , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issusrroot);

		WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(issdevselapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issdevselapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);

	 
	}


	@Test (priority = 32, description = "status dropdown filter",enabled = false)

	public void clickopnissstatusbwdd() throws InterruptedException
	{
		WebElement issstatusdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd")));
		TestUtil.waitforElementTobeLocated(issstatusdd  , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issstatusdd);
		
		WebElement statusdd1= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd1")));
		TestUtil.waitforElementTobeLocated(statusdd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusdd1);
		
		WebElement statusdd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd2")));
		TestUtil.waitforElementTobeLocated(statusdd2, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusdd2);
		
		WebElement statusdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd3")));
		TestUtil.waitforElementTobeLocated(statusdd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusdd3);
		
		WebElement statusdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd4")));
		TestUtil.waitforElementTobeLocated(statusdd4 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusdd4);
		WebElement statusdd5 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd5")));
		TestUtil.waitforElementTobeLocated(statusdd5 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusdd5);
		WebElement statusdd6 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issstatusdd6")));
		TestUtil.waitforElementTobeLocated(statusdd6 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusdd6);

		WebElement statusapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(statusapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(statusapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}

	@Test (priority = 33, description = "reason dropdown filter",enabled = false)

	public void clickopnissreasonissdd() throws InterruptedException
	{
		WebElement issreasondd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issreasondd")));
		TestUtil.waitforElementTobeLocated(issreasondd , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issreasondd);
		
		WebElement reasoncf= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_issreasonconfail")));
		TestUtil.waitforElementTobeLocated(reasoncf , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(reasoncf);
		
		WebElement reasonapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
		TestUtil.waitforElementTobeLocated(reasonapply , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(reasonapply);
		
		waitForTime(3000);
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(3000);
	}



	@Test (priority = 34, description = "sort",enabled = false)

	public void clickopnisssort() throws InterruptedException
	{
		WebElement adsort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_adsort")));
		TestUtil.waitforElementTobeLocated(adsort , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(adsort);
		
		WebElement adsortduedt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_adsort-duedt")));
		TestUtil.waitforElementTobeLocated(adsortduedt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(adsortduedt);


		

	   }


	@Test (priority = 35, description = "download",enabled = false)

	public void clickopnissdwnld() throws InterruptedException
	{
		WebElement dwnld = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_downlodad")));
		TestUtil.waitforElementTobeLocated(dwnld , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(dwnld);
		waitForTime(500);
		WebElement dwnld2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_DC_exp")));
		TestUtil.waitforElementTobeLocated(dwnld2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(dwnld2);
		waitForTime(500);
		

	}

	@Test (priority = 36, description = "bulkaction",enabled = false)

	public void clickissbulkactions() throws InterruptedException
	{
		WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
		TestUtil.waitforElementTobeLocated(blkact , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(blkact);
		waitForTime(1200);

	}	
	@Test (priority = 37, description = "bulkaction_sel",enabled = false)

	public void clickopnissbulkactionssel() throws InterruptedException
	{
		
		WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
		TestUtil.waitforElementTobeLocated(selcall , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selcall);
		waitForTime(500);

	}

	@Test (priority = 38, description = "bulkaction_selone/uncheck",enabled = false)

	public void clickopnissbulkactionsselone() throws InterruptedException
	{
		
		WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
		TestUtil.waitforElementTobeLocated(selc , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selc);
		waitForTime(3000);
		
		WebElement selcone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
		TestUtil.waitforElementTobeLocated(selcone , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selcone);
		waitForTime(500);
		
		
		
		WebElement unchkall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-unchkall")));
		TestUtil.waitforElementTobeLocated(selcone , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(unchkall);
		waitForTime(500);
		
		WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
		TestUtil.waitforElementTobeLocated(selcone1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selcone1);
		waitForTime(500);
		
		
		WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
		TestUtil.waitforElementTobeLocated(selconenxt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selconenxt);
		waitForTime(500);
		
	  }

	@Test (priority = 39, description = "bulkaction_selalrmissassign",enabled = false)

	public void clickopnissbulkactionsselalrmactassign() throws InterruptedException
	{

		WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
		TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selconenxt2);
		waitForTime(500);
		
		WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
		TestUtil.waitforElementTobeLocated(selconenxt1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(selconenxt1);
		waitForTime(500);
		WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
		TestUtil.waitforElementTobeLocated(cnfm , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(cnfm);
		waitForTime(2000);
		WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
		TestUtil.waitforElementTobeLocated(finish , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(finish);
		waitForTime(500);
		
		
	}

	@Test (priority = 40, description = "bulkaction_selissactclose",enabled = false)

	public void clickopnissbulkactionsselissactclsalrm() throws InterruptedException

	{
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton.click();

	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(500);

	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(500);

	WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc2);
	waitForTime(3000);


	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(2000);


	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(2000);


	WebElement selactclose = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selactclose")));
	TestUtil.waitforElementTobeLocated(selactclose , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactclose);
	waitForTime(2000);

	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(5000);


	WebElement selactrea = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selactcloserea")));
	TestUtil.waitforElementTobeLocated(selactrea , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactrea);
	waitForTime(500);

	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);

	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(1000);


	}


	@Test (priority = 41, description = "bulkaction_selRetrycommtask",enabled = false)

	public void clickopnissbulkactionsselissactRetrycommtask() throws InterruptedException

	{
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton.click();

	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(3000);

	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);

	WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryCommtask")));
	TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selRetrycommtask);
	waitForTime(500);

	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);


	}


	@Test (priority = 42, description = "bulkaction_selRetrycommtasknow",enabled = false)

	public void clickopnissbulkactionsselissactRetrycommtasknow() throws InterruptedException

	{
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton.click();

	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(3000);

	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(500);

	WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc2);
	waitForTime(3000);

	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);

	WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryCommtasknow")));
	TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selRetrycommtask);
	waitForTime(500);

	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(2000);


	}


	@Test (priority = 43, description = "bulkaction_selRetrycommtasknow",enabled = false)

	public void clickopnissbulkactionsselissactRetryconnection() throws InterruptedException

	{
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton.click();

	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(3000);

	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(500);

	WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc2);
	waitForTime(3000);

	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);

	WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryConn")));
	TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selRetrycommtask);
	waitForTime(500);

	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);


	}

	@Test (priority = 44, description = "bulkaction_selissactprio",enabled = false)

	public void clickopnissbulkactionsselissactsetprio() throws InterruptedException

	{
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton.click();

	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(3000);

	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(500);

	WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc2);
	waitForTime(3000);

	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);

	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);


	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);


	}

	@Test (priority = 45, description = "bulkaction_selissactsnz",enabled = false)

	public void clickopnsissbulkactionsselissactsnz() throws InterruptedException

	{
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton.click();

	waitForTime(3000);

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(3000);

	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(500);

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);

	WebElement selactsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selactpriosnooze")));
	TestUtil.waitforElementTobeLocated(selactsnz , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selactsnz);
	waitForTime(500);

	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);


	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);

	WebElement ConnexoWorkSpace_Issues_ClearAllButton1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Issues_ClearAllButton1.click();

	waitForTime(500);

	}


	@Test (priority = 46, description = "bulkaction_selall",enabled = false)

	public void clickopnissbulkactionsselall() throws InterruptedException

	{

	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(500);

	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(500);

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(500);
	
	WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryCommtask")));
	TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selRetrycommtask);
	waitForTime(500);



	WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt2);
	waitForTime(500);

	WebElement cnfm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selconfirm")));
	TestUtil.waitforElementTobeLocated(cnfm , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(cnfm);
	waitForTime(2000);
	WebElement finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selfinish")));
	TestUtil.waitforElementTobeLocated(finish , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(finish);
	waitForTime(500);

	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

	ConnexoWorkSpace_Alarms_ClearAllButton.click();

	waitForTime(500);
	}

	@Test (priority = 47, description = "scrollpage",enabled = false)
	public void scrollopnIssrmpage() throws InterruptedException
	{


	WebElement scrollpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_alperpage")));	
	TestUtil.waitforElementTobeLocated(scrollpage, 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	scrolldown(scrollpage);
	waitForTime(5000);
	}

	@Test (priority = 48, description = "perpage",enabled = false)

	public void clickopnbulkactionsselisperpage() throws InterruptedException
	{

	WebElement selc50page = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_al50perpage")));
	TestUtil.waitforElementTobeLocated(selc50page , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc50page);
	waitForTime(5000);


	}
}

