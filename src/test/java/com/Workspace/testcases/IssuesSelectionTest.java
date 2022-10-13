package com.Workspace.testcases;


import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.IssuesSelectionPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class IssuesSelectionTest extends TestBase {

	Logger log = LogManager.getLogger(IssuesSelectionTest.class);
	
	String IssuesSheet = "Issues";	
	
	IssuesSelectionPage issuesSelectionPage;	
	

	public IssuesSelectionTest()
	{
		super();
	}		

	@DataProvider(name = "dp1")
    public Object[][] getTestDataForWorkspaceIssues() 
    { 
   	 Object testData[][] = TestUtil.getTestDataFromWorkspace(IssuesSheet);
   	 return testData;
    }



@Test (priority = 1, description = "Verify Navigation to Workspace Issues page")	
public void verifyNavigationToIssuesPage() 
{			
	issuesSelectionPage = new IssuesSelectionPage();
	
	reporterLog("Starting testcase Verify Navigation to Workspace Issues page");
	
	log.info("************* starting test case : Verify Navigation to Workspace Issues page **************");

	log.info("Asserting Issues page title");
	
	String expectedIssuePageTitle = "Issues";
	
	WebElement eleActualPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_Title")));
	
	TestUtil.waitforElementTobeLocated(eleActualPageTitle, 5);
	
	SoftAssertfunction(eleActualPageTitle, expectedIssuePageTitle);		

	log.info("************** Ending test case : Verify Navigation to Workspace Issues page ****************");
}


@Test (priority = 2, description = "device dropdown filter",enabled = true)

public void clickwrkissdevdd() throws InterruptedException

{
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
	
	waitForTime(1000);
	
	WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
	
	ConnexoWorkSpace_Issues_ClearAllButton.click();
	
	waitForTime(1000);
}


@Test (priority = 3, description = "duedate dropdown filter",enabled = true)

public void clickwrkissduedtdd() throws InterruptedException
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





@Test (priority = 4, description = "Type dropdown filter",enabled = true)

public void clickwrktypedd() throws InterruptedException
{
	WebElement isstypedd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typedd")));
	TestUtil.waitforElementTobeLocated(isstypedd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedd);

	WebElement isstypedddv = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDV")));
	TestUtil.waitforElementTobeLocated(isstypedddv , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddv);
	
	WebElement isstypedddc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDC")));
	TestUtil.waitforElementTobeLocated(isstypedddc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddc);
	
	WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
	TestUtil.waitforElementTobeLocated(issdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(issdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 5, description = "workgroup dropdown filter",enabled = true)

public void clickwrkgrdd() throws InterruptedException
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


@Test (priority = 6, description = "user dropdown filter",enabled = true)

public void clickusrdd() throws InterruptedException
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


@Test (priority = 7, description = "status dropdown filter",enabled = true)

public void clickstatusbwdd() throws InterruptedException
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

@Test (priority = 8, description = "reason dropdown filter",enabled = true)

public void clickreasonissdd() throws InterruptedException
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

@Test (priority = 9, description = "priority sort",enabled = true)
	
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


@Test (priority = 10, description = "sort",enabled = true)

public void clicksort() throws InterruptedException
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

@Test (priority = 11, description = "rm sort",enabled = true)

public void clickrmsort() throws InterruptedException
{
	WebElement rmsort = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_rmsort-duedt")));
	TestUtil.waitforElementTobeLocated(rmsort , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(rmsort);
	waitForTime(1000);
	WebElement rmsort2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_rmsort-duedt")));
	TestUtil.waitforElementTobeLocated(rmsort2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(rmsort2);


}

@Test (priority = 12, description = "download",enabled = true)

public void clickdwnld() throws InterruptedException
{
	WebElement dwnld = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_downlodad")));
	TestUtil.waitforElementTobeLocated(dwnld , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(dwnld);
	waitForTime(1000);
	WebElement dwnld2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_DC_exp")));
	TestUtil.waitforElementTobeLocated(dwnld2 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(dwnld2);
	waitForTime(1000);

}

@Test (priority = 13, description = "bulkaction",enabled = true)

public void clickbulkactions() throws InterruptedException
{
	WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
	TestUtil.waitforElementTobeLocated(blkact , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(blkact);
	waitForTime(1000);

}	
@Test (priority = 14, description = "bulkaction_sel",enabled = true)

public void clickbulkactionssel() throws InterruptedException
{
	WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
	TestUtil.waitforElementTobeLocated(selc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selc);
	waitForTime(3000);
	
	WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
	TestUtil.waitforElementTobeLocated(selcall , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcall);
	waitForTime(1000);

}

@Test (priority = 15, description = "bulkaction_selone/uncheck",enabled = true)

public void clickbulkactionsselone() throws InterruptedException
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
	waitForTime(1000);
	
	
	
	WebElement unchkall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-unchkall")));
	TestUtil.waitforElementTobeLocated(selcone , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(unchkall);
	waitForTime(1000);
	
	WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
	TestUtil.waitforElementTobeLocated(selcone1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selcone1);
	waitForTime(1000);
	
	
	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(1000);
	
  }

@Test (priority = 16, description = "bulkaction_selalrmissassign",enabled = true)

public void clickbulkactionsselalrmactassign() throws InterruptedException
{

	WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt);
	waitForTime(1000);
	
	WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
	TestUtil.waitforElementTobeLocated(selconenxt1 , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(selconenxt1);
	waitForTime(1000);
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

@Test (priority = 17, description = "bulkaction_selissactclose",enabled = true)

public void clickbulkactionsselissactclsalrm() throws InterruptedException

{
WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton.click();

waitForTime(3000);

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc);
waitForTime(1000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);

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
waitForTime(1000);

WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt1);
waitForTime(1000);

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


@Test (priority = 18, description = "bulkaction_selRetrycommtask",enabled = true)

public void clickbulkactionsselissactRetrycommtask() throws InterruptedException

{
WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton.click();

waitForTime(3000);

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc);
waitForTime(3000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);

WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc2);
waitForTime(3000);

WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
TestUtil.waitforElementTobeLocated(selcone1 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcone1);
waitForTime(1000);

WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt);
waitForTime(1000);

WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryCommtask")));
TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selRetrycommtask);
waitForTime(1000);

WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt2);
waitForTime(1000);

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


@Test (priority = 19, description = "bulkaction_selRetrycommtasknow",enabled = true)

public void clickbulkactionsselissactRetrycommtasknow() throws InterruptedException

{
WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton.click();

waitForTime(3000);

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc);
waitForTime(3000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);

WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc2);
waitForTime(3000);

WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
TestUtil.waitforElementTobeLocated(selcone1 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcone1);
waitForTime(1000);

WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt);
waitForTime(1000);

WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryCommtasknow")));
TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selRetrycommtask);
waitForTime(1000);

WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt2);
waitForTime(1000);

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


