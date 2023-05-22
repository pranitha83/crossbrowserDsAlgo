package stepdefinitions;

import static org.junit.Assert.assertEquals;

import DiverFactory.helper;
import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BasePage {
	
	@Given("User click on Data Structures dropdown")
	public void user_click_on_data_structures_dropdown() throws InterruptedException {
		//LoggerLoad.info("dropdown click");
		homepage = new HomePage(helper.getDriver());
		
		homepage.dropDownclk();
		
		//Thread.sleep(2000);
	   
	}

	@When("User click on arrays from the dropdown")
	public void user_click_on_arrays_from_the_dropdown() throws InterruptedException {
		homepage.arrays();
		//Thread.sleep(2000);
	}

	@Then("It  shows error message {string}")
	public void it_shows_error_message(String string) {
	  // String actmsg=homepage.alert();
	   //assertEquals(actmsg,string);
	}

	@When("User click on one of the module from home page")
	public void user_click_on_one_of_the_module_from_home_page() throws InterruptedException {
	   helper.NavBack();
		homepage = new HomePage(helper.getDriver());
	   homepage.modulegtstarted();
	  // Thread.sleep(2000);
	}
	@Then("It is showing error message You are not logged in")
	public void it_is_showing_error_message_you_are_not_logged_in() {
		 //String actmsg1=homepage.alert();
		 //assertEquals(actmsg1,"You are not logged in");
	}
}
