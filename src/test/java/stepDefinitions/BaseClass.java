package stepDefinitions;

import static stepDefinitions.DriverManager.getDriver;

import org.openqa.selenium.WebDriver;

import pageObjects.AssignmentPage;
import pageObjects.LogoutPage;



public class BaseClass {

	public static WebDriver driver;
	public static AssignmentPage ap;
	public static LogoutPage lp;
	
	static {
		driver= getDriver();
	}
}
