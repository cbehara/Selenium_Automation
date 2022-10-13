package com.util.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.base.base.TestBase;
import com.util.util.DriverUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ExtentManager {

   private static Date dt = new Date();
   private static String dateTime = dt.toString().replaceAll(":", "-");
   private static String reportBaseDirectory;
   private static ExtentReports extent;
   public static final String EXTENTREPORT_FILE_PATH = System.getProperty("user.dir")+ File.separator + "Extent-Reports" + File.separator;
   public static final String REPORT_FILE_PATH = EXTENTREPORT_FILE_PATH + File.separator + "Extent-Reports" + " - " + dateTime + File.separator;
   public static final String OUTPUT_FOLDER_SCREENSHOTS = REPORT_FILE_PATH + File.separator + "Screenshots" + File.separator;  
  
   
   public static ExtentReports getInstance() 
   {
       if (extent == null)
           createInstance();
       return extent;
   }
   
   //Create an extent report instance
   public static void createInstance() 
   {
       ExtentManager.initDirectories();
       setReportBaseDirectory(REPORT_FILE_PATH);       
       ExtentSparkReporter reporter = new ExtentSparkReporter(REPORT_FILE_PATH+"Connexo-SmokeTestReport.html");              
       reporter.config().setTheme(Theme.STANDARD);
       reporter.config().setEncoding("utf-8");
       reporter.config().setReportName("Connexo Smoke Test Results");       
       reporter.config().setJs("$('.brand-logo').text('Connexo');");
       reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");       
       extent = new ExtentReports();
       extent.attachReporter(reporter);       
       extent.setSystemInfo("OS",  System.getProperty("os.name"));
       extent.setSystemInfo("Browser", TestBase.prop.getProperty("TestBase.strBrowserInUse")); 
       extent.setSystemInfo("Connexo Build Version", TestBase.prop.getProperty("buildversion"));
       extent.setSystemInfo("Java",  System.getProperty("java.specification.version"));
       extent.setSystemInfo("User",  System.getProperty("user.name"));
   }

   public synchronized static String getReportBaseDirectory() {
       return reportBaseDirectory;
   }
   
   public synchronized static void setReportBaseDirectory(String reportBaseDirectory) {
       ExtentManager.reportBaseDirectory = reportBaseDirectory;
   }

   public static void initDirectories() {
       try {
          createFolder(REPORT_FILE_PATH + OUTPUT_FOLDER_SCREENSHOTS);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   public static void createFolder(String folderPath) {
       File file = new File(folderPath);
       if (!file.exists()) file.mkdirs();
   }
         
   public static void takeScreenshot( String filename) throws IOException 
	{
	   File file = ((TakesScreenshot) DriverUtility.getDriver()).getScreenshotAs(OutputType.FILE); 
	   FileUtils.copyFile(file, new File(OUTPUT_FOLDER_SCREENSHOTS + filename + ".png")); 		
	}   
}