package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.homePage;
import io.cucumber.java.en.*;

public class StepsHome {
	WebDriver driver;
	homePage hp;

	@Given("The user opens chrome browser and enter the url {string}")
	public void the_user_opens_chrome_browser_and_enter_the_url(String string) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Testing/Saritha/dsAlgoNovember/src/test/resources/driver/chromedriver.exe");
		
		 driver= new ChromeDriver();
		 hp = new homePage(driver);
		
		 driver.get("https://dsportalapp.herokuapp.com/");
	}

	@And("the user should land on DS Algo portal page")
	public void the_user_should_land_on_ds_algo_portal_page() {
	   driver.navigate().to("https://dsportalapp.herokuapp.com/");
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	   hp.clickOnGetStarted();
	}

	@Then("the user is on home page")
	public void the_user_is_on_home_page() {
	  driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}

	@And("the user should see six panes with different data structures")
	public void the_user_should_see_six_panes_with_different_data_structures() {
	    
	}
	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) throws InterruptedException {
	   hp.clickOnDataStructure();
	}

	@Then("user should see six different data structure entries in that dropdown")
	public void user_should_see_six_different_data_structure_entries_in_that_dropdown() {
	  
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) throws InterruptedException {
	   hp.selectDataStrucureItem();
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String msg) throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(msg));
		System.out.println("Assertion Worked");

	}
	@When("The user clicks any of the Get Started buttons below the data structures")
	public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures() throws InterruptedException {
	   hp.clickOnbtnGetStart();
	}

	@Then("It should alert the user with a message You are not logged in")
	public void it_should_alert_the_user_with_a_message_you_are_not_logged_in() throws InterruptedException {
	  hp.alert();
	}


}
