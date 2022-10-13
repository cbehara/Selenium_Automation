package com.Dashboard.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;

public class DashboardTest  extends TestBase{
              
    
     Logger log = LogManager.getLogger(DashboardTest.class);         
              
     DashboardPage Dashboardpage;
              
      public DashboardTest()
         {
         super();
         }
      
  	@Parameters("strBrowserName")
  	@BeforeClass
  	public void setUp(String browser) throws InterruptedException
  	{
  		initialization(browser);
  		Dashboardpage = new DashboardPage();            
  	}
  	
//Runs only if setup has , alarms, issues, user tasks assigned to root
//no flagged devices to be present
                
		@Test(priority =1,enabled = true)  
		public void clickSearchflagdev() throws InterruptedException
			{
			reporterLog("Dashboard - Click Search"); 
			log.info("****************************** Dashboard: click Search *****************************************");
			Dashboardpage.clickSearchflagdev();
			
			}

		@Test(priority =2,enabled = true) 
		public void clickSearchunflagdev () throws InterruptedException
		{
		reporterLog("Dashboard - Click unflagdev"); 
		log.info("****************************** Dashboard: click unflagdev *****************************************");
		Dashboardpage.clickSearchunflagdev();

		}
		
		
  		@Test(priority =3,enabled = true) 
  		public void clickSelectcheckmultifav() throws InterruptedException
		{
		reporterLog("Dashboard - Click Select , favourite multiple"); 
		log.info("****************************** Dashboard: Click Select , favourite multiple *****************************************");
 		
		Dashboardpage.clickSelectcheckmultifav();
		}
  		
  		@Test(priority =4, dependsOnMethods = "clickSelectcheckmultifav",enabled = true) 
  		public void clickSelectuncheckallfav() throws InterruptedException
		{
		reporterLog("Dashboard - Click  Select , uncheckall"); 
		log.info("****************************** Dashboard: Click Select , uncheckall *****************************************");
 		
		Dashboardpage.clickSelectuncheckallfav();
		}
  		
  		@Test(priority =5, dependsOnMethods = "clickSelectuncheckallfav",enabled = true) 
  		public void clickSelectcheckfavone() throws InterruptedException
		{
		reporterLog("Dashboard - Click Select , favourite one"); 
		log.info("****************************** Dashboard: Click Select , favourite one *****************************************");
 		
		Dashboardpage.clickSelectcheckfavone();
		}
  		@Test(priority =6, dependsOnMethods = "clickSelectcheckfavone",enabled = true) 
  		public void clickSelectuncheckfavone() throws InterruptedException
		{
		reporterLog("Dashboard - Click Select , uncheck fav one"); 
		log.info("****************************** Dashboard: Click Select , uncheck fav one *****************************************");
 		
		Dashboardpage.clickSelectuncheckfavone();
		}
  		
  		@Test(priority =7,enabled = true) 
  		public void clickInfo() throws InterruptedException
		{
		reporterLog("Dashboard - Click Info, manage communincation servers"); 
		log.info("****************************** Dashboard: Click Info, manage communincation servers *****************************************");
			Dashboardpage.clickInfo();
			TimeUnit.SECONDS.sleep(5);
		}
  		
  		@Test(priority =8,enabled = true) 
  		public void clickRefresh() throws InterruptedException
  		{
  			reporterLog("Dashboard - Click Refresh"); 
  			log.info("****************************** Dashboard: click Refresh *****************************************");
  			Dashboardpage.clickRefresh();
  			TimeUnit.SECONDS.sleep(60);
  			Dashboardpage.clickRefresh();
    	   
  		}
  		
  		@Test(priority =9,enabled = true) 
  		public void clickIssuedropdown () throws InterruptedException
  		{
  			reporterLog("Dashboard - Click Issue dropdown,click one issue link"); 
  			log.info("****************************** Dashboard: Click Issue dropdown, click one issue link*****************************************");
  			Dashboardpage.clickIssuedropdown();
  		}
     
