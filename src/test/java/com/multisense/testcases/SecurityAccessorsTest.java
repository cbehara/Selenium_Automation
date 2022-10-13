package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.SecurityAccessorsPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class SecurityAccessorsTest extends TestBase {

	Logger log = LogManager.getLogger(SecurityAccessorsTest.class);          

	String SecurityAccessorSheet = "SecurityAccessor";
	SecurityAccessorsPage SecurityAccessorsPage;

	public SecurityAccessorsTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForSecurityAccessor() {
		Object testData[][] = TestUtil.getTestData(SecurityAccessorSheet);
		return testData;
	}

	@Test(priority = 1,description="verify And Select Security Accessors")
	public void verifyAndSelectSecurityAccessors()

	{   
		SecurityAccessorsPage = new SecurityAccessorsPage();
		SecurityAccessorsPage.clickonSecurityAccessors();
		reporterLog("Starting Test case Select Security Accessors");
		log.info("************************ starting test case : Select Security Accessors******************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		log.info("************************ Ending test case : Select Security Accessors******************");


	}
	@Test(priority = 2, dataProvider = "getTestDataForSecurityAccessor",description="Created Security Accessor")
	public void CreatedSecurityAccessor(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)

	{
		reporterLog("Starting Test case Create Security Accessors");
		log.info("************************ starting test case : Create Security Accessors******************");

		SecurityAccessorsPage.addSecurityAccessors(Description,KeyType,KeyPurpose);

		String Expetedaddeservervalue = "Security accessor added";
		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));

		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue);  

		log.info("************************ Ending test case : Create Security Accessors******************");

	}

	@Test(priority = 3, dataProvider = "getTestDataForSecurityAccessor",description="Changeing Previlieges Security Accessors")
	public void changeingPreviliegesSecurityAccessors(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)

	{  
		reporterLog("Starting Test case Changing privilege Security Accessors");
		log.info("************************ starting test case : Changing privilege Security Accessors**************");

		SecurityAccessorsPage.changePreviliegesSecurityAccessors();

		String Expetedchangingservervalue = "Security accessor saved";
		WebElement Actualchangingservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextSecurityAccessorSaved")));

		SoftAssertfunction(Actualchangingservervalue, Expetedchangingservervalue);
		log.info("************************ Ending test case : Changing privilege Security Accessors**************");

	}

	@Test(priority = 4, dataProvider = "getTestDataForSecurityAccessor",description="Edit Security Accessors")
	public void editionSecurityAccessors( String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Edit Security Accessors");
		log.info("************************ starting test case : Edit Security Accessors**************");
		SecurityAccessorsPage.editedSecurityAccessors(UpdatedKeyPurpose);
		log.info("************************ Ending test case : Edit Security Accessors**************");
	}


	@Test(priority = 5, dataProvider = "getTestDataForSecurityAccessor",description="Removed Security Accessors")
	public void removedSecurityAccessors(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Remove Security Accessors");
		log.info("************************ starting test case : Remove Security Accessors**************");

		SecurityAccessorsPage.removeSecurityAccessors();

		String ExpectedremoveSAvalue = "Security accessor removed";
		WebElement ActualremoveSAvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextremovedSecurityAccessor")));

		SoftAssertfunction(ActualremoveSAvalue, ExpectedremoveSAvalue);
		log.info("************************ Ending test case : Remove Security Accessors**************");

	}
	
	@Test(priority = 6, dataProvider = "getTestDataForSecurityAccessor",description="Add Encryption Key Type")
	public void addEncryptionKeyType(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Add Encryption Key Type");
		log.info("************************ starting test case : Add Encryption Key Type**************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		SecurityAccessorsPage.addSecurityAccessor(Description,"EncryptionKey",KeyPurpose);

		String Expetedaddeservervalue = "Security accessor added";
		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue); 
		
		log.info("************************ Ending test case : Add Encryption Key Type**************");
	}
	
	@Test(priority = 7, dataProvider = "getTestDataForSecurityAccessor",description="Add Password Key Type")
	public void addPasswordKeyType(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Add Password Key Type");
		log.info("************************ starting test case : Add Password Key Type**************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		SecurityAccessorsPage.addSecurityAccessor(Description,"Password",KeyPurpose);

		String Expetedaddeservervalue = "Security accessor added";
		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue); 
		
		log.info("************************ Ending test case : Add Password Key Type**************");
	}
	
	@Test(priority = 8, dataProvider = "getTestDataForSecurityAccessor",description="Add AES128 Key Type")
	public void addAES128KeyType(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Add AES128 Key Type");
		log.info("************************ starting test case : Add AES128 Key Type**************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		SecurityAccessorsPage.addSecurityAccessor(Description,"AES 128",KeyPurpose);

		String Expetedaddeservervalue = "Security accessor added";
		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue); 
		
		log.info("************************ Ending test case : Add AES128 Key Type**************");
	}
	
	@Test(priority = 9, dataProvider = "getTestDataForSecurityAccessor",description="Add AES 192 Key Type")
	public void addAES192KeyType(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Add AES 192 Key Type");
		log.info("************************ starting test case : Add AES 192 Key Type**************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		SecurityAccessorsPage.addSecurityAccessor(Description,"AES 192",KeyPurpose);

		String Expetedaddeservervalue = "Security accessor added";
		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue); 
		
		log.info("************************ Ending test case : Add PasswordAdd AES 192 Key Type**************");
	}
	
	@Test(priority = 10, dataProvider = "getTestDataForSecurityAccessor",description="Add AES 256 Key Type")
	public void addAES256KeyType(String Description,String KeyType,String KeyPurpose,String UpdatedKeyPurpose)
	{
		reporterLog("Starting Test case Add AES 256 Key Type");
		log.info("************************ starting test case : Add AES 256 Key Type**************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		SecurityAccessorsPage.addSecurityAccessor(Description,"AES 256",KeyPurpose);

		String Expetedaddeservervalue = "Security accessor added";
		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_SecAccessorsPage_verifytextaddedSecurityAccessor")));
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue); 
		
		log.info("************************ Ending test case : Add AES 256 Key Type**************");
	}
	
	@Test(priority = 11, description="Verify Add Security Accessors Fields")
	public void verifyAddSecurityAccessorsFields()
	{
		reporterLog("Starting Test case Verify Add Security Accessors Fields");
		log.info("************************ starting test case : Verify Add Security Accessors Fields**************");
		SecurityAccessorsPage.clickonAddSecurityAccessorsLink();
		SecurityAccessorsPage.verifyAddSecurityAccessorsFields();
		log.info("************************ Ending test case : Verify Add Security Accessors Fields**************");
	}
}
