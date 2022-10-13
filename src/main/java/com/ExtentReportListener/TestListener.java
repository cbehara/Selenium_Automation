package com.ExtentReportListener;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.base.base.TestBase;
import com.util.ExtentReports.ExtentTestManager;
import com.util.logs.Log;
import com.util.util.DriverUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {	
    private static void setStartTime(long startTime) {
    }
    private static void setEndTime(long endTime) {
    }

    @Override
    public synchronized void onStart(ITestContext context) {
    	Log.info("OnStart method " + context.getName());    	
    	context.setAttribute("WebDriver", DriverUtility.getDriver());
    }
    
    @Override
    public synchronized void onFinish(ITestContext context) {
        setStartTime(context.getStartDate().getTime());
        setEndTime(context.getEndDate().getTime());
        Log.info("OnFinish method " + context.getName());
    }
    @Override
    public synchronized void onTestStart(ITestResult result) {
        System.out.println("--------- Executing :- " + getSimpleMethodName(result) + " ---------");
        Log.info("Executng : " + getSimpleMethodName(result));
        ExtentTestManager.createTest(result.getName(),result.getMethod().getDescription());
        ExtentTestManager.setCategoryName(getSimpleClassName(result));        
    }
        @Override
    public synchronized void onTestSuccess(ITestResult result) {
        Log.info("Test case: " + getSimpleMethodName(result) + " PASSED");
        ExtentTestManager.getTest().assignCategory(getSimpleClassName(result));
        ExtentTestManager.getTest().log(Status.PASS, result.getName() + " Test is passed ");
        try {
            ExtentTestManager.getTest().pass("<br><font color= red>"+"Screenshot of " + getSimpleMethodName(result) +"</font></b>",
            		MediaEntityBuilder.createScreenCaptureFromBase64String(TestBase.takeScreenshot(getSimpleMethodName(result))).build());            		
        	 		
        } catch (Exception e) {
            e.printStackTrace();
        }
        addExtentLabelToTest(result);
        ExtentTestManager.endTest();
    }                 
    @Override
    public synchronized void onTestFailure(ITestResult result) {
    	Log.info("Test case: " + getSimpleMethodName(result) + " FAILED");
        ExtentTestManager.getTest().assignCategory(getSimpleClassName(result));
        ExtentTestManager.getTest().log(Status.FAIL, result.getName() + " Test is failed" +result.getThrowable());
        try {
            ExtentTestManager.getTest().fail("<br><font color= red>"+"Screenshot of " + getSimpleMethodName(result) + "</font></b>",
            		MediaEntityBuilder.createScreenCaptureFromBase64String(TestBase.takeScreenshot(getSimpleMethodName(result))).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        addExtentLabelToTest(result);
        ExtentTestManager.endTest();
    }              		
    @Override
    public synchronized void onTestSkipped(ITestResult result) {
    	Log.info("Test case: " + getSimpleMethodName(result) + " SKIPPED");
    	ExtentTestManager.getTest().assignCategory(getSimpleClassName(result));
        ExtentTestManager.getTest().log(Status.SKIP, result.getName() + " Test is Skipped" +  result.getThrowable());       
        try {
            ExtentTestManager.getTest().skip("<br><font color= orange>"+"Screenshot of " + getSimpleMethodName(result) + "</font></b>",
            		MediaEntityBuilder.createScreenCaptureFromBase64String(TestBase.takeScreenshot(getSimpleMethodName(result))).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        addExtentLabelToTest(result);
        ExtentTestManager.endTest();    
    }
    @Override
    public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	Log.info("Test case: " + getSimpleMethodName(result) + " FAILED but is in defined success ratio");
    }
    private synchronized String getSimpleClassName(ITestResult result) {
        return result.getMethod().getRealClass().getSimpleName();
    }
    private synchronized String getSimpleMethodName(ITestResult result) {
        return result.getName();
    }
    private synchronized void addExtentLabelToTest(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS)
            ExtentTestManager.getTest().pass(MarkupHelper.createLabel("Test Passed", ExtentColor.GREEN));
        else if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.getTest().fail(MarkupHelper.createLabel("Test Failed", ExtentColor.RED));
        } else
            ExtentTestManager.getTest().skip(MarkupHelper.createLabel("Test Skipped", ExtentColor.ORANGE));
    }

}