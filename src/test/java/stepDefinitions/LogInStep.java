package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WindowType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LogInPage;

public class LogInStep extends BaseClass {

	@Given("Admin\\/User\\/Staff is on Browser")
	public void admin_user_staff_is_on_browser() {
		driver.manage().window().maximize();

	}

	@When("Admin\\/User\\/Staff opens the {string}")
	public void admin_user_staff_opens_the(String url) {
		driver.get(url);
	}

	@Then("Admin\\/user\\/Staff should be navigated to login page as title {string}")
	public void admin_user_staff_should_be_navigated_to_login_page_as_title(String title) {
		Assert.assertTrue(driver.getTitle().contains(title));
	}

	// Login-Valid Credentials
	@Given("User is on Login Page as title {string}")
	public void user_is_on_login_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		System.out.println("******************************" + actualtitle);
		Assert.assertTrue(actualtitle.contains(title));

	}

	@When("^User clicks login button after entering Username and Password$")
	public  void user_clicks_login_button_after_entering_username_and_password(DataTable usercredentials)
			throws InterruptedException {
		Thread.sleep(500);
		List<Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		System.out.println("*************************" + driver);
		lp.enterUserName(data.get(0).get("Username"));
		lp.enterPassword(data.get(0).get("Password"));
		lp.clickOnLogin();
	}

	@Then("User see header text as {string}")
	public void user_see_header_text_as(String header) {
		String actualHeader = lp.validateHeader();
		Assert.assertTrue(actualHeader.contains(header));
	}
	// Admin/Staff login with valid credentials

	@Given("Admin\\/Staff is on Login Page as title {string}")
	public void admin_staff_is_on_login_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		System.out.println("******************************" + actualtitle);
		Assert.assertTrue(actualtitle.contains(title));
	}

	@When("^Admin\\/Staff clicks login button after entering (.*),(.*)and(.*)$")
	public void admin_staff_clicks_login_button_after_entering_username_password_and_code(String username,
			String password, String code) {
		lp=new LogInPage(driver);
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.enterCode(code);
		lp.clickOnLogin();

	}

	@Then("Admin\\/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String header) {
		String actualHeader = lp.validateHeader();
		Assert.assertTrue(actualHeader.contains(header));
	}
