package com.redfin.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import com.redfin.base.*;
import com.redfin.utility.RedfinReusableFunctions;

public class RedfinRealEstatePage extends RedfinBase {
	
	RedfinReusableFunctions functions = new RedfinReusableFunctions();

	@FindBy(xpath = "//div[@class='sidepaneHeader']/h1")
	WebElement estatePageHeader;

	@FindBy(className = "textContent")
	WebElement cityTag;

	//@FindBy(name = "quickMinPrice")
	
	@FindBy(xpath = "//span[@class='field select Select quickMinPrice withFlyout withOptions mounted selected clickable optional']//span[@class='input']")
	WebElement minimumValue;
	
	@FindBy(xpath = "//span[@class='field select Select quickMaxPrice withFlyout withOptions mounted selected clickable optional']//span[@class='input']")
	WebElement maximumValue;
	

	@FindBy(xpath = "//div[@class='homecards']//a")
	List<WebElement> listOfHomes;

	public RedfinRealEstatePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

//	validating RealEstate page
	public String validateRealEstatePage() {
		return driver.getTitle();
	}

//	validating cityEstatePage
	public void validateEstatePageHeader(String expectedHeader) {
		String actualHeader = estatePageHeader.getText();
		System.out.println(actualHeader);
		Assert.assertTrue(functions.verify_Text(actualHeader, expectedHeader, "EstatePageHeader"));
	}

//	validating city name on left corner in search box
	public void validateCityTag(String expectedTag) {
		String actualTag = cityTag.getText();
		Assert.assertTrue(functions.verify_Text(actualTag, expectedTag, "city Tag"));
	}

//	entering minimum value
	public void enterMinValue(String Value) throws InterruptedException {
		Thread.sleep(3000);
		minimumValue.click();
		//Select minValue = (Select) minimumValue;
		//minValue.selectByVisibleText(Value);  
		Thread.sleep(5000);
		int index=Integer.parseInt(Value);		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("document.getElementsByClassName('option')["+index+"].click();" );
		logger.log(LogStatus.PASS, "minimum value entered");
	}

//	entering maximum value
	public void enterMaxValue(String Value) throws InterruptedException {

		Thread.sleep(3000);
		 maximumValue.click();
		Thread.sleep(5000);
		int index=Integer.parseInt(Value);		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("document.getElementsByClassName('option')["+index+"].click();" );
		logger.log(LogStatus.PASS, "maximum value entered");
	}

//	validating search result
	public void validatesearchResult(String expectedResult) {

		if (listOfHomes.size() == 0) {
			logger.log(LogStatus.FAIL, "No data to test");
			Assert.assertTrue("no data to test", false);
		} else {
			boolean b = true;
			for (WebElement result : listOfHomes) {
				if (result.getAttribute("href").contains(expectedResult)) {
					b = true;
				} else {
					b = false;
					break;
				}
			}

			if (b) {
				logger.log(LogStatus.INFO, "All results match to search item");
			} else {
				logger.log(LogStatus.INFO, "All results do not match to search item");
			}
		}

	}


}