  		@Test(priority =10, dependsOnMethods = "clickIssuedropdown" ,enabled = true) 
  		public void clickIssuesactionsassiss () throws InterruptedException
  		{
  			reporterLog("Dashboard - issue actions assign"); 
  			log.info("****************************** Dashboard - issue actions assign*****************************************");
  			Dashboardpage.clickIssuesactionsassiss();
  		}

  		@Test(priority =11, dependsOnMethods = "clickIssuesactionsassiss" ,enabled = true) 
  		public void clickIssuesactionssnz () throws InterruptedException
  		{
  			reporterLog("Dashboard - click issue actions snooze"); 
  			log.info("****************************** Dashboard - click issue actions snooze*****************************************");
  			Dashboardpage.clickIssuesactionssnz();
  		}

  		@Test(priority =12, dependsOnMethods = "clickIssuesactionssnz" ,enabled = true) 
  		public void clickIssuesactionsunass () throws InterruptedException
  		{
  			reporterLog("Dashboard - issue actions unassign"); 
  			log.info("****************************** Dashboard: issue actions unassign*****************************************");
  			Dashboardpage.clickIssuesactionsunass();
  		}
  		
  		@Test(priority =13, dependsOnMethods = "clickIssuesactionsunass" ,enabled = true) 
  		public void clickIssuesactionsasstome () throws InterruptedException
  		{
  			reporterLog("Dashboard - issue actions assigntome"); 
  			log.info("****************************** Dashboard: issue actions assigntome*****************************************");
  			Dashboardpage.clickIssuesactionsasstome();
  		}
   
  		@Test(priority =14, dependsOnMethods = "clickIssuesactionsasstome" ,enabled = true) 
  		public void clickIssuesactionssetprio () throws InterruptedException
  		{
  			reporterLog("Dashboard - issue actions set priority"); 
  			log.info("****************************** Dashboard: issue actions set priority*****************************************");
		Dashboardpage.clickIssuesactionssetprio("10");
  		}

  		@Test(priority =15, dependsOnMethods = "clickIssuesactionssetprio" ,enabled = true) 
  		public void clickIssuesactionscls () throws InterruptedException
  		{
  			reporterLog("Dashboard - issue actions close issue"); 
  			log.info("****************************** Dashboard: issue actions close issue*****************************************");
  			Dashboardpage.clickIssuesactionscls("Resolved","issue close");
  		}
   
  		@Test(priority =16, dependsOnMethods = "clickIssuesactionscls" ,enabled = true) 
  		public void clickIssuesmyworkgroup () throws InterruptedException
  		{
  			reporterLog("Dashboard - issues in my workgroups"); 
  			log.info("****************************** Dashboard: Dashboard - issues in my workgroups*****************************************");
  			Dashboardpage.clickIssuesmyworkgroup();
  		}

  		@Test(priority =17, enabled = true) 
  		public void clickAlarmdropdown () throws InterruptedException
  		{
  			reporterLog("Dashboard - click alarms dropdown, click one alarm link"); 
  			log.info("****************************** Dashboard: click alarms dropdown, click one alarm link*****************************************");
			Dashboardpage.clickAlarmdropdown();
  		}

  		@Test(priority =18, dependsOnMethods = "clickAlarmdropdown" ,enabled = true) 
  		public void clickAlarmactionsassign () throws InterruptedException
  		{
  			reporterLog("Dashboard - click alarm assign"); 
  			log.info("****************************** Dashboard - click alarm assign*****************************************");
  			Dashboardpage.clickAlarmactionsassign();
  		}

         
  		@Test(priority =19, dependsOnMethods = "clickAlarmactionsassign" ,enabled = true)  
  		public void clickAlarmactionssnz() throws InterruptedException
  		{
  			reporterLog("Dashboard - click alarm assign"); 
  			log.info("****************************** Dashboard - click alarm assign*****************************************");
  			Dashboardpage.clickAlarmactionssnz();
    	   
  		}
  		