//Login -Invalid Credentials
	// valid username and invalid password

	@When("^User clicks login button after entering valid Username and invalid Password$")
	public void user_clicks_login_button_after_entering_valid_username_and_invalid_password(DataTable usercredentials) {
		List<Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		lp.enterUserName(data.get(0).get("Username"));
		lp.enterPassword(data.get(0).get("Password"));
		lp.clickOnLogin();
	}

	@Then("User should see an error message {string}")
	public void user_should_see_an_error_message(String errormsg) {
		String actualmesg = lp.validateerrormesg();
		Assert.assertTrue(actualmesg.contains(errormsg));
	}
	// invalid username and valid password

	@When("^User clicks login button after entering invalid username and valid Password$")
	public void user_clicks_login_button_after_entering_invalid_username_and_valid_password(DataTable usercredentials) {
		List<Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		lp.enterUserName(data.get(0).get("Username"));
		lp.enterPassword(data.get(0).get("Password"));
		lp.clickOnLogin();
	}
	// invalid username and invalid password

	@When("^User clicks login button after entering invalid username and invalid Password$")
	public void user_clicks_login_button_after_entering_invalid_username_and_invalid_password(
			DataTable usercredentials) {
		List<Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		lp.enterUserName(data.get(0).get("Username"));
		lp.enterPassword(data.get(0).get("Password"));
		lp.clickOnLogin();
	}
	// invalid username and password field empty

	@When("^User clicks login button after entering valid username and leaves Password field empty$")
	public void user_clicks_login_button_after_entering_valid_username_and_leaves_password_field_empty(
			DataTable usercredentials) {
		List<Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		lp.enterUserName(data.get(0).get("Username"));
		lp.enterPassword(data.get(0).get("Password"));
		lp.clickOnLogin();
	}
	// Admin/Staff login with invalid credentials

	@When("^Admin\\/Staff  clicks login button after entering  valid (.*) ,invalid (.*) and (.*)$")
	public void admin_staff_clicks_login_button_after_entering_valid_username_invalid_password_and_code(String username,
			String password, String code) {
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.enterCode(code);
		lp.clickOnLogin();
	}

	@Then("Admin\\/Staff should see an error message {string}")
	public void admin_staff_should_see_an_error_message(String errormesg) {
		String actualmesg = lp.validateerrormesg();
		Assert.assertTrue(actualmesg.contains(errormesg));
	}

	@When("^Admin\\/Staff clicks login button after entering invalid (.*) ,valid (.*) and (.*)$")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_code(String username,
			String password, String code) {
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.enterCode(code);
		lp.clickOnLogin();
	}

	// Valid Username and Pswd without code
	@When("^Admin\\/Staff clicks login button after entering valid (.*) valid (.*) and without (.*)$")
	public void admin_staff_clicks_login_button_after_entering_valid_username_valid_password_and_without_code(
			String username, String password, String code) {
		lp.enterUserName(username);
		lp.enterPassword(password);
		lp.enterCode(code);
		lp.clickOnLogin();
	}

	// forgot password
	@Given("Admin\\/User\\/Staff is on Login Page as title {string}")
	public void admin_user_staff_is_on_login_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(title));
	}

	@When("Admin\\/User\\/Staff clicks Forgot password link")
	public void admin_user_staff_clicks_forgot_password_link() {
		lp.clickOnForgotPswd();
	}

	@Then("It should redirected to forgot Password page as title {string}")
	public void it_should_redirected_to_forgot_password_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		System.out.println("******************************" + actualtitle);
		Assert.assertTrue(actualtitle.contains(title));
	}

	@Given("Admin\\/User\\/Staff is on Forgot Password Page as title {string}")
	public void admin_user_staff_is_on_forgot_password_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(title));
	}

	@When("^Admin\\/User\\/Staff clicks continue after entering valid emailaddress$")
	public void admin_user_staff_clicks_continue_after_entering_valid_emailaddress(DataTable emailaddress) {
		List<List<String>> data = emailaddress.cells();
	lp.enterEmailAddress(data.get(0).get(0));
		//lp.clickOnContinueBtn();
	}

	@Then("Admin\\/User\\/Staff should be redirected to enter verification code page and verification code will be sent to email")
	public void admin_user_staff_should_be_redirected_to_enter_verification_code_page_and_verification_code_will_be_sent_to_email() {
		String originalwindow=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://accounts.google.com/");
		//String code= lp.entergmailcredentials();
		driver.switchTo().window(originalwindow);
	}

	@Given("Admin\\/User\\/Staff is on Enter verification code Page as title {string}")
	public void admin_user_staff_is_on_enter_verification_code_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(title));
	}

	@When("Admin\\/User\\/Staff clicks continue after entering verification code")
	public void admin_user_staff_clicks_continue_after_entering_verification_code(DataTable code) {
		List<List<String>> data = code.cells();
		lp.enterVerificationCode(data.get(0).get(0));
		lp.clickOnContinueVerification();
	}

	@Then("Admin\\/User\\/Staff should be redirected reset password page as title {string}")
	public void admin_user_staff_should_be_redirected_reset_password_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(title));
	}

	@When("Admin\\/User\\/Staff clicks Click here link to resend")
	public void admin_user_staff_clicks_click_here_link_to_resend() {
		lp.clickHere();
	}

	@Then("The verification code should be resend to email")
	public void the_verification_code_should_be_resend_to_email() {
		String originalwindow=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://accounts.google.com/");
		String code= lp.entergmailcredentials();
		driver.switchTo().window(originalwindow);
	}
	//ResetPassword
	@Given("Admin\\/User\\/Staff is on Reset Password Page as title {string}")
	public void admin_user_staff_is_on_reset_password_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(title));
	}

	@When("^Admin\\/User\\/Staff clicks submit button after entering new password and retype password$")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password(DataTable resetpswd) {
		List<Map<String, String>> data = resetpswd.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		lp.enternewpassword(data.get(0).get("newpassword"));
		lp.enterreTypePassword(data.get(0).get("retypepassword"));
		lp.clicksubmit();
	}

	@Then("Admin\\/User\\/Staff should be redirected to login page as title {string}")
	public void admin_user_staff_should_be_redirected_to_login_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(title));
	}
	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String errormesg) {
		String actualmesg = lp.validateerrormesg();
		Assert.assertTrue(actualmesg.contains(errormesg));
	}
	@When("Admin\\/User\\/Staff clicks cancel button after entering new password and retype password")
	public void admin_user_staff_clicks_cancel_button_after_entering_new_password_and_retype_password(DataTable resetpswd ) {
		List<Map<String, String>> data = resetpswd.asMaps(String.class, String.class);
		lp = new LogInPage(driver);
		lp.enternewpassword(data.get(0).get("newpassword"));
		lp.enterreTypePassword(data.get(0).get("retypepassword"));
		lp.clickcancelBtn();
	}

	@Then("Admin\\/User\\/Staff should see a refreshed reset password page with empty field")
	public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_field() {
	   lp=new LogInPage(driver);
		lp.checkEmptyfield();
	}

}
