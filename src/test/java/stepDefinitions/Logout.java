package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;

import pageObjects.LogoutPage;

public class Logout extends BaseClass {

	@Given("Admin\\/User\\/Staff Logged on to LMS website {string}")
	public void admin_user_staff_logged_on_to_lms_website(String string) {
		driver.manage().window().maximize();
		lop = new LogoutPage(driver);
		String Actualtitle = ap.ValidateHomepagetitle();
	    String Expectedtitle  = "page title";
	    Assert.assertEquals(Expectedtitle, Actualtitle);
	    System.out.println(Actualtitle);
	}
	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() {
	   lop.ClickOnLogout(); 
	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() {
	    lop.Login();
	}
}