  		@Test(priority =20, dependsOnMethods = "clickAlarmactionssnz" ,enabled = true)  
  		public void clickAlarmactionsunassign() throws InterruptedException
  		{
  			reporterLog("Dashboard - Click unassign"); 
  			log.info("****************************** Dashboard: Click unassign*****************************************");
  			Dashboardpage.clickAlarmactionsunassign();
  			TimeUnit.SECONDS.sleep(5);
    	 
  		}
  		
  		@Test(priority =21, dependsOnMethods = "clickAlarmactionsunassign",enabled = true)  
  		public void clickAlarmactionasstome () throws InterruptedException
  		{
  			reporterLog("Dashboard - Click assigntome"); 
  			log.info("****************************** Dashboard: Click assigntome*****************************************");
  			Dashboardpage.clickAlarmactionasstome();
  			TimeUnit.SECONDS.sleep(5);
    	 
  		}
      
  		@Test(priority =22, dependsOnMethods = "clickAlarmactionasstome",enabled = true) 	
  		public void clickAlarmactionsetprio() throws InterruptedException
  		{
  		reporterLog("Dashboard - set alarm priority"); 
  		log.info("****************************** Dashboard - set alarm priority *****************************************");
  		Dashboardpage.clickAlarmactionsetprio("10");
  		}
      
      
  		@Test(priority =23, dependsOnMethods = "clickAlarmactionsetprio",enabled = true)  
  		public void clickAlarmactionclsala() throws InterruptedException
  		{
  			reporterLog("Dashboard - close alarm"); 
  			log.info("****************************** Dashboard: close alarm *****************************************");
  			Dashboardpage.clickAlarmactionclsala("Resolved","alarm closed");
	 
  		}  
  		
  		@Test(priority =24, dependsOnMethods = "clickAlarmactionclsala",enabled = true)  
  		public void clickAlarmmywrkgps() throws InterruptedException
  		{
  			reporterLog("Dashboard - Select alarms my  workgroups "); 
  			log.info("****************************** Dashboard: Select alarms my  workgroups *****************************************");
  			Dashboardpage.clickAlarmmywrkgps();
	 
  		}  
  		
  		@Test(priority =25,enabled = true)  
  		public void clickUsertasksdropdown() throws InterruptedException
  		{
  			reporterLog("Dashboard - Click Usertasks dropdown, click one usertasks link"); 
  			log.info("****************************** Dashboard:  Click Usertasks dropdown, click one usertasks link *****************************************");
  			Dashboardpage.clickUsertasksdropdown();
	 
  		}
  		
  		@Test(priority =26, dependsOnMethods = "clickUsertasksdropdown",enabled = true)  
  		public void clickUsertasksactionsstart() throws InterruptedException
  		{
  			reporterLog("Dashboard - Click usertasks actions start"); 
  			log.info("****************************** Dashboard: Click usertasks actions start *****************************************");
  			Dashboardpage.clickUsertasksactionsstart();
	 
  		}
  		
  		@Test(priority =27, dependsOnMethods = "clickUsertasksactionsstart",enabled = true)  
  		public void clickUsertasksactionsunass() throws InterruptedException
  		{
  			reporterLog("Dashboard - Click Select actions unassign"); 
  			log.info("****************************** Dashboard: Click Select actions unassign *****************************************");
  			Dashboardpage.clickUsertasksactionsunass();
	 
  		}


  		@Test(priority =28, dependsOnMethods = "clickUsertasksactionsunass",enabled = true)  
  		public void clickUsertasksactionsasstome () throws InterruptedException
  		{
  			reporterLog("Dashboard - Click Select usertasks actions assigntome"); 
  			log.info("****************************** Dashboard: Click Select usertasks actions assigntome *****************************************");
  			Dashboardpage.clickUsertasksactionsasstome();
  		}  
      
  		
  		@Test(priority =29, dependsOnMethods = "clickUsertasksactionsasstome",enabled = true) 
  		public void clickUsertasksactionseditatt() throws InterruptedException
  		{
  			reporterLog("Dashboard - click Usertasks actions edit attributes "); 
  			log.info("****************************** Dashboard: click Usertasks actions edit attributes *****************************************");
  			Dashboardpage.clickUsertasksactionseditatt("9");
  		}
  		
