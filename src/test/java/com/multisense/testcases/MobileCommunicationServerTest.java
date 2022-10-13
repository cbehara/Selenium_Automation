package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.MobileCommunicationServerPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MobileCommunicationServerTest extends TestBase {

	Logger log = LogManager.getLogger(MobileCommunicationServerTest.class);
	String MCSSheet = "MobileCommunicationServer";
	MobileCommunicationServerPage MobileCommunicationServerPage;

	public MobileCommunicationServerTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForMobileCommunicationServer() {
		Object testData[][] = TestUtil.getTestData(MCSSheet);
		return testData;
	}

	@Test(priority = 1,description= "verify And Select Mobile Communication Server")
	public void verifyAndSelectMobileCommunicationServer()

	{
		MobileCommunicationServerPage = new MobileCommunicationServerPage();
		MobileCommunicationServerPage.clickonMobileCommunicationServer();
		reporterLog("Starting testcase select Mobile Communication Servers");
		log.info("************************ starting testcase : select Mobile Communication Servers ************");
		
		MobileCommunicationServerPage.clickonAddMobileCommunicationServer();
		
		log.info("*************************Ending testcase : select Mobile Communication Servers *******");


	}

	@Test(priority = 2 , dataProvider = "getTestDataForMobileCommunicationServer",description= "Create Mobile Communication Server")
	public void CreatedMobileCommunicationServer(String Changesinterpolldelay,String OnlineComServer)

	{
		reporterLog("Starting testcase Create Mobile Communication Servers");
		log.info("************************ starting testcase : Create Mobile Communication Servers ************");
		MobileCommunicationServerPage.createMobileCommunicationServer(OnlineComServer);		
		
		String Expetedaddeservervalue = "Mobile communication server added";

		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer")));
		
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue);
		log.info("************************Ending testcase : Create Mobile Communication Servers*****************");
	}
	
	@Test(priority = 3, description= "Activate Mobile Communication Server")
	public void activationMobileCommunicationServer()

	{
		reporterLog("Starting testcase Activate Mobile Communication Servers");
		log.info("************************ starting testcase : Activate Mobile Communication Servers ************");
		MobileCommunicationServerPage.activateMobileCommunicationServer();		

		String Expetedactivateservervalue = "Communication server activated";

		WebElement Actualactivateservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer")));
		
		SoftAssertfunction(Actualactivateservervalue, Expetedactivateservervalue);
		log.info("************************ Ending testcase : Activate Mobile Communication Servers ************");
	}
	
	@Test(priority = 4, dataProvider = "getTestDataForMobileCommunicationServer",description= "Edit Mobile Communication Server")
	public void editionMobileCommunicationServer(String Changesinterpolldelay,String OnlineComServer)
	{
		reporterLog("Starting testcase Edit Mobile Communication Servers");
		log.info("************************ starting testcase : Edit Mobile Communication Servers ************");
		MobileCommunicationServerPage.editMobileCommunicationServer(Changesinterpolldelay);
		
		String Expetedsaveservervalue = "Mobile communication server saved";

		WebElement Actualsaveservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer")));
		SoftAssertfunction(Actualsaveservervalue, Expetedsaveservervalue);
		log.info("************************ Ending testcase : Edit Mobile Communication Servers ************");
	}

	@Test(priority = 5, description= "Deactivate Mobile Communication Server")
	public void deactivedMobileCommunicationServer()
	{
		reporterLog("Starting testcase Deactivate Mobile Communication Servers");
		log.info("************************ starting testcase : Deactivate Mobile Communication Servers ************");
		MobileCommunicationServerPage.deactivateMobileCommunicationServer();	

		String Expeteddeactivateservervalue = "Communication server deactivated";

		WebElement Actualdeactivateservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer")));
		SoftAssertfunction(Actualdeactivateservervalue, Expeteddeactivateservervalue);
		log.info("************************ Ending testcase : Deactivate Mobile Communication Servers ************");
	}
	
	@Test(priority = 6, description= "Remove Mobile Communication Server")
	public void removedMobileCommunicationServer()
	{
		reporterLog("Starting testcase Remove Mobile Communication Servers");
		log.info("************************ starting testcase : Remove Mobile Communication Servers ************");
		MobileCommunicationServerPage.removeMobileCommunicationServer();
		
		String Expetedremoveservervalue = "Communication server removed";
		WebElement Actualremoveservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer")));
		SoftAssertfunction(Actualremoveservervalue, Expetedremoveservervalue);

		log.info("************************ Ending testcase : Remove Mobile Communication Servers ************");
	}
	
	@Test(priority = 7, description= "verify Mobile Communication Server Fields")
	public void verifyMobileCommunicationServerFields()

	{
		reporterLog("Starting testcase verify Add Mobile Communication Servers fields");
		log.info("************************ starting testcase : verify Mobile Communication Server Fields ************");
		MobileCommunicationServerPage.clickonAddMobileCommunicationServer();
		MobileCommunicationServerPage.verifyMobileCommunicationServerFields();
		
		log.info("*************************Ending testcase : verify Mobile Communication Server Fields *******");
	}
	
	@Test(priority = 8, dataProvider = "getTestDataForMobileCommunicationServer", description= "Add Inbound Serial Communication Port")
	public void AddInboundSerialCommunicationPort(String Changesinterpolldelay,String OnlineComServer)

	{
		reporterLog("Starting testcase for adding Serial type communication port");
		log.info("************************ starting testcase : Add Inbound Serial Communication Port ************");
		MobileCommunicationServerPage.clickonAddMobileCommunicationServer();
		MobileCommunicationServerPage.createMobileCommunicationServer(OnlineComServer);
		MobileCommunicationServerPage.InboundMobileCommunicationPortSerial();
		log.info("************************Ending testcase : Add Inbound Serial Communication Port*****************");
	}
	
	@Test(priority = 9, description= "Add Inbound SERVLET Communication Port")
	public void AddInboundServletCommunicationPort()

	{
		reporterLog("Starting testcase for adding Servlet type communication port");
		log.info("************************ starting testcase : Add Inbound SERVLET Communication Port ************");	
		MobileCommunicationServerPage.InboundMobileCommunicationServerServlet();
		log.info("************************Ending testcase : Add Inbound SERVLET Communication Port*****************");
	}

	@Test(priority = 10, description= "Add Inbound TCP Communication Port")
	public void AddInboundTCPCommunicationPort()

	{
		reporterLog("Starting testcase for adding TCP type communication port");
		log.info("************************ starting testcase : Add Inbound TCP Communication Port ************");	
		MobileCommunicationServerPage.InboundMobileCommunicationServerTCP();	
		log.info("************************Ending testcase : Add Inbound TCP Communication Port*****************");
	}
	
	@Test(priority = 11, description= "Add Inbound UDP Communication Port")
	public void AddInboundUDPCommunicationPort()

	{
		reporterLog("Starting testcase for adding UDP type communication port");
		log.info("************************ starting testcase : Add Inbound UDP Communication Port ************");	
		MobileCommunicationServerPage.InboundMobileCommunicationServerUDP();	
		log.info("************************Ending testcase : Add Inbound UDP Communication Port *****************");
	}

	@Test(priority = 12, description= "Add Outbound Serial Communication Port")
	public void AddOutboundSerialCommunicationPort()

	{
		reporterLog("Starting testcase for adding Serial type communication port");
		log.info("************************ starting testcase : Add Outbound Serial Communication Port ************");	
		MobileCommunicationServerPage.OutboundMobileCommunicationServerSerial();
		log.info("************************Ending testcase : Add Outbound Serial Communication Port *****************");
	}
	
	@Test(priority = 13, description= "Add Outbound TCP Communication Port")
	public void AddOutboundTCPCommunicationPort()

	{
		reporterLog("Starting testcase for adding TCP type communication port");
		log.info("************************ starting testcase : Add Outbound TCP Communication Port ************");	
		MobileCommunicationServerPage.OutboundMobileCommunicationServerTcp();
		log.info("************************Ending testcase : Add Outbound TCP Communication Port *****************");
	}
	
	@Test(priority = 14, description= "Add Outbound UDP Communication Port")
	public void AddOutboundUDPCommunicationPort()

	{
		reporterLog("Starting testcase for adding  type communication port");
		log.info("************************ starting testcase : Add Outbound UDP Communication Port ************");	
		MobileCommunicationServerPage.OutboundMobileCommunicationServerUdp();
		log.info("************************Ending testcase : Add Outbound UDP Communication Port *****************");
	}
}
