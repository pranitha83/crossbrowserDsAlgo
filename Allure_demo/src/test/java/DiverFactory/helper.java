package DiverFactory;

import java.time.Duration;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helper {
	
	public static WebDriver driver;
		
	
	public  WebDriver initializeDriver(String browser) {
switch(browser.toLowerCase()) {
case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	
case "edge":
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	break;
	
	default:
		driver=null;
		break;
	
}
	
	
	
		/*if(browsertype.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			
		}
		/*else if br.equals("FIREFOX"){
		//Firefox
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());

		
	else if (browsertype.equalsIgnoreCase("edge")) {
		
		WebDriverManager.edgedriver().setup();
		EdgeOptions options =new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
			 driver=new EdgeDriver(options);
		
		}*/
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public static void openPage(String url) {
		
		driver.get(url);
	}
	public static String getdriverTitle() {
		return driver.getTitle();
	}
	public static void NavBack() {
		driver.navigate().back();
	}
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	
		
	
	public void closeallDriver() {
		driver.close();
	
		
		
	
	
	}	
	

}
