package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.utility.Cucumber_AllureReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.utility.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",
					dryRun=false,monochrome=true,
					tags="@E2E"	,				
					plugin= {"pretty","html:src\\test\\resources\\Reports\\HtmlReport\\report.html",
							"json:src\\test\\resources\\Reports\\JsonReport\\report.json",
							"junit:src\\test\\resources\\Reports\\JunitReport\\report.xml"}
				)

public class TestRunner {
	
	@BeforeClass
	public static void stsrtReport() {
		System.out.println("Extent Report Started");
		Cucumber_AllureReport.startReport();
		
	}
	
	@AfterClass
	public static void report() {
		Cucumber_AllureReport.endReport();
		System.out.println("Extent Report Generated and Closed");
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\report.json", "FlipkartTask");

	}

}
