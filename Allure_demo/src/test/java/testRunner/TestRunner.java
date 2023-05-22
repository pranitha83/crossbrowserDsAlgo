package testRunner;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DiverFactory.helper;
import Reader.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty", "html:target/Ds-algo.html",
            "json:target/surefire-reports/cucumberOriginal.json"},
			monochrome=true,  //console output color and eliminate junk characters
			//dryRun=false, // (=true)->compilation purpose mostly to chk stepdefinitions are implemented or not
			tags = " @1 or @2 ", //tags from feature file
			features = {"src/test/resources/Features"}, //location of feature files, we can give this way-->".//features//"
			glue= {"stepdefinitions","Hooks"}) 
	

//@Test
public class TestRunner extends AbstractTestNGCucumberTests {
@Override
@DataProvider(parallel=false)
public Object[][] scenarios() {
	return super.scenarios();
}


@BeforeTest
@Parameters({"browser"})
public  void defineBrowser(@Optional String browser)  throws Throwable{
	ConfigReader.setBrowserType(browser);
	System.out.println(browser);

	//helper.setbrowserType(browser);

	//helper.initializeDriver();
	}
}
