package stepDefinitions;

import static stepDefinitions.DriverManager.getDriver;

import org.openqa.selenium.WebDriver;

import pageObjects.AssignmentPage;
import pageObjects.AttendancePage;
import pageObjects.BatchPage;
import pageObjects.LogInPage;
import pageObjects.LogoutPage;
import pageObjects.ProgramPage;
import pageObjects.RegistrationPage;
import pageObjects.UserPage;



public class BaseClass {

	public static WebDriver driver;
	public static AssignmentPage ap;
	public static LogoutPage lop;
	public static LogInPage lp;
	public static BatchPage bp;
	public static ProgramPage pp;
	public static RegistrationPage rp;
	public static AttendancePage at;
	public static UserPage up;
	static {
		driver=  getDriver();
	}
}
