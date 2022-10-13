package com.util.util;

import org.openqa.selenium.WebDriver;

public final class DriverUtility {
	
	private DriverUtility() {
		
	}
	
	
	protected static ThreadLocal<WebDriver> threadLclDriver = new ThreadLocal<>();  
	
	
	public static WebDriver getDriver() {
		return threadLclDriver.get();
	}
	
	public static void setWebDriver(WebDriver webDriver) {
		threadLclDriver.set(webDriver);
	}	
	
	public static void unload()
	{
		threadLclDriver.remove();
	}

}
