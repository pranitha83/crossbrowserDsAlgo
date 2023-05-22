package Reader; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;

import DiverFactory.helper;

public class ConfigReader {
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/config.properties";
	private static String browserType = null;
	public static void loadConfig1() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	
	
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	public static String getBrowserType() throws Throwable {
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
		//return browserType;
		
	
	
	}


