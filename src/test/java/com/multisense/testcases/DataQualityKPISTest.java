package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.KPIs.DataQualityKPISPage;

	public class DataQualityKPISTest extends TestBase {
		Logger log = LogManager.getLogger(DataQualityKPISTest.class);
		DataQualityKPISPage DataQualityKPISPage;

		public DataQualityKPISTest() 
		{
			super();
		}			
		
		@Test(priority = 1,description="Verify And Select Add Data Quality KPISPage")
		public void verifyAndSelectAddDataQualityKPISPage()

		{
			DataQualityKPISPage = new DataQualityKPISPage();
			DataQualityKPISPage.clickonDataQualityKPIs();
			reporterLog("Starting testcase Data Quality KPISverify And Change Per Page");
			log.info("*********** Starting testcase Data Quality KPISverify And Change Per Page ************");
			
			DataQualityKPISPage.clickonAddDataQualityKPI();

			log.info("*********************** Ending test case :Data Quality KPIS  Adding***********");
		}
			
		@Test(priority = 2, description="Create Data Quality KPI")
		public void createDataQualityKPI()

		{			
			reporterLog("Starting testcase Creating Data Quality KPIs");
			log.info("****************************** Starting testcase :Creating Data Quality KPIs *****************************************");
			//DataQualityKPISPage.ChangingDataQualityKPIsperpagevalue();
			DataQualityKPISPage.AddDataQualityKPI();

			log.info("****************************** Ending test case : Creating Data Quality KPIs *****************************************");
		}
		
		@Test(priority = 3, description="Remove Data Quality KPI")
		public void removedDataQualityKPI()
		{		 
			reporterLog("Starting testcase Removing Data Quality KPI");
			log.info("****************************** Starting testcase: Removing Data Quality KPI *****************************************");
			DataQualityKPISPage.removeDataQualityKPI(); 
			                            
			log.info("****************************** Ending Test Case : Removing Data Quality KPI  *****************************************");

		}
		
		@Test(priority = 4, description="Verify Add Data Quality KPI Fields")
		public void verifyAddDataQualityKPIFields()
		{		 
			reporterLog("Starting testcase Verify Add Data Quality KPI Fields");
			log.info("****************************** Starting testcase: Verify Add Data Quality KPI Fields *****************************************");
			DataQualityKPISPage.clickonAddDataQualityKPI(); 
			DataQualityKPISPage.verifyAddDataQualityKPIFields();
			
			log.info("****************************** Ending Test Case : Verify Add Data Quality KPI Fields  *****************************************");
		}

	}