  		@Test(priority =30, dependsOnMethods = "clickUsertasksactionseditatt",enabled = true) 
  		public void clickUsertasksactionseditattsave() throws InterruptedException
  		{
  			reporterLog("Dashboard - click Usertasks actions edit attributes save"); 
  			log.info("****************************** Dashboard: click Usertasks actions edit attributes save *****************************************");
  			Dashboardpage.clickUsertasksactionseditattsave();
  		}
  		
  		@Test(priority =31, dependsOnMethods = "clickUsertasksactionseditatt",enabled = true) 
  		public void clickUsertasksinmywrkgrps() throws InterruptedException
  		{
  			reporterLog("Dashboard - click Usertasks in my workgroups "); 
  			log.info("****************************** Dashboard: click Usertasks in my workgroups *****************************************");
  			Dashboardpage.clickUsertasksinmywrkgrps();
  		}
  		
  		@Test(priority =32,enabled = true) 
  		public void clicksuccessfulactiveconnections() throws InterruptedException
  		{
  			reporterLog("Dashboard - click successfulactiveconnections "); 
  			log.info("****************************** Dashboard: click successfulactiveconnections  *****************************************");
  			Dashboardpage.clicksuccessfulactiveconnections();
  		}
  		
  		@Test(priority =33,enabled = true) 
  		public void issuccessfailbardisplayed() throws InterruptedException
  		{
  			reporterLog("Dashboard - verify success fail bar "); 
  			log.info("****************************** Dashboard: click success fail bar  *****************************************");
  			assertTrue(Dashboardpage.issuccessfailbardisplayed(), "bar is not displayed");
  		}
  		
  		@Test(priority =34,enabled = true) 
  		public void clickongoingactiveconnections() throws InterruptedException
  		{
  			reporterLog("Dashboard - click ongoingactiveconnections "); 
  			log.info("****************************** Dashboard: click ongoingactiveconnections  *****************************************");
  			Dashboardpage.clickongoingactiveconnections();
  		}
  		
  		@Test(priority =35,enabled = true) 
  		public void clickfailedactiveconnections() throws InterruptedException
  		{
  			reporterLog("Dashboard - click failedactiveconnections "); 
  			log.info("****************************** Dashboard: click failedactiveconnections  *****************************************");
  			Dashboardpage.clickfailedactiveconnections();
  		}
  		@Test(priority =36,enabled = true) 
  		public void isfailbardisplayed() throws InterruptedException
  		{
  			reporterLog("Dashboard - verify failbar "); 
  			log.info("****************************** Dashboard: click verify failbar   *****************************************");
  			assertTrue(Dashboardpage.isfailbardisplayed(), "bar is not displayed");
  		}
  		@Test(priority =37,enabled = true) 
  		public void clicksuccessfulactivecommunicactions() throws InterruptedException
  		{
  			reporterLog("Dashboard - click successactivecommunications  "); 
  			log.info("****************************** Dashboard: click successactivecommunications  *****************************************");
  			Dashboardpage.clicksuccessfulactivecommunicactions();
  		}
  		@Test(priority =38,enabled = true) 
  		public void issuccessfulbardisplayed() throws InterruptedException
  		{
  			reporterLog("Dashboard - click verify successbar"); 
  			log.info("****************************** Dashboard: click verify successbar  *****************************************");
  			assertTrue(Dashboardpage.issuccessfulbardisplayed(), "bar is not displayed");
  		}
  		@Test(priority =39,enabled = true) 
  		public void clickongoingactivecommunicactions() throws InterruptedException
  		{
  			reporterLog("Dashboard - click ongoingactivecommunicactions"); 
  			log.info("****************************** Dashboard: click ongoingactivecommunicactions  *****************************************");
  			Dashboardpage.clickongoingactivecommunicactions();
  		}
  		@Test(priority =40,enabled = true) 
  		public void isongoingbardisplayed() throws InterruptedException
  		{
  			reporterLog("Dashboard - click verify ongoing bar "); 
  			log.info("****************************** Dashboard: click verify ongoing bar  *****************************************");
  			assertTrue(Dashboardpage.isongoingbardisplayed(), "bar is not displayed");
  		}
  		
