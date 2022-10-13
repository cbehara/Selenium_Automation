package com.multisense.pages.EstimationRuleSet;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

//import io.reactivex.rxjava3.functions.Action;

public class EstimationRuleSetPage extends TestBase {
	
	String Name = generateRandomName(8);
	String UpdateName = generateRandomName(8);			 
		 
	public EstimationRuleSetPage()  {
		login();
        PageFactory.initElements(DriverUtility.getDriver(), this);
        Multisense();
        Administration();
	}
	
	public void sendText(String value)
	{
		WebElement ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName")));
		sendkeys(value, ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName);
	}
	public void clickEstimationRuleSet() throws InterruptedException
	{
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_estimationruleset = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_estimationruleset")));
		doClick(ConnexoMultisense_EstmnRulesetPage_estimationruleset);
	}
	public void clickAddEstimationRuleSet() throws InterruptedException
	{
		WebElement ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet")));
		if (ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet.isDisplayed()){
			TestUtil.waitforElementTobeLocated(ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet, 30);
			doClick(ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet);
			waitForTime(500);
		}
		else
		{
			WebElement ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet1")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet1, 30);			
			doClick(ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet1);
			waitForTime(500);
		}
	}
	
	public void clickOnSaveEstimateRuleSet() throws InterruptedException
	{
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet")));
		doClick(ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSet);
	}
	
