package Hooks;
import org.junit.runners.Parameterized.Parameters;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import DiverFactory.helper;
import Reader.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
public class hooks {
	

	
		private static WebDriver driver;
		private static helper helper;
		//static Scenario scenario;
		//
		@BeforeAll
		public static void before() throws Throwable {
			//Get browser Type from config file
			//Loggerload.info("Loading Config file");
			//ConfigReader.loadConfig1();
			String browser = ConfigReader.getBrowserType();
			
			//Initialize driver from driver factory
			helper = new helper();
			driver = helper.initializeDriver(browser);
			//Loggerload.info("Initializing driver for : "+browser);
		
		}
	 
	/* @After(order=1)
	    public static void tearDown(Scenario scenario) {
	 
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot)helper.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	            
	            
	        }  */ 
	     
	      
	 @AfterAll
	 public static void after() {
		 helper.closeallDriver();
	 }
		

	}
	