  		@Test(priority =41,enabled = true) 
  		public void  clickfailedcommunicactions() throws InterruptedException
  		{
  			reporterLog("Dashboard - click  clickfailedcommunicactions"); 
  			log.info("****************************** Dashboard: click  clickfailedcommunicactions  *****************************************");
  			Dashboardpage.clickfailedcommunicactions();
  		}
  		@Test(priority =42, dependsOnMethods = "clickfailedcommunicactions",enabled = true) 
  		public void  clickviewconnections() throws InterruptedException
  		{
  			reporterLog("Dashboard - click  clickfailedcommunicactions"); 
  			log.info("****************************** Dashboard: click  connections overview  *****************************************");
  			Dashboardpage.clickviewconnections();
  		}
  		@Test(priority =43, dependsOnMethods = "clickviewconnections",enabled = true) 
  		public void  clickviewcommunicactions() throws InterruptedException
  		{
  			reporterLog("Dashboard - click  communications overview"); 
  			log.info("****************************** Dashboard: click  communications overview  *****************************************");
  			Dashboardpage.clickviewcommunicactions();
  		}
  		@Test(priority =44,enabled = true) 
  		public void  clickdevicegroupfilter() throws InterruptedException
  		{
  			reporterLog("Dashboard - click  devicegroupfilter"); 
  			log.info("****************************** Dashboard: click devicegroupfilter *****************************************");
  			Dashboardpage.clickdevicegroupfilter();
  		}
  		@Test(priority =45,enabled = true) 
  		public void  clickdevicegroupfilterbeacon() throws InterruptedException
  		{
  			reporterLog("Dashboard - click  devicegroupfilter beacon devices"); 
  			log.info("****************************** Dashboard: click devicegroupfilter beacon devices *****************************************");
  			Dashboardpage.clickdevicegroupfilterbeacon();
  		}
  		@Test(priority =46,enabled = true) 
  		public void  clickdevicegroupfilterelectric() throws InterruptedException
  		{
  			reporterLog("Dashboard - click  devicegroupfilter beacon devices"); 
  			log.info("****************************** Dashboard: click devicegroupfilter electric devices *****************************************");
  			Dashboardpage.clickdevicegroupfilterelectric();
  		}
  		@Test(priority =47,enabled = true) 
  		public void  scrollActivecommservers() throws InterruptedException
  		{
  			reporterLog("Dashboard - scroll to Activecommservers"); 
  			log.info("****************************** Dashboard: scroll to Activecommservers*****************************************");
  			Dashboardpage.scrollActivecommservers();
  		}
  		
  		@Test(priority =48,enabled = true) 
  		public void  clickmanagecommunicactionserver() throws InterruptedException
  		{
  			reporterLog("Dashboard - click managecommunicactionserver"); 
  			log.info("****************************** Dashboard: click managecommunicactionserver*****************************************");
  			Dashboardpage.clickmanagecommunicactionserver();
  		}
  		
  		@Test(priority =49,enabled = true) 
  		public void  clickAssigntome() throws InterruptedException
  		{
  			reporterLog("Dashboard - click managecommunicactionserver"); 
  			log.info("****************************** Dashboard: click Assigntome link*****************************************");
  			Dashboardpage.clickAssigntome();
  		}
  		@Test(priority =50,enabled = true) 
  		public void  clickInmyworkgroups() throws InterruptedException
  		{
  			reporterLog("Dashboard - click Inmyworkgroups link"); 
  			log.info("****************************** Dashboard: click Inmyworkgroups link*****************************************");
  			Dashboardpage.clickInmyworkgroups();
  		}
  		
	@AfterClass
	public void tearDown() {
		log.info("*********************Browser closed****************************");
		logout();
	}   
      
      
      
              
}

