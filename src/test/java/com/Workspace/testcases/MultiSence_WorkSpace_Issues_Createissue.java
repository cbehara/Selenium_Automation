package com.Workspace.testcases;


import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.AlarmsSelectionPage;
import com.Workspace.pages.CommunicationWorkspacePage;
import com.Workspace.pages.IssuesSelectionPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MultiSence_WorkSpace_Issues_Createissue extends TestBase {
              
              Logger log = LogManager.getLogger(MultiSence_WorkSpace_Issues_Createissue.class);              
              String IssueCreatesheet = "Workspace_IssueCreate";  
              IssuesSelectionPage issuesSelectionPage= new IssuesSelectionPage();
              String ClearALLFilter;      
              @Test(priority=0)
             public void TC001_NavigateToAlarmsPage() throws IOException, InterruptedException 
              {             
                             login();
                             Multisense();
                             Workspace();
                             issuesSelectionPage.navigateToWorkSpace_Issues_Createissue();
                             issuesSelectionPage.createIssue_Manual();
               }        
}
