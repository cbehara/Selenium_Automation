package com.multisense.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RegisterTypePage extends TestBase {
		    
    
	public  RegisterTypePage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}				
	
	public void clickRegistertype() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConxoMultisense_RegTypePage_Registertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Registertype")));
		doClick(ConxoMultisense_RegTypePage_Registertype);
		} catch (Exception e) {
						// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
				
	public void clicAddRegistertypebutton() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConxoMultisense_RegTypePage_AddRegistertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_AddRegistertype")));
		doClick(ConxoMultisense_RegTypePage_AddRegistertype);	
		}

	
	public void clicAddRegistertypename(String obiscode, String readingtype) throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConxoMultisense_RegTypePage_Registerobiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Registerobiscode")));
	doClear(ConxoMultisense_RegTypePage_Registerobiscode);
	sendkeys(obiscode, ConxoMultisense_RegTypePage_Registerobiscode);
	
	WebElement ConxoMultisense_RegTypePage_AddRegisterreadingname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_AddRegisterreadingname")));
	doClick(ConxoMultisense_RegTypePage_AddRegisterreadingname);
	doClear(ConxoMultisense_RegTypePage_AddRegisterreadingname);
	sendkeys(readingtype, ConxoMultisense_RegTypePage_AddRegisterreadingname);
	waitForTime(2000);
	List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
	for (WebElement element : options){  
	     if(element.getText().equals(readingtype)){  
	        element.click();
	    }
	    }
	WebElement ConxoMultisense_RegTypePage_Addregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Addregistertypebutton")));
	doClick(ConxoMultisense_RegTypePage_Addregistertypebutton);
	}
	
	public void editregistertype(String obiscode, String Updateobiscode)  throws InterruptedException
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ obiscode +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConxoMultisense_RegTypePage_Editregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Editregistertypebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegTypePage_Editregistertypebutton, 10);
		doClick(ConxoMultisense_RegTypePage_Editregistertypebutton);
		waitForTime(5000);
		WebElement ConxoMultisense_RegTypePage_Registerobiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Registerobiscode")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegTypePage_Registerobiscode, 10);
		doClear(ConxoMultisense_RegTypePage_Registerobiscode);
		sendkeys(Updateobiscode, ConxoMultisense_RegTypePage_Registerobiscode);
		WebElement ConxoMultisense_RegTypePage_saveregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_saveregistertypebutton")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegTypePage_saveregistertypebutton, 10);
		doClick(ConxoMultisense_RegTypePage_saveregistertypebutton);
	}
	public void removelogbooktype(String readingtype)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ readingtype +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConxoMultisense_RegTypePage_Registertyperemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Registertyperemove")));
		TestUtil.waitforElementTobeLocated(ConxoMultisense_RegTypePage_Registertyperemove, 10);
		doClick(ConxoMultisense_RegTypePage_Registertyperemove);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ readingtype +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	public void verifyaddregistertypefields()
	{
		WebElement ConxoMultisense_RegTypePage_AddRegistertype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_AddRegistertype")));
		doClick(ConxoMultisense_RegTypePage_AddRegistertype);
		WebElement ConxoMultisense_RegTypePage_Addregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_Addregistertypebutton")));
		doClick(ConxoMultisense_RegTypePage_Addregistertypebutton);
		String Expectedobiscode = "Invalid obis code";
		WebElement Actualobiscode = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_verifyobiscodefield")));
		SoftAssertfunction(Actualobiscode, Expectedobiscode);
		String Expectedreadingtype = "This field is required";
		WebElement Actualreadingtype= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_verifyreadingtype")));
		SoftAssertfunction(Actualreadingtype, Expectedreadingtype);
		WebElement ConxoMultisense_RegTypePage_Cancelregistertypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_RegTypePage_CancelRegistertypebutton")));
		doClick(ConxoMultisense_RegTypePage_Cancelregistertypebutton);
	}		
	
}


