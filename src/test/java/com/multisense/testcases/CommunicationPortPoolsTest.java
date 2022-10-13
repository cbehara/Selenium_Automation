package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommunicationPortPoolsPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;
//import static com.multisense.util.ExtentReports.ExtentTestManager.reporterLog;
public class CommunicationPortPoolsTest extends TestBase {
	Logger log = LogManager.getLogger(CommunicationPortPoolsTest.class);
	String CommunicationPortPoolsSheet = "CommunicationPortPools";
	CommunicationPortPoolsPage CommunicationPortPoolsPage;

	public CommunicationPortPoolsTest() 
	{
		super();
	}

	@DataProvider
	public Object[][] getTestDataForCommunicationPortPools() {
		Object testData[][] = TestUtil.getTestData(CommunicationPortPoolsSheet);
		return testData;
	}
	
	@Test(priority = 1, description = "Verify Inbound Communication port pool")
	public void verifyInboundCommunicationPortPoolFields()

	{
		CommunicationPortPoolsPage = new CommunicationPortPoolsPage();
		CommunicationPortPoolsPage.clickonCommunicationPortPool();
		reporterLog("Starting testcase Verify Inbound Communication port pool fields");
		log.info("****************************** Starting test case : Verify Inbound Communication port pool *****************************************");
		CommunicationPortPoolsPage.VerifyInboundCommunicationPortPoolFileds();
		
		log.info("****************************** Ending test case : Verify Inbound Communication port pool *****************************************");
	}
	
	@Test(priority = 2, description = "Verify Outbound Communication port pool")
	public void verifyOutboundCommunicationPortPoolFields()

	{
		reporterLog("Starting testcase Verify Outbound Communication port pool fields");
		log.info("****************************** Starting test case : Verify Outbound Communication port pool *****************************************");
		CommunicationPortPoolsPage.VerifyOutboundCommunicationPortPoolFileds();
		
		log.info("****************************** Ending test case : Verify Outbound Communication port pool *****************************************");
	}

	@Test(priority = 3, description="Verify And Select Communication PortPools")
	public void verifyAndSelectCommunicationPortPools()

	{
		reporterLog("Starting testcase Select Communication port pools");
		log.info("****************************** Starting test case : Select Communication port pools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPool();


		log.info("****************************** Ending test case : Select Communication port pools *****************************************");
	}

	@Test(priority = 4, description="Create Communication PortPools", dataProvider = "getTestDataForCommunicationPortPools")
	public void CreatedCommunicationPortPools(String Type,String TaskExecutionTimeout)

	{			
		reporterLog("Starting testcase Create Communication Port Pools");
		log.info("****************************** Starting test case : Create Communication Port Pools *****************");
		CommunicationPortPoolsPage.AddOnlineCommunicationPortPool(Type,TaskExecutionTimeout);

		String ExpetedaddCPPvalue = "Outbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool")));

		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);
		log.info("****************************** Ending test case : Create Communication Port Pools *****************************************");
	}

	@Test(priority = 5, description="Change perpage Communication PortPools")
	public void changedperpageCommunicationPortPools()

	{
		reporterLog("Starting testcase change per page Communication PortPools");
		log.info("****************************** Starting test case : change per page Communication PortPools *****************************************");
		CommunicationPortPoolsPage.ChangePerpageCommunicationPortPool();
		log.info("****************************** Ending test case : change per page Communication PortPools *****************************************");
	}

	@Test(priority = 6, description="Activate Communication PortPools")
	public void activationCommunicationPortPools()

	{

		reporterLog("Starting testcase Activate Communication Port Pools");
		log.info("****************************** Starting test case : Activate Communication Port Pools *****************************************");
		CommunicationPortPoolsPage.activateCommunicationPortPool();

		String ExpetedactivateCPPvalue = "Communication port pool activated"; 
		WebElement ActualactivateCPPvalue  = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool")));

		SoftAssertfunction(ActualactivateCPPvalue, ExpetedactivateCPPvalue);
		log.info("****************************** Ending test case : Activate Communication Port Pools *****************************************");
	}


	@Test(priority = 7, description="Deactivate Communication PortPools")
	public void deactivedCommunicationPortPools()
	{		
		reporterLog("Starting testcase Deactivateg the Instances of Communication Port Pools");
		log.info("****************************** Ending test case : DeActivate Communication Port Pools *****************************************");
		CommunicationPortPoolsPage.deactivateCommunicationPortPool();

		log.info("****************************** Assertions verified for CPP Deactivated *********");		  
		String ExpeteddeactivateCPPvalue = "Communication port pool deactivated";
		WebElement ActualdeactivateCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool")));

		SoftAssertfunction(ActualdeactivateCPPvalue,ExpeteddeactivateCPPvalue);
		log.info("****************************** Ending test case : DeActivate Communication Port Pools *****************************************"); 
	}

	@Test(priority = 8, description="Removed Communication PortPools")
	public void removedCommunicationPortPools()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.removeCommunicationPortPool(); 
		                            
		String ExpetedremoveCPPvalue = "Communication port pool removed";
		WebElement ActualremoveCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool")));

		SoftAssertfunction(ActualremoveCPPvalue, ExpetedremoveCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");

	}
	
	@Test(priority = 9)
	public void CreateOutboundSerialType()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPool();
		CommunicationPortPoolsPage.AddOutboundSerialType();
		String ExpetedaddCPPvalue = "Outbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool")));
		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");
	}
	
	@Test(priority = 10)
	public void CreateOutboundTCPType()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPool();
		CommunicationPortPoolsPage.AddOutboundTCPType();
		String ExpetedaddCPPvalue = "Outbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool")));
		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");
	}
	
	@Test(priority = 11)
	public void CreateInboundSerialType()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPoolInbound();
		CommunicationPortPoolsPage.AddInboundSerialType();
		String ExpetedaddCPPvalue = "Inbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddInboundCommunicationPortPool")));
		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");
	}
	
	@Test(priority = 12)
	public void CreateInboundServletType()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPoolInbound();
		CommunicationPortPoolsPage.AddInboundServletType();
		String ExpetedaddCPPvalue = "Inbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddInboundCommunicationPortPool")));
		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");
	}
	
	@Test(priority = 13)
	public void CreateInboundTCPType()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPoolInbound();
		CommunicationPortPoolsPage.AddInboundTCPType();
		String ExpetedaddCPPvalue = "Inbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddInboundCommunicationPortPool")));
		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");
	}
	
	@Test(priority = 14)
	public void CreateInboundUDPType()
	{		 
		reporterLog("Removing the Instances of Communication Port Pools");
		log.info("****************************** Starting Test Case : Remove Communication PortPools *****************************************");
		CommunicationPortPoolsPage.clickonAddCommunicationPortPoolInbound();
		CommunicationPortPoolsPage.AddInboundUDPType();
		String ExpetedaddCPPvalue = "Inbound communication port pool added"; 
		WebElement ActualaddCPPvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddInboundCommunicationPortPool")));
		SoftAssertfunction(ActualaddCPPvalue, ExpetedaddCPPvalue);

		log.info("****************************** Ending Test Case : Remove Communication PortPools *****************************************");
	}
}