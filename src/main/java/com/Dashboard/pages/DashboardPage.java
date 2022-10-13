package com.Dashboard.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
public class DashboardPage extends TestBase {


	public  DashboardPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Dashboard();
	}

	public void clickIssuedropdown() throws InterruptedException
	{
		WebElement Issuesdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuesdropdown")));
		doClick(Issuesdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='Issues']")).click();
		
		WebElement issuedetail = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuedetail")));
		TestUtil.waitforElementTobeLocated(issuedetail, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(issuedetail);
	}
	
	public void clickIssuesactionsassiss() throws InterruptedException
		
	{
		WebElement actionsdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactions")));
		TestUtil.waitforElementTobeLocated(actionsdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsdd);
		
		WebElement assigniss = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionsassignissue")));
		TestUtil.waitforElementTobeLocated(assigniss, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(assigniss);
		
		WebElement wgdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_wgdrop")));
		TestUtil.waitforElementTobeLocated(wgdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(wgdd);
		doClick(wgdd);
		
		WebElement usrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usrdrop")));
		TestUtil.waitforElementTobeLocated(usrdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(usrdd);
		doClick(usrdd);
		
		WebElement chgass = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_changeassign")));
		TestUtil.waitforElementTobeLocated(chgass, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(chgass);
		
		}
		
	public void clickIssuesactionssnz() throws InterruptedException
	
	{
	
		WebElement actionsd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactions")));
		TestUtil.waitforElementTobeLocated(actionsd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd1);
		
		WebElement snz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionssnooze")));
		TestUtil.waitforElementTobeLocated(snz, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(snz);
		
		WebElement setsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuesetsnooze")));
		TestUtil.waitforElementTobeLocated(setsnz, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(setsnz);
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void clickIssuesactionsunass() throws InterruptedException
	{
	
		WebElement actionsd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactions")));
		TestUtil.waitforElementTobeLocated(actionsd2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd2);
		
		WebElement unass = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionsunassign")));
		TestUtil.waitforElementTobeLocated( unass, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(unass);
		
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void clickIssuesactionsasstome() throws InterruptedException
	{
		WebElement actionsd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactions")));
		TestUtil.waitforElementTobeLocated(actionsd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd3);
		
		WebElement asstome = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionsassigntome")));
		TestUtil.waitforElementTobeLocated(asstome, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(asstome);
		TimeUnit.SECONDS.sleep(5);	
		
	}
	
	public void clickIssuesactionssetprio(String priorityValue) throws InterruptedException
	
	{
	
		WebElement actionsd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactions")));
		TestUtil.waitforElementTobeLocated(actionsd4 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd4);
		
		WebElement setprior = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionssetpriority")));
		TestUtil.waitforElementTobeLocated(setprior, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(setprior);
		
		WebElement seturg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_priorityurgenyinput")));
		TestUtil.waitforElementTobeLocated(seturg, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(seturg);
		sendkeys(priorityValue, seturg);
		
		
		WebElement saveprio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionssetprioritysave")));
		TestUtil.waitforElementTobeLocated(saveprio , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(saveprio);
		TimeUnit.SECONDS.sleep(5);
		
		WebElement updprio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactionssetprioritychanged")));
		TestUtil.waitforElementTobeLocated( updprio , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick( updprio);
		doClick( updprio);
		
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void clickIssuesactionscls(String reasonValue, String clsComm) throws InterruptedException
	{
		
		WebElement actionsd5 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issueactions")));
		TestUtil.waitforElementTobeLocated(actionsd5 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd5);
		
		WebElement clsissue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuescloseissue")));
		TestUtil.waitforElementTobeLocated(clsissue , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsissue);
		
		WebElement clsdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuesclosed")));
		TestUtil.waitforElementTobeLocated(clsdd , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsdd);
		doClick(clsdd);
		
		WebElement inpreasn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuesclsreason")));
		TestUtil.waitforElementTobeLocated(inpreasn , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(inpreasn);
		sendkeys(reasonValue, inpreasn);
		
		WebElement clsclik = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuesclsclick")));
		TestUtil.waitforElementTobeLocated(clsclik , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsclik);
		
		
		WebElement clscmbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuesclscomm")));
		TestUtil.waitforElementTobeLocated(clscmbox , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(clscmbox);
		sendkeys(clsComm, clscmbox);
		
		
		WebElement clsbt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_issuesclosebt")));
		TestUtil.waitforElementTobeLocated(clsbt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsbt);
		
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		
	}
		
	public void clickIssuesmyworkgroup() throws InterruptedException
	{
		WebElement inmyworkgroups1= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_inmyworkgroups")));
		TestUtil.waitforElementTobeLocated(inmyworkgroups1, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(inmyworkgroups1);

		WebElement eleDashboard2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard2);
		
	}

	
	public void clickAlarmdropdown() throws InterruptedException
	{
		WebElement Alarmsdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuesdropdown")));
		doClick(Alarmsdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='Alarms']")).click();
		waitForTime(3000);
		WebElement alarmdetail = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Alarmdetail")));
		TestUtil.waitforElementTobeLocated(alarmdetail, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(alarmdetail);
		
	}
	
	public void clickAlarmactionsassign() throws InterruptedException
	
	{
		
		WebElement actionsdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactions")));
		TestUtil.waitforElementTobeLocated(actionsdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsdd);
		
		WebElement assignala = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionsassignalarm")));
		TestUtil.waitforElementTobeLocated(assignala, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(assignala);
		
		WebElement wgdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmwgdrop")));
		TestUtil.waitforElementTobeLocated(wgdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(wgdd);
		doClick(wgdd);
		
		WebElement usrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmusrdrop")));
		TestUtil.waitforElementTobeLocated(usrdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(usrdd);
		doClick(usrdd);
		
		WebElement chgass = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmchangeassign")));
		TestUtil.waitforElementTobeLocated(chgass, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(chgass);
		
	}
	
	public void clickAlarmactionssnz() throws InterruptedException
	{
	
		WebElement actionsd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactions")));
		TestUtil.waitforElementTobeLocated(actionsd1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd1);
		
		WebElement snz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionssnooze")));
		TestUtil.waitforElementTobeLocated(snz, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(snz);
		
		WebElement setsnz = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsetsnooze")));
		TestUtil.waitforElementTobeLocated(setsnz, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(setsnz);
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void clickAlarmactionsunassign() throws InterruptedException
	{
		WebElement actionsd2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactions")));
		TestUtil.waitforElementTobeLocated(actionsd2 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd2);
		
		WebElement unass = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionsunassign")));
		TestUtil.waitforElementTobeLocated( unass, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(unass);
		TimeUnit.SECONDS.sleep(5);
	}
	
		
		public void clickAlarmactionasstome() throws InterruptedException
		{
		WebElement actionsd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactions")));
		TestUtil.waitforElementTobeLocated(actionsd3 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd3);
		
		WebElement asstome = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionsassigntome")));
		TestUtil.waitforElementTobeLocated(asstome, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(asstome);
		TimeUnit.SECONDS.sleep(5);
		
		}
		
		public void clickAlarmactionsetprio(String priorityValue) throws InterruptedException
		{
		
		
		WebElement actionsd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactions")));
		TestUtil.waitforElementTobeLocated(actionsd4 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd4);
		
		WebElement setprior = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionssetpriority")));
		TestUtil.waitforElementTobeLocated(setprior, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(setprior);
		
		WebElement seturg = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_priorityurgenyinput")));
		TestUtil.waitforElementTobeLocated(seturg, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(seturg);
		sendkeys(priorityValue, seturg);
		
		WebElement saveprio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionssetprioritysave")));
		TestUtil.waitforElementTobeLocated(saveprio , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(saveprio);
		TimeUnit.SECONDS.sleep(5);
		
		WebElement updprio = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactionssetprioritychanged")));
		TestUtil.waitforElementTobeLocated( updprio , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick( updprio);
		doClick( updprio);
		
		TimeUnit.SECONDS.sleep(5);
		
		}
		
		public void clickAlarmactionclsala(String reasonValue, String clsCmbox ) throws InterruptedException
		{
		
		WebElement actionsd5 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmactions")));
		TestUtil.waitforElementTobeLocated(actionsd5 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsd5);
		
		WebElement clsala = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsclosealarm")));
		TestUtil.waitforElementTobeLocated(clsala , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsala);
		
		WebElement clsdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsclosed")));
		TestUtil.waitforElementTobeLocated(clsdd , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsdd);
		doClick(clsdd);
		
		WebElement inpreasn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsclsreason")));
		TestUtil.waitforElementTobeLocated(inpreasn , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(inpreasn);
		sendkeys(reasonValue, inpreasn);
		
		WebElement clsclik = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsclsclick")));
		TestUtil.waitforElementTobeLocated(clsclik , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsclik);

		WebElement clscm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsclscomm")));
		TestUtil.waitforElementTobeLocated(clscm , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(clscm);
		sendkeys(clsCmbox, clscm);

		WebElement clsbt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_alarmsclosebt")));
		TestUtil.waitforElementTobeLocated(clsbt , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(clsbt);
		
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		}
		
		public void clickAlarmmywrkgps() throws InterruptedException
		{
		WebElement Usertasksdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuesdropdown")));
		doClick(Usertasksdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='Alarms']")).click();
		TimeUnit.SECONDS.sleep(5);
		WebElement inmyworkgroups= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_inmyworkgroups")));
		TestUtil.waitforElementTobeLocated(inmyworkgroups, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(inmyworkgroups);
		TimeUnit.SECONDS.sleep(2);
		WebElement eleDashboard1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard1);
		
		}

	public void clickUsertasksdropdown() throws InterruptedException
	{
		WebElement Usertasksdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuesdropdown")));
		doClick(Usertasksdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='User tasks']")).click();
		waitForTime(3000);
		WebElement usertaskdetail = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskdetail")));
		TestUtil.waitforElementTobeLocated(usertaskdetail, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(usertaskdetail);
	}
	
	public void clickUsertasksactionsstart() throws InterruptedException
	{
		
		WebElement actionsdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskctions")));
		TestUtil.waitforElementTobeLocated(actionsdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsdd);
		
		WebElement actionstart = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskactionsstart")));
		TestUtil.waitforElementTobeLocated(actionstart, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionstart);
		TimeUnit.SECONDS.sleep(2);
		WebElement strcancel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskactionsstartcancel")));
		TestUtil.waitforElementTobeLocated(strcancel, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(strcancel);
		
		TimeUnit.SECONDS.sleep(5);
	}
	
	
	public void clickUsertasksactionsunass() throws InterruptedException
	{
		WebElement actionsdd1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskctions")));
		TestUtil.waitforElementTobeLocated(actionsdd1, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsdd1);
		
		WebElement actionunassign = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskactionsunassign")));
		TestUtil.waitforElementTobeLocated(actionunassign, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionunassign);
		TimeUnit.SECONDS.sleep(5);
	}
	
	public void clickUsertasksactionsasstome() throws InterruptedException
	{
		WebElement actionsdd3 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskctions")));
		TestUtil.waitforElementTobeLocated(actionsdd3, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsdd3);
		
		WebElement actionsassigntome = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskactionsassigntome")));
		TestUtil.waitforElementTobeLocated(actionsassigntome, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsassigntome);
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void clickUsertasksactionseditatt(String priorityVal) throws InterruptedException
	{
	
		WebElement actionsdd4 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskctions")));
		TestUtil.waitforElementTobeLocated(actionsdd4, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actionsdd4);
		
		WebElement actioneditatt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskactionsEditattributes")));
		TestUtil.waitforElementTobeLocated(actioneditatt, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(actioneditatt);
		
		WebElement wkgrpdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskwgdrop")));
		TestUtil.waitforElementTobeLocated(wkgrpdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(wkgrpdd);
		doClick(wkgrpdd);
		
		WebElement usrdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskusrdrop")));
		TestUtil.waitforElementTobeLocated(usrdd, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(usrdd);
		doClick(usrdd);
		
		WebElement duecal1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskduecalender")));
		TestUtil.waitforElementTobeLocated(duecal1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(duecal1);
		

		WebElement settoday = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertasktoday")));
		TestUtil.waitforElementTobeLocated(settoday, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(settoday);
		TimeUnit.SECONDS.sleep(5);
		
		WebElement setprio1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskprioinp")));
		TestUtil.waitforElementTobeLocated(setprio1 , 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClear(setprio1);
		sendkeys(priorityVal, setprio1);
	}
	
	public void clickUsertasksactionseditattsave() throws InterruptedException
	
		{
		WebElement attsave = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_usertaskattributesave")));
		TestUtil.waitforElementTobeLocated(attsave, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(attsave);
		
		TimeUnit.SECONDS.sleep(5);

		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		
	}
	public void clickUsertasksinmywrkgrps() throws InterruptedException
	{
		WebElement Usertasksdropdown1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuesdropdown")));
		doClick(Usertasksdropdown1);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='User tasks']")).click();
		TimeUnit.SECONDS.sleep(5);
		WebElement inmyworkgroups= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_inmyworkgroups")));
		TestUtil.waitforElementTobeLocated(inmyworkgroups, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(inmyworkgroups);
		TimeUnit.SECONDS.sleep(2);
		WebElement eleDashboard2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard2);
		
	}
	
	public void clickdevicegroupfilter() throws InterruptedException
	{
		WebElement devicegroupdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_devicegroupdropdown")));
		TestUtil.waitforElementTobeLocated(devicegroupdropdown, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(devicegroupdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(@class,'x-component x-box-item')]//a")).click();
		waitForTime(5000);

	}
	
	public void clickdevicegroupfilterbeacon() throws InterruptedException
	{
		WebElement devicegroupdropdown1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_devicegroupdropdown")));
		TestUtil.waitforElementTobeLocated(devicegroupdropdown1, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(devicegroupdropdown1);

		WebElement becndev = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Devicegroup_becon")));	
		TestUtil.waitforElementTobeLocated(becndev, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(becndev);
		TimeUnit.SECONDS.sleep(10);
	
	}
	
	public void clickdevicegroupfilterelectric() throws InterruptedException
	{
		WebElement devicegroupdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_devicegroupdropdown")));
		TestUtil.waitforElementTobeLocated(devicegroupdropdown, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(devicegroupdropdown);

		WebElement eledev = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Devicegroup_electric")));	
		TestUtil.waitforElementTobeLocated(eledev, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(eledev);
		TimeUnit.SECONDS.sleep(10);
	
	}

	public void clicksuccessfulactiveconnections() throws InterruptedException
	{
//		 WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement Successfulactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Successfulactivelink")));	
		TestUtil.waitforElementTobeLocated(Successfulactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(Successfulactivelink);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}
	
	public boolean issuccessfulbardisplayed() throws InterruptedException
	
	{
			WebElement successbar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Successfulbar")));	
			return successbar.isDisplayed();
	}
	
	public boolean isfailbardisplayed() throws InterruptedException
	{
			WebElement failbar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_failbar")));	
			TestUtil.waitforElementTobeLocated(failbar, 10);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			return isDisplayed("ConnexoDashboard_failbar");
	}
	
	
	public boolean issuccessfailbardisplayed() throws InterruptedException
	{
			WebElement failbar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_successfail")));	
			return failbar.isDisplayed();
			
	}
	
	
	public boolean isongoingbardisplayed() throws InterruptedException
	{
			WebElement ongoingbar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_ongoingbar")));	
			return ongoingbar.isDisplayed();
	}
	
	
	
	public void clicksuccessfulwithfailactiveconnections() throws InterruptedException
	{
		WebElement Successfulfailactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Successfulactivelink")));	
		TestUtil.waitforElementTobeLocated(Successfulfailactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		doClick(Successfulfailactivelink);
		doClick(Successfulfailactivelink);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}

	public void clickongoingactiveconnections() throws InterruptedException
	{
//		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement ongoingactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_ongoingactivelink")));	
		TestUtil.waitforElementTobeLocated(ongoingactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(ongoingactivelink);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);	
	}
	public void clickSuccessfulwithfailedtasksactiveconnections() throws InterruptedException
	{
		WebElement Successfulwithfailedtasksactive = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Successfulwithfailedtasksactive")));	
		TestUtil.waitforElementTobeLocated(Successfulwithfailedtasksactive, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(Successfulwithfailedtasksactive);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);	
	}
	
	public void scrollActivecommservers() throws InterruptedException
	{
		WebElement scrollac = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_managecommservers")));	
		TestUtil.waitforElementTobeLocated(scrollac, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		scrolldown(scrollac);
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);	
	}
	
	public String getTextCode() {
		WebElement text = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_text")));
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return text.getText();
	}

	public void clickfailedactiveconnections() throws InterruptedException
	{
//		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement Failedactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Failedactivelink")));	
		TestUtil.waitforElementTobeLocated(Failedactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(Failedactivelink);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}

	public void clickviewconnections() throws InterruptedException
	{
//		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement viewconnectionoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_viewconnectionoverview")));	
		TestUtil.waitforElementTobeLocated(viewconnectionoverview, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(viewconnectionoverview);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}

	public void clicksuccessfulactivecommunicactions() throws InterruptedException
	{
		
		WebElement successfulcommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_successfulcommunication")));	
		TestUtil.waitforElementTobeLocated(successfulcommunication, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(successfulcommunication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}

	public void clickongoingactivecommunicactions() throws InterruptedException
	{
//		 WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		WebElement ongoingcommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_ongoingcommunication")));
		TestUtil.waitforElementTobeLocated(ongoingcommunication, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(ongoingcommunication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}

	public void clickfailedcommunicactions() throws InterruptedException
	{
//		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		WebElement failedcommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_failedcommunication")));
		TestUtil.waitforElementTobeLocated(failedcommunication, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(failedcommunication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}

	public void clickviewcommunicactions() throws InterruptedException
	{
//		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		WebElement viewcommunicationoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_viewcommunicationoverview")));
		TestUtil.waitforElementTobeLocated(viewcommunicationoverview, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(viewcommunicationoverview);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}
	
	public void clickmanagecommunicactionserver() throws InterruptedException
	{
		WebElement managecommservers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_managecommservers")));
		TestUtil.waitforElementTobeLocated(managecommservers, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(managecommservers);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}
	
	// search function
	
	public void clickSearchflagdev() throws InterruptedException
	{
		WebElement normalSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleMainSearchBtn")));
		TestUtil.waitforElementTobeLocated(normalSearch, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(normalSearch);
		
		//device search  
		WebElement devSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleDeviceType")));
		TestUtil.waitforElementTobeLocated(devSearch, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(devSearch);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement selectAllDevice = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSelectTypeAll")));		
		doClick(selectAllDevice);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
		TimeUnit.SECONDS.sleep(5);
		
		WebElement selectSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSearch")));		
		doClick(selectSearch);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		TimeUnit.SECONDS.sleep(5);
		
		WebElement selectDev = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectDev")));		
		doClick(selectDev);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement flag = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectDevflag")));		
		doClick(flag);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement flagbt = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectDevflagdevbt")));		
		doClick(flagbt);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		


	}
	
	
	public void clickSearchunflagdev() throws InterruptedException
	{
		WebElement unflag = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectDevunflag")));
		TestUtil.waitforElementTobeLocated(unflag, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(unflag);
		
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
			
	}
	
	public void clickDevfilsearch() throws InterruptedException
	{
		WebElement searchDev = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_devfilsearch")));		
		doClick(searchDev);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	
	// end search
	
	public void clickRefresh() throws InterruptedException
	{
		WebElement refresh = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_refresh")));
		TestUtil.waitforElementTobeLocated(refresh, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(refresh);
		
		
//		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
//		doClick(eleDashboard);
	}
	
	public void clickAssigntome() throws InterruptedException
	{
		WebElement assigntome= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_assigntome")));
		TestUtil.waitforElementTobeLocated(assigntome, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(assigntome);
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		
		
	}
	public void clickInmyworkgroups() throws InterruptedException
	{
		WebElement inmyworkgroups= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_inmyworkgroups")));
		TestUtil.waitforElementTobeLocated(inmyworkgroups, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(inmyworkgroups);
		
		
	}
	
	public void clickSelectcheckmultifav() throws InterruptedException
	{
		WebElement dashselect= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_select")));
		TestUtil.waitforElementTobeLocated(dashselect, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(dashselect);
		
		WebElement checkone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_checkone")));
		TestUtil.waitforElementTobeLocated(checkone, 10);
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//doClick(checkone);
		selectCheckBox(checkone);
		
		WebElement checkthree = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_checkthree")));
		TestUtil.waitforElementTobeLocated(checkthree, 10);
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//doClick(checkthree);
		selectCheckBox(checkthree);
		
		WebElement checktwo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_checktwo")));
		TestUtil.waitforElementTobeLocated(checktwo, 10);
		//DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//doClick(checktwo);
		selectCheckBox(checktwo);
		
		WebElement save = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_save")));
		TestUtil.waitforElementTobeLocated(save, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(save);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		
	}
	

	public void clickSelectuncheckallfav() throws InterruptedException
	{
		
		WebElement dashselect= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_select")));
		TestUtil.waitforElementTobeLocated(dashselect, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(dashselect);
		
		WebElement uncheckall = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_uncheckall")));
		TestUtil.waitforElementTobeLocated(uncheckall, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(uncheckall);
		
		WebElement save = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_save")));
		TestUtil.waitforElementTobeLocated(save, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(save);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}
	
	public void clickSelectcheckfavone() throws InterruptedException
	{
		WebElement dashselect= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_select")));
		TestUtil.waitforElementTobeLocated(dashselect, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(dashselect);
		
		WebElement checkone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_checkone")));
		TestUtil.waitforElementTobeLocated(checkone, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(checkone);
		
		WebElement save = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_save")));
		TestUtil.waitforElementTobeLocated(save, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(save);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
	}
	
	
	public void clickSelectuncheckfavone() throws InterruptedException
	{
		WebElement dashselect= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_select")));
		TestUtil.waitforElementTobeLocated(dashselect, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(dashselect);
		
		WebElement checkone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_checkone")));
		TestUtil.waitforElementTobeLocated(checkone, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(checkone);
		
		WebElement save = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_save")));
		TestUtil.waitforElementTobeLocated(save, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(save);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);

	}
	
	


	public void clickInfo() throws InterruptedException
	{
		WebElement select= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_infostatus")));
		TestUtil.waitforElementTobeLocated(select, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(select);
		
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);

	}
	
	public void clickUncheck() throws InterruptedException
	{
		WebElement uncheck= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_uncheckall")));
		TestUtil.waitforElementTobeLocated(uncheck, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(uncheck);
		
//		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
//		doClick(eleDashboard);
	}
	public void clickSave() throws InterruptedException
	{
		WebElement save= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_save")));
		TestUtil.waitforElementTobeLocated(save, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		doClick(save);
		
		
//		WebElement eleDashboard = driver.findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
//		doClick(eleDashboard);
	}
	

	
}


