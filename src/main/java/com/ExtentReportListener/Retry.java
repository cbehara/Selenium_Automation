package com.ExtentReportListener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.util.ExtentReports.ExtentTestManager;
import com.util.util.DriverUtility;

public class Retry implements IRetryAnalyzer {
    private        int count  = 0;
    private static int maxTry = 1; //Run the failed test 2 times
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                     //Check if test not succeed
            if (count < maxTry) {                           //Check if maxTry count is reached
                count++;                                    //Increase the maxTry count by 1
                iTestResult.setStatus(ITestResult.FAILURE); //Mark test as failed and take base64Screenshot
                extendReportsFailOperations(iTestResult);   //ExtentReports fail operations
                return true;                                //Tells TestNG to re-run the test
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);     //If test passes, TestNG marks it as passed
        }
        return false;
    }
    public void extendReportsFailOperations(ITestResult iTestResult) {    	
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) DriverUtility.getDriver()).getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed",
        ExtentTestManager.getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
    }
}
