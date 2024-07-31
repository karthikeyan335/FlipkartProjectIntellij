package org.stepdefinition;

import java.io.IOException;

import org.utility.BaseClass;
import org.utility.Cucumber_AllureReport;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@Before()
	public void beforeScenario1() {
		launchBrowser(getPropertyValue("browsername"));
		urlLaunch(getPropertyValue("url"));
		maximize();
		implicitWait(50);	

	}


	@After()
	public void afterScenario1(Scenario sc) throws IOException {
		String name = sc.getName();
		screenShot(name); 
		Cucumber_AllureReport.createTestLog(sc);
		browserQuit();
		
		
	}

}
