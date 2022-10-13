package com.util.util;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.base.base.TestBase;

public final class DriverHandlers {	
	
	private DriverHandlers()
	{
		
	}		
	
	public static void initDriver(String browserType)
	{
		if(Objects.isNull(DriverUtility.getDriver()))		
		{	
			WebDriver drvr = BrowserUtility.createDriverInstance(browserType);
			
			DriverUtility.setWebDriver(drvr);				
			
			DriverUtility.getDriver().get(TestBase.prop.getProperty("mainUrl"));		
		}		
	}
	
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverUtility.getDriver()))
		{			
			System.out.println("quit driver : " + DriverUtility.getDriver().toString());
			
			DriverUtility.getDriver().quit();
			
			DriverUtility.unload();			
		}
	}

}