@Test (priority = 20, description = "bulkaction_selRetrycommtasknow",enabled = true)

public void clickbulkactionsselissactRetryconnection() throws InterruptedException

{
WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton.click();

waitForTime(3000);

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc);
waitForTime(3000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);

WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc2);
waitForTime(3000);

WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
TestUtil.waitforElementTobeLocated(selcone1 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcone1);
waitForTime(1000);

WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt);
waitForTime(1000);

WebElement selRetrycommtask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-RetryConn")));
TestUtil.waitforElementTobeLocated(selRetrycommtask , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selRetrycommtask);
waitForTime(1000);

WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt2);
waitForTime(1000);

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

@Test (priority = 21, description = "bulkaction_selissactprio",enabled = true)

public void clickbulkactionsselissactsetprio() throws InterruptedException

{
WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton.click();

waitForTime(3000);

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc);
waitForTime(3000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);

WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc2);
waitForTime(3000);

WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
TestUtil.waitforElementTobeLocated(selcone1 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcone1);
waitForTime(1000);

WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt);
waitForTime(1000);

WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt2);
waitForTime(1000);


WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt1);
waitForTime(1000);

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

@Test (priority = 22, description = "bulkaction_selissactsnz",enabled = true)

public void clickbulkactionsselissactsnz() throws InterruptedException

