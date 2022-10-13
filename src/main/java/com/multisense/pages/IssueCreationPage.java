package com.multisense.pages;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


//import autoit
public class IssueCreationPage extends TestBase {

	String Name = generateRandomName(9); 


	public IssueCreationPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Administration();
	}

	public void clickissuecreationpage() throws InterruptedException
	{		
		WebElement ConxoMultisense_IssueCreationPage_issuecreationpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuecreationpage")));
		doClick(ConxoMultisense_IssueCreationPage_issuecreationpage);
	}

	public void clickaddissuebutton() throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConxoMultisense_IssueCreationPage_addrulebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_addrulebutton")));
		doClick(ConxoMultisense_IssueCreationPage_addrulebutton);

	}


	public void addCreationrule(String IssueType , String RuleTemplate , String DeviceType, String devicestate, String Threshhold ,String Event , String IssueReason, String Action, String To, String UpdateName ) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConxoMultisense_IssueCreationPage_issuename = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuename")));
		doClick(ConxoMultisense_IssueCreationPage_issuename);
		sendkeys(Name, ConxoMultisense_IssueCreationPage_issuename);


		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConxoMultisense_IssueCreationPage_issuetypedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuetypedropdown")));
		doClick(ConxoMultisense_IssueCreationPage_issuetypedropdown);

		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options){  
			if(element.getText().equals(IssueType)){  

				element.click();
			}
		}

		WebElement ConxoMultisense_IssueCreationPage_ruletemplate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_ruletemplate")));
		doClick(ConxoMultisense_IssueCreationPage_ruletemplate);


		List<WebElement> options1= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options1){  
			if(element.getText().equals(RuleTemplate)){  

				element.click();
			}
		}

		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConxoMultisense_IssueCreationPage_devicetype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_devicetype")));
		doClick(ConxoMultisense_IssueCreationPage_devicetype);
		List<WebElement> options2= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options2){  
			if(element.getText().equals(DeviceType)){  

				element.click();
			}
		}
		doClick(ConxoMultisense_IssueCreationPage_devicetype);

		WebElement ConxoMultisense_IssueCreationPage_DeviceState = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_DeviceState")));
		doClick(ConxoMultisense_IssueCreationPage_DeviceState);
		List<WebElement> options11= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options11){  
			if(element.getText().equals(devicestate)){  

				element.click();
			}
		}
		doClick(ConxoMultisense_IssueCreationPage_DeviceState);

		WebElement ConxoMultisense_IssueCreationPage_threshold = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_threshold")));
		doClear(ConxoMultisense_IssueCreationPage_threshold);
		sendkeys(Threshhold, ConxoMultisense_IssueCreationPage_threshold);
		waitForTime(2000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConxoMultisense_IssueCreationPage_event = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_event")));
		doClick(ConxoMultisense_IssueCreationPage_event);
		List<WebElement> options3= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options3){  
			if(element.getText().equals(Event)){  

				element.click();
			}
		}
		waitForTime(2000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConxoMultisense_IssueCreationPage_issuereason = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuereason")));
		doClick(ConxoMultisense_IssueCreationPage_issuereason);
		List<WebElement> options4= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options4){  
			if(element.getText().equals(IssueReason)){  

				element.click();
			}
		}
		WebElement ConxoMultisense_IssueCreationPage_addaction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_addaction")));
		doClick(ConxoMultisense_IssueCreationPage_addaction);
		waitForTime(2000);
		WebElement ConxoMultisense_IssueCreationPage_actiondrpdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_actiondrpdown")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_actiondrpdown,10);
		doClick(ConxoMultisense_IssueCreationPage_actiondrpdown);
		List<WebElement> options5= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options5){  
			if(element.getText().equals(Action)){  

				element.click();
			}
		}
		waitForTime(2000);
		WebElement ConxoMultisense_IssueCreationPage_Mailactionto = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_Mailactionto")));
		doClick(ConxoMultisense_IssueCreationPage_Mailactionto);
		sendkeys(To,ConxoMultisense_IssueCreationPage_Mailactionto);
		waitForTime(2000);
		WebElement ConxoMultisense_IssueCreationPage_addactionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_addactionbutton")));
		doClick(ConxoMultisense_IssueCreationPage_addactionbutton);

		WebElement ConxoMultisense_IssueCreationPage_adddevicegroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_adddevicegroup")));
		doClick(ConxoMultisense_IssueCreationPage_adddevicegroup);
		WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox12.click();
		WebElement checkbox13 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox13.click();

		WebElement ConxoMultisense_IssueCreationPage_adddevicecheckboxbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_adddevicecheckboxbutton")));
		doClick(ConxoMultisense_IssueCreationPage_adddevicecheckboxbutton);
		waitForTime(5000);
		WebElement ConxoMultisense_IssueCreationPage_addissuebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_addissuebutton")));
		doClick(ConxoMultisense_IssueCreationPage_addissuebutton);
	}
	
		public void editIssueCreation(String UpdateName)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		waitForTime(5000);
		WebElement a = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		WebElement ConxoMultisense_IssueCreationPage_EditIssueCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_EditIssueCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_EditIssueCreation, 10);
		doClick(ConxoMultisense_IssueCreationPage_EditIssueCreation);

		waitForTime(5000);
		WebElement ConxoMultisense_IssueCreationPage_issuename = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuename")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_issuename, 10);
		doClear(ConxoMultisense_IssueCreationPage_issuename);
		sendkeys(UpdateName, ConxoMultisense_IssueCreationPage_issuename);
		WebElement ConxoMultisense_IssueCreationPage_saveIssuecreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_saveIssuecreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_saveIssuecreation, 10);
		waitForTime(2000);
		doClick(ConxoMultisense_IssueCreationPage_saveIssuecreation);
	}
	
	public void activateIssueCreation()
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		waitForTime(5000);
		WebElement a = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		WebElement ConxoMultisense_IssueCreationPage_ActivateIssueCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_ActivateIssueCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_ActivateIssueCreation, 10);
		doClick(ConxoMultisense_IssueCreationPage_ActivateIssueCreation);
	}
	
	public void deactivateIssueCreation()
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		waitForTime(5000);
		WebElement a = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		WebElement ConxoMultisense_IssueCreationPage_DeactivateIssueCreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_DeactivateIssueCreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_DeactivateIssueCreation, 10);
		doClick(ConxoMultisense_IssueCreationPage_DeactivateIssueCreation);
	}

	public void removeIssueCreation(String UpdateName)
	{
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		waitForTime(5000);
		
		WebElement a =DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ UpdateName +"']//ancestor::td//following-sibling::td//span"));
		scrolldown(a);
		waitForTime(3000);
		WebElement ConxoMultisense_IssueCreationPage_removeissuecreation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_removeissuecreation")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_IssueCreationPage_removeissuecreation, 10);
		doClick(ConxoMultisense_IssueCreationPage_removeissuecreation);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ UpdateName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	public void VerifyAddIssueCreationRulesFields()
	{
		WebElement ConxoMultisense_IssueCreationPage_addissuebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_addissuebutton")));
		doClick(ConxoMultisense_IssueCreationPage_addissuebutton);
		String ExpectedName = "This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationname")));
		doClick(ActualName);
		SoftAssertfunction(ActualName, ExpectedName);
		String ExpectedRuleTemplate = "This field is required";
		WebElement ActualRuleTemplate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationruletemplate")));
		doClick(ActualRuleTemplate);
		SoftAssertfunction(ActualRuleTemplate, ExpectedRuleTemplate);
		String ExpectedIssueReason = "This field is required";
		WebElement ActualIssueReason = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyissuecreationissuereason")));
		doClick(ActualIssueReason);
		SoftAssertfunction(ActualIssueReason, ExpectedIssueReason);
		WebElement ConxoMultisense_IssueCreationPage_issuecreationcancel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuecreationcancel")));
		doClick(ConxoMultisense_IssueCreationPage_issuecreationcancel);
	}
	
	public void VerifyAddActionFields()
	{
	    WebElement ConxoMultisense_IssueCreationPage_addactionbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_addactionbutton")));
	    doClick(ConxoMultisense_IssueCreationPage_addactionbutton);
	    WebElement ConxoMultisense_IssueCreationPage_adddevicecheckboxbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_adddevicecheckboxbutton")));
		doClick(ConxoMultisense_IssueCreationPage_adddevicecheckboxbutton);
		String ExpectedAction = "This field is required";
		WebElement ActualAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_verifyaddaction")));
		doClick(ActualAction);
		SoftAssertfunction(ActualAction, ExpectedAction);
		WebElement ConxoMultisense_IssueCreationPage_cancelissuebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_IssueCreationPage_issuecreationcancel")));
		doClick(ConxoMultisense_IssueCreationPage_cancelissuebutton);
	}

}