package pageObjects;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	WebDriver driver;
	By header=By.xpath("//div[@class='_9bp-']");
	By Login=By.id("login");
	By SignupButton=By.name("signup");
	By FirstName=By.name("firstname");
	By LastName=By.name("lastname");
	//*Address(House Number) Street Name City State Zip Birth date *UserName *Phone Number * Email *Password
	By Address=By.xpath("//div[@class='address']");
	By StreetName=By.xpath("//div[@class='streetname']");
	By City=By.id("city");
	By State=By.name("state");
	By Zip=By.xpath("//div[@class='zip']");
	By BirthDate=By.xpath("//div[@class='birthdate']");
	By UserName=By.name("username");
	By PhoneNumber=By.xpath("//div[@class='phonenumber']");
	By Password=By.id("password");
	By Email=By.name("email");
	public RegistrationPage(WebDriver driver) 
	{
		this.driver=driver;
	
	}
	public String validateHeader() {
		String actualheader=driver.findElement(header).getText();
		return actualheader;
	}
	public boolean Loginbutton()
	{
		return driver.findElement(Login).isDisplayed();
		
	}
	public void Loginbutton1() 
	{
		driver.findElement(Login).click();
	}
	public void SignUp() 
	{
		driver.findElement(SignupButton).isDisplayed();
	}

	public void Enterfirstname(String firstname) {
	
		driver.findElement(FirstName).sendKeys(firstname);
	}
	public String GetFirstNameText() 
	{
		String getfname= driver.findElement(FirstName).getText();
		return getfname;
		
	}
	public void Enterlastname(String lastname) {
		
		driver.findElement(LastName).sendKeys(lastname);
	}
	public String GetLastNameText() 
	{
		String getlname= driver.findElement(LastName).getText();
		return getlname;
	}
	public void EnterAddress(String address) 
	{
		driver.findElement(Address).sendKeys(address);
	}
	public String GetAddressText()
	{
		String getaddress=driver.findElement(Address).getText();
		return getaddress;
	}
	public void EnterStreetName(String streetname)
	{
		driver.findElement(StreetName).sendKeys(streetname);
	}
	public String GetStreetText() 
	{
	   String getstreet=driver.findElement(StreetName).getText();	
	   return getstreet;
	}
	public void EnterZipCode(String zipcode) 
	{
	   driver.findElement(Zip).sendKeys(zipcode);	
	}
	public String GetZipCode()
	{
		String getzip=driver.findElement(Zip).getText();
		return getzip;
	}
	public void EnterCityName(String cityname)
	{
		driver.findElement(City).sendKeys(cityname);
	}
	public String GetCityName()
	{
		String getcity=driver.findElement(City).getText();
		return getcity;
	}
	
	public void SelectStateName(String statename)
	{
		 // click on drop down button
	    WebElement DropdownButton = driver.findElement(State);
	    DropdownButton.click();
	   
	}
	public void GetStateName()
	{
		 // select a drop down option
	     WebElement DropdownOption= driver.findElement(State);
	     DropdownOption.click();
	     System.out.println("The State name is displayed"+DropdownOption.getText()); 
	}
	public void EnterMobileNumber(String phonenumber)
	{
		driver.findElement(PhoneNumber).sendKeys(phonenumber);
	}
	public String GetMobileNumber()
	{
		String getmobilenumber=driver.findElement(PhoneNumber).getText();
		return getmobilenumber;
	}
	public void SelectDate()
	{
		driver.findElement(By.id("datepicker")).click();
	    
	}
	public void datebox()
	{
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
	    //Fill date as mm/dd/yyyy as 09/25/2013
	    dateBox.sendKeys("09252013");
	    System.out.println("The date is displayed" +dateBox.getText());
	}
	public void PassWord(String password)
	{
		driver.findElement(Password).sendKeys(password);
		
	}
	public String ValidPassword() 
	{
		String getpassword=driver.findElement(Password).getText();
		return getpassword;
		
	}
	public void UserName(String uname)
	{
		driver.findElement(UserName).sendKeys(uname);
	}
	public String ValidUserName() 
	{
		String getusername=driver.findElement(UserName).getText();
		return getusername;
	}
	public void Email()
	{
		driver.findElement(Email).sendKeys("TestEmail@gmail.com");
	}
	
	public String ValidEmail() 
	{
		String getemail=driver.findElement(Email).getText();
		return getemail;
	}
	public void ClickSignUp()
	{
	 	driver.findElement(SignupButton).click();
	 	System.out.println("Please enter all fields");
	}
	public void invalidaddress() 
	{
		 System.out.println("clicks Sign Up button with invalid Address by not Providing House Number"); 
	}
	
	public void invalidstreetname() 
	{
		 System.out.println("clicks Sign Up button with invalid Street Name"); 
	}
	public void invalidZip() 
	{
		System.out.println("clicks Sign Up button with invalid Zip"); 
	}
	public void invalidcity() {
		System.out.println("clicks Sign Up button with invalid City");
	}
	public void invalidselectstate() {
		System.out.println("clicks Sign Up button without selecting State");
	}
	public void invalidphonenumber() {
		System.out.println("clicks Sign Up button with invalid Phone Number");
	}
	public void withoutBirthdate() {
		System.out.println("clicks Sign Up button without selecting BirthDate");
	}
	public void invaliduser() {
		System.out.println("clicks Sign Up button with invalid Admin/User/Staff Name");
	}
	public void validuser() {
		System.out.println("clicks Sign Up button with valid Admin/User/Staff Name");
	}
	public void validpassword() {
		System.out.println("clicks Sign Up button with invalid Password");
	}
	public void existinguser() {
		System.out.println("User clicks Sign Up button with existing Admin\\\\/User\\\\/Staff name");
	}
	public void Message(String msg) {
		System.out.println("Admin/User/Staff should see the message" +msg);
	}
	public void ValidDetails(String validdetail) {
		System.out.println("Clicks on {string} button after entering all valid details" +validdetail);
	}
	
}