	public void createEstimationRuleset(String Description) throws InterruptedException
	{
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName")));
		doClear(ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName);
		sendkeys(Name, ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetName);
		WebElement ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetDescription")));
		doClear(ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetDescription);
		sendkeys(Description, ConnexoMultisense_EstmnRulesetPage_EstimationRuleSetDescription);
	}
	public void clickAddEstimationRuleSetButton()
	{
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSetButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSetButton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_addEstimationRuleSetButton);
	}
	public void clickOnEditEstimateRuleSet(String UpdateDescription) throws InterruptedException
	{
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));		
		DriverUtility.getDriver().findElement(By.xpath("//body/div[@class='x-container x-border-item x-box-item x-container-default x-layout-fit']/div[@class='x-container x-fit-item x-container-contentcontainer x-box-layout-ct']/div[@role='presentation']/div[@role='presentation']/div[@class='x-container center x-box-item x-container-default x-box-layout-ct']/div[@role='presentation']/div[@role='presentation']/div[@class='x-panel x-box-item x-panel-large']/div[@class='x-panel-header x-header x-header-horizontal x-docked x-unselectable x-panel-header-large x-horizontal x-panel-header-horizontal x-panel-header-large-horizontal x-top x-panel-header-top x-panel-header-large-top x-horizontal-noborder x-panel-header-horizontal-noborder x-panel-header-large-horizontal-noborder x-docked-top x-panel-header-docked-top x-panel-header-large-docked-top x-noborder-trl']/div[@role='presentation']/div[@role='presentation']/div[@role='presentation']/a[@class='x-btn x-unselectable x-box-item x-btn-default-small x-icon-text-left x-btn-icon-text-left x-btn-default-small-icon-text-left x-btn-after-title']/span[1]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//body/div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']/div[@role='presentation']/div[@role='presentation']/div[@role='presentation']/div[1]/a[1]/span[1]")).click();
		
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		createEstimationRuleset(UpdateDescription);
		WebElement ConnexoMultisense_EstmnRulesetPage_savevalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_savevalidationRuleSetbutton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_savevalidationRuleSetbutton);
		WebElement ConnexoMultisense_EstmnRulesetPage_estimationrulestab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_estimationrulestab")));
		doClick(ConnexoMultisense_EstmnRulesetPage_estimationrulestab);
		WebElement ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton);
		
	}
	public void clickOnAddEstimateRules(String UpdateDescription) throws InterruptedException
	{
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		DriverUtility.getDriver().findElement(By.xpath("//body/div[@class='x-container x-border-item x-box-item x-container-default x-layout-fit']/div[@class='x-container x-fit-item x-container-contentcontainer x-box-layout-ct']/div[@role='presentation']/div[@role='presentation']/div[@class='x-container center x-box-item x-container-default x-box-layout-ct']/div[@role='presentation']/div[@role='presentation']/div[@class='x-panel x-box-item x-panel-large']/div[@class='x-panel-header x-header x-header-horizontal x-docked x-unselectable x-panel-header-large x-horizontal x-panel-header-horizontal x-panel-header-large-horizontal x-top x-panel-header-top x-panel-header-large-top x-horizontal-noborder x-panel-header-horizontal-noborder x-panel-header-large-horizontal-noborder x-docked-top x-panel-header-docked-top x-panel-header-large-docked-top x-noborder-trl']/div[@role='presentation']/div[@role='presentation']/div[@role='presentation']/a[@class='x-btn x-unselectable x-box-item x-btn-default-small x-icon-text-left x-btn-icon-text-left x-btn-default-small-icon-text-left x-btn-after-title']/span[1]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//body/div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']/div[@role='presentation']/div[@role='presentation']/div[@role='presentation']/div[1]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		createEstimationRuleset(UpdateDescription);
		WebElement ConnexoMultisense_EstmnRulesetPage_savevalidationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_savevalidationRuleSetbutton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_savevalidationRuleSetbutton);
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_estimationrulestab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_estimationrulestab")));
		doClick(ConnexoMultisense_EstmnRulesetPage_estimationrulestab);
		WebElement ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton);
		
		
	}
	public void clickOnEstimationRules(String Estimationrule, String Estimator, String EstimationComment, String ReadingType) throws InterruptedException
	{
		
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_EstimationRuleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EstimationRuleName")));
		doClear(ConnexoMultisense_EstmnRulesetPage_EstimationRuleName);
		doClick(ConnexoMultisense_EstmnRulesetPage_EstimationRuleName);
		sendkeys(Estimationrule, ConnexoMultisense_EstmnRulesetPage_EstimationRuleName);
		
		WebElement ConnexoMultisense_EstmnRulesetPage_EstimatorDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EstimatorDropdown")));
		doClick(ConnexoMultisense_EstmnRulesetPage_EstimatorDropdown);
		WebElement estimator= DriverUtility.getDriver().findElement(By.xpath("//ul[@class='x-list-plain']"));
		List<WebElement> estimatorList=estimator.findElements(By.tagName("li"));
		for (WebElement li : estimatorList) {
		if (li.getText().equals(Estimator)) {
		     li.click();
		   }
		}
		
		WebElement ConnexoMultisense_EstmnRulesetPage_Estimationcomment = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Estimationcomment")));
		doClick(ConnexoMultisense_EstmnRulesetPage_Estimationcomment);
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options){  
		     if(element.getText().equals(EstimationComment)){  

		        element.click();
		    }
		    }
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement ConnexoMultisense_EstmnRulesetPage_AddReadingTypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_AddReadingTypesbutton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_AddReadingTypesbutton);
		Thread.sleep(1000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement minutesBulkGas = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		minutesBulkGas.click();
		WebElement minutesBulkGas1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		minutesBulkGas1.click();
		WebElement minutesBulkGas2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		minutesBulkGas2.click();
		WebElement ConnexoMultisense_EstmnRulesetPage_Addreadingtypecheckboxbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Addreadingtypecheckboxbutton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_Addreadingtypecheckboxbutton);
		WebElement ConnexoMultisense_EstmnRulesetPage_AddEstimationButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_AddEstimationButton")));
		doClick(ConnexoMultisense_EstmnRulesetPage_AddEstimationButton);
	}	
		
		public void ActivateEstimationRule()  {
			DriverUtility.getDriver().navigate().refresh();
			WebElement m = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
			
			try {
				   
				m.click();
			}
			catch(StaleElementReferenceException ex)
			{
				WebElement n= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
				doClick(n);
			}
			waitForTime(2000);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Activate']")).click();
		
		}
		
		
		public void DectivateEstimationRule()  {
			DriverUtility.getDriver().navigate().refresh();
			WebElement m = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
			
			try {
				   
				m.click();
			}
			catch(StaleElementReferenceException ex)
			{
				WebElement n= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
				doClick(n);
			}
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Deactivate']")).click();
			
			}
		
		public void EditEstimationRule()  {
			DriverUtility.getDriver().navigate().refresh();
			WebElement m = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
			
			try {
				   
				m.click();
			}
			catch(StaleElementReferenceException ex)
			{
				WebElement n= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
				doClick(n);
			}
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			WebElement ConnexoMultisense_EstmnRulesetPage_Actions_editbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions_editbutton")));
			ConnexoMultisense_EstmnRulesetPage_Actions_editbutton.click();
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			waitForTime(5000);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			WebElement ConnexoMultisense_EstmnRulesetPage_EstimationRuleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EstimationRuleName")));
			doClick(ConnexoMultisense_EstmnRulesetPage_EstimationRuleName);
			doClear(ConnexoMultisense_EstmnRulesetPage_EstimationRuleName);
			ConnexoMultisense_EstmnRulesetPage_EstimationRuleName.sendKeys("Aeb");
			waitForTime(5000);
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			WebElement ConnexoMultisense_EstmnRulesetPage_saveestimationrules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_saveestimationrules")));
			doClick(ConnexoMultisense_EstmnRulesetPage_saveestimationrules);
			
			}
		
		
		public void RemoveEstimationRule()  {
			DriverUtility.getDriver().navigate().refresh();
			WebElement m = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
			
			try {
				   
				m.click();
			}
			catch(StaleElementReferenceException ex)
			{
				WebElement n= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Actions")));
				doClick(n);
			}
			
			
			
			DriverUtility.getDriver().findElement(By.xpath("//a[contains(@role,'presentation')]//span[contains(@unselectable,'on')][normalize-space()='Remove']")).click();
			
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			
			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Remove']/following-sibling::span")).click();	
			
			}
		
		public void EditOrder() 
		{
			WebElement EditOrderButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_EditOrderButton")));
			doClick(EditOrderButton);
		}
		
		public void UndoOrder() 
		{
			WebElement UndoOrderButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_UndoOrderButton")));
			doClick(UndoOrderButton);
		}
		
        public void SaveOrder() 
        {
			WebElement SaveOrderButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_SaveOrderButton")));
			doClick(SaveOrderButton);
		}
        
        public void VerifyEstimationRuleSetField() throws InterruptedException 
        {
        	clickAddEstimationRuleSet();
        	clickAddEstimationRuleSetButton();
        	String ExpectedName = "This field is required";
    		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_VerifyNameField")));
    		SoftAssertfunction(ActualName, ExpectedName);
    		WebElement Cancelestimationrules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Cancelestimationrules")));
			doClick(Cancelestimationrules);	
		}
        
        public void Addestimationrulesbutton() throws InterruptedException 
        {
        	WebElement ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton")));
    		doClick(ConnexoMultisense_EstmnRulesetPage_Addestimationrulesbutton);
        }
        
        public void Removeestimationruleset() throws InterruptedException 
        {
        	WebElement DetailsTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_DetailsTab")));
    		doClick(DetailsTab);
    		waitForTime(2000);
    		WebElement actionEstimationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_actionEstimationRuleSet")));
    		TestUtil.waitforElementTobeLocated(actionEstimationRuleSet, 10);
    		doClick(actionEstimationRuleSet);
    		waitForTime(2000);
    		WebElement removeestimationRuleSetbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstmnRulesetPage_removeestimationRuleSetbutton")));
    		TestUtil.waitforElementTobeLocated(removeestimationRuleSetbutton, 10);
    		doClick(removeestimationRuleSetbutton);
    		waitForTime(2000);
    		List<WebElement> Removepopup= DriverUtility.getDriver().findElements(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']"));
    		if(Removepopup.size() > 1)
    		{
    		   DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove'])[2]")).click();
    		}else{
    			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
    		}
    		waitForTime(2000);
    		
        }				   


	}
	
	
	


