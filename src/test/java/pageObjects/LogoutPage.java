package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	
		 WebDriver  driver;
	    
		By Logout_button = By.xpath("//div['Logout')]");
		By Login_button = By.xpath("//div{'Login']");
		
		public LogoutPage(WebDriver driver)
		{
			this.driver = driver;
		}
		public void ClickOnLogout() {
			driver.findElement(Logout_button).click();
		}
		public void Login() {
			driver.findElement(Logout_button).isDisplayed();
		}
}
