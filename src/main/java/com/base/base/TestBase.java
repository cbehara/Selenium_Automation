package com.base.base;

import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.util.ExtentReports.ExtentManager;
import com.util.logs.Log;
import com.util.util.DriverHandlers;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TestBase {		

	public static Properties prop;

	public static String strBuildVersion;

	public static String strBrowserInUse;	
	  

	Logger log = LogManager.getLogger(TestBase.class);	

	public TestBase() {
		
		PageFactory.initElements(DriverUtility.getDriver(), this);
		
		try {
			prop = new Properties();			
			
			FileInputStream loginProp = new FileInputStream(System.getProperty("user.dir")+ "\\resources\\config-properties\\config-Login.properties");

			FileInputStream objRepo = new FileInputStream(System.getProperty("user.dir")+ "\\resources\\config-properties\\config.properties");
			
			prop.load(loginProp);

			prop.load(objRepo);

		} catch (FileNotFoundException e) 
		{
			Log.error("File Not found in the path");

			log.error(e);

			e.printStackTrace();

		} catch (IOException e) 
		{
			Log.error("File Not found in the path");

			log.error(e);

			e.printStackTrace();
		}
	}	

	@Parameters(value={"strBrowserName"})
	@BeforeClass
	//@BeforeMethod
	public void initialization(String browser)
	{		
		strBuildVersion = prop.getProperty("buildversion");	
		
		DriverHandlers.initDriver(browser);

		System.out.println("Initialized Browser :" + " " + browser);

		System.out.println("driver session ID :" + " " + Thread.currentThread().getId());

		strBrowserInUse = browser;							
	}
	

	static{  
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");

		System.setProperty("current.date.time", dateFormat.format(new Date()));
	}


	//login
	public void login()  
	{
		try
		{				
			System.out.println("driver in login method :" + " " + DriverUtility.getDriver().toString());	
			
			waitForTime(1000);

			if (isDisplayed("LoginButton")) {
				
				Log.info("Entering User Name");	
				
				WebElement eleUserName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Username")));

			eleUserName.clear();

			waitForTime(500);

			eleUserName.sendKeys(prop.getProperty("username"));			

			waitForTime(1000);		

			Log.info("Entering Password");

			WebElement elePassword = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Password")));

			elePassword.clear();

			waitForTime(500);

			elePassword.sendKeys(prop.getProperty("password"));		

			Log.info("Clicking on Login button");

			WebElement eleLoginBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("LoginButton")));

				doClick(eleLoginBtn);
			}
			

			waitForTime(1000);		

			catchCFT1000Alert();

			Log.info("Clicking on Menu button");	

			waitForTime(1000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	

			waitForTime(1000);

			WebElement eleMenuBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Menu")));

			doClick(eleMenuBtn);	
		}
		catch(Exception e)
		{					
			Log.error("Error to Login");

			log.error(e);			
			
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}
	
	public void userLogin(String username, String password)  
	{
		try
		{				
			System.out.println("driver in login method :" + " " + DriverUtility.getDriver().toString());	
			
			waitForTime(1000);

			Log.info("Entering User Name");		

			WebElement eleUserName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Username")));

			eleUserName.clear();

			waitForTime(500);

			eleUserName.sendKeys(username);

			//eleUserName.sendKeys(getEncryptedUserName());

			waitForTime(1000);		

			Log.info("Entering Password");

			WebElement elePassword = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Password")));

			elePassword.clear();

			waitForTime(500);

			elePassword.sendKeys(password);		

			Log.info("Clicking on Login button");

			WebElement eleLoginBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("LoginButton")));

			doClick(eleLoginBtn);

			waitForTime(1000);		

			catchCFT1000Alert();

			Log.info("Clicking on Menu button");	

			waitForTime(1000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	

			waitForTime(1000);

			WebElement eleMenuBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Menu")));

			doClick(eleMenuBtn);	
		}
		catch(Exception e)
		{					
			Log.error("Error to Login");

			log.error(e);

			//DriverUtility.getDriver().close();
			
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}
	

	public void MenuClick()
	{
		try 
		{
			Log.info("Clicking on Menu button");

			WebElement eleMenuBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Menu")));

			TestUtil.waitforElementTobeLocated(eleMenuBtn, 10);

			doClick(eleMenuBtn);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{				
			Log.error("Failed to click on Admin button");

			log.error(e);
			
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}


	public void Admin()
	{
		try 
		{
			catchCFT1000Alert();

			Log.info("Clicking on Admin button");	

			WebElement eleAdminBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Admin")));

			TestUtil.waitforElementTobeLocated(eleAdminBtn, 30);

			doClick(eleAdminBtn);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{				
			Log.error("Failed to click on Admin button");

			log.error(e);
			
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}

	public  void Multisense()
	{
		try 
		{
			catchCFT1000Alert();

			Log.info("Clicking on multisense button");	

			WebElement eleMultisenseBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Multisense")));

			TestUtil.waitforElementTobeLocated(eleMultisenseBtn, 10);

			doClick(eleMultisenseBtn);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		} catch(Exception e)
		{			
			Log.error("Failed to click on Multisense button");

			log.error(e);
	
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}

	public  void Administration()
	{
		try 
		{
			catchCFT1000Alert();

			Log.info("Clicking on Administration button");

			WebElement eleAdministrationBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Administration")));

			TestUtil.waitforElementTobeLocated(eleAdministrationBtn, 10);

			doClick(eleAdministrationBtn);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
		}
		catch(Exception e)
		{						
			Log.error("Failed to click on Administration button");

			log.error(e);
			
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}

	public  void Workspace()
	{
		try 
		{
			catchCFT1000Alert();

			Log.info("Clicking on Workspace button");

			WebElement eleWorkspaceBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Workspace")));

			TestUtil.waitforElementTobeLocated(eleWorkspaceBtn, 10);

			doClick(eleWorkspaceBtn);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	

		}catch(Exception e)
		{					
			Log.error("Failed to click on Workspace button");

			log.error(e);
	
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}

	public  void Dashboard()
	{
		try 
		{
			catchCFT1000Alert();

			Log.info("Clicking on Dashboard button");

			WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));	

			doClick(eleDashboard);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		}
		catch(Exception e)
		{					
			Log.error("Failed to click on Dashboard button");

			log.error(e);	

			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}

	public  void Devices()
	{
		try 
		{
			catchCFT1000Alert();

			Log.info("Clicking on Devices button");

			WebElement eleDevicesBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Devices")));

			TestUtil.waitforElementTobeLocated(eleDevicesBtn, 10);

			doClick(eleDevicesBtn);

			waitForTime(2000);

			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	

		}catch(Exception e)
		{					
			Log.error("Failed to click on Devices button");

			log.error(e);	
	
			DriverHandlers.quitDriver();

			e.getStackTrace();
		}
	}


	public void waitOnPage() {
		try 
		{
			Thread.sleep(1000);
		}

		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

	//Wait for specific time
	public void waitForTime(int millis) 
	{		
		try 
		{		

			Thread.sleep(millis);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}	

	//Enter text to a field
	protected void sendkeys(String value, WebElement elementname)
	{	
		try 
		{
			highlightelement(elementname);

			elementname.sendKeys(value);

			Log.info("Entered value : " + value + " in the element : " + elementname);
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{						
			Log.error("Failed to enter value : " + value + " in the element : " + elementname);

			log.error(e);	
			
			DriverHandlers.quitDriver();

			e.getStackTrace();			
		}
	}

	//Hard Assert. Execution stops if test fails
	protected void HardAssertfunction(WebElement element, String expectedvalue)
	{
		try 
		{
			String actualvalue = element.getText();

			AssertJUnit.assertEquals(expectedvalue, actualvalue); 

			log.info("Expected Value : " + expectedvalue + " matches with " + "Actual Value : " +actualvalue);
		}
		catch(Exception e)
		{						
			log.error("Expected Value : " + expectedvalue + " did NOT match with " + "Actual Value");	

			log.error(e);	

			DriverUtility.getDriver().close();

			e.getStackTrace();			
		}		 
	}

	//Take screenshot and copy it to the specified path. Used in test steps
	public void screenShot(WebElement element, String Testcasename) throws IOException, InterruptedException {
		try {
			File scr = ((TakesScreenshot)DriverUtility.getDriver()).getScreenshotAs(OutputType.FILE);

			String filenameHrs =  new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

			String filename = Testcasename + "-" +  filenameHrs ;

			String currentDir = System.getProperty("user.dir");

			FileUtils.copyFile(scr, new File(currentDir + "//screenshots//" + filename + ".png"));

			log.info("Taken screenshot : " +filename + " and copied to the path : " + currentDir + "//screenshots//" + filename + ".png");
		}
		catch(Exception e)
		{
			log.error("Failed to Take screenshot" + e);	    

			e.getStackTrace();			
		}
	}	

	//Take screenshots only when test passes or fails and save it to the specified path. Used for Extent reports.
	public static synchronized String takeScreenshot(String methodName) 
	{			
		DateFormat dateFormat = new SimpleDateFormat("MMM_dd_yyyy_HH_mm_ss_SSS");

		Date date = new Date();
		String dateName = dateFormat.format(date);

		String filePathExtent = ExtentManager.OUTPUT_FOLDER_SCREENSHOTS + methodName + "_" + dateName + ".png";	

		String encodedBase64=null;

		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		try {
			File screenshotFile = ((TakesScreenshot)DriverUtility.getDriver()).getScreenshotAs(OutputType.FILE);

			FileInputStream fileInputStreamReader ;

			fileInputStreamReader = new FileInputStream(screenshotFile);

			byte[] bytes = new byte[(int) screenshotFile.length()];

			fileInputStreamReader.read(bytes);

			encodedBase64 = Base64.getEncoder().encodeToString(bytes);

			FileUtils.copyFile(screenshotFile, new File(filePathExtent));

			fileInputStreamReader.close();     
			
		}catch (Exception e)
		{
			e.getStackTrace();

			Reporter.log("Failed To Take screenshot " + e, true);            
		}        
		return encodedBase64;
	}

	//Soft Assert. Execution continues even if test fails
	protected void SoftAssertfunction(WebElement element, String expectedvalue)
	{
		try {
			String actualvalue = element.getText();						

			AssertJUnit.assertEquals(expectedvalue, actualvalue);

			log.info("Expected Value : " + expectedvalue + " matches with " + "Actual Value : " +actualvalue);
		}
		catch(Exception e)
		{					
			log.error("Expected Value : " + expectedvalue + " Does Not match with " + "Actual Value");

			log.error(e);		

			e.getStackTrace();			
		}
	}

	//Assert to verify if page title is matching. Execution continues even if test fails
	protected void TitleAssertFunction(WebElement element, String expectedvalue)
	{
		try {
			String actualvalue = element.getText();		

			AssertJUnit.assertEquals(expectedvalue, actualvalue);

			log.info("Expected Value : " + expectedvalue + " matches with " + "Actual Value : " +actualvalue);
		}
		catch(Exception e)
		{			
			log.error("Expected Value : " + expectedvalue + " Does Not match with " + "Actual Value");

			log.error(e);
			
			DriverHandlers.quitDriver();

			e.getStackTrace();			
		}
	}

	//Method to click on an web element
	protected void doClick(WebElement element)
	{
		String elementName = element.getText();

		highlightelement(element);

		log.info("clicking on the element " + elementName);		

		try {			
			waitForTime(500);

			element.click();

			waitForTime(1000);			
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{					
			log.error("Failed to click on the element : " + elementName);

			log.error(e);		

			e.getStackTrace();			
		}
	}	

	//Method to clear an edit field before entering a value
	protected void doClear(WebElement element)
	{
		try {
			highlightelement(element);

			element.clear();

			log.info(element + " editbox cleared ");
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{
			log.error("Failed to clear editbox : " + element);

			log.error(e);		

			e.getStackTrace();			
		}
	}

	//Method to get text of a web element
	protected String getText(WebElement element)
	{		
		try {

			highlightelement(element);			
		}
		catch(Exception e)
		{
			log.error("Error getting text from the element : " + element.getText());

			log.error(e);		

			DriverUtility.getDriver().close();

			e.getStackTrace();
		}
		return element.getText();
	}

	//Method to click on a webelement using javascript executor
	protected void doClickjavaScript(WebElement element)
	{
		waitForTime(3000);

		log.info("Clicking on element : " + element.getText());

		JavascriptExecutor js = (JavascriptExecutor)DriverUtility.getDriver();

		js.executeScript("arguments[0].scrollIntoView();", element);

		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow')", element);	

		try {
			element.click();

			waitForTime(500);			
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{
			log.error("Could not click element : " + element.getText());

			log.error(e);	

			e.getStackTrace();
		}
	}

	//Method to select a radio button
	protected void selectRadioButton(WebElement element)
	{
		String elementName = element.getText();

		highlightelement(element);

		log.info("selecting radio button " + elementName);	

		try 
		{
			if (!element.isSelected())
			{
				waitForTime(500);

				element.click();

				waitForTime(500);		
			}
			else
			{					
				log.info("Radio button " + elementName + "is already selected");
			}
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{					
			log.error("Failed to select on the element : " + elementName);

			log.error(e);						

			e.getStackTrace();			
		}
	}

	//Method to select a Check box
	protected void selectCheckBox(WebElement element)
	{
		String elementName = element.getText();

		highlightelement(element);

		log.info("Checking a checkbox " + elementName);		

		try 
		{
			if (!element.isSelected())
			{
				waitForTime(500);

				element.click();

				waitForTime(500);		
			}
			else
			{					
				log.info("Check box " + elementName + "is already selected");
			}
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{					
			log.error("Failed to select on the element : " + elementName);

			log.error(e);		

			DriverUtility.getDriver().close();

			e.getStackTrace();			
		}
	}

	//Generic method to select Combo box elements
	protected void selectComboBoxItems(String strComboBox, String strItemList, String itemsToSelect)
	{		
		String[] expListItems = itemsToSelect.split(", ");

		WebElement eleComboBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(strComboBox)));

		eleComboBox.sendKeys(Keys.ARROW_DOWN);

		List<WebElement> listComboBoxElements = DriverUtility.getDriver().findElements(By.xpath(prop.getProperty(strItemList)));

		for(WebElement element : listComboBoxElements)
		{
			String currentListItem = element.getText();

			for (int i = 0; i < expListItems.length; i++)
			{			
				if(currentListItem.equals(expListItems[i].trim()))
				{
					element.click();

					waitForTime(500);

					log.info("Selected Combo item : " + currentListItem);								

					break;
				}				
			}
		}
		waitForTime(500);

		eleComboBox.sendKeys(Keys.ESCAPE);
	}	
	
	public static void browserRefresh() {
		DriverUtility.getDriver().navigate().refresh();
	}
	
	public static void navigateBackToPreviousPage() {
		DriverUtility.getDriver().navigate().back();
	}


	//Perform screen scroll down
	protected void scrolldown(WebElement element)
	{
		String elementName = element.getText();

		try {
			waitForTime(3000);

			log.info("Clicking on element : " + elementName);

			JavascriptExecutor js = (JavascriptExecutor)DriverUtility.getDriver();

			js.executeScript("arguments[0].scrollIntoView();", element);

			element.click();
		}
		catch(NoSuchElementException | StaleElementReferenceException e)
		{
			log.error("Could Not Click on the element : " + elementName);

			log.error(e);	

			DriverUtility.getDriver().close();

			e.getStackTrace();
		}
	}

	//Perform screen scroll down to the bottom of the page
	protected void scrolltobottom()
	{
		waitForTime(2000);

		JavascriptExecutor jsExecute = (JavascriptExecutor)DriverUtility.getDriver();

		jsExecute.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	//Highlight the web element on which action is being performed
	public void highlightelement(WebElement element) 
	{
		JavascriptExecutor jsExecute = (JavascriptExecutor)DriverUtility.getDriver();	

		jsExecute.executeScript("arguments[0].style.border='2px solid red'", element);
	}

	//Generic method to generate a random alpha numeric name 
	public String generateRandomName(int len) 
	{
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk" +"lmnopqrstuvwxyz";

		Random rnd = new Random();

		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++)

			sb.append(chars.charAt(rnd.nextInt(chars.length())));

		return sb.toString();
	}

	//Generic method to generate a random number
	public String generateRandomNumber(int len) 
	{
		String chars = "0123456789";

		Random rnd = new Random();

		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++)

			sb.append(chars.charAt(rnd.nextInt(chars.length())));

		return sb.toString();
	}

	//Generic method to press Enter key
	public void sendEnterKey() 
	{
		try 
		{
			waitForTime(2000);

			Actions action = new Actions(DriverUtility.getDriver());	
			
			action.sendKeys(Keys.ENTER).build().perform();
			
			waitForTime(1000);	

		} catch (Exception e) 
		{			
			e.printStackTrace();
		}
	}
	
	//Generic method to press Enter key
		public void sendKeyMyCheck(WebElement element) 
		{
			try 
			{
				waitForTime(2000);

				Actions action = new Actions(DriverUtility.getDriver());	
//				
//				action.sendKeys(element, Keys.RETURN).build().perform();
				
//				action.clickAndHold(element).build().perform();
			     
				action.release().build().perform();
				
				action.moveToElement(element).click().perform();
				
				waitForTime(1000);	

			} catch (Exception e) 
			{			
				e.printStackTrace();
			}
		}

	//verify of element is displayed
	public Boolean isDisplayed(String strElement)
	{
		WebDriverWait wait;

		wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(2));

		try 
		{
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty(strElement))));

			return element.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}	

	//verify of element is Enabled
	public Boolean isEnabled(String strElement)
	{		
		try 
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("strElement")));

			if(element.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}	

	//verify of element is Enabled
	public Boolean isDisabled(String strElement)
	{		
		try 
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("strElement")));

			String strAttributeValue = element.getAttribute("");

			if (strAttributeValue.contains("disabled"))
			{
				return true;
			}	
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}	

	//Generic method to switch to a child window
	@SuppressWarnings("unused")
	private void switchToChildWindow()
	{
		String defaultWindow = DriverUtility.getDriver().getWindowHandle();

		System.out.println("Default window name is- " +defaultWindow);

		waitForTime(3000);

		Set<String> childWindows = DriverUtility.getDriver().getWindowHandles();

		for(String child : childWindows)
		{
			if(!child.equalsIgnoreCase(defaultWindow))
			{
				DriverUtility.getDriver().switchTo().window(child);
				
				log.info("Child windows : " + child);
			} else 
			{
				System.out.println("There are no child windows");
			}
		}		
	}


	//verify of element is Selected
	public Boolean isSelected(String strElement)
	{		
		try 
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("strElement")));

			return element.isSelected();
		}
		catch(Exception e)
		{
			return false;
		}
	}	

	//Handle CFT1000 error pop up by closing it
	public void catchCFT1000Alert()
	{
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(2));

		if(isDisplayed("testBase_EleCFT1000ErrorCloseBtn")) 
		{
			try {
				WebElement eleCFT1000CloseBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("testBase_EleCFT1000ErrorCloseBtn"))));

				log.info(" Closing CFT 1000 error pop up window ");

				doClick(eleCFT1000CloseBtn);

				Log.fatal(" Closed CFT 1000 error pop up window. Testcase failed ");				

				Assert.fail("Testcase failed due to CFT 1000 error pop up");
			}
			catch(Exception e)
			{
				log.info(" Could Not close CFT 1000 error pop up window ");

				e.printStackTrace();
			}
		}		
	}

	//Generic method to fetch the encrypted user name
	public static String getEncryptedUserName()
	{
		String strDecryptedUserName, strEncryptedUserName;

		String strUserName = prop.getProperty("username");

		strEncryptedUserName = Base64.getEncoder().encodeToString(strUserName.getBytes());

		byte[] strDecryptedUserNameBytes = Base64.getDecoder().decode(strEncryptedUserName);

		strDecryptedUserName = new String(strDecryptedUserNameBytes);

		return strDecryptedUserName;
	}


	//Generic method to logout
	public void logout() {
		try 
		{
			WebElement eleLogoutIcon = DriverUtility.getDriver().findElement(By.xpath("//a[@class=\"x-btn user-menu x-unselectable x-box-item x-btn-default-medium x-icon x-btn-icon x-btn-default-medium-icon\"]"));

			highlightelement(eleLogoutIcon);

			doClick(eleLogoutIcon);			

			waitForTime(500);			

			WebElement eleLogoutBtn = DriverUtility.getDriver().findElement(By.xpath("//span[text()='Logout']//parent::a"));

			TestUtil.waitforElementTobeLocated(eleLogoutBtn, 10);

			doClick(eleLogoutBtn);			
		}		
		catch(NoSuchElementException | StaleElementReferenceException e)
		{
			log.error("Error Logging out" + e.getStackTrace());

			log.error(e);

			if(Objects.nonNull(DriverUtility.getDriver()))
			{				
				DriverUtility.getDriver().quit();
			}
			e.getStackTrace();
		}	
	}
	
	@AfterClass
	//@AfterMethod
	/*
	 * public void tearDown() { logout();
	 * 
	 * DriverHandlers.quitDriver(); }
	 * 
	 * }
	 */


public void tearDown()
{
    try
    {
    	logout();
    }
    catch(Exception e)
	{
		//log.info(" Could Not logout ");
    	DriverHandlers.quitDriver();
		//e.printStackTrace();
	}
}		
}

