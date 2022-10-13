package com.ConnexoAdmin.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ConnexoAdmin.pages.CustomAttributesPage.CustomAttributesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class CustomAttributesTest  extends TestBase{

	String CustomerAttributesSheet = "CustomAttributes";
	
	CustomAttributesPage CustomAttributespage;
	
	Logger log = Logger.getLogger(CustomAttributesTest.class);  
	
	public CustomAttributesTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForCustomAttributes() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromConnexoAdmin(CustomerAttributesSheet);
		
		return testData;
	}

	@Test(priority =1, dataProvider = "getTestDataForCustomAttributes", enabled = true, description = "Custom Attributes" ) 
	public void customattributes(String CustomAttribute) throws InterruptedException
	{
		CustomAttributespage = new CustomAttributesPage();  
		
		reporterLog("Executing testcase Custom Attribues Test");
		
		log.info("****************************** starting test case : customttributes *****************************************");
		
		CustomAttributespage.clickcustomattributesets();
		
		String Expectedrolestitle = "Custom attribute sets";
		
		WebElement Actualrolestitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CustomAttributesPage_customattributesets")));
		
		TitleAssertFunction(Actualrolestitle, Expectedrolestitle);

		CustomAttributespage.clickcustomattributesetdropdown(CustomAttribute);
		
		log.info("****************************** Ending test case : customttributes *****************************************");
	}
}

