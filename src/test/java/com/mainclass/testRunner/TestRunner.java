package com.mainclass.testRunner;

import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRunner 
{	
	@Parameters("strBrowserName")
	@Test
	public static void main(String[] args)
	{			
		String xmplFilePath = System.getProperty("user.dir") + "\\resources\\testng.xml";	
		
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testNg = new TestNG();
		List<String> suites =new ArrayList<String>();				
		suites.add(xmplFilePath);
		testNg.setTestSuites(suites);
		testNg.addListener((ITestNGListener)tla);
		testNg.alwaysRunListeners(true);		
		testNg.run();		
	}	
}
