package com.ConnexoAdmin.pages.CustomAttributesPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class CustomAttributesPage extends TestBase {
	
	//WebElement ConnexoAdmin_CustomAttributesPage_ApplyButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CustomAttributesPage_ApplyButton")));
	
	public  CustomAttributesPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}				
	
	public void clickcustomattributesets() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConnexoAdmin_CustomAttributesPage_customattributesets = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CustomAttributesPage_customattributesets")));
		doClick(ConnexoAdmin_CustomAttributesPage_customattributesets);
		} catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	public void clickcustomattributesetdropdown(String CustomAttribute) throws InterruptedException
		{
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			WebElement ConnexoAdmin_CustomAttributesPage_customattributeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CustomAttributesPage_customattributeDropDown")));
			doClick(ConnexoAdmin_CustomAttributesPage_customattributeDropDown);
			waitForTime(1000);
        try {
        		DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+CustomAttribute +"')]")).click();
        	}
        catch (Exception e)
        	{
                DriverUtility.getDriver().findElement(By.xpath("//li[contains(text(),'"+CustomAttribute +"')]")).click();
        	}
        waitForTime(1000);		
		}
	}

	
