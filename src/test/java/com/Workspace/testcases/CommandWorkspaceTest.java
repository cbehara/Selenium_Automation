package com.Workspace.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Workspace.pages.CommandsWorkSpacePage;
import com.base.base.TestBase;
import com.util.util.TestUtil;


public class CommandWorkspaceTest  extends TestBase{

	String AddCommandSheet = "Addcommands";
	Logger log = LogManager.getLogger(CommandWorkspaceTest.class);         

	CommandsWorkSpacePage CommandsWorkSpacepage;

	public CommandWorkspaceTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForCommandWorkspace() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(AddCommandSheet);
		return testData;
	}


	@Test(priority =1, description = " click commands") 
	public void clickcommands () throws InterruptedException
	{
		CommandsWorkSpacepage = new CommandsWorkSpacePage();    
		reporterLog("Starting testcase Verify navigation to command workspace"); 
		log.info("********************* starting test case : Verify navigation to command workspace ******************");
		CommandsWorkSpacepage.clickcommands();
		String Expectedcommandstitle = "Commands";
		WebElement Actualcommandstitle =CommandsWorkSpacepage.Commands;
		TitleAssertFunction(Actualcommandstitle, Expectedcommandstitle);
		log.info("********************* Ending test case : Verify navigation to command workspace ******************");
	}

	@Test(priority =2, description = " add commands" ,enabled = true) 
	public void addcommands () throws InterruptedException
	{
		reporterLog(" Starting testcase  Verify add commands in command workspace"); 
		log.info("********************  Starting test case : Verify add commands in command workspace ******************"); 
		CommandsWorkSpacepage.addcommands();
		log.info("********************  Ending test case : Verify add commands in command workspace ********************");
	}

	@Test(priority =3, dataProvider = "getTestDataForCommandWorkspace" ,description = " select Device Group" ,enabled = true) 
	public void selectDevicegroup (String Devicegroup , String CommandCategory , String Command ) throws InterruptedException
	{
		reporterLog(" Starting testcase  Select Device group"); 
		log.info("********************  Starting test case : Select Device group ******************"); 
		CommandsWorkSpacepage.selectDevicegroup(Devicegroup , CommandCategory ,Command);
		log.info("********************  Ending test case : Select Device group ******************"); 
	}

	@Test(priority =4, dataProvider = "getTestDataForCommandWorkspace" ,description = " select Command" ,enabled = true) 
	public void selectcommand (String Devicegroup , String CommandCategory , String Command) throws InterruptedException
	{
		reporterLog(" Starting testcase to Verify add commands in command workspace"); 
		log.info("********************Starting test case : Verify add commands in command workspace **********************");
		CommandsWorkSpacepage.selectcommand(Devicegroup , CommandCategory ,Command );
		log.info("********************Ending test case : Verify add commands in command workspace **********************");
	}

}

