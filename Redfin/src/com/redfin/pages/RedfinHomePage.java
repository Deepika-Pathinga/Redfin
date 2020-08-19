package com.redfin.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.redfin.utility.RedfinReusableFunctions;
import com.redfin.base.*;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class RedfinHomePage extends RedfinBase {
RedfinReusableFunctions functions=new RedfinReusableFunctions();
	
	@FindBy(id="search-box-input")
	WebElement searchBox;
	
	@FindBy(className="guts")
	WebElement Popup;
	
	@FindBy(tagName="a")
	List <WebElement> cityList;
	
	
	
	
	public RedfinHomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
		
//		validating homepage
		public String validateHomePage() {
			return driver.getTitle();
		}
		
//		entering text in searchbox
		public void enterTextSearchBox(String text) throws InterruptedException
		{
			searchBox.sendKeys(text);
			searchBox.sendKeys(Keys.ENTER);
			logger.log(LogStatus.PASS, "Text entered in textbox and pressed enter");
		}
	
//		validating popup appears
		public void popupValidation()
		{
			Assert.assertTrue(functions.isDisplayed(Popup,"Pop up Did you mean"));
		}
		
//		select city from popup
		public RedfinRealEstatePage selectCityFromPopUp(String cityToBeSelected ) throws IOException, InterruptedException
		{
			  List<WebElement> anchors = driver.findElements(By.tagName("a"));
			  for(WebElement city : anchors) {
				  String attributeValue=city.getAttribute("href");
				 
			        if(cityToBeSelected.equals(attributeValue)) {
			        	 
			        	JavascriptExecutor executor = (JavascriptExecutor)driver;
					    executor.executeScript("arguments[0].click();", city);
					    logger.log(LogStatus.PASS, "city selected from popup");
			            break;
			        }
			  }
			return new RedfinRealEstatePage();
		}


}
