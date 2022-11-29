package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class DriverManager {
	
	public static WebDriver driver_init;

    @BeforeAll
    public static void before_all() {
    	System.setProperty("webdriver.chrome.driver", 
			       "C:\\Users\\Rasya Ravi\\eclipse-workspace\\dsAlgo\\src\\test\\resources\\Driver\\chromedriver.exe");
		
    	driver_init= new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver_init;
    }
    @AfterAll
    public static void after_all() {
    	//driver_init.quit();
    }
}
