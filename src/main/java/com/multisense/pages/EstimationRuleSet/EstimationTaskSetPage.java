package com.multisense.pages.EstimationRuleSet;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class EstimationTaskSetPage extends TestBase {

	String Name = generateRandomName(9);
	//private static final String UpdateLogLevel = null;
	    
    public EstimationTaskSetPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Administration();

	}
	
	public void sendText(String value)
	{
		WebElement ConnexoMultisense_EstimnTskSetPage_estimationName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_estimationName")));
		sendkeys(value, ConnexoMultisense_EstimnTskSetPage_estimationName);
	}
	public void clickOnEditestimatetask(String Loglevel, String Devicegroup, String UpdateLoglevel) throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.linkText(Name)).click();
		Thread.sleep(5000);
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Actions']")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//div[contains(@class,'x-component x-box-item')]//a)[5]")).click();
		Thread.sleep(5000);
		createestimatetask(UpdateLoglevel,Devicegroup);
		//DriverUtility.getDriver().findElement(By.xpath("//span[text()='Save']/following-sibling::span")).click();
	}
	
	
	public void createestimatetask (String Loglevel, String Devicegroup) throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement ConnexoMultisense_EstimnTskSetPage_estimationName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_estimationName")));
		doClear(ConnexoMultisense_EstimnTskSetPage_estimationName);
		sendkeys(Name, ConnexoMultisense_EstimnTskSetPage_estimationName);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_EstimnTskSetPage_logLevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_logLevelDropDown")));
		doClick(ConnexoMultisense_EstimnTskSetPage_logLevelDropDown);
		Thread.sleep(5000);
		
		WebElement Loglevels= DriverUtility.getDriver().findElement(By.xpath("//ul[@class='x-list-plain']"));
		List<WebElement> LoglevelsList=Loglevels.findElements(By.tagName("li"));
		for (WebElement li : LoglevelsList) {
		if (li.getText().equals(Loglevel)) {
		     li.click();
		   }
		}
		Thread.sleep(5000);
		WebElement ConnexoMultisense_EstimnTskSetPage_deviceGroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_deviceGroupDropDown")));
		doClick(ConnexoMultisense_EstimnTskSetPage_deviceGroupDropDown);
		Thread.sleep(5000);
		
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options){  
		     if(element.getText().equals(Devicegroup)){  

		        element.click();
		    }
		    }
		
		
		
		WebElement ConnexoMultisense_EstimnTskSetPage_saveestimatetaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_saveestimatetaskbutton")));
		doClick(ConnexoMultisense_EstimnTskSetPage_saveestimatetaskbutton);
	}
	
	public void clickestimatetask()
	{
		WebElement ConnexoMultisense_EstimnTskSetPage_EstimateTask= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_EstimateTask")));
		doClick(ConnexoMultisense_EstimnTskSetPage_EstimateTask);
		
	}
	public void clickAddEstimatetask()
	{
		WebElement ConnexoMultisense_EstimnTskSetPage_AddEstimateTask = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_AddEstimateTask")));	
			if (ConnexoMultisense_EstimnTskSetPage_AddEstimateTask.isDisplayed()){
				TestUtil.waitforElementTobeLocated(ConnexoMultisense_EstimnTskSetPage_AddEstimateTask, 30);
				doClick(ConnexoMultisense_EstimnTskSetPage_AddEstimateTask);
				waitForTime(500);
			}
			else
			{
				WebElement ConnexoMultisense_EstimnTskSetPage_AddEstimateTask1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_AddEstimateTask1")));
				TestUtil.waitforElementTobeLocated(ConnexoMultisense_EstimnTskSetPage_AddEstimateTask1, 30);
				doClick(ConnexoMultisense_EstimnTskSetPage_AddEstimateTask1);
				waitForTime(500);
			}
		}

	
	
	public void clickSavevalidationtask()
	{
		WebElement ConnexoMultisense_EstimnTskSetPage_saveestimatetaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_saveestimatetaskbutton")));
		doClick(ConnexoMultisense_EstimnTskSetPage_saveestimatetaskbutton);
	}
	
	
	public void clickRemovevalidationtask() throws InterruptedException
	{
		
		DriverUtility.getDriver().findElement(By.xpath("//span[text()='Actions']")).click();
		Thread.sleep(5000);
		WebElement ConnexoMultisense_EstimnTskSetPage_removevalidationtaskbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_EstimnTskSetPage_removevalidationtaskbutton")));
		doClick(ConnexoMultisense_EstimnTskSetPage_removevalidationtaskbutton);
		try {
			   
			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Remove']/following-sibling::span")).click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			DriverUtility.getDriver().findElement(By.xpath("//span[text()='Remove']/following-sibling::span")).click();
		}
		
	}
	
	
	
	
	

	
}
