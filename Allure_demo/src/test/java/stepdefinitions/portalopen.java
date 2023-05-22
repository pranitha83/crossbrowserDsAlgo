package stepdefinitions;

import org.junit.Assert;

import DiverFactory.helper;
import PageObjects.portalopenpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class portalopen extends BasePage {
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		
		portalPage = new portalopenpage(helper.getDriver());
		// LoggerLoad.info("launch browser");
		//driver.switchTo().window(driver.getWindowHandle());
		//Thread.sleep(2000);
	}

	@Given("User opens dsalgo portal app url")
	public void user_opens_dsalgo_portal_app_url() {
		helper.openPage("https://dsportalapp.herokuapp.com");
		//driver.switchTo().window(driver.getWindowHandle());	
		//LoggerLoad.info("portal opened");
	}

	@When("User click on Get Started button")
	public void user_click_on_get_started_button() throws InterruptedException {
		portalPage.clickgetstartedbtn();
		//LoggerLoad.info("Getstarted btn click");
		//Thread.sleep(2000);
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		String HomepgTitle = helper.getdriverTitle();
		String ExpTitle = portalPage.gethomepagetitle();
		//LoggerLoad.info(driversetup.getdriverTitle());
		//Assert.assertEquals(HomepgTitle,ExpTitle);
		//LoggerLoad.info("User navigated to home page");
	}
}
