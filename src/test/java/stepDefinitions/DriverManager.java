package stepDefinitions;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class DriverManager {
	
	public static WebDriver  driver_init;

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
    	driver_init.quit();
    }
    @After
   	public void after(Scenario scenario) {
   		if(scenario.isFailed()){
   			byte[] screenshot=((TakesScreenshot)driver_init).getScreenshotAs(OutputType.BYTES);
   			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
   		}
   	}

}
