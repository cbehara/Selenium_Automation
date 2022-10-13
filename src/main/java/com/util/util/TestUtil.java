package com.util.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static String ConnexoMultisense_TestData_Sheet_Path = System.getProperty("user.dir") + "\\resources\\testdata\\MultiSenseTestData.xlsx";
	public static String ConnexoAdmin_TestData_Sheet_Path = System.getProperty("user.dir") + "\\resources\\testdata\\ConnexoAdminTestData.xlsx";
	public static String Workspace_TestData_Sheet_Path = System.getProperty("user.dir") + "\\resources\\testdata\\WorkspaceTestData.xlsx";
	public static String DeviceAndSearch_TestData_Sheet_Path = System.getProperty("user.dir") + "\\resources\\testdata\\DevicesAndSearchTestData.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;
	
	Logger log = LogManager.getLogger(TestUtil.class);

	
	public void switchToFrame() {
		DriverUtility.getDriver().switchTo().frame("mainpanel");
	}
	public static void alerttoAccept() 
	{			
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.alertIsPresent())==null)	
		{
				
		}
		else
		{			
			DriverUtility.getDriver().switchTo().alert().accept();
		}
	}		
		
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(ConnexoMultisense_TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);			
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	public static Object[][] getTestDataFromConnexoAdmin(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(ConnexoAdmin_TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);			
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	public static Object[][] getTestDataFromWorkspace(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(Workspace_TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);			
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	public static Object[][] getTestDataDeviceAndSearch(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(DeviceAndSearch_TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);			
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	public  static WebElement waitforElementTobeLocated(WebElement locator,int timeout)
	{		
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(),Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));		
	}
		
	public static void takeScreenshotAtEndOfTest() throws IOException 
	{		
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        dFormat.format(date);
        TakesScreenshot ts = (TakesScreenshot) DriverUtility.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String path = "." + File.separator + "Screenshots" + File.separator + dFormat.format(date) + ".png";
        File destination = new File(path);
        try {
            FileUtils.copyFile(source, destination);
        } catch (Exception e) {
            e.printStackTrace();
        }        
	}

	public static void runTimeInfo(String messageType, String message) throws InterruptedException {
		
		js = (JavascriptExecutor) DriverUtility.getDriver();
		// Check for jQuery on the page, add it if need be
		js.executeScript("if (!window.jQuery) {"
				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
		Thread.sleep(5000);

		// Use jQuery to add jquery-growl to the page
		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

		// Use jQuery to add jquery-growl styles to the page
		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
		Thread.sleep(5000);

		// jquery-growl w/ no frills
		js.executeScript("$.growl({ title: 'GET', message: '/' });");
//'"+color+"'"
		if (messageType.equals("error")) {
			js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
		}else if(messageType.equals("info")){
			js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
		}else if(messageType.equals("warning")){
			js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
		}else
			System.out.println("no error message");
		// jquery-growl w/ colorized output
//		js.executeScript("$.growl.error({ title: 'ERROR', message: 'your error message goes here' });");
//		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
//		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
		Thread.sleep(5000);
	}
	public static Object[] getTestDataDeviceAndSearchBasedOnColName(String sheetName,String ColumnName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(DeviceAndSearch_TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);			
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		String ColName;
		int ColumnNo=1;
		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
			ColName = sheet.getRow(0).getCell(k).toString();
			if(ColName.equalsIgnoreCase(ColumnName))
			{
				ColumnNo = k;
				break;
			}
		}
		
		Object[] data = new Object[sheet.getLastRowNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		String szVal;
		int nCapacity=0;
		for (int i = 0; i < sheet.getLastRowNum(); i++) {	
			
			if (!(sheet.getRow(i + 1) == null)&&(!(sheet.getRow(i + 1).getCell(ColumnNo) == null)))
			{
				if (!(sheet.getRow(i + 1).getCell(ColumnNo).toString() == ""))
				{
				data[i] = sheet.getRow(i + 1).getCell(ColumnNo).toString();		
				nCapacity = nCapacity +1;
				}
			}
		}
		data = resize(data,nCapacity);
		return data;
	}
	 private static Object[] resize(Object[] data,int capacity) {
		 Object[] copy = new String[capacity];
	        for (int i = 0; i < capacity; i++) {
	            copy[i] = data[i];	            
	        }
	        return copy;
	    }
	 public static String readData(String sheetname ,String FieldName) throws IOException {
	        FileInputStream fis = new FileInputStream(Workspace_TestData_Sheet_Path);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet(sheetname);
	        XSSFRow row = sheet.getRow(0);
	        DataFormatter objDefaultFormat = new DataFormatter();
	        FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) workbook);
	        int col_num = -1;
	        for(int i=0; i < row.getLastCellNum(); i++)
	        {
	            if(row.getCell(i).getStringCellValue().trim().equals(FieldName))
	                col_num = i;
	        }
	        row = sheet.getRow(1);
	        XSSFCell cell = row.getCell(col_num);
	        objFormulaEvaluator.evaluate(cell); 
	        String value = objDefaultFormat.formatCellValue(cell,objFormulaEvaluator);
	        return value;
	 }
}
