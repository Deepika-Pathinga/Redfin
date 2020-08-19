package com.redfin.stepdefinitions;

import com.redfin.pages.RedfinHomePage;
import com.redfin.pages.RedfinRealEstatePage;

import com.redfin.utility.RedfinReusableFunctions;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import com.redfin.base.*;

public class RedfinStepDefinitions extends RedfinBase {
	
	RedfinReusableFunctions functions=new RedfinReusableFunctions();
	RedfinHomePage homepage;
	RedfinRealEstatePage realestatePage;
	
	@Given("^the redfin application is launched for \"([^\"]*)\"$")
	public void the_redfin_application_is_launched_for(String testName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logger = report.startTest("Usecase 1 "+testName);
		logger.log(LogStatus.INFO, "Starting Usecase 1...");
		//RedfinBase.logger=RedfinBase.report.startTest(testName);
	 
	}
	
	@Then("^verify the home page using homePageTitle$")
	public void verify_the_home_page_using_homePageTitle() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage=new RedfinHomePage();
		String ActualTitle = homepage.validateHomePage();
		//String expected = "Real Estate, Homes for Sale, MLS Listings, Agents | Redfin";
		//Assert.assertEquals(ActualTitle, expected);
		Boolean result = functions.verify_Text(ActualTitle, "Real Estate, Homes for Sale, MLS Listings, Agents | Redfin", "RedfinHomePage");
		Assert.assertTrue(result);
	    
	}

	@When("^enter the \"([^\"]*)\" in searchbox and press the enter button$")
	public void enter_the_in_searchbox_and_press_the_enter_button(String cityName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.enterTextSearchBox(cityName);
	 
	}

	@Then("^validate pop up appears$")
	public void validate_pop_up_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.popupValidation();
	   
	}

	@When("^On the pop up select the entry \"([^\"]*)\"$")
	public void on_the_pop_up_select_the_entry(String SelectionFromPopUp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		realestatePage=homepage.selectCityFromPopUp(SelectionFromPopUp);
	  
	}

	@Then("^verify the city Real Estate page using \"([^\"]*)\"$")
	public void verify_the_city_Real_Estate_page_using(String estatePageHeader) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		realestatePage.validateEstatePageHeader(estatePageHeader);
	    
	}
	

	@Then("^assert the Search box on the top left side has \"([^\"]*)\"$")
	public void assert_the_Search_box_on_the_top_left_side_has(String expectedCityTag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		realestatePage.validateCityTag(expectedCityTag);
	  
	}

	@When("^Select the min price as \"([^\"]*)\" and max price as \"([^\"]*)\"$")
	public void select_the_min_price_as_and_max_price_as(String MinPrice, String MaxPrice) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		realestatePage.enterMinValue(MinPrice);
		realestatePage.enterMaxValue(MaxPrice);
	  
	}

	@Then("^Verify all the homes listed are from \"([^\"]*)\", if no homes listed throw an errorMessage$")
	public void verify_all_the_homes_listed_are_from_if_no_homes_listed_throw_an_errorMessage(String expectedResult) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		realestatePage.validatesearchResult(expectedResult);
		
	    
	}
	
	@Then("^Usecase \"([^\"]*)\" completed$")
	public void usecase_completed(String testName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logger.log(LogStatus.PASS, "Usecase 1 "+testName +" Completed successfully");
	}

}
