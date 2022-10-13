package com.multisense.pages.DevicesPage;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class DeviceLifecyclePage extends TestBase {
	String Name = generateRandomName(9);
	String StateNameRandom = generateRandomName(9);
	
	//span[text()='Add transition']/following-sibling::span
	

	public  DeviceLifecyclePage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}
				
	public void sendText(String value)
	{
		WebElement ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle")));
		sendkeys(value, ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle);
	}
	
	public void clickDeviceLifecycle() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle);
		} catch (Exception e) 
	{
						
			e.printStackTrace();
			}
			}
				
	public void clickaddDeviceLifecycle() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclebutton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclebutton);
		
		}

	
	public void createDeviceLifecycle() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName")));
	doClear(ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName);
	sendkeys(Name, ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName);
	WebElement ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton")));
	doClick(ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton);
					
	}
	
//	public void clickaddDeviceLifecycleButton()
//	{
//	doClick(AddedDeviceLifecycle);
//	}
//	
	public void clickOnAddTransitions( String triggered , String from , String to) throws InterruptedException
				{
		
		DriverUtility.getDriver().findElement(By.linkText(Name)).click();
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceLifecyclePage_TransitionsTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_TransitionsTab")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_TransitionsTab);
		WebElement ConnexoMultisense_DeviceLifecyclePage_AddTransitions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddTransitions")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_AddTransitions);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceLifecyclePage_TriggeredbyDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_TriggeredbyDropdown")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_TriggeredbyDropdown);
		Thread.sleep(5000);
		WebElement triggered1= DriverUtility.getDriver().findElement(By.xpath("//ul[@class='x-list-plain']"));
		List<WebElement> triggeredList=triggered1.findElements(By.tagName("li"));
		for (WebElement li : triggeredList) {
		if (li.getText().equals(triggered)) {
		     li.click();
		   }}
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceLifecyclePage_TransitionfromDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_TransitionfromDropdown")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_TransitionfromDropdown);
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options){  
		     if(element.getText().equals(from)){  

		        element.click();
		    }
		    }
		WebElement ConnexoMultisense_DeviceLifecyclePage_Transitionto = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Transitionto")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Transitionto);
		List<WebElement> options2= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options2){  
		     if(element.getText().equals(to)){  

		        element.click();
		    }
		    }
		WebElement ConnexoMultisense_DeviceLifecyclePage_AddTransitionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddTransitionButton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_AddTransitionButton);
		
		}
	public void clickRemoveDeviceLifecycle() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[@data-qtip='Details']//span[1]")).click();
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(@class,'x-panel x-box-item')]/following-sibling::a[1]")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//span[contains(@class,'x-menu-item-text')])[6]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[@class='x-container x-box-item x-window-item x-container-default x-box-layout-ct']//div[@role='presentation']//div[@role='presentation']//a[@class='x-btn x-unselectable x-box-item x-btn-remove-small x-noicon x-btn-noicon x-btn-remove-small-noicon']//span[@role='presentation']//span[@role='presentation']//span[@role='presentation']")).click();
	}
	
	public void VerifyAddDeviceLifecycleFields() throws InterruptedException
	{
		WebElement ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton);
		String ExpectedName = "This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyadddevicelifecyclenamefield")));         
		TitleAssertFunction(ActualName, ExpectedName);
		WebElement ConnexoMultisense_DeviceLifecyclePage_Cancelevicelifecyclebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_canceldevicelifecyclebutton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Cancelevicelifecyclebutton);
	}
	
	public void AddPreoperationalState() throws InterruptedException
	{
       WebElement StatesTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StatesTab")));
       doClick(StatesTab);
       WebElement AddState = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddState")));
       doClick(AddState);
       WebElement StateName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StateName")));
   	   doClear(StateName);
       sendkeys(generateRandomName(9), StateName);
       WebElement StageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdown")));
       doClick(StageDropdown);
       WebElement StageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdownPreoperationalValue")));
       doClick(StageDropdownValue);  
       WebElement AddStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddStateButton")));
       doClick(AddStateButton);
	}
	
	public void AddOperationalState() throws InterruptedException
	{
       WebElement AddState = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddState")));
       doClick(AddState);
       WebElement StateName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StateName")));
   	   doClear(StateName);
       sendkeys(generateRandomName(9), StateName);
       WebElement StageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdown")));
       doClick(StageDropdown);
       WebElement StageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdownOperationalValue")));
       doClick(StageDropdownValue);  
       WebElement AddStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddStateButton")));
       doClick(AddStateButton);
	}
	
	public void AddPostoperationalState() throws InterruptedException
	{
       WebElement AddState = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddState")));
       doClick(AddState);
       WebElement StateName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StateName")));
   	   doClear(StateName);
       sendkeys(StateNameRandom, StateName);
       WebElement StageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdown")));
       doClick(StageDropdown);
       WebElement StageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdownPostoperationalValue")));
       doClick(StageDropdownValue);  
       WebElement AddStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddStateButton")));
       doClick(AddStateButton);
	}
	
	public void EditState() throws InterruptedException
	{
	   DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ StateNameRandom +"']//parent::td//following-sibling::td//div//child::span")).click();
	   DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ StateNameRandom +"']//parent::td//following-sibling::td//div//child::span//following::span[contains(text(),'Edit')]//parent::a")).click();  
       WebElement SaveStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_SaveStateButton")));
       doClick(SaveStateButton);
	}
	
	public void SetAsInitialState() throws InterruptedException
	{
	   WebElement AddState = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddState")));
	   doClick(AddState);
	   WebElement StateName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StateName")));
	   doClear(StateName);
	   String NewState = generateRandomName(9);
	   sendkeys(NewState, StateName);
	   WebElement StageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdown")));
	   doClick(StageDropdown);
	   WebElement StageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_StageDropdownOperationalValue")));
	   doClick(StageDropdownValue);  
	   WebElement AddStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddStateButton")));
	   doClick(AddStateButton);
	   DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ NewState +"']//parent::td//following-sibling::td//div//child::span")).click();
	   DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ NewState +"']//parent::td//following-sibling::td//div//child::span//following::span[contains(text(),'Set as initial state')]//parent::a")).click();  
	}
	
	public void RemoveState() throws InterruptedException
	{
	   DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ StateNameRandom +"']//parent::td//following-sibling::td//div//child::span")).click();
	   DriverUtility.getDriver().findElement(By.xpath("//div[text()='"+ StateNameRandom +"']//parent::td//following-sibling::td//div//child::span//following::span[contains(text(),'Remove')]//parent::a")).click();
	   DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ StateNameRandom +"')]//ancestor::div//a[normalize-space()='Remove']")).click();	 
	}
	
	public void VerifyAddStateField() throws InterruptedException
	{
		WebElement AddState= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddState")));
		doClick(AddState);
		WebElement AddStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddStateButton")));
		doClick(AddStateButton);
		String ExpectedName = "This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyStateNameField")));         
		TitleAssertFunction(ActualName, ExpectedName);
		String ExpectedStage = "This field is required";
		WebElement ActualStage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyStateStageField")));         
		TitleAssertFunction(ActualStage, ExpectedStage);
		WebElement ConnexoMultisense_DeviceLifecyclePage_Cancelevicelifecyclebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_canceldevicelifecyclebutton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Cancelevicelifecyclebutton);
	}
	
	public void VerifyAddTransitionFields() throws InterruptedException
	{
		WebElement ConnexoMultisense_DeviceLifecyclePage_AddTransitions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddTransitions")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_AddTransitions);
		WebElement AddStateButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddStateButton")));
		doClick(AddStateButton);
		String ExpectedTriggeredBy = "This field is required";
		WebElement ActualTriggeredBy= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyTriggeredByField")));         
		TitleAssertFunction(ActualTriggeredBy, ExpectedTriggeredBy);
		String ExpectedName = "This field is required";
		WebElement ActualName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyNameField")));         
		TitleAssertFunction(ActualName, ExpectedName);
		String ExpectedFrom = "This field is required";
		WebElement ActualFrom = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyFromField")));         
		TitleAssertFunction(ActualFrom, ExpectedFrom);
		String ExpectedTo = "This field is required";
		WebElement ActualTo = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifyToField")));         
		TitleAssertFunction(ActualTo, ExpectedTo);
		WebElement ConnexoMultisense_DeviceLifecyclePage_Cancelevicelifecyclebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_canceldevicelifecyclebutton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Cancelevicelifecyclebutton);
	}
	
	
}


