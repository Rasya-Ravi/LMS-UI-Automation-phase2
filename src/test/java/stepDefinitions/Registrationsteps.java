package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageObjects.RegistrationPage;

public class Registrationsteps extends BaseClass {

@Given("Admin\\/User\\/Staff Logged on to LMS website {string}")
	public void admin_user_staff_logged_on_to_lms_website(String URL)
	{
	driver.get(URL);
	}
@When("Admin\\/User\\/Staff lands on Registration page")
	public void admin_user_staff_lands_on_registration_page()
	{
    System.out.println("lands on Registration page" +driver);
	}
@Then("Admin\\/User\\/Staff sees the heading on the form as {string}")
	public void admin_user_staff_sees_the_heading_on_the_form_as(String Header)
	{
    rp=new RegistrationPage(driver);
	String actualHeader = rp.validateHeader();
	System.out.println("************" +actualHeader);
	Assert.assertTrue(actualHeader.contains(Header));
	}
@Then("Admin\\/User\\/Staff sees a button with text Log in on the form")
	public void admin_user_staff_sees_a_button_with_text_log_in_on_the_form()
	{
	 Assert.assertEquals(true, rp.Loginbutton());
	}
@Given("Admin\\/User\\/Staff is on the Registeration Page")
	public void admin_user_staff_is_on_the_registeration_page()
	{
    System.out.println("Admin/user/staff is on the Registeration Page" +driver);
	}
@When("Admin\\/User\\/Staff selects the Log in button")
	public void admin_user_staff_selects_the_log_in_button() 
	{
    rp.Loginbutton1();
         
	}
@Then("Admin\\/User\\/Staff lands on Log in page")
	public void admin_user_staff_lands_on_log_in_page()
	{
	 String selectlogin=driver.getTitle();
	 Assert.assertTrue(selectlogin.contains("Login"));
	}
@Given("Admin\\/User\\/Staff is on LMS website")
	public void admin_user_staff_is_on_lms_website()
	{
	 System.out.println("lands on LMS website" +driver);
	}
@Then("Admin\\/User\\/Staff sees a button with text Sign Up on the form")
	public void admin_user_staff_sees_a_button_with_text_sign_up_on_the_form()
	{
		rp.SignUp();
	}
@When("Admin\\/User\\/Staff Enters the First Name in Alphabets only {string}")
		public void admin_user_staff_enters_the_first_name_in_alphabets_only(String fname) 
	{
		rp.Enterfirstname(fname);
	}

@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed()
	{
	String getfname=rp.GetFirstNameText();
    Assert.assertTrue(getfname.contains(getfname));
    System.out.println("The Last Name "+getfname+ " will be displayed" );
	}
@When("Admin\\/User\\/Staff Enters the Last Name in Alphabets only {string}")
	public void admin_user_staff_enters_the_last_name_in_alphabets_only(String lname)
	{
     	rp.Enterlastname(lname);
	}
@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed()
	{
	String getlname=rp.GetLastNameText();
    Assert.assertTrue(getlname.contains(getlname));
	System.out.println("The Last Name "+getlname+ " will be displayed" );
	
	}
@When("Admin\\/User\\/Staff Enters the Address Field using Alpha Numerics and \\/or Symbols {string}")
	public void admin_user_staff_enters_the_address_field_using_alpha_numerics_and_or_symbols(String address)
	{
     rp.EnterAddress(address);
	}

@Then("The Address will be displayed")
	public void the_address_will_be_displayed()
	{
	String getaddress=rp.GetAddressText();
	Assert.assertTrue(getaddress.contains(getaddress));
	System.out.println("The Address "+getaddress+ " will be displayed" );
	}

@When("Admin\\/User\\/Staff Enters the Street name Field using Alpha Numerics and or Symbols {string}")
	public void admin_user_staff_enters_the_street_name_field_using_alpha_numerics_and_or_symbols(String street)
	{
    rp.EnterStreetName(street);
	}
@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed()
	{
	String streetname=rp.GetStreetText();
	Assert.assertTrue(streetname.contains(streetname));
	System.out.println("The StreetName "+streetname+ " will be displayed" );
	}
@When("Admin\\/User\\/Staff Enters the five digit Zip code using Numbers only {string}")
	public void admin_user_staff_enters_the_five_digit_zip_code_using_numbers_only(String zip)
	{
    rp.EnterZipCode(zip);
	}
@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed()
	{
	String zipcode=rp.GetZipCode();
	Assert.assertTrue(zipcode.contains(zipcode));
	System.out.println("The zip code "+zipcode+ " will be displayed" );
	}
@When("Admin\\/User\\/Staff Enters the City Name in Alphabets only {string}")
	public void admin_user_staff_enters_the_city_name_in_alphabets_only(String city)
	{
     rp.EnterCityName(city);
    }
@Then("The City will be displayed")
	public void the_city_will_be_displayed() 
	{
	String cityname=rp.GetCityName();
	Assert.assertTrue(cityname.contains(cityname));
	System.out.println("The zip code "+cityname+ " will be displayed" );
	}
@When("Admin\\/User\\/Staff selects the respective State Name from the DropBox  {string}")
	public void admin_user_staff_selects_the_respective_state_name_from_the_drop_box(String statename)
	{
    	rp.SelectStateName(statename);
	}
@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed()
	{
    	rp.GetStateName();
	}
@When("Admin\\/User\\/Staff Enters the valid ten digit Mobile number in Numerics {string}")
	public void admin_user_staff_enters_the_valid_ten_digit_mobile_number_in_numerics(String Mnumber)
	{
    rp.EnterMobileNumber(Mnumber);
	}
@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed()
	{
	String mobilenumber=rp.GetMobileNumber();
	Assert.assertTrue(mobilenumber.contains(mobilenumber));
	System.out.println("The phone number "+mobilenumber+ " will be displayed" );
	}
@When("Admin\\/User\\/Staff Selects the Date of Birth from the Calender")
	public void admin_user_staff_selects_the_date_of_birth_from_the_calender()
	{
		rp.SelectDate();
	}
@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed()
	{
    rp.datebox();
	}

@When("Admin\\/User\\/Staff  Enters the valid Password with one Upper case, one Numeric , one special charecter , eight charecters {string}")
	public void admin_user_staff_enters_the_valid_password_with_one_upper_case_one_numeric_one_special_charecter_eight_charecters(String password) 
	{
    rp.PassWord(password);
	}
@Then("Admin\\/User\\/Staff Password will be displayed")
	public void admin_user_staff_password_will_be_displayed() 
	{
	String getvalidpassword=rp.ValidPassword();
	Assert.assertTrue(getvalidpassword.contains(getvalidpassword));
	System.out.println("The valid password "+getvalidpassword+ " will be displayed" );
	}
@When("Admin\\/User\\/Staff Enters the valid UserName {string}")
	public void admin_user_staff_enters_the_valid_user_name(String username)
	{
    rp.UserName(username);
	}
@Then("Admin\\/User\\/Staff UsesrName will be displayed")
	public void admin_user_staff_usesr_name_will_be_displayed()
	{
    String getvalidusername=rp.ValidUserName();
    Assert.assertTrue(getvalidusername.contains(getvalidusername));
    System.out.println("The valid username "+getvalidusername+ " will be displayed");
	}
@When("Admin\\/User\\/Staff Enters the valid Email")
	public void admin_user_staff_enters_the_valid_email()
	{
    rp.Email();
	}
@Then("Admin\\/User\\/Staff Email will be displayed")
	public void admin_user_staff_email_will_be_displayed()
	{
    String getvalidemail=rp.ValidEmail();	
    Assert.assertTrue(getvalidemail.contains(getvalidemail));
    System.out.println("The valid username "+getvalidemail+ " will be displayed");
	}

@Then("Admin\\/User\\/Staff should get a message Enters all fields")
	public void admin_user_staff_should_get_a_message_enters_all_fields() 
	{
	rp.ClickSignUp();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid First Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_first_name()
	{
	WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
    signUp.click();
    
    String expectedErrorMsg = "Invalid first Name";
    
    WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Invalid Name')]"));
    String actualErrorMsg = exp.getText();
    		
    Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
@Then("Admin\\/User\\/Staff should get a message\"Enter valid First Name \"")
	public void admin_user_staff_should_get_a_message_enter_valid_first_name()
	{
	String expectedErrorMsg1 = "Enter valid First Name";
    WebElement exp1 = driver.findElement(By.xpath("//p[contains(text(),'Enter valid First Name')]"));
    String actualErrorMsg1 = exp1.getText();
    Assert.assertEquals(actualErrorMsg1, expectedErrorMsg1);
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Last Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_last_name()
	{
	WebElement signUp1 = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
    signUp1.click();
    
    String expectedErrorMsg = "Invalid last Name";
    
    WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Invalid last Name')]"));
    String actualErrorMsg = exp.getText();
    		
    Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Address by not Providing House Number")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_address_by_not_providing_house_number()
	{
	rp.invalidaddress();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Street Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_street_name() 
	{
    rp.invalidstreetname();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Zip")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_zip() 
	{
    rp.invalidZip();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid City")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_city() 
	{
    rp.invalidcity();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button without selecting State")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_state()
	{
    rp.invalidselectstate();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Phone Number")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_phone_number() 
	{
    rp.invalidphonenumber();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button without selecting BirthDate")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_birth_date()
	{
   rp.withoutBirthdate();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Admin\\/User\\/Staff Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_admin_user_staff_name() 
	{
    rp.invaliduser();
	}

@Then("Admin\\/User\\/Staff should get a message\"Please Enter valid Admin\\/User\\/Staff Name \"")
	public void admin_user_staff_should_get_a_message_please_enter_valid_admin_user_staff_name()
	{
    rp.validuser();
	}
@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Password")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_password()
	{
    rp.validpassword();
	}
@When("User clicks Sign Up button with existing Admin\\/User\\/Staff name")
	public void user_clicks_sign_up_button_with_existing_admin_user_staff_name()
	{
    rp.existinguser();
	}
@Then("Admin\\/User\\/Staff should see the message {string}")
	public void admin_user_staff_should_see_the_message(String seemsg)
	{
	rp.Message(seemsg);
	}
@When("Admin\\/User\\/Staff Clicks on {string} button after entering all valid details.")
	public void admin_user_staff_clicks_on_button_after_entering_all_valid_details(String string)
	{
    rp.ValidDetails(string);
	}
@Then("Admin\\/User\\/Staff should get a message\"Registeration successful\"")
	public void admin_user_staff_should_get_a_message_registeration_successful()
	{
	driver.findElement(By.cssSelector("")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("Registeration Successfully");
	}
@Then("Admin\\/User\\/Staff should get a message {string}")
public void admin_user_staff_should_get_a_message(String string) {
    
}
}