{
WebElement ConnexoWorkSpace_Issues_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton.click();

waitForTime(3000);

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc);
waitForTime(3000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);

WebElement selc2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-sel")));
TestUtil.waitforElementTobeLocated(selc2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc2);
waitForTime(3000);

WebElement selcone1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selone")));
TestUtil.waitforElementTobeLocated(selcone1 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcone1);
waitForTime(1000);

WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt);
waitForTime(1000);

WebElement selactsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selactpriosnooze")));
TestUtil.waitforElementTobeLocated(selactsnz , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selactsnz);
waitForTime(1000);

WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt2);
waitForTime(1000);


WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt1);
waitForTime(1000);

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

WebElement ConnexoWorkSpace_Issues_ClearAllButton1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Issues_ClearAllButton1.click();

waitForTime(1000);

}


@Test (priority = 23, description = "bulkaction_selall",enabled = true)

public void clickbulkactionsselall() throws InterruptedException

{

WebElement blkact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact")));
TestUtil.waitforElementTobeLocated(blkact , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(blkact);
waitForTime(1000);

WebElement selcall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selall")));
TestUtil.waitforElementTobeLocated(selcall , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcall);
waitForTime(1000);


WebElement selconenxt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt);
waitForTime(1000);

WebElement selactsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selactpriosnooze")));
TestUtil.waitforElementTobeLocated(selactsnz , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selactsnz);
waitForTime(1000);

WebElement selconenxt2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt2 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt2);
waitForTime(1000);


WebElement selconenxt1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_bulkact-selonenxt")));
TestUtil.waitforElementTobeLocated(selconenxt1 , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selconenxt1);
waitForTime(1000);

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

WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));

ConnexoWorkSpace_Alarms_ClearAllButton.click();

waitForTime(1000);
}

@Test (priority = 24, description = "Next page",enabled = true)

public void clickbulkactionsselisnextpage() throws InterruptedException
{
WebElement selcnextpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_nextpage")));
TestUtil.waitforElementTobeLocated(selcnextpage , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selcnextpage);
waitForTime(2000);

}

