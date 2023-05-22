package stepdefinitions;

import org.openqa.selenium.WebDriver;

import DiverFactory.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	 WebDriver driver;
	@Given("User able to launch amazon url")
	public void user_able_to_launch_amazon_url() {
	  /* WebDriverManager.chromedriver().setup();
	   WebDriver  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/");
	  driver.findElement(By.linkText("Amazon Home"));*/
		
		 driver=helper.getDriver();
		helper.openPage("https://www.amazon.com/");
		
	}

	@When("User click on amazon home button")
	public void user_click_on_amazon_home_button() {
	   System.out.println("HomePage");
	}

	@Then("navigate to amazon home page")
	public void navigate_to_amazon_home_page() {
	   System.out.println("done");
	}


}
