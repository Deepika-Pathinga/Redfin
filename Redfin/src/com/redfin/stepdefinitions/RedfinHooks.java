package com.redfin.stepdefinitions;

import java.io.IOException;




import com.redfin.base.RedfinBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RedfinHooks extends RedfinBase {
	

	@Before
	public void setup() throws IOException {
		//propertyExtentSetup();
		try {
			createReport();
			initializeDriver();
			openUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	@After
	public void tearDown() {
		
		closeBrowser();
		closeReport();
		
	}


}