@Test (priority = 25, description = "scrollpage",enabled = true)
public void scrollIssrmpage() throws InterruptedException
{


WebElement scrollpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_alperpage")));	
TestUtil.waitforElementTobeLocated(scrollpage, 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
scrolldown(scrollpage);
waitForTime(5000);
}

@Test (priority = 26, description = "perpage",enabled = true)

public void clickbulkactionsselisperpage() throws InterruptedException
{

WebElement selc50page = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_al50perpage")));
TestUtil.waitforElementTobeLocated(selc50page , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(selc50page);
waitForTime(5000);


}


@Test (priority = 27, description = "issues overview page",enabled = true)
public void verifyNavigationToIssuesoverviewPage() 
{				
WebElement wrk = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_workspace")));
TestUtil.waitforElementTobeLocated(wrk , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(wrk);
waitForTime(3000);

WebElement ovr = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesOverviewPage_Title")));
TestUtil.waitforElementTobeLocated(ovr , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(ovr);
waitForTime(3000);

}
@Test (priority = 28, description = "duedate dropdown filter",enabled = true)

public void clickwrkalrmovrduedtdd() throws InterruptedException
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





@Test (priority = 29, description = "Type dropdown filter",enabled = true)

public void clickisstypedd() throws InterruptedException
{
	WebElement isstypedd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typedd")));
	TestUtil.waitforElementTobeLocated(isstypedd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedd);

	WebElement isstypedddv = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDV")));
	TestUtil.waitforElementTobeLocated(isstypedddv , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddv);
	
	WebElement isstypedddc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDC")));
	TestUtil.waitforElementTobeLocated(isstypedddc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddc);
	
	WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
	TestUtil.waitforElementTobeLocated(issdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(issdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 30, description = "workgroup dropdown filter",enabled = true)

public void clickissmovrwrkgrdd() throws InterruptedException
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


@Test (priority = 31, description = "user dropdown filter",enabled = true)

public void clickissovrusrdd() throws InterruptedException
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


@Test (priority = 32, description = "open issues page",enabled = true)
public void verifyNavigationToopenIssuesPage() 
{			
WebElement wrk = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_workspace")));
TestUtil.waitforElementTobeLocated(wrk , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(wrk);
waitForTime(3000);

WebElement opn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesopenPage_Title")));
TestUtil.waitforElementTobeLocated(opn , 10);
DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
doClick(opn);
waitForTime(3000);

}
@Test (priority = 33, description = "duedate dropdown filter",enabled = true)

public void clickwrkopenalrmduedtdd() throws InterruptedException
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


@Test (priority = 34, description = "Type dropdown filter",enabled = true)

public void clickopenisstypedd() throws InterruptedException
{
	WebElement isstypedd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typedd")));
	TestUtil.waitforElementTobeLocated(isstypedd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedd);

	WebElement isstypedddv = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDV")));
	TestUtil.waitforElementTobeLocated(isstypedddv , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddv);
	
	WebElement isstypedddc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDC")));
	TestUtil.waitforElementTobeLocated(isstypedddc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddc);
	
	WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
	TestUtil.waitforElementTobeLocated(issdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(issdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 35, description = "workgroup dropdown filter",enabled = true)

public void clickopenalrmwrkgrdd() throws InterruptedException
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


@Test (priority = 36, description = "user dropdown filter",enabled = true)

public void clickopenissusrdd() throws InterruptedException
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

@Test (priority = 37, description = "reason dropdown filter",enabled = true)

public void clickreasonopnissuesdd() throws InterruptedException
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

@Test (priority = 38, description = "wrkgroup Issues page",enabled = true)
public void verifyNavigationTowrkIssuesPage() 
{			
	
	navigateBackToPreviousPage();
	
	WebElement wrkiss = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesworkgroupPage_Title")));
	TestUtil.waitforElementTobeLocated(wrkiss , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	scrolldown(wrkiss);
	waitForTime(3000);

}
@Test (priority = 39, description = "duedate dropdown filter",enabled = true)

public void clickmywrkissduedtdd() throws InterruptedException
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


@Test (priority = 40, description = "type dropdown filter",enabled = true)

public void clickwrknisstypedd() throws InterruptedException
{
	WebElement isstypedd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typedd")));
	TestUtil.waitforElementTobeLocated(isstypedd  , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedd);

	WebElement isstypedddv = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDV")));
	TestUtil.waitforElementTobeLocated(isstypedddv , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddv);
	
	WebElement isstypedddc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_IssuesPage_typeddDC")));
	TestUtil.waitforElementTobeLocated(isstypedddc , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(isstypedddc);
	
	WebElement issdevselapply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ApplyButton")));
	TestUtil.waitforElementTobeLocated(issdevselapply , 10);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	doClick(issdevselapply);
	
	waitForTime(3000);
	WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Issues_ClearAllButton")));
	
	ConnexoWorkSpace_Alarms_ClearAllButton.click();
	
	waitForTime(3000);
}



@Test (priority = 41, description = "workgroup dropdown filter",enabled = true)

public void clickwrkisswrkgrdd() throws InterruptedException
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


@Test (priority = 42, description = "user dropdown filter",enabled = true)

public void clickwrkissusrdd() throws InterruptedException
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

@Test (priority = 43, description = "reason dropdown filter",enabled = true)

public void clickreasonwrkgrpsdd() throws InterruptedException
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
}
