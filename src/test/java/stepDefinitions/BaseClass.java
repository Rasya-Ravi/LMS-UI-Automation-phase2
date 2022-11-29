package stepDefinitions;

import static stepDefinitions.DriverManager.getDriver;

import org.openqa.selenium.WebDriver;

import pageObjects.AssignmentPage;
import pageObjects.BatchPage;
import pageObjects.LogInPage;
import pageObjects.LogoutPage;



public class BaseClass {

	public static WebDriver driver;
	public static AssignmentPage ap;
	public static LogoutPage lop;
	public static LogInPage lp;
	public static BatchPage bp;
	static {
		driver= getDriver();
	}
}
