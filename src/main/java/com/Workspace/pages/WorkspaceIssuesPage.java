package com.Workspace.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WorkspaceIssuesPage extends TestBase {

	public  WorkspaceIssuesPage()   {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);

		waitForTime(3000);
		Multisense();
		waitForTime(2000);
		Workspace();
	}

	public void clickCreateIssue() throws InterruptedException
	{


		Thread.sleep(2500);
		try {
			//WebElement Workspace = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_Workspace")));
			//TestUtil.waitforElementTobeLocated(Workspace, 10);
			//doClick(Workspace);
			WebElement createIssueLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_createIssueLink")));
			TestUtil.waitforElementTobeLocated(createIssueLink, 10);
			waitForTime(1000);
			doClick(createIssueLink);
			waitForTime(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void InputIssuedetails(String DeviceName, String IssueReason, String Urgency, String Impact ) throws InterruptedException
	{
		WebElement device = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_device")));
		TestUtil.waitforElementTobeLocated(device, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		doClear(device);
		sendkeys(DeviceName, device);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement  reason= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_reason")));
		doClear(reason);
		sendkeys(IssueReason, reason);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement  issueurgency= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_issueurgency")));
		doClear(issueurgency);
		sendkeys(Urgency, issueurgency);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement issueimpact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_issueimpact")));
		doClear(issueimpact);
		sendkeys(Impact,issueimpact );
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement savebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataValidation_savebutton")));
		doClick(savebutton);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

	}




	public void clickonWorkspace() throws InterruptedException{
		WebElement workspace = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_workspace")));
		TestUtil.waitforElementTobeLocated(workspace,25);	

		doClick(workspace);
	}
	public void clickonissueLink() throws InterruptedException{
		WebElement  issueLink= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_issueLink")));
		TestUtil.waitforElementTobeLocated(issueLink,25);	

		doClick(issueLink);}
	public void clickonclearBtn() throws InterruptedException{
		WebElement clearBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_clearBtn")));
		TestUtil.waitforElementTobeLocated(clearBtn,25);	

		doClick(clearBtn);}
	public void clickontypeButton() throws InterruptedException{
		WebElement typeButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_typeButton")));
		TestUtil.waitforElementTobeLocated(typeButton,25);	

		doClick(typeButton);}
	public void clickonType() throws InterruptedException{
		WebElement  selectType= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_selectType")));
		TestUtil.waitforElementTobeLocated(selectType,25);	

		doClick(selectType);}
	public void clickonApply() throws InterruptedException{
		WebElement btnApply = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_btnApply")));
		TestUtil.waitforElementTobeLocated(btnApply,25);	

		doClick(btnApply);}

	public void clickonText() throws InterruptedException{
		WebElement verifyTital = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_verifyTital")));
		TestUtil.waitforElementTobeLocated(verifyTital,25);	
		doClick(verifyTital);}
	public void clickonIssueoverview() throws InterruptedException{
		WebElement overviewLink= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_overviewLink")));
		TestUtil.waitforElementTobeLocated(overviewLink,25);	
		doClick(overviewLink);}
	public void clickonClear() throws InterruptedException{
		WebElement clrBtn= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_clrBtn")));
		TestUtil.waitforElementTobeLocated(clrBtn,25);	

		doClick(clrBtn);}

	public void clickonGearbtn() throws InterruptedException{

		WebElement gearBtn= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_gearBtn")));
		TestUtil.waitforElementTobeLocated(gearBtn,25);	
		doClick(gearBtn);}
	public void clickonStartprocess() throws InterruptedException{
		WebElement processBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("WorkSpaceDataExchange_processBtn")));
		TestUtil.waitforElementTobeLocated(processBtn,25);	
		doClick(processBtn);}


}



