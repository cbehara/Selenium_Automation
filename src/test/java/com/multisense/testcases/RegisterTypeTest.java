package com.multisense.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.base.TestBase;
import com.multisense.pages.RegisterTypePage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class RegisterTypeTest  extends TestBase{

	String RegisterTypeSheet = "AddRegisterType";
	RegisterTypePage RegisterTypepage;

	Logger log = LogManager.getLogger(RegisterTypeTest.class);            
	public RegisterTypeTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForRegisterType() 
	{ 
		Object testData[][] = TestUtil.getTestData(RegisterTypeSheet);
		return testData;
	}

	@Test(priority =1, description = "Click Register Type ") 
	public void RegisterType() throws InterruptedException
	{
		RegisterTypepage = new RegisterTypePage(); 
		reporterLog("Starting Testcase Register Type");
		log.info("****************************** starting testcase : RegisterType *******************************");

		RegisterTypepage.clickRegistertype();
		String Expectedregistertypetitle = "Register types";
		WebElement Actualregistertypetitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Registertype")));

		TitleAssertFunction(Actualregistertypetitle, Expectedregistertypetitle);
		log.info("****************************** Ending testcase : RegisterType *********************************");
	}

	@Test(priority =2, description = "Add Register Type button ", enabled = true  ) 
	public void AddRegistertypebutton() throws InterruptedException
	{
		reporterLog("Starting Testcase Add Register Type");
		log.info("****************************** starting testcase : Add RegisterType ***************************");
		RegisterTypepage.clicAddRegistertypebutton();
		log.info("****************************** Ending testcase : Add RegisterType ***************************");
	}

	@Test(priority =3, dataProvider = "getTestDataForRegisterType", description = "Click Add Register Type button ",  enabled = true  ) 
	public void clicAddRegistertypename(String obiscode, String readingtype, String Updateobiscode ) throws InterruptedException
	{
		reporterLog("Starting Testcase Add Register Type name");
		log.info("****************************** starting testcase : Add RegisterType Name***************************");
		RegisterTypepage.clicAddRegistertypename(obiscode, readingtype);
		String Expectedregistertypeadded = "Register type added";
		WebElement Actualregistertypeadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_verifyregistertypeadded")));

		SoftAssertfunction(Actualregistertypeadded, Expectedregistertypeadded);
		log.info("****************************** Ending testcase : Add RegisterType Name***************************");
	}


	@Test(priority =4, dataProvider = "getTestDataForRegisterType", description = "Edit Register Type  ",  enabled = true  ) 
	public void editregistertype(String obiscode, String readingtype, String Updateobiscode ) throws InterruptedException
	{
		reporterLog("Starting Testcase Edit Register Type name");
		log.info("****************************** starting testcase : Edit RegisterType Name***************************");
		RegisterTypepage.editregistertype(obiscode, Updateobiscode);
		String Expectedregistertypesaved = "Register type saved";
		WebElement Actualregistertypesaved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_verifyregistertypeedited")));

		SoftAssertfunction(Actualregistertypesaved, Expectedregistertypesaved);
		log.info("****************************** Ending testcase : Edit RegisterType Name***************************");
	}

	@Test(priority =5, dataProvider = "getTestDataForRegisterType", description = "Remove Register Type  ",  enabled = true  ) 
	public void removelogbooktype(String obiscode, String readingtype, String Updateobiscode ) throws InterruptedException
	{ 
		reporterLog("Starting Testcase Remove Register Type name");
		log.info("****************************** starting testcase : Remove RegisterType Name***************************");
		RegisterTypepage.removelogbooktype(readingtype);
		String Expectedregistertyperemoved = "Register type removed";
		WebElement Actualregistertyperemoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_verifyregistertypeeremoved")));

		SoftAssertfunction(Actualregistertyperemoved, Expectedregistertyperemoved);
		log.info("****************************** Ending testcase : Remove RegisterType Name***************************");
	}
	
	@Test(priority =6, description = "Verify Add Register Type Fields",  enabled = true  ) 
	public void verifyaddregistertypefields() throws InterruptedException
	{ 
		reporterLog("Starting Testcase Verify Add Register Type Fields");
		log.info("****************************** starting testcase : Verify Add Register Type Fields***************************");
		RegisterTypepage.verifyaddregistertypefields();
		
		log.info("****************************** Ending testcase : Verify Add Register Type Fields***************************");
	}

}

