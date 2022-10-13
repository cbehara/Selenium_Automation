package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.KPIs.DataCollectionKPIspage;
import com.util.util.TestUtil;
public class DataCollectionKPIsTest extends TestBase {
	String AddDataCollectionKPIsSheet = "AdddatacollectionKPI";
	Logger log = LogManager.getLogger(DataCollectionKPIsTest.class);DataCollectionKPIspage DataCollectionKPIspage;
	
	public DataCollectionKPIsTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForDataCollectionKPI()
	{
		Object testData[][] = TestUtil.getTestData(AddDataCollectionKPIsSheet);
		return testData;
	}

	@Test(priority = 1,description="Click on Data collection KPIs")
	public void clickonDatacollectionKPIs()
	{
		DataCollectionKPIspage = new DataCollectionKPIspage();
		reporterLog("Starting testcase Data Collection KPI verify And Change Per Page");
		log.info("****************** starting test case :Data Collection KPI verify And Change Per Page *******");
		//SoftAssertfunction(ActualValue, ExpectedValue);
		DataCollectionKPIspage.clickonDatacollectionKPIs();
		log.info("***************** Ending test case : Data Collection KPI verify And Change Per Page *********");
	}

	@Test(priority = 2, description="Add Data collection KPI" )
	public void clickAddDatacollectionKPI(){
		reporterLog("Starting testcase Adding Data collection KPI");
		log.info("***************** starting test case :Adding Data collection KPI *************");
		DataCollectionKPIspage.clickAddDatacollectionKPI();
		log.info("***************** Ending test case :Adding Data collection KPI ***************");

	}

	@Test(priority = 3, dataProvider = "getTestDataForDataCollectionKPI", description="Create Data collection KPI" )
	public void CreateDatacollectionKPI(String Devicegroup, String Calculationfrequency, String Displayrange, String ConnectionKPI, String CommunicationKPI)
	{
		reporterLog("Starting testcase Adding Data collection KPI");
		log.info("************** starting test case : Adding Data collection KPI *********************");
		DataCollectionKPIspage.AddDatacollectionKPI("Gas devices", Calculationfrequency, Displayrange, ConnectionKPI , CommunicationKPI );
		log.info("*************** Ending test case : Adding Data collection KPI **********************");
	}
	
	@Test(priority = 4, dataProvider = "getTestDataForDataCollectionKPI",description="Edit Data Collection KPI")
	public void EditDatacollectionKPI(String Devicegroup, String Calculationfrequency, String Displayrange, String ConnectionKPI, String CommunicationKPI)
	{
		reporterLog("Starting testcase Edit Data Collection KPI");
		log.info("************ starting test case :Edit Data Collection KPI **************");
		DataCollectionKPIspage.clickonEditDatacollectionKPIButton(Devicegroup);
		log.info("************ Ending test case :Edit Data Collection KPI  ***************");
	}
	
	@Test(priority = 5, dataProvider = "getTestDataForDataCollectionKPI",description="Remove Data collection KPI")
	public void RemoveDatacollectionKPI(String Devicegroup, String Calculationfrequency, String Displayrange, String ConnectionKPI, String CommunicationKPI)
	{
		reporterLog("Starting testcase Remove Datacollection KPI");
		log.info("************ starting test case :Remove Datacollection KPI **************");
		DataCollectionKPIspage.clickonRemoveDatacollectionKPIButton(Devicegroup);
		log.info("************ Ending test case :Remove Datacollection KPI  ***************");
	}
	
	@Test(priority = 6, description="Verify Add Data Collection KPI")
	public void verifyAddDataCollectionKPI()
	{
		reporterLog("Starting testcase Verify Add Data Collection KPI");
		log.info("************ starting test case :Remove Verify Add Data Collection KPI **************");
		DataCollectionKPIspage.clickAddDatacollectionKPI();
		DataCollectionKPIspage.verifyAddDataCollectionKPI();
		
		log.info("************ Ending test case :Verify Add Data Collection KPI  ***************");
	}
}