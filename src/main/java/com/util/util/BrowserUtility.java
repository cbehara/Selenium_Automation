package com.util.util;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.base.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtility {	
	
	public static WebDriver createDriverInstance(String browserType) {	
		
		WebDriver wbDriver = null;	
		
		if(browserType.equalsIgnoreCase("chrome")) {

			String setHeadlessMode = TestBase.prop.getProperty("setHeadless");
			
			//105.0.5195.127

			WebDriverManager.chromedriver().browserVersion("105.0.5195.127").setup();
			
			/*
			Comment the above line and uncomment the below line for using custom chrome driver path 
			when Internet connectivity is not available in the system. Ensure you have the proper matching 
			chrome driver and the path is set properly to the driver in the config-Login.properties file.			
			*/
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + TestBase.prop.getProperty("chromeDriverPath"));

			System.setProperty("java.net.preferIPv4Stack", "true");

			ChromeOptions options = new ChromeOptions();

			if (setHeadlessMode.equalsIgnoreCase("false")) 
			{			
				options.addArguments("--start-maximized");	
				
				options.addArguments("--no-sandbox");	
				
				options.addArguments("--disable-plugins", "--disable-extensions");

				options.setHeadless(false);			
			}
			else
			{
				options.addArguments("window-size=1400,800");

				options.setHeadless(true);

				options.addArguments("disable-gpu");
			}

			options.setAcceptInsecureCerts(true);	

			DesiredCapabilities capability=new DesiredCapabilities();
			
			capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

			capability.setCapability(ChromeOptions.CAPABILITY, options);		


			options.merge(capability);

			wbDriver = new ChromeDriver(options);

		}else if(browserType.equalsIgnoreCase("firefox")) {

			String strFirefoxDriverPath = TestBase.prop.getProperty("fireFoxBrowserPath");

			System.setProperty("webdriver.firefox.bin", strFirefoxDriverPath);

			String setHeadlessMode = TestBase.prop.getProperty("setHeadless");

			WebDriverManager.firefoxdriver().setup();
			
			/*
			Comment the above line and uncomment the below line for using custom firefox driver path 
			when Internet connectivity is not available in the system. Ensure you have the proper matching 
			firefox driver and the path is set properly to the driver in the config-Login.properties file.			
			*/
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + TestBase.prop.getProperty("geckoDriverPath"));

			System.setProperty("java.net.preferIPv4Stack", "true");

			FirefoxOptions ffOptions = new FirefoxOptions();
			
			if (setHeadlessMode.equalsIgnoreCase("true")) 
			{
				ffOptions.setHeadless(true);			
			}
			ffOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

			ffOptions.addPreference("browser.helperApps.neverAsk.saveToDisk","application/pem");

			DesiredCapabilities capability = new DesiredCapabilities();

			capability.setCapability("gecko.driver", false);	
			
			capability.setCapability("marionette", true);

			capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ffOptions);		

			ffOptions.merge(capability);			

			wbDriver = new FirefoxDriver(ffOptions);		

		}else if(browserType.equalsIgnoreCase("edge")) {			

			String setHeadlessMode = TestBase.prop.getProperty("setHeadless");

			WebDriverManager.edgedriver().setup();
			
			/*
			Comment the above line and uncomment the below line for using custom edge driver path 
			when Internet connectivity is not available in the system. Ensure you have the proper matching 
			edge driver and the path is set properly to the driver in the config-Login.properties file.			
			*/
			//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + TestBase.prop.getProperty("edgeDriverPath"));

			System.setProperty("java.net.preferIPv4Stack", "true");

			EdgeOptions options = new EdgeOptions();

			if (setHeadlessMode.equalsIgnoreCase("false")) 
			{
				options.addArguments("--start-maximized");	
				
				options.addArguments("--no-sandbox");	
				
				options.addArguments("--disable-plugins", "--disable-extensions");
			}
			else
			{			
				options.addArguments("window-size=1400,800");
				
				options.addArguments("--no-sandbox");
				
				options.addArguments("--disable-plugins", "--disable-extensions");

				options.addArguments("headless");

				options.addArguments("disable-gpu");
			}

			options.setAcceptInsecureCerts(true);	
		
			DesiredCapabilities capability=new DesiredCapabilities();

			capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

			capability.setCapability(ChromeOptions.CAPABILITY, options);	

			options.merge(capability);			

			wbDriver = new EdgeDriver(options);

		}		

		wbDriver.manage().deleteAllCookies();

		return wbDriver;

	}

}
